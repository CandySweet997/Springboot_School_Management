package ir.school.school.modules.controller;

import ir.school.school.modules.model.Students;
import ir.school.school.modules.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {
    private StudentsService studentsService;

    @Autowired
    public StudentsController(StudentsService studentsService){
        this.studentsService = studentsService;
    }

    @RequestMapping(value = {"","/"},method = RequestMethod.GET)
    public List<Students> getStudents(){
        return studentsService.findAllStudents();
    }

    @RequestMapping(value ={"","/"}, method = RequestMethod.POST)
    public Students registerStudent(@RequestBody Students student){
        return studentsService.registerStudent(student);
    }
}
