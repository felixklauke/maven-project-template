package com.felixklauke.mpt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

final class PinkFluffyUnicornTest {

  private static final String NAME = "Unicorn";
  private static final int AGE = 1;
  private static final long CUTENESS_LEVEL = Long.MAX_VALUE;
  private PinkFluffyUnicorn unicorn;

  @BeforeEach
  void setUp() {
    unicorn = PinkFluffyUnicorn.of(NAME, AGE, CUTENESS_LEVEL);
  }

  @Test
  void name() {
    var name = unicorn.name();
    assertEquals(NAME, name);
  }

  @Test
  void age() {
    var age = unicorn.age();
    assertEquals(AGE, age);
  }

  @Test
  void cutenessLevel() {
    var cutenessLevel = unicorn.cutenessLevel();
    assertEquals(CUTENESS_LEVEL, cutenessLevel);
  }
}
