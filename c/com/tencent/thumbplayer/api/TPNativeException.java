package com.tencent.thumbplayer.api;

import com.tencent.thumbplayer.core.common.TPNativeLibraryException;

public class TPNativeException extends TPNativeLibraryException {
    public TPNativeException(String str) {
        super(str);
    }

    public TPNativeException(Throwable th) {
        super(th);
    }

    public TPNativeException(String str, Throwable th) {
        super(str, th);
    }
}
