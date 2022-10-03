package com.curriculumvitae.Controller;

import com.curriculumvitae.Curriculum;
import com.curriculumvitae.Repositorios.CurriculumRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurriculumController {

    @Autowired
    CurriculumRepository repositorio;

    @GetMapping("/curriculums")
    public List<Curriculum> traerTodos() {
        return repositorio.traerTodos ();
    }
}
