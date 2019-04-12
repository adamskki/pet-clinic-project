package adams.springframework.petclinicproject.model.repositories;

import adams.springframework.petclinicproject.model.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
