package code12_09;

public class Matango {
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に１０ポイントのダメージをあたえた！");
		m.hp -= 10;

 }
}
