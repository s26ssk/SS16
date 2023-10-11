package BT2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("src/BT2/text.txt");
            if (file.exists()) {
                FileReader fr = new FileReader(file);
                LineNumberReader lnr = new LineNumberReader(fr);
                int linenumber = 0;
                while (lnr.readLine() != null) {
                    linenumber++;
                }
                System.out.println("Số dòng của file text là: " + linenumber);
                lnr.close();
            } else {
                System.out.println("File không tồn tại");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
