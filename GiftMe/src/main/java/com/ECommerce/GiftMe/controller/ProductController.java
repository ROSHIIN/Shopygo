package com.ECommerce.GiftMe.controller;

import com.ECommerce.GiftMe.entity.Product;
import com.ECommerce.GiftMe.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    //get all products in the product table
    @GetMapping(path = "/products/all")
    @ResponseBody
    public Iterable<Product> getAllProduct(){
         return productRepository.findAll();

    }
    @GetMapping(path = "/product/{id}")
    public Product getProduct(int id){
        Product product = productRepository.findById(id).get();
        return product;
    }
    @PostMapping("/product/add")
    public void createProduct(@RequestBody Product product){
        productRepository.save(product);
    }
}
