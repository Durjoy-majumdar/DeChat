package com.tencent.youtu.sdkkitframework.common;

import java.io.IOException;

public class WeJsonException extends IOException {
    public WeJsonException() {
    }

    public WeJsonException(String str) {
        super(str);
    }

    public WeJsonException(String str, Throwable th) {
        super(str, th);
    }

    public WeJsonException(Throwable th) {
        super(th);
    }
}
