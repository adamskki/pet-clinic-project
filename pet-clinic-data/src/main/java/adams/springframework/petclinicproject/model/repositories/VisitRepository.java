package adams.springframework.petclinicproject.model.repositories;

import adams.springframework.petclinicproject.model.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
