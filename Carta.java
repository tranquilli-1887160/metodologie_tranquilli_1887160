package lab3;

public class Carta {

	private String seme;
	private String valore;
	
	public Carta(String valore,String seme) {this.valore=valore; this.seme=seme;}
	
	public String toString() {
		System.out.println(valore+", "+seme);
		return valore+", "+seme;
	}
	
	public static void main(String[] args) {
		Carta n1=new Carta("dieci","picche");
		n1.toString();

	}

}
