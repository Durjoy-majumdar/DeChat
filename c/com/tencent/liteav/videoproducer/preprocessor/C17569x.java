package com.tencent.liteav.videoproducer.preprocessor;

import com.tencent.liteav.videobase.p309a.C17188a;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.x */
final /* synthetic */ class C17569x implements Runnable {

    /* renamed from: a */
    private final VideoPreprocessor f47748a;

    /* renamed from: b */
    private final C17188a f47749b;

    private C17569x(VideoPreprocessor videoPreprocessor, C17188a aVar) {
        this.f47748a = videoPreprocessor;
        this.f47749b = aVar;
    }

    /* renamed from: a */
    public static Runnable m17759a(VideoPreprocessor videoPreprocessor, C17188a aVar) {
        return new C17569x(videoPreprocessor, aVar);
    }

    public final void run() {
        VideoPreprocessor.lambda$setInterceptorBeforeWatermark$14(this.f47748a, this.f47749b);
    }
}
