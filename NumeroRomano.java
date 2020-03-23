package lab3;

public class NumeroRomano {

	private String numR="";
	public NumeroRomano(String n) {
		numR=n;
	}
	
	public int toInteger() {
		int numInt=0;
		for(int i=0;i<numR.length();i++) {
			if (numR.charAt(i)=='M') numInt+=1000;
			if (numR.charAt(i)=='D') numInt+=500;
			if (numR.charAt(i)=='C') numInt+=100;
			if (numR.charAt(i)=='L') numInt+=50;
			if (numR.charAt(i)=='X') numInt+=10;
			if (numR.charAt(i)=='V') numInt+=5;
			if (numR.charAt(i)=='I') {
				if (numR.endsWith("X") || numR.endsWith("V")) numInt-=1;
				else numInt+=1;
			}		
		}
		return numInt;
	}
	
	
	public static void main(String[] args) {
		NumeroRomano num=new NumeroRomano("MMXIX");
		System.out.println(num.toInteger());
	}

}
