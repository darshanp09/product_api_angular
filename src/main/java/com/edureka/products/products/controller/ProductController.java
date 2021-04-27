package com.edureka.products.products.controller;

import com.edureka.products.products.entity.Product;
import com.edureka.products.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService service;

//    @GetMapping("/")
    @GetMapping("/product")
    public List<Product> getProducts(){
       return service.getAllProducts();
    }

    @PostMapping("/prod")
    public void postProducts(@RequestBody Product product){
        product.setProductId(service.countProduct()+1);
        service.saveProduct(product);
    }

    @GetMapping("/product/{productId}")
    public List<Product> getProductById(@PathVariable("productId") Integer productId ){
        return service.getProductById(productId);
    }
}
