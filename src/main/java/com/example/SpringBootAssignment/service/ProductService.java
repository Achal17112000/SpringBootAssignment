package com.example.SpringBootAssignment.service;

import com.example.SpringBootAssignment.bean.Product;
import com.example.SpringBootAssignment.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getProducts() {
        List<Product> prod = new ArrayList<>();
        productRepository.findAll().forEach(x -> prod.add(x));
        return prod;
    }

    public Product getProductById(int prodId) {
        return productRepository.findById(prodId).get();
    }

    public Product getProductByName(String name) {
        return productRepository.findByProductName(name);
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }

    public void deleteProductById(int prodId)  {
        productRepository.deleteById(prodId);
    }
}
