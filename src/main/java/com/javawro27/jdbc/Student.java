package com.javawro27.jdbc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student {

   private Long id;

   private String firstName;
   private String LastName;

   private double wzrost;
   private int age;
   private boolean alive;
}
