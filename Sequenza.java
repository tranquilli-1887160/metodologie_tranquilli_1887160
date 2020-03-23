package lab3;

import java.util.Arrays;

public class Sequenza {
	
	private int[] array=new int[0];	
	
	public Sequenza(String elementi) {
		if (elementi.length()>0) {
		String[] s=elementi.split(",");
		int[] temp=Arrays.copyOf(array,s.length);
		for(int i=0;i<s.length;i++) temp[i]=Integer.parseInt(s[i]);
		array=temp;
		}
	}

	public void getMediana() {
		Arrays.sort(array);
		if(array.length%2==1) System.out.println(array[array.length/2]);
		if(array.length%2==0) System.out.println(array[array.length/2-1]);
	}
	
	public void getMedia() {
		int count=0;
		for (int i=0;i<array.length;i++) count+=array[i];
		System.out.println("La media è "+count/array.length);
	}

	public void getModa() {
		for (int i=0;i<array.length;i++) {
			
		}
	}
	
	public static void main(String[] args) {
		Sequenza lista=new Sequenza("12,3,22,28,80,67,1");
		lista.getMedia();
	}

}
