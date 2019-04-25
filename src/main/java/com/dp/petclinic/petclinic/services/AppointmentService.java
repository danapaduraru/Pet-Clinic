package com.dp.petclinic.petclinic.services;

import com.dp.petclinic.petclinic.models.Appointment;

import java.util.List;

public interface AppointmentService {

    List<Appointment> getAllAppointments();

    Appointment getAppointmentById(Long id);

    Appointment saveAppointment(Appointment appointment);

    Appointment updateAppointment(Appointment updatedAppointment);

    void deleteAppointment(Long id);
}
