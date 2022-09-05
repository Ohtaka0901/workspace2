
public abstract class Hero extends Character {

	public Hero() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public Hero(String name,int hp, int mp) {
		super(name.hp,mp);
	}
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃");
		System.out.println(m.getName() + "に" + "10のダメージ");
		m.setHp(m.getHp()-10);
	}
	public void run() {
		System.out.println("勇者" + this.getName() + "は逃げ出した"); 
	}

}
