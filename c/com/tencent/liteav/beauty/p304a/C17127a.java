package com.tencent.liteav.beauty.p304a;

import android.graphics.SurfaceTexture;

/* renamed from: com.tencent.liteav.beauty.a.a */
public final class C17127a implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a */
    public Thread f46184a;

    /* renamed from: b */
    public volatile boolean f46185b;

    /* renamed from: c */
    public C17128a f46186c;

    /* renamed from: d */
    private volatile boolean f46187d;

    /* renamed from: com.tencent.liteav.beauty.a.a$a */
    public interface C17128a {
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f46187d = true;
    }
}
