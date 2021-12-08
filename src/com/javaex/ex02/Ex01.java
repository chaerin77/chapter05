package com.javaex.ex02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;




public class Ex01 {

	public static void main(String[] args) throws IOException{

		InputStream in = new FileInputStream("D:\\javaStudy\\file\\img.jpg");//프로그램쪽으로 들어와야하니까 input
		BufferedInputStream bin = new BufferedInputStream(in);//메모리에 읽어오려고
		
		OutputStream out = new FileOutputStream("D:\\javaStudy\\file\\bufferedimg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out); //쓰려고
		
		while(true) {
			int data = bin.read();
			if(data == -1) {
				System.out.println("복사가 완료 되었습니다."+data);
			    break;
			}
			bout.write(data);
			
		}
		
		//in.close();
		bin.close(); //가까이 있는bin을 컨트롤해주면 in도 닫아주지않아도 알아서 닫힌다
		//out.close();
		bout.close();
	}

}
