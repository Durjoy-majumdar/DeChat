package com.tencent.liteav.videobase.p309a;

import android.opengl.GLES20;

/* renamed from: com.tencent.liteav.videobase.a.c */
final /* synthetic */ class C17190c implements Runnable {

    /* renamed from: a */
    private final int f46451a;

    /* renamed from: b */
    private final float f46452b;

    private C17190c(int i, float f) {
        this.f46451a = i;
        this.f46452b = f;
    }

    /* renamed from: a */
    public static Runnable m17030a(int i, float f) {
        return new C17190c(i, f);
    }

    public final void run() {
        GLES20.glUniform1f(this.f46451a, this.f46452b);
    }
}
