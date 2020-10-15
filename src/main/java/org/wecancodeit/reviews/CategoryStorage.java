package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

@Service
public class CategoryStorage {
    private CategoryRepository categoryRepo;


    public CategoryStorage(CategoryRepository categoryRepo) {
        this.categoryRepo = categoryRepo;
    }



    public void addCategory(Category categoryToAdd) {
        categoryRepo.save(categoryToAdd);


    }

    public Iterable<Category> retrieveAllCategories() {
        return categoryRepo.findAll();
    }

    public Category retrieveCategoryById(Long id) {
        Optional<Category> retrievedCategoryOptional = categoryRepo.findById(id);
        if (retrievedCategoryOptional.isPresent()) {
            Category retriedCategory = retrievedCategoryOptional.get();
            return retriedCategory;
        }else{
            return null;
        }
    }

}
