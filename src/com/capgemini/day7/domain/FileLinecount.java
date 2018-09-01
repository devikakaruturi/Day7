package com.capgemini.day7.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileLinecount {

	public static int LineCount() {
		// TODO Auto-generated constructor stub
		
			File file=new File("C:\\devika\\devika.txt");
			int count=0;
			
			try(FileReader readfile=new FileReader(file);
					BufferedReader reader = new BufferedReader(readfile))
			{
			
			while (reader.readLine() != null)
			{
				
				count++;
			}
			System.out.println(count);
			return count;
			}
			
			catch (Exception e)
			{
				e.printStackTrace();
			}
			return count;
			
	


	}

}
