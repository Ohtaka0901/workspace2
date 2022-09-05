package kadai;

public class Hero extends Character {

	public Hero() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Hero(String name,int hp,int mp) {
		super(name,hp,mp);
	}

	@Override
	public void attack(Monster m) {
		if(this.getHp() <= 0) {
			System.out.println(this.getName() + "は動けない");
			return;
		}
		if(m.getHp() > 0) {
			System.out.println(this.getName() + "の攻撃");
			System.out.println(m.getName() + "に" + "10ダメージ");
			m.setHp(m.getHp()-10);
			if(m.getHp() <= 0) {
				System.out.println(m.getName() + "を倒した！");
			}
		}else {
			System.out.println(m.getName()+"はすでに倒している");
		}
	}

	@Override
	public void run() {
		System.out.println("勇者"+this.getName()+"は逃げ出した");
		System.out.println("勇者"+this.getName());
		System.out.println("HP:"+this.getHp());
		System.out.println("MP:"+this.getMp());
	}

}
