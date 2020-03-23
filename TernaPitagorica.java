package lab3;

public class TernaPitagorica {

	public static void ternePitagoriche(int n) {
		for (int i=0;i<=n;i++) {
			int c=i;
			for (int j=0;j<=n;j++) {
				int b=j;
				for (int k=0;k<=n;k++) {
					int a=k;
					if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2) && b<=c && a<=b &&a>0) {
						System.out.println("a="+a+" b="+b+" c="+c);
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ternePitagoriche(15);
	}

}
