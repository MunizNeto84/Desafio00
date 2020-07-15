package desafio;

import java.util.Scanner;

public class Desafio00
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculadora: ");
		System.out.print("Ler numero 01: ");
		double num01 = sc.nextDouble();
		System.out.print("Ler numero 02: ");
		double num02 = sc.nextDouble();
		System.out.print("Operação: ");
		String operacao = sc.next();
		double resultado = "+".equals(operacao) ? num01 + num02 : 0;
		resultado = "-".equals(operacao) ? num01 - num02 : resultado;
		resultado = "*".equals(operacao) ? num01 + num02 : resultado;
		resultado = "/".equals(operacao) ? num01 / num02 : resultado;
		resultado = "%".equals(operacao) ? num01 % num02 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num01, operacao, num02,resultado);
		
		sc.close();
		
	}

}
