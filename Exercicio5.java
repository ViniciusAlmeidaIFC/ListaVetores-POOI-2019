package com.Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		final int TAM = 20;
		char vet[] = new char [TAM];
		int consoantes = 0;
		for (int x = 0; x < TAM; x++) {
			vet[x] = entrada.next().charAt(0);
			if ((vet[x]!= 'a')&&(vet[x]!= 'e')&&(vet[x]!= 'i')&&(vet[x]!= 'o')&&(vet[x]!= 'u')) {
				consoantes++;	
			}
			}
		System.out.println("Foi lido "+ consoantes+" consoantes!");
		for (int x = 0; x <= 19; x++) {
			if ((vet[x]!= 'a')&&(vet[x]!= 'e')&&(vet[x]!= 'i')&&(vet[x]!= 'o')&&(vet[x]!= 'u'))
			System.out.print(vet[x] + " | " );
			}
		
		entrada.close();
	}
}