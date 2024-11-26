package org.ecommerce.emarket.Service;

import org.ecommerce.emarket.Model.Product;

public interface ProductService {

    public Product getProduct(int id);

    public Product createProduct(Product product);

    public Product updateProduct(int id,Product product);

    public Product patchProduct(int id,Product product);

    public void deleteProduct(int id);

}
