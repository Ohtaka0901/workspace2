
public abstract class Character {
	public String name;
	public int hp;
	public int mp;
	 public Character() {
	 }
	 public Character(String name,int hp,int mp) {
		 this.name = name;
		 this.hp = hp;
		 this.mp = mp;
		 
	 }
	 public abstract void attack(Monster m);
	 public abstract void run();
	 
	 
	 }
