/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author sofia
 */
public class ContactoOutput {
    private FileOutputStream file;
    private ObjectOutputStream output;

    public void abrir() throws IOException {
        file = new FileOutputStream("clientes.dat");
        output = new ObjectOutputStream(file);
    }

    public void cerrar() throws IOException {
        if (output != null) {
            output.close();
        }
    }

    public void escribir(Contacto contacto) throws IOException {
        if (output != null) {
            output.writeObject(contacto);
        }
    }
}
