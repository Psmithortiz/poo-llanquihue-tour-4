package model;

/**
 * Representa un servicio turístico genérico de la agencia Llanquihue Tour.
 * Define los atributos comunes a todos los servicios (nombre y duración) y
 * actúa como superclase de la jerarquía.
 */
public class ServicioTuristico {

    private String nombre;
    private int duracionHoras;

    /**
     * Crea un servicio turístico. La validación se delega en los setters, de
     * modo que un objeto nunca pueda existir en estado inválido.
     *
     * @param duracionHoras duración del servicio en horas; debe ser mayor a 0
     * @param nombre        nombre del servicio; no puede estar vacío
     * @throws IllegalArgumentException si algún dato no cumple las validaciones
     */
    public ServicioTuristico(int duracionHoras, String nombre) {
        setNombre(nombre);
        setDuracionHoras(duracionHoras);
    }

    /** @return el nombre del servicio */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre del servicio.
     *
     * @param nombre nombre no vacío
     * @throws IllegalArgumentException si el nombre es nulo o está vacío
     */
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }
        this.nombre = nombre;
    }

    /** @return la duración del servicio en horas */
    public int getDuracionHoras() {
        return duracionHoras;
    }

    /**
     * Asigna la duración del servicio.
     *
     * @param duracionHoras duración en horas; debe ser mayor a 0
     * @throws IllegalArgumentException si la duración es menor o igual a 0
     */
    public void setDuracionHoras(int duracionHoras) {
        if (duracionHoras <= 0) {
            throw new IllegalArgumentException("Duracion de horas debe ser mayor a 0");
        }
        this.duracionHoras = duracionHoras;
    }

    /**
     * Devuelve la representación común a todos los servicios: nombre y duración.
     * Las subclases reutilizan este texto con {@code super.toString()} y le
     * anteponen su tipo más sus atributos propios.
     *
     * @return el nombre y la duración del servicio
     */
    @Override
    public String toString() {
        return nombre + " (" + duracionHoras + " hrs)";
    }
}