package com.tencent.liteav.videoproducer.preprocessor;

import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.y */
final /* synthetic */ class C17570y implements Runnable {

    /* renamed from: a */
    private final VideoPreprocessor f47750a;

    /* renamed from: b */
    private final CaptureSourceInterface.SourceType f47751b;

    private C17570y(VideoPreprocessor videoPreprocessor, CaptureSourceInterface.SourceType sourceType) {
        this.f47750a = videoPreprocessor;
        this.f47751b = sourceType;
    }

    /* renamed from: a */
    public static Runnable m17760a(VideoPreprocessor videoPreprocessor, CaptureSourceInterface.SourceType sourceType) {
        return new C17570y(videoPreprocessor, sourceType);
    }

    public final void run() {
        this.f47750a.mPreprocessor.f47673g = this.f47751b;
    }
}
