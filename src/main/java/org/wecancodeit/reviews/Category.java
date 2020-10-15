package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;
@Entity
public class Category {

    @Id
    @GeneratedValue
    private Long id;
    private String categoryName;
    private Collection<Review> reviews;
    private String description;

    protected Category() { }

    public String getCategoryName() {
        return categoryName;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }

    public String getDescription() {
        return description;
    }

    public Category(String categoryName, Collection<Review> reviews, String description) {
        this.categoryName = categoryName;
        this.reviews = reviews;
        this.description = description;
    }
}
