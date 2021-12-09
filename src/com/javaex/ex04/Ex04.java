package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex04 {

	public static void main(String[] args) throws IOException{ //예외처리

		Reader fr = new FileReader("D:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			
			String line = br.readLine();
			if(line == null) {
				break;
			}
		
			String[] dataArray = line.split(",");
			
			String name = dataArray[0];
			String hp = dataArray[1];
			String company = dataArray[2];
			
			System.out.println("이름: " + name);
			System.out.println("핸드폰: " + hp);
			System.out.println("회사: " + company);
			System.out.println("");
			
			
			/* 내가 짜본 코드
			String str = br.readLine(); //한줄씩 읽어오는것
			if(str == null) { //탈출코드 조건문 문자 쪼개서 배열에 넣는거 하기전에, 배열만들기 전에 줄자체를갖고오려고했을때 그 줄이없으면 아예출력안하는거니까
				break;
			}
			String[] sArray = str.split(",");
			//System.out.println(str); str쪼개놓은거랑 별개로 str은 존재하고있음
			
			/*if(str == null) { 원래 여기다 썼었는데 그랬더니 오류났었음. 4번째로 br.readLine을 할때 가져올 줄이없는데 그래서 밑에서 str.split(",")하면 애초에 줄이없어서 배열에 넣어줄 데이터가 없음 
			 *                  그래서 그냥 한줄씩 읽어오는것 밑에다가 탈출코드 넣어야함 
				break;
			}
			
			
			System.out.println("이름: " + sArray[0]);
			System.out.println("핸드폰: " + sArray[1]);
			System.out.println("회사: " + sArray[2]);
			System.out.println("");
			*/
		}
		
		br.close();
	}

}
