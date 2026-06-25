package data;

import model.*;

/**
 * Crea las instancias de prueba de los distintos servicios turísticos.
 * Centraliza la creación de objetos para que la capa de interfaz (Main) solo
 * se ocupe de mostrarlos.
 */
public class GestorServicios {

    /**
     * Crea un conjunto de servicios de prueba, con al menos dos objetos de cada
     * subclase.
     *
     * @return un arreglo de {@link ServicioTuristico} con los servicios creados
     */
    public ServicioTuristico[] crearServicios() {
        ServicioTuristico[] servicios = new ServicioTuristico[6];

        servicios[0] = new RutaGastronomica(3, "Sabores de Frutillar", 4);
        servicios[1] = new RutaGastronomica(2, "Ruta del Curanto Chilote", 3);

        servicios[2] = new PaseoLacustre(2, "Travesia Lago Llanquihue", "Catamaran");
        servicios[3] = new PaseoLacustre(3, "Navegacion Lago Todos los Santos", "Lancha");

        servicios[4] = new ExcursionCultural(5, "Iglesias de Chiloe", "Castro");
        servicios[5] = new ExcursionCultural(7, "Fuerte Bulnes", "Punta Arenas");

        return servicios;
    }
}