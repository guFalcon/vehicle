package at.htl.vehicle.rental;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/rentals")
@Produces(MediaType.APPLICATION_JSON)
public class RentalResource { 

    @Inject
    RentalRepository repository;

    @Inject
    RentalMapper mapper;

    @GET
    @Path("{id}")
    public RentalDto find(@PathParam("id") long id) {
        return mapper.fromEntity(repository.findById(id));
    }

    @GET
    @Path("search")
    public RentalDto search(@QueryParam("id") long id) {
        return mapper.fromEntity(repository.findById(id));
    }

    @GET
    public List<RentalDto> findAll() {
        return mapper.fromEntity(repository.findAll().list());
    }

    @GET
    @Path("count")
    public Long count() {
        return repository.count();
    }
}
