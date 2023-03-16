package at.htl.vehicle.vehicle;

import static org.assertj.db.api.Assertions.assertThat;
import static org.assertj.db.output.Outputs.output;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.assertj.db.type.Table;
import org.junit.jupiter.api.Test;

import io.agroal.api.AgroalDataSource;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class VehicleRepositoryTest {

    @Inject
    VehicleRepository repository;

    @Inject
    AgroalDataSource ds;

    @Test
    @Transactional
    void entityIsPersisted_givenNewlyCreatedEntity() {
        var v = VehicleEntity.builder().brand("Audi").model("80").price(342D).build();
        repository.persist(v);
        
        Table table = new Table(ds, "vehicle");
        output(table).toConsole();

        assertThat(table).exists();
        assertThat(table).hasNumberOfRows(1);
        assertThat(table).row(0).column("brand").containsValues("Audi");
    }
}
