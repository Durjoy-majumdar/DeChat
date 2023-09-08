package yg2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.ViewGroup;
import com.tencent.p014mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.api.recordView.C104727e;
import com.tencent.p014mm.plugin.api.recordView.C104729f;
import com.tencent.p014mm.plugin.api.recordView.C104732h;
import com.tencent.p014mm.plugin.api.recordView.MMSightCameraGLSurfaceView;
import com.tencent.p014mm.plugin.mmsight.api.MMSightRecordView;
import com.tencent.p014mm.sdk.platformtools.Log;
import f90.C107508a;
import f90.C107509b;
import f90.C107514d;
import fh2.C97875a;
import gy3.C87412m;
import i72.C108382h;
import i72.C98607d;
import j72.C108607f;
import java.nio.ByteBuffer;
import qh2.C101198e;
import y80.C112397a;

/* renamed from: yg2.i */
public final class C112456i extends MMSightRecordView.C18931e implements C108382h, C108607f.C108608a, C104727e.C104728a {

    /* renamed from: d */
    public C112445a f336710d;

    /* renamed from: e */
    public String f336711e;

    /* renamed from: f */
    public VideoTransPara f336712f;

    /* renamed from: g */
    public long f336713g = -1;

    /* renamed from: h */
    public float f336714h = -1.0f;

    /* renamed from: i */
    public float f336715i;

    /* renamed from: j */
    public int f336716j;

    /* renamed from: n */
    public boolean f336717n = true;

    /* renamed from: o */
    public boolean f336718o = true;

    /* renamed from: p */
    public float[] f336719p;

    /* renamed from: q */
    public Size f336720q;

    /* renamed from: A */
    public void mo24051A(boolean z) {
        this.f336718o = z;
    }

    /* renamed from: B */
    public void mo24052B(int i) {
        C112445a aVar = this.f336710d;
        if (aVar != null) {
            aVar.setFlashMode(i);
        }
    }

    /* renamed from: C */
    public void mo24053C(ByteBuffer byteBuffer, MMSightRecordView.C18936f fVar) {
        MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView;
        C112445a aVar = this.f336710d;
        if (aVar != null) {
            Boolean bool = null;
            if (fVar == null && byteBuffer == null) {
                C104729f fVar2 = aVar.f336696x;
                if (fVar2 != null) {
                    fVar2.f311008d = null;
                    C104732h hVar = new C104732h(fVar2);
                    if (fVar2.f311005a.isAlive()) {
                        fVar2.f311006b.post(hVar);
                    }
                    aVar.f336696x = null;
                    MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView2 = aVar.f336679A;
                    if (mMSightCameraGLSurfaceView2 != null) {
                        mMSightCameraGLSurfaceView2.setVisibility(8);
                    }
                }
            } else if (aVar.f336696x == null) {
                aVar.f336696x = new C104729f();
                aVar.mo164163n();
                C104729f fVar3 = aVar.f336696x;
                if (fVar3 != null) {
                    fVar3.f311008d = new C112453f(fVar, byteBuffer);
                }
                C107509b bVar = aVar.f336688p;
                if (bVar != null) {
                    bool = Boolean.valueOf(((C112397a) bVar.f321642b).mo164109B());
                }
                C87412m.m108591d(bool);
                if (bool.booleanValue() && (mMSightCameraGLSurfaceView = aVar.f336679A) != null) {
                    if (mMSightCameraGLSurfaceView.getEglContext() != null) {
                        C104729f fVar4 = aVar.f336696x;
                        if (fVar4 != null) {
                            fVar4.mo148400b(mMSightCameraGLSurfaceView.getEglContext());
                        }
                    } else {
                        MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView3 = aVar.f336679A;
                        if (mMSightCameraGLSurfaceView3 != null) {
                            mMSightCameraGLSurfaceView3.setOnEglEnableListener(new C112454g(aVar, mMSightCameraGLSurfaceView));
                        }
                    }
                    MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView4 = aVar.f336679A;
                    if (mMSightCameraGLSurfaceView4 != null) {
                        mMSightCameraGLSurfaceView4.setVisibility(0);
                    }
                }
            }
        }
    }

    /* renamed from: D */
    public void mo24054D(MMSightRecordView.C18932a aVar) {
        C112445a aVar2 = this.f336710d;
        if (aVar2 != null) {
            aVar2.setFrameDataCallback(aVar);
        }
    }

