package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videoproducer.encoder.VideoEncodeParams;
import com.tencent.liteav.videoproducer.producer.VideoProducerDef;

/* renamed from: com.tencent.liteav.videoproducer.producer.s */
final /* synthetic */ class C17621s implements Runnable {

    /* renamed from: a */
    private final C17604f f47960a;

    /* renamed from: b */
    private final VideoProducerDef.StreamType f47961b;

    /* renamed from: c */
    private final GLConstants.Orientation f47962c;

    /* renamed from: d */
    private final VideoEncodeParams f47963d;

    private C17621s(C17604f fVar, VideoProducerDef.StreamType streamType, GLConstants.Orientation orientation, VideoEncodeParams videoEncodeParams) {
        this.f47960a = fVar;
        this.f47961b = streamType;
        this.f47962c = orientation;
        this.f47963d = videoEncodeParams;
    }

    /* renamed from: a */
    public static Runnable m17908a(C17604f fVar, VideoProducerDef.StreamType streamType, GLConstants.Orientation orientation, VideoEncodeParams videoEncodeParams) {
        return new C17621s(fVar, streamType, orientation, videoEncodeParams);
    }

    public final void run() {
        C17604f.m17853a(this.f47960a, this.f47961b, this.f47962c, this.f47963d);
    }
}
