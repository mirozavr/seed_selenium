import dao.StorageDao;
import entity.StorageWordsKeys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.Thread.sleep;

public class SeleniumChinese {


        public static String currentValue;
        public static String seed11;
        public static int count = 0;
        public static void main(String[] args) throws IOException, SQLException {


            System.setProperty("webdriver.chrome.driver","C:\\btcwithbalance\\chromedriver.exe");

            workedSelenium();
//
        }
        public static void workedSelenium() throws IOException, SQLException {
            ChromeOptions options = new ChromeOptions();
            // следующие 3 строчки отключают сраную безопасность хрома, способ актуален на 13.06.2022
            options.addArguments("-no-sandbox");
            options.setExperimentalOption("useAutomationExtension", false);
            options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));

            WebDriver driver = new ChromeDriver(options);
            driver.get("C:\\btcwithbalance\\002_12seed.html");

            WebElement input = driver.findElement(By.xpath("//textarea[@class='phrase private-data form-control']"));
            input.clear();

            try {
                input.sendKeys(takeSeedRes(count));
                count++;
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            try {
                sleep(130000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            File saveDb = Path.of("src","savechinese.scv").toFile();
            List<WebElement> checker = driver.findElements(By.xpath("//tbody[@class='addresses-recovery monospace']/tr['innerText']"));

            for (WebElement element : checker) {
                String text = element.getText();
                if (!text.isEmpty()){
                    currentValue = text;
                    inBdSaver();

                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(saveDb, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(text);
                            writer.newLine();
                        }
                    }

                }
            }

            System.out.println(count);
            Date date = new Date();
            System.out.println(date);
            driver.quit();
            workedSelenium();

        }
        public static String takeSeedRes(int count) throws IOException {
            String currentLine = null;
            String res = "C:\\Users\\Boris\\IdeaProjects\\Seed_Selenium\\src\\simple_res_chinese.txt";
            try (Stream lines = Files.lines(Paths.get(res))) {
                currentLine = (String) lines.skip(count).findFirst().get();
            }
            seed11 = currentLine;
            return currentLine;
        }

        public static void inBdSaver()  {

            var storageDao = StorageDao.getInstance();
            String keyParts[] = currentValue.split("   ");
            var storage = new StorageWordsKeys();
            storage.setWord(keyParts[0]);
            storage.setBip44Btc(keyParts[1]);
            storage.setBip49Btc(keyParts[2]);
            storage.setBip84Btc(keyParts[3]);
            storage.setBip44Eth(keyParts[4]);
            storage.setBip32Eth(keyParts[5]);
            storage.setLtc(keyParts[7]);
            storage.setSeed11Entity(seed11);
            try {
                var saveShop = storageDao.save(storage);
            } catch (Exception e) {

                throw new RuntimeException(e);

            }
        }
}
