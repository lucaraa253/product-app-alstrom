package com.training.pms.dao;

import com.training.pms.model.Product;

public interface ProductDAO {
//	Saving the product object
	public void addProduct(Product product);
	
	public void deleteProduct(int productId);
	
	public void updateProduct(Product product);
	
	public void searchByProductId(int productId);
	
	public void searchByProductName(String productName);
	
	public void printAllProducts();
	
}
