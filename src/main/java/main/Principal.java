package main;

import java.util.Scanner;

import datos.Agenda;

public class Principal {
	private Agenda agenda = new Agenda();
	private boolean salir = false;
	
	private Principal() {
		super();
	}
	
	private void muestraMenu() {
		System.out.println("0.- Salir.");
		System.out.println("1.- Nueva persona.");
		System.out.println("2.- Nueva empresa.");
		System.out.println("3.- Buscar por nombre.");
	}
	
	private void filtraOpcion(int opcion) {
		switch(opcion) {
			case 1:
				agenda.nuevaPersona();
				break;
			case 2:
				agenda.nuevaEmpresa();
				break;
			case 3:
				agenda.buscaPorNombre();
				break;
			case 0:
				salir = true;
				break;
		}
	}
	
	private void ejecuta() {
		Scanner scanner = new Scanner(System.in);
		int opcion;
		do {
			muestraMenu();
			System.out.print("Introduce una opción:");
			opcion = scanner.nextInt();
			filtraOpcion(opcion);
		} while(salir != true);
	}
	
	public static void main(String[] args) {
		new Principal().ejecuta();
	}
}
