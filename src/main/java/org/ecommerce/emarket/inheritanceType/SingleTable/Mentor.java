package org.ecommerce.emarket.inheritanceType.SingleTable;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue(value="2")
public class Mentor extends User {

      String company;
      int yoe;

}
