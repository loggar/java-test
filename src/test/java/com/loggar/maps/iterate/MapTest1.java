package com.loggar.maps.iterate;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MapTest1 {
  @Test
  public void computeIfAbsentKeyExist() {
    Map<String, Integer> stringLength = new HashMap<>();
    stringLength.put("John", 5);
    assertEquals((long) stringLength.computeIfAbsent("John", s -> s.length()), 5);
  }

  @Test
  public void sortKeys() { // map keys already sorted
    Map<Integer, String> m = new HashMap<Integer, String>();
    m.put(1, "apple");
    m.put(4, "pineapple");
    m.put(2, "orange");
    m.put(5, "strawberry");
    m.put(3, "melon");

    m.entrySet().iterator().forEachRemaining(System.out::println); // already sorted

    Integer[] keys = m.keySet().toArray(new Integer[0]);
    System.out.println(Arrays.toString(keys)); // already sorted

    // Arrays.sort(keys);
    assertArrayEquals(keys, new Integer[] { 1, 2, 3, 4, 5 });
  }

  @Test
  public void compute() {
    Map<Integer, String> m = new HashMap<Integer, String>();
    m.put(1, "apple");

    m.compute(1, (k, v) -> {
      return v + v;
    });

    assertEquals(m.get(1), "appleapple");
  }

}
