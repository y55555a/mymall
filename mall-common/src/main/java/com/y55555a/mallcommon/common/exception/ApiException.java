package com.y55555a.mallcommon.common.exception;

import com.y55555a.mallcommon.common.api.IErrorCode;

/**
 * @Author y55555a
 * Date on 2020/4/30  15:59
 * 自定义API异常
 */
public class ApiException extends RuntimeException{

    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
}
