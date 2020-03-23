package lab3;

import java.util.Arrays;

public class Triangolo {

	public static void stampaTriangolo(int base) {
		if(base%2==1 && base>0) {
			String[] arr=new String[base];
			for(int i=0; i<base;i++) arr[i]=" ";		
			arr[base/2]="*";
			System.out.println(Arrays.toString(arr));
			for(int j=1;j<base/2+1;j++) {
				arr[base/2+j]="*";
				arr[base/2-j]="*";
				System.out.println(Arrays.toString(arr));
			}
		}
	}
	
	public static void main(String[] args) {
		stampaTriangolo(7);
	}

}
