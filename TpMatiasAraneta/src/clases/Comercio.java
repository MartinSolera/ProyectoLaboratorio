package clases;

import java.lang.reflect.Array;


public class Comercio extends Comerciales {
    private String rubro;

    public Comercio(String nombre, String direccion, double metrosCuadrados, int tiempoEstimado, double costoPorMetroC, boolean estaTerminada, Array empleadosContratados, int contador, String nombreComercial, String rubro) {
        super(nombre, direccion, metrosCuadrados, tiempoEstimado, costoPorMetroC, estaTerminada, empleadosContratados, contador, nombreComercial);
        this.rubro = rubro;
    }
    
    
    /*sin el Array de Empleado*/ 
    public Comercio(String nombre, String direccion, double metrosCuadrados, int tiempoEstimado, double costoPorMetroC,  boolean estaTerminada, String nombreComercial, String rubro) {
        super(nombre, direccion, metrosCuadrados, tiempoEstimado, costoPorMetroC, estaTerminada, nombreComercial);
        this.rubro = rubro;
    }


    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    @Override
    public String toString() {
        return "\nComercios{" +
                "\nrubro='" + rubro + '\'' +
                '}';
    }
}
