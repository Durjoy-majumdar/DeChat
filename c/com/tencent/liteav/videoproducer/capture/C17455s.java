package com.tencent.liteav.videoproducer.capture;

import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.base.util.C17111b;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;

/* renamed from: com.tencent.liteav.videoproducer.capture.s */
public final class C17455s implements CaptureSourceInterface {

    /* renamed from: a */
    public final IVideoReporter f47351a;

    /* renamed from: b */
    public final Handler f47352b;

    /* renamed from: c */
    public CaptureSourceInterface.C17399a f47353c;

    /* renamed from: d */
    public boolean f47354d = true;

    /* renamed from: e */
    public boolean f47355e = false;

    /* renamed from: f */
    public CameraCaptureParams f47356f;

    /* renamed from: g */
    public boolean f47357g = false;

    /* renamed from: h */
    public final CaptureSourceInterface.C17399a f47358h = new CaptureSourceInterface.C17399a() {
        /* renamed from: a */
        public final void mo20533a(boolean z) {
            C17455s.this.mo20615a(C17401aa.m17430a(this, z));
        }

        /* renamed from: b */
        public final void mo20534b(boolean z) {
        }

        /* renamed from: c */
        public final void mo20535c(boolean z) {
            CaptureSourceInterface.C17399a aVar = C17455s.this.f47353c;
            if (aVar != null) {
                aVar.mo20535c(z);
            }
        }

        /* renamed from: d */
        public final void mo20536d(boolean z) {
            CaptureSourceInterface.C17399a aVar = C17455s.this.f47353c;
            if (aVar != null) {
                aVar.mo20536d(z);
            }
        }

        /* renamed from: a */
        public final void mo20532a(CaptureSourceInterface captureSourceInterface, PixelFrame pixelFrame) {
            if (pixelFrame != null) {
                pixelFrame.retain();
            }
            C17455s.this.mo20615a(C17402ab.m17431a(this, pixelFrame));
        }

        /* renamed from: a */
        public final void mo20531a() {
            C17455s.this.mo20615a(C17403ac.m17432a(this));
        }
    };

    public C17455s(IVideoReporter iVideoReporter, Looper looper) {
        this.f47351a = iVideoReporter;
        this.f47352b = new C17111b(looper);
    }

    /* renamed from: a */
    public final void mo20615a(Runnable runnable) {
        if (this.f47352b == null) {
            return;
        }
        if (Looper.myLooper() == this.f47352b.getLooper()) {
            runnable.run();
        } else {
            this.f47352b.post(runnable);
        }
    }

    public final void pause() {
        LiteavLog.m16901i("CameraCapturer", "pause");
        mo20615a(C17463z.m17549a(this));
    }

    public final void resume() {
        LiteavLog.m16901i("CameraCapturer", "resume");
        mo20615a(C17457t.m17543a(this));
    }

    public final void start(Object obj, CaptureSourceInterface.CaptureParams captureParams, CaptureSourceInterface.C17399a aVar) {
        LiteavLog.m16901i("CameraCapturer", "Start: ");
        mo20615a(C17460w.m17546a(this, captureParams, aVar, obj));
    }

    public final void stop() {
        LiteavLog.m16901i("CameraCapturer", "Stop");
        mo20615a(C17461x.m17547a(this));
    }

    public final void updateParams(CaptureSourceInterface.CaptureParams captureParams) {
        LiteavLog.m16901i("CameraCapturer", "updateParams");
        mo20615a(C17462y.m17548a(this, captureParams));
    }

    /* renamed from: a */
    public final void mo20614a(int i, int i2) {
        mo20615a(C17458u.m17544a(i, i2));
    }

    /* renamed from: a */
    public final void mo20613a(float f) {
        LiteavLog.m16901i("CameraCapturer", "setZoom: ".concat(String.valueOf(f)));
        mo20615a(C17459v.m17545a(f));
    }
}
