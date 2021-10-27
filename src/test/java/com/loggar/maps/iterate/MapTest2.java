package com.loggar.maps.iterate;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class MapTest2 {
  @Test
  public void sortWith() {
    Map<String, Employee> map = new HashMap<>();

    Employee employee1 = new Employee(1L, "Mher", 100);
    map.put(employee1.getName(), employee1);
    Employee employee2 = new Employee(22L, "Annie", 200);
    map.put(employee2.getName(), employee2);
    Employee employee3 = new Employee(8L, "John", 300);
    map.put(employee3.getName(), employee3);
    Employee employee4 = new Employee(2L, "George", 400);
    map.put(employee4.getName(), employee4);

    // by key
    map.entrySet().stream().sorted(Map.Entry.<String, Employee>comparingByKey()).forEach(System.out::println);
    System.out.println("--");
    // by value
    map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    System.out.println("--");

    // using TreeMap
    TreeMap<String, Employee> treeMap = new TreeMap<>();
    treeMap.putAll(map);
    treeMap.entrySet().iterator().forEachRemaining(System.out::println);
  }
}
