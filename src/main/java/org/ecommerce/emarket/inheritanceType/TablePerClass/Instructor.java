package org.ecommerce.emarket.inheritanceType.TablePerClass;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity(name = "instructor_tp")

public class Instructor extends User {

    String subject;
    double avg_rating;
}
