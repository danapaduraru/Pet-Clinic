package com.dp.petclinic.petclinic.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "pet")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "type")
    private String type;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private String age;

    @Column(name = "weight")
    private String weight;

    @Column(name = "breed")
    private String breed;

    @Column(name = "observations")
    private String observations;

    @Column(name = "treatment")
    private String treatment;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "id_vet")
    private Vet vet;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId("id_appointment")
    private Appointment appointment;

    public Pet(String type, String name, String age, String weight, String breed, String observations, String treatment) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
        this.observations = observations;
        this.treatment = treatment;
    }

    public Pet() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }
}
