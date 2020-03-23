package lab3;

public class Array {
    
	public static boolean contieneStringa(String[] array, String s) {	
		int i=0;
		do {
			String stringa=array[i];
			if (stringa.equals(s)) {
				System.out.println("true");
				return true;
			}
			i+=1;
		}while(i<array.length);
		System.out.println("false");
		return false;
	}
	
	public static int indiceStringa(String[] array, String s) {
		if (array.length>=1) {
			 for (int i=0;i<array.length;i++) {
				 if (array[i].equals(s)) {
					 System.out.println(i);
					 return i; 
				 }
             }	
		}
	    System.out.println(-1);
		return -1;
		}
	
	public static void maxArray(double[] array) {
		double max=0.0;
		for (int i=0;i<array.length;i++) {
			if (array[i]>max) max=array[i];
		}
		System.out.println("Il valore massimo dell'array è pari a "+max+".");
	}
	
	public static void main(String[] args) {
		String[] arr=new String[]{"ciao","addio","hello"};
		contieneStringa(arr,"addio");
		indiceStringa(arr, "addio");
		double[] arr1=new double[] {2.5,3.7,4.4,6.9,1.3};
		maxArray(arr1);
	}

}
