package com.tencent.p014mm.plugin.appbrand.media.encode;

import com.tencent.p014mm.plugin.appbrand.media.record.C29597r;

/* renamed from: com.tencent.mm.plugin.appbrand.media.encode.Mp3EncodeJni */
public class Mp3EncodeJni {
    static {
        C29597r.C29599b bVar;
        ClassLoader classLoader = Mp3EncodeJni.class.getClassLoader();
        synchronized (C29597r.class) {
            bVar = C29597r.f80527a;
        }
        bVar.loadLibrary("mp3lame", classLoader);
    }

    public static native void close();

    public static native int encode(short[] sArr, short[] sArr2, int i, byte[] bArr);

    public static native int encodeBufferInterleaved(short[] sArr, int i, byte[] bArr);

    public static native int flush(byte[] bArr);

    public static native int getVersion();

    public static native int init(int i, int i2, int i3, int i4, int i5);

    public static native void setMode(int i);
}
