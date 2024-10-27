package problemsBeecrowdBeginner;

import java.util.Locale;
import java.util.Scanner;

public class Bee1009SalarioComBonus {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		double salarioFixo = sc.nextDouble();
		double vendasMes = sc.nextDouble();
		
		double calculo = vendasMes * 0.15 + salarioFixo;
		
		System.out.printf("TOTAL = R$ %.2f", calculo);
	}

}
