package problems_beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class bee1002AreaDoCirculo {

	public static void main(String[] args) {
		
		//area = π (3.14159).raio2
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		
		double area = 3.14159 * (raio * 2);
		
		System.out.printf("A=%.4f", area);
	}

}