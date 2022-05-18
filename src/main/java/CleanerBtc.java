import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  Бесплатная IDEA не работает с TSV, изменил файл через LibreOffice
 *  Этот код остался для примера.
 */

public class CleanerBtc {

    public static void change (String[] args) {
        List<String> bitcoinsList = new ArrayList<>();
        String resourse = "/home/maks/Desktop/btc/blockchair_bitcoin_addresses_latest.tsv";

        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(resourse));
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("src", "changedAddresses.tsv"));

            // Добавляем все строки из файла в List
            bitcoinsList = reader.lines().collect(Collectors.toList());

            // Изменяем строки как нужно
            for (int i = 0; i < bitcoinsList.size(); i++) {
                String currentString = bitcoinsList.get(i);
                bitcoinsList.set(i, currentString.substring(0, currentString.indexOf(" ")));
            }
            for (String str : bitcoinsList) {
                writer.write(str + "\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
