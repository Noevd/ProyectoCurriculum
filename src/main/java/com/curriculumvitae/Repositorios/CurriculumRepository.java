package com.curriculumvitae.Repositorios;

import com.curriculumvitae.Curriculum;
import com.curriculumvitae.Skill;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class CurriculumRepository {

    public List<Curriculum> traerTodos() {

        List<Curriculum> listaCurriculum = new ArrayList<Curriculum>();
        Curriculum noeCV = new Curriculum("Noelia Victoria Duran", (short) 25, "Capital Federal", "Curso de Programación", (short) 1);
        noeCV.agregarSkill(new Skill("Dormir", (short) 30, 2L));
        noeCV.agregarSkill(new Skill("Resolución de problemas", (short) 50, (short) 3));
        listaCurriculum.add(noeCV);
        

        return listaCurriculum;
    }

}
