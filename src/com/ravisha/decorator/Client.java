package com.ravisha.decorator;


/**
 * Decorator patterns is all about playing with contructors.
 * The concrete Component will be invoked by the  concrete Absrtact decorator.
 */
public class Client {
  public static void main(String[] args) {
   RiceComponent riceComponent1 = new NonVegDecorator(new BiryaniConcereteComponent());
   System.out.println(riceComponent1.prepare());
   RiceComponent riceComponent2 = new VegDecorator(new BiryaniConcereteComponent());
   System.out.println(riceComponent2.prepare());
   RiceComponent riceComponent3 = new NonVegDecorator(new VegDecorator(new BiryaniConcereteComponent()));
   System.out.println(riceComponent3.prepare());

   
}
}
