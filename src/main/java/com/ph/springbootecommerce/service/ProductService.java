package com.ph.springbootecommerce.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ph.springbootecommerce.dao.ProductRepository;
import com.ph.springbootecommerce.entity.Product;


@Service
public class ProductService {
	@Autowired
	private ProductRepository repo;

	public List<Product> listAllProduct() {
		return repo.findAll();

	}
	public void createProduct(Product prd) {
		  repo.save(prd);
	}
	
	public Optional<Product> getProductsById(Long id) {
		return repo.findById(id);
	}
	
	public void deleteProduct(Long id) {
		repo.deleteById(id);
	}
	
	public void updateProduct(Long id, Product prd) {
			prd.setName(prd.getName());
			prd.setPrice(prd.getPrice());
			prd.setDescription(prd.getDescription());
			prd.setCount(prd.getCount());
			prd.setCountAvailable(prd.getCountAvailable());
			prd.setCategory(prd.getCategory());
			prd.setImg(prd.getImg());
			repo.save(prd);
	}

}
