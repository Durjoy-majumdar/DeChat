package com.tencent.map.tools.net.exception;

public class NetDataEmptyException extends Exception {
    private static final long serialVersionUID = -5614711401833110994L;

    public NetDataEmptyException() {
    }

    public NetDataEmptyException(String str) {
        super(str);
    }

    public NetDataEmptyException(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
