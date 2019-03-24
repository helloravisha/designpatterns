package com.ravisha.chain;

public class NoLanguageHandler implements LanguageHandler{
	
	LanguageHandler nextLanguageHandler;

	@Override
	public void next(LanguageHandler languageHandler) {
		nextLanguageHandler = languageHandler;
		
	}

	@Override
	public void greeting(String message) {
		System.out.println("Dont know, what langauge you are talking.");
		
	}

}
