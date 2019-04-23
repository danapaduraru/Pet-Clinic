package com.dp.petclinic.petclinic.repositories;

import com.dp.petclinic.petclinic.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
