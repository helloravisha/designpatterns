package com.ravisha.adapter;
/**
 * This is class Adapter pattern, This requires multiple inheritance.
 * Client always talks to adapter using target interface. Adapter then
 * talks to adaptee , by doing the required conversion if 
 * required. 
 * 
 * In this example, client has two string values 10, 20 . He doesn't 
 * know how to add, as they are string, There is a class called
 * Adaptee who knows how to add Integers. So to solve this problem
 * a new class called Adapter is introduced to do the required
 * Conversion. The class Adapter will convert String to Integer
 * and pass it to the Adaptee.
 * 
 * If we solve the Adapter pattern problem using inheritance 
 * it is called as Class Adapter otherwise its called 
 * Object Adapter. 
 * 
 *  
 * @author ravisha
 *
 */
public class Client {
  public static void main(String[] args) {
	Target target1 = new ClassAdapter(); // Using Inheritance.
	System.out.println(target1.sum("10", "20"));
	Target target2 = new ObjectAdapter();// Using Composition. 
	System.out.println(target2.sum("10", "20"));
}
}
