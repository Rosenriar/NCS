
public abstract class Phone {
	public String owner;
	
	public Phone (String owner) {
		this.owner=owner;
	}
	public void search() {
		System.out.println("�˻��մϴ�.");
	}
//	public void turnOff() {
//		System.out.println("�� ������ ���ϴ�.");
//	}	
	
	public abstract void turnOn(); 
	public abstract void turnOff();
//1.  �߻� �����ϴ� ���� : �̸��ڵ��ϰ� �Ⱦ��� ��� ����(�ָ����� Override) 
//2, abstract(�߻�)������ ���ϸ� ����Ҽ��� ����.
//3. �߻� �޼ҵ� �� Overriding
//4. �߻�Ŭ����<=�߻�޼ҵ弱��<-�������̵��� �δ����.
}
