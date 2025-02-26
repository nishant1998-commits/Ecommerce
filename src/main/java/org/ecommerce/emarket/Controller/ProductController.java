package org.ecommerce.emarket.Controller;


import org.ecommerce.emarket.Model.Product;
import org.ecommerce.emarket.Service.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Products")
public class ProductController {

    ProductService productService;

    public ProductController(@Qualifier("selfProductService") ProductService productService) {

        this.productService = productService;

    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") int id ) {

        return productService.getProduct(id) ;

    }

    @PostMapping()
    public Product addProduct(@RequestBody Product product){

        return productService.createProduct(product);

    }

    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable ("id") int id, @RequestBody Product product){

        return productService.updateProduct(id,product);
    }

    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable ("id") int id,@RequestBody Product product){

        return  productService.patchProduct(id, product);

    }

    @DeleteMapping("/{id}")
    public void removeProduct(@PathVariable ("id") int id){

        productService.deleteProduct(id);

    }






}
