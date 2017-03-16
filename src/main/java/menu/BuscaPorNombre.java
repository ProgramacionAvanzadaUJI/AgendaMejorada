package menu;

import datos.Agenda;

import java.util.Scanner;

/**
 * Created by oscar on 14/03/17 for AgendaMejorable.
 */
class BuscaPorNombre implements EjecutaOpcion {
    @Override
    public void ejecuta(Agenda agenda) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre a buscar: ");
        String nombre = scanner.nextLine();
        System.out.println(agenda.buscaPorNombre(nombre));

    }
}
