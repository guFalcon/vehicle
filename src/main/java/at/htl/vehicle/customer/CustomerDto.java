package at.htl.vehicle.customer;

import java.time.LocalDate;
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
public class CustomerDto extends BaseDto {
    
    private String name;
    private LocalDate dateOfBirth;
    private List<Long> rentals;
}
