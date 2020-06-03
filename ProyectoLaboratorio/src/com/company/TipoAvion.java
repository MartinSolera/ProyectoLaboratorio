package com.company;

public abstract class TipoAvion {
    private float capConbustible;
    private float costoXkm;
    private int sizePasajeros;
    private float velMaxima;
    private Motor motor;

    public TipoAvion(float capConbustible,float costoXkm, int sizePasajeros, float velMaxima, Motor motor){
        this.capConbustible = capConbustible;
        this.costoXkm = costoXkm;
        this.sizePasajeros = sizePasajeros;
        this.velMaxima = velMaxima;
        this.motor = motor;
    }

    ///-------------------------------- GETS AND SETS ---------------------------------------------


    @Override
    public String toString() {
        return "TipoAvion " +
                "capConbustible: " + capConbustible +
                "costoXkm: " + costoXkm +
                "sizePasajeros: " + sizePasajeros +
                "velMaxima: " + velMaxima +
                "motor: " + motor;
    }

    public float getCapConbustible() {
        return capConbustible;
    }

    public void setCapConbustible(float capConbustible) {
        this.capConbustible = capConbustible;
    }

    public float getCostoXkm() {
        return costoXkm;
    }

    public void setCostoXkm(float costoXkm) {
        this.costoXkm = costoXkm;
    }

    public int getSizePasajeros() {
        return sizePasajeros;
    }

    public void setSizePasajeros(int sizePasajeros) {
        this.sizePasajeros = sizePasajeros;
    }

    public float getVelMaxima() {
        return velMaxima;
    }

    public void setVelMaxima(float velMaxima) {
        this.velMaxima = velMaxima;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }


    ///----------------------------------------------------------------------------------------------
}
