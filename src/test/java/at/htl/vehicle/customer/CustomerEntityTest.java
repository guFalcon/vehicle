package at.htl.vehicle.customer;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CustomerEntityTest {
    
    @Test
    void itShouldHaveNameSusi_givenNameSusiUponConstruction() {
        var c = CustomerEntity.builder().dateOfBirth(LocalDate.of(1967, 5, 14)).name("Susi").build();
        assertThat(c.getName()).isEqualTo("Susi");
    }
}
