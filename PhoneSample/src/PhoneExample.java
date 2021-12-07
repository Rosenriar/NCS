
public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone("홍길동"); 
		// 추상클래스로는 new 연산자로 이용해서 인스턴스 변수를 생성 불가능
		SmartPhone smartPhone= new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.search();
		smartPhone.InternetSearch();
		smartPhone.turnOff();
		
		
		CellPhone cellPhone = new CellPhone("홍길순");
		cellPhone.turnOn();
		cellPhone.YoutubeSearch();
		cellPhone.turnOff();
	}

}
