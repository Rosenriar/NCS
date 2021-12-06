import java.util.Scanner;

public class test1 {
	public static void main(String[] args){
	testOut to = new testOut();
	to.setN(10); //to.n=10;et(<-write)
	int k=to.getN();
	System.out.println(k); //get(<-read)
	to.setN(5);
	int a=to.getN();
	System.out.println(a);
	
	to.setStr("onclick");
	String d=to.getStr();
	System.out.println(d);
	Scanner R = new Scanner(System.in);
	String c =R.nextLine();
	
	
}
}
