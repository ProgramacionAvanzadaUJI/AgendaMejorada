package datos;

public class Contacto {

	private String nombre;
	private String apellidos;
	private String telefono;

	public Contacto() {
		super();
		nombre = "";
		telefono = "";
	}

	public Contacto(String nombre, String apellidos, String telefono) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(nombre);
		builder.append(", ");
		builder.append(apellidos);
		builder.append(", ");
		builder.append(telefono);
		builder.append("]");
		return builder.toString();
	}

	
	
}