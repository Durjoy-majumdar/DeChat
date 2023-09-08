package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.videobase.videobase.C17263h;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoproducer.capture.C17455s;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;

/* renamed from: com.tencent.liteav.videoproducer.capture.ac */
final /* synthetic */ class C17403ac implements Runnable {

    /* renamed from: a */
    private final C17455s.C174561 f47228a;

    private C17403ac(C17455s.C174561 r1) {
        this.f47228a = r1;
    }

    /* renamed from: a */
    public static Runnable m17432a(C17455s.C174561 r1) {
        return new C17403ac(r1);
    }

    public final void run() {
        C17455s.C174561 r0 = this.f47228a;
        IVideoReporter iVideoReporter = C17455s.this.f47351a;
        if (iVideoReporter != null) {
            iVideoReporter.notifyError(C17263h.C17268a.ERR_VIDEO_CAPTURE_CAMERA_INVALID_DEVICE, "create EGLCore failed", new Object[0]);
        }
        CaptureSourceInterface.C17399a aVar = C17455s.this.f47353c;
        if (aVar != null) {
            aVar.mo20531a();
        }
    }
}
