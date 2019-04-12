package adams.springframework.petclinicproject.model.repositories;

import adams.springframework.petclinicproject.model.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);


}
