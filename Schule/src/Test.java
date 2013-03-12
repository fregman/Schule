
public class Test {
	
	int[] zahlen = new int[10];
	int[] zahl1 = new int[5];
	int[] zahl2 = new int[5];
	
	
	
	
	public void erzeugen(){
		

		
		for (int i: zahlen){
			
			zahlen[i] = i*i;
			
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