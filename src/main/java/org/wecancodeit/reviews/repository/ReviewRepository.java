package org.wecancodeit.reviews.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.Review;

// needed crud repository type here
public interface ReviewRepository extends CrudRepository<Review, Long> {
}
