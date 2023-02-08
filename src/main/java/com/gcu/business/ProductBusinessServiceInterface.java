package com.gcu.business;

import java.math.BigInteger;
import java.util.*;

import com.gcu.model.ProductModel;

public interface ProductBusinessServiceInterface {
	public List<ProductModel> getProducts();
	public void init();
	public void destroy();
	public void addProduct(ProductModel item);
	public ProductModel readProduct(BigInteger id);

	ProductModel readProduct(long id);

	public void updateProduct(ProductModel item);
	public void deleteProduct(ProductModel item);
}
