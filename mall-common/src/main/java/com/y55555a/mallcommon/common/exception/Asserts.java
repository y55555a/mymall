package com.y55555a.mallcommon.common.exception;

import com.y55555a.mallcommon.common.api.IErrorCode;

/**
 * @Author y55555a
 * Date on 2020/4/30  15:59
 *
 * 断言处理类，用于抛出各种API异常
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
