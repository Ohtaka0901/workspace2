package code15_09;

public class Hero {
	String name;
	String job;
	int gold;
	public Hero() {

	}
	public Hero(String name, String job,int gold) {
		this.name = name;
		this.job = job;
		this.gold = gold;

	}

	public String getName() {
		return this.name;
	}

	public String getJob() {
		return this.job;
	}

	public int getGold() {
		return this.gold;
	}
}
