package com.tencent.wcdb.extension.fts;

import com.tencent.wcdb.extension.SQLiteExtension;

public final class MMFtsTokenizer implements SQLiteExtension {
    public static final SQLiteExtension EXTENSION = new MMFtsTokenizer();

    private MMFtsTokenizer() {
    }

    private static native void nativeInitialize(long j, long j2);

    public void initialize(long j, long j2) {
        nativeInitialize(j, j2);
    }
}
