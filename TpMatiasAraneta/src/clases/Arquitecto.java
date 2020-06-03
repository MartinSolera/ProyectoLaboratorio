package clases;

import Interfaz.Trabajo;


public class Arquitecto extends Empleado implements Trabajo {
    int matricula;

    public Arquitecto(String nombre, String tipoEmpleado, int dni, int tel, int matricula) {
        super(nombre, tipoEmpleado, dni, tel, 2000);
        this.matricula = matricula;
    }

    public Arquitecto() {

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    @Override
    public void trabajar() {
        System.out.println("Creando mi próximo plano");
    }

	@Override
	public String toString() {
		return "Arquitecto [matricula=" + matricula + "]";
	}

    
    
    
}
