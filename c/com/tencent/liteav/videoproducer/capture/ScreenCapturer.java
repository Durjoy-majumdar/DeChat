package com.tencent.liteav.videoproducer.capture;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.projection.MediaProjection;
import android.opengl.Matrix;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.view.WindowManager;
import com.tencent.liteav.base.util.C113473t;
import com.tencent.liteav.base.util.C17111b;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.TimeUtil;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.C17234j;
import com.tencent.liteav.videobase.frame.C17237l;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.p1096b.C104516e;
import com.tencent.liteav.videobase.p1096b.C104518g;
import com.tencent.liteav.videobase.utils.C17245d;
import com.tencent.liteav.videobase.utils.C17248f;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.videobase.C17263h;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoproducer.capture.C17428bc;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;
import com.tencent.tavkit.component.TAVExporter;
import java.util.Locale;

public final class ScreenCapturer extends C17417ar implements SurfaceTexture.OnFrameAvailableListener, C113473t.C113474a, C17428bc.C17432b {

    /* renamed from: f */
    public C17237l f47194f;

    /* renamed from: g */
    private final Context f47195g;

    /* renamed from: h */
    private final IVideoReporter f47196h;

    /* renamed from: i */
    private final C17111b f47197i;

    /* renamed from: j */
    private int f47198j = TAVExporter.VIDEO_EXPORT_WIDTH;

    /* renamed from: k */
    private int f47199k = 1080;

    /* renamed from: l */
    private ScreenCaptureParams f47200l;

    /* renamed from: m */
    private int f47201m = -1;

    /* renamed from: n */
    private SurfaceTexture f47202n;

    /* renamed from: o */
    private Surface f47203o;

    /* renamed from: p */
    private PixelFrame f47204p;

    /* renamed from: q */
    private C17234j f47205q;

    /* renamed from: r */
    private int f47206r = 0;

    /* renamed from: s */
    private int f47207s = 0;

    /* renamed from: t */
    private boolean f47208t = false;

    /* renamed from: u */
    private C17248f f47209u;

    /* renamed from: v */
    private C113473t f47210v;

    /* renamed from: w */
    private boolean f47211w = false;

    /* renamed from: x */
    private MediaProjection f47212x;

    /* renamed from: y */
    private boolean f47213y = true;

    public static class ScreenCaptureParams extends CaptureSourceInterface.CaptureParams {

        /* renamed from: a */
        public boolean f47214a;

        /* renamed from: f */
        public MediaProjection f47215f;

