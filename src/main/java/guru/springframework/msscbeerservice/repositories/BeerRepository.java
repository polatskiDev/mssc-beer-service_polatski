package guru.springframework.msscbeerservice.repositories;

import guru.springframework.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * @author Orhan Polat
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
