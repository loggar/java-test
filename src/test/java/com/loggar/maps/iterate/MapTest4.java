package com.loggar.maps.iterate;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapTest4 {
  public void collect() {
    Map<String, Employee> map = new HashMap<>();

    Employee employee1 = new Employee(1L, "Tom", 100);
    map.put(employee1.getName(), employee1);
    Employee employee2 = new Employee(22L, "Annie", 200);
    map.put(employee2.getName(), employee2);
    Employee employee3 = new Employee(8L, "John", 300);
    map.put(employee3.getName(), employee3);
    Employee employee4 = new Employee(2L, "George", 400);
    map.put(employee4.getName(), employee4);

    map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

    @SuppressWarnings("unused")
    Map<String, Employee> result = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(
        Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
  }
}
