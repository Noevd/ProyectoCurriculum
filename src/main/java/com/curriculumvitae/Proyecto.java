package com.curriculumvitae;

public class Proyecto {

    private String nombre;
    private String descripcion;
    private short ano;
    private String direccionRepositorio;
    private long id;
    
    public Proyecto (String nombre, String descripcion, short ano, String direccionRepositorio, long id) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ano = ano;
        this.direccionRepositorio = direccionRepositorio;
        this.id = id;
    }   
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public short getAno() {
        return ano;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    public String getDireccionRepositorio() {
        return direccionRepositorio;
    }

    public void setDireccionRepositorio(String direccionRepositorio) {
        this.direccionRepositorio = direccionRepositorio;
    }
    

    
}
