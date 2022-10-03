package com.curriculumvitae;

public class Cuenta {
    
    private String nombre;
    private RedSocial redSocial;
    private long id;
    
    public Cuenta (String nombre, RedSocial redSocial, long id) {
         this.nombre = nombre;  
         this.redSocial = redSocial;
         this.id = id;
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
