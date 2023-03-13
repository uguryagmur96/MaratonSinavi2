package uguryagmur;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//

public class ReaderMain {
	
	static Map<String,String> hshMap=new HashMap<>(); // Devasa veriyle listeleme işlemi yapacağım göz önüne alınarak hızlı çağırma için hashmap sınıfını kullandım.
	static Scanner scan=new Scanner(System.in);
	static ReaderMain readMain=new ReaderMain(); // metotları çağırabilmek için static bir reader main nesnesi tanımladım.
	
	public void getTheResultOrThrowsException(String word) { 
		if(hshMap.get(word)!=null) {
			System.out.println("Aradığınız kişinin telefon numarası: " + hshMap.get(word));
		} else {
			System.out.println("Rehberde bu isim ve soyisimde bir kişi bulunmamaktadır!");
		}
	}
	
	
	
	public void readTheTextFileAndPutTheHashMap() {
		try(BufferedReader reader=new BufferedReader(new FileReader("rehber.txt"))){
			
			String word=null;
			while((word=reader.readLine())!=null) {
				
				hshMap.put(readMain.wordFormattingForMapList(word)[0], readMain.wordFormattingForMapList(word)[1]);
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist. Please check the file name and try again!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("File reading error!");
			e.printStackTrace();
		}
	}
	
	public String[] wordFormattingForMapList(String word) { // Burada text içindeki veriyi hashmap e  uygun bir şekilde eklemek için veri formatını düzenleyecek bir metot yazdım.
		String[] str=word.split(";");
		String[] finalStr= {str[0].trim(),str[2].trim()};
		return finalStr;
	}
	
	public String getTheNameFromUser() { // Burada kullanıcıdan sorgulama için gerekli parametreleri aldım.
		System.out.println("Rehber arama bölümüne hoşgeldiniz!!");
		System.out.println("Lütfen telefon numarasını bulmak istediğiniz kişinin ismini giriniz: ");
		String name=scan.nextLine().trim().substring(0,1).toUpperCase();
		System.out.println("Lütfen telefon numarasını bulmak istediğiniz kişinin soyismini giriniz: ");
		String surName=scan.nextLine().trim().substring(0,1).toUpperCase();
		
		String finalWord=name+" "+surName;
		return finalWord;
		
	}
	
	

	public static void main(String[] args) {
		
		readMain.readTheTextFileAndPutTheHashMap();
		String searchWord= readMain.getTheNameFromUser();
		readMain.getTheResultOrThrowsException(searchWord);
    
		

	}

}
