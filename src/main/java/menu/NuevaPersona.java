package menu;

import datos.Agenda;
import datos.Contacto;
import datos.Persona;

import java.util.Scanner;

/**
 * Created by oscar on 14/03/17 for AgendaMejorable.
 */
public class NuevaPersona implements EjecutaOpcion {

    @Override
    public void ejecuta(Agenda agenda) {
//        Scanner scanner = new Scanner(System.in);
        CONSOLA.print("Nombre: ");
        String nombre = TECLADO.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = TECLADO.nextLine();
        System.out.print("Telefono: ");
        String telefono = TECLADO.nextLine();
        Contacto contacto = new Persona(nombre, apellidos, telefono);
        agenda.nuevoContacto(contacto);

    }
}
