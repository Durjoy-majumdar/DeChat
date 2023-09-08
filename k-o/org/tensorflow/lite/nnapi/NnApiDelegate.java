package org.tensorflow.lite.nnapi;

import org.tensorflow.lite.C89288b;
import org.tensorflow.lite.TensorFlowLite;

public class NnApiDelegate implements C89288b, AutoCloseable {

    /* renamed from: d */
    public long f257240d = createDelegate(-1, (String) null, (String) null, (String) null, -1, false, true, false);

    public NnApiDelegate() {
        TensorFlowLite.m111603a();
    }

    private static native long createDelegate(int i, String str, String str2, String str3, int i2, boolean z, boolean z2, boolean z3);

    private static native void deleteDelegate(long j);

    private static native int getNnapiErrno(long j);

    /* renamed from: a */
    public long mo11577a() {
        return this.f257240d;
    }

    public void close() {
        long j = this.f257240d;
        if (j != 0) {
            deleteDelegate(j);
            this.f257240d = 0;
        }
    }
}
