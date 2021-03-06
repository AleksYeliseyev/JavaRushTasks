package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        /*List<Integer> dataByte = new ArrayList<>();
        String fileName1;
        String fileName2;
        String fileName3;
//      Открываем файл и считываем в dataByte данные побайтово из первого файла
        fileName1 = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        fileName2 = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        fileName3 = (new BufferedReader(new InputStreamReader(System.in))).readLine();
//        fileName1 = "file1.txt";
//        fileName2 = "file2.txt";
//        fileName3 = "file3.txt";
        FileInputStream fileInputStream = new FileInputStream(fileName1);
        while (fileInputStream.available() > 0) {
            dataByte.add(fileInputStream.read());
        }
        fileInputStream.close();
        int count = dataByte.size() % 2 == 0 ? (dataByte.size() / 2) : (dataByte.size() / 2) + 1;
//        System.out.println("dataByte.size(): " + dataByte.size());
//        System.out.println("count:" + count);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName2);
        for (int i = 0; i < count; i++) {
            fileOutputStream.write(dataByte.get(i));
        }
        fileOutputStream.close();
        fileOutputStream = new FileOutputStream(fileName3);
        for (int i = count; i < dataByte.size(); i++) {
            fileOutputStream.write(dataByte.get(i));
        }
        fileOutputStream.close();*/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = "file1.txt";
        String filename2 = "file2.txt";
        String filename3 = "file3.txt";
        FileInputStream file1 = new FileInputStream(filename1);
        FileOutputStream file2 = new FileOutputStream(filename2);
        FileOutputStream file3 = new FileOutputStream(filename3);
        int s = file1.available();

        while(file1.available() >= (s+1) / 2){
            file2.write(file1.read());
        }

        while(file1.available() > 0){
            file3.write(file1.read());
        }
        file1.close();
        file2.close();
        file3.close();
    }
}
