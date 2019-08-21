package com.Exercicios;

import java.util.Scanner;

public class Exercicio15 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		final int TAM=30;
		double soma=0;
		
		int vetidade[] = new int[TAM];
		double vetaltura[] = new double[TAM];
		
		for (int x=0; x<TAM;x++) {
			System.out.println("Idade");
			vetidade[x]= entrada.nextInt();
			System.out.println("Altura");
			vetaltura[x] = entrada.nextDouble();
			soma = soma+vetaltura[x];}
		
			for (int x=0; x<TAM;x++) {
			if (vetidade[x]> 13 && soma/TAM > vetaltura[x]) {
				System.out.println("Mais alto que a média : " +vetaltura[x] + " , e é maior que 13 anos");
			
			}}
entrada.close();
	}

}
