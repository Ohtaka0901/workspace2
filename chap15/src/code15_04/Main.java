package code15_04;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println("StringBuilder処理開始");
		for(int i = 0; i < 30000; i++) {
			sb.append("Java");
		}
		String s = sb.toString();
		System.out.println("StringBuilder処理終了");
		System.out.println("+演算子処理開始");
		s = "Java";
		for(int i = 0; i < 30000; i++) {
			s += "Java";
		}
		System.out.println("+演算子処理終了");
	}

}
