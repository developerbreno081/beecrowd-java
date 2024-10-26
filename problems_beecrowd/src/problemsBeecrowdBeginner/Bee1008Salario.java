package problemsBeecrowdBeginner;

import java.util.Locale;
import java.util.Scanner;

public class Bee1008Salario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numberId = sc.nextInt();
		int timeJob = sc.nextInt();
		double salaryTime = sc.nextDouble();
		
		double resultSalaryTime = timeJob * salaryTime;
		
		System.out.printf("NUMBER = %d %nSALARY = U$ %.2f", numberId, resultSalaryTime);

	}

}
