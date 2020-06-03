package clases;

	public class Empleado {
	
	    private String nombre;
	    private String tipoEmpleado;
	    private int dni;
	    private int tel;
	    private double costoPorDia;
	
	public Empleado(String nombre, String tipoEmpleado, int dni, int tel, double costoPorDia) {
	    this.nombre = nombre;
	    this.tipoEmpleado = tipoEmpleado;
	    this.dni = dni;
	    this.tel = tel;
	    this.costoPorDia = costoPorDia;
	}
	
	public Empleado() {
	
	}
	
	public String getNombre() {
	    return nombre;
	}
	
	public int getDni() {
	    return dni;
	}
	
	public int getTel() {
	    return tel;
	}
	
	public double getCostoPorDia() {
	    return costoPorDia;
	}
	
	public void setNombre(String nombre) {
	    this.nombre = nombre;
	}
	
	public void setDni(int dni) {
	    this.dni = dni;
	}
	
	public void setTel(int tel) {
	    this.tel = tel;
	}
	
	public void setCostoPorDia(double costoPorDia) {
	    this.costoPorDia = costoPorDia;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", tipoEmpleado=" + tipoEmpleado + ", dni=" + dni + ", tel=" + tel
				+ ", costoPorDia=" + costoPorDia + "]";
	}
	
	
	
}