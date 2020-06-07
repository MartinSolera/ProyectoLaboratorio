package com.company;
import java.util.Calendar;
public class Main {

    public static void main(String[] args) {

        /// PROBANDO DE CREAR UN USUARIO EN DONDE SE AGREGE A EMPRESA, Y SE LO MUESTRE.

        Usuario usuario1 = new Usuario("","",0,0);
        usuario1.crearUsuaruio();
        Empresa empresa = new Empresa("Aerotaxi Club");
        empresa.agregarUsuaruio(usuario1);
        empresa.mostrarUsuarios();



    }
}
