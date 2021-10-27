package com.loggar.maps.iterate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class CollectionTest2 {
  @Test
  public void sort1() {
    int[] toSort = new int[] { 5, 1, 89, 255, 7, 88, 200, 123, 66 };
    int[] sortedInts = new int[] { 1, 5, 7, 66, 88, 89, 123, 200, 255 };

    // List<Integer> list = Arrays.asList(toSort);
    List<Integer> list = Arrays.stream(toSort).boxed().collect(Collectors.toList());
    List<Integer> sortedList = Arrays.stream(sortedInts).boxed().collect(Collectors.toList());

    Collections.sort(list);

    assertEquals(list, sortedList);
  }

  @Test
  public void sortWithLamda() {
    List<String> list = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");
    List<String> sortedList = list.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
    // reverse
    // List<String> sortedList = list.stream().sorted((o1, o2) ->
    // o2.compareTo(o1)).collect(Collectors.toList());

    sortedList.forEach(System.out::println);
  }

}
