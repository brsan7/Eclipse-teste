package com.brsan7.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		float divisao = divisao(a,b);
		int multiplicacao = multiplicacao(a,b);
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtraçao: " + subtracao);
		System.out.println("Divisão: " + divisao);
		System.out.println("Multiplicação: " + multiplicacao);

	}
	
	public static int soma (int a, int b) {
		return a + b;
	}
	public static int subtracao (int a, int b) {
		return a - b;
	}
	public static float divisao (int a, int b) {
		return (a+0F) / (b+0F);
	}
	public static int multiplicacao (int a, int b) {
		return a * b;
	}
}
