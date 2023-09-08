package com.tencent.liteav.videoproducer.capture;

import android.media.projection.MediaProjection;

/* renamed from: com.tencent.liteav.videoproducer.capture.bg */
final /* synthetic */ class C17436bg implements Runnable {

    /* renamed from: a */
    private final C17428bc f47317a;

    /* renamed from: b */
    private final MediaProjection f47318b;

    private C17436bg(C17428bc bcVar, MediaProjection mediaProjection) {
        this.f47317a = bcVar;
        this.f47318b = mediaProjection;
    }

    /* renamed from: a */
    public static Runnable m17515a(C17428bc bcVar, MediaProjection mediaProjection) {
        return new C17436bg(bcVar, mediaProjection);
    }

    public final void run() {
        C17428bc.m17495a(this.f47317a, this.f47318b);
    }
}
