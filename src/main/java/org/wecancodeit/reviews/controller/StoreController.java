package org.wecancodeit.reviews.controller;

import org.springframework.stereotype.Controller;
import org.wecancodeit.reviews.storage.StoreStorage;

@Controller
public class StoreController {

    private StoreStorage storeStorage;
    public StoreController(StoreStorage storeStorage) {
        this.storeStorage = storeStorage;
    }

}
