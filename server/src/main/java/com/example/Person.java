package com.example;

/**
 * This is a class.
 */
public class Person {

  /**
   * This is a constructor.
   */
  public Person() {

  }

  /**
   * @param someone the someone details
   * @return String
   */
  public final String person(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
