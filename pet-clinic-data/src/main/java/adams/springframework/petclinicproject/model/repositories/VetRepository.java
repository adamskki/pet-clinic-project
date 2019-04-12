package adams.springframework.petclinicproject.model.repositories;

import adams.springframework.petclinicproject.model.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
