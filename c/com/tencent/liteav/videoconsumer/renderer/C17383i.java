package com.tencent.liteav.videoconsumer.renderer;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.base.util.C17111b;
import com.tencent.liteav.base.util.C17118l;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import com.tencent.liteav.videobase.frame.C17221c;
import com.tencent.liteav.videobase.frame.C17222d;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.frame.C17234j;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.p1096b.C104516e;
import com.tencent.liteav.videobase.p1096b.C104518g;
import com.tencent.liteav.videobase.utils.C17250i;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.C17263h;
import com.tencent.liteav.videobase.videobase.C17271i;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoconsumer.renderer.C17370a;
import com.tencent.wxmm.v2helper;

/* renamed from: com.tencent.liteav.videoconsumer.renderer.i */
public final class C17383i implements C17370a.C17373a, C17380g {

    /* renamed from: a */
    public final Handler f47127a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final IVideoReporter f47128b;

    /* renamed from: c */
    public final C17370a f47129c;

    /* renamed from: d */
    public final C17118l f47130d = new C17118l(5);

    /* renamed from: e */
    public DisplayTarget f47131e;

    /* renamed from: f */
    public Surface f47132f = null;

    /* renamed from: g */
    public final C104507p f47133g = new C104507p();

    /* renamed from: h */
    public boolean f47134h = false;

    /* renamed from: i */
    public boolean f47135i = false;

    /* renamed from: j */
    public C104516e f47136j = null;

    /* renamed from: k */
    public C17234j f47137k;

    /* renamed from: l */
    public final C17250i f47138l = new C17250i(1);

    /* renamed from: m */
    public GLConstants.GLScaleType f47139m = GLConstants.GLScaleType.FIT_CENTER;

    /* renamed from: n */
    public Rotation f47140n = Rotation.NORMAL;

    /* renamed from: o */
    public boolean f47141o = false;

    /* renamed from: p */
    public boolean f47142p = false;

    /* renamed from: q */
    public volatile boolean f47143q = false;

    /* renamed from: r */
    public boolean f47144r = false;

    /* renamed from: s */
    public TakeSnapshotListener f47145s;

    /* renamed from: t */
    public VideoRenderListener f47146t;

    /* renamed from: u */
    public boolean f47147u = false;

    /* renamed from: v */
    private final C17111b f47148v;

    /* renamed from: w */
    private Object f47149w;

    /* renamed from: x */
    private final C17221c f47150x = new C17221c();

    /* renamed from: y */
    private C17223e f47151y;

    /* renamed from: z */
    private Bitmap f47152z;

    public C17383i(Looper looper, IVideoReporter iVideoReporter) {
        this.f47148v = new C17111b(looper);
        this.f47128b = iVideoReporter;
        this.f47129c = new C17370a(this);
    }

    /* renamed from: a */
    public final void mo20309a(VideoRenderListener videoRenderListener) {
        m17371a(C17384j.m17391a(this, videoRenderListener));
    }

    /* renamed from: b */
    public final void mo20311b(boolean z) {
        m17371a(C17393u.m17400a(this, z));
    }

    /* renamed from: c */
    public final void mo20312c(boolean z) {
        m17371a(C17394v.m17401a(this, z));
    }

    /* renamed from: d */
    public final void mo20481d() {
        C17234j jVar = this.f47137k;
        if (jVar != null) {
            jVar.mo20209a();
            this.f47137k = null;
        }
    }

    /* renamed from: a */
    public final void mo20310a(boolean z) {
        m17371a(C17388p.m17395a(this, z));
    }

