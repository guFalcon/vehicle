package at.htl.vehicle.rental;

import java.time.LocalDateTime;

import at.htl.vehicle.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder(toBuilder = true)
public class RentalDto extends BaseDto {

    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private Double discount;

    private Long customerId;
    private Long vehicleId;
}
