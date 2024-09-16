package com.csc;

import java.util.Scanner;

public class GroceryCounter {

  // class variables
  int hundreths;
  int tenths;
  int ones;
  int tens;
  int overflows;

  // default class definition with all variables = 0
  public GroceryCounter() {
    hundreths = 0;
    tenths = 0;
    ones = 0;
    tens = 0;
  }

  // hundreths function
  public int hundreths(int hundreths) {
    while (hundreths >= 10) {
      hundreths = hundreths - 10;
      tenths = tenths + 1;
    }
    return hundreths;
  }

  // tenths function
  public int tenths(int tenths) {
    while (tenths >= 10) {
      tenths = tenths - 10;
      ones = ones + 1;
    }
    return tenths;
  }

  // ones function
  public int ones(int ones) {
    while (ones >= 10) {
      ones = ones - 10;
      tens = tens + 1;
    }
    return ones;
  }

  // tens function
  public int tens(int tens) {
    while (tens >= 10) {
      tens = tens - 10;
      overflows = overflows + 1;
    }
    return tens;
  }

  // total function (compiles and formats previous results)
  public String total(int hundreths, int tenths, int ones, int tens) {
    String total;
    hundreths = hundreths(this.hundreths);
    tenths = tenths(this.tenths);
    ones = ones(this.ones);
    tens = tens(this.tens);
    if (tens == 0) {
      total = "$" + ones + "." + tenths + hundreths;
    }
    else {
      total = "$" + tens + ones + "." + tenths + hundreths;
    }
    return total;
  }

  // overflows returner
  public int number_of_overflows() {
    return overflows;
  }

  // clearing function
  public void clear() {
    hundreths = 0;
    tenths = 0;
    ones = 0;
    tens = 0;
    overflows = 0;
  }
public static void main(String[] args) {

  // definiting objects
  Scanner scanner = new Scanner(System.in);
  GroceryCounter counter = new GroceryCounter();

  // prompting
  System.out.print("Enter number of hundreths place taps: ");
  counter.hundreths = scanner.nextInt();
  System.out.print("Enter number of tenths place taps: ");
  counter.tenths = scanner.nextInt();
  System.out.print("Enter number of ones place taps: ");
  counter.ones = scanner.nextInt();
  System.out.print("Enter number of tens place taps: ");
  counter.tens = scanner.nextInt();
  scanner.close();

  // final result
  System.out.println(counter.total(counter.hundreths, counter.tenths, counter.ones, counter.tens));
  System.out.println("overflows: " + counter.number_of_overflows());

} 
}