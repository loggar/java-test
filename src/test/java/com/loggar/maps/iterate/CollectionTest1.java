package com.loggar.maps.iterate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

public class CollectionTest1 {
  public void forEach() {
    List<String> list = Arrays.asList("A", "B", "C", "D");

    // Consumer<String> consumer = s -> { System.out::println };
    list.forEach(System.out::println); // the processing order of the items is defined
    list.stream().forEach(System.out::println); // the processing order of is undefined
  }

  public void findDiff() {
    List<String> listOne = Arrays.asList("Jack", "Tom", "Sam", "John", "James", "Jack");
    List<String> listTwo = Arrays.asList("Jack", "Daniel", "Sam", "Alan", "James", "George");

    List<String> differences = new ArrayList<>(listOne);
    differences.removeAll(listTwo);
    Assert.assertEquals(2, differences.size());
    Assert.assertEquals(differences, Arrays.asList("Tom", "John"));
  }

  public void ListEquals() {
    List<String> list1 = Arrays.asList("1", "2", "3", "4");
    List<String> list2 = Arrays.asList("1", "2", "3", "4");
    List<String> list3 = Arrays.asList("1", "2", "4", "3");

    Assert.assertEquals(list1, list2);
    Assert.assertNotSame(list1, list2);
    Assert.assertNotEquals(list1, list3);
  }
}
