package com.ravisha.proxy;

public class RealSubject implements Subject {

	@Override
	public void openDoor(String userName) {
		System.out.println("Door Opened..Welcome Mr.. "+userName);
		
	}
	

}
