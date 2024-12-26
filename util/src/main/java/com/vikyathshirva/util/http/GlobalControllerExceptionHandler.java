package com.vikyathshirva.util.http;

import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * GlobalControllerExceptionHandler
 */
@RestControllerAdvice
public class GlobalControllerExceptionHandler {

    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(GlobalControllerExceptionHandler.class);







    private HttpErrorInfo createHttpErrorInfo(
        HttpStatus httpStatus,
        ServerHttpRequest request,
        Exception ex
    ){

        final String path = request.getPath().pathWithinApplication().value();
        final String message = ex.getMessage();
        LOG.debug("Returning HTTP Status: {} for path {}, message : {}", httpStatus, path, message);
        return new HttpErrorInfo(httpStatus, path, message);
    }


}
