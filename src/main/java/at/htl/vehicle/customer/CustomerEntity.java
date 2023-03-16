package at.htl.vehicle.customer;

import java.time.LocalDate;
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
@Table(name = "Customer")
public class CustomerEntity extends BaseEntity {

    private String name;
    private LocalDate dateOfBirth;
    @OneToMany(mappedBy = "customer")
    private List<RentalEntity> rentals;
}
