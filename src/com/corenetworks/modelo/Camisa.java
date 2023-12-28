package com.corenetworks.modelo;

import java.io.Serializable;

public class Camisa extends Ropa implements Serializable {
    private boolean corta;
    private double tallaCuello;
    public String desteñir(){
        return "se está destiñendo";
    }

    @Override
    public String toString() {
        return "Camisa{" +
                "corta=" + corta +
                ", tallaCuello=" + tallaCuello +
                '}';
    }

    @Override
    public String getProveedor() {
        return super.getProveedor();
    }

    @Override
    public double getPrecio() {
        return super.getPrecio();
    }

    public Camisa() {
    }

    public Camisa(boolean corta, double tallaCuello) {
        this.corta = corta;
        this.tallaCuello = tallaCuello;
    }

    public Camisa(double precio, String proveedor, int numPrendas, boolean corta, double tallaCuello) {
        super(precio, proveedor, numPrendas);
        this.corta = corta;
        this.tallaCuello = tallaCuello;
    }

    public boolean isCorta() {
        return corta;
    }

    public void setCorta(boolean corta) {
        this.corta = corta;
    }

    public double getTallaCuello() {
        return tallaCuello;
    }

    public void setTallaCuello(double tallaCuello) {
        this.tallaCuello = tallaCuello;
    }
}
