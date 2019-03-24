package com.ravisha.adapter;


 class ClassAdapter extends Adaptee implements  Target {

	@Override
	public int  sum(String x, String  y) {
		return super.add(Integer.parseInt(x),Integer.parseInt(y));
	} 

}



 class ObjectAdapter implements  Target{
	
	Adaptee obj = new Adaptee(); // Instead of directly instansiating Adaptee ,  we can use interface here.

	@Override
	public int sum(String x, String y) {
		return obj.add(Integer.parseInt(x),Integer.parseInt(y));
	}
	
}


