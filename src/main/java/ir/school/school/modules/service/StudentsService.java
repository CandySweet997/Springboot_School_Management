package ir.school.school.modules.service;

import ir.school.school.modules.model.Students;
import ir.school.school.modules.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {
    private  StudentsRepository studentsRepository;

    @Autowired
    public StudentsService(StudentsRepository studentsRepository){
        this.studentsRepository =studentsRepository;
    }

    public Students registerStudent(Students student){
       return this.studentsRepository.save(student);
    }

    public List<Students> findAllStudents(){
        return studentsRepository.findAll();
    }

}
