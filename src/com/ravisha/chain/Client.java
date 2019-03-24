package com.ravisha.chain;

public class Client {
	public static void main(String[] args) {
		
		/* Create Objects */
		LanguageHandler englishHandler = new EnglishHandler();
		LanguageHandler hindiHandler = new HindiHandler();
		LanguageHandler noLanguageHandler = new NoLanguageHandler();
		
		/* Define the Chain */
		englishHandler.next(hindiHandler);
		hindiHandler.next(noLanguageHandler);
		
		/* Start Testing with different messages */
		englishHandler.greeting("Namaskar");
		englishHandler.greeting("Hello");
		englishHandler.greeting("Abcduer");

		
		
	}

}
