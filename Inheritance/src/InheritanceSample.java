
public class InheritanceSample {

	public static void main(String[] args) {
		Truck scania=new Truck();
		
		scania.company="volvo";
		scania.color="brown";
		scania.model="xxxx";
		scania.nMaxSpeed=120;
		
		scania.drive(40);
		System.out.println("cureent Speed:"+scania.nSpeed);
		scania.stop();
		
		Limousine alpha=new Limousine();
		alpha.company="Ford";
				alpha.color="white";
		alpha.model="ford Alpah one";
		alpha.nMaxSpeed=220;
		alpha.nSpeed=0;
		alpha.drive(60);
		alpha.stop();
		
		Car avante=new Car();
		avante.company="Hyundai";
		avante.color="black";
		avante.model="Avante N";
		avante.nMaxSpeed=280;
		avante.nSpeed=0;
		avante.drive(80);
		avante.stop();
		
	}

}
