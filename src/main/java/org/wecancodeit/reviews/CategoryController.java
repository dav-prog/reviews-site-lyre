package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.List;

@Controller
public class CategoryController {

    private final Category cat1;
    private final Category cat2;

    public CategoryController() {
        cat1 = new Category("Specialty", Collections.EMPTY_LIST, "Specialty stores are full of special food.");
        cat2 = new Category("Big Box", Collections.EMPTY_LIST, "Big box stores are big boxes full of food.");
    }

    @RequestMapping("{categoryName}")
    public String returnCategoryController(Model model, @PathVariable String categoryName) {
        model.addAttribute("category", cat1);
        model.addAttribute("category", cat2);
        return "Category";
    }

}
//to do link BigBox to BigBox
// link big box to Sam's Club

