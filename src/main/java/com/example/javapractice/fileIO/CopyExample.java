package com.example.javapractice.fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
    public static void main (String []args) throws Exception{
        String originalFileName = "/Users/jin-yeonseo/Temp/test.jpg";
        String targetFileName = "/Users/jin-yeonseo/Temp/test2.jpg";

        /**
         * 입출력 스트림 생성
         */
        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(targetFileName);

        /*
        //읽은 바이트를 저장할 배열 생성
        byte [] data = new byte[1024];

        //최대 1024 바이트를 읽고 배열에 저장, 읽은 바이트는 리턴
        while(true){
            int num = is.read(data);
            if(num == -1) break;  // 파일을 다 읽으면 while문 종료
            os.write(data, 0, num); //읽은 바이트 수만큼 출력
        }

         */
        is.transferTo(os); // 입력스트림에서 출력 스트림으로 바이트를 복사하는 transferTo() 메소드 사용

        os.flush(); // 내부 잔류 바이트를 출력하고 버퍼를 비움
        os.close();
        is.close();

        System.out.println("복사가 잘 되었습니다. ");

    }
}
