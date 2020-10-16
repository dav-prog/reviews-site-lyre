package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;
// needed crud repository type here
public interface ReviewRepository extends CrudRepository<Review, Long> {
}
