package laba8;

import java.io.*;
import java.util.Scanner;
import  java.io.OutputStream;

public class Example4 {
    public static void main(String[] args) {
        File dir = new File("/home/funk2256/My");
        boolean created = dir.mkdir();
        if (created)
            System.out.println("Папка " + dir.getName() + " создана");
       try {
           File f1 = new File("/home/funk2256/My/numIsh.txt");
           f1.createNewFile();
//            boolean createdFile = newFile.createNewFile();
//            if (createdFile)
//                System.out.println("Файл " + newFile.getName() + " был создан");
           Scanner sc = new Scanner(System.in, "cp1251");
           DataOutputStream wr =
                   new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
           System.out.println("Сколько вещественных чисел записать в\n" +
                   "файл?");
           int count = sc.nextInt();
           System.out.println("Введите числа:");
           for (int i = 0; i < count; i++)
               wr.writeFloat(sc.nextFloat());
           wr.flush();
           wr.close();
           File f2=new
                   File("/home/funk2256/My/numRez.txt");
           f2.createNewFile();
// поток для чтения из исходного файла numIsh.txt
           DataInputStream rd =
                   new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
// поток для записи в результирующий файл numRez.txt
           wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));
           try{
               while(true){
                   float number=rd.readFloat();
                   wr.writeFloat(number);
                   System.out.println(" Число "+ (float)number);
               }
           }catch(EOFException e){}
           wr.flush();
           wr.close();
           rd.close();
       }catch(IOException e){
           System.out.println("End of file");
       }
    }}
