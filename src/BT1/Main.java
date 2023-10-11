package BT1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("src/BT1/text.txt");
            if (file.exists()) {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                List<String> list = new ArrayList<>();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] textStrings = line.split(" ");
                    System.out.println(Arrays.toString(textStrings));
                    for (String textString : textStrings) {
                        list.add(String.valueOf(textString));
                    }
                }
                bufferedReader.close();
                System.out.println("Số kí tự trong file là: " + list.size() + " từ");
            } else {
                System.out.println("File không tồn tại");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
