package ir.school.school.modules.repository;

import ir.school.school.modules.model.Faculties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultiesRepository extends JpaRepository<Faculties,Long> {
}
