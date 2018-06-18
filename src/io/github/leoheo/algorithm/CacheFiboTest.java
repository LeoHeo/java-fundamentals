package io.github.leoheo.algorithm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Heo, Jin Han
 * @since 2018-06-18
 */
class CacheFiboTest {

  @Test
  public void largeFib () {
    final long nonCachedStart = System.nanoTime();
    assertEquals(1134903170, Fibo.fibN(45));
    final long nonCachedEnd = System.nanoTime();
    assertEquals(1134903170, new CacheFibo().cachedFibN(45));

    System.out.println("Non-Cached Time: " + (nonCachedEnd - nonCachedStart) + " nanoseconds");
    System.out.println("Cached Time: " + (System.nanoTime() - nonCachedEnd) + " nanoseconds");
  }
}