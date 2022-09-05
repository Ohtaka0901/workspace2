package kadai2;

public class Main {
	public static void main(String[] args) {
		Kouza[] k = new Kouza[2];
		k[0] = new Kouza("123-45678".100000);
		k[1] = new Kouza("456-7890".50000);
		Uketsuke u = new Uketsuke();
		FurikomiYoushi fy = new FurikomiYoushi("123-45678","456-7890");
		
		if(u.furikomi(fy.k)) {
			System.out.println("振込しました");
		}else {
			
			
			
		}
	}

}
