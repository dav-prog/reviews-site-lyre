package org.wecancodeit.reviews;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Hashtag {


    @Id
    @GeneratedValue
    private Long id;
    private String hashName;
    @ManyToMany
    private Collection<Review> reviews;

    protected Hashtag(){}

    public Hashtag(Long id, String hashName, Collection<Review> reviews) {
        this.id = id;
        this.hashName = hashName;
        this.reviews = reviews;
    }

    public Long getId() {
        return id;
    }

    public String getHashName() {
        return hashName;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "Hashtag{" +
                "id=" + id +
                ", hashName='" + hashName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hashtag hashtag = (Hashtag) o;

        if (!id.equals(hashtag.id)) return false;
        return hashName.equals(hashtag.hashName);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + hashName.hashCode();
        return result;
    }
}
