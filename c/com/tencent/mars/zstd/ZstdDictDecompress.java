package com.tencent.mars.zstd;

import java.io.Closeable;

public class ZstdDictDecompress implements Closeable {
    private long nativePtr;

    public ZstdDictDecompress(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    private native void free();

    private native void init(byte[] bArr, int i, int i2);

    public void close() {
        free();
        this.nativePtr = 0;
    }

    public void finalize() {
        close();
    }

    public ZstdDictDecompress(byte[] bArr, int i, int i2) {
        this.nativePtr = 0;
        if (bArr.length >= 0) {
            init(bArr, i, i2);
            if (this.nativePtr == 0) {
                throw new IllegalStateException("ZSTD_createDDict failed");
            }
            return;
        }
        throw new IllegalArgumentException("Dictionary buffer is to short");
    }
}
