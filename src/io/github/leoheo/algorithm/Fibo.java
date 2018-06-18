package io.github.leoheo.algorithm;

/**
 * @author Heo, Jin Han
 * @since 2018-06-18
 */
public class Fibo {

  public static int fibN(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("n must not be less than zero");
    }

    if (n == 1) return 1;
    if (n == 0) return 0;

    return fibN(n-1)+ fibN(n - 2);
  }
}
