package code15_09;

public class Main {

	public static void main(String[] args) {
		final String FORMAT = "%-9s %-13s 所持金%,6d";
		Hero hero = new Hero("minato","Hero",500);
		Hero witch = new Hero("asaka","Witch",4000);
		Hero sage = new Hero("sugawara","Sage",20000);

		String s = String.format(FORMAT, hero.getName(),hero.getJob(),hero.getGold());
		    System.out.println(s);
		    
		String s1 = String.format(FORMAT, witch.getName(),witch.getJob(),witch.getGold());
		    System.out.println(s1);
		    
		String s2 = String.format(FORMAT, sage.getName(),sage.getJob(),sage.getGold());
		    System.out.println(s2);

	}

}
