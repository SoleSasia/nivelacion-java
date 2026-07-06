package com.sole;

public class InvalidAccount extends RuntimeException{

    public InvalidAccount(String message){
        super(message);
    }

}
