package br.com.entra21.prova.calculadora.henrique;

import java.util.Scanner;

public class Main {

	    public static void main(String[] args) {
	    	
	    	byte opcao;
	    	
	    	 double num1, num2, soma, subtracao, multi, divi;
	    	
	        Scanner entrada = new Scanner(System.in);
	        System.out.println("Escolha uma op��o para fazer um calculo:");

			System.out.println("1 = Soma");
			System.out.println("2 = Subtra��o");
			System.out.println("3 = Multiplica��o");
			System.out.println("4 = Divis�o");
			opcao = entrada.nextByte();
			
			 Scanner resposta = new Scanner(System.in);
			switch(opcao) {
			case 1:
				 System.out.println("Insira um n�mero: ");
			        num1 = resposta.nextDouble();

			        System.out.println("Insira outro n�mero: ");
			        num2 = resposta.nextDouble();

			        soma = num1 + num2;
			        System.out.println("O resultado da soma �: "+soma);
				break;
				
			case 2:
				System.out.println("Insira um n�mero: ");
		        num1 = resposta.nextDouble();

		        System.out.println("Insira outro n�mero: ");
		        num2 = resposta.nextDouble();

		        subtracao = num1 - num2;
		        System.out.println("O resultado da subtra��o �: "+subtracao);
				break;
				
			case 3:
				System.out.println("Insira um n�mero: ");
		        num1 = resposta.nextDouble();

		        System.out.println("Insira outro n�mero: ");
		        num2 = resposta.nextDouble();
		        
		        multi = num1 * num2;
		        System.out.println("O resultado da multiplica��o �: "+multi);
				break;
				
			case 4:
				System.out.println("Insira um n�mero: ");
		        num1 = resposta.nextDouble();

		        System.out.println("Insira outro n�mero: ");
		        num2 = resposta.nextDouble();

		        divi = num1 / num2;
		        System.out.println("O resultado da divis�o �: "+divi);
				break;
	       


	    }
	}
}