package menu;

import datos.Agenda;

/**
 * Created by oscar on 13/03/17.
 */
public enum OpcionMenu {
    SALIR("Salir"),
    NUEVA_PERSONA("Nueva persona"),
    NUEVA_EMPRESA("Nueva empresa"),
    BUSCAR_POR_NOMBRE("Buscar por nombre");

    private String descripcion;

    OpcionMenu(String descripcion) {
        this.descripcion = descripcion;
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
}
