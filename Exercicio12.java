package com.Exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
        
		System.out.print("Insira as entradas separadas por ;: ");
        String entradas  = entrada.nextLine();
		
        String separado[] = entradas.split(";");
        
        for (int i = 0; i < separado.length; i++) {
			System.out.println(separado[i]);
		}
        entrada.close();
	}

}
