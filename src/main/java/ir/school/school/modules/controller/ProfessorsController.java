package ir.school.school.modules.controller;

import ir.school.school.modules.model.Professors;
import ir.school.school.modules.service.ProfessorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/professors")
public class ProfessorsController {


    private ProfessorsService professorsService;
    @Autowired
    public ProfessorsController(ProfessorsService professorsService){
        this.professorsService = professorsService;
    }

    @RequestMapping(value = {"","/"},method = RequestMethod.POST)
    public Professors registerProfessors(@RequestBody Professors professor){
        System.out.println(professor.toString());
        return professorsService.registerProfessors(professor);
    }

    @RequestMapping(value = {"/",""},method = RequestMethod.GET)
    public List<Professors> getProfessors(){
        return professorsService.findAllProfessors();
    }


}
