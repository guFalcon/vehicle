package at.htl.vehicle.vehicle;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import at.htl.vehicle.rental.RentalEntity;

@ApplicationScoped
public class VehicleMapper {

    public VehicleDto fromEntity(VehicleEntity vehicle) {
        return VehicleDto.builder().brand(vehicle.getBrand()).model(vehicle.getModel()).id(vehicle.getId())
                .price(vehicle.getPrice()).rentals(vehicle.getRentals().stream().map(RentalEntity::getId).toList())
                .build();
    }

    public List<VehicleDto> fromEntity(List<VehicleEntity> vehicles) {
        return vehicles.stream().map(this::fromEntity).toList();
    }
}
