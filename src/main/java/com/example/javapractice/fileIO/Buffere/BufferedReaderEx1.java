package com.example.javapractice.fileIO.Buffere;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx1 {
    public static void main(String[] args) {
        try {

            FileReader fr = new FileReader("/Users/jin-yeonseo/Java 연습/javaPractice/src/main/java/com/example/javapractice/fileIO/Buffere/BufferedReaderEx1.java");
            BufferedReader br = new BufferedReader(fr);

            String line = "";

            for (int i = 0; (line = br.readLine()) != null; i++) {
                //";"를 포함한 라인을 출력한다.
                if (line.contains(";")) {
                    System.out.println(i + ":" + line);
                }
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
