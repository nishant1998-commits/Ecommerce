package org.ecommerce.emarket.Controller;


import org.ecommerce.emarket.Model.Product;
import org.ecommerce.emarket.Service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Products")
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService) {

        this.productService = productService;

    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") int id ) {

        return productService.getProduct(id) ;

    }


}
