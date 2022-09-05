package code17_02;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
	        fw.write("hello");
		}catch (Exception e) {  
			System.out.println("何らかの例外が 発生しました");
	    }finally {
	    	try {
	    	fw.close();
	    	}catch (IOException e) {
	    		
	  }
    }
  }
}