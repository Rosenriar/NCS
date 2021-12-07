
public abstract class Phone {
	public String owner;
	
	public Phone (String owner) {
		this.owner=owner;
	}
	public void search() {
		System.out.println("검색합니다.");
	}
//	public void turnOff() {
//		System.out.println("폰 전원을 끕니다.");
//	}	
	
	public abstract void turnOn(); 
	public abstract void turnOff();
//1.  추상 선언하는 이유 : 미리코딩하고 안쓰고 놀리지 말자(주목적은 Override) 
//2, abstract(추상)선언을 안하면 사용할수가 없다.
//3. 추상 메소드 와 Overriding
//4. 추상클래스<=추상메소드선언<-오버라이딩을 부담없이.
}
