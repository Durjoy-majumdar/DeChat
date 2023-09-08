package com.tencent.liteav.videoproducer.preprocessor;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.ae */
final /* synthetic */ class C17539ae implements Runnable {

    /* renamed from: a */
    private final VideoPreprocessor f47650a;

    /* renamed from: b */
    private final float f47651b;

    private C17539ae(VideoPreprocessor videoPreprocessor, float f) {
        this.f47650a = videoPreprocessor;
        this.f47651b = f;
    }

    /* renamed from: a */
    public static Runnable m17725a(VideoPreprocessor videoPreprocessor, float f) {
        return new C17539ae(videoPreprocessor, f);
    }

    public final void run() {
        VideoPreprocessor.lambda$setFilterMixLevel$7(this.f47650a, this.f47651b);
    }
}
