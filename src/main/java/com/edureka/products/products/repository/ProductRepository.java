package com.edureka.products.products.repository;

import com.edureka.products.products.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, UUID> {
    List<Product> findAllByProductId(int id);
}
