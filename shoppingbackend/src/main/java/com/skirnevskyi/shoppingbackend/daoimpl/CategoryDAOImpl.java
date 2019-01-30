package com.skirnevskyi.shoppingbackend.daoimpl;

import com.skirnevskyi.shoppingbackend.dao.CategoryDAO;
import com.skirnevskyi.shoppingbackend.dto.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

    //creating dummy table
    private static List<Category> categories = new ArrayList<>();

    static {
        //adding first category
        Category category = new Category();
        category.setId(1);
        category.setName("Puma");
        category.setDescription("This is a description for Puma shoes");
        category.setImageURL("CAT_1.png");
        categories.add(category);

        //adding second category
         category = new Category();
        category.setId(2);
        category.setName("Nike");
        category.setDescription("This is a description for Nike shoes");
        category.setImageURL("CAT_2.png");
        categories.add(category);

        //adding third category
         category = new Category();
        category.setId(3);
        category.setName("Adidas");
        category.setDescription("This is a description for Adidas shoes");
        category.setImageURL("CAT_3.png");
        categories.add(category);
    }

    @Override
    public List<Category> list() {
        return categories;
    }

    @Override
    public Category get(int id) {
        for (Category category: categories){
            if(category.getId() == id)
                return  category;
        }
        return null;
    }
}
