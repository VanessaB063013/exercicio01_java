package br.com.generation.exercicioEntradaSaida;

import java.util.Scanner;

public class exercicio001 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
		int idade, mes, dias, total;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Digite há quantos meses você fez aniversário: ");
		mes = leia.nextInt();
		
		System.out.println("E há quantos dias? ");
		dias = leia.nextInt();
		
		total = idade* 356 + dias + mes*30;
		System.out.println("Você nasceu há: " + total + " dias.");
		

	}

}
