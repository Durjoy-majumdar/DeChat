package com.tencent.thumbplayer.core.common;

public class TPNativeLibraryException extends Exception {
    public TPNativeLibraryException() {
    }

    public TPNativeLibraryException(String str) {
        super(str);
    }

    public TPNativeLibraryException(Throwable th) {
        super(th);
    }

    public TPNativeLibraryException(String str, Throwable th) {
        super(str, th);
    }
}
