package guru.springframework.msscbeerservice.repositories;

import guru.springframework.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author Orhan Polat
 */
@Repository
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
