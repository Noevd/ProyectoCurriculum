package com.curriculumvitae;

public class Cuenta {
    
    private String nombre;
    private RedSocial redSocial;
    
    public Cuenta (String nombre, RedSocial redSocial) {
         this.nombre = nombre;  
         this.redSocial = redSocial;
    }

    public RedSocial getRedSocial() {
        return redSocial;
    }

    public void setRedSocial(RedSocial redSocial) {
        this.redSocial = redSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
