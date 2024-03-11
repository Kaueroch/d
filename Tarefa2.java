package lições;

import java.util.Scanner;

public class Tarefa2 {
	public static void main(String[] args) {
		double n;
		Scanner sc = new Scanner(System.in);
		byte escolha = sc.nextByte();
		System.out.println("1.CELSIUS PARA FAHRENHEIT");
		System.out.println("2.CELSIUS PARA KELVIN");
		System.out.println("3.KELVIN PARA CELSIUS");
		System.out.println("4.KELVIN PARA FAHRENHEIT");
		System.out.println("5.FAHRENHEIT PARA CELSIUS");
		System.out.println("6.FAHRENHEIT PARA KELVIN");
		System.out.println("ESCOLHE AI MANE");

		switch (escolha) {

		case 1:

			System.out.println("DIGITE UM NUMERO ");
			int numero = sc.nextInt();

			int resultado = (numero * 9 / 5) + 32;
			System.out.print(resultado);
			break;
		case 2:
			System.out.println("DIGITE UM NUMERO ");

			n = sc.nextDouble();
			double r = n + 273.15;
			System.out.println(r);
			break;
		case 3:
			System.out.println("DIGITE UM NUMERO ");

			n = sc.nextDouble();
			double rs = n - 273.15;
			System.out.println(rs);
			break;
		case 4:
			System.out.println("DIGITE UM NUMERO ");

			n = sc.nextDouble();
			double rst = (n - 273.15) * 9 / 5 + 32;
			System.out.println(rst);
			break;
		case 5:

			n = sc.nextDouble();
			double resultado1 = (n - 32) * 5 / 9;
			break;
		case 6:

			n = sc.nextDouble();
			double resultado4 = (n - 32) * 5 / 9 + 273.15;
			// (32 °F − 32) × 5/9 + 273,15
			break;
		}
	}

}
