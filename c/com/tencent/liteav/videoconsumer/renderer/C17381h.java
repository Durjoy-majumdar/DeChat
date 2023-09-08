package com.tencent.liteav.videoconsumer.renderer;

import com.tencent.liteav.videobase.utils.C17246e;
import com.tencent.liteav.videobase.videobase.C17271i;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoconsumer.renderer.C17378f;

/* renamed from: com.tencent.liteav.videoconsumer.renderer.h */
public final class C17381h implements C17246e.C17247a {

    /* renamed from: a */
    public final IVideoReporter f47120a;

    /* renamed from: b */
    public final C17246e f47121b = new C17246e("VideoRenderer", 1000, this);

    /* renamed from: c */
    public int f47122c = 0;

    /* renamed from: d */
    public int f47123d = 0;

    /* renamed from: e */
    public C17378f f47124e = new C17378f(new C17378f.C17379a() {
        /* renamed from: a */
        public final void mo20473a(long j) {
            C17381h.this.f47120a.updateStatus(C17271i.STATUS_VIDEO_RENDER_REEZE, Long.valueOf(j));
        }
    });

    /* renamed from: f */
    public boolean f47125f = false;

    public C17381h(IVideoReporter iVideoReporter) {
        this.f47120a = iVideoReporter;
    }

    /* renamed from: a */
    public final void mo20474a() {
        this.f47120a.updateStatus(C17271i.STATUS_VIDEO_RENDER_FRAME, 0);
        this.f47120a.updateStatus(C17271i.STATUS_VIDEO_RENDER_RESET_FREEZE_TIME, 0);
    }

    /* renamed from: a */
    public final void mo20224a(double d) {
        this.f47120a.updateStatus(C17271i.STATUS_VIDEO_RENDER_AVARAGE_FPS, Double.valueOf(d));
    }
}