    /* renamed from: b */
    public final void mo20478b() {
        if (this.f47136j != null) {
            Object[] objArr = new Object[3];
            Surface surface = this.f47132f;
            objArr[0] = Integer.valueOf(surface != null ? surface.hashCode() : 0);
            objArr[1] = Integer.valueOf(this.f47133g.f309736a);
            objArr[2] = Integer.valueOf(this.f47133g.f309737b);
            LiteavLog.m16902i("VideoRenderer", "uninitializeEGL %d %d*%d", objArr);
            try {
                this.f47136j.mo147195a();
            } catch (C104518g e) {
                LiteavLog.m16898e("VideoRenderer", "uninitializeEGL EGLCore makeCurrent failed.".concat(String.valueOf(e)));
            }
            mo20481d();
            this.f47150x.mo20194d();
            C17223e eVar = this.f47151y;
            if (eVar != null) {
                eVar.mo20184a();
                this.f47151y.mo20187b();
                this.f47151y = null;
            }
            C104516e.m139822a(this.f47136j);
            this.f47136j = null;
        }
    }

    /* renamed from: c */
    public final void mo20480c() {
        try {
            this.f47136j.mo147197b();
        } catch (C104518g e) {
            LiteavLog.m16898e("VideoRenderer", "EGLCore swapBuffers failed.".concat(String.valueOf(e)));
            this.f47128b.notifyWarning(C17263h.C17270c.WARNING_VIDEO_RENDER_SWAP_BUFFER, "VideoRender: swapBuffer error:".concat(String.valueOf(e)), new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo20308a(DisplayTarget displayTarget, boolean z) {
        m17371a(C17389q.m17396a(this, displayTarget, z));
    }

    /* renamed from: a */
    public final void mo20305a(TakeSnapshotListener takeSnapshotListener) {
        m17371a(C17390r.m17397a(this, takeSnapshotListener));
    }

    /* renamed from: a */
    public final void mo20303a(GLConstants.GLScaleType gLScaleType) {
        m17371a(C17391s.m17398a(this, gLScaleType));
    }

    /* renamed from: a */
    public final void mo20307a(Rotation rotation) {
        m17371a(C17392t.m17399a(this, rotation));
    }

    /* renamed from: a */
    public final void mo20306a(PixelFrame pixelFrame) {
        if (this.f47143q) {
            if (pixelFrame == null) {
                LiteavLog.m16905w("VideoRenderer", "renderFrame pixelFrame is null!");
                return;
            }
            if (!this.f47144r) {
                this.f47144r = true;
                LiteavLog.m16896d("VideoRenderer", "VideoRender receive first frame!");
            }
            pixelFrame.getGLContext();
            this.f47138l.mo20218a(pixelFrame);
            m17371a(C17395w.m17402a(this));
        }
    }

    /* renamed from: a */
    private void m17371a(Runnable runnable) {
        if (Looper.myLooper() == this.f47148v.getLooper()) {
            runnable.run();
        } else {
            this.f47148v.post(runnable);
        }
    }

    /* renamed from: b */
    public final boolean mo20479b(PixelFrame pixelFrame) {
        Object gLContext = pixelFrame.getGLContext();
        if (this.f47136j == null || (gLContext != null && !CommonUtil.equals(this.f47149w, gLContext))) {
            mo20478b();
            Object gLContext2 = pixelFrame.getGLContext();
            if (this.f47132f != null) {
                try {
                    LiteavLog.m16901i("VideoRenderer", "initializeEGL surface = " + this.f47132f + " ,mSurfaceSize = " + this.f47133g);
                    C104516e eVar = new C104516e();
                    this.f47136j = eVar;
                    Surface surface = this.f47132f;
                    C104507p pVar = this.f47133g;
                    eVar.mo147196a(gLContext2, surface, pVar.f309736a, pVar.f309737b);
                    this.f47149w = gLContext2;
                    this.f47136j.mo147195a();
                    if (this.f47137k == null) {
                        C104507p pVar2 = this.f47133g;
                        this.f47137k = new C17234j(pVar2.f309736a, pVar2.f309737b);
                    }
                    if (this.f47151y == null) {
                        this.f47151y = new C17223e();
                    }
                    this.f47150x.mo20190a();
                } catch (C104518g e) {
                    LiteavLog.m16899e("VideoRenderer", "initializeEGL failed.", (Throwable) e);
                    this.f47136j = null;
                    this.f47128b.notifyWarning(C17263h.C17270c.WARNING_VIDEO_RENDER_EGL_CORE_CREATE_FAILED, "VideoRender: create EGLCore fail:".concat(String.valueOf(e)), new Object[0]);
                }
            }
        }
        C104516e eVar2 = this.f47136j;
        if (eVar2 == null) {
            return false;
        }
        try {
            eVar2.mo147195a();
            return true;
        } catch (C104518g e2) {
            LiteavLog.m16898e("VideoRenderer", "EGLCore makeCurrent failed.".concat(String.valueOf(e2)));
            return false;
        }
    }

    /* renamed from: a */
    public final void mo20476a(PixelFrame pixelFrame, boolean z, boolean z2, Rotation rotation, GLConstants.GLScaleType gLScaleType, boolean z3) {
        Rotation rotation2;
        PixelFrame pixelFrame2 = new PixelFrame(pixelFrame);
        pixelFrame2.setRotation(Rotation.m139836a((pixelFrame.getRotation().mValue + rotation.mValue) % v2helper.VOIP_ENC_HEIGHT_LV1));
        if (z) {
            pixelFrame2.setMirrorHorizontal(!pixelFrame2.isMirrorHorizontal());
        }
        if (z2) {
            pixelFrame2.setMirrorVertical(!pixelFrame2.isMirrorVertical());
        }
        if (rotation == Rotation.ROTATION_90 || rotation == Rotation.ROTATION_270) {
            int width = pixelFrame2.getWidth();
            pixelFrame2.setWidth(pixelFrame2.getHeight());
            pixelFrame2.setHeight(width);
        }
        pixelFrame2.setMirrorVertical(!pixelFrame2.isMirrorVertical());
        if (!(pixelFrame2.getRotation() == Rotation.NORMAL || pixelFrame2.getRotation() == (rotation2 = Rotation.ROTATION_180))) {
            pixelFrame2.setRotation(Rotation.m139836a((pixelFrame2.getRotation().mValue + rotation2.mValue) % v2helper.VOIP_ENC_HEIGHT_LV1));
        }
        if (this.f47135i) {
            this.f47137k.mo20210a(pixelFrame2, GLConstants.GLScaleType.FILL, (C17222d) null);
        } else {
            this.f47137k.mo20210a(pixelFrame2, gLScaleType, (C17222d) null);
        }
        if (z3) {
            this.f47129c.mo20450a(this.f47139m, pixelFrame2.getWidth(), pixelFrame2.getHeight());
        }
    }

    /* renamed from: b */
    public final Bitmap mo20477b(Bitmap bitmap) {
        Bitmap bitmap2;
        synchronized (this) {
            bitmap2 = this.f47152z;
            this.f47152z = bitmap;
        }
        return bitmap2;
    }

    /* renamed from: a */
    public final void mo20475a(Surface surface, int i, int i2, boolean z) {
        Surface surface2;
        mo20478b();
        if (z && (surface2 = this.f47132f) != null) {
            surface2.release();
        }
        this.f47132f = surface;
        C104507p pVar = this.f47133g;
        pVar.f309737b = i2;
        pVar.f309736a = i;
        if (surface != null) {
            this.f47128b.updateStatus(C17271i.STATUS_VIDEO_RENDER_RESOLUTION, Integer.valueOf((i << 16) | i2));
        }
        VideoRenderListener videoRenderListener = this.f47146t;
        if (videoRenderListener != null) {
            videoRenderListener.onRenderTargetSizeChanged(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo20467a(Surface surface, int i, int i2, boolean z, boolean z2) {
        m17371a(C17385l.m17392a(this, surface, i, i2, z2, z));
    }

    /* renamed from: a */
    public final void mo20466a(Bitmap bitmap) {
        mo20477b(bitmap);
        m17371a(C17386m.m17393a(this));
    }

    /* renamed from: a */
    public final void mo20465a() {
        this.f47148v.mo19362a(C17387n.m17394a(this), 1000);
    }
}
