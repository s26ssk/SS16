package BT4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("src/BT4/text.txt");
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
                Collections.sort(list);
                for (String word : list) {
                    System.out.println(word);
                }
            } else {
                System.out.println("File không tồn tại");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
