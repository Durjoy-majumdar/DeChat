package com.tencent.liteav.videoproducer.capture;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import com.tencent.liteav.base.util.C17111b;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.C17246e;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;
import com.tencent.liteav.videoproducer.capture.VirtualCamera;

/* renamed from: com.tencent.liteav.videoproducer.capture.ah */
public final class C17405ah implements CaptureSourceInterface {

    /* renamed from: a */
    public VirtualCamera f47229a;

    /* renamed from: b */
    public VirtualCamera.VirtualCameraParams f47230b;

    /* renamed from: c */
    public CaptureSourceInterface f47231c;

    /* renamed from: d */
    public CaptureSourceInterface.CaptureParams f47232d;

    /* renamed from: e */
    public CaptureSourceInterface.C17399a f47233e;

    /* renamed from: f */
    public final Looper f47234f;

    /* renamed from: g */
    public final Context f47235g;

    /* renamed from: h */
    public final IVideoReporter f47236h;

    /* renamed from: i */
    public Object f47237i;

    /* renamed from: j */
    public boolean f47238j = false;

    /* renamed from: k */
    public C17407a f47239k = C17407a.STOPED;

    /* renamed from: l */
    public boolean f47240l = false;

    /* renamed from: m */
    public final C17246e f47241m;

    /* renamed from: n */
    public final CaptureSourceInterface.C17399a f47242n = new CaptureSourceInterface.C17399a() {
        /* renamed from: a */
        public final void mo20533a(boolean z) {
            CaptureSourceInterface.C17399a aVar = C17405ah.this.f47233e;
            if (aVar != null) {
                aVar.mo20533a(z);
            }
        }

        /* renamed from: b */
        public final void mo20534b(boolean z) {
            CaptureSourceInterface.C17399a aVar = C17405ah.this.f47233e;
            if (aVar != null) {
                aVar.mo20534b(z);
            }
        }

        /* renamed from: c */
        public final void mo20535c(boolean z) {
            CaptureSourceInterface.C17399a aVar = C17405ah.this.f47233e;
            if (aVar != null) {
                aVar.mo20535c(z);
            }
        }

        /* renamed from: d */
        public final void mo20536d(boolean z) {
            CaptureSourceInterface.C17399a aVar = C17405ah.this.f47233e;
            if (aVar != null) {
                aVar.mo20536d(z);
            }
        }

        /* renamed from: a */
        public final void mo20532a(CaptureSourceInterface captureSourceInterface, PixelFrame pixelFrame) {
            C17405ah ahVar = C17405ah.this;
            if (!ahVar.f47240l) {
                ahVar.f47240l = true;
                LiteavLog.m16901i("CaptureController", "CaptureController received first frame.");
            }
            if (pixelFrame != null) {
                C17405ah.this.mo20563a(C17415ap.m17465a(this));
            }
            C17405ah ahVar2 = C17405ah.this;
            CaptureSourceInterface.C17399a aVar = ahVar2.f47233e;
            if (aVar != null) {
                aVar.mo20532a(ahVar2, pixelFrame);
            }
        }

        /* renamed from: a */
        public final void mo20531a() {
            CaptureSourceInterface.C17399a aVar = C17405ah.this.f47233e;
            if (aVar != null) {
                aVar.mo20531a();
            }
        }
    };

    /* renamed from: o */
    private final C17111b f47243o;

    /* renamed from: com.tencent.liteav.videoproducer.capture.ah$a */
    public enum C17407a {
        STOPED,
        STARTED,
        PAUSED
    }

    public C17405ah(Context context, Looper looper, IVideoReporter iVideoReporter) {
        this.f47235g = context.getApplicationContext();
        this.f47234f = looper;
        this.f47236h = iVideoReporter;
        this.f47243o = new C17111b(looper);
        this.f47241m = new C17246e("CaptureController", 1000, new C17408ai(this));
    }

    /* renamed from: a */
    public final void mo20562a(Bitmap bitmap, int i, int i2, int i3) {
        LiteavLog.m16901i("CaptureController", "setVirtualCameraParams fps = " + i + ",width=" + i2 + ",height=" + i3 + ",bm=" + bitmap);
        mo20563a(C17409aj.m17459a(this, bitmap, i, i3, i2));
    }

    public final void pause() {
        LiteavLog.m16901i("CaptureController", "pause");
        mo20563a(C17411al.m17461a(this));
    }

    public final void resume() {
        LiteavLog.m16901i("CaptureController", "resume");
        mo20563a(C17412am.m17462a(this));
    }

    public final void start(Object obj, CaptureSourceInterface.CaptureParams captureParams, CaptureSourceInterface.C17399a aVar) {
        LiteavLog.m16901i("CaptureController", "Start params = " + captureParams.toString() + ", glContext=" + obj);
        mo20563a(C17410ak.m17460a(this, captureParams, aVar, obj));
    }

    public final void stop() {
        LiteavLog.m16901i("CaptureController", "Stop");
        mo20563a(C17413an.m17463a(this));
    }

    public final void updateParams(CaptureSourceInterface.CaptureParams captureParams) {
        mo20563a(C17414ao.m17464a(this, captureParams));
    }

    /* renamed from: a */
    public static /* synthetic */ void m17449a(C17405ah ahVar) {
        if (ahVar.f47239k != C17407a.STARTED) {
            LiteavLog.m16905w("CaptureController", "pause capture but mStatus is " + ahVar.f47239k);
            return;
        }
        ahVar.f47239k = C17407a.PAUSED;
        CaptureSourceInterface captureSourceInterface = ahVar.f47231c;
        if (captureSourceInterface != null) {
            captureSourceInterface.pause();
        }
        if (ahVar.f47238j) {
            if (ahVar.f47230b == null) {
                CaptureSourceInterface.CaptureParams captureParams = ahVar.f47232d;
                ahVar.mo20562a((Bitmap) null, 5, captureParams.f47184c, captureParams.f47185d);
            } else {
                ahVar.f47229a = new VirtualCamera(ahVar.f47234f, ahVar.f47236h);
            }
            VirtualCamera virtualCamera = ahVar.f47229a;
            if (virtualCamera != null) {
                virtualCamera.start(ahVar.f47237i, ahVar.f47230b, ahVar.f47242n);
                return;
            }
            return;
        }
        ahVar.f47241m.mo20223b();
    }

    /* renamed from: a */
    public final void mo20563a(Runnable runnable) {
        if (Looper.myLooper() == this.f47243o.getLooper()) {
            runnable.run();
        } else {
            this.f47243o.post(runnable);
        }
    }
}
