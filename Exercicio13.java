package com.Exercicios;

import java.util.Scanner;

public class Exercicio13 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		final int TAM=5;
		double soma=0;
		double baixo =0;double alto =0;int novo=0 ;int velho=0;
		int vetidade[] = new int[TAM];
		double vetaltura[] = new double[TAM];
		int somaidade=0;
		for (int x=0; x<TAM;x++) {
			System.out.println("Idade");
			vetidade[x]= entrada.nextInt();
			System.out.println("Altura");
			vetaltura[x] = entrada.nextDouble();
			soma = soma+vetaltura[x];
			somaidade = somaidade+vetidade[x];
			if(x==0) {
				baixo = vetaltura[x];
				alto = vetaltura[x];
				novo = vetidade[x];
				velho = vetidade[x];
			}
			if (vetidade[x]> velho) {
				velho = vetidade[x];
			}
			if (vetidade[x]<novo) {
				novo = vetidade[x];
			}
			if (vetaltura[x]> alto) {
				alto = vetaltura[x];
			}
			if (vetaltura[x]<baixo) {
				baixo = vetaltura[x];
			}
			
		}
		for (int x=0;x<TAM;x++) {
			if (soma/TAM> vetaltura[x]) {
				System.out.println("Altura " + vetaltura[x] + "  está acima da média.");
		}
			if (soma/TAM< vetaltura[x]) {
				System.out.println("Altura " + vetaltura[x] + "  está abaixo da média.");
		}
			if (somaidade/TAM> vetidade[x]) {
				System.out.println("Idade " + vetidade[x] + "  está acima da média.");
		}
			if (somaidade/TAM< vetidade[x]) {
				System.out.println("Idade " + vetidade[x] + "  está abaixo da média.");
		}}
		
			System.out.println();
			System.out.println("Mais velho: " +  velho);
			System.out.println("Mias alto: " +alto);
			System.out.println("Mais baixo: " +baixo);
			System.out.println("Mais novo: " + novo);
		
entrada.close();

}
}
