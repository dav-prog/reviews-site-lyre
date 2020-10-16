package org.wecancodeit.reviews;

//  ***create storage for store data
//  **create repository for stores
//  ***add in to populator all store info
//  ***create controller for store info?
//  go back and make sure all links in templates are thymeleafed up
//  replace any lorem ipsum!!!!
//  **get into JPA and database ish
//  change images on cards
//  **add reviews & hashtags

//  stuff we need to know about store:
//


public class Store {
    private long id;
    private String storeName;
    private Category categoryName;
    private String content;

    public Store(long id, String storeName, Category categoryName, String content) {
        this.id = id;
        this.storeName = storeName;
        this.categoryName = categoryName;
        this.content = content;
    }
    protected Store() {

    }

    public long getId() {
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
