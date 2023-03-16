package at.htl.vehicle.vehicle;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/vehicles")
@Produces(MediaType.APPLICATION_JSON)
public class VehicleResource { 

    @Inject
    VehicleRepository repository;

    @Inject
    VehicleMapper mapper;

    @GET
    @Path("{id}")
    public VehicleDto find(@PathParam("id") long id) {
        return mapper.fromEntity(repository.findById(id));
    }

    @GET
    @Path("search")
    public VehicleDto search(@QueryParam("id") long id) {
        return mapper.fromEntity(repository.findById(id));
    }

    @GET
    public List<VehicleDto> findAll() {
        return mapper.fromEntity(repository.findAll().list());
    }

    @GET
    @Path("count")
    public Long count() {
        return repository.count();
    }

    @GET
    @Path("findkadetts")
    public List<VehicleDto> findKadetts() {
        return mapper.fromEntity(repository.findKadetts());
    }
}
