package ir.school.school.modules.controller;

import ir.school.school.modules.model.Courses;
import ir.school.school.modules.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CoursesController {
    private CoursesService coursesService;
    @Autowired
    public CoursesController( CoursesService coursesService){
        this.coursesService = coursesService;
    }
    @RequestMapping(value = {"","/"},method = RequestMethod.POST)
    public Courses registerCourses(@RequestBody Courses course){
        return coursesService.registerCourses(course);
    }
    @RequestMapping(value = {"","/"},method = RequestMethod.GET)
    public List<Courses> getCourses(){
        return coursesService.findAllCourses();
    }
}
