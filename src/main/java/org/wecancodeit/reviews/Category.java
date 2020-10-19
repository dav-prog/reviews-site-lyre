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
//     can't store a collection in a row
//    private Collection<Review> reviews;
    private String description;

    protected Category() { }

    public String getCategoryName() {
        return categoryName;
    }
//this should be the responsibility of the review controller, not category controller
//    public Collection<Review> getReviews() {
//        return reviews;
//    }

    public String getDescription() {
        return description;
    }

    public Category(String categoryName, String description) {
        this.categoryName = categoryName;
//        This no longer exists now that review collection is out
//        this.reviews = reviews;
        this.description = description;
    }
//    created a getter for id
    public Long getId() { return id; }
}
