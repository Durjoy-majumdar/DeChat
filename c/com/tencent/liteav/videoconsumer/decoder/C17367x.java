package com.tencent.liteav.videoconsumer.decoder;

import android.graphics.SurfaceTexture;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.x */
final /* synthetic */ class C17367x implements Runnable {

    /* renamed from: a */
    private final C17359q f47088a;

    /* renamed from: b */
    private final SurfaceTexture f47089b;

    private C17367x(C17359q qVar, SurfaceTexture surfaceTexture) {
        this.f47088a = qVar;
        this.f47089b = surfaceTexture;
    }

    /* renamed from: a */
    public static Runnable m17333a(C17359q qVar, SurfaceTexture surfaceTexture) {
        return new C17367x(qVar, surfaceTexture);
    }

    public final void run() {
        C17359q.m17317a(this.f47088a, this.f47089b);
    }
}
