
public class DriverExample {

   public static void main(String[] args) {
      Driver driver=new Driver();
      bus bus = new bus();
      taxi taxi = new taxi();
      Vehicle vh = new Vehicle();
      
      driver.driver(bus);
      driver.driver(taxi);
      
      if(bus instanceof bus) {
    	  System.out.println("bus instanceof Bus.");
      }else {
    	  System.out.println("bus not instanceof Bus.");
    	    }
      if(bus instanceof Vehicle) {
    	  System.out.println("bus instanceof Bus.");
      }else {
    	  System.out.println("bus not instanceof Bus.");
      }
      if(vh instanceof Vehicle) {
    	  System.out.println("vh instanceof Bus.");
      }else {
    	  System.out.println("vh not instanceof Bus.");
   	}
   }
}
