package com.Exercicios;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int qtd;
		
		do {
        System.out.println("Insira a quantidade de números entre 0 e 20 para verificação : ");
        qtd = entrada.nextInt();
        }while (qtd < 0 || qtd > 20);
        
        	int numero[] = new int[qtd];   
        
            for (int i = 0; i < numero.length; i++) {

                    System.out.print("Insira o número: ");
                    numero[i] = entrada.nextInt();
	
	        while((numero[i]<0)||(numero[i]>20)){
                    System.out.print("Insira um número válido: ");
                    numero[i] = entrada.nextInt();
                }
		
            }
            
        System.out.println("Gráfico: ");
        
            for (int i = 0; i < numero.length; i++) {
                System.out.print("\n"+numero[i]+": ");
                for (int j = 0; j < numero[i]; j++) {
                    System.out.print("#");
                }
                
            }
            
         entrada.close();
	}

}
