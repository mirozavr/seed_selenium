import dao.*;
import entity.EtheriumWithBalance;
import entity.StorageWordsKeys;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Date;
import java.util.List;

import static java.lang.Thread.sleep;

public class CompareEtherium {

    static List<StorageWordsKeys> generated = StorageDao.getInstance().findAll();
     static  File bingo2 = Path.of("src","bingoEth.scv").toFile();

    public static void main(String[] args) {

        searchEtheriumAutomatically();

    }

    public static void secondSleeper() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void searchBip44Eth(){
        List<EtheriumWithBalance> eth1 = EtheriumDao.getInstance().findAll1();
        for (StorageWordsKeys gen : generated) {



            for (EtheriumWithBalance eb : eth1) {

                String s = eb.getKeys();
                if (gen.getBip44Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }

    }

    public static void searchBip32Eth(){
        List<EtheriumWithBalance> eth1 = EtheriumDao.getInstance().findAll1();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth1) {

                String s = eb.getKeys();
                if (gen.getBip32Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }

    }
    public static void searchBip44EthDb2(){
        List<EtheriumWithBalance> eth2 = EtheriumDao2.getInstance().findAll2();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth2) {

                String s = eb.getKeys();
                if (gen.getBip44Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                     e.printStackTrace();
                        throw new RuntimeException(e);
                    }

                }

            }
        }
    }

    public static void searchBip32EthDb2(){
        List<EtheriumWithBalance> eth2 = EtheriumDao2.getInstance().findAll2();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth2) {

                String s = eb.getKeys();
                if (gen.getBip32Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }
    public static void searchBip44EthDb3(){
        List<EtheriumWithBalance> eth3 = EtheriumDao3.getInstance().findAll3();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth3) {

                String s = eb.getKeys();
                if (gen.getBip44Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }

    public static void searchBip32EthDb3(){
        List<EtheriumWithBalance> eth3 = EtheriumDao3.getInstance().findAll3();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth3) {

                String s = eb.getKeys();
                if (gen.getBip32Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }
    public static void searchBip44EthDb4(){
        List<EtheriumWithBalance> eth4 = EtheriumDao4.getInstance().findAll4();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth4) {

                String s = eb.getKeys();
                if (gen.getBip44Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }

    public static void searchBip32EthDb4(){
        List<EtheriumWithBalance> eth4 = EtheriumDao4.getInstance().findAll4();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth4) {

                String s = eb.getKeys();
                if (gen.getBip32Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }
    public static void searchBip44EthDb5(){
        List<EtheriumWithBalance> eth5 = EtheriumDao5.getInstance().findAll5();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth5) {

                String s = eb.getKeys();
                if (gen.getBip44Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }

    public static void searchBip32EthDb5(){
        List<EtheriumWithBalance> eth5 = EtheriumDao5.getInstance().findAll5();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth5) {

                String s = eb.getKeys();
                if (gen.getBip32Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }
    public static void searchBip44EthDb6(){
        List<EtheriumWithBalance> eth6 = EtheriumDao6.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth6) {

                String s = eb.getKeys();
                if (gen.getBip44Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }

    public static void searchBip32EthDb6(){
        List<EtheriumWithBalance> eth6 = EtheriumDao6.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth6) {

                String s = eb.getKeys();
                if (gen.getBip32Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }
    public static void searchBip44EthDb7(){
        List<EtheriumWithBalance> eth7 = EtheriumDao7.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth7) {

                String s = eb.getKeys();
                if (gen.getBip44Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }

    public static void searchBip32EthDb7(){
        List<EtheriumWithBalance> eth7 = EtheriumDao7.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth7) {

                String s = eb.getKeys();
                if (gen.getBip32Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }
    public static void searchBip44EthDb8(){
        List<EtheriumWithBalance> eth8 = EtheriumDao8.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth8) {

                String s = eb.getKeys();
                if (gen.getBip44Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }

    public static void searchBip32EthDb8(){
        List<EtheriumWithBalance> eth8 = EtheriumDao8.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth8) {

                String s = eb.getKeys();
                if (gen.getBip32Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }
    public static void searchBip44EthDb9(){
        List<EtheriumWithBalance> eth9 = EtheriumDao9.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth9) {

                String s = eb.getKeys();
                if (gen.getBip44Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }

    public static void searchBip32EthDb9(){
        List<EtheriumWithBalance> eth9 = EtheriumDao9.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth9) {

                String s = eb.getKeys();
                if (gen.getBip32Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }
    public static void searchBip44EthDb10(){
        List<EtheriumWithBalance> eth10 = EtheriumDao10.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth10) {

                String s = eb.getKeys();
                if (gen.getBip44Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }

    public static void searchBip32EthDb10() {
        System.out.println("+");
        List<EtheriumWithBalance> eth10 = EtheriumDao10.getInstance().findAll();
        System.out.println("-");
        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth10) {

                String s = eb.getKeys();
                if (gen.getBip32Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity() + " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }
    public static void searchBip44EthDb11(){
        List<EtheriumWithBalance> eth11 = EtheriumDao11.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth11) {

                String s = eb.getKeys();
                if (gen.getBip44Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }

    public static void searchBip32EthDb11(){
        List<EtheriumWithBalance> eth11 = EtheriumDao11.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth11) {

                String s = eb.getKeys();
                if (gen.getBip32Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }
    public static void searchBip44EthDb12(){
        List<EtheriumWithBalance> eth12 = EtheriumDao12.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth12) {

                String s = eb.getKeys();
                if (gen.getBip44Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }

    public static void searchBip32EthDb12(){
        List<EtheriumWithBalance> eth12 = EtheriumDao12.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth12) {

                String s = eb.getKeys();
                if (gen.getBip32Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }
    public static void searchBip44EthDb13(){
        List<EtheriumWithBalance> eth13 = EtheriumDao13.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth13) {

                String s = eb.getKeys();
                if (gen.getBip44Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }

    public static void searchBip32EthDb13(){
        List<EtheriumWithBalance> eth13 = EtheriumDao13.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth13) {

                String s = eb.getKeys();
                if (gen.getBip32Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }
    public static void searchBip44EthDb14(){
        List<EtheriumWithBalance> eth14 = EtheriumDao14.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth14) {

                String s = eb.getKeys();
                if (gen.getBip44Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }

    public static void searchBip32EthDb14(){
        List<EtheriumWithBalance> eth14 = EtheriumDao14.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth14) {

                String s = eb.getKeys();
                if (gen.getBip32Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }
    public static void searchBip44EthDb15(){
        List<EtheriumWithBalance> eth15 = EtheriumDao15.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth15) {

                String s = eb.getKeys();
                if (gen.getBip44Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }

    public static void searchBip32EthDb15(){
        List<EtheriumWithBalance> eth15 = EtheriumDao15.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (EtheriumWithBalance eb : eth15) {

                String s = eb.getKeys();
                if (gen.getBip32Eth().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo2, true))) {

                        for (int a = 0; a < 1; a++) {
                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }

    public static void searchEtheriumAutomatically() {

        System.out.println("Start search Etherium");
        Date date = new Date();
        System.out.println(date);
        searchBip44Eth();
        System.out.println("before sleep");
        secondSleeper();
        System.out.println("after sleep");

        System.out.println("1 scan completed");
        System.out.println(date);

        searchBip32Eth();
        secondSleeper();
        //    System.out.println(date);
        System.out.println("2 scan completed");

        System.out.println("Start search Etherium db2");
        searchBip44EthDb2();
        secondSleeper();
        // System.out.println(date);
        System.out.println("3 scan completed");

        searchBip32EthDb2();
        secondSleeper();
        //  System.out.println(date);
        System.out.println("4 scan completed");

        secondSleeper();

        System.out.println("Start search Etherium db3");
        searchBip44EthDb3();
        secondSleeper();
        //  System.out.println(date);
        System.out.println("5 scan completed");

        searchBip32EthDb3();
        secondSleeper();
        //   System.out.println(date);
        System.out.println("6 scan completed");


        System.out.println("Start search Etherium db4");
        searchBip44EthDb4();
        secondSleeper();
        //  System.out.println(date);
        System.out.println("7 scan completed");

        searchBip32EthDb4();
        secondSleeper();
        //  System.out.println(date);
        System.out.println("8 scan completed");


        System.out.println("Start search Etherium db5");
        searchBip44EthDb5();
        secondSleeper();
        //    System.out.println(date);
        System.out.println("9 scan completed");

        searchBip32EthDb5();
        secondSleeper();
        //   System.out.println(date);
        System.out.println("10 scan completed");


        System.out.println("Start search Etherium db6");
        searchBip44EthDb6();
        secondSleeper();
        //  System.out.println(date);
        System.out.println("11 scan completed");


        searchBip32EthDb6();
        secondSleeper();
        //   System.out.println(date);
        System.out.println("12 scan completed");

        System.out.println("Start search Etherium db7");
        searchBip44EthDb7();
        secondSleeper();
        //    System.out.println(date);
        System.out.println("13 scan completed");

        searchBip32EthDb7();
        secondSleeper();
        //   System.out.println(date);
        System.out.println("14 scan completed");

        System.out.println("Start search Etherium db8");
        searchBip44EthDb8();
        secondSleeper();
        //   System.out.println(date);
        System.out.println("15 scan completed");

        searchBip32EthDb8();
        secondSleeper();
        //   System.out.println(date);
        System.out.println("16 scan completed");

        System.out.println("Start search Etherium db9");
        searchBip44EthDb9();
        secondSleeper();
        //   System.out.println(date);
        System.out.println("17 scan completed");

        searchBip32EthDb9();
        secondSleeper();
        //   System.out.println(date);
        System.out.println("18 scan completed");

        System.out.println("Start search Etherium db10");
        searchBip44EthDb10();
        secondSleeper();
        //   System.out.println(date);
        System.out.println("19 scan completed");

        searchBip32EthDb10();
        secondSleeper();
        //    System.out.println(date);
        System.out.println("20 scan completed");

        System.out.println("Start search Etherium db11");

        searchBip44EthDb11();
        secondSleeper();
        //    System.out.println(date);
        System.out.println("21 scan completed");

        searchBip32EthDb11();
        secondSleeper();
        //   System.out.println(date);
        System.out.println("22 scan completed");

        System.out.println("Start search Etherium db12");
        searchBip44EthDb12();
        secondSleeper();
        //   System.out.println(date);
        System.out.println("23 scan completed");

        searchBip32EthDb12();
        secondSleeper();
        //   System.out.println(date);
        System.out.println("24 scan completed");

        System.out.println("Start search Etherium db13");
        searchBip44EthDb13();
        secondSleeper();
        // System.out.println(date);
        System.out.println("25 scan completed");

        searchBip32EthDb13();
        secondSleeper();
        //    System.out.println(date);
        System.out.println("26 scan completed");

        System.out.println("Start search Etherium db14");
        searchBip44EthDb14();
        secondSleeper();
        //  System.out.println(date);
        System.out.println("27 scan completed");

        searchBip32EthDb14();
        secondSleeper();
        //   System.out.println(date);
        System.out.println("28 scan completed");

        System.out.println("Start search Etherium db15");
        searchBip44EthDb15();
        secondSleeper();
        //   System.out.println(date);
        System.out.println("29 scan completed");

        searchBip32EthDb15();
        secondSleeper();
        //   System.out.println(date);
        System.out.println("30 scan completed");
        Date date2 = new Date();
        System.out.println(date2);
    }
    }

