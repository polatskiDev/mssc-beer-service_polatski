package guru.springframework.msscbeerservice;

import guru.springframework.msscbeerservice.web.mappers.BeerMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = BeerMapper.class)
class MsscBeerServiceApplicationTests {

    @Test
    void contextLoads() {
    }

}