        public ScreenCaptureParams() {
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ScreenCaptureParams)) {
                return false;
            }
            ScreenCaptureParams screenCaptureParams = (ScreenCaptureParams) obj;
            return super.equals(obj) && this.f47214a == screenCaptureParams.f47214a && this.f47215f == screenCaptureParams.f47215f;
        }

        public String toString() {
            return String.format(Locale.ENGLISH, "%s, autoRotate: %b, mediaProjcetion: %s", new Object[]{super.toString(), Boolean.valueOf(this.f47214a), this.f47215f});
        }

        public ScreenCaptureParams(ScreenCaptureParams screenCaptureParams) {
            super(screenCaptureParams);
            this.f47214a = screenCaptureParams.f47214a;
            this.f47215f = screenCaptureParams.f47215f;
        }
    }

    public ScreenCapturer(Context context, Looper looper, IVideoReporter iVideoReporter) {
        super(looper, iVideoReporter);
        this.f47195g = context;
        this.f47196h = iVideoReporter;
        this.f47197i = new C17111b(Looper.getMainLooper());
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                int i = displayMetrics.widthPixels;
                this.f47198j = i;
                this.f47199k = displayMetrics.heightPixels;
                LiteavLog.m16902i("ScreenCapturer", "DeviceScreen:[width:%d][height:%d]", Integer.valueOf(i), Integer.valueOf(this.f47199k));
            }
        } catch (Exception e) {
            LiteavLog.m16899e("ScreenCapturer", "get screen resolution failed.", (Throwable) e);
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m17415c(ScreenCapturer screenCapturer) {
        LiteavLog.m16901i("ScreenCapturer", "resume capture");
        if (screenCapturer.f47208t) {
            screenCapturer.f47196h.notifyEvent(C17263h.C17269b.EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_RESUME, "screen capture has been resumed", new Object[0]);
        }
        screenCapturer.f47208t = false;
        C17248f fVar = screenCapturer.f47209u;
        if (fVar != null) {
            fVar.mo20225a();
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m17416d(ScreenCapturer screenCapturer) {
        LiteavLog.m16901i("ScreenCapturer", "pause capture");
        if (!screenCapturer.f47208t) {
            screenCapturer.f47196h.notifyEvent(C17263h.C17269b.EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_INTERRUPTED, "screen capture has been interrupted", new Object[0]);
        }
        screenCapturer.f47208t = true;
    }

    /* renamed from: f */
    private void m17417f() {
        if (this.f47198j == 0 || this.f47199k == 0) {
            ScreenCaptureParams screenCaptureParams = this.f47200l;
            this.f47198j = screenCaptureParams.f47184c;
            this.f47199k = screenCaptureParams.f47185d;
        }
        int i = this.f47198j;
        int i2 = this.f47199k;
        if (this.f47200l.f47214a) {
            int rotation = ((WindowManager) this.f47195g.getSystemService("window")).getDefaultDisplay().getRotation();
            if (rotation == 0 || rotation == 2) {
                i = Math.min(this.f47198j, this.f47199k);
                i2 = Math.max(this.f47198j, this.f47199k);
            } else {
                i = Math.max(this.f47198j, this.f47199k);
                i2 = Math.min(this.f47198j, this.f47199k);
            }
        }
        this.f47201m = OpenGlUtils.generateTextureOES();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f47201m);
        this.f47202n = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.f47202n.setDefaultBufferSize(i, i2);
        this.f47203o = new Surface(this.f47202n);
        C17428bc.m17492a(this.f47195g).mo20589a(this.f47203o, i, i2, this.f47212x, this);
        LiteavLog.m16902i("ScreenCapturer", "Start virtual display, size: %dx%d", Integer.valueOf(i), Integer.valueOf(i2));
        this.f47207s = i2;
        this.f47206r = i;
        PixelFrame pixelFrame = new PixelFrame();
        this.f47204p = pixelFrame;
        pixelFrame.setPixelFormatType(GLConstants.PixelFormatType.RGBA);
        this.f47204p.setPixelBufferType(GLConstants.PixelBufferType.TEXTURE_OES);
        this.f47204p.setTextureId(this.f47201m);
        this.f47204p.setWidth(i);
        this.f47204p.setHeight(i2);
        this.f47204p.setMatrix(new float[16]);
    }

    /* renamed from: g */
    private void m17418g() {
        this.f47212x = null;
        C17428bc.m17492a(this.f47195g).mo20588a(this.f47203o);
        Surface surface = this.f47203o;
        if (surface != null) {
            surface.release();
            this.f47203o = null;
        }
        if (!mo20575c()) {
            LiteavLog.m16905w("ScreenCapturer", "makeCurrent error!");
            mo20576d();
            return;
        }
        C17234j jVar = this.f47205q;
        if (jVar != null) {
            jVar.mo20209a();
            this.f47205q = null;
        }
        SurfaceTexture surfaceTexture = this.f47202n;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
            this.f47202n.release();
            this.f47202n = null;
        }
        OpenGlUtils.deleteTexture(this.f47201m);
        this.f47201m = -1;
        C113473t tVar = this.f47210v;
        if (tVar != null) {
            tVar.mo169973a();
            this.f47210v = null;
        }
    }

    /* renamed from: a */
    public final void mo20537a(CaptureSourceInterface.CaptureParams captureParams) {
        if (!this.f47213y) {
            LiteavLog.m16900e("ScreenCapturer", "Start capture %s, capturer already started", captureParams);
        } else if (this.f47268c == null) {
            LiteavLog.m16900e("ScreenCapturer", "Start capture %s, mEGLCore is null", captureParams);
        } else {
            LiteavLog.m16902i("ScreenCapturer", "Start capture %s", captureParams);
            ScreenCaptureParams screenCaptureParams = new ScreenCaptureParams((ScreenCaptureParams) captureParams);
            this.f47200l = screenCaptureParams;
            this.f47212x = screenCaptureParams.f47215f;
            try {
                this.f47268c.mo147195a();
                if (this.f47194f == null) {
                    this.f47194f = new C17237l();
                }
                m17417f();
                this.f47213y = false;
            } catch (C104518g e) {
                LiteavLog.m16899e("ScreenCapturer", "make current failed.", (Throwable) e);
                IVideoReporter iVideoReporter = this.f47196h;
                C17263h.C17268a aVar = C17263h.C17268a.ERR_VIDEO_CAPTURE_SCREEN_CAPTURE_START_FAILED;
                iVideoReporter.notifyError(aVar, "Start screen capture failed, params:" + this.f47200l + " message:" + e.getMessage(), new Object[0]);
                CaptureSourceInterface.C17399a aVar2 = this.f47269d;
                if (aVar2 != null) {
                    aVar2.mo20533a(false);
                }
            }
        }
    }

    /* renamed from: a_ */
    public final void mo20405a_() {
        C17237l.C17239b bVar;
        float f;
        float f2;
        float f3;
        float f4;
        if (this.f47202n != null && !this.f47208t) {
            if (!mo20575c()) {
                mo20576d();
                return;
            }
            C17248f fVar = this.f47209u;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = fVar.f46624a;
            boolean z = true;
            if (i != 0) {
                long j = fVar.f46625b;
                if (j != -1 && elapsedRealtime - j < ((fVar.f46626c + 1) * 1000) / ((long) i)) {
                    z = false;
                }
            }
            if (z) {
                C17248f fVar2 = this.f47209u;
                if (fVar2.f46625b == -1) {
                    fVar2.f46625b = SystemClock.elapsedRealtime();
                }
                fVar2.f46626c++;
                C17237l lVar = this.f47194f;
                if (lVar == null || this.f47200l == null) {
                    LiteavLog.m16905w("ScreenCapturer", "onScreenFrameAvailable mTextureHolderPool = " + this.f47194f + ", mCaptureParams = " + this.f47200l);
                    return;
                }
                Object obj = null;
                try {
                    bVar = (C17237l.C17239b) lVar.mo20203a();
                } catch (InterruptedException unused) {
                    LiteavLog.m16905w("ScreenCapturer", "textureholderpool obtain interrupted.");
                    bVar = null;
                }
                Rect rect = this.f47200l.f47186e;
                if (rect == null || rect.isEmpty()) {
                    f4 = 1.0f;
                    f3 = 1.0f;
                    f2 = 0.0f;
                    f = 0.0f;
                } else {
                    Rect rect2 = this.f47200l.f47186e;
                    int i2 = rect2.left;
                    int i3 = this.f47206r;
                    f2 = (((float) i2) * 1.0f) / ((float) i3);
                    f = (((float) rect2.top) * 1.0f) / ((float) this.f47207s);
                    int min = Math.min(i3 - i2, rect2.width());
                    int min2 = Math.min(this.f47207s - rect2.top, rect2.height());
                    f3 = (((float) min) * 1.0f) / ((float) this.f47206r);
                    f4 = (((float) min2) * 1.0f) / ((float) this.f47207s);
                }
                bVar.mo20215a(36197, this.f47201m, this.f47206r, this.f47207s);
                C104516e eVar = this.f47268c;
                if (eVar != null) {
                    obj = eVar.mo147198c();
                }
                PixelFrame a = bVar.mo20196a(obj);
                if (a.getMatrix() == null) {
                    a.setMatrix(new float[16]);
                }
                this.f47202n.updateTexImage();
                this.f47202n.getTransformMatrix(a.getMatrix());
                a.setTimestamp(TimeUtil.m16909a());
                if (!C17245d.m17129a(f2, 0.0f) || !C17245d.m17129a(f, 0.0f)) {
                    Matrix.translateM(a.getMatrix(), 0, f2, f, 0.0f);
                }
                if (!C17245d.m17129a(f3, 1.0f) || !C17245d.m17129a(f4, 1.0f)) {
                    Matrix.scaleM(a.getMatrix(), 0, f3, f4, 1.0f);
                }
                CaptureSourceInterface.C17399a aVar = this.f47269d;
                if (aVar != null) {
                    aVar.mo20532a(this, a);
                }
                bVar.release();
                a.release();
            }
        }
    }

    /* renamed from: b */
    public final void mo20540b() {
        if (this.f47213y) {
            LiteavLog.m16901i("ScreenCapturer", "Stop capture, capturer already stopped");
            return;
        }
        LiteavLog.m16901i("ScreenCapturer", "Stop capture");
        C17237l lVar = this.f47194f;
        if (lVar != null) {
            lVar.mo20205b();
            this.f47194f = null;
        }
        m17418g();
        this.f47196h.notifyEvent(C17263h.C17269b.EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_STOP_SUCCESS, "Stop screen capture success", new Object[0]);
        this.f47213y = true;
    }

    /* renamed from: e */
    public final void mo20541e() {
        mo20574a(C17426ba.m17490a(this));
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        mo20574a(C17423ay.m17487a(this));
    }

    public final void pause() {
        mo20574a(C17421aw.m17485a(this));
    }

    public final void resume() {
        mo20574a(C17422ax.m17486a(this));
    }

    public final void updateParams(CaptureSourceInterface.CaptureParams captureParams) {
        mo20574a(C17420av.m17484a(this, captureParams));
    }

    /* renamed from: b */
    public static /* synthetic */ void m17414b(ScreenCapturer screenCapturer) {
        if (screenCapturer.f47202n != null) {
            screenCapturer.f47209u = new C17248f(screenCapturer.f47200l.f47183b);
            C113473t tVar = new C113473t(screenCapturer.f47266a.getLooper(), screenCapturer);
            screenCapturer.f47210v = tVar;
            tVar.mo169974a(0, 5);
            screenCapturer.f47202n.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
            screenCapturer.f47205q = new C17234j(screenCapturer.f47206r, screenCapturer.f47207s);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17411a(ScreenCapturer screenCapturer, CaptureSourceInterface.CaptureParams captureParams) {
        ScreenCaptureParams screenCaptureParams = screenCapturer.f47200l;
        if (screenCaptureParams == null || !screenCaptureParams.equals(captureParams)) {
            LiteavLog.m16902i("ScreenCapturer", "updateParams %s", captureParams);
            screenCapturer.f47200l = new ScreenCaptureParams((ScreenCaptureParams) captureParams);
            if (screenCapturer.f47202n == null) {
                LiteavLog.m16898e("ScreenCapturer", "capturer not started");
            } else if (!screenCapturer.mo20575c()) {
                LiteavLog.m16905w("ScreenCapturer", "makeCurrent error!");
                screenCapturer.mo20576d();
            } else {
                screenCapturer.m17418g();
                screenCapturer.m17417f();
            }
        } else {
            LiteavLog.m16902i("ScreenCapturer", "updateParams %s is the same ", captureParams);
        }
    }

    /* renamed from: a */
    public final void mo20539a(boolean z, boolean z2) {
        mo20574a(C17424az.m17488a(this, z, z2));
    }

    /* renamed from: a */
    public static /* synthetic */ void m17413a(ScreenCapturer screenCapturer, boolean z, boolean z2) {
        LiteavLog.m16902i("ScreenCapturer", "on Start finish, success: %b, isPermissionDenied: %b", Boolean.valueOf(z), Boolean.valueOf(z2));
        CaptureSourceInterface.C17399a aVar = screenCapturer.f47269d;
        if (aVar != null) {
            aVar.mo20533a(z);
        }
        if (z) {
            if (!screenCapturer.f47211w) {
                screenCapturer.f47211w = true;
                IVideoReporter iVideoReporter = screenCapturer.f47196h;
                C17263h.C17269b bVar = C17263h.C17269b.EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_START_SUCCESS;
                iVideoReporter.notifyEvent(bVar, "Start screen capture success params:" + screenCapturer.f47200l, new Object[0]);
            }
        } else if (z2) {
            IVideoReporter iVideoReporter2 = screenCapturer.f47196h;
            C17263h.C17268a aVar2 = C17263h.C17268a.ERR_VIDEO_CAPTURE_SCREEN_UNAUTHORIZED;
            iVideoReporter2.notifyError(aVar2, "permission denied, Start screen capture failed, params:" + screenCapturer.f47200l, new Object[0]);
        } else {
            IVideoReporter iVideoReporter3 = screenCapturer.f47196h;
            C17263h.C17268a aVar3 = C17263h.C17268a.ERR_VIDEO_CAPTURE_SCREEN_CAPTURE_START_FAILED;
            iVideoReporter3.notifyError(aVar3, "Start screen capture failed, params:" + screenCapturer.f47200l, new Object[0]);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17410a(ScreenCapturer screenCapturer) {
        LiteavLog.m16898e("ScreenCapturer", "capture error");
        CaptureSourceInterface.C17399a aVar = screenCapturer.f47269d;
        if (aVar != null) {
            aVar.mo20531a();
        }
        screenCapturer.f47196h.notifyEvent(C17263h.C17269b.EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_INTERRUPTED, "screen capture has been interrupted", new Object[0]);
    }

    /* renamed from: a */
    public final void mo20538a(boolean z) {
        mo20574a(C17427bb.m17491a(this, z));
    }

    /* renamed from: a */
    public static /* synthetic */ void m17412a(ScreenCapturer screenCapturer, boolean z) {
        LiteavLog.m16897d("ScreenCapturer", "display orientation changed, isPortrait: %b", Boolean.valueOf(z));
        if (!screenCapturer.f47213y && screenCapturer.f47200l.f47214a) {
            screenCapturer.mo20540b();
            screenCapturer.mo20537a((CaptureSourceInterface.CaptureParams) screenCapturer.f47200l);
            CaptureSourceInterface.C17399a aVar = screenCapturer.f47269d;
            if (aVar != null) {
                aVar.mo20534b(z);
            }
        }
    }
}
