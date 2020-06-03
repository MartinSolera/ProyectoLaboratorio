package clases;

import java.lang.reflect.Array;

public class Domestica extends Obras{

    private int cantidadHabitaciones;


    public Domestica(String nombre, String direccion, double metrosCuadrados, int tiempoEstimado, double costoPorMetroC, boolean estaTerminada, Array empleadosContratados, int contador, int cantidadHabitaciones) {
        super(nombre, direccion, metrosCuadrados, tiempoEstimado, costoPorMetroC, estaTerminada);
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Domestica(String nombre, String direccion, double metrosCuadrados, int tiempoEstimado, double costoPorMetroC, boolean estaTerminada, int cantidadHabitaciones) {
        super(nombre, direccion, metrosCuadrados, tiempoEstimado, costoPorMetroC, estaTerminada);
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

	@Override
	public String toString() {
		return "Domestica [cantidadHabitaciones=" + cantidadHabitaciones + "]";
	}
	
    
}