package org.ecommerce.emarket.Service;


import org.ecommerce.emarket.Model.Product;
import org.ecommerce.emarket.Repository.ProductRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("selfProductService")
public class SelfProductService implements ProductService{

    ProductRepository productRepository;

    SelfProductService(ProductRepository productRepository ){
        this.productRepository=productRepository;
    }

    public Product getProduct(int id){

        Optional<Product> optioanlProduct= productRepository.findById(id);
            if(optioanlProduct==null){
                throw new RuntimeException("Product with"+id+"Doesn't exist");
            }
            return optioanlProduct.get();
    }

    public Product createProduct(Product product){
        return null;
    }

    public Product updateProduct(int id,Product product){
        return null;
    }

    public Product patchProduct(int id,Product product){

        return null;

    }

    public void deleteProduct(int id){

        productRepository.deleteById(id);


    }






}
