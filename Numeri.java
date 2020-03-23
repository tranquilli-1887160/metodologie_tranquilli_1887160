package lab3;

import java.util.Arrays;

public class Numeri {
	
	public static void divisori(int n) {
		String elencoDivisori="";
		for(int i=1;n>i;i++) {
			if (n%i==0) {
				if (elencoDivisori.equals("")) elencoDivisori=""+i;
				else elencoDivisori+=", "+i;
				}
		}
		System.out.println(elencoDivisori);
	}
	
	public static void sommaNumeriPrecedenti(int a, int b, int c) {
		int[] arr=new int[] {a,b};
		for(int i=0;i<c;i++) {
			int[] temp=Arrays.copyOf(arr,arr.length+1);
			temp[i+2]=temp[i]+temp[i+1];
			arr=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	public static void main(String[] args) {
        divisori(15);
		sommaNumeriPrecedenti(2,3,6);
	}

}
