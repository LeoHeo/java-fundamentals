package io.github.leoheo.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Heo, Jin Han
 * @since 2018-06-18
 */
public class CacheFibo {

  private Map<Integer, Integer> fibCache = new HashMap<>();

  public int cachedFibN(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("n must not be less than zero");
    }

    fibCache.put(0, 0);
    fibCache.put(1, 1);
    return recursiveCachedFibN(n);
  }

  private int recursiveCachedFibN(int n) {
    if (fibCache.containsKey(n)) {
      return fibCache.get(n);
    }

    int value = recursiveCachedFibN(n - 1) + recursiveCachedFibN(n - 2);
    fibCache.put(n, value);
    return value;
  }
}
