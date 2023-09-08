package com.tencent.liteav.videoproducer.encoder;

/* renamed from: com.tencent.liteav.videoproducer.encoder.ap */
final /* synthetic */ class C17484ap implements Runnable {

    /* renamed from: a */
    private final C17474ah f47463a;

    /* renamed from: b */
    private final VideoEncodeParams f47464b;

    private C17484ap(C17474ah ahVar, VideoEncodeParams videoEncodeParams) {
        this.f47463a = ahVar;
        this.f47464b = videoEncodeParams;
    }

    /* renamed from: a */
    public static Runnable m17626a(C17474ah ahVar, VideoEncodeParams videoEncodeParams) {
        return new C17484ap(ahVar, videoEncodeParams);
    }

    public final void run() {
        C17474ah.m17574a(this.f47463a, this.f47464b);
    }
}
