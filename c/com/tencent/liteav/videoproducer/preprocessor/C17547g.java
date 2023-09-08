package com.tencent.liteav.videoproducer.preprocessor;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.g */
final /* synthetic */ class C17547g implements Runnable {

    /* renamed from: a */
    private final BeautyProcessor f47665a;

    /* renamed from: b */
    private final boolean f47666b;

    private C17547g(BeautyProcessor beautyProcessor, boolean z) {
        this.f47665a = beautyProcessor;
        this.f47666b = z;
    }

    /* renamed from: a */
    public static Runnable m17733a(BeautyProcessor beautyProcessor, boolean z) {
        return new C17547g(beautyProcessor, z);
    }

    public final void run() {
        BeautyProcessor.lambda$setPerformanceMode$6(this.f47665a, this.f47666b);
    }
}
