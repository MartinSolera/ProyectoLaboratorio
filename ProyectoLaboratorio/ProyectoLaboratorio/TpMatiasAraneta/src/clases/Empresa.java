package clases;

import java.util.Calendar; //sirve para usar datos como fechas del calendario)


public class Empresa {

    private String nombre;
    private Calendar fechaInicio;
    private Empleado[] arrayEmpleados;
    private Obras[] arrayObras;


    public Empresa(String nombre) {
        this.nombre = nombre;
        this.fechaInicio = Calendar.getInstance();
        this.arrayEmpleados = new Empleado[0];
        this.arrayObras = new Obras[0];
    }

    public Empresa() {

    }

    public void setListaEmpleado(Empleado[] listaEmpleados){
        this.arrayEmpleados = listaEmpleados;
    }

    public void setListaObras(Obras[] listaObras){
        this.arrayObras = listaObras;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaInicio() {
        String cadenaFecha = String.format("%02d-%02d-%04d",
                fechaInicio.get(Calendar.DAY_OF_MONTH),
                fechaInicio.get(Calendar.MONTH)+1,
                fechaInicio.get(Calendar.YEAR));

        return "Fecha de inicio: " + cadenaFecha;
    }

    public void getListaEmpleados() {
        for (int i=0; i<arrayEmpleados.length; i++){

            System.out.println(arrayEmpleados[i].toString());

        }
    }

    public void getListaObras(){
        for(int i=0; i<arrayObras.length; i++){

            System.out.println(arrayObras[i].toString());

        }
    }

    public void listadoCostoObras(){
        double costoObras = 0;

        for(int i = 0; i<arrayObras.length; i++){

            System.out.println(arrayObras[i].toString());
            System.out.println("Costo de la obra: " + arrayObras[i].calculoObras());

        }



    }

    @Override
    public String toString() {
        return "Empresa: " + "nombre de la Empresa: " + nombre + '\n' + " Fecha de inicio: " + fechaInicio + '\n';
    }

}


