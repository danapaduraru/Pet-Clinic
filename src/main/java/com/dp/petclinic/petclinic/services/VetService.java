package com.dp.petclinic.petclinic.services;

import com.dp.petclinic.petclinic.models.Vet;

import java.util.List;

public interface VetService {

    List<Vet> getAllVets();

    Vet getVetById(Long id);

    Vet saveVet(Vet vet);

    Vet updateVet(Vet updatedVet);

    void deleteVetById(Long id);

}
