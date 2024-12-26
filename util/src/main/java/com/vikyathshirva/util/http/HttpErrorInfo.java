package com.vikyathshirva.util.http;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;

/**
 * HttpErrorInfo
 */
public record HttpErrorInfo(
    ZonedDateTime timestamp,
    String path,
    HttpStatus httpStatus,
    String message
) {


    public HttpErrorInfo(HttpStatus httpStatus, String path, String message) {
        this(ZonedDateTime.now(), path, httpStatus, message);
    }
}
