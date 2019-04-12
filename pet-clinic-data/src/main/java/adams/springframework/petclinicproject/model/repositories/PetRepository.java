package adams.springframework.petclinicproject.model.repositories;

import adams.springframework.petclinicproject.model.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
