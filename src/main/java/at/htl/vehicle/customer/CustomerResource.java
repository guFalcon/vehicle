package at.htl.vehicle.customer;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {

    @Inject
    CustomerRepository repository;

    @Inject
    CustomerMapper mapper;

    @GET
    @Path("{id}")
    public CustomerDto find(@PathParam("id") long id) {
        return mapper.fromEntity(repository.findById(id));
    }

    @GET
    @Path("search")
    public CustomerDto search(@QueryParam("id") long id) {
        return mapper.fromEntity(repository.findById(id));
    }

    @GET
    public List<CustomerDto> findAll() {
        return mapper.fromEntity(repository.findAll().list());
    }

    @GET
    @Path("findgeralds")
    public List<CustomerDto> findKadetts() {
        return mapper.fromEntity(repository.findGeralds());
    }
}
