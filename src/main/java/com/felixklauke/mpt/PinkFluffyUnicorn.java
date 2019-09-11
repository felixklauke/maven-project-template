package com.felixklauke.mpt;

public class PinkFluffyUnicorn {

  private final String name;
  private final int age;
  private final long cutenessLevel;

  /**
   * Create a new pink fluffy unicorn.
   *
   * @param name The name of the unicorn.
   * @param age The age of the unicorn.
   * @param cutenessLevel The cuteness level of the unicorn.
   */
  public PinkFluffyUnicorn(String name, int age, long cutenessLevel) {
    this.name = name;
    this.age = age;
    this.cutenessLevel = cutenessLevel;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public long getCutenessLevel() {
    return cutenessLevel;
  }
}
