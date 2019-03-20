package adams.springframework.petclinicproject.model.services;

import adams.springframework.petclinicproject.model.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet Pet);

    Set<Vet> findAll();


}
