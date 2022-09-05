package code15_10;

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
		
		long start = System.currentTimeMillis();
		//ここで何らかの時間がかかる処理
		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は．．．" + (end -start) + "ミリ秒でした");
		
	}

}
