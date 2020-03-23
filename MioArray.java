package lab3;

import java.util.Arrays;

public class MioArray {
	
	private int[] array=new int[0];	
	
	public MioArray(String elementi) {
		if (elementi.length()>0) {
		String[] s=elementi.split(",");
		int[] temp=Arrays.copyOf(array,s.length);
		for(int i=0;i<s.length;i++) temp[i]=Integer.parseInt(s[i]);
		array=temp;
		}
	}
	
	public void stampaArray() {
		System.out.println(Arrays.toString(array));
	}
	
	public void contiene(int posizione,int elemento) {
		if (elemento<=array.length && elemento>=0) {
			if(array[posizione]==elemento) System.out.println("true");
			else System.out.println("false");
		}
		else System.out.println("false");
	}

	public void somma2() {
		if (array.length==0) System.out.println("L'array è vuoto: "+0);
		if (array.length==1) System.out.println("L'array ha un solo elemento: "+array[0]);
		else System.out.println("La somma dei primi due elementi è pari a: "+(array[0]+array[1]));	
	}

	public void scambia(int pos1, int pos2) {
		if (array.length>1 && pos1>=0 && pos1<array.length && pos2>=0 && pos2<array.length) {
			var temp=array[pos1];
			array[pos1]=array[pos2];
			array[pos2]=temp;
			System.out.println(Arrays.toString(array));
		}
		else System.out.println("L'array deve avere almeno due elementi. Ricontrolla anche gli indici");
	}
		
	public void maxTripla() {
		if (array.length<3) System.out.println("L'array è troppo corto, servono almeno 3 elementi");
		if (array.length%2==1) {
			int max=array[0];
			if (max<array[array.length-1]) max=array[array.length-1];
			if (max<array[(array.length-1)/2]) max=array[(array.length-1)/2];
			System.out.println("Il massimo è "+max);
		}
		else {
			int max=array[0];
			if (max<array[array.length-1]) max=array[array.length-1];
			if (max<array[(array.length)/2]) max=array[(array.length)/2];
			System.out.println("Il massimo è "+max);
		}
	}
	
	public void falloInDue() {
		if (array.length<2) System.out.println("L'array è troppo corto,deve avere almeno 2 elementi");
		else {
			int [] firstEl=Arrays.copyOf(array,1);
			System.out.println("Il primo elemento dell'array è "+Arrays.toString(firstEl));
			int [] lastEl=Arrays.copyOf(array,1);
			lastEl[0]=array[array.length-1];
			System.out.println("L'ultimo elemento dell'array è "+Arrays.toString(lastEl));
		}
	}
	
	
	
	
	public static void main(String[] args) {
		MioArray listone=new MioArray("12,3,14,35,68");
		listone.falloInDue();


	}

}
