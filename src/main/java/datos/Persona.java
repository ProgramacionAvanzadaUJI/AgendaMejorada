package datos;

/**
 * Created by oscar on 13/03/17 for AgendaMejorable.
 */
public class Persona extends Contacto {
    private String apellidos;

    public Persona() {
        super();
    }

    public Persona(String nombre, String apellidos, String telefono) {
        super(nombre, telefono);
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(getNombre());
        sb.append(", ");
		sb.append(apellidos);
		sb.append(", ");
        sb.append(getTelefono());
        sb.append("]");
        return sb.toString();

    }
}
