package com.curriculumvitae;

public class Skill {

    private String nombre;
    private short nivel;
    private long id;

    public Skill(String nombre, short nivel, long id) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getNivel() {
        return nivel;
    }

    public void setNivel(short nivel) {
        this.nivel = nivel;
    }

}
