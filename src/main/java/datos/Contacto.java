package datos;

public class Contacto {

	private String nombre;
	private String telefono;

	public Contacto() {
		super();
		nombre = "";
		telefono = "";
	}

	public Contacto(String nombre, String telefono) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(nombre);
		builder.append(", ");
		builder.append(telefono);
		builder.append("]");
		return builder.toString();
	}

	
	
}