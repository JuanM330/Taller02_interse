package Modelo;

/**
 *
 * @author Juan
 */
public class Main {
  
    
    public static void main(String[] args) {
        Diagnostico diag = new Diagnostico("Dolor de cola", "Reposo por 10 días y fisioterapia");// creamos el main  y colocamos los datos de consulta y diagnostico
        Consulta c = new Consulta("1345", "3 de julio", diag);

        c.mostrarConsulta(); // este método debe imprimir todo
        
       boolean esLargo = c.getDiagnostico().esTratamientoLargo();   //estoy llamando al metodo de la otra clase


        if (esLargo) {
            System.out.println("➡ El tratamiento es largo.");
        } else {
            System.out.println("➡ El tratamiento es corto.");
        }
    }
    }

