package model;

/**
 * Servicio turístico que representa una ruta gastronómica con un número
 * determinado de paradas. Hereda de {@link ServicioTuristico}.
 */
public class RutaGastronomica extends ServicioTuristico {

    private int numeroDeParadas;

    /**
     * Crea una ruta gastronómica.
     *
     * @param duracionHoras   duración en horas; debe ser mayor a 0
     * @param nombre          nombre de la ruta; no puede estar vacío
     * @param numeroDeParadas cantidad de paradas; no puede ser negativa
     * @throws IllegalArgumentException si algún dato no cumple las validaciones
     */
    public RutaGastronomica(int duracionHoras, String nombre, int numeroDeParadas) {
        super(duracionHoras, nombre);
        setNumeroDeParadas(numeroDeParadas);
    }

    /** @return el número de paradas de la ruta */
    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    /**
     * Asigna el número de paradas de la ruta.
     *
     * @param numeroDeParadas cantidad de paradas; no puede ser negativa
     * @throws IllegalArgumentException si el número de paradas es negativo
     */
    public void setNumeroDeParadas(int numeroDeParadas) {
        if (numeroDeParadas < 0) {
            throw new IllegalArgumentException("Numero de paradas debe ser mayor a 0");
        }
        this.numeroDeParadas = numeroDeParadas;
    }

    /**
     * @return la información completa de la ruta, reutilizando el texto de la
     *         superclase y agregando el número de paradas
     */
    @Override
    public String toString() {
        return "Ruta gastronomica: " + super.toString() + " | Paradas: " + numeroDeParadas;
    }
}