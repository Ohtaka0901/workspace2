package code12_07;

import code12_09.Hero;

public class Main {

	public static void main(String[] args) {
		Character[] c = new Character[5];
		c[0] = new Hero();
		c[1] = new Hero();
		c[2] = new Thief();
		c[3] = new Wizard();
		c[4] = new Wizard();
		//宿屋に泊まる
		for(Character ch : c) {
			ch.hp += 50;
			System.out.println(ch.hp);
			
	}
  }
}
