package com.loggar.maps.iterate;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.Assert;

public class ArrayTest2 {
  public void anonymousComparator() {
    // Using Comparator
    Integer[] integers = { 4, 3, 6, 67, 8, 9 };
    Arrays.sort(integers, new Comparator<Integer>() {
      @Override
      public int compare(Integer a, Integer b) {
        return Integer.compare(a, b);
      }
    });

    // Using Lamda
    Integer[] integersToSort = new Integer[] { 3, 4, 8, 6, 9, 67 };
    Arrays.sort(integersToSort, (a, b) -> {
      return Integer.compare(a, b);
    });

    Assert.assertTrue(Arrays.equals(integers, new Integer[] { 3, 4, 6, 8, 9, 67 }));
  }
}
