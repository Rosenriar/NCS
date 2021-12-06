public class Tire {

   int maxRotation;   //   최대 회전횟수
   int pastRotation;   //   누적 회전횟수
   String location;   //   타이어 위치
   
   public Tire() {
   }

   public Tire(int maxRotation, String location) {
      this.maxRotation = maxRotation;
      this.location = location;
   }
   
   boolean roll() {
      ++pastRotation;
      if(pastRotation < maxRotation) {
         System.out.println("Tire 남은 수명: "+(maxRotation - pastRotation)+"회");
         return true;   //   최대 회전수보다 적게 주행
      } else {
         System.out.println(this.location+" 타이어 펑크!");
         return false;   //   최대 회전수 초과
      }
   }
   
}