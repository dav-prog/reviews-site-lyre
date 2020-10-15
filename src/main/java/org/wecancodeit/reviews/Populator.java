package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class Populator implements CommandLineRunner {

    private CategoryStorage categoryStorage;
    private ReviewStorage reviewStorage;

    public Populator(CategoryStorage categoryStorage, ReviewStorage reviewStorage) {
        this.categoryStorage = categoryStorage;
        this.reviewStorage = reviewStorage;
    }
    @Override
    public void run(String... args) throws Exception {

        Category specialty = new Category("Specialty", Collections.EMPTY_LIST, "Specialty stores are stores that house specialty itmes.");
        Category bigBox = new Category("Big Box", Collections.EMPTY_LIST, "Big box stores are big boxes full of food.");

        categoryStorage.addCategory(specialty);
        categoryStorage.addCategory(bigBox);











    }

}
