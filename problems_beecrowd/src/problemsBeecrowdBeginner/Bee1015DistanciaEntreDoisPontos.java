package problemsBeecrowdBeginner;

import java.util.Locale;
import java.util.Scanner;

public class Bee1015DistanciaEntreDoisPontos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		
		double y1 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		double distancia = Math.sqrt(Math.pow(x1-y1, 2) + Math.pow(x2-y2, 2));
		
		
		System.out.printf("%.4f",distancia);

	}

}
