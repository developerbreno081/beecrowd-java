package problems_beecrowd_beginner;

import java.util.Scanner;

public class bee1004ProdutoSimples {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		int prod = valor1 * valor2;
		System.out.printf("PROD = %d", prod);

	}

}