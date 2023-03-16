package at.htl.vehicle.rental;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class RentalRepository implements PanacheRepository<RentalEntity> {

}
