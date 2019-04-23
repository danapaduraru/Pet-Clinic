package com.dp.petclinic.petclinic.repositories;

import com.dp.petclinic.petclinic.models.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
