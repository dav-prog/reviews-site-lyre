package org.wecancodeit.reviews;

import java.util.Collection;

public class Categories {

    private String categoryName;
    private Collection<Review> reviews;
    private String description;

    public String getCategoryName() {
        return categoryName;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }

    public String getDescription() {
        return description;
    }

    public Categories(String categoryName, Collection<Review> reviews, String description) {
        this.categoryName = categoryName;
        this.reviews = reviews;
        this.description = description;
    }
}
