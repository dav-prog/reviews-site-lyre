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
        Categories cat1 = new Categories("test", Collections.EMPTY_LIST , "");
        model.addAttribute("categories", List.of(cat1));
        return "Home";
    }

}
