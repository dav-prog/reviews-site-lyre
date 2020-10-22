package org.wecancodeit.reviews;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.storage.CategoryStorage;
import org.wecancodeit.reviews.storage.HashtagStorage;
import org.wecancodeit.reviews.storage.ReviewStorage;


import java.util.Collections;

@Component
public class Populator implements CommandLineRunner {

    private CategoryStorage categoryStorage;
    private ReviewStorage reviewStorage;
    private HashtagStorage hashtagStorage;


    public Populator( CategoryStorage categoryStorage, ReviewStorage reviewStorage, HashtagStorage hashtagStorage) {

        this.categoryStorage = categoryStorage;
        this.reviewStorage = reviewStorage;
        this.hashtagStorage = hashtagStorage;
    }




    @Override
    public void run(String... args) throws Exception {

        Category specialty = new Category("Specialty", "Specialty stores provide unique and otherwise hard-to-find items that can't be found anywhere else. These items may come at a premium due to their scarce nature.");
        Category bigBox = new Category("Big Box", "Big box stores are usually membership-only. Items are generic, but sold in bulk to reduce cost. Many provide sampling opportunities which may provide a social aspect of the shopping experience.");

        categoryStorage.addCategory(specialty);
        categoryStorage.addCategory(bigBox);

        Review reviewOne = new Review("Weiland's Market", specialty, "I looked it up  online  and saw all the booze" +
                " and and meats I guess 5/5 looking forward to going there one day. #bOoZeForLyfe ", "bosco", "/IMG/Weilands_Market.png");
        reviewStorage.addReview(reviewOne);
        Review reviewTwo = new Review("Lucky's Market", specialty, "Locally owned chained, not owned by Kroger's, but by Dave's (the one in Cleveland). High prices, decent quality.\n" +
                "        I can find a lot of bulk items, but not since COVID, and specialty herbs.\n" +
                "        I had a friend there once who worked in the meat department but he walked out on the job.\n" +
                "        You can walk around with a beer and/or wine while you're shopping so that's cool.\n" +
                "        Overall 3/5 stars.", "Tim Cook, Apple CEO","/IMG/Lucky_logo.jpg");
        reviewStorage.addReview(reviewTwo);
        Review reviewThree = new Review("Sam's Club", bigBox, "Sam's Club is a giant warehouse filled with bulk items - if you want to pay for the membership. I tried to shop here but they said I couldn't until I 'paid for it' and 'stopped causing a scene'. Also, it takes forever to get there since it's out in the boonies. 5/5 stars.", "KarenSuburbia666","/IMG/Sams_Club_logo.png");
        reviewStorage.addReview(reviewThree);

        Hashtag hashtag1 = new Hashtag(1L,"#organic",Collections.EMPTY_LIST);
        hashtagStorage.addHashtag(hashtag1);










    }

}
