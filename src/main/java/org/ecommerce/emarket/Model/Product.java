package org.ecommerce.emarket.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    int id;
    String name;
    String description;
    double price;
    String imageUrl;
    Category category;

}
