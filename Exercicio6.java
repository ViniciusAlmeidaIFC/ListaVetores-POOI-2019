package com.Exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		final int TAM = 5;
		int vet[] = new int [TAM];
		int contpar = 0;
		int contimpar = 0;
		for (int x = 0; x < TAM; x++) {
			vet[x] = entrada.nextInt();
			}
		for (int x = 0; x < TAM; x++) {
			if (vet[x] % 2 == 0)
				contpar++;
			else
				contimpar++;
		}
		int vetpar[] = new int [contpar];
		int vetimpar[] = new int [contimpar];
		int cont1par = 0;
		int cont1impar = 0;
		for (int x = 0; x < TAM; x++) {
			if (vet[x] % 2 == 0) {
				vetpar[cont1par] = vet[x];
				cont1par++;}
			else {
				vetimpar[cont1impar] = vet[x] ;
				cont1impar++;}
			}
			System.out.println("Vetor Principal");
			for (int x = 0; x <= 4; x++) {
			System.out.print(vet[x] + " | " );
			}
			System.out.println("");
			System.out.println("Vetor Par ");
			for (int x = 0; x < contpar; x++) {
				System.out.print(vetpar[x] + " | " );
			}
			System.out.println("");
			System.out.println("Vetor Ímpar ");
			for (int x = 0; x < contimpar; x++) {
				System.out.print(vetimpar[x] + " | " );
			}
				
		
		entrada.close();
	}
}