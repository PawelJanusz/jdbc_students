package com.javawro27.jdbc;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Student {

   private Long id;

   private String firstName;
   private String lastName;

   private double height;
   private int age;
   private boolean alive;
}
