package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
@Entity
public class Category {

    @Id
    @GeneratedValue
    private Long id;
    private String categoryName;


    @OneToMany(mappedBy = "category")
    private Collection<Review> reviews;
    private String description;
    protected Category() { }

    public Category(String categoryName, String description) {
        this.categoryName = categoryName;
        this.description = description;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }

    public String getCategoryName() {
        return categoryName;
    }


    public String getDescription() {
        return description;
    }
    public Long getId() { return id; }
}
