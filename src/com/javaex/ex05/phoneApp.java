package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class phoneApp {

	public static void main(String[] args) throws IOException{
        
		//ArrayList 메모리에 올리기
		List<Person> pList = new ArrayList<Person>();//리스트만들기 Person의 주소 관리할것

		//파일(phoneDB) 읽어오기  phoneDB접속
		Reader fr = new FileReader("D:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
		
			//한줄씩 읽는다.
			String line = br.readLine(); //이효리,010-111,031-22-1
			if(line == null) {// 마지막 끝 
				break;
			}
			
			//마지막이 아니면 ,로 구분한다
			String[] dArray = line.split(",");
			String name = dArray[0]; //이효리
			String hp = dArray[1]; //010-111
			String company = dArray[2]; //031-22-1

		    //Person객체를 생성하고 값을 넣어준다
			Person p01 = new Person(name,hp,company);
            
			//리스트에 추가해준다 ********* 잊지말기
			pList.add(p01);//관리하기 위해 add로 주소를 리스트에넣음
			
		}	
		//테스트용 출력 toString()사용
		//System.out.println(pList.toString());
		
        //화면출력
		for(int i=0; i<pList.size(); i++) {
			System.out.println("이름: " + pList.get(i).getName());
			System.out.println("핸드폰: " + pList.get(i).getHp());
			System.out.println("회사: " + pList.get(i).getCompany());
	        System.out.println("");
		}
		
		br.close();
	}

}