    /* renamed from: E */
    public void mo24055E() {
        Log.m105924i("MicroMsg.AppRecordViewImpl", "setHalfPreviewVideoSize");
    }

    /* renamed from: F */
    public void mo24056F(MMSightRecordView.C18934c cVar) {
        C112445a aVar = this.f336710d;
        if (aVar != null) {
            aVar.setInitDoneCallback(cVar);
        }
    }

    /* renamed from: G */
    public void mo24057G(MMSightRecordView.C18935d dVar) {
        C112445a aVar = this.f336710d;
        if (aVar != null) {
            aVar.setInitErrorCallback(dVar);
        }
    }

    /* renamed from: H */
    public void mo24058H(int i) {
        C112445a aVar = this.f336710d;
        if (aVar != null) {
            aVar.setPreviewMode(i);
        }
    }

    /* renamed from: I */
    public void mo24059I(int i) {
        Log.m105925i("MicroMsg.AppRecordViewImpl", "setPreviewSizeLimit: %s", Integer.valueOf(i));
        this.f336716j = i;
    }

    /* renamed from: J */
    public void mo24060J(int i) {
        C112445a aVar = this.f336710d;
        if (aVar != null) {
            aVar.setRGBSizeLimit(i);
        }
    }

    /* renamed from: K */
    public void mo24061K(boolean z) {
        C112445a aVar = this.f336710d;
        if (aVar != null) {
            aVar.setUseBackCamera(z);
        }
    }

    /* renamed from: L */
    public void mo24062L(String str) {
        C112445a aVar;
        C97875a aVar2;
        this.f336711e = str;
        if (!(str == null || (aVar = this.f336710d) == null || (aVar2 = aVar.f336687o) == null)) {
            aVar2.f287116f = str;
        }
        Log.m105925i("MicroMsg.AppRecordViewImpl", "video path has been set %s", str);
    }

    /* renamed from: M */
    public void mo24063M(int i, int i2, int i3, int i4, int i5) {
        C112445a aVar;
        VideoTransPara videoTransPara = this.f336712f;
        if (videoTransPara != null) {
            videoTransPara.f267170h = i;
        }
        if (videoTransPara != null) {
            videoTransPara.f267169g = i2;
        }
        if (videoTransPara != null) {
            videoTransPara.f267168f = i3;
        }
        if (videoTransPara != null) {
            videoTransPara.f267173n = i4;
        }
        if (videoTransPara != null) {
            videoTransPara.f267174o = i5;
        }
        if (videoTransPara != null && (aVar = this.f336710d) != null) {
            C87412m.m108591d(videoTransPara);
            C97875a aVar2 = aVar.f336687o;
            if (aVar2 != null) {
                aVar2.f287114d = videoTransPara;
            }
        }
    }

