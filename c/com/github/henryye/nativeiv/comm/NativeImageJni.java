package com.github.henryye.nativeiv.comm;

import java.nio.ByteBuffer;
import p673r6.C36249a;
import p673r6.C89876b;

public class NativeImageJni {

    /* renamed from: a */
    public long f234738a = 0;

    static {
        C89876b.f258326a.mo123902d("NativeImageJni", "load library", new Object[0]);
        C36249a.f96532a.loadLibrary("native-iv");
    }

    private native CommNativeBitmapStruct nativeDecodeNative(long j, ByteBuffer byteBuffer, int i, boolean z);

    private native void nativeDestroy(long j);

    private native long nativeInit();

    private native void nativeRecycleNative(long j, long j2);

    /* renamed from: a */
    public CommNativeBitmapStruct mo111038a(ByteBuffer byteBuffer, int i, boolean z) {
        long j = this.f234738a;
        if (j != 0) {
            return nativeDecodeNative(j, byteBuffer, i, z);
        }
        return null;
    }

    /* renamed from: b */
    public void mo111039b() {
        long j = this.f234738a;
        if (j != 0) {
            nativeDestroy(j);
        }
    }

    /* renamed from: c */
    public void mo111040c() {
        if (this.f234738a == 0) {
            this.f234738a = nativeInit();
            return;
        }
        throw new IllegalStateException("NativeImageJni not released last time");
    }

    /* renamed from: d */
    public void mo111041d(long j) {
        long j2 = this.f234738a;
        if (j2 != 0) {
            nativeRecycleNative(j2, j);
        }
    }
}
