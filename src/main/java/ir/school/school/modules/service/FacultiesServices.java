package ir.school.school.modules.service;

import ir.school.school.modules.model.Faculties;
import ir.school.school.modules.repository.FacultiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultiesServices {
    private FacultiesRepository facultiesRepository;
    @Autowired
    public FacultiesServices(FacultiesRepository facultiesRepository){
        this.facultiesRepository = facultiesRepository;
    }
    public Faculties registerFaculties(Faculties faculty){
        return this.facultiesRepository.save(faculty);
    }
    public List<Faculties> findAllFaculties(){
        return this.facultiesRepository.findAll();
    }

}
