package org.ecommerce.emarket.inheritanceType.SingleTable;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("3")
public class Instructor extends User {

    String subject;
    double avg_rating;
}
