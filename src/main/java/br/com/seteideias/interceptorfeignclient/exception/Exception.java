package br.com.seteideias.interceptorfeignclient.exception;

import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Exception {


    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler(value = {ValueInstantiationException.class})
    public String handle2(ValueInstantiationException ex) {
        ResponseHanderTest reposta_setada = new ResponseHanderTest("reposta setada");
        return reposta_setada.getResposta();
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = {HttpMessageNotReadableException.class})
    public String handle2(HttpMessageNotReadableException ex) {
        ResponseHanderTest reposta_setada = new ResponseHanderTest("OPS... PAYLOAD NAO VALIDO");
        return reposta_setada.getResposta();
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = {IllegalArgumentException.class})
    public String handle3(IllegalArgumentException ex) {
        ResponseHanderTest reposta_setada = new ResponseHanderTest("OPS... erro interno");
        return reposta_setada.getResposta();
    }

}
