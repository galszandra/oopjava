package tomb;

public class Tomb {
	public static void main(String[] args) {
		int[] tomb = new int[10];
		boolean vane = false;
		
		for(int i=0;i<tomb.length;i++) {
			tomb[i] = i+1;
			System.out.println("Az " + i + ".elem: " + tomb[i]);
		}
		
		int max = tomb[0];
		for(int i=0;i<tomb.length;i++) {
			if(tomb[i] > max)
				max=i;
		}
		System.out.println("\nA tömb legnagyobb eleme: " + tomb[max]);
				
		
		int keresett = 5;
		for(int i=0;i<tomb.length;i++) {
			if(tomb[i] == keresett) 
				vane = true;
		}
			
		if(vane)
			System.out.println("\nMegtalálható a tömbben a keresett elem! (" + keresett + ")");
		else
			System.out.println("\nNincs a tömbben a keresett elem! (" + keresett + ")" );

	}
}
