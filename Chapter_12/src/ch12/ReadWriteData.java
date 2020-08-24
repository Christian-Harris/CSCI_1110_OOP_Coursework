/*
 * Christian Harris
 * 24 August 2020
 */
package ch12;

import java.io.*;
import java.lang.Math;
import java.util.*;

public class ReadWriteData {
	  public static void main(String[] args) throws java.io.IOException {
	    
		//Create file object.
		File file = new File("Exercise12_15.txt");
		
		//Create a new file "Exercise12_15.txt" and a PrintWriter object attached to it.
		java.io.PrintWriter output = new java.io.PrintWriter(file);

		//Write 100 random integers between 0 and 99 writing them to file and separating them by a single whitespace character.
	    for(int i = 0; i < 100; i++) {
	    	output.print((int)(Math.random()*100));
	    	output.print(" ");
	    }
	    
	    //Close the PrintWriter
	    output.close();
	    
	    //Create a Scanner object and attach it to the file.
	    Scanner reader = new Scanner(file);
	    
	    //Create an arraylist of Integers and store the contents of the file into this list.
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    int n;
	    while(reader.hasNext()) {
	    	n = reader.nextInt();
	    	list.add(n);
	    }
	    
	    //Using the Collections class we sort the list.
	    Collections.sort(list);
	    
	    //Display the contents of the sorted list onto the console.
	    for(int i = 0; i < list.size(); i++) {
	    	System.out.println(list.get(i));
	    }
	    
	    //Close the Scanner object.
	    reader.close();
	  }
}
