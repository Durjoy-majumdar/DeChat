package org.tensorflow.lite.flex;

import java.io.Closeable;
import org.tensorflow.lite.C89288b;

public class FlexDelegate implements C89288b, Closeable {

    /* renamed from: d */
    public long f34347d = nativeCreateDelegate();

    private static native long nativeCreateDelegate();

    private static native void nativeDeleteDelegate(long j);

    private static native long nativeInitTensorFlow();

    /* renamed from: a */
    public long mo11577a() {
        return this.f34347d;
    }

    public void close() {
        long j = this.f34347d;
        if (j != 0) {
            nativeDeleteDelegate(j);
            this.f34347d = 0;
        }
    }
}
