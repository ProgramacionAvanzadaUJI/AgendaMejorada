package menu;

import datos.Agenda;

/**
 * Created by oscar on 13/03/17.
 */
public enum OpcionMenu {
    SALIR("Salir", new Salir()),
    NUEVA_PERSONA("Nueva persona", new NuevaPersona()),
    NUEVA_EMPRESA("Nueva empresa", new NuevaEmpresa()),
    BUSCAR_POR_NOMBRE("Buscar por nombre", new BuscaPorNombre());

    private String descripcion;
    private EjecutaOpcion ejecutaOpcion;

    OpcionMenu(String descripcion, EjecutaOpcion ejecutaOpcion) {
        this.descripcion = descripcion;
        this.ejecutaOpcion = ejecutaOpcion;
    }

    public static String menu() {
        StringBuffer sb = new StringBuffer();
        for(OpcionMenu opcion: OpcionMenu.values()) {
            sb.append(opcion.ordinal());
            sb.append(".- ");
            sb.append(opcion.descripcion);
            sb.append("\n");
        }
        return sb.toString();
    }

    public static OpcionMenu filtraOpcion(int posicion) {
        return values()[posicion];
    }

    public void ejecuta(Agenda agenda) {
        ejecutaOpcion.ejecuta(agenda);
    }
}
