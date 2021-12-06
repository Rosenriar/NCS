//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Order {
//
//   ArrayList<String> mobile;
//   ArrayList<String> name;
//   ArrayList<Integer> qty;
//   ArrayList<Integer> sum;
//   Order(){
//      mobile = new ArrayList<String>();
//      name = new ArrayList<String>();
//      sum = new ArrayList<Integer>();
//      qty = new ArrayList<Integer>();
//   }
//   void add(String new_menu, int new_qty,int new_sum) {
//      
//      this.name.add(new_menu);
//      this.qty.add(new_qty);
//      this.sum.add(new_sum);
//      }
//
//   void remove(int menu_num) {
//
//      name.remove(menu_num-1);
//      qty.remove(menu_num-1);
//      sum.remove(menu_num-1);
//   }
//   void update(int menu_num,String menu, int qt,int new_sum) {
//      
//      this.name.set(menu_num-1, menu);
//      this.qty.set(menu_num-1, qt);
//      this.sum.set(menu_num-1, new_sum);
//   }
//   void display1() {
//      int st_ndx=this.mobile.size();
//      int k=0;
//      for(int i=st_ndx;i<this.name.size();i++,k++) {
//         System.out.println((k+1)+
//               " 메뉴명 : "+this.name.get(i)+" 수량 : "+this.qty.get(i)+
//               " 총액 : "+this.sum.get(i));
//      }int all_sum=0;
//      for(int j=st_ndx;j<this.sum.size();j++) {
//         all_sum+=this.sum.get(j);
//      }
//      System.out.println("총 가격 : "+all_sum);
//   }
//   void display(String mobile) {
//      int start_ndx=this.mobile.size();
//      for(int i=this.mobile.size();i<this.name.size();i++) {
//         this.mobile.add(mobile);   
//      }
//      
//      for(int i=start_ndx;i<this.name.size();i++) {
//         System.out.println((i+1)+" 번호 : " +this.mobile.get(i)+
//               " 메뉴명 : "+this.name.get(i)+" 수량 : "+this.qty.get(i)+
//               " 총액 : "+this.sum.get(i));
//      }int all_sum=0;
//      for(int j=start_ndx;j<this.sum.size();j++) {
//         all_sum+=this.sum.get(j);
//      }
//      System.out.println("총 가격 : "+all_sum);
//   }
//   void all_display() {
//      for(int i=0;i<this.name.size();i++) {
//         System.out.println((i+1)+" 번호 : " +this.mobile.get(i)+
//               " 메뉴명 : "+this.name.get(i)+" 수량 : "+this.qty.get(i)+
//               " 총액 : "+this.sum.get(i));
//      }int all_sum=0;
//      for(int j=0;j<this.sum.size();j++) {
//         all_sum+=this.sum.get(j);
//      }
//      System.out.println("총 가격 : "+all_sum);
//   }
//   void guide() {
//      System.out.println("A:주문 추가, R:주문삭제, U:주문수정, T:주문내역 보기 Q:전체 주문내역 보기 \nG:주문 완료 및 번호입력 X:뒤로가기");
//   }
//   void Handling(Menu menu){
//      menu.display();
//      this.guide();
//      Scanner cafe=new Scanner(System.in);   
//      String st=cafe.nextLine();
//      while(!st.equals("X")) {
//         if(st.equals("A")) {
//            Scanner ms=new Scanner(System.in);
//            System.out.print("메뉴번호를 입력하시오 : ");
//            int new_menu_num=ms.nextInt();
//            String menu_name=menu.alMenu.get(new_menu_num-1);
//            int menu_price=menu.alPrice.get(new_menu_num-1);
//            System.out.print("수량을 입력하시오 : ");
//            int new_qty=ms.nextInt();
//            int new_sum=menu_price*new_qty;
//            this.add(menu_name, new_qty, new_sum);
//            System.out.println("현재 주문내역\n"+
//                  " 메뉴명 : "+menu_name+" 수량 : "+new_qty+
//                  " 총액 : "+new_sum);
//         }
//         else if(st.equals("R")) {
//            Scanner ms=new Scanner(System.in);
//            this.display1();
//            System.out.print("삭제할 주문번호를 입력하시오 : ");
//            int menu_num=ms.nextInt();
//            this.remove(menu_num);
//         }
//         else if(st.equals("U")) {
//            this.display1();
//            Scanner ms=new Scanner(System.in);
//            System.out.print("수정할 주문번호를 입력하시오 : ");
//            int menu_num=ms.nextInt();
//            menu_num=menu_num+this.mobile.size();
//            menu.display();
//            System.out.print("수정할 메뉴번호를 입력하시오 : ");
//            int up_menu_num=ms.nextInt();
//            String up_menu_name=menu.alMenu.get(up_menu_num-1);
//            int up_menu_price=menu.alPrice.get(up_menu_num-1);
//            System.out.print("수정할 수량을 입력하시오 : ");
//            int up_qty=ms.nextInt();
//
//            
//            int up_sum = up_menu_price*up_qty;
//            this.update(menu_num, up_menu_name, up_qty,up_sum);
//            System.out.println("수정된 주문내역 \n번호 : "+
//                  " 메뉴명 : "+up_menu_name+" 수량 : "+up_qty+
//                  " 총액 : "+up_sum);
//         }
//         else if(st.equals("T")) {
//            this.display1();
//         }
//         else if(st.equals("G")) {
//            Scanner ms=new Scanner(System.in);
//            this.display1();
//            System.out.print("모바일 번호를 입력하시오 : ");
//            String new_mobile=ms.next();
//            this.display(new_mobile);
//         }
//         else if(st.equals("Q")) {
//            this.all_display();
//         }
//         menu.display();
//         this.guide();
//         st=cafe.nextLine();
//         
//      }
//   }
//}import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class Order {
   //모바일(mobile) 메뉴명(name) , 수량(qty), 총액(sum) - 필드
	private ArrayList<String> alMenu;
	private ArrayList<String> alMobile;
	private ArrayList<Integer> alQty;
	private ArrayList<Integer> alSum;
	private Scanner s;
   // 초기화
 public  Order(){
      this.alMobile=new ArrayList<String>();
      this.alMenu=new ArrayList<String>();
      this.alQty=new ArrayList<Integer>();
      this.alSum=new ArrayList<Integer>();
      this.s=new Scanner(System.in);
   }
 private void add(String menu,int qty, int sum) {
      this.alMenu.add(menu);
      this.alQty.add(qty);
      this.alSum.add(sum);
   }
 private void remove(int ndx) {
      ndx--;
      this.alMobile.remove(ndx);
      this.alMenu.remove(ndx);
      this.alQty.remove(ndx);
      this.alSum.remove(ndx);
   }
 private void update(int ndx, String mobile, String menu, int qty, int price) {
      ndx--;
      this.alMobile.set(ndx, mobile);
      this.alMenu.set(ndx, menu);
      this.alQty.set(ndx, qty);
      this.alSum.set(ndx, qty*price);
   }
 public void display() {
      for(int i=0; i<this.alMenu.size(); i++) { //i<this.al~~~.size(); 길이는 다 똑같아서 뭘 해도 된다.
         System.out.println(this.alMobile.get(i)+","+this.alMenu.get(i)+","
               +this.alQty.get(i)+","+this.alSum.get(i));
      }
   //추문추가 (add) <= 메뉴명,수량
   //주문삭제 (remove)
   //주문수정 (update)
   //주문표시 (display)
   }
 private void guide() {
      System.out.println("주문관리(X:종료,C:주문추가,U:주문수정,D:주문삭제)");
   }
 public void Handling(Menu menu) {
        int menu_num=this.getInput(menu); //222번 get input을 호출
          while(menu_num!=0) {
             System.out.println("메뉴의 수량을 입력하시오");
             int qty=Integer.parseInt(this.s.nextLine()); //qty 숫자로 입력받음
             menu_num--; //메뉴번호 -> 인덱스 변호 변환
             this.add(menu.getAlMenu(menu_num), qty,menu.getAlPrice(menu_num)*qty);
             this.showOrder(); //217라인 showOrder를 호출
             
             menu_num=this.getInput(menu); // 222라인 getInput<<호출
          }
          
         int start_ndx=this.addMobile(); //228라인 addMobile호출
          int total=0;
          for(int i=start_ndx;i<this.alMenu.size();i++) {
             System.out.println(this.alMobile.get(i)+","+this.alMenu.get(i)+",x"+
                            this.alQty.get(i)+","+this.alSum.get(i));
             total+=this.alSum.get(i);
             System.out.println("총 주문 금액:"+total);
             System.out.println("----------------------------");
          }
   }
 private void showOrder() {  //현재메뉴/이름/수량/총액 표시                    202번에서 호출함
      int n=this.alMenu.size()-1; //전에 시킨걸 띄워야되므로
      System.out.println(this.alMenu.get(n)+"x"+this.alQty.get(n)+","+
                          this.alSum.get(n)+"원");
   }
   int getInput(Menu o) { //196,204번라인에서 호출
      o.display(); //처음에 메뉴 띄움
      System.out.println("주문할 메뉴번호를 입력하시오 (0:주문종료)"); //처음에 메뉴번호 물어봄         
      int n =Integer.parseInt(this.s.nextLine());
      return n;
   }
   int addMobile() {  //207라인에서 호출한것
      System.out.println("모바일 번호를 입력하시오.(없으면 -)");
      String mobile=this.s.nextLine();
      if(mobile.equals("")) mobile="-";
      int start_ndx=this.alMobile.size();
      for(int i=this.alMobile.size(); i<this.alMenu.size();i++) {
         this.alMobile.add(mobile);
      }
      return start_ndx;
   	}
  }
   
