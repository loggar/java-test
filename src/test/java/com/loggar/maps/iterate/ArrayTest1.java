package com.loggar.maps.iterate;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class ArrayTest1 {
  public void arraySort() {
    Integer[] numbers = { 5, 22, 10, 0 };
    Arrays.sort(numbers);

    Employee john = new Employee(6L, "John", 100);
    Employee mary = new Employee(3L, "Mary", 200);
    Employee david = new Employee(4L, "David", 300);
    Employee[] employees = new Employee[] { john, mary, david };

    Arrays.sort(employees, Comparator.comparing(Employee::getName));
    assertArrayEquals(new Employee[] { david, john, mary }, employees);
    Arrays.sort(employees, Comparator.comparing(Employee::getName).thenComparing(Employee::getId));
  }

  public void arraySortDescending() {
    int[] numbers = new int[] { -8, 7, 5, 9, 10, -2, 3 };
    numbers = IntStream.of(numbers).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();
    assertArrayEquals(new int[] { 10, 9, 7, 5, 3, -2, -8 }, numbers);

    Employee john = new Employee(6L, "John", 100);
    Employee mary = new Employee(3L, "Mary", 200);
    Employee david = new Employee(4L, "David", 300);
    Employee[] employees = new Employee[] { john, mary, david };

    Arrays.sort(employees, Comparator.comparing(Employee::getName).reversed());
    assertArrayEquals(new Employee[] { mary, john, david }, employees);
  }

}
