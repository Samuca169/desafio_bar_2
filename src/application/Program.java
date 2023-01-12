package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Sexo: ");
		char sexo = sc.next().charAt(0);
		System.out.print("Quantidade de cerveja: ");
		int cerveja = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		int refri = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		int espetinhos = sc.nextInt();
		
		Bill bill = new Bill(sexo, cerveja, espetinhos, refri);
		
		double consumo = bill.feeding();
		double couvert = bill.cover();
		double ingresso = bill.ticket();
		double total = bill.total();
		
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.println("Consumo = R$ " + String.format("%.2f", consumo));
		if (couvert == 0.0) {
			System.out.println("Isento de Couvert");
		}else {
			System.out.println("Couvert = R$ " + String.format("%.2f", couvert));
		}
		System.out.println("Ingresso = R$ " + String.format("%.2f", ingresso));
		
		System.out.println();
		System.out.println("Valor a pagar = R$ " + String.format("%.2f", total));
		sc.close();
	}

}
