package lab3;

public class Cornice {
	
	public static void stampaCornice(int n) {
		String corniceSup="";
		String corniceLat="*";
		for (int i=0;i<n;i++) {
			corniceSup+="*";
		}
		System.out.println(corniceSup);

		for (int i=1;i<n-1;i++) {
			corniceLat+=" ";
		}
		corniceLat+="*";
		for (int i=1;i<n-1;i++) {
			System.out.println(corniceLat);
		}
		System.out.println(corniceSup);
	}
	
	
	
	

	public static void main(String[] args) {
		stampaCornice(5);

	}

}
