package com.tencent.wcdb.support;

public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this((String) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OperationCanceledException(String str) {
        super(str == null ? "The operation has been canceled." : str);
    }
}
