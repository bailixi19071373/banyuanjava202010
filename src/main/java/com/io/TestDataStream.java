package com.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class TestDataStream {
    public static void main(String[] args) {
        try (
//                DataOutputStream fos = new DataOutputStream(
//                        new FileOutputStream("data.txt"));
                FileInputStream fis = new FileInputStream("data.txt")) {
            byte[] buf = new byte[4];
            fis.read(buf);
            System.out.println(Arrays.toString(buf));
//            fos.writeInt(128);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
