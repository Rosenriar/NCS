public class InheritanceSample {
   
   public static void main(String[] args) {
      
      Car car = new Car();
      
      for(int i = 0; i < 5; i++) {
         int punk = car.run();
         switch(punk) {
         case 1:   //   �� ����
            System.out.println("�� ���� �ѱ�Ÿ�̾�� ��ü!");
            //�ڵ�����ȯ (����->�θ�Ŭ����)
            car.tires[punk-1] = new Hankooktire(15,"�� ����");  
            break;
         case 2:   //   �� ������
            System.out.println("�� ������ ��ȣŸ�̾�� ��ü!");
            car.tires[punk-1] = new KumhoTire(13,"�� ������");
            break;
         case 3:   //   �� ����
            System.out.println("�� ���� �ѱ�Ÿ�̾�� ��ü!");
            car.tires[punk-1] = new Hankooktire(14,"�� ����");
            break;
         case 4:   //   �� ������
            System.out.println("�� ������ ��ȣŸ�̾�� ��ü!");
            car.tires[punk-1] = new KumhoTire(17,"�� ������");
         }
         System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
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
