package com.corenetworks.modelo;

import java.io.Serializable;

public class Pantalon extends Ropa implements Serializable {
    private String tipoPantalon;
    public String desmontar(){
        return "se estría desmontando";
    }


    @Override
    public String toString() {
        return "Pantalon{" +
                "tipoPantalon='" + tipoPantalon + '\'' +
                ", precio=" + precio +
                ", proveedor='" + proveedor + '\'' +
                '}';
    }

    public Pantalon() {
    }

    @Override
    public String getProveedor() {
        return super.getProveedor();
    }

    @Override
    public double getPrecio() {
        return super.getPrecio();
    }

    public Pantalon(String tipoPantalon) {
        this.tipoPantalon = tipoPantalon;
    }

    public Pantalon(double precio, String proveedor, int numPrendas, String tipoPantalon) {
        super(precio, proveedor, numPrendas);
        this.tipoPantalon = tipoPantalon;
    }

    public String getTipoPantalon() {
        return tipoPantalon;
    }

    public void setTipoPantalon(String tipoPantalon) {
        this.tipoPantalon = tipoPantalon;
    }



}
