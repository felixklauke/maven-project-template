package com.felixklauke.mpt;

import java.util.Objects;

public final class PinkFluffyUnicorn {

  private final String name;
  private final int age;
  private final long cutenessLevel;

  private PinkFluffyUnicorn(String name, int age, long cutenessLevel) {
    this.name = name;
    this.age = age;
    this.cutenessLevel = cutenessLevel;
  }

  public static PinkFluffyUnicorn of(String name, int age, long cutenessLevel) {
    Objects.requireNonNull(name);
    return new PinkFluffyUnicorn(name, age, cutenessLevel);
  }

  public String name() {
    return name;
  }

  public int age() {
    return age;
  }

  public long cutenessLevel() {
    return cutenessLevel;
  }
}
