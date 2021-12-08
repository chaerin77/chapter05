package com.javaex.ex01;

import java.io.FileInputStream;//ctrl shift o
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


public class Ex01 {
	
	public static void main(String[] args) throws Exception{//다음에 받는애가 처리해라
		
		 InputStream in = new FileInputStream("D:\\javaStudy\\file\\img.jpg");//섞어쓰기  빨대1
	     OutputStream out = new FileOutputStream("D:\\javaStudy\\file\\byteimg.jpg"); //빨대2
		 
	     byte[] buff= new byte[1024];//쟁반 byte
	     
	     System.out.println("복사시작");
	     while(true) {
	    	 int data = in.read(buff);//( ) 안에 쟁반. 여기에 데이터가 담김
	    	 if(data == -1) {
	    		 System.out.println("복사가 완료되었습니다." + data);
	    	     break;
	    	 }
	    	 out.write(buff);
	     }
	     
	     
	     /*
	     System.out.println("복사시작");
		 while(true) {
			 int data = in.read(); //변수 data  읽은값을 data에넣어주기
			 System.out.println(data);
			 
			 if(data ==-1) {
				 System.out.println("복사가 완료되었습니다." + data);
				 break;
			 }
			 
			 out.write(data);
		 }
		 */
	     
	     in.close(); //빨대 닫아주기
	     out.close();//계속 열어놓으면 안됨
	     
	}

}
