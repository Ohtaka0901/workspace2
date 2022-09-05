package code12_06;

import code12_09.Hero;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		Theif t1 = new Thief();
		Wizard w1 = new Wizard();
		Wizard w2 = new Wizard();
		//冒険開始！
		//まず宿屋に泊まる
		h1.hp += 50;
		System.out.println(h1.hp);
		h2.hp += 50;
		System.out.println(h2.hp);
		t1.hp += 50;
		System.out.println(t1.hp);
		w1.hp += 50;
		System.out.println(w1.hp);
		w2.hp += 50;
		System.out.println(w2.hp);
		
	}
}
