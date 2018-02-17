package com.Dao;

import java.util.List;

import com.Model.Category;
import com.Model.Supplier;

public interface SupplierDao {
	
	void insertSupplier(Supplier s);
	
	List<Supplier> retrieveSup();

}
