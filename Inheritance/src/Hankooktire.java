public class Hankooktire extends Tire {

   public Hankooktire(int maxRotation, String location) {
      super(maxRotation, location);
      
   }
   @Override
   public boolean roll() {
      ++pastRotation;
      if(pastRotation < maxRotation) {
         System.out.println("한국타이어 남은 수명: "+(maxRotation - pastRotation)+"회");
         return true;   //   최대 회전수보다 적게 주행
      } else {
         System.out.println(this.location+" 한국타이어 펑크!");
         return false;   //   최대 회전수 초과
      }
   }
   
}
