package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

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
