package org.wecancodeit.reviews;

//  ***create controller for store info?
//  ***go back and make sure all links in templates are thymeleafed up
//  **get into JPA and database ish
//  *replace any lorem ipsum!!!!
//  change images on cards
//  **add reviews & hashtags

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

