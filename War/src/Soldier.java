
public class Soldier {
	private int AP; //최대공격력
	private int HP;
	
	public Soldier(){
		
	}
	public Soldier(int AP, int HP) {
		this.AP = AP;
		this.HP = HP;
	}
	public int getAP() {
		return AP;
	}
	public int getHP() {
		return HP;
	}
	public void setAP(int AP) {
		this.AP = AP;
	}
	public void setHP(int AP) {
		this.HP -= AP;
		System.out.println("병사의 남은 체력:"+this.HP);
	}
	public void attack(Warrior w) {
		int attackPoint=(int)(Math.random()*this.AP);
		System.out.println("병사의 공격력 : "+attackPoint);
		this.setHP(attackPoint);
		if(attackPoint==0) {
			System.out.println("병사 miss!");
		}
		else if(attackPoint==15) {
			System.out.println("병사 critical!");
		}
	}
}
