package com.tencent.tav.core;

public class ExportRuntimeException extends RuntimeException {
    private final ExportErrorStatus errorStatus;

    public ExportRuntimeException(int i, Throwable th) {
        this(new ExportErrorStatus(i, th));
    }

    public ExportErrorStatus getErrorStatus() {
        return this.errorStatus;
    }

    public ExportRuntimeException(ExportErrorStatus exportErrorStatus) {
        super(exportErrorStatus.throwable);
        this.errorStatus = exportErrorStatus;
    }
}
