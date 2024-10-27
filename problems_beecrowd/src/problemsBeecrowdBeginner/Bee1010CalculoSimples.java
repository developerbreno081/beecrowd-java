package problemsBeecrowdBeginner;

import java.util.Locale;
import java.util.Scanner;

public class Bee1010CalculoSimples {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Variáveis peça1
		int codPeca1 = sc.nextInt();
		int numeroPecas1 = sc.nextInt();
		double valorUnitario1 = sc.nextDouble();
		
		// Variáveis peça2
		int codPeca2 = sc.nextInt();
		int numeroPecas2 = sc.nextInt();
		double valorUnitario2 = sc.nextDouble();
		
		double valorPagar = numeroPecas1 * valorUnitario1 + numeroPecas2 * valorUnitario2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorPagar);

	}

}
