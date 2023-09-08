package com.tencent.liteav.videoproducer.preprocessor;

import com.tencent.liteav.videobase.base.GLConstants;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.ad */
final /* synthetic */ class C17538ad implements Runnable {

    /* renamed from: a */
    private final VideoPreprocessor f47647a;

    /* renamed from: b */
    private final GLConstants.GLScaleType f47648b;

    /* renamed from: c */
    private final boolean f47649c;

    private C17538ad(VideoPreprocessor videoPreprocessor, GLConstants.GLScaleType gLScaleType, boolean z) {
        this.f47647a = videoPreprocessor;
        this.f47648b = gLScaleType;
        this.f47649c = z;
    }

    /* renamed from: a */
    public static Runnable m17724a(VideoPreprocessor videoPreprocessor, GLConstants.GLScaleType gLScaleType, boolean z) {
        return new C17538ad(videoPreprocessor, gLScaleType, z);
    }

    public final void run() {
        VideoPreprocessor.lambda$setGreenScreenParam$6(this.f47647a, this.f47648b, this.f47649c);
    }
}
