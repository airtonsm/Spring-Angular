package io.github.airtons.clientes.rest.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class NegocioException extends RuntimeException{

    private HttpStatus status;

    public  NegocioException (HttpStatus status, String msg){
        super(msg);
        this.status = status;
    }

}
