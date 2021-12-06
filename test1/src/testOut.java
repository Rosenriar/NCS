

public class testOut {
	 private int n;
	 private String str;
	 private float realnumber;
		//선언한 클래스 밖에는 접근할 수 없다.(write/read 불가)
		//클래스 안에서만 쓸수있음
		public testOut(int n, String str, float realnumber) {
			this.str = str;
			this.realnumber = realnumber;
			this.n=(int)this.realnumber;
		}
		public testOut(int n, String str) {
			this.n = n;
			this.str = str;
		}
		public testOut(int n) {
			this.n = n;
		}
		public testOut() {
		}
			public int getN() {
			return n;
		}
		public String getStr() {
			return str;
		}
		public float getRealnumber() {
			return realnumber;
		}
		public void setN(int a) {
			this.n = a;
		}
		public void setStr(String d) {
			this.str = d;
		}
		public void setRealnumber(float realnumber) {
			this.realnumber = realnumber;
			this.n=(int)this.realnumber;
		}
	
}
