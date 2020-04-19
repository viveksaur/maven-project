package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {
  System.out.println("JENKINS webhook");
  }

  //TODO: Add javadoc comment
  public String greet(String jenkins) {
    return String.format("Hello, %s!", jenkins);
  }
}
