package laba8;

import java.io.*;

public class Example10 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("/home/funk2256/My/Example10.txt"), "cp1251"));

            PrintWriter out = new PrintWriter("/home/funk2256/My/Example11.txt");
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
