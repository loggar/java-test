package com.loggar.maps.iterate;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;

public class CollectionTest3 {
  @Test
  public void reversed() {
    int[] toSort = new int[] { 5, 1, 89, 255, 7, 88, 200, 123, 66 };
    int[] sortedInts = new int[] { 66, 123, 200, 88, 7, 255, 89, 1, 5 };

    // List<Integer> list = Arrays.asList(toSort);
    List<Integer> list = Arrays.stream(toSort).boxed().collect(Collectors.toList());
    List<Integer> sortedList = Arrays.stream(sortedInts).boxed().collect(Collectors.toList());

    Collections.reverse(list);
    Assert.assertEquals(list, sortedList);

    // reversed with stream
    List<String> list1 = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");
    List<String> sortedList1 = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    sortedList1.forEach(System.out::println);

  }
}
