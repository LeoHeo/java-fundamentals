package io.github.leoheo.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Heo, Jin Han
 * @since 2018-06-18
 */
public class MyCode {

  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      String input = br.readLine();
      int size = Integer.parseInt(input);

       String[] result = new String[size];

      for (int i=0; i<size; i++) {
        String[] word = br.readLine().split(" ");
        result[i] = word[1] + " " + word[0];
      }

      for (String word: result) {
        System.out.println(word);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } catch (NumberFormatException e) {
      throw new NumberFormatException("invalid number format");
    }
  }
}
