package problemsBeecrowdBeginner;

import java.util.Locale;
import java.util.Scanner;

public class Bee1006Media2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = sc.next();
		
		System.out.print("Digite a primeira nota: ");
		double a = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double b = sc.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		double c = sc.nextDouble();
		
		double mediaPonderada = (a * 2 + b * 3 + c * 5 ) / 10;
		
		System.out.printf("%s sua média foi:%n", nome);
		System.out.printf("MEDIA = %.1f", mediaPonderada);

	}

}
