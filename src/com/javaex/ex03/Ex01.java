package com.javaex.ex03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class Ex01 {
	
	public static void main(String[] args) throws IOException { //예외처리
		
		Writer fw = new FileWriter("D:\\javaStudy\\file\\song.text");
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		bw.write("학교종이 땡땡땡"); //글자가 뭐가 될지 몰라서 반복문으로 만들 수 없음
		bw.newLine();
		bw.write("어서모이자");
		bw.newLine();
		bw.write("선생님이 우리를");
		bw.newLine();
		bw.write("기다리신다");
		
		bw.close();
	}

}
