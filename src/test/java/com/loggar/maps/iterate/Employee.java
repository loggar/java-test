package com.loggar.maps.iterate;

public class Employee implements Comparable<Employee> {
  private Long id;
  private String name;
  private double salary;

  public Employee(Long id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  @Override
  public int compareTo(Employee employee) {
    return (int) (this.id - employee.getId());
  }

  @Override
  public boolean equals(Object obj) {
    return ((Employee) obj).getName().equals(getName());
  }

  // override hashCode

  @Override
  public String toString() {
    return this.name + " " + this.id;
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

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

}
