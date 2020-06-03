package clases;

import Interfaz.Trabajo;

public class Obrero extends Empleado implements Trabajo {
   private int edad;

    public Obrero(String nombre, String tipoEmpleado, int dni, int tel, int edad) {
        super(nombre, tipoEmpleado, dni, tel, 1500);
        this.edad = edad;
    }

    public Obrero() {

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void trabajar() {
        System.out.println("Soy obrero y construyo");
    }

	@Override
	public String toString() {
		return "Obrero [edad=" + edad + "]";
	}
    
}
