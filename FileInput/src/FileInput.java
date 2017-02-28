//Cara Ip APCS 1st period
//File Input Project from Lecture
// 23 February 2017

import java.io.*;     // for File
import java.util.*;   // for Scanner

public class FileInput {
	    public static void main(String[] args) throws FileNotFoundException {
	        Scanner input = new Scanner(new File("./Desktop/weather.txt"));
	        double num = input.nextDouble();
	        while (input.hasNextDouble()) {
	        	double newNum = input.nextDouble();
	        	System.out.println("change = " + (num-newNum));
	        	newNum = num;
	    }
	        input.close();
	}



}