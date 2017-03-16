package menu;

import datos.Agenda;
import datos.Contacto;
import datos.Empresa;

import java.util.Scanner;

/**
 * Created by oscar on 14/03/17 for AgendaMejorable.
 */
public class NuevaEmpresa implements EjecutaOpcion {
    @Override
    public void ejecuta(Agenda agenda) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Telefono: ");
        String telefono = scanner.nextLine();
        Contacto contacto = new Empresa(nombre, telefono);
        agenda.nuevoContacto(contacto);

    }
}
