package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// added Entity annotation plus id and generatedValue annotations to Review class, plus no arg constructor

@Entity
public class Review {

    @Id
    @GeneratedValue
    private long id;
    private String storeName;
    private String categories;
    private String content;
    private String userName;
    private String hashtags;


    public Review(String storeName, String categories, String content, String userName, String hashtags,long id) {
        this.storeName = storeName;
        this.categories = categories;
        this.content = content;
        this.userName = userName;
        this.hashtags = hashtags;
        this.id = id;
    }

    protected Review() {

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


