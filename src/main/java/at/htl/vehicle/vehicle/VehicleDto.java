package at.htl.vehicle.vehicle;

import java.util.List;

import at.htl.vehicle.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder(toBuilder = true)
public class VehicleDto extends BaseDto {
    
    private String model;
    private String brand;
    private Double price;

    private List<Long> rentals;
}
