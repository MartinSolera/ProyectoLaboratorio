package clases;


public class Main {

	public static void main(String[] args) {
	
		//Arquitecto
		
		Arquitecto Sergio = new Arquitecto("Sergio", "Arquitecto", 20129678, 1295473, 1000);
		Arquitecto Osvaldo = new Arquitecto("Osvaldo", "Arquitecto", 23457893, 1285136, 1000);
		//Arquitecto Maria = new Arquitecto("Maria", "Arquitecta", 26796344, 1296453, 1500);
        //Maestro 
		       
		Maestro Gustavo = new Maestro("Gustavo", "Maestro mayor de obra", 12234896, 2687964, 36);
		Maestro Heraldo = new Maestro("Heraldo", "Maestro mayor de obra", 12567436,3678963, 55);
		//Maestro Daniel = new Maestro("Daniel", "Maestro mayor de obra", 12569873,4001753, 24);
        //Obreros
      
		Obrero Ernesto = new Obrero("Ernesto", "Obrero", 16789321, 22345612, 50);
		Obrero Ismael = new Obrero("Ismael", "Obrero", 12603123, 22348446, 40);
		//Obrero Matias = new Obrero("Matias", "Obrero", 32554449, 2235553, 22);
        //Lista Empleados
		
		/// Punto 2a
        Ernesto.trabajar();
        Gustavo.trabajar();
        Ismael.trabajar();
		
        Empleado empleados[] = new Empleado[6];

        empleados[0] = Sergio;
        empleados[1] = Osvaldo;
        empleados[2] = Gustavo;
        empleados[3] = Heraldo;
        empleados[4] = Ernesto;
        empleados[5] = Ismael;
        
        
        ///
        
        Comerciales Asterloa = new Comerciales("Asterloa", "Moreno 3246", 200, 150, 10, false, "Tutituteish");
        Hoteles Borbon = new Hoteles("Borbon", "La Rioja 2136", 500, 250, 300, false, "Borbon", 16);
        Domestica casas = new Domestica("Country", "Belgrano 2005", 2000, 800, 250, false, 6);
        
        Obras obras1[] = new Obras[3];

        
        obras1[0] = Asterloa;
        obras1[1] = Borbon;
        obras1[2] = casas;
        
        
       
	    ////PUNTO 2b
        Empresa Amadeo= new Empresa("Amadeo");
        System.out.println(Amadeo.getFechaInicio());
        Amadeo.setListaEmpleado(empleados);
        Amadeo.getListaEmpleados();
        Amadeo.setListaObras(obras1);
        Amadeo.getListaObras();

        //2.C) 
        double costoDomestica = casas.calculoObras();
        double costoComercial = Asterloa.calculoObras();
        double costoHotel = Borbon.calculoObras();

        
        System.out.println("El costo de la obra Domestica es: " + costoDomestica);
        System.out.println("El costo de la obra Comercial es: " + costoComercial);
        System.out.println("El costo de la obra Hotel es: " + costoHotel);
        
      
        ///2d y 2e ya estan resueltos

        //2.F)
        Amadeo.listadoCostoObras();


        
		}
}