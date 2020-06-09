package com.company;

public class Gold extends TipoAvion implements Catering, ConexionWifi{

    public Gold(float capConbustible, float costoXkm, int sizePasajeros, float velMaxima, Motor motor) {
        super(capConbustible, costoXkm, sizePasajeros, velMaxima, motor);
    }

    ///------------------------- IMPLEMENTACIONES DE LAS INTERFASES -------------------------------

    @Override
    public void catering() {

    }

    @Override
    public void conexionWifi() {

    }

    ///---------------------------------------------------------------------------------------------

}
