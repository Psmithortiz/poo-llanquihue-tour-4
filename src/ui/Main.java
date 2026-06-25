package ui;

import data.GestorServicios;
import model.ServicioTuristico;

/**
 * Punto de entrada de la aplicación. Solicita los servicios de prueba al
 * {@link GestorServicios} y los muestra por consola. Aprovecha el polimorfismo:
 * cada objeto se imprime con el toString() de su tipo real.
 */
public class Main {

    public static void main(String[] args) {
        GestorServicios gestor = new GestorServicios();
        ServicioTuristico[] servicios = gestor.crearServicios();

        for (ServicioTuristico servicio : servicios) {
            System.out.println(servicio);
        }
    }
}