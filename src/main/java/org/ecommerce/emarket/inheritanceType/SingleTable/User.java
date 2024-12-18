package org.ecommerce.emarket.inheritanceType.SingleTable;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type",discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorValue(value="0")
public class User {
    @Id
    int id;
    String name;
    String createdAt;
    String lastUpdated;
}
