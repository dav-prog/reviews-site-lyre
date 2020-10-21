package org.wecancodeit.reviews.storage;


import org.wecancodeit.reviews.Hashtag;
import org.wecancodeit.reviews.repository.HashtagRepository;

import java.util.Optional;

public class HashtagStorage {

    private HashtagRepository hashtagRepo;

    public HashtagStorage(HashtagRepository hashtagRepo) {
        this.hashtagRepo = hashtagRepo;
    }

    public Iterable<Hashtag> retrieveAllHashtags(){
        return hashtagRepo.findAll();
    }

    public Hashtag retrieveHashtagById (Long id){
        Optional<Hashtag> retrievedHashtagOptional = hashtagRepo.findById(id);
        if (retrievedHashtagOptional.isPresent()){
            Hashtag retrievedHashtag = retrievedHashtagOptional.get();
            return retrievedHashtag;
        }else {
            return null;
        }
    }

    public void addHashtag(Hashtag hashtagToAdd){
        hashtagRepo.save(hashtagToAdd);
    }

    public void removeHashtag(Hashtag hashtagToRemove){
        hashtagRepo.deleteById(hashtagToRemove.getId());
    }





}
