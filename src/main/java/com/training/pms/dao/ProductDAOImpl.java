package com.training.pms.dao;

import com.training.pms.model.Product;

public class ProductDAOImpl implements ProductDAO {

	public void addProduct(Product product) {
		System.out.println("Adding products " + product);

	}

	public void deleteProduct(int productId) {
		System.out.println("Deleting products : " + productId);

	}

	public void updateProduct(Product product) {
		System.out.println("Updating products : " + product);

	}

	public void searchByProductId(int productId) {
		System.out.println("Adding product with product ID : " + productId);

	}

	public void searchByProductName(String productName) {
		System.out.println("Search product with product name " + productName);

	}

	public void printAllProducts() {
		System.out.println("Printing all products ");

	}

}
