package org.wecancodeit.reviews;

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
