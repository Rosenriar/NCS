import java.util.Scanner;

public class test1 {
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int[] arInt= {1,2,3,4};
		try {	
		int n=10;
		System.out.println("0���� ���ڸ� �Է��Ͻÿ�");
		int x=s.nextInt();
		System.out.println(n/x);
		System.out.println(arInt[4]);
		} catch(Exception e ) {// ����(multiple) catch
			System.out.println("���� �߻�");
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

