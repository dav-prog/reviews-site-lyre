package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.List;

@Controller
public class CategoryController {
    @RequestMapping()
    public String returnCategoryController(Model model) {
        Category cat2 = new Category("test", Collections.EMPTY_LIST, "");
        model.addAttribute("category", cat2);
        return "Category";
    }

}
//to do link BigBox to BigBox
// link big box to Sam's Club

