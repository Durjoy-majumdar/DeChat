package com.tencent.liteav.videoproducer.encoder;

import com.tencent.liteav.videobase.videobase.C17263h;

/* renamed from: com.tencent.liteav.videoproducer.encoder.t */
final /* synthetic */ class C17525t implements Runnable {

    /* renamed from: a */
    private final C17520o f47578a;

    /* renamed from: b */
    private final C17263h.C17268a f47579b;

    private C17525t(C17520o oVar, C17263h.C17268a aVar) {
        this.f47578a = oVar;
        this.f47579b = aVar;
    }

    /* renamed from: a */
    public static Runnable m17699a(C17520o oVar, C17263h.C17268a aVar) {
        return new C17525t(oVar, aVar);
    }

    public final void run() {
        C17520o.m17687a(this.f47578a, this.f47579b);
    }
}
