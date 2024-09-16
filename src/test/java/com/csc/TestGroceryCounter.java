package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestGroceryCounter {

  GroceryCounter counter;

  @BeforeEach
  void setUp() {
    counter = new GroceryCounter();
  }

  // Put your tests here!
  @Test
  void ZeroHundrethsWorks() {
    assertEquals(0, counter.hundreths(0));
  }
  @Test
  void FiveHundrethsWorks() {
    assertEquals(5, counter.hundreths(5));
  }
  @Test
  void TenHundrethsWorks() {
    assertEquals(0, counter.hundreths(10));
  }
  @Test
  void ZeroTenthsWorks() {
    assertEquals(0, counter.tenths(0));
  }
  @Test
  void FiveTenthsWorks() {
    assertEquals(5, counter.tenths(5));
  }
  @Test
  void TenTenthsWorks() {
    assertEquals(0, counter.tenths(10));
  } 
  @Test
  void ZeroOnesWorks() {
    assertEquals(0, counter.ones(0));
  }
  @Test
  void FiveOnesWorks() {
    assertEquals(5, counter.ones(5));
  }
  @Test
  void TenOnesWorks() {
    assertEquals(0, counter.ones(10));
  } 
  @Test
  void ZeroTensWorks() {
    assertEquals(0, counter.tens(0));
  }
  @Test
  void FiveTensWorks() {
    assertEquals(5, counter.tens(5));
  }
  @Test
  void TenTensWorks() {
    assertEquals(0, counter.tens(10));
    assertEquals(1, counter.number_of_overflows());
  }
}