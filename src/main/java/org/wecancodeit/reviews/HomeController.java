package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping({"","/"})
    public String returnHomeView(Model model){
        Category cat1 = new Category("Specialty", Collections.EMPTY_LIST , "");
        Category cat2 = new Category("BigBox", Collections.EMPTY_LIST , "");
        model.addAttribute("categories", List.of(cat1, cat2));
        return "Home";
    }
}
