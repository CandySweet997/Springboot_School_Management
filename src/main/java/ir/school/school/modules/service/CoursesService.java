package ir.school.school.modules.service;

import ir.school.school.modules.model.Courses;
import ir.school.school.modules.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesService {
    private CoursesRepository coursesRepository;

    @Autowired
    public CoursesService(CoursesRepository coursesRepository){

        this.coursesRepository = coursesRepository;
    }

    public Courses registerCourses(Courses course){
        return this.coursesRepository.save(course);
    }
    public List<Courses> findAllCourses(){

        return this.coursesRepository.findAll();
    }
}
