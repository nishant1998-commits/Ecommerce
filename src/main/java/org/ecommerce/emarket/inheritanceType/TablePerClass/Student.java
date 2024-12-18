package org.ecommerce.emarket.inheritanceType.TablePerClass;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "student_tp")
public class Student extends User {

      double psp;
      int streak;

}
