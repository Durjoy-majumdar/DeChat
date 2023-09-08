package com.tencent.liteav.videoproducer.preprocessor;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.ac */
final /* synthetic */ class C17537ac implements Runnable {

    /* renamed from: a */
    private final VideoPreprocessor f47644a;

    /* renamed from: b */
    private final String f47645b;

    /* renamed from: c */
    private final boolean f47646c;

    private C17537ac(VideoPreprocessor videoPreprocessor, String str, boolean z) {
        this.f47644a = videoPreprocessor;
        this.f47645b = str;
        this.f47646c = z;
    }

    /* renamed from: a */
    public static Runnable m17723a(VideoPreprocessor videoPreprocessor, String str, boolean z) {
        return new C17537ac(videoPreprocessor, str, z);
    }

    public final void run() {
        VideoPreprocessor.lambda$setGreenScreenFile$5(this.f47644a, this.f47645b, this.f47646c);
    }
}
