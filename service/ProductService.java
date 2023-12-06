package com.ECommerce.ShopyGo.service;

import com.ECommerce.ShopyGo.entity.ProductEntity;
import com.ECommerce.ShopyGo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public List<ProductEntity> getProduct() {
        return productRepo.findAll();
    }

    public Optional<ProductEntity> getProductById(Integer productId){
       return productRepo.findById(productId);
    }
    public List<ProductEntity> getProductByName(String productName){
        return productRepo.findByproductName(productName);
    }

    public String addProduct(ProductEntity productEntity) {
        productRepo.save(productEntity);
        return "success";
    }
    public List<ProductEntity> addAll(List<ProductEntity> productEntity){
        return productRepo.saveAll(productEntity);


    }
    public String updateOrAddProduct(ProductEntity productEntity){
        productRepo.save(productEntity);
        return "successfully updated";
    }

    public String deleteProductById(Integer productId){
         ProductEntity p = productRepo.getReferenceById(productId);
        productRepo.delete(p);
        return "deleted successfully";
    }

}
