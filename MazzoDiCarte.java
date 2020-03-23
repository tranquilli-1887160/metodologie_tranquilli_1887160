package lab3;

import java.util.Arrays;

public class MazzoDiCarte {

	private String[] mazzo= new String[52];
	
	public MazzoDiCarte() {
		String[] semi= {"cuori","quadri","fiori","picche"};
		String[] valori= {"Asso","Due","Tre","Quattro","Cinque","Sei","Sette","Otto","Nove","Dieci","Jack","Donna","Re"};
		for (int i=0;i<semi.length;i++) {
			for (int j=0;j<valori.length;j++) {
				mazzo[13*i+j]=valori[j]+" di "+semi[i]; 
			}
		}
	}
	
	public void stampaMazzo() {  System.out.println(Arrays.toString(mazzo)); 
	}
	
	public void mescola() {
		String[] mazzoTemp=new String[52];
		for(int i=0;i<52;i++) {
			double number=Math.round(Math.random()*51);
			int index=(int) number;
			if (mazzoTemp[index]==null) mazzoTemp[index]=mazzo[i];
			else {
				for (int j=0;j<52;j++) {
					if (mazzoTemp[j]==null) {
						mazzoTemp[j]=mazzo[i];
				        break;
					}
				}
			}
		}
		mazzo=mazzoTemp;
	}
	
	public void distribuisci(int numCarte) {
		for (int i=0;i<numCarte;i++) System.out.println(mazzo[i]);
	}
}


