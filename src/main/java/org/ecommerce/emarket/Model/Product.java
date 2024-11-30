package org.ecommerce.emarket.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class Product extends BaseModel {


    String name;
    String description;
    double price;
    String imageUrl;
    @ManyToOne
    Category category;

}
