package com.javawro27.jdbc;

import java.util.List;

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
       // C - Create
//       dao.addToDatabase(student);

       //R - Read (All)
//        List<Student> studentList = dao.getAllStudents();
//        studentList.forEach(System.out::println);


        // U - Update
//        Student studentToUpdate = Student.builder()
//                .firstName("Gracjan")
//                .lastName("Nowak")
//                .alive(false)
//                .height(2.13)
//                .age(36)
//                .id(1L)         // wymaga podania identyfikatora
//                .build();
//        dao.updateStudent(studentToUpdate);
        Student studentToDelete = Student.builder()
                .id(1L)
                .build();

        dao.deleteStudent(studentToDelete);
    }
}
