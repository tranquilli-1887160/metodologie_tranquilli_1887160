package lab3;

public class CollaudaMazzo {

	public static void main(String[] args) {
		MazzoDiCarte m1=new MazzoDiCarte();
		m1.stampaMazzo();
		m1.mescola();
		m1.distribuisci(52);
	}

}
