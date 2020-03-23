package lab3;

public class LettereECifre {

	public static void daCifreALettere(String cifre) {
		String lettere="";
		for(int i=0;i<cifre.length();i++) {
			switch(cifre.charAt(i)) {
				case '0'-> lettere+="zero ";
				case '1'-> lettere+="uno ";
				case '2'-> lettere+="due ";
				case '3'-> lettere+="tre ";
				case '4'-> lettere+="quattro ";
				case '5'-> lettere+="cinque ";
				case '6'-> lettere+="sei ";
				case '7'-> lettere+="sette ";
				case '8'-> lettere+="otto ";
				case '9'-> lettere+="nove ";
			}
		}
		System.out.println(lettere);
	}
	
	public static void daLettereACifre(String lettere) {
		String[] arr=lettere.split(" ");
		String cifre="";
		for (int i=0;i<arr.length;i++) {
			switch(arr[i]) {
				case "zero"-> cifre+="0";
				case "uno"-> cifre+="1";
				case "due"-> cifre+="2";
				case "tre"-> cifre+="3";
				case "quattro"-> cifre+="4";
				case "cinque"-> cifre+="5";
				case "sei"-> cifre+="6";
				case "sette"-> cifre+="7";
				case "otto"-> cifre+="8";
				case "nove"-> cifre+="9";
			}
		}
		System.out.println(cifre);
	}
	
	
	
	public static void main(String[] args) {
		daCifreALettere("8452");
		daLettereACifre("otto quattro cinque due");
	}

}
