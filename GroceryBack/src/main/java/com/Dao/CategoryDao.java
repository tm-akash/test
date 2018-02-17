package com.Dao;

import java.util.List;

import com.Model.Category;

public interface CategoryDao {

	void insertCategory(Category c);
	
	List<Category> retrieveCat();

}
