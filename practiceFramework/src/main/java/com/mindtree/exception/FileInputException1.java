package com.mindtree.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputException1 {
	public static void fileNotFoundException(FileNotFoundException e) {
		System.out.println("error in the file");
	}
	public static void exception(IOException e) {
		System.out.println("Exception occured"+e);
		
	}


}
