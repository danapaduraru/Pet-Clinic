package com.dp.petclinic.petclinic.repositories;

import com.dp.petclinic.petclinic.models.Vet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepository extends JpaRepository<Vet,Long> {
}
