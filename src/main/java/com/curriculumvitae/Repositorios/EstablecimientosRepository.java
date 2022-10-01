package com.curriculumvitae.Repositorios;

import com.curriculumvitae.EstablecimientoEducativo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class EstablecimientosRepository {
    
    public List<EstablecimientoEducativo> traerTodos () {
    
    List<EstablecimientoEducativo> listaEstablecimientoEducativo = new ArrayList<EstablecimientoEducativo>();
    listaEstablecimientoEducativo.add(new EstablecimientoEducativo ("Escuela Primaria Adolfo Van Gelderen no.26", "Jerónimo Salguero 2455", "Primario completo", (short)2009));
    listaEstablecimientoEducativo.add(new EstablecimientoEducativo ("Instituto Rosario de Lerma no.8084", "Av. 9 de Julio 150", "Bachillerato", (short)2014));
    
    return listaEstablecimientoEducativo;  
    }
}
