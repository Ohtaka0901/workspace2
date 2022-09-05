package code16_02;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	
    public static void main(String[] args) {
      ArrayList<String> names = new ArrayList<String>();
      names.add("湊");
      names.add("朝香");
      names.add("菅原");
      Iterator<String> it = names.iterator();
      while (it.hasNext()) {
      String e = it.next();
      System.out.println(e);
      
    }
      System.out.println("通常のfor文");
      for(int i = 0; i < names.size(); i++) {
    	  System.out.println(names.get(i));
      }
      System.out.println("拡張for文");
      for(String i: names) {
    	  System.out.println(i);
    	  
  }
 }
}

