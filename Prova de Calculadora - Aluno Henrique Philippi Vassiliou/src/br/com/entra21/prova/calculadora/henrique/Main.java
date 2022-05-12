package br.com.entra21.prova.calculadora.henrique;

import java.util.Scanner;

public class Main {

	    public static void main(String[] args) {
	    	
	    	byte opcao;
	    	
	    	 double num1, num2, soma, subtracao, multi, divi;
	    	
	        Scanner entrada = new Scanner(System.in);
	        System.out.println("Escolha uma opção para fazer um calculo:");

			System.out.println("1 = Soma");
			System.out.println("2 = Subtração");
			System.out.println("3 = Multiplicação");
			System.out.println("4 = Divisão");
			opcao = entrada.nextByte();
			
			 Scanner resposta = new Scanner(System.in);
			switch(opcao) {
			case 1:
				 System.out.println("Insira um número: ");
			        num1 = resposta.nextDouble();

			        System.out.println("Insira outro número: ");
			        num2 = resposta.nextDouble();

			        soma = num1 + num2;
			        System.out.println("O resultado da soma é: "+soma);
				break;
				
			case 2:
				System.out.println("Insira um número: ");
		        num1 = resposta.nextDouble();

		        System.out.println("Insira outro número: ");
		        num2 = resposta.nextDouble();

		        subtracao = num1 - num2;
		        System.out.println("O resultado da subtração é: "+subtracao);
				break;
				
			case 3:
				System.out.println("Insira um número: ");
		        num1 = resposta.nextDouble();

		        System.out.println("Insira outro número: ");
		        num2 = resposta.nextDouble();
		        
		        multi = num1 * num2;
		        System.out.println("O resultado da multiplicação é: "+multi);
				break;
				
			case 4:
				System.out.println("Insira um número: ");
		        num1 = resposta.nextDouble();

		        System.out.println("Insira outro número: ");
		        num2 = resposta.nextDouble();

		        divi = num1 / num2;
		        System.out.println("O resultado da divisão é: "+divi);
				break;
	       


	    }
	}
}