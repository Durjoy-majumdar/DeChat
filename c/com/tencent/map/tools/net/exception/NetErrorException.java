package com.tencent.map.tools.net.exception;

import java.io.IOException;

public class NetErrorException extends IOException {
    public int errorCode;
    public int statusCode;

    public NetErrorException() {
    }

    public NetErrorException(String str) {
        super(str);
    }

    public NetErrorException(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
