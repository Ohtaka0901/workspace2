
public abstract class Monster {

		String name;
		int hp;
		int mp;
		
		public Monster() {
			this("正体不明");
		}
		public Monster (String name) {
			this.name = name;
			this.hp = 100;
			this.mp = 20;
		}
		public abstract void attack (Character c );
		public abstract void run();
		
		// TODO 自動生成されたコンストラクター・スタブ
	}


