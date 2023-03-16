package at.htl.vehicle.vehicle;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import at.htl.vehicle.BaseEntity;
import at.htl.vehicle.rental.RentalEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder(toBuilder = true)
@Entity
@Table(name = "Vehicle")
public class VehicleEntity extends BaseEntity {
    
    private String model;
    private String brand;
    private Double price;
    @OneToMany(mappedBy = "vehicle")
    private List<RentalEntity> rentals;
}
