package com.tencent.xweb;

public class CreateWebViewException extends RuntimeException {
    public CreateWebViewException() {
    }

    public CreateWebViewException(String str) {
        super(str);
    }

    public CreateWebViewException(String str, Throwable th) {
        super(str, th);
    }

    public CreateWebViewException(Throwable th) {
        super(th);
    }
}
