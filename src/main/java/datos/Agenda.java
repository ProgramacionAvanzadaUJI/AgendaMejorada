package datos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
	private List<Contacto> contactos;

	public Agenda() {
		super();
		contactos = new ArrayList<Contacto>();
	}
	
	public void nuevaPersona() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nombre: ");
		String nombre = scanner.nextLine();
		System.out.print("Apellidos: ");
		String apellidos = scanner.nextLine();
		System.out.print("Telefono: ");
		String telefono = scanner.nextLine();
		Contacto contacto = new Contacto(nombre, apellidos, telefono);
		contactos.add(contacto);
	}
	
	public void nuevaEmpresa() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nombre: ");
		String nombre = scanner.nextLine();
		System.out.print("Telefono: ");
		String telefono = scanner.nextLine();
		Contacto contacto = new Contacto(nombre, "", telefono);
		contactos.add(contacto);
	}
	
	public void buscaPorNombre() {
		boolean encontrado = false;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nombre a buscar: ");
		String nombre = scanner.nextLine();
		for(Contacto contacto: contactos)
			if(nombre.equals(contacto.getNombre())) {
				System.out.println(contacto);
				encontrado = true;
			}
		if(encontrado == false) System.out.println("Nada con ese nombre");
	}
}
