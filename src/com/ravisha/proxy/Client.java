package com.ravisha.proxy;

public class Client {
   public static void main(String[] args) {
	Subject subject = new Proxy();
	subject.openDoor("ravi");
	subject.openDoor("test");
}
}
