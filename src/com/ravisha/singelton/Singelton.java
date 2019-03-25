package com.ravisha.singelton;

public class Singelton {

    private static Singelton singelton = null;

    private Singelton(){

    }

    public Singelton getInstance(){
        if(singelton != null ){
            singelton = new Singelton();
        }
        return singelton;

    }
}
