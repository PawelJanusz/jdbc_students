package com.javawro27.jdbc;

import java.awt.*;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       StudentDao dao = new StudentDao();

        Scanner scanner = new Scanner(System.in);

        String command;

        do {
            System.out.println("Podaj komendę [add/list/delete/update/quit]");
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("add")){
                addStudents(dao, scanner);

            }else if (command.equalsIgnoreCase("list")){
                listStudents(dao);

            }else if (command.equalsIgnoreCase("delete")){
                deleteStudent(dao, scanner);

            }else if (command.equalsIgnoreCase("update")){
                updateStudent(dao, scanner);
            }
        }while (!command.equalsIgnoreCase("quit"));


    }

    private static void addStudents(StudentDao dao, Scanner scanner) {
        System.out.println("Podaj parametry: IMIE NAZWISKO WIEK WZROST ŻYWY");
        String line = scanner.nextLine();
        String[] words = line.split(" ");

        Student student = Student.builder()
                .firstName(words[0])
                .lastName(words[1])
                .height(Double.parseDouble(words[2]))
                .age(Integer.parseInt(words[3]))
                .alive(Boolean.parseBoolean(words[4]))
                .build();
        dao.addToDatabase(student);
    }

    private static void listStudents(StudentDao dao) {
        System.out.println("Lista: ");
        dao.getAllStudents().forEach(System.out::println);
    }

    private static void deleteStudent(StudentDao dao, Scanner scanner) {
        System.out.println("Podaj parametr: ID");
        Long id = Long.valueOf(scanner.nextLine());
        dao.deleteStudent(id);
    }

    private static void updateStudent(StudentDao dao, Scanner scanner) {
        System.out.println("Podaj parametry: IMIE NAZWISKO WZROST ŻYWY");
        String line = scanner.nextLine();
        String[] words = line.split(" ");

        System.out.println("Podaj parametr: ID");
        Long id = Long.valueOf(scanner.nextLine());
        Student student = Student.builder()
                .firstName(words[0])
                .lastName(words[1])
                .height(Double.parseDouble(words[2]))
                .age(Integer.parseInt(words[3]))
                .alive(Boolean.parseBoolean(words[4]))
                .id(id)
                .build();
        dao.updateStudent(student);
    }
}
//       Student student = Student.builder()
//               .firstName("Paweł")
//               .lastName("Gawel")
//               .alive(true)
//               .height(1.8)
//               .age(23)
//               .build();
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
//        Student studentToDelete = Student.builder()
//                .id(1L)
//                .build();
//
//        dao.deleteStudent(studentToDelete);
