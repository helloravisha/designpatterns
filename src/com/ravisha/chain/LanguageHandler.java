package com.ravisha.chain;

public interface LanguageHandler {
  public void next(LanguageHandler languageHandler);	
  public void greeting(String message);
}
