package org.ecommerce.emarket.Repository;

import org.ecommerce.emarket.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    Optional<Product> findById(int id);

    void deleteById(int id);





}
