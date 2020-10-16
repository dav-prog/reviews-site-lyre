package org.wecancodeit.reviews.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.Review;
import org.wecancodeit.reviews.repository.ReviewRepository;

@Service
public class ReviewStorage {

    private ReviewRepository reviewRepo;

    public ReviewStorage(ReviewRepository reviewRepository) {
        this.reviewRepo = reviewRepository;
    }

    public void addReview(Review reviewToAdd){
        reviewRepo.save(reviewToAdd);
    }

    public Iterable<Review> retrieveAllReviews(){
        return reviewRepo.findAll();
    }

    public Review retrieveReviewById(long id){
        return (Review) reviewRepo.findById(id).get();
    }
}
