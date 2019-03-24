package com.ravisha.chain;

public class HindiHandler implements LanguageHandler {

	LanguageHandler nextLanguageHandler;

	@Override
	public void next(LanguageHandler languageHandler) {
		nextLanguageHandler = languageHandler;
		
	}

	@Override
	public void greeting(String message) {
		if(message.equals("Namaskar")){
		System.out.println("Handled by Hindi Handler: "+message);
		}else{
			nextLanguageHandler.greeting(message);	
		}
			

		
	}

}
