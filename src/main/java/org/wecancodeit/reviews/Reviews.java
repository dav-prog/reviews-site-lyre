package org.wecancodeit.reviews;

public class Reviews {

    private String storeName;
    private String categories;
    private String reviews;
    private String userName;
    private String hashtags;

    public Reviews(String storeName, String categories, String reviews, String userName, String hashtags) {
        this.storeName = storeName;
        this.categories = categories;
        this.reviews = reviews;
        this.userName = userName;
        this.hashtags = hashtags;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getCategories() {
        return categories;
    }

    public String getReviews() {
        return reviews;
    }

    public String getUserName() {
        return userName;
    }

    public String getHashtags() {
        return hashtags;
    }
}


