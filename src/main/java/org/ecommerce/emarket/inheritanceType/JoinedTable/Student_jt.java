package org.ecommerce.emarket.inheritanceType.JoinedTable;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@PrimaryKeyJoinColumn(name = "user_id")
public class Student_jt extends User_jt {

      double psp;
      int streak;

}
