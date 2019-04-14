package com.ravisha.decorator;

public abstract class BiryaniDecorator implements RiceComponent {
	
	private RiceComponent riceComponent;
	
	public BiryaniDecorator(RiceComponent riceComponent){
		this.riceComponent = riceComponent;
	}

	@Override
	public String prepare() {
		return riceComponent.prepare();
		
	}

}
