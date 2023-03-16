package at.htl.vehicle.rental;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import at.htl.vehicle.BaseEntity;
import at.htl.vehicle.customer.CustomerEntity;
import at.htl.vehicle.vehicle.VehicleEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder(toBuilder = true)
@Entity
@Table(name = "Rental")
public class RentalEntity extends BaseEntity {

    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private Double discount;

    @ManyToOne()
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;
    @ManyToOne()
    @JoinColumn(name = "vehicle_id")
    private VehicleEntity vehicle;
}
