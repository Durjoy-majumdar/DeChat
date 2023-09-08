package com.tencent.liteav.videoproducer.encoder;

import com.tencent.liteav.base.util.C113473t;
import com.tencent.liteav.videobase.videobase.C17271i;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoproducer.producer.VideoProducerDef;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.liteav.videoproducer.encoder.be */
public final class C17500be implements C113473t.C113474a {

    /* renamed from: a */
    public final String f47492a;

    /* renamed from: b */
    public IVideoReporter f47493b;

    /* renamed from: c */
    public Map<Long, Long> f47494c = new HashMap();

    /* renamed from: d */
    public long f47495d = 0;

    /* renamed from: e */
    public long f47496e = 0;

    /* renamed from: f */
    public C113473t f47497f;

    public C17500be(IVideoReporter iVideoReporter, VideoProducerDef.StreamType streamType) {
        this.f47493b = iVideoReporter;
        this.f47492a = "VECStatistics_" + streamType + "_" + hashCode();
    }

    /* renamed from: a_ */
    public final void mo20405a_() {
        long j = this.f47496e;
        if (j > 0) {
            this.f47493b.updateStatus(C17271i.STATUS_VIDEO_ENCODE_AVERAGE_ENCODE_COST, Long.valueOf(this.f47495d / j));
        }
    }
}
