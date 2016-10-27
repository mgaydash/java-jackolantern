package com.mgaydash;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Jack {
	public void run(){
		//AnsiConsole
		File file = new File("jack.txt");
		ArrayList<String> strAr = new ArrayList<String>();
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext()){
				strAr.add(scanner.nextLine());
			}
			scanner.close();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("dfjdlf");
	}
}
