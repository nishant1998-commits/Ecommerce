package org.ecommerce.emarket.introduction;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class Hello {

      @GetMapping("/world")
      public String sayHi(){
          return "Hello World";
      }

      @GetMapping("{name}")
      public String Hibuddy(@PathVariable("name") String name){

          return "Hello " + name;
      }


}
