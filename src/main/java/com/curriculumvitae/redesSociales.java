package com.curriculumvitae;

public class redesSociales {
    
    private String redireccion;
    private String agregarQuitarCuenta;
    
    public redesSociales (String redireccion, String agregarQuitarCuenta) {
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
