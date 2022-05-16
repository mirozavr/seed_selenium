import dao.*;
import entity.EtheriumWithBalance;
import entity.KeysWithBalance;
import entity.Keyz;
import entity.StorageWordsKeys;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Date;
import java.util.List;

import static java.lang.Thread.sleep;

/**
 *  searchBitcoins need use switch argument:
 *  1,2,3  - first DB (bip: 44, 49, 84)
 *  4,5,6  - second DB
 *  7,8,9  - third DB
 *  10,11,12  - fourth DB
 *  13     - test DB
 */

public class CompareKeys {

    static File bingo = Path.of("src","bingo.scv").toFile();
    static  File bingo2 = Path.of("src","bingoEth.scv").toFile();


    public static List<StorageWordsKeys> generated = StorageDao.getInstance().findAll();
    public static List<KeysWithBalance> balance = BalanceDao.getInstance().findAll();
    public static List<KeysWithBalance> balance2 = BalanceDao2.getInstance().findAll2();
    public static List<KeysWithBalance> balance3 = BalanceDao3.getInstance().findAll3();
    public static List<KeysWithBalance> balance4 = BalanceDao4.getInstance().findAll4();
//    public static List<EtheriumWithBalance> eth1 = EtheriumDao.getInstance().findAll();
//    public static List<EtheriumWithBalance> eth2 = EtheriumDao2.getInstance().findAll();
//    public static List<EtheriumWithBalance> eth3 = EtheriumDao3.getInstance().findAll();
//    public static List<EtheriumWithBalance> eth4 = EtheriumDao4.getInstance().findAll();
//    public static List<EtheriumWithBalance> eth5 = EtheriumDao5.getInstance().findAll();
//    public static List<EtheriumWithBalance> eth6 = EtheriumDao6.getInstance().findAll();
//    public static List<EtheriumWithBalance> eth7 = EtheriumDao7.getInstance().findAll();
//    public static List<EtheriumWithBalance> eth8 = EtheriumDao8.getInstance().findAll();
//    public static List<EtheriumWithBalance> eth9 = EtheriumDao9.getInstance().findAll();
//    public static List<EtheriumWithBalance> eth10 = EtheriumDao10.getInstance().findAll();
//    public static List<EtheriumWithBalance> eth11 = EtheriumDao11.getInstance().findAll();
//    public static List<EtheriumWithBalance> eth12 = EtheriumDao12.getInstance().findAll();
//    public static List<EtheriumWithBalance> eth13 = EtheriumDao13.getInstance().findAll();
//    public static List<EtheriumWithBalance> eth14 = EtheriumDao14.getInstance().findAll();
//    public static List<EtheriumWithBalance> eth15 = EtheriumDao15.getInstance().findAll();



