
public class Battle {

	public static void main(String[] args) {
		Soldier commando=new Soldier(10,150);
		Warrior conan=new Warrior(15,120);
		
		System.out.println("War started");
		while(commando.getHP()>0
			 && conan.getHP()>0) {
			
			try {// ���⼭ 0��1 ���߿� �ϳ��� �����߻���Ű�� �ڵ�
				int turn =(int)(Math.random()*2);
				switch(turn) {
				case 1:
					commando.attack(conan);
					Thread.sleep(500);
					
				case 2:
				conan.attack(commando);
				Thread.sleep(500);
				}
//			if(turn==1) {
//				commando.attack(conan);
//				Thread.sleep(500);
//			}else { 
//				conan.attack(commando);
//				Thread.sleep(500);
//			}
			}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		if(commando.getHP()>conan.getHP()) {
	         System.out.println("�ڸ����� �̰���ϴ�(���� ��)");
	      }else if(commando.getHP()<conan.getHP()) {
	         System.out.println("�ڳ��� �̰���ϴ� (���� ��)");
	      }else {
	         System.out.println("�Ѵ� �׾����ϴ�.");
	      }
	}


}
