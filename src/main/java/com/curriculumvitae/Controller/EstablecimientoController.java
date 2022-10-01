package com.curriculumvitae.Controller;

import com.curriculumvitae.EstablecimientoEducativo;
import com.curriculumvitae.Repositorios.EstablecimientosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstablecimientoController {
    
    @Autowired
    EstablecimientosRepository repositorio;

    @GetMapping("/establecimientos")
    public List<EstablecimientoEducativo> traerTodos() {
        return repositorio.traerTodos();
    }
}
