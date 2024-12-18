package org.ecommerce.emarket.inheritanceType.TablePerClass;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "User_Tp")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {
    @Id
           // @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String createdAt;
    String lastUpdated;
}
