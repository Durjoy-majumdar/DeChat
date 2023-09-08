package com.tencent.liteav.videobase.p1096b;

import java.io.IOException;

/* renamed from: com.tencent.liteav.videobase.b.g */
public final class C104518g extends IOException {
    private static final long serialVersionUID = 2723743254380545567L;
    public final int mErrorCode;
    private final String mErrorMessage;

    public C104518g(int i) {
        this(i, "");
    }

    public final String getMessage() {
        if (this.mErrorMessage != null) {
            return "EGL error code: " + this.mErrorCode + ", " + this.mErrorMessage;
        }
        return "EGL error code: " + this.mErrorCode + ", " + super.getMessage();
    }

    public C104518g(int i, String str) {
        super(str);
        this.mErrorCode = i;
        this.mErrorMessage = str;
    }

    public C104518g(int i, String str, Throwable th) {
        super(str, th);
        this.mErrorCode = i;
        this.mErrorMessage = str;
    }
}
