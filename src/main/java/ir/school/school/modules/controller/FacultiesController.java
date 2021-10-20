package ir.school.school.modules.controller;

import ir.school.school.modules.model.Faculties;
import ir.school.school.modules.service.FacultiesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/faculties")
public class FacultiesController {
    private FacultiesServices facultiesServices;
    @Autowired
    public FacultiesController(FacultiesServices facultiesServices){
        this.facultiesServices = facultiesServices;
    }
    @RequestMapping(value = {"","/"},method = RequestMethod.POST)
    public Faculties registerFaculties(@RequestBody Faculties faculty){
        return facultiesServices.registerFaculties(faculty);
    }
    @RequestMapping(value = {"","/"},method = RequestMethod.GET)
    public List<Faculties> getFaculties(){
        return facultiesServices.findAllFaculties();
    }

}
