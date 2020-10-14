package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {

    @RequestMapping("/Review/{id}")
    public String displayReviewPage(Model model, @PathVariable long id){
        return "Review";

    }
    @RequestMapping("/Review/")
    public String displayReviewPagee(Model model) {
        return "Review";

    }
}
