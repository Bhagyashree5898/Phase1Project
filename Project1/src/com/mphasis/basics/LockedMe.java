package com.mphasis.basics;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LockedMe {
public static void main(String[] args) throws IOException {
String path="D:\\PhaseProject\\";
File f=new File(path);
Scanner sc=new Scanner(System.in);

ArrayList<String> al=new ArrayList<>();
Boolean c = true;
System.out.println("**********************************************************************************************");
System.out.println("....................................Welcome to LockedMe.com..................................");
System.out.println("*Please be careful to ensure the correct file name provided for Adding and Deleting files*");
System.out.println("**********************************************************************************************");


while(c) 	
{
	System.out.println("For Displaying the files: 1\nFor Adding, Deleting, and Searching the files: 2\nExit Program: 3\n");
	Integer choice =sc.nextInt();
	boolean loopTerminated = true;
	
	switch(choice){
	
	case 1:	
		
		System.out.println("Display all the files");
		File filename[]=f.listFiles();
		for(File ff:filename) {
			System.out.println(ff.getName());
		}
		System.out.println("The collection of files is "+al);
		break;
			    
	case 2:
		while(loopTerminated)
		{
		System.out.println("\n1.Inner Menu Add file");
        System.out.println("2.Inner Menu Delete file");
        System.out.println("3.Inner Menu Search file");
        System.out.println("4.Go to Main Menu\n");

        System.out.print("Please enter your choice : ");
        Integer choice2 =sc.nextInt();
        
        switch(choice2)
        {
   
        case 1:
	       
	        	System.out.println("Enter the file name to create");
	    		String filename1=sc.next();
	    		String finalname=path+filename1;
	    		//System.out.println(finalname);
	    		File f1=new File(finalname);
	    		boolean b=f1.createNewFile();
	    		if(b!=true) {
	    			System.out.println("The file not created");
	    			break;
	    			
	    		}
	    		else {
	    			al.add(filename1);
	    			System.out.println("File created at "+finalname+" location\n");
	    			System.out.println("The collection of files is "+ al);
	    			
	    		}
	    		break;
	    		
	        case 2:
				System.out.println("Enter the file name to be deleted");
				String filname=sc.next();
				String finalfile=path+filname;
				File file=new File(finalfile);
				file.delete();
				System.out.println("File deleted");
				System.out.println("The collection of files is "+ al);
				break;
				
			case 3:
				System.out.println("Enter the file name to search");
				String filsearchname=sc.next();
				String filepath =path+filsearchname;
				File filename2[]=f.listFiles();
				int flag=0;
				for(File ff:filename2) {
					if(ff.getName().equals(filsearchname)) {
						flag=1;
						break;
					}
					else {
						flag=0;
					}	
				}
	
				if(flag==1) {
					System.out.println("File is found at"+filepath+"location\n");
				}
				else {
					System.out.println("File is not found\n");
				}
			    break;
			  
				case 4:
			
				System.out.println("Main menu");
				loopTerminated =false;
				break;
        	}
			}
	
				
	case 3:System.out.println("Exit");
			//c= false;
			break;
			
	    default:
	     System.out.println("Invalid option");
	     break;
		}
	}
}
}
