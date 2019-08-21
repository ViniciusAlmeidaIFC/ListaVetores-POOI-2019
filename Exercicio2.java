package com.Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		final int TAM = 10;
		int vet[] = new int [TAM];
		for (int x = 0; x < TAM; x++)
			vet[x] = entrada.nextInt();
		for (int x = 9; x >= 0; x--) {
			System.out.print(vet[x] + " | " );}
		entrada.close();

	}

}
