package br.com.entra21.prova.signo.henrique;

import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		// Intervalo           Signo
		// de 21/3 ate 20/4    Aries
		// de 21/4 ate 20/5    Touro
		// de 21/5 ate 20/6    Gemeos
		// de 21/6 ate 21/7    Cancer
		// de 22/7 ate 22/8    Leao
		// de 23/8 ate 22/9    Virgem
		// de 23/9 ate 22/10   Libra
		// de 23/10 ate 21/11  Escorpiao
		// de 22/11 ate 21/12  Sagitario
		// de 22/12 ate 20/1   Capricornio
		// de 21/1 ate 19/2    Aquario
		// de 20/2 ate 20/3    Peixes
		 Scanner ler = new Scanner(System.in);

	      int dia, mes;
	      String nome;
	 
	      System.out.println("Qual é seu nome?\n");
		  nome = ler.next();
     
	      System.out.printf("Informe o dia de nascimento:\n");
	      dia = ler.nextInt();

	      System.out.printf("\nInforme o mes de nascimento:\n");
	      mes = ler.nextInt();
	      
	      if (((mes == 3) && ((dia >=21) && (dia <= 31))) ||
	         (mes == 4 && (dia >= 1) && (dia <= 20)))
	    	  System.out.printf(nome+" você é de Aries");
	      if (((mes == 4) && ((dia >=21) && (dia <= 30))) ||
	 	         (mes == 5 && (dia >= 1) && (dia <= 20)))
	 	    	  System.out.printf(nome+" você é de Touro");
	      if (((mes == 5) && ((dia >=21) && (dia <= 31))) ||
		 	         (mes == 6 && (dia >= 1) && (dia <= 20)))
		 	    	  System.out.printf(nome+" você é de Gemeos");
	      if (((mes == 6) && ((dia >=22) && (dia <= 30))) ||
		 	         (mes == 7 && (dia >= 1) && (dia <= 21)))
		 	    	  System.out.printf(nome+" você é de Cancer");
	      if (((mes == 7) && ((dia >=21) && (dia <= 31))) ||
		 	         (mes == 8 && (dia >= 1) && (dia <= 22)))
		 	    	  System.out.printf(nome+" você é de Leao");
	      if (((mes == 8) && ((dia >=23) && (dia <= 31))) ||
		 	         (mes == 9 && (dia >= 1) && (dia <= 22)))
		 	    	  System.out.printf(nome+" você é de Virgem");
	      if (((mes == 9) && ((dia >=23) && (dia <= 30))) ||
		 	         (mes == 10 && (dia >= 1) && (dia <= 22)))
		 	    	  System.out.printf(nome+" você é de Libra");
	      if (((mes == 10) && ((dia >=23) && (dia <= 31))) ||
		 	         (mes == 11 && (dia >= 1) && (dia <= 21)))
		 	    	  System.out.printf(nome+" você é de Escorpião");
	      if (((mes == 11) && ((dia >=22) && (dia <= 30))) ||
		 	         (mes == 12 && (dia >= 1) && (dia <= 21 )))
		 	    	  System.out.printf(nome+" você é de Sagitario ");
	      if (((mes == 12) && ((dia >=22) && (dia <= 31))) ||
		 	         (mes == 1 && (dia >= 1) && (dia <= 20)))
		 	    	  System.out.printf(nome+" você é de Capricornio");
	      if (((mes == 1) && ((dia >=21) && (dia <= 31))) ||
		 	         (mes == 2 && (dia >= 1) && (dia <= 19)))
		 	    	  System.out.printf(nome+" você é de Aquario");
	      if (((mes == 2) && ((dia >=20) && (dia <= 29))) ||
		 	         (mes == 3 && (dia >= 1) && (dia <= 20)))
		 	    	  System.out.printf(nome+" você é de Peixe");
	      else {
              System.out.printf("Erro: Insira um dia ou mes valido!");
	      }
	    
	     
	    	
	    	 
	      

	     
    }

}

