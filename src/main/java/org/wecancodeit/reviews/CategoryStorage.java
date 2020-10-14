package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@Service
public class CategoryStorage {
    Collection<Category>categories = new ArrayList<>(); //replace this with a line repository

    private Category cat1;
    private Category cat2;

    public void addCategory() {
        categories.add(cat1);
        categories.add(cat2);

        cat1 = new Category("Specialty", Collections.EMPTY_LIST, "Specialty stores are full of special food.");
        cat2 = new Category("Big Box", Collections.EMPTY_LIST, "Big box stores are big boxes full of food.");

    }
    public Iterable<Category> retrieveAllCategories() {
        return categories;
    }

    public
}
