package Modelo;

/**
 *
 * @author Juan
 */
public class Consulta {
    private String codigo;
    private String fecha;
    private Diagnostico diagnostico;
  
    public Consulta(String codigo, String fecha, Diagnostico diagnostico) {// hacemos el constructor de la clase y creamos los get y set
        this.codigo = codigo;
        this.fecha = fecha;
        this.diagnostico = diagnostico;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }
    public void mostrarConsulta() {   // este metodo va mostrar los datos de la consulta
    System.out.println("Código: " + codigo);
    System.out.println("Fecha: " + fecha);
    System.out.println("Diagnóstico:");
    System.out.println("  Descripcion: " + diagnostico.getDescripcion());
    System.out.println("  Tratamiento: " + diagnostico.getTratamiento());
}
}
