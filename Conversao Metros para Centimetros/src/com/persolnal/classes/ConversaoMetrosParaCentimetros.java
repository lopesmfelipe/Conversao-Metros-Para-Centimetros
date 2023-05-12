package com.persolnal.classes;

import java.util.Scanner;

public class ConversaoMetrosParaCentimetros {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe uma quantidade de metros");
		
		double metros = scan.nextDouble();
		double centimetros = metros * 100;
		
		System.out.println(metros + " metros tem " + centimetros + " centímetros");

		
		

	}

}
