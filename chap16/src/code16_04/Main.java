package code16_04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<String>colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		for(String s : colors) {
			System.out.println(s + "→");
			
		}
		System.out.println("Iterator");
		Iterator<String> it = colors.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "→");
			
		}

	}

}
