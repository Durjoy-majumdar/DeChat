package com.tencent.liteav.videoproducer.encoder;

import com.tencent.liteav.videoproducer.producer.VideoProducerDef;

/* renamed from: com.tencent.liteav.videoproducer.encoder.v */
public final class C17527v {

    /* renamed from: a */
    public final String f47582a;

    /* renamed from: b */
    public double f47583b = 0.0d;

    /* renamed from: c */
    public long f47584c = 0;

    /* renamed from: d */
    public long f47585d = 0;

    /* renamed from: e */
    public long f47586e = 0;

    /* renamed from: f */
    public long f47587f = 0;

    /* renamed from: g */
    public long f47588g = 0;

    /* renamed from: h */
    public C17528a f47589h;

    /* renamed from: i */
    public int f47590i;

    /* renamed from: j */
    public int f47591j;

    /* renamed from: com.tencent.liteav.videoproducer.encoder.v$a */
    public interface C17528a {
        /* renamed from: a */
        void mo20730a(double d);

        /* renamed from: a */
        void mo20731a(long j);
    }

    public C17527v(C17528a aVar, VideoProducerDef.StreamType streamType) {
        this.f47589h = aVar;
        this.f47590i = Math.max(1000, 1000);
        this.f47591j = Math.max(1000, 1000);
        this.f47582a = "RealFpsAndBitrateCaculate_" + streamType + "_" + hashCode();
    }
}
