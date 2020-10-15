package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.List;

@Controller
public class CategoryController {
    private CategoryStorage categoryStorage;

    public CategoryController(CategoryStorage categoryStorage) {
        this.categoryStorage = categoryStorage;
    }

    @RequestMapping("/category/{id}")
    public String displayCategoryPage(Model model, @PathVariable Long id) {
        model.addAttribute("category", categoryStorage.retrieveCategoryById(id));
        return "Category";
    }

}
//to do link BigBox to BigBox
// link big box to Sam's Club

