package model;

/**
 * Servicio turístico que representa un paseo lacustre, realizado en un
 * determinado tipo de embarcación. Hereda de {@link ServicioTuristico}.
 */
public class PaseoLacustre extends ServicioTuristico {

    private String tipoEmbarcacion;

    /**
     * Crea un paseo lacustre.
     *
     * @param duracionHoras   duración en horas; debe ser mayor a 0
     * @param nombre          nombre del paseo; no puede estar vacío
     * @param tipoEmbarcacion tipo de embarcación; no puede estar vacío
     * @throws IllegalArgumentException si algún dato no cumple las validaciones
     */
    public PaseoLacustre(int duracionHoras, String nombre, String tipoEmbarcacion) {
        super(duracionHoras, nombre);
        setTipoEmbarcacion(tipoEmbarcacion);
    }

    /** @return el tipo de embarcación del paseo */
    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    /**
     * Asigna el tipo de embarcación del paseo.
     *
     * @param tipoEmbarcacion tipo de embarcación no vacío
     * @throws IllegalArgumentException si el tipo de embarcación es nulo o vacío
     */
    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        if (tipoEmbarcacion == null || tipoEmbarcacion.isBlank()) {
            throw new IllegalArgumentException("Tipo de embarcacion obligatorio");
        }
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    /**
     * @return la información completa del paseo, reutilizando el texto de la
     *         superclase y agregando el tipo de embarcación
     */
    @Override
    public String toString() {
        return "Paseo Lacustre: " + super.toString() + " | Tipo embarcacion: " + tipoEmbarcacion;
    }
}