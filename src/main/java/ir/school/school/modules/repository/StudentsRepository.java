package ir.school.school.modules.repository;

import ir.school.school.modules.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {


}
