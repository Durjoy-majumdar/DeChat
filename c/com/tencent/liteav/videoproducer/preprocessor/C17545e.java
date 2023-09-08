package com.tencent.liteav.videoproducer.preprocessor;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.e */
final /* synthetic */ class C17545e implements Runnable {

    /* renamed from: a */
    private final BeautyProcessor f47660a;

    /* renamed from: b */
    private final float f47661b;

    private C17545e(BeautyProcessor beautyProcessor, float f) {
        this.f47660a = beautyProcessor;
        this.f47661b = f;
    }

    /* renamed from: a */
    public static Runnable m17731a(BeautyProcessor beautyProcessor, float f) {
        return new C17545e(beautyProcessor, f);
    }

    public final void run() {
        BeautyProcessor.lambda$setRuddyLevel$4(this.f47660a, this.f47661b);
    }
}
