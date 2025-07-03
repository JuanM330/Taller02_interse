package Modelo;

/**
 *
 * @author Juan
 */
public class Diagnostico {
    private String descripcion;
    private String tratamiento;

    public Diagnostico(String descripcion, String tratamiento) {// creamos constructor y getters y setters
        this.descripcion = descripcion;
        this.tratamiento = tratamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
     public boolean esTratamientoLargo() { 
        return tratamiento.length() > 30; // me va evaluar la longitud, si es mayor que 30 va a arrojar true y si es menor false
     }
}
