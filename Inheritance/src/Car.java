
public class Car {
	String company;
	String model;
	String color;
	int nMaxSpeed;
	int nSpeed;
	public Car() {
		this.color="green";
	}

	public Car(String company, String model, String color,
			int nMaxSpeed, int nSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.nMaxSpeed = nMaxSpeed;
		this.nSpeed = nSpeed;
	}
	 void drive(int speed) {
		this.nSpeed=speed;
	}
	void stop() {
		this.nSpeed=0;
	}
}
