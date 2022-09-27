package com.curriculumvitae;

import java.util.ArrayList;
import java.util.List;

public class Curriculum {

    private String nombre;
    private int edad;
    private String lugarProcedencia;
    private String experiencia;
    private List<Cuenta> cuentas;

    public Curriculum(String nombre, int edad, String lugarProcedencia, String experiencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.lugarProcedencia = lugarProcedencia;
        this.experiencia = experiencia;
        this.cuentas = new ArrayList<Cuenta>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLugarProcedencia() {
        return lugarProcedencia;
    }

    public void setLugarProcedencia(String lugarProcedencia) {
        this.lugarProcedencia = lugarProcedencia;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public void agregarCuenta(Cuenta cuenta) {
        this.cuentas.add(cuenta);
    }
}
