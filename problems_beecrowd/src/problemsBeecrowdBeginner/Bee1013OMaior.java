package problemsBeecrowdBeginner;

import java.util.Scanner;

public class Bee1013OMaior {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maiorAB = (a + b + (a-b)) / 2;
		
		if (maiorAB > c) {
			System.out.printf("%d eh o maior",maiorAB);
		}
		else {
			System.out.printf("%d eh o maior",c);
		}
		

	}

}
