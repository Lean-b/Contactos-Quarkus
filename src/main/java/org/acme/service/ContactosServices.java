package org.acme.service;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import org.acme.entity.Contactos;
import org.acme.repository.ContactosRepository;

import javax.inject.Inject;
import java.util.List;

public class ContactosServices {

    @Inject
    ContactosRepository repository;


    public Contactos create(Contactos contactos){
        repository.persist(contactos);
        return contactos;
    }

    public Contactos update(Contactos contactos){
        repository.update(String.valueOf(contactos));
        return contactos;
    }


    public void delete(Long id){
        repository.deleteById(id);
    }

}
