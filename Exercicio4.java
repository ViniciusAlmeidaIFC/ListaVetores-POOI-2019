package com.Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		final int TAM = 4;
		double vet[] = new double [TAM];
		double media = 0;
		for (int x = 0; x < TAM; x++) {
			System.out.println("Informe a nota!");
			vet[x] = entrada.nextDouble();
			media = media + vet[x];}
		for (int x = 0; x < TAM; x++) {
			System.out.print(vet[x] + " | " );}
			System.out.println("A média é de: "+ media/4);
		entrada.close();

	}

}
