package com.curriculumvitae;

public class EstablecimientoEducativo {

    private String nombre;
    private String direccion;
    private String titulo;
    private short anoEgreso;

    public EstablecimientoEducativo(String nombre, String direccion, String titulo, short anoEgreso) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.titulo = titulo;
        this.anoEgreso = anoEgreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public short getAnoEgreso() {
        return anoEgreso;
    }

    public void setAnoEgreso(short anoEgreso) {
        this.anoEgreso = anoEgreso;
    }

}
