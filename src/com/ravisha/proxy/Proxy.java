package com.ravisha.proxy;

public class Proxy implements Subject{

	Subject subject = new RealSubject();
	@Override
	public void openDoor(String userName) {
		if("ravi".equals(userName))
				subject.openDoor(userName);
		else
			System.out.println("No Access..");
		
	}

}
