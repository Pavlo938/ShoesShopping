package com.skirnevskyi.shoppingbackend.dao;

import com.skirnevskyi.shoppingbackend.dto.Category;

import java.util.List;

public interface CategoryDAO {
    List<Category> list();
    Category get(int id);
}
