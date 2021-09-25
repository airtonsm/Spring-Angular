package io.github.airtons.clientes.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NegocioException.class) //intercepta qualquer excessão do tipo instanciado
    public ResponseEntity<ErrorDTO> resourceNotFound(NegocioException e) {
        ErrorDTO err = new ErrorDTO(e.getStatus().getReasonPhrase(), e.getMessage(), e.getStatus().value());
        return ResponseEntity.status(e.getStatus()).body(err);
    }
}
