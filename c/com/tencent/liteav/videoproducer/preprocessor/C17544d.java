package com.tencent.liteav.videoproducer.preprocessor;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.d */
final /* synthetic */ class C17544d implements Runnable {

    /* renamed from: a */
    private final BeautyProcessor f47658a;

    /* renamed from: b */
    private final float f47659b;

    private C17544d(BeautyProcessor beautyProcessor, float f) {
        this.f47658a = beautyProcessor;
        this.f47659b = f;
    }

    /* renamed from: a */
    public static Runnable m17730a(BeautyProcessor beautyProcessor, float f) {
        return new C17544d(beautyProcessor, f);
    }

    public final void run() {
        BeautyProcessor.lambda$setSharpenLevel$3(this.f47658a, this.f47659b);
    }
}
