package com.dp.petclinic.petclinic.services.impl;

import com.dp.petclinic.petclinic.models.Vet;
import com.dp.petclinic.petclinic.repositories.VetRepository;
import com.dp.petclinic.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VetServiceImpl implements VetService {

    @Autowired
    VetRepository vetRepository;

    @Override
    public List<Vet> getAllVets() {
        return vetRepository.findAll();
    }

    @Override
    public Vet getVetById(Long id) {
        return vetRepository.findById(id).orElse(null);
    }

    @Override
    public Vet saveVet(Vet vet) {
        return vetRepository.save(vet);
    }

    @Override
    public Vet updateVet(Vet updatedVet) {
        return vetRepository.save(updatedVet);
    }

    @Override
    public void deleteVetById(Long id) {
        vetRepository.deleteById(id);
    }
}
