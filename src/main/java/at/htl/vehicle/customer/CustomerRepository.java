package at.htl.vehicle.customer;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class CustomerRepository implements PanacheRepository<CustomerEntity> {

    public CustomerEntity findByName(String name){
        return find("name", name).firstResult();
    }

    public List<CustomerEntity> findGeralds() {
        return find("name", "Gerald").list();
    }
}
