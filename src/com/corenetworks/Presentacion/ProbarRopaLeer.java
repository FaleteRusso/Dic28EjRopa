package com.corenetworks.Presentacion;

import com.corenetworks.modelo.Camisa;
import com.corenetworks.modelo.Pantalon;
import com.corenetworks.modelo.Zapatos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ProbarRopaLeer {
    public static void main(String[] args) {
        FileInputStream fEntrada;
        ObjectInputStream objeto;
       Pantalon p1 =null;
        Pantalon p2 = null;
        Camisa c1= null;
        Zapatos z1= null;
        Zapatos z2 = null;
        //Acciones de E/S
        try {
            fEntrada = new FileInputStream("Ropa.dat");
            objeto = new ObjectInputStream(fEntrada);
            p1=(Pantalon) objeto.readObject();
            System.out.println(p1.toString());
            p2=(Pantalon) objeto.readObject();
            System.out.println(p2.toString());
            c1=(Camisa) objeto.readObject();
            System.out.println(c1.toString());
            z1=(Zapatos) objeto.readObject();
            System.out.println(z1.toString());
            z2=(Zapatos) objeto.readObject();
            System.out.println(z2.toString());
            //cierre streams
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }

    }
    }

