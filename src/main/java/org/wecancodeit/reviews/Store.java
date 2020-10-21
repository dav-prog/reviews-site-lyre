package org.wecancodeit.reviews;

//  clean up thymeleaf, any stray hardcoded items
//  **get into JPA and database ish
//  change images on cards
//  delete unneeded files
//  link hashtags to reviews
//  do some extra CSS styling


import javax.persistence.*;

@Entity
public class Store {

    @Id
    @GeneratedValue
    private Long id;
    private String storeName;
    @ManyToOne
    private Category categoryName;
    private String content;

    public Store(Long id, String storeName, Category categoryName, String content) {
        this.id = id;
        this.storeName = storeName;
        this.categoryName = categoryName;
        this.content = content;
    }
    protected Store() {

    }

    public Long getId() {
        return id;
    }

    public String getStoreName() {
        return storeName;
    }

    public Category getCategoryName() {
        return categoryName;
    }

    public String getContent() {
        return content;
    }

}

