package adams.springframework.petclinicproject.model.services;

import adams.springframework.petclinicproject.model.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
