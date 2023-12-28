package com.corenetworks.Presentacion;

import com.corenetworks.modelo.Camisa;
import com.corenetworks.modelo.Pantalon;
import com.corenetworks.modelo.Zapatos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ProbarRopaOutput {
    public static void main(String[] args) {
        //declara variables
        FileOutputStream fSalida;
        ObjectOutputStream objeto;
        Pantalon p1;
        Pantalon p2;
        Camisa c1;
        Zapatos z1;
        Zapatos z2;
        //acciones E/S
        try {
            fSalida = new FileOutputStream("Ropa.dat");
            objeto = new ObjectOutputStream(fSalida);
            p1=new Pantalon("Largo");
            objeto.writeObject(p1);
            p2=new Pantalon("Vaquero largo");
            objeto.writeObject(p2);
            c1= new Camisa(false,36);
            objeto.writeObject(c1);
            z1= new Zapatos(9);
            objeto.writeObject(z1);
            z2=new Zapatos(9);
            objeto.writeObject(z2);
            //cerrar
            objeto.flush();
            objeto.close();
            fSalida.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

}
