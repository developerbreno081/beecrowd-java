package problemsBeecrowdBeginner;

import java.util.Locale;
import java.util.Scanner;

public class Bee1005Media1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = sc.next();
		
		System.out.print("Digite a primeira nota: ");
		double a = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double b = sc.nextDouble();
		
		double mediaPonderada = (a * 3.5 + b * 7.5) / 11;
		
		System.out.printf("%s sua média foi:%n", nome);
		System.out.printf("MEDIA = %.5f", mediaPonderada);
		
		

	}

}
