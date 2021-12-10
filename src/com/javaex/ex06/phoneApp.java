package com.javaex.ex06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class phoneApp {

	public static void main(String[] args) throws IOException {

		List<Person> pList = new ArrayList<Person>();
		
		Scanner sc = new Scanner(System.in);
		
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
		    
		    Person p01 = new Person(name,hp,company);
		    pList.add(p01);
		
		}
		
		for(int i=0; i<pList.size(); i++) {
	    	System.out.println("이름: " + pList.get(i).getName());
	    	System.out.println("핸드폰: " + pList.get(i).getHp());
			System.out.println("회사: " + pList.get(i).getCompany());
	        System.out.println("");
		}
		
		String info = sc.nextLine();
		String[] cutArray = info.split(",");
		String n = cutArray[0];
		String h = cutArray[1];
		String c = cutArray[2];
		
	    Person p02 = new Person(n,h,c);
	    pList.add(p02);
		
	    Writer fw = new FileWriter("D:\\javaStudy\\file\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(int i=0; i<pList.size(); i++) {
	    	System.out.println("이름: " + pList.get(i).getName());
	    	System.out.println("핸드폰: " + pList.get(i).getHp());
			System.out.println("회사: " + pList.get(i).getCompany());
	        System.out.println("");
		}
		
		
		for(int i=0; i<pList.size(); i++) {
			bw.write(pList.get(i).getName());
			bw.write(",");
			bw.write(pList.get(i).getHp());
			bw.write(",");
			bw.write(pList.get(i).getCompany());
			bw.newLine();
		}
		//System.out.println("이름: " +pList.get(3));
		br.close();
		bw.close();
		
		sc.close();
	}

}
