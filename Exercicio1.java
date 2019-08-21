package com.Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		final int TAM = 5;
		int vet[] = new int [TAM];
		for (int x = 0; x < TAM; x++)
			vet[x] = entrada.nextInt();
		for (int x = 0; x < TAM; x++) {
			System.out.print(vet[x] + " | " );}
		entrada.close();
	}

}
