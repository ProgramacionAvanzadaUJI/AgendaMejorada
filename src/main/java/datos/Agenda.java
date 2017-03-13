package datos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
	private List<Contacto> contactos;
	public static final Contacto NULL = new Empresa("No encontrado", "");

	public Agenda() {
		super();
		contactos = new ArrayList<>();
	}
	
	public void nuevoContacto(Contacto contacto) {
		contactos.add(contacto);
	}
	
	public Contacto buscaPorNombre(String nombre)  {
		Contacto encontrado = NULL;
		for(Contacto contacto: contactos)
			if(nombre.equals(contacto.getNombre())) {
				encontrado = contacto;
				break;
			}
		return encontrado;
	}
}
