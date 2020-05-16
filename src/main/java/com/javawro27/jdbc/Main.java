package com.javawro27.jdbc;

public class Main {

    public static void main(String[] args) {
       StudentDao dao = new StudentDao();

       Student student = Student.builder()
               .firstName("Paweł")
               .lastName("Gawel")
               .alive(true)
               .height(1.8)
               .age(23)
               .build();

       dao.addToDatabase(student);
    }
}
