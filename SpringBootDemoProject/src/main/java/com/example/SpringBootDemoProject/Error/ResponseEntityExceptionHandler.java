package com.example.SpringBootDemoProject.Error;

import com.example.SpringBootDemoProject.entities.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@ResponseStatus
public class ResponseEntityExceptionHandler extends org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler {
    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<?> studentnotfoundexception(StudentNotFoundException exception, WebRequest request){

        ErrorMessage message=new ErrorMessage(exception.getMessage(),request.getDescription(false));

        return new  ResponseEntity(message,HttpStatus.NOT_FOUND);

    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleGlobalException(Exception exception, WebRequest request){

        ErrorMessage message=new ErrorMessage(exception.getMessage(),request.getDescription(false));

        return new ResponseEntity(message , HttpStatus.INTERNAL_SERVER_ERROR);


    }

}
