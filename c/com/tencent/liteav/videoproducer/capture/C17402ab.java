package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videoproducer.capture.C17455s;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;

/* renamed from: com.tencent.liteav.videoproducer.capture.ab */
final /* synthetic */ class C17402ab implements Runnable {

    /* renamed from: a */
    private final C17455s.C174561 f47226a;

    /* renamed from: b */
    private final PixelFrame f47227b;

    private C17402ab(C17455s.C174561 r1, PixelFrame pixelFrame) {
        this.f47226a = r1;
        this.f47227b = pixelFrame;
    }

    /* renamed from: a */
    public static Runnable m17431a(C17455s.C174561 r1, PixelFrame pixelFrame) {
        return new C17402ab(r1, pixelFrame);
    }

    public final void run() {
        C17455s.C174561 r0 = this.f47226a;
        PixelFrame pixelFrame = this.f47227b;
        C17455s sVar = C17455s.this;
        if (sVar.f47354d) {
            pixelFrame.release();
            return;
        }
        CaptureSourceInterface.C17399a aVar = sVar.f47353c;
        if (aVar == null) {
            pixelFrame.release();
            return;
        }
        aVar.mo20532a(sVar, pixelFrame);
        pixelFrame.release();
    }
}
