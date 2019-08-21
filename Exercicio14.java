package com.Exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		final int TAM = 10;
		final int FIMTAM = 20;
		int veta[] = new int [TAM];
		int vetb[] = new int [TAM];
		int vetc[] = new int [FIMTAM];
		System.out.println("Informe os elementos do primeiro vetor");
		for (int x = 0; x < TAM; x++)
			veta[x] = entrada.nextInt();
		System.out.println("Informe os elementos do segundo vetor");
		for (int x = 0; x < TAM; x++)
			vetb[x] = entrada.nextInt();
		for (int i=0; i<10; i++) { 
			vetc[2*i] = veta[i]; 
			vetc[2*i+1] = vetb[i]; 
			}
		System.out.println("Vetor A");
		for (int x = 0; x < TAM; x++) {
		System.out.print(veta[x] + " | " );
		}
		System.out.println("");
		System.out.println("Vetor B ");
		for (int x = 0; x < TAM; x++) {
			System.out.print(vetb[x] + " | " );
		}
		System.out.println("");
		System.out.println("Vetor C ");
		for (int x = 0; x < FIMTAM; x++) {
			System.out.print(vetc[x] + " | " );
		}
		entrada.close();

	}

}
