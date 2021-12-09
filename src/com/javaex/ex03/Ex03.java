package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) throws IOException {

		InputStream is = new FileInputStream("D:\\javaStudy\\file\\MS949.txt");
		InputStreamReader isr = new InputStreamReader(is, "MS949");  //보조스트림 파라미터 안에 어떤포맷으로 읽을지도 써줘야함
		BufferedReader br = new BufferedReader(isr);
		
		while(true) {
			 String str = br.readLine();
			 
			 if(str == null) {
				 break;
			 }
			 
			 System.out.println(str);
		}
		
		br.close();
	}

}
