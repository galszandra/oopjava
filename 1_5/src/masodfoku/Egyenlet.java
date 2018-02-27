package masodfoku;

public class Egyenlet {
	public static void main(String[] args) {
		int a = 2;
		int b = 20;
		int c = 3;
		double discriminant = 0;
		double x1, x2 = 0;
		
		discriminant = (b * b) - (4 * a * c);
		
		if (discriminant < 0) {
			System.out.println("Nincs valós megoldás!");
		} else {
			x1 = (b * (-1) + Math.sqrt(discriminant)) / (2 * a);     
			x2 = (b * (-1) - Math.sqrt(discriminant)) / (2 * a);
			
			System.out.println("A megoldások: " + "x1:" + x1 + " x2:" + x2);
		}
	}

}
