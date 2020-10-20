package org.wecancodeit.reviews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.wecancodeit.reviews.storage.StoreStorage;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StoreController {

    private StoreStorage storeStorage;
    public StoreController(StoreStorage storeStorage) {
        this.storeStorage = storeStorage;
    }

    @RequestMapping("/Store/{id}")
    public String displayStorePage(Model model, @PathVariable Long id) {
        return "Store";
    }

    @RequestMapping("/Store/")
    public String displayStorePagee(Model model) {
        return "Store";
    }
}
