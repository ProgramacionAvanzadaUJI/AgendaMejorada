package menu;

import datos.Agenda;

/**
 * Created by oscar on 14/03/17 for AgendaMejorable.
 */
public class Salir implements EjecutaOpcion {
    @Override
    public void ejecuta(Agenda agenda) {
        System.out.println("Adios");
    }
}
