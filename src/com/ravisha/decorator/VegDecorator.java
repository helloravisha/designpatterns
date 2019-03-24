package com.ravisha.decorator;

public class VegDecorator extends BiryaniDecorator {

	public VegDecorator(RiceComponent riceComponnet) {
		super(riceComponnet);
		
	}

	@Override
	public String prepare() {
		// TODO Auto-generated method stub
		return super.prepare()+ "With Vegtables";
	}
  
}
