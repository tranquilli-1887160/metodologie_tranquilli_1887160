package lab3;

import java.util.Arrays;

public class TavolaPitagorica {
	
	private int[] elementi= {};
	private int range;
	
	public TavolaPitagorica(int range) {
		this.range=range;
		int[] temp=Arrays.copyOf(elementi,range*range);
		for (int i=1;i<=range;i++) {
			for (int j=1;j<=range;j++) {
				temp[range*(i-1)+(j-1)]=i*j;
			}
		}
		elementi=temp;
	}
	
	public void stampa() {	
		for(int i=0;i<range;i++) {
			int[] row=new int[range];
			for(int j=0;j<range;j++) {
				row[j]=elementi[j+range*i];
			}
			System.out.println(Arrays.toString(row));
	    }
	}	
	
	public static void main(String[] args) {
		TavolaPitagorica t1=new TavolaPitagorica(4);
		t1.stampa();

	}

}
