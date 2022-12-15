package org.acme.resource;

import org.acme.entity.Contactos;
import org.acme.service.ContactosServices;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("./Contactos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ContactosResource {
    @Inject
    ContactosServices services;

    @POST
    public Contactos create(Contactos contactos){
        return services.create(contactos);
    }

    @DELETE
    public void delete(@PathParam("id")Long id){
        services.delete(id);
    }


    @PATCH
    public Contactos update(Contactos contactos){
        return services.update(contactos);
    }





}
