package com.curriculumvitae;

public class RedSocial {
    
    private String redireccion;
    private String agregarQuitarCuenta;
    private long id;
    
    public RedSocial (String redireccion, String agregarQuitarCuenta, long id) {
        this.redireccion = redireccion;
        this.agregarQuitarCuenta = agregarQuitarCuenta;
        this.id = id;
    }

    public String getRedireccion() {
        return redireccion;
    }

    public void setRedireccion(String redireccion) {
        this.redireccion = redireccion;
    }

    public String getAgregarQuitarCuenta() {
        return agregarQuitarCuenta;
    }

    public void setAgregarQuitarCuenta(String agregarQuitarCuenta) {
        this.agregarQuitarCuenta = agregarQuitarCuenta;
    }
    
    
}
