package ir.school.school.modules.repository;

import ir.school.school.modules.model.Professors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorsRepository extends JpaRepository<Professors,Long> {
}
