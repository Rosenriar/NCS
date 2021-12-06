
public class DriverExample {

   public static void main(String[] args) {
      Driver driver=new Driver();
      bus bus = new bus();
      taxi taxi = new taxi();
      
      driver.driver(bus);
      driver.driver(taxi);
   	}
   }
