package com.dp.petclinic.petclinic.controllers;

import com.dp.petclinic.petclinic.models.Vet;
import com.dp.petclinic.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/veterinarians")
public class VetController {

    @Autowired
    VetService vetService;

    @GetMapping
    public List<Vet> getAllVets() { return vetService.getAllVets(); }

    @PostMapping
    public Vet saveVet(@RequestBody Vet vet) {
        return vetService.saveVet(vet);
    }

}
