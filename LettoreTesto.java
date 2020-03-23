package lab3;

public class LettoreTesto {

   public void contaParola(String text,String word) {
	   String[] tokenArray= text.split(" ");
	   int count=0;
	   int i=0;
	   while (i<tokenArray.length) {
		   if (tokenArray[i].equals(word)) count+=1;
	       i++;
	   }
	   System.out.println("Numero di occorrenze della parola "+ word + ": "+count);

	}

}
