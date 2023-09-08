package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videobase.videobase.DisplayTarget;

/* renamed from: com.tencent.liteav.videoproducer.producer.h */
final /* synthetic */ class C17610h implements Runnable {

    /* renamed from: a */
    private final C17604f f47935a;

    /* renamed from: b */
    private final DisplayTarget f47936b;

    private C17610h(C17604f fVar, DisplayTarget displayTarget) {
        this.f47935a = fVar;
        this.f47936b = displayTarget;
    }

    /* renamed from: a */
    public static Runnable m17897a(C17604f fVar, DisplayTarget displayTarget) {
        return new C17610h(fVar, displayTarget);
    }

    public final void run() {
        C17604f.m17846a(this.f47935a, this.f47936b);
    }
}
