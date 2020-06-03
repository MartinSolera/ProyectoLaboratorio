package clases;

import java.lang.reflect.Array;

public class Comerciales extends Obras {

    private String nombreComercial;

    public Comerciales(String nombre, String direccion, double metrosCuadrados, int tiempoEstimado, double costoPorMetroC, boolean estaTerminada, Array empleadosContratados, int contador, String nombreComercial) {
        super(nombre, direccion, metrosCuadrados, tiempoEstimado, costoPorMetroC, estaTerminada);
        this.nombreComercial = nombreComercial;
    }

    public Comerciales(String nombre, String direccion, double metrosCuadrados, int tiempoEstimado, double costoPorMetroC, boolean estaTerminada, String nombreComercial) {
        super(nombre, direccion, metrosCuadrados, tiempoEstimado, costoPorMetroC, estaTerminada);
        this.nombreComercial = nombreComercial;
    }


    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    @Override
    public String toString() {
        return "\nComerciales{" +
                "\nnombreComercial='" + nombreComercial + '}';
    }
}
