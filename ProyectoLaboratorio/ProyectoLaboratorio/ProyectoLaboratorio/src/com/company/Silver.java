package com.company;

public class Silver extends TipoAvion implements Catering{
    public Silver(float capConbustible, float costoXkm, int sizePasajeros, float velMaxima, Motor motor) {
        super(capConbustible, costoXkm, sizePasajeros, velMaxima, motor);
    }

    ///-----------------------------------IMPLEMENTACION DE INTERFAZ--------------------------------

    @Override
    public void catering() {

    }
}
