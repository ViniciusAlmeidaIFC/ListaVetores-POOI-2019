package com.Exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		final int TAM = 5;
		int soma = 0;
		int produto = 1;
		int vet[] = new int [TAM];
		for (int x = 0; x < TAM; x++) {
			vet[x] = entrada.nextInt();
			soma = soma + vet[x];
			produto = produto * vet[x];}
		for (int x = 0; x < TAM; x++) {
			System.out.print(vet[x] + " | " );}
		System.out.println("Soma: "+soma);
		System.out.println("Produto: "+ produto);
		entrada.close();
	}

}
