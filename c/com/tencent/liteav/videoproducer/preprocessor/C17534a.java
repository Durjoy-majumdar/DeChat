package com.tencent.liteav.videoproducer.preprocessor;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.a */
final /* synthetic */ class C17534a implements Runnable {

    /* renamed from: a */
    private final BeautyProcessor f47632a;

    /* renamed from: b */
    private final int f47633b;

    private C17534a(BeautyProcessor beautyProcessor, int i) {
        this.f47632a = beautyProcessor;
        this.f47633b = i;
    }

    /* renamed from: a */
    public static Runnable m17720a(BeautyProcessor beautyProcessor, int i) {
        return new C17534a(beautyProcessor, i);
    }

    public final void run() {
        this.f47632a.updateBeautyInternal(this.f47633b, this.f47632a.mBeautyLevel, this.f47632a.mWhitenessLevel, this.f47632a.mRuddyLevel, this.f47632a.mSharpnessLevel);
    }
}
