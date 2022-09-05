package code15_08;

public class Main {

	public static void main(String[] args) {
		String s = "abc,def;ghi/jkl<mno";
		String w = s.replaceAll("[beh]", "X");
		System.out.print(w);

	}

}
