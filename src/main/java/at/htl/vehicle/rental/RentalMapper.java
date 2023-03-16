package at.htl.vehicle.rental;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RentalMapper {

    public RentalDto fromEntity(RentalEntity rental) {
        return RentalDto.builder().customerId(rental.getCustomer().getId()).discount(rental.getDiscount())
                .endDateTime(rental.getEndDateTime()).id(rental.getId()).startDateTime(rental.getStartDateTime())
                .vehicleId(rental.getVehicle().getId()).build();
    }

    public List<RentalDto> fromEntity(List<RentalEntity> rentals) {
        return rentals.stream().map(this::fromEntity).toList();
    }
}
