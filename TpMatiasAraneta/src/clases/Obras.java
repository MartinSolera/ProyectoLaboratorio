package clases;


public class Obras extends Empresa {

    private String direccion;
    private double metrosCuadrados;
    private int tiempoEstimado;
    private double costoPorMetroC;
    private boolean estaTerminada;
    private Empleado[] empleadosContratados;
    private int contador;

    public Obras(String nombre, String direccion, double metrosCuadrados, int tiempoEstimado, double costoPorMetroC, boolean estaTerminada) {
        super(nombre);
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        this.tiempoEstimado = tiempoEstimado;
        this.costoPorMetroC = costoPorMetroC;
        this.estaTerminada = estaTerminada;
        empleadosContratados = new Empleado[contador];
        this.contador = 0;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public double getCostoPorMetroC() {
        return costoPorMetroC;
    }

    public boolean isEstaTerminada() {
        return estaTerminada;
    }

    public Empleado[] getEmpleadosContratados() {
        return empleadosContratados;
    }

    public int getContador() {
        return contador;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public void setCostoPorMetroC(double costoPorMetroC) {
        this.costoPorMetroC = costoPorMetroC;
    }

    public void setEstaTerminada(boolean estaTerminada) {
        this.estaTerminada = estaTerminada;
    }

    public void setEmpleadosContratados(Empleado[] empleadosPasados) {
        Arquitecto arqui = new Arquitecto();
        Maestro master  = new Maestro();
        Obrero albanil = new Obrero();

        int contador_arqui = 0;
        int contador_mayor = 0;
        int contador_obrero = 0;

        boolean comprobacion_arqui = true;
        boolean comprobacion_mayor = true;
        boolean comprobacion_albanil = true;

        for (int i = 0; i<empleadosPasados.length; i++){
            if (arqui.equals(empleadosPasados[i])) {
                contador_arqui++;
            }
        }

        if (contador_arqui>1){
            comprobacion_arqui = false;
        }

        for (int i = 0; i<empleadosPasados.length; i++) {
            if (master.equals(empleadosPasados[i])) {
                contador_mayor++;
            }
        }

        if (contador_mayor < 1 && contador_mayor > 3) {
            comprobacion_mayor = false;
        }

        for(int i = 0; i<empleadosPasados.length; i++) {
            if (albanil.equals(empleadosPasados[i])) {
                contador_obrero++;
            }
        }

        if (contador_obrero<2){
            comprobacion_albanil = false;
        }

        if (!comprobacion_arqui){
            System.out.println("Error. Solo puede haber 1 arquitecto por obra.");
        }
        if (!comprobacion_mayor){
            System.out.println("Error. Solo puede haber minimo un maestro y maximo 3");
        }
        if (!comprobacion_albanil){
            System.out.println("Error. Solo puede haber minimo 2 obreros.");
        }
        if(comprobacion_arqui && comprobacion_mayor && comprobacion_albanil) {
            System.out.println("Todos tus empleados han sido agregados con exito");
        }

    }




    public double calculoObras() {
        double resultadoCostosEmpleados = 0;
            for(Empleado x : empleadosContratados) {
                resultadoCostosEmpleados = resultadoCostosEmpleados + x.getCostoPorDia();
            }
        //Para que sea mas eficiente, hacer una comprobacion con un if para ver si hay empleados en la obra
        double total = (costoPorMetroC * metrosCuadrados) + (resultadoCostosEmpleados * tiempoEstimado);

        return total;
     }

    @Override
    public String toString() {
        return "Obras{" +
                "\ndireccion='" + direccion +
                ", \nmetrosCuadrados=" + metrosCuadrados +
                ", \ntiempoEstimado=" + tiempoEstimado +
                ", \ncostoPorMetroC=" + costoPorMetroC +
                ", \nestaTerminada=" + estaTerminada +
                ", \nempleadosContratados=" + empleadosContratados +
                ", \ncontador=" + contador +
                '}';
    }
}
