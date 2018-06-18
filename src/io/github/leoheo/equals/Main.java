package io.github.leoheo.equals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    Student leo1 = new Student(1L, "Leo");
    Student leo2 = new Student(1L, "Leo");

    System.out.println("leo1 hashcode => " + leo1.hashCode());
    System.out.println("leo2 hashcode => " + leo2.hashCode());
    System.out.println("leo1.equals(leo2) => " + leo1.equals(leo2));
    System.out.println("leo1 == leo2 => " + (leo1 == leo2));

    List<Student> students = new ArrayList<>();
    students.add(leo1);
    System.out.println("students contains Leo => " + students.contains(new Student(1L, "Leo")));

    Set<Student> studentSet = new HashSet<>();
    studentSet.add(leo1);
    studentSet.add(new Student(1L, "Leo"));
    System.out.println("studentSet size => " + studentSet.size()); // studentSet size => 1
  }
}
