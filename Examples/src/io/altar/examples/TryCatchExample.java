package io.altar.examples;

import java.util.Scanner;

public class TryCatchExample {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		getNumero();

	}

	/*em vez de mandar o programa abaixo quando nao insero um caracter, ele volta a chamar a programa.*/
	public static void getNumero() {
		System.out.println("Numero : ");
		try {
			int value = sc.nextInt();
			System.out.println("Value : " + value);
			clearScanner();
		} catch (Exception e) {
			System.out.println("Tem de inserir um numero!");
			clearScanner();
			getNumero();
		} finally {
			System.out.print("Boa");
		}
	}

	/*Limpa a cache do buffer do scanner \n (enter)*/
	public static void clearScanner() {
		sc.nextLine();
	}

}
