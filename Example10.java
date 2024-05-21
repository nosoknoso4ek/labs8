package laba8;

import java.io.*;

public class Example10 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("D:/10/MyFile1.txt"), "cp1251"));

            PrintWriter out = new PrintWriter("D:/10/MyFile2.txt", "cp1251");
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + s);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!!");
        }
//        finally {
//            br.close();
//            out.flush();
//            out.close();
//        }
    }
}
