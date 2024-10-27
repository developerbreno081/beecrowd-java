package problemsBeecrowdBeginner;

import java.util.Locale;
import java.util.Scanner;

public class Bee1011Esfera {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int raio = sc.nextInt();
		double pi = 3.14159;
		double volume = (4.0/3) * pi * Math.pow(raio,3);
		
		System.out.printf("VOLUME = %.3f", volume);
		
		sc.close();
	}

}
