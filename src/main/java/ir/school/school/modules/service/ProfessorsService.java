package ir.school.school.modules.service;

import ir.school.school.modules.model.Professors;
import ir.school.school.modules.repository.ProfessorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProfessorsService {
    private ProfessorsRepository professorsRepository;

    @Autowired
    public ProfessorsService(ProfessorsRepository professorsRepository){
        this.professorsRepository = professorsRepository;
    }
    public Professors registerProfessors(Professors professor){
        return this.professorsRepository.save(professor);
    }

    public List<Professors> findAllProfessors(){
        return this.professorsRepository.findAll();
    }


}
