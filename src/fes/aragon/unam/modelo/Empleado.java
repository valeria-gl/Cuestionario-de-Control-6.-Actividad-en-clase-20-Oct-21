/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.unam.modelo;

/**
 *
 * @author LENOVO
 */
public class Empleado {
    private int numeroTrabajador;
    private String nombre;
    private String paterno;
    private String materno;
    private float sueldoBase;
    private int horasExtra;
    private int anioIngreso;

    public Empleado() {
    }

    public Empleado(int numeroTrabajador, String nombre, String paterno, String materno, float sueldoBase, int horasExtra, int anioIngreso) {
        this.numeroTrabajador = numeroTrabajador;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.sueldoBase = sueldoBase;
        this.horasExtra = horasExtra;
        this.anioIngreso = anioIngreso;
    }

    public Empleado(int i, String josé, String pérez, String garcía_23000f_4_2018) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    public int getNumeroTrabajador() {
        return numeroTrabajador;
    }

    public void setNumeroTrabajador(int numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    @Override
    public String toString() {
        return "Empleado{" + "numeroTrabajador=" + numeroTrabajador + ", nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno + ", sueldoBase=" + sueldoBase + ", horasExtra=" + horasExtra + ", anioIngreso=" + anioIngreso + '}';
    }
    
    
    
}
