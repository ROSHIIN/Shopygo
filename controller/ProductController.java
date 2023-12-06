package com.ECommerce.ShopyGo.controller;

import com.ECommerce.ShopyGo.entity.ProductEntity;
import com.ECommerce.ShopyGo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/product/all")
    public List<ProductEntity> getProduct(){
        return productService.getProduct();
    }

    @GetMapping("product/get/{productId}")
    public Optional<ProductEntity> getProductById(@PathVariable Integer productId){
        return productService.getProductById(productId);
    }

    @GetMapping("product/get/{productName}")
    public List<ProductEntity> getProductByName(@PathVariable String productName){
        return productService.getProductByName(productName);
    }

    @PostMapping("/product/add")
    public String addProduct(@RequestBody ProductEntity productEntity){
        return productService.addProduct(productEntity);
    }
    @PostMapping("product/add/all")
    public List<ProductEntity> addAll(@RequestBody List<ProductEntity> productEntity){
        return productService.addAll( productEntity);

    }
    @PutMapping("/product/update")
    public String updateOrAddProduct(@RequestBody ProductEntity productEntity){
        return productService.updateOrAddProduct(productEntity);
    }

    @DeleteMapping("/product/delete{productId}")
    public String deleteProductById(@PathVariable Integer productId){
        return productService.deleteProductById(productId);

    }




}
