package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.videobase.utils.C17246e;
import com.tencent.liteav.videobase.videobase.C17271i;

/* renamed from: com.tencent.liteav.videoproducer.capture.ai */
final /* synthetic */ class C17408ai implements C17246e.C17247a {

    /* renamed from: a */
    private final C17405ah f47249a;

    public C17408ai(C17405ah ahVar) {
        this.f47249a = ahVar;
    }

    /* renamed from: a */
    public final void mo20224a(double d) {
        this.f47249a.f47236h.updateStatus(C17271i.STATUS_VIDEO_CAPTURE_REAL_FRAME_RATE, Double.valueOf(d));
    }
}
