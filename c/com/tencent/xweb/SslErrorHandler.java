package com.tencent.xweb;

public interface SslErrorHandler {
    void cancel();

    void proceed();
}
