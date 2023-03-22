package com.example.mongoatlas.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(Integer id){
        super("Could not find user with id "+id);
    }
}
