package com.tencent.liteav.videoproducer.preprocessor;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.b */
final /* synthetic */ class C17542b implements Runnable {

    /* renamed from: a */
    private final BeautyProcessor f47654a;

    /* renamed from: b */
    private final float f47655b;

    private C17542b(BeautyProcessor beautyProcessor, float f) {
        this.f47654a = beautyProcessor;
        this.f47655b = f;
    }

    /* renamed from: a */
    public static Runnable m17728a(BeautyProcessor beautyProcessor, float f) {
        return new C17542b(beautyProcessor, f);
    }

    public final void run() {
        BeautyProcessor.lambda$setBeautyLevel$1(this.f47654a, this.f47655b);
    }
}
