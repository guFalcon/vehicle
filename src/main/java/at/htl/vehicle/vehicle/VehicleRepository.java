package at.htl.vehicle.vehicle;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class VehicleRepository implements PanacheRepository<VehicleEntity> {

    public List<VehicleEntity> findKadetts(){
        return list("model", "Kadett");
    }
 
    public void deleteOpels(){
        delete("brand", "Opel");
   }
}
