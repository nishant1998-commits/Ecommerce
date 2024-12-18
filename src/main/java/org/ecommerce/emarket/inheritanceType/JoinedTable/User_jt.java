package org.ecommerce.emarket.inheritanceType.JoinedTable;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User_jt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String createdAt;
    String lastUpdated;
}
