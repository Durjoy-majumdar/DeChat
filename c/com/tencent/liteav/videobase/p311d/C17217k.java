package com.tencent.liteav.videobase.p311d;

import android.opengl.GLES20;

/* renamed from: com.tencent.liteav.videobase.d.k */
final /* synthetic */ class C17217k implements Runnable {

    /* renamed from: a */
    private final C17216j f46559a;

    private C17217k(C17216j jVar) {
        this.f46559a = jVar;
    }

    /* renamed from: a */
    public static Runnable m17058a(C17216j jVar) {
        return new C17217k(jVar);
    }

    public final void run() {
        C17216j jVar = this.f46559a;
        GLES20.glUniform1f(jVar.f46557a, (float) jVar.mOutputSize.f309736a);
        GLES20.glUniform1f(jVar.f46558b, (float) jVar.mOutputSize.f309737b);
    }
}
