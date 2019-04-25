package com.dp.petclinic.petclinic.controllers.ui;

import com.dp.petclinic.petclinic.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppointmentsPageController {

    @Autowired
    AppointmentService appointmentService;

    @RequestMapping(value="/appointments", method = RequestMethod.GET)
    public String getAppointmentsPage(ModelMap modelMap) {
        modelMap.addAttribute("appointmentsList",appointmentService.getAllAppointments());
        return "appointments";
    }
}
