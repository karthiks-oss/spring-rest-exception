package com.seenukarthi.so;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserResource.class);

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Error> exceptionHandler(RuntimeException ex){
        LOGGER.error("Exception",ex);
        return new ResponseEntity<>(new Error("Error on processing",ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PostMapping(value = "/user")
    public User printUser(@RequestBody User user){
        LOGGER.info("User {}",user);
        return user;
    }
}
