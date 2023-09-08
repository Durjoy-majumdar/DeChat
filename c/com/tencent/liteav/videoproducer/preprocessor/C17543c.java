package com.tencent.liteav.videoproducer.preprocessor;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.c */
final /* synthetic */ class C17543c implements Runnable {

    /* renamed from: a */
    private final BeautyProcessor f47656a;

    /* renamed from: b */
    private final float f47657b;

    private C17543c(BeautyProcessor beautyProcessor, float f) {
        this.f47656a = beautyProcessor;
        this.f47657b = f;
    }

    /* renamed from: a */
    public static Runnable m17729a(BeautyProcessor beautyProcessor, float f) {
        return new C17543c(beautyProcessor, f);
    }

    public final void run() {
        BeautyProcessor.lambda$setWhitenessLevel$2(this.f47656a, this.f47657b);
    }
}
