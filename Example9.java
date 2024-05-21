package laba8;

import java.io.*;

public class Example9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("D:/9/MyFile1.txt"), "cp1251"));
            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("D:/9/MyFile2.txt"), "cp1251"));
            // Переписывание информации из одного файла в другой
            int lineCount = 0; //счетчик
            String s;
            while ((s = br.readLine()) != null) {lineCount++;
                System.out.println(lineCount + ": " + s);
                bw.write(lineCount+ ": " + s);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!!");
        }
    finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
