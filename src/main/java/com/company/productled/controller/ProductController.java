package com.company.productled.controller;

import javax.validation.constraints.NotNull;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.productled.model.Product;
import com.company.productled.service.ProductService;

@RestController
@RequestMapping("/services/product")
public class ProductController {

	// productService constructor injection
	private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
	
    @GetMapping("/isAlive")
    public String isAlive() {
    	System.out.println("Product Service is alive");
        return "Product Service is alive";
    }
    
    @GetMapping("/getAllProducts")
    public @NotNull Iterable<Product> getProducts() {
    	System.out.println("Get All Products");
        return productService.getAllProducts();
    }
}
