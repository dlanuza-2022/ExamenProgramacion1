package ui;

import java.util.Scanner;

import bll.Application;

public class Menu implements IMenu {
	Scanner sc = new Scanner(System.in);

	
	@Override
	public void show() {
		short op = 0;
		
		do {
			
			System.out.println();
			displayOptions();
			System.out.println();
			
			op = sc.nextShort();
			
			switch(op) {
			case 1:
				Application.bytesToKilobytes();
				
				break;
			case 2:
				Application.kilobytesToMegabytes();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Opción inválida.");
				break;
			
			}
			
			
		}while(op != 3);
		
		
		
	}

	@Override
	public void displayOptions() {
		System.out.println("====Menú principal====");
		System.out.println("1. Convertir de bytes a KIlobytes.");
		System.out.println("2. Convertir de Kilobytes a Megabytes.");
		System.out.println("3. Salir");
	}

}
