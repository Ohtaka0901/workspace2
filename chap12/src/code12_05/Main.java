package code12_05;

public class Main {

	public static void main(String[] args) {
		Slime s = new Slime(); 
		Slime m = new Slime();
		
		s.run(); 
		m.run();
		
		if (m instanceof Slime) {
			s = (Slime)m;
			s.run();
			
		m = new Slime();
		if (m instanceof Slime) {
			s = (Slime)m;
			s.run();
			
	  }
	}
  }
}
