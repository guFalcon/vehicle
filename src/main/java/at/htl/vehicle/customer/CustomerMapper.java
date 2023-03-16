package at.htl.vehicle.customer;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import at.htl.vehicle.rental.RentalEntity;

@ApplicationScoped
public class CustomerMapper {

    public CustomerDto fromEntity(CustomerEntity customer) {
        return CustomerDto.builder().dateOfBirth(customer.getDateOfBirth()).id(customer.getId())
                .name(customer.getName()).rentals(customer.getRentals().stream().map(RentalEntity::getId).toList())
                .build();
    }

    public List<CustomerDto> fromEntity(List<CustomerEntity> customers) {
        return customers.stream().map(this::fromEntity).toList();
    }
}
