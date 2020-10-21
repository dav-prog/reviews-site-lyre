package org.wecancodeit.reviews;

import javax.persistence.*;
import java.util.Collection;

// added Entity annotation plus id and generatedValue annotations to Review class, plus no arg constructor

@Entity
public class Review {

    @Id
    @GeneratedValue
    private Long id;
    private String storeName;
    @ManyToOne
    private Category category;
    @Lob
    private String content;
    private String userName;
    @ManyToMany(mappedBy = "reviews")
    private Collection<Hashtag> hashtags;




    public Review(String storeName, Category category, String content, String userName) {
        this.storeName = storeName;
        this.category = category;
        this.content = content;
        this.userName = userName;
    }

    protected Review() {

    }

    public String getStoreName() {
        return storeName;
    }

    public Category getCategory() {
        return category;
    }

    public String getContent() {
        return content;
    }

    public String getUserName() {
        return userName;
    }

    public Collection<Hashtag> getHashtags() {
        return hashtags;
    }

    public Long getId() { return id;}

}


