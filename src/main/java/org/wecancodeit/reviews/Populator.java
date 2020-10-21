package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.storage.CategoryStorage;
import org.wecancodeit.reviews.storage.HashtagStorage;
import org.wecancodeit.reviews.storage.ReviewStorage;
import org.wecancodeit.reviews.storage.StoreStorage;

import java.util.Collections;

@Component
public class Populator implements CommandLineRunner {
    private StoreStorage storeStorage;
    private CategoryStorage categoryStorage;
    private ReviewStorage reviewStorage;
    private HashtagStorage hashtagStorage;


    public Populator(StoreStorage storeStorage, CategoryStorage categoryStorage, ReviewStorage reviewStorage, HashtagStorage hashtagStorage) {
        this.storeStorage = storeStorage;
        this.categoryStorage = categoryStorage;
        this.reviewStorage = reviewStorage;
        this.hashtagStorage = hashtagStorage;
    }




    @Override
    public void run(String... args) throws Exception {

        Category specialty = new Category("Specialty", "Specialty stores are stores that house specialty items.");
        Category bigBox = new Category("Big Box", "Big box stores are big boxes full of food.");
// need another repository for stores or just data for each store somewhere
        categoryStorage.addCategory(specialty);
        categoryStorage.addCategory(bigBox);

        Store luckys = new Store((long) 1, "Lucky's", specialty, "Lucky's is locally-owned and operated. Its also a fresh market with natural and organic options.");
        Store samsClub = new  Store((long) 2, "Sam's Club", bigBox, "Sam's Club specializes in bulk and with a paid membership.");
        storeStorage.addStore(luckys);
        storeStorage.addStore(samsClub);

        Hashtag hashtag1 = new Hashtag(1L,"#organic",Collections.EMPTY_LIST);
        hashtagStorage.addHashtag(hashtag1);










    }

}
