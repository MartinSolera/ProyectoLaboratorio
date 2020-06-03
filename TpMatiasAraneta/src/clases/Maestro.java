package clases;

import Interfaz.Trabajo;

public class Maestro extends Empleado implements Trabajo {
    private int edad;

    public Maestro(String nombre, String tipoEmpleado, int dni, int tel, int edad) {
        super(nombre, tipoEmpleado, dni, tel, 1800);
        this.edad = edad;
    }

    public Maestro() {
        super();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void trabajar() {
        System.out.println("Soy maestro y superviso las construcciones");
    }

	@Override
	public String toString() {
		return "Maestro [edad=" + edad + "]";
	}

}
