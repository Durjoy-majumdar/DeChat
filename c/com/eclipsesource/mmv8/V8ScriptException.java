package com.eclipsesource.mmv8;

import com.tencent.xweb.file.XVFSFile;

public abstract class V8ScriptException extends V8RuntimeException {
    private final int contextTag;
    private final int endColumn;
    private final String fileName;
    private final String jsMessage;
    private final String jsStackTrace;
    private final int lineNumber;
    private final String sourceLine;
    private final int startColumn;

    public V8ScriptException(int i, String str, int i2, String str2, String str3, int i3, int i4, String str4, Throwable th) {
        this.contextTag = i;
        this.fileName = str;
        this.lineNumber = i2;
        this.jsMessage = str2;
        this.sourceLine = str3;
        this.startColumn = i3;
        this.endColumn = i4;
        this.jsStackTrace = str4;
        if (th != null) {
            initCause(th);
        }
    }

    private char[] createCharSequence(int i, char c) {
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = c;
        }
        return cArr;
    }

    private String createJSStackDetails() {
        if (this.jsStackTrace == null) {
            return "";
        }
        return "\n" + this.jsStackTrace;
    }

    private String createMessageDetails() {
        StringBuilder sb = new StringBuilder();
        String str = this.sourceLine;
        if (str != null && !str.isEmpty()) {
            sb.append(10);
            sb.append(this.sourceLine);
            sb.append(10);
            int i = this.startColumn;
            if (i >= 0) {
                sb.append(createCharSequence(i, ' '));
                sb.append(createCharSequence(this.endColumn - this.startColumn, '^'));
            }
        }
        return sb.toString();
    }

    private String createMessageLine() {
        return this.fileName + XVFSFile.PATH_SEPARATOR + this.lineNumber + ": " + this.jsMessage;
    }

    public int getContextTag() {
        return this.contextTag;
    }

    public int getEndColumn() {
        return this.endColumn;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getJSMessage() {
        return this.jsMessage;
    }

    public String getJSStackTrace() {
        return this.jsStackTrace;
    }

    public int getLineNumber() {
        return this.lineNumber;
    }

    public String getMessage() {
        return createMessageLine();
    }

    public String getSourceLine() {
        return this.sourceLine;
    }

    public int getStartColumn() {
        return this.startColumn;
    }

    public String toString() {
        return createMessageLine() + createMessageDetails() + createJSStackDetails() + "\n" + getClass().getName();
    }
}
