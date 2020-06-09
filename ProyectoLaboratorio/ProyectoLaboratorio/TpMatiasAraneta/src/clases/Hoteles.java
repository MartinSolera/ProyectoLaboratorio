package clases;

import java.lang.reflect.Array;

public class Hoteles extends Comerciales {
    private int CantidadPisos;

    public Hoteles(String nombre, String direccion, double metrosCuadrados, int tiempoEstimado, double costoPorMetroC, boolean estaTerminada, Array empleadosContratados, int contador, String nombreComercial, int cantidadPisos) {
        super(nombre, direccion, metrosCuadrados, tiempoEstimado, costoPorMetroC, estaTerminada, empleadosContratados, contador, nombreComercial);
        CantidadPisos = cantidadPisos;
    }

    /**no tiene el Array de Empleado**/
    public Hoteles(String nombre, String direccion, double metrosCuadrados, int tiempoEstimado, double costoPorMetroC, boolean estaTerminada, String nombreComercial, int cantidadPisos) {
        super(nombre, direccion, metrosCuadrados, tiempoEstimado, costoPorMetroC, estaTerminada, nombreComercial);
        CantidadPisos = cantidadPisos;
    }

    public int getCantidadPisos() {
        return CantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        CantidadPisos = cantidadPisos;
    }

	@Override
	public String toString() {
		return "Hoteles [CantidadPisos=" + CantidadPisos + "]";
	}
}
    