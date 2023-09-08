package com.tencent.p014mm.appbrand.commonjni.buffer;

import java.nio.ByteBuffer;
import p762yg.C91451f;

/* renamed from: com.tencent.mm.appbrand.commonjni.buffer.BufferURLManager */
public class BufferURLManager {

    /* renamed from: a */
    public volatile long f235972a;

    public BufferURLManager() {
        this.f235972a = 0;
        this.f235972a = nativeCreate();
        C91451f.m114754a("BufferURLManager", "BufferURLManager created %d", Long.valueOf(this.f235972a));
    }

    private static native void nativeBindTo(long j, long j2, long j3);

    private static native long nativeCreate();

    private static native String nativeCreateBufferURLWithDirectBuffer(long j, ByteBuffer byteBuffer);

    private static native String nativeCreateBufferURLWithLegacyArrayBuffer(long j, byte[] bArr, int i);

    private static native void nativeDestroy(long j);

    private static native ByteBuffer nativeGetBuffer(long j, String str);

    private static native void nativeRevokeBufferURL(long j, String str);

    /* renamed from: a */
    public void mo112427a(long j, long j2) {
        C91451f.m114754a("BufferURLManager", "BufferURLManager %d %d %d", Long.valueOf(this.f235972a), Long.valueOf(j), Long.valueOf(j2));
        nativeBindTo(this.f235972a, j, j2);
    }

    /* renamed from: b */
    public void mo112428b() {
        C91451f.m114754a("BufferURLManager", "BufferURLManager destroying %d", Long.valueOf(this.f235972a));
        nativeDestroy(this.f235972a);
        this.f235972a = 0;
        C91451f.m114754a("BufferURLManager", "BufferURLManager destroyed %d", Long.valueOf(this.f235972a));
    }

    /* renamed from: c */
    public ByteBuffer mo112429c(String str) {
        if (str != null) {
            return nativeGetBuffer(this.f235972a, str);
        }
        C91451f.f262178a.mo125381e("BufferURLManager", "BufferURLManager getBuffer but url is null", new Object[0]);
        return null;
    }
}
