package com.learning.Springshopper.service.product;

import com.learning.Springshopper.exceptions.ProductNotFoundException;
import com.learning.Springshopper.model.Product;
import com.learning.Springshopper.repository.productRepository;

import java.util.List;

public class ProductService implements IProductService{
    private productRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product getProductById(Long id) {
            return productRepository.findById(id)
                    .orElseThrow(() -> new ProductNotFoundException("Product not found"));
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.findById(id)
                .ifPresentOrElse(productRepository::delete, () -> {
            throw new ProductNotFoundException("Product not found");
        });
    }

    @Override
    public void updateProduct(Product product, Long productId) {

    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByCategoryAndBrand(String category, String brand) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByName(String name) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByBrandAndName(String brand, String name) {
        return List.of();
    }

    @Override
    public Long countProductsByBrandAndName(String brand, String name) {
        return 0L;
    }
}
