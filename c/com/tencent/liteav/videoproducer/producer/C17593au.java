package com.tencent.liteav.videoproducer.producer;

import android.graphics.Bitmap;

/* renamed from: com.tencent.liteav.videoproducer.producer.au */
final /* synthetic */ class C17593au implements Runnable {

    /* renamed from: a */
    private final C17604f f47851a;

    /* renamed from: b */
    private final Bitmap f47852b;

    /* renamed from: c */
    private final int f47853c;

    private C17593au(C17604f fVar, Bitmap bitmap, int i) {
        this.f47851a = fVar;
        this.f47852b = bitmap;
        this.f47853c = i;
    }

    /* renamed from: a */
    public static Runnable m17791a(C17604f fVar, Bitmap bitmap, int i) {
        return new C17593au(fVar, bitmap, i);
    }

    public final void run() {
        C17604f.m17834a(this.f47851a, this.f47852b, this.f47853c);
    }
}
