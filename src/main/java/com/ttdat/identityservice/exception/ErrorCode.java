package com.ttdat.identityservice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized exception"),
    INVALID_KEY(1001, "Invalid message key"),
    USER_EXISTS(1002, "User already exists"),
    INVALID_USERNAME(1003, "Username must be at least 3 characters long"),
    INVALID_PASSWORD(1004, "Password must be at least 8 characters long");

    private final int code;
    private final String message;
}
