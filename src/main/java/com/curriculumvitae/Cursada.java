package com.curriculumvitae;

public class Cursada {

    private short anoIngreso;
    private short anoEgreso;
    private String titulo;
    private EstablecimientoEducativo establecimientoEducativo;

    public Cursada(short anoIngreso, short anoEgreso, String titulo) {
        this.anoIngreso = anoIngreso;
        this.anoEgreso = anoEgreso;
        this.titulo = titulo;
        this.establecimientoEducativo = establecimientoEducativo;
    }
    
    public EstablecimientoEducativo getEstablecimientoEducativo() {
        return establecimientoEducativo;
    }

    public void setEstablecimientoEducativo(EstablecimientoEducativo establecimientoEducativo) {
        this.establecimientoEducativo = establecimientoEducativo;
    }

    public short getAnoIngreso() {
        return anoIngreso;
    }

    public void setAnoIngreso(short anoIngreso) {
        this.anoIngreso = anoIngreso;
    }

    public short getAnoEgreso() {
        return anoEgreso;
    }

    public void setAnoEgreso(short anoEgreso) {
        this.anoEgreso = anoEgreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
