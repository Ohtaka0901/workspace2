package code17_01;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try {
      FileWriter fw = new FileWriter("data.txt");
      fw.close();
      int[] array = new int[3];
      array[4] = 10;
      /* : */
    } catch(IOException | NullPointerException e) {
      System.out.println("エラーが発生しました。");
    }catch (ArrayIndexOutOfBoundsException e){
    	System.out.println("スタックトレース表示\n" + e.getMessage());
    	e.printStackTrace();
    	
    }
  }
}