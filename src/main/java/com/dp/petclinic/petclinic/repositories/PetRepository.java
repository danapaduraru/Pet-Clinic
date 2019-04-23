package com.dp.petclinic.petclinic.repositories;

import com.dp.petclinic.petclinic.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
}
