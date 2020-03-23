package lab3;

import java.util.Arrays;

public class ScacchieraTris {

	private String[] riga1=new String[] {" "," "," "};
	private String[] riga2=new String[] {" "," "," "};
	private String[] riga3=new String[] {" "," "," "};

	
	public void stampa() {System.out.println(Arrays.toString(riga1)+"\n"+Arrays.toString(riga2)+"\n"+Arrays.toString(riga3));}
	
	public void riempiCasella(String simbolo, int riga, int posizione) {
		if (simbolo.equals("X") || simbolo.equals("O")) {
			if (riga>0 && riga<4 && posizione>0 && posizione<4) {
				if (riga==1 && riga1[posizione-1].equals(" ")) riga1[posizione-1]=simbolo;
				if (riga==2 && riga2[posizione-1].equals(" ")) riga2[posizione-1]=simbolo;
				if (riga==3 && riga3[posizione-1].equals(" ")) riga3[posizione-1]=simbolo;
			}
			else System.out.println("Indici di riga e posizione invalidi.");
		}
		else System.out.println("Puoi scrivere solo X o O");	
	}
	
	
	public static void main(String[] args) {
		ScacchieraTris s1=new ScacchieraTris();
		s1.riempiCasella("X", 2, 1);
		s1.riempiCasella("O", 1, 2);
		s1.riempiCasella("X", 1, 2);
		s1.stampa();
	}

}
