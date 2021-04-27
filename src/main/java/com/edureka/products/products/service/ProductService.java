package com.edureka.products.products.service;

import com.edureka.products.products.entity.Product;
import com.edureka.products.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> getAllProducts() {
        return (List<Product>) repository.findAll();
    }

    public void saveProduct(Product product) {
        repository.save(product);
    }

    public int countProduct() {
        return (int) repository.count();
    }

    public List<Product> getProductById(Integer productId) {
        List<Product> productList = repository.findAllByProductId(productId);
        System.out.println(productList);
        return productList;
    }
}
