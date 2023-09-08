package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videobase.utils.Rotation;

/* renamed from: com.tencent.liteav.videoproducer.producer.ap */
final /* synthetic */ class C17588ap implements Runnable {

    /* renamed from: a */
    private final C17604f f47835a;

    /* renamed from: b */
    private final Rotation f47836b;

    /* renamed from: c */
    private final int f47837c;

    private C17588ap(C17604f fVar, Rotation rotation, int i) {
        this.f47835a = fVar;
        this.f47836b = rotation;
        this.f47837c = i;
    }

    /* renamed from: a */
    public static Runnable m17786a(C17604f fVar, Rotation rotation, int i) {
        return new C17588ap(fVar, rotation, i);
    }

    public final void run() {
        C17604f.m17845a(this.f47835a, this.f47836b, this.f47837c);
    }
}
