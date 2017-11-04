package com.evenger.eventlog;

import com.evenger.eventlog.test.DemoClass;

/**
 * Main application class
 */
public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    DemoClass demoClass1 = new DemoClass();
    DemoClass demoClass2 = new DemoClass();
    demoClass1.setPrimaryKey(1);
    demoClass2.setPrimaryKey(2);
    demoClass1.setSampleString("Hello world");
    demoClass2.setSampleString("Disco hound");
    demoClass1.setDemoClass(demoClass2);
    demoClass2.setDemoClass(demoClass1);
    EvengerUtil.compare(demoClass1, demoClass2);
  }
}
