package RepetiçãoJava;

import java.util.Scanner;

public class contador {

public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		int soma = 0, numero;
		String question;
		
	do {
		System.out.println("Digite um número: ");
		numero = num.nextInt();
		
		soma = numero + soma;
				
		System.out.println("Quer digitar mais algum número? [S/N]");
		question = num.next().toUpperCase();
		
	}
		
		while (question.equals("S")); 
		
		System.out.println("A soma dos números digitados é " + soma);

}
}

