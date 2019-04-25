package com.dp.petclinic.petclinic.controllers.ui;

import com.dp.petclinic.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VetPageController {

    @Autowired
    VetService vetService;

    @RequestMapping(value="/veterinarians",method = RequestMethod.GET)
    public String getVeterinariansPage(ModelMap modelMap) {
        modelMap.addAttribute("vetList",vetService.getAllVets());
        return "vet";
    }
}
