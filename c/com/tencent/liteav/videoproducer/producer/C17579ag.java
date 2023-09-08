package com.tencent.liteav.videoproducer.producer;

import android.graphics.Bitmap;

/* renamed from: com.tencent.liteav.videoproducer.producer.ag */
final /* synthetic */ class C17579ag implements Runnable {

    /* renamed from: a */
    private final C17604f f47809a;

    /* renamed from: b */
    private final Bitmap f47810b;

    /* renamed from: c */
    private final float f47811c;

    /* renamed from: d */
    private final float f47812d;

    /* renamed from: e */
    private final float f47813e;

    private C17579ag(C17604f fVar, Bitmap bitmap, float f, float f2, float f3) {
        this.f47809a = fVar;
        this.f47810b = bitmap;
        this.f47811c = f;
        this.f47812d = f2;
        this.f47813e = f3;
    }

    /* renamed from: a */
    public static Runnable m17777a(C17604f fVar, Bitmap bitmap, float f, float f2, float f3) {
        return new C17579ag(fVar, bitmap, f, f2, f3);
    }

    public final void run() {
        this.f47809a.f47907c.setWatermark(this.f47810b, this.f47811c, this.f47812d, this.f47813e);
    }
}
