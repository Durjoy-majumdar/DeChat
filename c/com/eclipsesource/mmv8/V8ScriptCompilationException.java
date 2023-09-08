package com.eclipsesource.mmv8;

public class V8ScriptCompilationException extends V8ScriptException {
    public V8ScriptCompilationException(String str, int i, String str2, String str3, int i2, int i3) {
        super(0, str, i, str2, str3, i2, i3, (String) null, (Throwable) null);
    }

    public V8ScriptCompilationException(int i, String str, int i2, String str2, String str3, int i3, int i4) {
        super(i, str, i2, str2, str3, i3, i4, (String) null, (Throwable) null);
    }
}
