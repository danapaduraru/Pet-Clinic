package com.dp.petclinic.petclinic.services;

import com.dp.petclinic.petclinic.models.Owner;

import java.util.List;

public interface OwnerService {

    List<Owner> getAllOwners();

    Owner getOwnerById(Long id);

    Owner saveOwner(Owner owner);

    Owner updateOwner(Owner updateOwner);

    void deleteOwner(Long id);
}
