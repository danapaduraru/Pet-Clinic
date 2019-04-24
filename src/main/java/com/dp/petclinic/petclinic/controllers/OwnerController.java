package com.dp.petclinic.petclinic.controllers;

import com.dp.petclinic.petclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/owners")
public class OwnerController {

    @Autowired
    OwnerService ownerService;

}
