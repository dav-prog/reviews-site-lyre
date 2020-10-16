package org.wecancodeit.reviews.storage;

import org.wecancodeit.reviews.Store;
import org.wecancodeit.reviews.repository.StoreRepository;

import java.util.Optional;

public class StoreStorage {
    private StoreRepository storeRepo;

    public StoreStorage(StoreRepository storeRepo) { this.storeRepo = storeRepo; }

    public void addStore(Store storeToAdd) {
        storeRepo.save(storeToAdd);
    }

    public Iterable<Store> retrieveAllStores() { return storeRepo.findAll(); }

    public Store retrieveStoreById(Long id) {
        Optional<Store> retrievedStoreOptional = storeRepo.findById(id);
        if (retrievedStoreOptional.isPresent()) {
            Store retriedStore = retrievedStoreOptional.get();
            return retriedStore;
        }   else{
            return null;
        }
    }
}

