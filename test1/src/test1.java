import java.util.Scanner;

public class test1 {
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int[] arInt= {1,2,3,4};
		try {	
		int n=10;
		System.out.println("0외의 숫자를 입력하시오");
		int x=s.nextInt();
		System.out.println(n/x);
		System.out.println(arInt[4]);
		} catch(Exception e ) {// 다중(multiple) catch
			System.out.println("오류 발생");
			e.printStackTrace();
		}
	}
}
//	testOut to = new testOut();
//	to.setN(10); //to.n=10;et(<-write)
//	int k=to.getN();
//	System.out.println(k); //get(<-read)
//	to.setN(5);
//	int a=to.getN();
//	System.out.println(a);
//	
//	to.setStr("onclick");
//	String d=to.getStr();
//	System.out.println(d);
//	Scanner R = new Scanner(System.in);
//	String c =R.nextLine();
//	
//	

