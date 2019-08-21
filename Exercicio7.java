package com.Exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);

		final int NOTA=4;
		int vetn[] = new int[NOTA];
		final int MEDIA=10;
		int vetm[] = new int[MEDIA];
		int num=0;
		for (int y=0; y<MEDIA;y++) {
			for (int x=0;x<NOTA;x++) {
			 System.out.println("Digite a nota " +x+ " do aluno " + y);
			 vetn[x]= entrada.nextInt();
			 vetm[y]=vetm[y]+vetn[x];}
			 
		if ((vetm[y]/4) >= 7) {
			num++;	
		}
		}
		System.out.println(num +" com média acima ou igual a 7");
entrada.close();

	}

}