    /* renamed from: N */
    public boolean mo24064N(float f) {
        float[] fArr = this.f336719p;
        if (fArr != null) {
            if (!(fArr.length == 0)) {
                Float valueOf = Float.valueOf(f);
                int i = -1;
                if (valueOf instanceof Float) {
                    float floatValue = valueOf.floatValue();
                    int length = fArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        if (Float.floatToIntBits(fArr[i2]) == Float.floatToIntBits(floatValue)) {
                            i = i2;
                            break;
                        }
                        i2++;
                    }
                }
                Integer valueOf2 = Integer.valueOf(i);
                C87412m.m108591d(valueOf2);
                if (valueOf2.intValue() >= 0) {
                    C112445a aVar = this.f336710d;
                    if (aVar != null) {
                        aVar.setForceZoomTargetRatio(f);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: O */
    public void mo24065O() {
        int i;
        float f = this.f336715i;
        if (f > 0.0f && (i = this.f336716j) > 0) {
            VideoTransPara videoTransPara = this.f336712f;
            if (videoTransPara != null) {
                videoTransPara.f267166d = i;
            }
            if (videoTransPara != null) {
                videoTransPara.f267167e = (int) (((float) i) / f);
            }
        }
        C112445a aVar = this.f336710d;
        if (aVar != null) {
            VideoTransPara videoTransPara2 = this.f336712f;
            C87412m.m108591d(videoTransPara2);
            String str = this.f336711e;
            C87412m.m108591d(str);
            Size size = this.f336720q;
            CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView = aVar.f336686n;
            C87412m.m108591d(cameraPreviewGLSurfaceView);
            C97875a aVar2 = new C97875a(videoTransPara2, cameraPreviewGLSurfaceView, str);
            aVar.f336687o = aVar2;
            C107509b bVar = new C107509b(aVar2);
            aVar.f336688p = bVar;
            if (true != bVar.f321658r) {
                bVar.f321658r = true;
            }
            ((C112397a) bVar.f321642b).f336543q = size;
            C112450b bVar2 = new C112450b(aVar);
            ((C112397a) bVar.f321642b).mo164111H(true);
            bVar.f321642b.mo143182t(new C107508a(bVar2));
            C107509b bVar3 = aVar.f336688p;
            C87412m.m108591d(bVar3);
            C107509b.m145625i(bVar3, aVar.f336697y, (Float) null, new C112452e(aVar), 2, (Object) null);
        }
    }

    /* renamed from: P */
    public boolean mo24066P(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("PARAM_RECORD_RESULT_MIRROR_BOOLEAN", z);
        C112445a aVar = this.f336710d;
        if (aVar == null) {
            return true;
        }
        aVar.mo14585p(C101198e.C101199b.RECORD_START, bundle);
        return true;
    }

    /* renamed from: Q */
    public void mo24067Q(MMSightRecordView.C18938h hVar) {
        C112445a aVar = this.f336710d;
        if (aVar != null) {
            aVar.setRecordCallback(hVar);
        }
        C112445a aVar2 = this.f336710d;
        if (aVar2 != null) {
            C101198e.C62622a.m73576a(aVar2, C101198e.C101199b.RECORD_FINISH, (Bundle) null, 2, (Object) null);
        }
    }

    /* renamed from: R */
    public void mo24068R() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("PARAM_PREPARE_CAMERA_IGNORE_FLIP_CHECK_BOOLEAN", true);
        C112445a aVar = this.f336710d;
        if (aVar != null) {
            aVar.mo14585p(C101198e.C101199b.SWITCH_CAMERA, bundle);
        }
    }

    /* renamed from: S */
    public void mo24069S(MMSightRecordView.C18937g gVar, boolean z) {
        C112445a aVar = this.f336710d;
        if (aVar != null) {
            aVar.f336690r = gVar;
            aVar.f336698z = z;
        }
        if (aVar != null) {
            C101198e.C62622a.m73576a(aVar, C101198e.C101199b.RECORD_PICTURE, (Bundle) null, 2, (Object) null);
        }
    }

    /* renamed from: a */
    public void mo148395a() {
        if (this.f336717n) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN", true);
            bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_SCROLL_BOOLEAN", false);
            bundle.putInt("PARAM_PREPARE_CAMERA_ZOOM_FACTOR_INT", 1);
            C112445a aVar = this.f336710d;
            if (aVar != null) {
                aVar.mo14585p(C101198e.C101199b.TRIGGER_CAMERA_ZOOM, bundle);
            }
        }
    }

    /* renamed from: b */
    public void mo148396b() {
        if (this.f336717n) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN", false);
            bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_SCROLL_BOOLEAN", false);
            bundle.putInt("PARAM_PREPARE_CAMERA_ZOOM_FACTOR_INT", 1);
            C112445a aVar = this.f336710d;
            if (aVar != null) {
                aVar.mo14585p(C101198e.C101199b.TRIGGER_CAMERA_ZOOM, bundle);
            }
        }
    }

    /* renamed from: c */
    public void mo148397c() {
    }

    /* renamed from: d */
    public void mo150355d(int i) {
        C112445a aVar = this.f336710d;
        if (aVar != null) {
            aVar.reset();
        }
    }

    /* renamed from: e */
    public void mo148398e(float f, float f2) {
        if (this.f336718o) {
            Bundle bundle = new Bundle();
            bundle.putFloat("PARAM_POINT_X", f);
            bundle.putFloat("PARAM_POINT_Y", f2);
            C112445a aVar = this.f336710d;
            if (aVar != null) {
                aVar.mo14585p(C101198e.C101199b.FOCUS_ON_TOUCH, bundle);
            }
        }
    }

    /* renamed from: f */
    public boolean mo157927f(byte[] bArr) {
        C112445a aVar = this.f336710d;
        if (aVar != null) {
            return aVar.mo164162m(bArr);
        }
        return false;
    }

    /* renamed from: g */
    public int mo24070g() {
        C112445a aVar = this.f336710d;
        if (aVar == null) {
            return 0;
        }
        C87412m.m108591d(aVar);
        return aVar.getCameraRotation();
    }

    /* renamed from: h */
    public Bitmap mo24071h() {
        C112445a aVar = this.f336710d;
        if (aVar != null) {
            return aVar.getCurrentFramePicture();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.getDrawSizePoint();
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Point mo24072i() {
        /*
            r1 = this;
            yg2.a r0 = r1.f336710d
            if (r0 == 0) goto L_0x000a
            android.graphics.Point r0 = r0.getDrawSizePoint()
            if (r0 != 0) goto L_0x000f
        L_0x000a:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yg2.C112456i.mo24072i():android.graphics.Point");
    }

    /* renamed from: j */
    public int mo24073j() {
        C112445a aVar = this.f336710d;
        if (aVar != null) {
            return aVar.getFlashMode();
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.getPictureSize();
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Point mo24074k() {
        /*
            r1 = this;
            yg2.a r0 = r1.f336710d
            if (r0 == 0) goto L_0x000a
            android.graphics.Point r0 = r0.getPictureSize()
            if (r0 != 0) goto L_0x000f
        L_0x000a:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yg2.C112456i.mo24074k():android.graphics.Point");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.getPreviewSize();
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Point mo24075l() {
        /*
            r1 = this;
            yg2.a r0 = r1.f336710d
            if (r0 == 0) goto L_0x000a
            android.graphics.Point r0 = r0.getPreviewSize()
            if (r0 != 0) goto L_0x000f
        L_0x000a:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yg2.C112456i.mo24075l():android.graphics.Point");
    }

    /* renamed from: m */
    public float[] mo24076m() {
        C112445a aVar;
        if (this.f336719p == null && (aVar = this.f336710d) != null) {
            C87412m.m108591d(aVar);
            this.f336719p = aVar.getSupportZoomRatios();
        }
        return this.f336719p;
    }

    /* renamed from: n */
    public String mo24077n() {
        String str = this.f336711e;
        return str == null ? "" : str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.getVideoSize();
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Point mo24078o() {
        /*
            r1 = this;
            yg2.a r0 = r1.f336710d
            if (r0 == 0) goto L_0x000a
            android.graphics.Point r0 = r0.getVideoSize()
            if (r0 != 0) goto L_0x000f
        L_0x000a:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yg2.C112456i.mo24078o():android.graphics.Point");
    }

    /* renamed from: p */
    public void mo24079p(MotionEvent motionEvent) {
        float f;
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            Log.m105918d("MicroMsg.AppRecordViewImpl", "ACTION_DOWN");
            if (this.f336713g <= 0 || SystemClock.elapsedRealtime() - this.f336713g >= ((long) 400)) {
                mo148398e(motionEvent.getX(), motionEvent.getY());
            }
            this.f336713g = SystemClock.elapsedRealtime();
            this.f336714h = -1.0f;
        } else if (valueOf != null && valueOf.intValue() == 5) {
            Log.m105918d("MicroMsg.AppRecordViewImpl", "ACTION_POINTER_DOWN");
        } else if (valueOf != null && valueOf.intValue() == 6) {
            Log.m105918d("MicroMsg.AppRecordViewImpl", "ACTION_POINTER_UP");
        } else if (valueOf != null && valueOf.intValue() == 1) {
            Log.m105918d("MicroMsg.AppRecordViewImpl", "ACTION_UP");
            this.f336714h = -1.0f;
        } else if (valueOf != null && valueOf.intValue() == 2 && motionEvent.getPointerCount() >= 2) {
            try {
                f = Math.abs(motionEvent.getX(0) - motionEvent.getX(1)) + Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppRecordViewImpl", "pointerDistance error: %s", e.getMessage());
                f = 0.0f;
            }
            Log.m105927v("MicroMsg.AppRecordViewImpl", "distance: %s", Float.valueOf(f));
            if (f > 0.0f) {
                float f2 = this.f336714h;
                if (f2 <= 0.0f) {
                    this.f336714h = f;
                } else if (Math.abs(f - f2) > ((float) 15)) {
                    if (f > this.f336714h) {
                        Log.m105918d("MicroMsg.AppRecordViewImpl", "zoom out");
                        mo148395a();
                    } else {
                        Log.m105918d("MicroMsg.AppRecordViewImpl", "zoom in");
                        mo148396b();
                    }
                    this.f336714h = f;
                }
            }
        }
    }

    /* renamed from: q */
    public void mo24080q(Context context, ViewGroup viewGroup) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(viewGroup, "view");
        C112445a aVar = new C112445a(context);
        this.f336710d = aVar;
        aVar.setTouchListener(this);
        C112445a aVar2 = this.f336710d;
        if (aVar2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
            CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView = new CameraPreviewGLSurfaceView(context, (AttributeSet) null);
            aVar2.f336686n = cameraPreviewGLSurfaceView;
            cameraPreviewGLSurfaceView.setOnTouchListener(aVar2.f336695w);
            viewGroup.addView(aVar2.f336686n, marginLayoutParams);
            C98607d dVar = new C98607d(context, 2);
            aVar2.f336689q = dVar;
            dVar.enable();
            MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView = new MMSightCameraGLSurfaceView(context);
            aVar2.f336679A = mMSightCameraGLSurfaceView;
            mMSightCameraGLSurfaceView.setBackgroundColor(Color.argb(0, 0, 0, 0));
            viewGroup.addView(aVar2.f336679A, new ViewGroup.MarginLayoutParams(1, 1));
        }
        this.f336712f = new VideoTransPara();
    }

    /* renamed from: r */
    public void mo24081r(Context context, ViewGroup viewGroup, Surface surface, int i, int i2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(viewGroup, "view");
        C112445a aVar = new C112445a(context);
        this.f336710d = aVar;
        Log.m105925i("MicroMsg.AppBrandCameraPluginLayout", "surface is %s", surface);
        C87412m.m108591d(surface);
        aVar.f336686n = new C107514d(context, surface, i, i2);
        C98607d dVar = new C98607d(context, 2);
        aVar.f336689q = dVar;
        dVar.enable();
        MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView = new MMSightCameraGLSurfaceView(context);
        aVar.f336679A = mMSightCameraGLSurfaceView;
        mMSightCameraGLSurfaceView.setBackgroundColor(Color.argb(0, 0, 0, 0));
        viewGroup.addView(aVar.f336679A, new ViewGroup.MarginLayoutParams(-1, -1));
        this.f336712f = new VideoTransPara();
    }

    /* renamed from: s */
    public void mo24082s() {
    }

    /* renamed from: t */
    public void mo24083t() {
        C112445a aVar = this.f336710d;
        if (aVar != null) {
            aVar.release();
        }
        this.f336719p = null;
    }

    /* renamed from: u */
    public void mo24084u() {
        Log.m105924i("MicroMsg.AppRecordViewImpl", "set34PreviewVideoSize");
    }

    /* renamed from: v */
    public void mo24085v(boolean z) {
    }

    /* renamed from: w */
    public void mo24086w(boolean z) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24087x(float r8) {
        /*
            r7 = this;
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.view.WindowManager"
            gy3.C87412m.m108592e(r0, r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            int r0 = r0.getRotation()
            r1 = 270(0x10e, float:3.78E-43)
            r2 = 2
            r3 = 90
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0035
            if (r0 == r4) goto L_0x0032
            if (r0 == r2) goto L_0x002f
            r6 = 3
            if (r0 == r6) goto L_0x002c
            goto L_0x0035
        L_0x002c:
            r0 = 270(0x10e, float:3.78E-43)
            goto L_0x0036
        L_0x002f:
            r0 = 180(0xb4, float:2.52E-43)
            goto L_0x0036
        L_0x0032:
            r0 = 90
            goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Float r6 = java.lang.Float.valueOf(r8)
            r2[r5] = r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r2[r4] = r5
            java.lang.String r4 = "MicroMsg.AppRecordViewImpl"
            java.lang.String r5 = "setDisplayRatio: %s, screenRotation: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r2)
            r7.f336715i = r8
            if (r0 == r3) goto L_0x0053
            if (r0 == r1) goto L_0x0053
            goto L_0x0058
        L_0x0053:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r8
            r7.f336715i = r0
        L_0x0058:
            yg2.a r8 = r7.f336710d
            if (r8 != 0) goto L_0x005d
            goto L_0x0062
        L_0x005d:
            float r0 = r7.f336715i
            r8.setDisplayRatio(r0)
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yg2.C112456i.mo24087x(float):void");
    }

    /* renamed from: y */
    public void mo24088y(Size size) {
        this.f336720q = size;
    }

    /* renamed from: z */
    public void mo24089z(boolean z) {
        this.f336717n = z;
    }
}
