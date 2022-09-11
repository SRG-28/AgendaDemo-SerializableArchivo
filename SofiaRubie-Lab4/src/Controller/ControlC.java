/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Registro;
import java.io.*;

public class ControlC {

    private RandomAccessFile file;

    public void abrir() throws IOException {
        file = new RandomAccessFile("clientes.dat", "rw");
    }

    public void cerrar() throws IOException {
        if (file != null) {
            file.close();
        }
    }

    public void escribir(Registro registro) throws IOException {
        if (file != null) {
            registro.write(file);
        }
    }

    public void escribir(Registro registro, int pos) throws IOException {
        if (file != null) {
            file.seek((pos - 1) * Registro.DIM);
            escribir(registro);
        }
    }

    public Registro leer() {
        Registro registro = null;

        if (file != null) {
            try {
                registro = new Registro();
                registro.read(file);
            } catch (Exception error) {
                registro = null;
            }
        }

        return registro;
    }

    public Registro leer(int pos) throws IOException {
        if (file != null) {
            file.seek((pos) * Registro.DIM);
        }

        return leer();
    }
    
    public RandomAccessFile getFile(){
        return file;
    }

}
