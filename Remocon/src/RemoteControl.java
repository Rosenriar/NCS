
public interface RemoteControl {
		//1. �ʵ尡 ����.(������ ����). ������𰡴�(��ǻ� ����)
	int MAX_VOLUME=10; 
	int MIN_VOLUME=0;
	  //<- ���
		//2. �����ڰ� ����. -> new �����ڸ� ����� �� ����.
		//3. �޼ҵ常 �ִ�.(��� �ʵ�/�߻�޼ҵ�/default�޼ҵ�/�����޼ҵ�)
	abstract void turnOn(); //abstract method//abstract �ᵵ �ǰ� �Ƚᵵ�ǰ�
	void turnOff();		// ��ü�� �����Ƿ� �߻�޼ҵ�
	void setVolume(int volume);
	 default void setMute(boolean mute) { // �Ϲ� Ŭ������ �Ϲ� �޼ҵ�
		if(mute) {
			System.out.println("����ó���մϴ�.");
		} else {
			System.out.println("���������մϴ�.");
		}
	}
	static void changeBettery() { //static method(����)
		System.out.println("�������� ��ü�մϴ�");
	}
}
