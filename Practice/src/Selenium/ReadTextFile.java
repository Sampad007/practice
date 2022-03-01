package Selenium;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		//String Filepath= "D:\\Selenium Workspace\\Practice\\src\\test\\src\\data\\data.txt";
		String Filepath= "..\\Practice\\src\\test\\src\\data\\data.txt";
		
		@SuppressWarnings("resource")
		BufferedReader reader= new BufferedReader(new FileReader(Filepath));
		String data;
		
		System.out.println("Data from the file: ");
		while((data= reader.readLine())!=null) {
			System.out.println(data);
		}
	}

}
