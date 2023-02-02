package com.lockedme;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		FileService fs = new FileService();
		int n, ch;
		
		try (Scanner sc = new Scanner(System.in)) {
			do{
				System.out.println("1.Developer Details");
			    System.out.println("2.Menu");
			    System.out.println("3.exit");
			    ch=sc.nextInt();
			    if(ch==1)
			    {
			    	System.out.println("Develper Name: Kajol Thakur\nCohort Details: FSD 2022 DEC COHORT 3");
			    }
			    else if(ch==2)
			    {
			do {
				System.out.println("1.Add File");
				System.out.println("2.Delete File");
				System.out.println("3.Display File");
				System.out.println("4.Search File");
				System.out.println("5.exit");
				System.out.println("Enter Your Choice from 1 to 5");
				n = sc.nextInt();
				if(n==1)
				{
					String fileName;
					System.out.println("Enter File Name");
					fileName = sc.next();
					fs.addFile(fileName);
					System.out.println(fileName + " is inserted");
				}
				else if(n==2)
				{
					String fileName1;
					System.out.println("Enter File Name");
					fileName1 = sc.next();
					if (fs.deleteFile(fileName1)) {
						System.out.println(fileName1 + " is Deleted");
					} else {
						System.out.println(fileName1 + " is not found");
					}
				}
				else if(n==3)
				{   
					List<MyDir> files = fs.getFiles();
					for (MyDir f : files) {
						System.out.println(f.getId() + "\t" + f.getfileName());
					}
				}
				else if(n==4)
				{
					String fileName2;
					System.out.println("Enter file name: ");
					fileName2 = sc.next();
					if (fs.search(fileName2)) {
						System.out.println(fileName2 + " is present in this folder ");
					} else {
						System.out.println(fileName2 + "is not present in this folder");
					}
				}
				else if(n==5)
				{
					break;
				}
				else
				{
					System.out.println("you enter wrong choice\npleace choose from 1 to 5 ");
				}
				
			} while (true);}
			else if(ch==3) {
				break;
			}
			else
			{
				System.out.println("you enter wrong choice\npleace choose from 1 to 3 ");
			}
			}while(true);
		}
	}
}
