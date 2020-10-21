package org.wecancodeit.reviews.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.storage.HashtagStorage;

@Controller
public class HashtagController {
    private HashtagStorage hashtagStorage;

    public HashtagController(HashtagStorage hashtagStorage) {
        this.hashtagStorage = hashtagStorage;
    }

    @RequestMapping("/hashtag/{id}")
    public String displayCurrentHashtag(Model model, @PathVariable Long id){
        model.addAttribute("hashtag", hashtagStorage.retrieveHashtagById(id));
        return "Hashtag";
    }
}
