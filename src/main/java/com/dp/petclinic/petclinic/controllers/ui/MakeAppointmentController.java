package com.dp.petclinic.petclinic.controllers.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MakeAppointmentController {

    @RequestMapping(value="/make-appointment",method = RequestMethod.GET)
    public String getMakeAppointmentPage() { return "make-appointment"; }
}
