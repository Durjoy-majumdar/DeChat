package com.tencent.liteav.videoproducer.encoder;

import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;

/* renamed from: com.tencent.liteav.videoproducer.encoder.ay */
public final /* synthetic */ class C17493ay implements Runnable {

    /* renamed from: a */
    private final C17474ah f47481a;

    /* renamed from: b */
    private final VideoEncodeParams f47482b;

    /* renamed from: c */
    private final VideoEncoderDef.VideoEncoderDataListener f47483c;

    private C17493ay(C17474ah ahVar, VideoEncodeParams videoEncodeParams, VideoEncoderDef.VideoEncoderDataListener videoEncoderDataListener) {
        this.f47481a = ahVar;
        this.f47482b = videoEncodeParams;
        this.f47483c = videoEncoderDataListener;
    }

    /* renamed from: a */
    public static Runnable m17635a(C17474ah ahVar, VideoEncodeParams videoEncodeParams, VideoEncoderDef.VideoEncoderDataListener videoEncoderDataListener) {
        return new C17493ay(ahVar, videoEncodeParams, videoEncoderDataListener);
    }

    public final void run() {
        C17474ah.m17575a(this.f47481a, this.f47482b, this.f47483c);
    }
}
