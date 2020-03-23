package lab3;

public class Vocali {
	public void ContaVocali(String text) {
		int a=0;
		int e=0;
		int i=0;
		int o=0;
		int u=0;
		for (int j=0;j<text.length();j++) {
			switch(text.charAt(j)) {
				case 'a'-> a+=1;
				case 'e'-> e+=1;
				case 'i'-> i+=1;
				case 'o'-> o+=1;
				case 'u'-> u+=1;
			}
		}
		System.out.print("a="+a+"\ne="+e+"\ni="+i+"\no="+o+"\nu="+u);
	}

	public static void main(String[] args) {
		String text="le aiuole sono pulite";
		Vocali v=new Vocali();
		v.ContaVocali(text);
	}
}
