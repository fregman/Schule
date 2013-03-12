import java.util.Random;


public class Test {
	
	String[][] daten	= new String[24][1];
	String[] namen		= new String[4];
	int[] zahlen 		= new int[10];
	int[] zahl1	 		= new int[5];
	int[] zahl2	 		= new int[5];

	Test(){
		
		namen[0] = "Peter";
		namen[1] = "Hans";
		namen[2] = "Schnitze";
		namen[3] = "Kunibert";		
	}
	
	
	
	
	
	public void erzeugen(){
		

		
		for (int i: zahlen){
			

			zahlen[i] = i*i;
			
		}
		
	}
	
	public void erzeugeTemp(){
		
		Random rnd = new Random();
		
		
		for (int i = 0; i < daten.length; i++){
						
			daten[i][0] = namen[rnd.nextInt(4)];
			
			
		}
		
	}
	
	public void zeigeTemp(){
		
		for (int i = 0; i<daten.length; i++){
			
			System.out.println("Stunde: " + (i+1) + " gemessen von: " + daten[i][0]);
			
			
		}
		
		
	}
	
	
	
	public void ausgabeGerade() {
		
		for (int i: zahlen){
			
			if (i%2==0) System.out.println("zahl: " + i + " index: " + zahlen[i]);			
		}
		
	}
	

	public void ausgabeZwischen(int a, int b) {
		
		for (int i: zahlen) {
			
			if (zahlen[i] > a && zahlen[i] < b) {
				
				System.out.println("Die Zahl " + zahlen[i] + " index " + i);
				System.out.println("liegt zwischen " + a + " und " + b);
			}
			
		}
		
	}
	
	
	public void speichern(){
		
		for (int i: zahlen){
						
			if (i<=5){
				
				zahl1[i] = zahlen[i];
			}
			else {
				
				zahl2[i] = zahlen[i];
			}
			
		}
		
	}
	
}