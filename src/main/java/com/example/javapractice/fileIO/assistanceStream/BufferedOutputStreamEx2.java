package com.example.javapractice.fileIO.assistanceStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx2 {
    public static void main (String []args){
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("987.txt"));

            for(int i='1'; i<='9'; i++ ){
                bos.write(i);
            }
            bos.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}


