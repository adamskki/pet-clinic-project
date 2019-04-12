package adams.springframework.petclinicproject.model.repositories;

import adams.springframework.petclinicproject.model.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
