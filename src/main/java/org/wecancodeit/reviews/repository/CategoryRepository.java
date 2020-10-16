package org.wecancodeit.reviews.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
