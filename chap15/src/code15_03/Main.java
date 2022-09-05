package code15_03;

public class Main {

	public static void main(String[] args) {
		String s1 = "Java programming";
		System.out.println("文字列s1の4文字目は" + s1.charAt(3));
		System.out.println("文字列1の4文字目以降は "+ s1.substring(3));
		//a programming
		System.out.println("文字列1の4～8文字目は "+ s1.substring(3,8));
		//a pro
		
		String s2 = s1.toLowerCase();
		if(s2.contains("Java")) {
			System.out.println(s2);
			System.out.println("文字列s1は、大文字小文字いずれかを含むJavaという文字を含んでいます");
			
		}
	}
}
