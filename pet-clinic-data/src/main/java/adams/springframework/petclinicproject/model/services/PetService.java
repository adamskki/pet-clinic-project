package adams.springframework.petclinicproject.model.services;

import adams.springframework.petclinicproject.model.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet Pet);

    Set<Pet> findAll();

}
