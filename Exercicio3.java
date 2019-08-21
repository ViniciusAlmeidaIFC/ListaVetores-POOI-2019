package com.Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Informe o tamanho do vetor!");
		final int TAM = entrada.nextInt();
		int vet[] = new int [TAM];
		int soma = 0;
		int maior = 0;
		int menor = 0;
		int contpar = 0;
		int contimpar = 0;
		double media = 0;
		int contamedia = 0;
		int contbmedia = 0;
		for (int x = 0; x < TAM; x++) {
			vet[x] = entrada.nextInt();
			soma = soma + vet[x];
			if (x == 0) {
				maior = vet[x];
				menor = vet[x];
			}
			else if (vet[x] > maior) {
				maior = vet[x];
			}
			else if (vet[x] < menor ) {
				menor = vet[x];
			}
			if (vet[x] % 2 == 0) {
				contpar++;}
			else {
				contimpar++;}
				}
		media = soma/TAM;
		for (int x = 0; x < TAM; x++) {
			if (vet[x] > media) 
				contamedia++;
			else 
				contbmedia++;
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
		int vetamedia[] = new int [contamedia];
		int vetbmedia[] = new int [contbmedia];
		int cont1amedia = 0;
		int cont1bmedia = 0;
		for (int x = 0; x < TAM; x++) {
			if (vet[x] > media ) {
				vetamedia[cont1amedia] = vet[x];
				cont1amedia++;}
			
			else {
				vetbmedia[cont1bmedia] = vet[x] ;
				cont1bmedia++;}
			}
			for (int x = 0; x < TAM; x++) {
				System.out.print(vet[x] + " | " );}
			
			System.out.println("Soma: "+ soma);
			System.out.println("Media: "+ media);
			System.out.println("Maior: "+ maior);
			System.out.println("Menor: "+ menor);
			System.out.println("");
			System.out.println("Pares ");
			for (int x = 0; x < contpar; x++) {
				System.out.print(vetpar[x] + " | " );
			}
			System.out.println("");
			System.out.println("Ímpares ");
			for (int x = 0; x < contimpar; x++) {
				System.out.print(vetimpar[x] + " | " );}
			
				System.out.println("");
				System.out.println("Acima da média ");
				for (int x = 0; x < contamedia; x++) {
					System.out.print(vetamedia[x] + " | " );
				}
				System.out.println("");
				System.out.println("Abaixo da média");
				for (int x = 0; x < contbmedia; x++) {
					System.out.print(vetbmedia[x] + " | " );}
			entrada.close();

}}
