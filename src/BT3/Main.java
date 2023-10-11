package BT3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> wordCount = new HashMap<>();
        try {
            File file = new File("src/BT3/text.txt");
            if (file.exists()) {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                List<String> list = new ArrayList<>();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] textStrings = line.split(" ");
                    for (String textString : textStrings) {
                        list.add(String.valueOf(textString));
                    }
                }
                System.out.println(list);
                for (String word : list) {
                    if (wordCount.containsKey(word)) {
                        wordCount.put(word, wordCount.get(word) + 1);
                    } else {
                        wordCount.put(word, 1);
                    }
                }
                for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                    if (entry.getValue() > 1) {
                        System.out.println("Từ '" + entry.getKey() + "' xuất hiện " + entry.getValue() + " lần.");
                    }
                }
                bufferedReader.close();
            } else {
                System.out.println("File không tồn tại");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
