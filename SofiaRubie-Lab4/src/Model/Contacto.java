/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author sofia
 */
public class Contacto {
    private String nombre;
    private String telefono;
    private String email;
    private String direccion;
    private Date nacimiento;
    private int grupo;
    private double deuda;

    public static final int TRABAJO = 1;
    public static final int FAMILIA = 2;
    public static final int AMIGOS = 3;

    public Contacto() {

    }

    public Contacto(String nombre) {
        this.nombre = nombre;
    }

    public Contacto(String nombre, String telefono, String email, String direccion, Date nacimiento, int grupo, double deuda) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.nacimiento = nacimiento;
        this.grupo = grupo;
        this.deuda = deuda;
    }

    //-----------------
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public int getGrupo() {
        return grupo;
    }

    public Double getDeuda() {
        return deuda;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public void setDeuda(Double deuda) {
        this.deuda = deuda;
    }

    //-----------------
    public String toString() {
        return "*-*-*Contacto*-*-* \n"
                + "Nombre: " + nombre + "\n"
                + "Email: " + email + "\n"
                + "Telefono: " + telefono + "\n"
                + "Dirección: " + direccion + "\n"
                + "Cumpleaños: " + nacimiento + "\n"
                + "Grupo: " + grupo + "\n"
                + "Deuda: " + "$" + deuda
                + "\n";
    }		
}
