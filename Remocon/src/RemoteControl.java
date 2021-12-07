
public interface RemoteControl {
		//1. 필드가 없다.(변수가 없다). 상수선언가능(사실상 변수)
	int MAX_VOLUME=10; 
	int MIN_VOLUME=0;
	  //<- 상수
		//2. 생성자가 없다. -> new 연산자를 사용할 수 없다.
		//3. 메소드만 있다.(상수 필드/추상메소드/default메소드/정적메소드)
	abstract void turnOn(); //abstract method//abstract 써도 되고 안써도되고
	void turnOff();		// 본체가 없으므로 추상메소드
	void setVolume(int volume);
	 default void setMute(boolean mute) { // 일반 클래스의 일반 메소드
		if(mute) {
			System.out.println("무음처리합니다.");
		} else {
			System.out.println("무음해제합니다.");
		}
	}
	static void changeBettery() { //static method(정적)
		System.out.println("건전지를 교체합니다");
	}
}
