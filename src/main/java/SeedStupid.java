import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;

public class SeedStupid {

    private ArrayList<String> array;

    public static void main(String[] args) throws IOException {
        SeedStupid seedStupid = new SeedStupid();
        seedStupid.takeWords();
        seedStupid.simpleString();
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
        reader.close();
    }

    public void simpleString() throws IOException {

        ArrayList<String> arrayR = new ArrayList<String>();
        File file2 = Path.of("src", "simple_res.txt").toFile();

        for (int i = 0; i < 2048; i++) {
            int index1 = i;
            int index2 = i;
            int index3 = i;
            int index4 = i;
            int index5 = i;
            int index6 = i;
            int index7 = i;
            int index8 = i;
            int index9 = i;
            int index10 = i;
            int index11 = i;

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
