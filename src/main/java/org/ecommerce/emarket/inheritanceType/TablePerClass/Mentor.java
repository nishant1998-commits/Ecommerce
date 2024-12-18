package org.ecommerce.emarket.inheritanceType.TablePerClass;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "mentor_tp")
public class Mentor extends User{

      String company;
      int yoe;

}
