package net.xonich.olorin.fntest;

import io.restassured.common.mapper.TypeRef;
import net.xonich.olorin.domain.Status;
import net.xonich.olorin.dto.Response;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static io.restassured.RestAssured.when;
import static java.util.concurrent.TimeUnit.MINUTES;
import static org.assertj.core.api.Assertions.assertThat;

@Timeout(value = 1, unit = MINUTES)
public class ExampleTest {


    @Test
    public void hello() {
        Response<?> rs = when().post("/olorin/new").as(new TypeRef<>() {});
        assertThat(rs.status()).isEqualTo(Status.ERROR);
    }
}
