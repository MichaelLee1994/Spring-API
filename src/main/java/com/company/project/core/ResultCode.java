package com.company.project.core;

/**
 * response code
 */
public enum ResultCode {
    SUCCESS(200),//success
    FAIL(400),//fail
    UNAUTHORIZED(401),//unverified
    NOT_FOUND(404),//interface not exists
    INTERNAL_SERVER_ERROR(500);//internal error

    public int code;

    ResultCode(int code) {
        this.code = code;
    }
}
