package com.corenetworks.modelo;

import java.io.Serializable;

public class Zapatos extends Ropa implements Serializable {
   private int tamanioTacon;
   public String cambiarTacon(){
       return "Se estría cambiando el tacon";
   }

    @Override
    public String toString() {
        return "Zapatos{" +
                "tamanioTacon=" + tamanioTacon +
                ", precio=" + precio +
                ", proveedor='" + proveedor + '\'' +
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

    public Zapatos() {
    }

    public Zapatos(int tamanioTacon) {
        this.tamanioTacon = tamanioTacon;
    }



    public int getTamanioTacon() {
        return tamanioTacon;
    }

    public void setTamanioTacon(int tamanioTacon) {
        this.tamanioTacon = tamanioTacon;
    }


}
