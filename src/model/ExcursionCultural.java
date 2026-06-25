package model;

/**
 * Servicio turístico que representa una excursión cultural asociada a un
 * lugar histórico. Hereda de {@link ServicioTuristico}.
 */
public class ExcursionCultural extends ServicioTuristico {

    private String lugarHistorico;

    /**
     * Crea una excursión cultural.
     *
     * @param duracionHoras  duración en horas; debe ser mayor a 0
     * @param nombre         nombre de la excursión; no puede estar vacío
     * @param lugarHistorico lugar histórico; no puede estar vacío
     * @throws IllegalArgumentException si algún dato no cumple las validaciones
     */
    public ExcursionCultural(int duracionHoras, String nombre, String lugarHistorico) {
        super(duracionHoras, nombre);
        setLugarHistorico(lugarHistorico);
    }

    /** @return el lugar histórico de la excursión */
    public String getLugarHistorico() {
        return lugarHistorico;
    }

    /**
     * Asigna el lugar histórico de la excursión.
     *
     * @param lugarHistorico lugar histórico no vacío
     * @throws IllegalArgumentException si el lugar histórico es nulo o vacío
     */
    public void setLugarHistorico(String lugarHistorico) {
        if (lugarHistorico == null || lugarHistorico.isBlank()) {
            throw new IllegalArgumentException("Lugar historico obligatorio");
        }
        this.lugarHistorico = lugarHistorico;
    }

    /**
     * @return la información completa de la excursión, reutilizando el texto de
     *         la superclase y agregando el lugar histórico
     */
    @Override
    public String toString() {
        return "Excursion cultural: " + super.toString() + " | Lugar historico: " + lugarHistorico;
    }
}