package com.tencent.liteav.videoproducer.preprocessor;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.u */
final /* synthetic */ class C17566u implements Runnable {

    /* renamed from: a */
    private final VideoPreprocessor f47743a;

    /* renamed from: b */
    private final float f47744b;

    private C17566u(VideoPreprocessor videoPreprocessor, float f) {
        this.f47743a = videoPreprocessor;
        this.f47744b = f;
    }

    /* renamed from: a */
    public static Runnable m17756a(VideoPreprocessor videoPreprocessor, float f) {
        return new C17566u(videoPreprocessor, f);
    }

    public final void run() {
        VideoPreprocessor.lambda$setGaussianBlurLevel$12(this.f47743a, this.f47744b);
    }
}
