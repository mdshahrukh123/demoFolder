package com.geekster.ecommerce.repository;

import com.geekster.ecommerce.models.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class OrderDao {
    List<Product> cart;

    public void ProductDao()
    {
        System.out.println("create dummy product");
        cart = new ArrayList<>();
        cart.add(new Product(0,"Mainaks Default product","0","Dummy","Material","Gucci"));
    }


    public List<Product> fetchALL() {
        return cart;
    }

    public boolean save(Product product) {
        cart.add(product);
        return true;
    }
}
