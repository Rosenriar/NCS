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
//               " �޴��� : "+this.name.get(i)+" ���� : "+this.qty.get(i)+
//               " �Ѿ� : "+this.sum.get(i));
//      }int all_sum=0;
//      for(int j=st_ndx;j<this.sum.size();j++) {
//         all_sum+=this.sum.get(j);
//      }
//      System.out.println("�� ���� : "+all_sum);
//   }
//   void display(String mobile) {
//      int start_ndx=this.mobile.size();
//      for(int i=this.mobile.size();i<this.name.size();i++) {
//         this.mobile.add(mobile);   
//      }
//      
//      for(int i=start_ndx;i<this.name.size();i++) {
//         System.out.println((i+1)+" ��ȣ : " +this.mobile.get(i)+
//               " �޴��� : "+this.name.get(i)+" ���� : "+this.qty.get(i)+
//               " �Ѿ� : "+this.sum.get(i));
//      }int all_sum=0;
//      for(int j=start_ndx;j<this.sum.size();j++) {
//         all_sum+=this.sum.get(j);
//      }
//      System.out.println("�� ���� : "+all_sum);
//   }
//   void all_display() {
//      for(int i=0;i<this.name.size();i++) {
//         System.out.println((i+1)+" ��ȣ : " +this.mobile.get(i)+
//               " �޴��� : "+this.name.get(i)+" ���� : "+this.qty.get(i)+
//               " �Ѿ� : "+this.sum.get(i));
//      }int all_sum=0;
//      for(int j=0;j<this.sum.size();j++) {
//         all_sum+=this.sum.get(j);
//      }
//      System.out.println("�� ���� : "+all_sum);
//   }
//   void guide() {
//      System.out.println("A:�ֹ� �߰�, R:�ֹ�����, U:�ֹ�����, T:�ֹ����� ���� Q:��ü �ֹ����� ���� \nG:�ֹ� �Ϸ� �� ��ȣ�Է� X:�ڷΰ���");
//   }
//   void Handling(Menu menu){
//      menu.display();
//      this.guide();
//      Scanner cafe=new Scanner(System.in);   
//      String st=cafe.nextLine();
//      while(!st.equals("X")) {
//         if(st.equals("A")) {
//            Scanner ms=new Scanner(System.in);
//            System.out.print("�޴���ȣ�� �Է��Ͻÿ� : ");
//            int new_menu_num=ms.nextInt();
//            String menu_name=menu.alMenu.get(new_menu_num-1);
//            int menu_price=menu.alPrice.get(new_menu_num-1);
//            System.out.print("������ �Է��Ͻÿ� : ");
//            int new_qty=ms.nextInt();
//            int new_sum=menu_price*new_qty;
//            this.add(menu_name, new_qty, new_sum);
//            System.out.println("���� �ֹ�����\n"+
//                  " �޴��� : "+menu_name+" ���� : "+new_qty+
//                  " �Ѿ� : "+new_sum);
//         }
//         else if(st.equals("R")) {
//            Scanner ms=new Scanner(System.in);
//            this.display1();
//            System.out.print("������ �ֹ���ȣ�� �Է��Ͻÿ� : ");
//            int menu_num=ms.nextInt();
//            this.remove(menu_num);
//         }
//         else if(st.equals("U")) {
//            this.display1();
//            Scanner ms=new Scanner(System.in);
//            System.out.print("������ �ֹ���ȣ�� �Է��Ͻÿ� : ");
//            int menu_num=ms.nextInt();
//            menu_num=menu_num+this.mobile.size();
//            menu.display();
//            System.out.print("������ �޴���ȣ�� �Է��Ͻÿ� : ");
//            int up_menu_num=ms.nextInt();
//            String up_menu_name=menu.alMenu.get(up_menu_num-1);
//            int up_menu_price=menu.alPrice.get(up_menu_num-1);
//            System.out.print("������ ������ �Է��Ͻÿ� : ");
//            int up_qty=ms.nextInt();
//
//            
//            int up_sum = up_menu_price*up_qty;
//            this.update(menu_num, up_menu_name, up_qty,up_sum);
//            System.out.println("������ �ֹ����� \n��ȣ : "+
//                  " �޴��� : "+up_menu_name+" ���� : "+up_qty+
//                  " �Ѿ� : "+up_sum);
//         }
//         else if(st.equals("T")) {
//            this.display1();
//         }
//         else if(st.equals("G")) {
//            Scanner ms=new Scanner(System.in);
//            this.display1();
//            System.out.print("����� ��ȣ�� �Է��Ͻÿ� : ");
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
   //�����(mobile) �޴���(name) , ����(qty), �Ѿ�(sum) - �ʵ�
	private ArrayList<String> alMenu;
	private ArrayList<String> alMobile;
	private ArrayList<Integer> alQty;
	private ArrayList<Integer> alSum;
	private Scanner s;
   // �ʱ�ȭ
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
      for(int i=0; i<this.alMenu.size(); i++) { //i<this.al~~~.size(); ���̴� �� �Ȱ��Ƽ� �� �ص� �ȴ�.
         System.out.println(this.alMobile.get(i)+","+this.alMenu.get(i)+","
               +this.alQty.get(i)+","+this.alSum.get(i));
      }
   //�߹��߰� (add) <= �޴���,����
   //�ֹ����� (remove)
   //�ֹ����� (update)
   //�ֹ�ǥ�� (display)
   }
 private void guide() {
      System.out.println("�ֹ�����(X:����,C:�ֹ��߰�,U:�ֹ�����,D:�ֹ�����)");
   }
 public void Handling(Menu menu) {
        int menu_num=this.getInput(menu); //222�� get input�� ȣ��
          while(menu_num!=0) {
             System.out.println("�޴��� ������ �Է��Ͻÿ�");
             int qty=Integer.parseInt(this.s.nextLine()); //qty ���ڷ� �Է¹���
             menu_num--; //�޴���ȣ -> �ε��� ��ȣ ��ȯ
             this.add(menu.getAlMenu(menu_num), qty,menu.getAlPrice(menu_num)*qty);
             this.showOrder(); //217���� showOrder�� ȣ��
             
             menu_num=this.getInput(menu); // 222���� getInput<<ȣ��
          }
          
         int start_ndx=this.addMobile(); //228���� addMobileȣ��
          int total=0;
          for(int i=start_ndx;i<this.alMenu.size();i++) {
             System.out.println(this.alMobile.get(i)+","+this.alMenu.get(i)+",x"+
                            this.alQty.get(i)+","+this.alSum.get(i));
             total+=this.alSum.get(i);
             System.out.println("�� �ֹ� �ݾ�:"+total);
             System.out.println("----------------------------");
          }
   }
 private void showOrder() {  //����޴�/�̸�/����/�Ѿ� ǥ��                    202������ ȣ����
      int n=this.alMenu.size()-1; //���� ��Ų�� ����ߵǹǷ�
      System.out.println(this.alMenu.get(n)+"x"+this.alQty.get(n)+","+
                          this.alSum.get(n)+"��");
   }
   int getInput(Menu o) { //196,204�����ο��� ȣ��
      o.display(); //ó���� �޴� ���
      System.out.println("�ֹ��� �޴���ȣ�� �Է��Ͻÿ� (0:�ֹ�����)"); //ó���� �޴���ȣ ���         
      int n =Integer.parseInt(this.s.nextLine());
      return n;
   }
   int addMobile() {  //207���ο��� ȣ���Ѱ�
      System.out.println("����� ��ȣ�� �Է��Ͻÿ�.(������ -)");
      String mobile=this.s.nextLine();
      if(mobile.equals("")) mobile="-";
      int start_ndx=this.alMobile.size();
      for(int i=this.alMobile.size(); i<this.alMenu.size();i++) {
         this.alMobile.add(mobile);
      }
      return start_ndx;
   	}
  }
   
