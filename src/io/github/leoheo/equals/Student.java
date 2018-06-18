package io.github.leoheo.equals;

import java.util.Objects;

/**
 * @author Heo, Jin Han
 * @since 2018-06-10
 */
public class Student {

  private Long id;
  private String name;

  public Student(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Student)) {
      return false;
    }
    Student student = (Student) o;
    return Objects.equals(getId(), student.getId());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId());
  }

  public void test(Object... values) {
    for(Object a: values) {
      System.out.println(a.hashCode());
    }
  }
}
