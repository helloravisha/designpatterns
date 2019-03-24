package com.ravisha.decorator;

public class NonVegDecorator extends BiryaniDecorator{

	public NonVegDecorator(RiceComponent riceComponnet) {
		super(riceComponnet);
		
	}

	@Override
	public String prepare() {
		// TODO Auto-generated method stub
		return super.prepare()+ "With Chicken";
	}
}
