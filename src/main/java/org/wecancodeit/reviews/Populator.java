package org.wecancodeit.reviews;

import jdk.jfr.consumer.RecordedEvent;
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

        Review reviewOne = new Review("storeName", specialty, "testContent", "bosco12345");
        reviewStorage.addReview(reviewOne);
        Review reviewTwo = new Review("Lucky's", specialty, "Locally owned chained, not owned by Kroger's, but by Dave's (the one in Cleveland). High prices, decent quality.\n" +
                "        I can find a lot of bulk items, but not since COVID, and specialty herbs.\n" +
                "        I had a friend there once who worked in the meat department but he walked out on the job.\n" +
                "        You can walk around with a beer and/or wine while you're shopping so that's cool.\n" +
                "        Overall 3/5 stars.", "Tim Cook, Apple CEO");
        reviewStorage.addReview(reviewTwo);
        Review reviewThree = new Review("Sam's Club", bigBox, "Sam's Club is a giant warehouse filled with bulk items - if you want to pay for the membership. I tried to shop here but they said I couldn't until I 'paid for it' and 'stopped causing a scene'. Also, it takes forever to get there since it's out in the boonies. 5/5 stars.", "KarenSuburbia666");
        reviewStorage.addReview(reviewThree);
//        Store luckys = new Store((long) 1, "Lucky's", specialty, "Lucky's is locally-owned and operated. Its also a fresh market with natural and organic options.");
//        Store samsClub = new  Store((long) 2, "Sam's Club", bigBox, "Sam's Club specializes in bulk and with a paid membership.");
//        storeStorage.addStore(luckys);
//        storeStorage.addStore(samsClub);

        Hashtag hashtag1 = new Hashtag(1L,"#organic",Collections.EMPTY_LIST);
        hashtagStorage.addHashtag(hashtag1);










    }

}
