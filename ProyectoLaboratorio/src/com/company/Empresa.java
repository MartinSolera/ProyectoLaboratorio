package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Empresa {
    private String nombre;
    private HashMap<Integer, Usuario> mapUsuarios;


    public Empresa(String nombre){
        this.nombre = nombre;
        this.mapUsuarios = new HashMap<Integer,Usuario>();
    }

    public void agregarUsuaruio(Usuario u){
        mapUsuarios.put(u.getDni(),u);
    }

    public void mostrarUsuarios(){
        System.out.println(mapUsuarios.keySet());
        System.out.println(mapUsuarios.values());
    }









}
