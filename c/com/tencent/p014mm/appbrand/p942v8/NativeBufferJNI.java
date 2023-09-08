package com.tencent.p014mm.appbrand.p942v8;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import java.nio.ByteBuffer;
import p774zg.C91694e;
import p774zg.C91737o0;

/* renamed from: com.tencent.mm.appbrand.v8.NativeBufferJNI */
public class NativeBufferJNI implements C91694e {
    private long nativeInst = nativeCreate();

    static {
        int i = C91737o0.f262772b;
    }

    private native void nativeBindTo(long j, long j2, long j3);

    private native long nativeCreate();

    private native void nativeDestroy(long j);

    private native int nativeGenerateId(long j);

    private native byte[] nativeGetBuffer(long j, int i);

    private native ByteBuffer nativeGetDirectBuffer(long j, int i);

    private native void nativeReleaseDirectBuffer(ByteBuffer byteBuffer);

    private native void nativeSetBuffer(long j, int i, ByteBuffer byteBuffer);

    private native void nativeSetBufferForLegacyArray(long j, int i, byte[] bArr, int i2);

    public void bindTo(long j, long j2) {
        nativeBindTo(this.nativeInst, j, j2);
    }

    public void bufferStoreBindTo(long j, long j2) {
        bindTo(j, j2);
    }

    public void destroy() {
    }

    public void finalize() {
        super.finalize();
        long j = this.nativeInst;
        if (j != 0) {
            nativeDestroy(j);
            this.nativeInst = 0;
        }
    }

    public int generateId() {
        return nativeGenerateId(this.nativeInst);
    }

    public ByteBuffer getBuffer(int i, boolean z) {
        if (z) {
            return nativeGetDirectBuffer(this.nativeInst, i);
        }
        byte[] nativeGetBuffer = nativeGetBuffer(this.nativeInst, i);
        if (nativeGetBuffer == null) {
            return null;
        }
        return ByteBuffer.wrap(nativeGetBuffer);
    }

    public void releaseDirectByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer != null && byteBuffer.isDirect()) {
            nativeReleaseDirectBuffer(byteBuffer);
        } else if (BuildInfo.DEBUG) {
            throw new IllegalArgumentException("buffer is null or is not direct!");
        }
    }

    public void setBuffer(int i, ByteBuffer byteBuffer) {
        if (byteBuffer != null && byteBuffer.capacity() != 0) {
            if (byteBuffer.isDirect()) {
                nativeSetBuffer(this.nativeInst, i, byteBuffer);
                return;
            }
            byte[] array = byteBuffer.array();
            nativeSetBufferForLegacyArray(this.nativeInst, i, array, array.length);
        }
    }

    public boolean supportBufferStoreBindTo() {
        return true;
    }
}
