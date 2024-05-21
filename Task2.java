package laba8;

import java.io.*;
import java.util.concurrent.LinkedTransferQueue;

public class Task2 {
    public static void main(String[] args) throws IOException {
    String file1 = "/home/funk2256/IdeaProjects/Java/src/laba8/Task2_1.txt";
    String file2 = "/home/funk2256/IdeaProjects/Java/src/laba8/Task2_2.txt";
    try {
        FileReader fileReader = new FileReader(file1);
        BufferedReader br = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter(file2);
        BufferedWriter bw = new BufferedWriter(fileWriter);

        String oneLine = br.readLine();
        bw.write(oneLine);
        bw.newLine();

        String two_line = br.readLine();
        String[] numbers = two_line.split("\\s+");

        for (String number : numbers) {
            try{
                double num = Double.parseDouble(number);
                if (num > 0) {
                    bw.write(Double.toString(num));
                    bw.newLine();
                }
            } catch (NumberFormatException e) {
                System.out.println("Errors" + e);
            }
        }
        br.close();
        bw.close();
        System.out.println("Данные записаны в file2");
    } catch (IOException e) {
        System.out.println("Ошибка записи файла " + e.getMessage());
    }

    }
}
