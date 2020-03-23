package lab3;

public class VerStrings {

	public static void stringheVerticali(String s1,String s2,String s3) {
		
		if(s1.length()==s2.length() && s1.length()==s3.length()) {
			for(int i=0;i<s1.length();i++) System.out.println(s1.charAt(i)+" "+s2.charAt(i)+" "+s3.charAt(i));
		}

		else {
			if (s1.length()>s2.length()) {
				while(s2.length()<s1.length()) s2+=" ";
			}
			if (s1.length()>s3.length()) {
				while(s3.length()<s1.length()) s3+=" ";
			}
			if (s2.length()>s1.length()) {
				while(s1.length()<s2.length()) s1+=" ";
			}
			if (s2.length()>s3.length()) {
				while(s3.length()<s2.length()) s3+=" ";
			}
			if (s3.length()>s1.length()) {
				while(s1.length()<s3.length()) s1+=" ";
			}
			if (s3.length()>s2.length()) {
				while(s2.length()<s3.length()) s2+=" ";
			}
			for(int i=0;i<s1.length();i++) System.out.println(s1.charAt(i)+" "+s2.charAt(i)+" "+s3.charAt(i));

		}
	}
	
	public static void stringaVerticale(String s) {
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		stringaVerticale("ciao");
		stringheVerticali("ciao","buondì","hello");
	}

}
