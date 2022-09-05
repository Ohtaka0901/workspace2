package code12_09;

public class Goblin {
    public void attack(Goblin g) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に１０ポイントのダメージをあたえた！");
	    g.hp -= 10;

 }
}
