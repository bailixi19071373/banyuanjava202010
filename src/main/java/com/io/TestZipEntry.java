package com.io;

import javax.swing.text.StyledEditorKit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class TestZipEntry {
    public static void main(String[] args) throws Exception {
          //压缩两个文件
        /*ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("src.zip"));
        File file1 = new File("aaa.txt");
        File file2 = new File("bbb.txt");
        zos.putNextEntry(new ZipEntry(file1.getName()));
        FileInputStream fis = new FileInputStream(file1);
        byte[] buf = new byte[16];
        int len;
        while((len=fis.read(buf))!=-1){
            zos.write(buf, 0, len);
        }
        zos.putNextEntry(new ZipEntry(file2.getName()));
         fis = new FileInputStream(file2);
        while((len=fis.read(buf))!=-1){
            zos.write(buf, 0, len);
        }
        fis.close();
        zos.close();*/

        //压缩一个文件夹下的文件(不递归)
        File src = new File("testzip");
        ZipOutputStream zos = new ZipOutputStream(
                new FileOutputStream(src.getName()+".zip"));
        File[] subFiles = src.listFiles();
        for (File subFile:
             subFiles) {
            if(subFile.isDirectory()){
                continue;
            }
            zos.putNextEntry(new ZipEntry(subFile.getName()));
            FileInputStream fis = new FileInputStream(subFile);
            byte[] buf = new byte[16];
            int len;
            while((len=fis.read(buf))!=-1){
                zos.write(buf, 0, len);
            }
            fis.close();
        }
        zos.close();
    }

    /**
     *
     * @param src 待压缩的文件
     * @param out 压缩输出流
     * @param base 当前路径
     */
    public static void zip(File src,ZipOutputStream out,String base){

    }
}
