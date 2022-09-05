package code15_05_02;

public class Main2 {

	public static void main(String[] args) {
		String s = "Java";
		System.out.println(s.matches("Java"));
		System.out.println(s.matches("JavaJava"));
		System.out.println("J".matches("Ja*"));
		
		if(isVaildPlayerName("MINATO01")) {
			System.out.println("正しい記述です");
		}else {
			System.out.println("記述が間違っています");
		}
	}
		public static boolean isVaildPlayerName(String name){
			return name.matches("[A-Z][A=Z0-9]{7}");
		}
		
}
