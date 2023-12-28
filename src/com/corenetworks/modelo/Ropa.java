package com.corenetworks.modelo;

import java.io.Serializable;

public class Ropa implements Serializable {
    protected  double precio;
    protected String proveedor;
    private  int numPrendas;

    public String probar(){
        return "se está probando";
    }
    public String desinfectar(){
        return "se está desinfectando";
    }
    public String vender(){
        return "se está vendiendo";
    }

    public Ropa() {
    }

    public Ropa(double precio, String proveedor, int numPrendas) {
        this.precio = precio;
        this.proveedor = proveedor;
        this.numPrendas = numPrendas;
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "precio=" + precio +
                ", proveedor='" + proveedor + '\'' +
                ", numPrendas=" + numPrendas +
                '}';
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getNumPrendas() {
        return numPrendas;
    }

    public void setNumPrendas(int numPrendas) {
        this.numPrendas = numPrendas;
    }


}
