package com.loggar.maps.iterate;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTest3 {
  @Test
  public void givenMap_whenSortingByValues_thenSortedMap() {
    Employee[] employees = new Employee[] { new Employee(23L, "John", 5000.0d), new Employee(27L, "Steve", 6000),
        new Employee(34L, "Frank", 7000), new Employee(43L, "Earl", 10000), new Employee(22L, "Jessica", 4000),
        new Employee(33L, "Pearl", 6000) };

    Employee[] employeesSorted = new Employee[] { new Employee(22L, "Jessica", 4000),
        new Employee(23L, "John", 5000.0d), new Employee(27L, "Steve", 6000), new Employee(33L, "Pearl", 6000),
        new Employee(34L, "Frank", 7000), new Employee(43L, "Earl", 10000) };

    // Using Comparable
    Arrays.sort(employees);
    Assert.assertTrue(Arrays.equals(employees, employeesSorted));

    // Using Comparator
    Arrays.sort(employees, new Comparator<Employee>() {
      @Override
      public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.getSalary(), o2.getSalary());
      }
    });

    // Using Lamda
    Arrays.sort(employees, (a, b) -> {
      return a.compareTo(b);
    });
  }
}
