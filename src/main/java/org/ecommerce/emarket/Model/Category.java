package org.ecommerce.emarket.Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class Category extends BaseModel {


    String category_name;
    String description;
}
