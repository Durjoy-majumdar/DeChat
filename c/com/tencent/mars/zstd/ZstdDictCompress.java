package com.tencent.mars.zstd;

import java.io.Closeable;

public class ZstdDictCompress implements Closeable {
    private long nativePtr;

    public ZstdDictCompress(byte[] bArr, int i) {
        this(bArr, 0, bArr.length, i);
    }

    private native void free();

    private native void init(byte[] bArr, int i, int i2, int i3);

    public void close() {
        free();
        this.nativePtr = 0;
    }

    public void finalize() {
        close();
    }

    public ZstdDictCompress(byte[] bArr, int i, int i2, int i3) {
        this.nativePtr = 0;
        if (bArr.length - i >= 0) {
            init(bArr, i, i2, i3);
            if (0 == this.nativePtr) {
                throw new IllegalStateException("ZSTD_createCDict failed");
            }
            return;
        }
        throw new IllegalArgumentException("Dictionary buffer is to short");
    }
}
