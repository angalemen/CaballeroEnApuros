package com.example.caballeroenapurosconexioapi.error;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)

    public String handleException(Exception ex, Model model){

        String errorMessage = "S'ha produït un error inesperat" + ex.getMessage();

        model.addAttribute("errorMessage", errorMessage);

        return "error";


    }

}