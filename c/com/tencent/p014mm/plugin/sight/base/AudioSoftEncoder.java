package com.tencent.p014mm.plugin.sight.base;

import java.nio.ByteBuffer;
import rw0.C101478s;

/* renamed from: com.tencent.mm.plugin.sight.base.AudioSoftEncoder */
public class AudioSoftEncoder {
    static {
        C101478s.vx0();
    }

    public static native void nDestroy(int i);

    public static native void nEndWriteAudioSample(int i);

    public static native int nGetBufferSize(int i);

    public static native int nGetErrCode(int i);

    public static native byte[] nGetOutputBuffer(int i, long[] jArr);

    public static native int nInit(long j, int i, int i2, int i3);

    public static native int nWriteAudioSample(int i, ByteBuffer byteBuffer, int i2, long j);
}
