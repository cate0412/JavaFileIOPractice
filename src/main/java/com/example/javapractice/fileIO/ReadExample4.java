package com.example.javapractice.fileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample4 {
    public static void main(String [] args){
        try {

            //1문자씩 읽기
            Reader reader = new FileReader("/Users/jin-yeonseo/Temp/test.txt");

            while (true) {
                int data = reader.read();  //1문자를 읽음
                if (data == -1) break;       //파일을 다 읽으면 while문 종료
                System.out.print((char) data); // 읽은 문자 출력
            }
            reader.close();
            System.out.println();


            //문자 배열로 읽기
            reader = new FileReader("/Users/jin-yeonseo/Temp/test.txt");  // 텍스트파일에서 문자입력스트림 생성
            char[] data = new char[100];              //읽은 문자를 저장할 배열 생성

            while (true) {
                int num = reader.read(data);           //읽은 문자는 배열에 저장, 읽은 문자 수는 리턴
                if (num == -1) break;                     //파일 다 읽으면 while문 종료
                for (int i = 0; i < num; i++) {             //읽은 문자 수만큼 출력
                    System.out.print(data[i]);
                }
            }
            reader.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

    }

}
