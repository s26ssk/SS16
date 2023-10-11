package BT5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("src/BT5/text.txt");
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
                maxTexts(list);
            } else {
                System.out.println("File không tồn tại");
            }
} catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void maxTexts(List<String> listText) {
        String maxText = "";
        for (String text : listText) {
            if (text.length() > maxText.length()) {
                maxText = text;
            }
        }
        System.out.println("Các từ có độ dài dài nhất trong mảng là: ");
        List<String> setMaxTextList = new ArrayList<>();
        for (String text : listText) {
            if (text.length() == maxText.length() && !setMaxTextList.contains(text)) {
                setMaxTextList.add(text);
                System.out.println("- "+text);
            }
        }

    }
}
