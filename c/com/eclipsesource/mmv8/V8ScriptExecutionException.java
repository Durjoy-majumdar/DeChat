package com.eclipsesource.mmv8;

public class V8ScriptExecutionException extends V8ScriptException {
    public V8ScriptExecutionException(String str, int i, String str2, String str3, int i2, int i3, String str4) {
        this(0, str, i, str2, str3, i2, i3, str4, (Throwable) null);
    }

    public V8ScriptExecutionException(int i, String str, int i2, String str2, String str3, int i3, int i4, String str4, Throwable th) {
        super(i, str, i2, str2, str3, i3, i4, str4, th);
    }
}
