package com.capgemini.day7.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Filewordcount {

	public static int wordCount() {
		// TODO Auto-generated method stub
				File file=new File("C:\\devika\\devika.txt");
				int count=1;
				
				try(FileReader readfile=new FileReader(file);
				BufferedReader reader = new BufferedReader(readfile))
				{
				
				String word=null;
				while ((word = reader.readLine()) != null)
				{
					for(int i=0;i<word.length();i++)
						if(word.charAt(i)==' ')
						{
							count++;
						}
				}
				System.out.println(count);
				}
				
				catch (Exception e)
				{
					e.printStackTrace();
				}
				return count;

		}
	}
	