    public static void main(String[] args) {


        searchBitcoinsAutomatically();
      //  searchBitcoins(7);
      //  searchBtcTest();

     //   searchEtheriumAutomatically();

//        List<StorageWordsKeys> btc44 = StorageDao.getInstance().findBip44Btc();
//        System.out.println(btc44);




//        for (int i = 0; i < generated.size(); i++) {
//            var a = generated.get(i);
//            for (int j = 0; j < balance.size(); j++) {
//                var b = balance.get(j);
//                if (a.getBip44Btc().equals(b.getKeys())) {
//                    System.out.println(a.getSeed11Entity() + " " + a.getWord());
//                }
//            }
//        }

//        System.out.println(all);
       // System.out.println(all);
//        for (StorageWordsKeys row : all)
//             {
//                 String key = row.getBip44Btc();
//
//                 System.out.println(key);
//                 if (!key.isEmpty()) {
//
//                 }
//             }



     //   System.out.println(all.get(2));

//        var keyz = KeyzDao.getInstance().findAll();
//        System.out.println(keyz);
//        System.out.println("---");
//        List<Keyz2> keyz2 = Keyz2Dao.getInstance().findAll();
//        System.out.println(keyz2);



//        var storageDao = StorageDao.getInstance();
//        StorageDao.compareBip44Btc();
    }
    public static void searchBip44Btc(){
//        List<StorageWordsKeys> generated = StorageDao.getInstance().findAll();
//        List<KeysWithBalance> balance = BalanceDao.getInstance().findAll();
        // List<Keyz> keyz = KeyzDao.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (KeysWithBalance kb : balance) {

                String s = kb.getKeys();
                if (gen.getBip44Btc().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {

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
    public static void searchBip49Btc(){
//        List<StorageWordsKeys> generated = StorageDao.getInstance().findAll();
//        List<KeysWithBalance> balance = BalanceDao.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (KeysWithBalance kb : balance) {

                String s = kb.getKeys();
                if (gen.getBip49Btc().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {

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
    public static void searchBip84Btc(){
//        List<StorageWordsKeys> generated = StorageDao.getInstance().findAll();
//        List<KeysWithBalance> balance = BalanceDao.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (KeysWithBalance kb : balance) {

                String s = kb.getKeys();
                if (gen.getBip84Btc().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {

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

    public static void searchBip44BtcDb2(){
//        List<StorageWordsKeys> generated = StorageDao.getInstance().findAll();
//        List<KeysWithBalance> balance = BalanceDao.getInstance().findAll2();
        // List<Keyz> keyz = KeyzDao.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (KeysWithBalance kb : balance2) {

                String s = kb.getKeys();
                if (gen.getBip44Btc().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {

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
    public static void searchBip49BtcDb2(){
//        List<StorageWordsKeys> generated = StorageDao.getInstance().findAll();
//        List<KeysWithBalance> balance = BalanceDao.getInstance().findAll2();

        for (StorageWordsKeys gen : generated) {

            for (KeysWithBalance kb : balance2) {

                String s = kb.getKeys();
                if (gen.getBip49Btc().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {

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
    public static void searchBip84BtcDb2(){
//        List<StorageWordsKeys> generated = StorageDao.getInstance().findAll();
//        List<KeysWithBalance> balance = BalanceDao.getInstance().findAll2();

        for (StorageWordsKeys gen : generated) {

            for (KeysWithBalance kb : balance2) {

                String s = kb.getKeys();
                if (gen.getBip84Btc().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {

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
    public static void searchBip44BtcDb3(){
//        List<StorageWordsKeys> generated = StorageDao.getInstance().findAll();
//        List<KeysWithBalance> balance = BalanceDao.getInstance().findAll3();
        // List<Keyz> keyz = KeyzDao.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (KeysWithBalance kb : balance3) {

                String s = kb.getKeys();
                if (gen.getBip44Btc().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {

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
    public static void searchBip49BtcDb3(){
//        List<StorageWordsKeys> generated = StorageDao.getInstance().findAll();
//        List<KeysWithBalance> balance = BalanceDao.getInstance().findAll3();

        for (StorageWordsKeys gen : generated) {

            for (KeysWithBalance kb : balance3) {

                String s = kb.getKeys();
                if (gen.getBip49Btc().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {

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
    public static void searchBip84BtcDb3(){
//        List<StorageWordsKeys> generated = StorageDao.getInstance().findAll();
//        List<KeysWithBalance> balance = BalanceDao.getInstance().findAll3();

        for (StorageWordsKeys gen : generated) {

            for (KeysWithBalance kb : balance3) {

                String s = kb.getKeys();
                if (gen.getBip84Btc().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {

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

    public static void searchBip44BtcDb4(){
//        List<StorageWordsKeys> generated = StorageDao.getInstance().findAll();
//        List<KeysWithBalance> balance = BalanceDao.getInstance().findAll4();
        // List<Keyz> keyz = KeyzDao.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (KeysWithBalance kb : balance4) {

                String s = kb.getKeys();
                if (gen.getBip44Btc().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {

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
    public static void searchBip49BtcDb4(){
//        List<StorageWordsKeys> generated = StorageDao.getInstance().findAll();
//        List<KeysWithBalance> balance = BalanceDao.getInstance().findAll4();

        for (StorageWordsKeys gen : generated) {

            for (KeysWithBalance kb : balance4) {

                String s = kb.getKeys();
                if (gen.getBip49Btc().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {

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
    public static void searchBip84BtcDb4(){
//        List<StorageWordsKeys> generated = StorageDao.getInstance().findAll();
//        List<KeysWithBalance> balance = BalanceDao.getInstance().findAll4();

        for (StorageWordsKeys gen : generated) {

            for (KeysWithBalance kb : balance4) {

                String s = kb.getKeys();
                if (gen.getBip84Btc().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {

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

    public static void searchBtcTest(){
//        List<StorageWordsKeys> generated = StorageDao.getInstance().findAll();
        List<Keyz> keyz = KeyzDao.getInstance().findAll();

        for (StorageWordsKeys gen : generated) {

            for (Keyz kz : keyz) {

                String s = kz.getKeys();
                if (gen.getBip44Btc().equals(s)) {
                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {

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
    public static void searchBitcoins(int numberDb) {
        switch (numberDb) {
            case 1: searchBip44Btc();
            break;
            case 2: searchBip49Btc();
            break;
            case 3: searchBip84Btc();
            break;
            case 4: searchBip44BtcDb2();
                break;
            case 5: searchBip49BtcDb2();
                break;
            case 6: searchBip84BtcDb2();
                break;
            case 7: searchBip44BtcDb3();
                break;
            case 8: searchBip49BtcDb3();
                break;
            case 9: searchBip84BtcDb3();
                break;
            case 10: searchBip44BtcDb4();
                break;
            case 11: searchBip49BtcDb4();
                break;
            case 12: searchBip84BtcDb4();
            break;
            case 13: searchBtcTest();
                break;
        }

    }
    public static void searchBitcoinsAutomatically() {
        System.out.println("start compare");
        Date date = new Date();
        System.out.println(date);
        searchBip44Btc();
        secondSleeper();
        System.out.println("first scan completed");
        searchBip49Btc();
        secondSleeper();
        System.out.println("2 scan completed");

        searchBip84Btc();
        secondSleeper();
        System.out.println("3 scan completed");

        searchBip44BtcDb2();
        secondSleeper();
        System.out.println("4 scan completed");

        searchBip49BtcDb2();
        secondSleeper();
        System.out.println("5 scan completed");

        searchBip84BtcDb2();
        secondSleeper();
        System.out.println("6 scan completed");

        searchBip44BtcDb3();
        secondSleeper();
        System.out.println("7 scan completed");

        try {
            sleep(5000);
            System.out.println("good morning");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchBip49BtcDb3();
        secondSleeper();
        System.out.println("8 scan completed");

        searchBip84BtcDb3();
        secondSleeper();
        System.out.println("9 scan completed");

        searchBip44BtcDb4();
        secondSleeper();
        System.out.println("10 scan completed");

        searchBip49BtcDb4();
        secondSleeper();
        System.out.println("11 scan completed");

        searchBip84BtcDb4();
        secondSleeper();
        System.out.println("12 scan completed");

        searchBtcTest();
        secondSleeper();
        System.out.println("test scan completed");
        Date date2 = new Date();
        System.out.println(date2);

    }


    public static void secondSleeper() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    public static void searchBip44Eth(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth1) {
//
//                String s = eb.getKeys();
//                if (gen.getBip44Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//
//    public static void searchBip32Eth(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth1) {
//
//                String s = eb.getKeys();
//                if (gen.getBip32Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//    public static void searchBip44EthDb2(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth2) {
//
//                String s = eb.getKeys();
//                if (gen.getBip44Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//
//    public static void searchBip32EthDb2(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth2) {
//
//                String s = eb.getKeys();
//                if (gen.getBip32Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//    public static void searchBip44EthDb3(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth3) {
//
//                String s = eb.getKeys();
//                if (gen.getBip44Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//
//    public static void searchBip32EthDb3(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth3) {
//
//                String s = eb.getKeys();
//                if (gen.getBip32Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//    public static void searchBip44EthDb4(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth4) {
//
//                String s = eb.getKeys();
//                if (gen.getBip44Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//
//    public static void searchBip32EthDb4(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth4) {
//
//                String s = eb.getKeys();
//                if (gen.getBip32Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//    public static void searchBip44EthDb5(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth5) {
//
//                String s = eb.getKeys();
//                if (gen.getBip44Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//
//    public static void searchBip32EthDb5(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth5) {
//
//                String s = eb.getKeys();
//                if (gen.getBip32Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//    public static void searchBip44EthDb6(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth6) {
//
//                String s = eb.getKeys();
//                if (gen.getBip44Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//
//    public static void searchBip32EthDb6(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth6) {
//
//                String s = eb.getKeys();
//                if (gen.getBip32Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//    public static void searchBip44EthDb7(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth7) {
//
//                String s = eb.getKeys();
//                if (gen.getBip44Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//
//    public static void searchBip32EthDb7(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth7) {
//
//                String s = eb.getKeys();
//                if (gen.getBip32Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//    public static void searchBip44EthDb8(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth8) {
//
//                String s = eb.getKeys();
//                if (gen.getBip44Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//
//    public static void searchBip32EthDb8(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth8) {
//
//                String s = eb.getKeys();
//                if (gen.getBip32Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//    public static void searchBip44EthDb9(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth9) {
//
//                String s = eb.getKeys();
//                if (gen.getBip44Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//
//    public static void searchBip32EthDb9(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth9) {
//
//                String s = eb.getKeys();
//                if (gen.getBip32Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//    public static void searchBip44EthDb10(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth10) {
//
//                String s = eb.getKeys();
//                if (gen.getBip44Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//
//    public static void searchBip32EthDb10(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth10) {
//
//                String s = eb.getKeys();
//                if (gen.getBip32Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//    public static void searchBip44EthDb11(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth11) {
//
//                String s = eb.getKeys();
//                if (gen.getBip44Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//
//    public static void searchBip32EthDb11(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth11) {
//
//                String s = eb.getKeys();
//                if (gen.getBip32Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//    public static void searchBip44EthDb12(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth12) {
//
//                String s = eb.getKeys();
//                if (gen.getBip44Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//
//    public static void searchBip32EthDb12(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth12) {
//
//                String s = eb.getKeys();
//                if (gen.getBip32Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//    public static void searchBip44EthDb13(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth13) {
//
//                String s = eb.getKeys();
//                if (gen.getBip44Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//
//    public static void searchBip32EthDb13(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth13) {
//
//                String s = eb.getKeys();
//                if (gen.getBip32Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//    public static void searchBip44EthDb14(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth14) {
//
//                String s = eb.getKeys();
//                if (gen.getBip44Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//
//    public static void searchBip32EthDb14(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth14) {
//
//                String s = eb.getKeys();
//                if (gen.getBip32Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//    public static void searchBip44EthDb15(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth15) {
//
//                String s = eb.getKeys();
//                if (gen.getBip44Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//
//    public static void searchBip32EthDb15(){
//
//        for (StorageWordsKeys gen : generated) {
//
//            for (EtheriumWithBalance eb : eth15) {
//
//                String s = eb.getKeys();
//                if (gen.getBip32Eth().equals(s)) {
//                    System.out.println(gen.getSeed11Entity() + " " + gen.getWord());
//                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bingo, true))) {
//
//                        for (int a = 0; a < 1; a++) {
//                            writer.append(gen.getSeed11Entity()+ " " + gen.getWord());
//                            writer.newLine();
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        }
//    }
//
//    public static void searchEtheriumAutomatically(){
//        System.out.println("Start search Etherium");
//        searchBip44Eth();
//        secondSleeper();
//        Date date = new Date();
//        System.out.println(date);
//        System.out.println("1 scan completed");
//
//        searchBip32Eth();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("2 scan completed");
//
//        System.out.println("Start search Etherium db2");
//        searchBip44EthDb2();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("3 scan completed");
//
//        searchBip32EthDb2();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("4 scan completed");
//
//        System.out.println("Start search Etherium db3");
//        searchBip44EthDb3();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("5 scan completed");
//
//        searchBip32EthDb3();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("6 scan completed");
//
//        System.out.println("Start search Etherium db4");
//        searchBip44EthDb4();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("7 scan completed");
//
//        searchBip32EthDb4();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("8 scan completed");
//
//        System.out.println("Start search Etherium db5");
//        searchBip44EthDb5();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("9 scan completed");
//
//        searchBip32EthDb5();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("10 scan completed");
//
//        System.out.println("Start search Etherium db6");
//        searchBip44EthDb6();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("11 scan completed");
//
//        searchBip32EthDb6();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("12 scan completed");
//
//        System.out.println("Start search Etherium db7");
//        searchBip44EthDb7();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("13 scan completed");
//
//        searchBip32EthDb7();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("14 scan completed");
//
//        System.out.println("Start search Etherium db8");
//        searchBip44EthDb8();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("15 scan completed");
//
//        searchBip32EthDb8();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("16 scan completed");
//
//        System.out.println("Start search Etherium db9");
//        searchBip44EthDb9();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("17 scan completed");
//
//        searchBip32EthDb9();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("18 scan completed");
//
//        System.out.println("Start search Etherium db10");
//        searchBip44EthDb10();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("19 scan completed");
//
//        searchBip32EthDb10();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("20 scan completed");
//
//        System.out.println("Start search Etherium db11");
//        searchBip44EthDb11();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("21 scan completed");
//
//        searchBip32EthDb11();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("22 scan completed");
//
//        System.out.println("Start search Etherium db12");
//        searchBip44EthDb12();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("23 scan completed");
//
//        searchBip32EthDb12();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("24 scan completed");
//
//        System.out.println("Start search Etherium db13");
//        searchBip44EthDb13();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("25 scan completed");
//
//        searchBip32EthDb13();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("26 scan completed");
//
//        System.out.println("Start search Etherium db14");
//        searchBip44EthDb14();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("27 scan completed");
//
//        searchBip32EthDb14();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("28 scan completed");
//
//        System.out.println("Start search Etherium db15");
//        searchBip44EthDb15();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("29 scan completed");
//
//        searchBip32EthDb15();
//        secondSleeper();
//        System.out.println(date);
//        System.out.println("30 scan completed");
//
//
//    }

}
