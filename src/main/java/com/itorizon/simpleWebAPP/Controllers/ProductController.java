package com.itorizon.simpleWebAPP.Controllers;

import com.itorizon.simpleWebAPP.Models.Product;
import com.itorizon.simpleWebAPP.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
@GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }
    @GetMapping("/products/{productid}")
    public Product getProductByID(@PathVariable int productid) {
     return service.getProductBYID(productid);
    }
    @PostMapping("/products")
    public void addproducts(@RequestBody Product pr) {
        System.out.println(pr);
    service.addProduct(pr);
    }
    @PutMapping("/products")
   public void updateProduct(@RequestBody Product pr) {
    service.updateProduct(pr);
   }
   @DeleteMapping("/products/{pid}")
    public void deleteProduct(@PathVariable int pid) {
    service.deleteProduct(pid);
   }
}
