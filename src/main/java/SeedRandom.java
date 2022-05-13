import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Random;


public class SeedRandom {

    private Random random;
    private ArrayList<String> array;


    public static void main(String[] args) throws IOException {
        SeedRandom bingo = new SeedRandom();
        bingo.takeWords();
        bingo.anyString();
    }

    public void takeWords() throws IOException {

        String path = "C:\\Users\\Boris\\IdeaProjects\\Seed_Selenium\\src\\texts\\names";

        File file = new File(path);
        array = new ArrayList<>();
        String currentLine;
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while ((currentLine = reader.readLine()) != null) {
            array.add(currentLine);
        }
        random = new Random();
        reader.close();

    }

    public void anyString() throws IOException {

        ArrayList<String> arrayR = new ArrayList<String>();
        //   File f2 = new File("C:\Users\Boris\IdeaProjects\Seed_Selenium\src\res.txt");
        File file2 = Path.of("src", "res5.txt").toFile();

        for (int i = 0; i < 1000; i++) {
            int index1 = random.nextInt(array.size());
            int index2 = random.nextInt(array.size());
            int index3 = random.nextInt(array.size());
            int index4 = random.nextInt(array.size());
            int index5 = random.nextInt(array.size());
            int index6 = random.nextInt(array.size());
            int index7 = random.nextInt(array.size());
            int index8 = random.nextInt(array.size());
            int index9 = random.nextInt(array.size());
            int index10 = random.nextInt(array.size());
            int index11 = random.nextInt(array.size());
            //        int index12 = random.nextInt(array.size());
            //        int index13 = random.nextInt(array.size());
            //        int index14 = random.nextInt(array.size());
            //        int index15 = random.nextInt(array.size());
            //        int index16 = random.nextInt(array.size());
            //        int index17 = random.nextInt(array.size());
            //        int index18 = random.nextInt(array.size());
            //        int index19 = random.nextInt(array.size());
            //        int index20 = random.nextInt(array.size());
            //        int index21 = random.nextInt(array.size());
            //        int index22 = random.nextInt(array.size());
            //        int index23 = random.nextInt(array.size());
            String str1 = array.get(index1);
            String str2 = array.get(index2);
            String str3 = array.get(index3);
            String str4 = array.get(index4);
            String str5 = array.get(index5);
            String str6 = array.get(index6);
            String str7 = array.get(index7);
            String str8 = array.get(index8);
            String str9 = array.get(index9);
            String str10 = array.get(index10);
            String str11 = array.get(index11);
            //        String str12 = array.get(index12);
            //        String str13 = array.get(index13);
            //        String str14 = array.get(index14);
            //        String str15 = array.get(index15);
            //        String str16 = array.get(index16);
            //        String str17 = array.get(index17);
            //        String str18 = array.get(index18);
            //        String str19 = array.get(index19);
            //        String str20 = array.get(index20);
            //        String str21 = array.get(index21);
            //        String str22 = array.get(index22);
            //        String str23 = array.get(index23);

            String result = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5 + " " + str6 + " " + str7
                    + " " + str8 + " " + str9 + " " + str10 + " " + str11 + " ?";// " " + str12 + " " + str13 + " " + str14 + " "
            //              + str15 + " " + str16 + " " + str17 + " " + str18
            //            + " " + str19 + " " + str20 + " " + str21 + " " + str22 + " " + str23;

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file2, true))) {
//                for (int a = 0; a < arrayR.size(); a++) {
//                    writer.append(arrayR.get(a));
//                    writer.newLine();
                    for (int a = 0; a < 1; a++) {
                        writer.append(result);
                        writer.newLine();
                    }

                }
                System.out.println(result);


                arrayR.add(result);

            }

        }
    }



// FileWriter writer = new FileWriter("/home/maks/IdeaProjects/seed/src/texts/res.txt");



