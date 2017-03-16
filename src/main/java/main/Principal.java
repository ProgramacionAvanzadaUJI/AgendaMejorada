package main;

import java.util.Scanner;

import datos.Agenda;
import menu.OpcionMenu;

public class Principal {
	private Agenda agenda = new Agenda();

	private Principal() {
		super();
	}
	
//	private void filtraOpcion(OpcionMenu opcion) {
//		switch(opcion) {
//			case NUEVA_PERSONA:
//				nuevaPersona();
//				break;
//			case NUEVA_EMPRESA:
//				nuevaEmpresa();
//				break;
//			case BUSCAR_POR_NOMBRE:
//				buscaPorNombre();
//				break;
//			case SALIR:
//				break;
//		}
//	}

//	private void nuevaPersona() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Nombre: ");
//		String nombre = scanner.nextLine();
//		System.out.print("Apellidos: ");
//		String apellidos = scanner.nextLine();
//		System.out.print("Telefono: ");
//		String telefono = scanner.nextLine();
//		Contacto contacto = new Persona(nombre, apellidos, telefono);
//		agenda.nuevoContacto(contacto);
//	}

//	private void nuevaEmpresa() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Nombre: ");
//		String nombre = scanner.nextLine();
//		System.out.print("Telefono: ");
//		String telefono = scanner.nextLine();
//		Contacto contacto = new Empresa(nombre, telefono);
//		agenda.nuevoContacto(contacto);
//	}

//	private void buscaPorNombre() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Nombre a buscar: ");
//		String nombre = scanner.nextLine();
//		System.out.println(agenda.buscaPorNombre(nombre));
//	}
	
	private void ejecuta() {
		Scanner scanner = new Scanner(System.in);
		OpcionMenu opcionMenu;
		do {
			System.out.println(OpcionMenu.menu());
			System.out.print("Introduce una opción:");
			opcionMenu = OpcionMenu.filtraOpcion(scanner.nextInt());
//			filtraOpcion(opcionMenu);
			opcionMenu.ejecuta(agenda);
		} while(opcionMenu != OpcionMenu.SALIR);
	}
	
	public static void main(String[] args) {
		new Principal().ejecuta();
	}
}
