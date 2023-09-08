package com.tencent.liteav.videoproducer.capture;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.tencent.liteav.base.util.C17111b;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.p1096b.C104516e;
import com.tencent.liteav.videobase.p1096b.C104518g;
import com.tencent.liteav.videobase.videobase.C17263h;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;

/* renamed from: com.tencent.liteav.videoproducer.capture.ar */
public abstract class C17417ar implements CaptureSourceInterface {

    /* renamed from: a */
    public final Handler f47266a;

    /* renamed from: b */
    public final IVideoReporter f47267b;

    /* renamed from: c */
    public C104516e f47268c;

    /* renamed from: d */
    public CaptureSourceInterface.C17399a f47269d;

    /* renamed from: e */
    public C17223e f47270e;

    public C17417ar(Looper looper, IVideoReporter iVideoReporter) {
        this.f47266a = new C17111b(looper);
        this.f47267b = iVideoReporter;
    }

    /* renamed from: a */
    public static /* synthetic */ void m17476a(C17417ar arVar, CaptureSourceInterface.C17399a aVar, Object obj, CaptureSourceInterface.CaptureParams captureParams) {
        if (arVar.f47268c != null) {
            LiteavLog.m16898e("GLCapturerSource", "capture source has already started!");
            return;
        }
        arVar.f47269d = aVar;
        C104516e eVar = new C104516e();
        arVar.f47268c = eVar;
        try {
            eVar.mo147196a(obj, (Surface) null, 128, 128);
            arVar.f47268c.mo147195a();
            arVar.f47270e = new C17223e();
        } catch (C104518g e) {
            LiteavLog.m16899e("GLCapturerSource", "initializeEGL failed.", (Throwable) e);
            IVideoReporter iVideoReporter = arVar.f47267b;
            C17263h.C17268a aVar2 = C17263h.C17268a.ERR_VIDEO_CAPTURE_EGL_CORE_CREATE_FAILED;
            iVideoReporter.notifyError(aVar2, "create EGLCore failed, errorCode:" + e.mErrorCode, new Object[0]);
            arVar.f47268c = null;
        }
        arVar.mo20537a(captureParams);
    }

    /* renamed from: a */
    public abstract void mo20537a(CaptureSourceInterface.CaptureParams captureParams);

    /* renamed from: b */
    public abstract void mo20540b();

    /* renamed from: c */
    public final boolean mo20575c() {
        C104516e eVar = this.f47268c;
        if (eVar == null) {
            LiteavLog.m16898e("GLCapturerSource", "makeCurrent on mEGLCore is null");
            return false;
        }
        try {
            eVar.mo147195a();
            return true;
        } catch (C104518g e) {
            LiteavLog.m16899e("GLCapturerSource", "make current failed.", (Throwable) e);
            IVideoReporter iVideoReporter = this.f47267b;
            C17263h.C17268a aVar = C17263h.C17268a.ERR_VIDEO_CAPTURE_OPENGL_ERROR;
            iVideoReporter.notifyError(aVar, "OpenGL report error, errorCode:" + e.mErrorCode, new Object[0]);
            return false;
        }
    }

    /* renamed from: d */
    public final void mo20576d() {
        CaptureSourceInterface.C17399a aVar = this.f47269d;
        if (aVar != null) {
            aVar.mo20531a();
        }
    }

    public void start(Object obj, CaptureSourceInterface.CaptureParams captureParams, CaptureSourceInterface.C17399a aVar) {
        mo20574a(C17418as.m17482a(this, aVar, obj, captureParams));
    }

    public void stop() {
        mo20574a(C17419at.m17483a(this));
    }

    /* renamed from: a */
    public static /* synthetic */ void m17475a(C17417ar arVar) {
        arVar.mo20540b();
        C104516e eVar = arVar.f47268c;
        if (eVar != null) {
            try {
                eVar.mo147195a();
                C17223e eVar2 = arVar.f47270e;
                if (eVar2 != null) {
                    eVar2.mo20187b();
                    arVar.f47270e = null;
                }
            } catch (C104518g e) {
                LiteavLog.m16899e("GLCapturerSource", "EGLCore destroy failed.", (Throwable) e);
            }
            C104516e.m139822a(arVar.f47268c);
            arVar.f47268c = null;
        }
        arVar.f47269d = null;
    }

    /* renamed from: a */
    public final void mo20574a(Runnable runnable) {
        if (this.f47266a.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f47266a.post(runnable);
        }
    }
}
