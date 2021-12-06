public class InheritanceSample {
   
   public static void main(String[] args) {
      
      Car car = new Car();
      
      for(int i = 0; i < 5; i++) {
         int punk = car.run();
         switch(punk) {
         case 1:   //   앞 왼쪽
            System.out.println("앞 왼쪽 한국타이어로 교체!");
            //자동형변환 (지식->부모클래스)
            car.tires[punk-1] = new Hankooktire(15,"앞 왼쪽");  
            break;
         case 2:   //   앞 오른쪽
            System.out.println("앞 오른쪽 금호타이어로 교체!");
            car.tires[punk-1] = new KumhoTire(13,"앞 오른쪽");
            break;
         case 3:   //   뒤 왼쪽
            System.out.println("뒤 왼쪽 한국타이어로 교체!");
            car.tires[punk-1] = new Hankooktire(14,"뒤 왼쪽");
            break;
         case 4:   //   뒤 오른쪽
            System.out.println("뒤 오른쪽 금호타이어로 교체!");
            car.tires[punk-1] = new KumhoTire(17,"뒤 오른쪽");
         }
         System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
      }
   }

}
//		Truck scania=new Truck();
//		
//		scania.company="volvo";
//		scania.color="brown";
//		scania.model="xxxx";
//		scania.nMaxSpeed=120;
//		
//		scania.drive(40);
//		System.out.println("cureent Speed:"+scania.nSpeed);
//		scania.stop();
//		
//		Limousine alpha=new Limousine();
//		alpha.company="Ford";
//				alpha.color="white";
//		alpha.model="ford Alpah one";
//		alpha.nMaxSpeed=220;
//		alpha.nSpeed=0;
//		alpha.drive(60);
//		alpha.stop();
//		
//		Car avante=new Car();
//		avante.company="Hyundai";
//		avante.color="black";
//		avante.model="Avante N";
//		avante.nMaxSpeed=280;
//		avante.nSpeed=0;
//		avante.drive(80);
//		avante.stop();
//		
//	}
//
//}
