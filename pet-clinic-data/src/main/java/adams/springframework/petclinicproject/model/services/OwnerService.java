package adams.springframework.petclinicproject.model.services;

import adams.springframework.petclinicproject.model.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lat);

    Owner findById(Long id);
    Owner save(Owner owner);

    Set<Owner> findAll();

}
