
public class CellPhone extends Phone {

	public CellPhone(String owner){
			super(owner);
		}
		
		public void YoutubeSearch() {
			System.out.println("��Ʃ�� �˻��� �մϴ�.");
		}
		@Override
		public void turnOn() {
			System.out.println("���ѷ��� ������ �մϴ�.");
		}
		@Override
		public void turnOff() {
			System.out.println("���ѷ��� ������ ���ϴ�.");
		}
}
