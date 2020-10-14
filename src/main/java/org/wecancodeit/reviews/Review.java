package org.wecancodeit.reviews;

public class Review {

    private String storeName;
    private String categories;
    private String content;
    private String userName;
    private String hashtags;
    private long id;

    public Review(String storeName, String categories, String content, String userName, String hashtags,long id) {
        this.storeName = storeName;
        this.categories = categories;
        this.content = content;
        this.userName = userName;
        this.hashtags = hashtags;
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getCategories() {
        return categories;
    }

    public String getContent() {
        return content;
    }

    public String getUserName() {
        return userName;
    }

    public String getHashtags() {
        return hashtags;
    }

    public long getId() { return id;}

}


