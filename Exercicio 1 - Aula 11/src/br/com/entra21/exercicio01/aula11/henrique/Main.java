package br.com.entra21.exercicio01.aula11.henrique;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			String name, youngerName = "valor";
			byte age, ageMinimal = 0;

			 for (byte count = 1; count <= 5; count++) {

			 System.out.println("Digite seu nome: ");
			name = input.next();
			System.out.println(name + " por favor, Digite sua idade: ");
			age = input.nextByte();
			// no primeiro la�o sempre a primeira idade vai ser a menor
			if (count == 1) {
			ageMinimal = age;
			youngerName = name;
			System.out.println("Sou o primeiro e por isso sou o mais novo " + name + " " + age);
			} else {
			// a partir do segundo la�o j� tenho como comparar com "ageMinimal"
			System.out.println("Estou no la�o " + count + " e preciso verificar");
			if (age < ageMinimal) {
			System.out.println(
			"Ainda bem que testei porque a pessoa mais nova � " + name + " com " + age + " anos");
			ageMinimal = age;
			youngerName = name;
			}

			 }

			 }
			System.out.println("Ap�s isso tudo o mais novo �: " + youngerName + " " + ageMinimal);

			 
    }
}
	


