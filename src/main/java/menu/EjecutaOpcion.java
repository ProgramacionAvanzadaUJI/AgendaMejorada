package menu;

import datos.Agenda;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by oscar on 14/03/17 for AgendaMejorable.
 */
public interface EjecutaOpcion {
    Scanner TECLADO = new Scanner(System.in);
    PrintStream CONSOLA =  System.out;
    void ejecuta(Agenda agenda);
}
