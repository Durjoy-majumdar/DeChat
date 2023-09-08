package com.tencent.liteav.videoproducer.capture;

import android.media.projection.MediaProjection;
import android.view.Surface;
import com.tencent.liteav.videoproducer.capture.C17428bc;

/* renamed from: com.tencent.liteav.videoproducer.capture.be */
final /* synthetic */ class C17434be implements Runnable {

    /* renamed from: a */
    private final C17428bc f47309a;

    /* renamed from: b */
    private final Surface f47310b;

    /* renamed from: c */
    private final int f47311c;

    /* renamed from: d */
    private final int f47312d;

    /* renamed from: e */
    private final MediaProjection f47313e;

    /* renamed from: f */
    private final C17428bc.C17432b f47314f;

    private C17434be(C17428bc bcVar, Surface surface, int i, int i2, MediaProjection mediaProjection, C17428bc.C17432b bVar) {
        this.f47309a = bcVar;
        this.f47310b = surface;
        this.f47311c = i;
        this.f47312d = i2;
        this.f47313e = mediaProjection;
        this.f47314f = bVar;
    }

    /* renamed from: a */
    public static Runnable m17513a(C17428bc bcVar, Surface surface, int i, int i2, MediaProjection mediaProjection, C17428bc.C17432b bVar) {
        return new C17434be(bcVar, surface, i, i2, mediaProjection, bVar);
    }

    public final void run() {
        C17428bc.m17497a(this.f47309a, this.f47310b, this.f47311c, this.f47312d, this.f47313e, this.f47314f);
    }
}
