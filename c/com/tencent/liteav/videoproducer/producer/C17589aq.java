package com.tencent.liteav.videoproducer.producer;

import android.graphics.Point;

/* renamed from: com.tencent.liteav.videoproducer.producer.aq */
final /* synthetic */ class C17589aq implements Runnable {

    /* renamed from: a */
    private final C17604f f47838a;

    /* renamed from: b */
    private final Point f47839b;

    /* renamed from: c */
    private final int f47840c;

    /* renamed from: d */
    private final int f47841d;

    /* renamed from: e */
    private final int f47842e;

    /* renamed from: f */
    private final int f47843f;

    private C17589aq(C17604f fVar, Point point, int i, int i2, int i3, int i4) {
        this.f47838a = fVar;
        this.f47839b = point;
        this.f47840c = i;
        this.f47841d = i2;
        this.f47842e = i3;
        this.f47843f = i4;
    }

    /* renamed from: a */
    public static Runnable m17787a(C17604f fVar, Point point, int i, int i2, int i3, int i4) {
        return new C17589aq(fVar, point, i, i2, i3, i4);
    }

    public final void run() {
        C17604f.m17835a(this.f47838a, this.f47839b, this.f47840c, this.f47841d, this.f47842e, this.f47843f);
    }
}
