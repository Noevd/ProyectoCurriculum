package com.curriculumvitae;

public class RedSocial {
    
    private String redireccion;
    private String agregarQuitarCuenta;
    
    public RedSocial (String redireccion, String agregarQuitarCuenta) {
        this.redireccion = redireccion;
        this.agregarQuitarCuenta = agregarQuitarCuenta;
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
