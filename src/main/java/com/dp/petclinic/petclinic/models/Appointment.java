package com.dp.petclinic.petclinic.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "full_name")
    private String fullName;

    @NotNull
    @Email
    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "telephone")
    private String telephone;

    @NotNull
    @Column(name = "date")
    private String date;

    @NotNull
    @Column(name = "petType")
    private String petType;

    @NotNull
    @Column(name = "description")
    private String description;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId("id")
    private Pet pet;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "vet_id")
    private Vet vet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }
}
