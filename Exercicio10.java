package com.Exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);		
		System.out.println("Informe uma mensagem: ");
		String texto = entrada.nextLine();
		
		char [] letras = texto.toCharArray();
		
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		
		entrada.close();

	}

}
