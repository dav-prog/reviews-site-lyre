package org.wecancodeit.reviews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.storage.CategoryStorage;

@Controller
public class HomeController {
   private CategoryStorage categoryStorage;

    public HomeController(CategoryStorage categoryStorage) {
        this.categoryStorage = categoryStorage;
    }

    @RequestMapping({"","/","Home"})
    public String returnHomeView(Model model){

        model.addAttribute("categories", categoryStorage.retrieveAllCategories());
        return "Home";
    }
}
