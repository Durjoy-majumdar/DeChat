package com.tencent.liteav.videobase.utils;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.frame.PixelFrame;
import java.util.ArrayList;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.tencent.liteav.videobase.utils.b */
public final class C17243b implements C17249g {

    /* renamed from: a */
    private final BlockingDeque<PixelFrame> f46614a = new LinkedBlockingDeque(2);

    /* renamed from: a */
    public final PixelFrame mo20217a() {
        return this.f46614a.poll();
    }

    /* renamed from: b */
    public final void mo20219b() {
        ArrayList arrayList = new ArrayList();
        this.f46614a.drainTo(arrayList);
        PixelFrame.releasePixelFrames(arrayList);
    }

    /* renamed from: a */
    public final void mo20218a(PixelFrame pixelFrame) {
        pixelFrame.retain();
        try {
            this.f46614a.put(pixelFrame);
        } catch (InterruptedException e) {
            LiteavLog.m16899e("BlockingFrameQueue", "push frame failed with exception", (Throwable) e);
        }
    }
}
