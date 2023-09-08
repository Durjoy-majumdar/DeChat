package com.tencent.liteav.videoproducer.preprocessor;

import com.tencent.liteav.videobase.frame.PixelFrame;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.z */
final /* synthetic */ class C17571z implements Runnable {

    /* renamed from: a */
    private final VideoPreprocessor f47752a;

    /* renamed from: b */
    private final PixelFrame f47753b;

    /* renamed from: c */
    private final long f47754c;

    private C17571z(VideoPreprocessor videoPreprocessor, PixelFrame pixelFrame, long j) {
        this.f47752a = videoPreprocessor;
        this.f47753b = pixelFrame;
        this.f47754c = j;
    }

    /* renamed from: a */
    public static Runnable m17761a(VideoPreprocessor videoPreprocessor, PixelFrame pixelFrame, long j) {
        return new C17571z(videoPreprocessor, pixelFrame, j);
    }

    public final void run() {
        VideoPreprocessor.lambda$processFrame$2(this.f47752a, this.f47753b, this.f47754c);
    }
}
