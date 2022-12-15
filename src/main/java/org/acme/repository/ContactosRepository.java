package org.acme.repository;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;
import org.acme.entity.Contactos;

import java.util.List;

public class ContactosRepository implements PanacheRepository<Contactos> {

}
