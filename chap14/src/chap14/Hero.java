package chap14;

public class Hero {
	public static int money;
	public String name;
	public int hp;

   public boolean equals(Object o) {
	   if(this == o) {return true;}
	   if(o instanceof Hero ) {
	   Hero h = (Hero)o;
	   if(this.name.equals(h.name)) {
		   
	   }
	}
	   return false;
	   
   }
 }
 