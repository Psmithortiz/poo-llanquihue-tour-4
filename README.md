# LlanquihueTourApp — Semana 6: Jerarquía de clases con herencia simple

## Autor del proyecto

- **Nombre completo:** Pablo Smith
- **Carrera:** Analista Programador
- **Sede:** Campus Online

---

## Objetivo de la semana

Implementar una jerarquía de clases con herencia simple para modelar los
distintos servicios turísticos de la agencia Llanquihue Tour. Se define una
clase base con los atributos comunes y subclases que la extienden con sus
atributos propios, aplicando atributos heredados, uso de `super(...)` y
sobrescritura de `toString()`.

---

## Descripción general del sistema

El sistema representa los servicios que ofrece la agencia Llanquihue Tour
(Región de Los Lagos). Todos los servicios comparten un nombre y una duración,
pero cada categoría agrega información propia. Para reutilizar lo común y
especializar lo particular se diseñó una jerarquía con una superclase
(`ServicioTuristico`) y tres subclases.

Cada clase de dominio valida sus propios datos en sus setters, y los
constructores delegan en esos setters, de modo que un objeto nunca pueda existir
en estado inválido. La aplicación crea instancias de prueba y las muestra por
consola aprovechando el polimorfismo: cada objeto se imprime con el `toString()`
de su tipo real, sin necesidad de comprobar el tipo con `instanceof`.

---

## Clases creadas

- **`ServicioTuristico`** (superclase): atributos `nombre` y `duracionHoras`.
  Concentra la validación y el formato común mediante su `toString()`.
- **`RutaGastronomica`** (subclase): agrega `numeroDeParadas`.
- **`PaseoLacustre`** (subclase): agrega `tipoEmbarcacion`.
- **`ExcursionCultural`** (subclase): agrega `lugarHistorico`.
- **`GestorServicios`**: crea las instancias de prueba (dos de cada subclase) y
  las devuelve en un arreglo de `ServicioTuristico`.
- **`Main`**: solicita los servicios al gestor y los muestra por consola.

---

## Estructura del proyecto

```
src/
├── model/   Jerarquía de clases (ServicioTuristico y subclases)
├── data/    GestorServicios, encargada de crear las instancias de prueba
└── ui/      Main, punto de entrada que muestra los resultados
```

---

## Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

   ```
   git clone https://github.com/Psmithortiz/poo-llanquihue-tour-4
   ```

2. Abre el proyecto en IntelliJ IDEA.
3. Ejecuta el archivo `Main.java` desde el paquete `ui`.
4. Revisa la salida en la consola: se imprimen los seis servicios de prueba.

---

**Repositorio GitHub:** https://github.com/Psmithortiz/poo-llanquihue-tour-4

**Fecha de entrega:** [29/06/2026]