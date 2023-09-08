package com.tencent.p014mm.mm7zip;

/* renamed from: com.tencent.mm.mm7zip.ExtractOperationResult */
public enum ExtractOperationResult {
    OK,
    UNSUPPORTEDMETHOD,
    DATAERROR,
    CRCERROR,
    UNAVAILABLE,
    UNEXPECTED_END,
    DATA_AFTER_END,
    IS_NOT_ARC,
    HEADERS_ERROR,
    WRONG_PASSWORD,
    UNKNOWN_OPERATION_RESULT;

    public static ExtractOperationResult getOperationResult(int i) {
        return (i < 0 || i >= values().length) ? UNKNOWN_OPERATION_RESULT : values()[i];
    }
}
