package com.advicegen.exception;

import com.advicegen.payload.ErrorDetails;
import org.apache.ibatis.binding.BindingException;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NotFoundException.class)

    public ResponseEntity<ErrorDetails> handlenotfoundException(NotFoundException exception)
    {
        ErrorDetails errorDetails = new ErrorDetails(new Date(),exception.getMessage());
         return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(DuplicateEntryException.class)

    public ResponseEntity<ErrorDetails> handleDuplicateEntry(DuplicateEntryException exception)
    {
        ErrorDetails errorDetails = new ErrorDetails(new Date(),exception.getMessage());
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(BindingException.class)
    public ResponseEntity<ErrorDetails> bindingException(BindingException exception)
    {
        ErrorDetails errorDetails = new ErrorDetails(new Date(),exception.getMessage());
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ErrorDetails> constraintViolation(ConstraintViolationException exception)
    {
        String msg = exception.getMessage();
        logger.error(msg);
        ErrorDetails errorDetails = new ErrorDetails(new Date(),exception.getMessage());
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(AlreadyExist.class)
    public ResponseEntity<ErrorDetails> handleAlreadyExist(AlreadyExist exception)
    {
        String msg = exception.getMessage();
        logger.error(msg);
        ErrorDetails errorDetails = new ErrorDetails(new Date(),exception.getMessage());
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_ACCEPTABLE);
    }



//    JdbcSQLIntegrityConstraintViolationException
//    @ExceptionHandler(JdbcSQLIntegrityConstraintViolationException.class)
//    public ResponseEntity<ErrorDetails> duplicateentry(DataIntegrityViolationException exception)
//    {
//        ErrorDetails errorDetails = new ErrorDetails(new Date(),exception.getMessage());
//        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_ACCEPTABLE);
//    }


}
