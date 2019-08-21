package com.Exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        


			
			char alfabeto[] ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			String senha = "";
			int pos = 0;

			
			System.out.println("Informe a quantidade de letras para gerar a sua senha: ");
			int qtd = entrada.nextInt();
			
			for (int i = 0; i < qtd; i++) {
				
					pos = (int) (Math.random() * 26);

					
				senha = senha + alfabeto[pos];
			}
			System.out.println(senha);
			
			entrada.close();

	}

}
