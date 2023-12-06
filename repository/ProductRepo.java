package com.ECommerce.ShopyGo.repository;

import com.ECommerce.ShopyGo.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity,Integer> {

    public List<ProductEntity> findByproductName( String productName);

}
