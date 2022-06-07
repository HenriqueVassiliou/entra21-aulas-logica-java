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
			// no primeiro laço sempre a primeira idade vai ser a menor
			if (count == 1) {
			ageMinimal = age;
			youngerName = name;
			System.out.println("Sou o primeiro e por isso sou o mais novo " + name + " " + age);
			} else {
			// a partir do segundo laço já tenho como comparar com "ageMinimal"
			System.out.println("Estou no laço " + count + " e preciso verificar");
			if (age < ageMinimal) {
			System.out.println(
			"Ainda bem que testei porque a pessoa mais nova é " + name + " com " + age + " anos");
			ageMinimal = age;
			youngerName = name;
			}

			 }

			 }
			System.out.println("Após isso tudo o mais novo é: " + youngerName + " " + ageMinimal);

			 
    }
}
	


