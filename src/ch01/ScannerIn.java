package ch01;

import java.util.Scanner;

public class ScannerIn {
	public static String input(String s){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			s=in.next();
		}
		return s;
	}

}
