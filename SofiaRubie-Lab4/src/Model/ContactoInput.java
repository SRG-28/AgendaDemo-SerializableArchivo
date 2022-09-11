/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author sofia
 */
public class ContactoInput {
    private FileInputStream file;
    private ObjectInputStream input;

    public void abrir() throws IOException {
        file = new FileInputStream("clientes.dat");
        input = new ObjectInputStream(file);

    }

    public void cerrar() throws IOException {
        if (input != null) {
            input.close();
        }
    }

    public Contacto leer()
            throws IOException, ClassNotFoundException {
        Contacto contacto = null;
        if (input != null) {
            try {
                contacto = (Contacto) input.readObject();
            } catch (EOFException eof) {

            }
        }
        return contacto;
    }
}
