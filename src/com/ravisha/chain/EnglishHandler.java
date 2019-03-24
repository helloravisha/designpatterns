package com.ravisha.chain;

public class EnglishHandler implements LanguageHandler{

	LanguageHandler nextLanguageHandler;

	@Override
	public void next(LanguageHandler languageHandler) {
		nextLanguageHandler = languageHandler;
		
	}

	@Override
	public void greeting(String message) {
		if(message.equals("Hello")){
		System.out.println("Handled by English Handler: "+message);
		}else{
			nextLanguageHandler.greeting(message);	
		}
			

		
	}

}
