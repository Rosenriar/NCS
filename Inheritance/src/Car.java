public class Car {
   
	Tire[] tires =	 {	
			new Tire(6,"�� ����"),
  			new Tire(2,"�� ������"),
  			new Tire(3,"�� ����"),
  			new Tire(4,"�� ������")
};
	
//   Tire frontLeft;
//   Tire frontRight;
//   Tire backLeft;
//   Tire backRight;
//   
   public Car() {}

//      frontLeft = new Tire(6,"�� ����");
//      frontRight = new Tire(2,"�� ������");
//      backLeft = new Tire(3,"�� ����");
//      backRight = new Tire(4,"�� ������");
//   }

   void stop() {
      System.out.println("�ڵ����� ����ϴ�...");
   }
   
   int run(){
      System.out.println("�ڵ����� �޸��ϴ�..!");

      	for(int i=0; i<tires.length; i++) {
      		if(!tires[i].roll()) {stop(); return i+1;}
      	}
      		return 0;
   }
}
//      if(!tires[0].roll()==false) {
//         stop();
//         return 1;
//      }
//      if(!tires[1].roll()==false) {
//         stop();
//         return 2;
//      }
//      if(tires[2].roll()) {
//         stop();
//         return 3;
//      }
//      if(!tires[3].roll()) {
//         stop();
//         return 4;
//      }
//      return 0;
//   }
//	String company;
//	String model;
//	String color;
//	int nMaxSpeed;
//	int nSpeed;
//	public Car() {
//		this.color="green";
//	}
//
//	public Car(String company, String model, String color,
//			int nMaxSpeed, int nSpeed) {
//		this.company = company;
//		this.model = model;
//		this.color = color;
//		this.nMaxSpeed = nMaxSpeed;
//		this.nSpeed = nSpeed;
//	}
//	 void drive(int speed) {
//		this.nSpeed=speed;
//	}
//	void stop() {
//		this.nSpeed=0;
//	}

