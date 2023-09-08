package yg2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.tencent.p014mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView;
import com.tencent.p014mm.plugin.api.recordView.C104727e;
import com.tencent.p014mm.plugin.api.recordView.C104729f;
import com.tencent.p014mm.plugin.api.recordView.C104731g;
import com.tencent.p014mm.plugin.api.recordView.MMSightCameraGLSurfaceView;
import com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView;
import com.tencent.p014mm.plugin.mmsight.api.MMSightRecordView;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.BasePluginLayout;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import f90.C107508a;
import f90.C107509b;
import fh2.C97875a;
import fh2.C97884j;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import h90.C98324b;
import i72.C98607d;
import lh2.C109344g0;
import p156gj.C107835h0;
import qh2.C101198e;
import rx3.C13598b0;
import y80.C112397a;

/* renamed from: yg2.a */
public final class C112445a extends BasePluginLayout implements C101198e {

    /* renamed from: E */
    public static final /* synthetic */ int f336678E = 0;

    /* renamed from: A */
    public MMSightCameraGLSurfaceView f336679A;

    /* renamed from: B */
    public final Point f336680B = new Point(0, 0);

    /* renamed from: C */
    public int f336681C;

    /* renamed from: D */
    public float f336682D;

    /* renamed from: h */
    public final int f336683h = 1;

    /* renamed from: i */
    public WindowManager f336684i;

    /* renamed from: j */
    public int f336685j = 0;

    /* renamed from: n */
    public CameraPreviewGLSurfaceView f336686n;

    /* renamed from: o */
    public C97875a f336687o;

    /* renamed from: p */
    public C107509b f336688p;

    /* renamed from: q */
    public C98607d f336689q;

    /* renamed from: r */
    public MMSightRecordView.C18937g f336690r;

    /* renamed from: s */
    public MMSightRecordView.C18938h f336691s;

    /* renamed from: t */
    public MMSightRecordView.C18932a f336692t;

    /* renamed from: u */
    public MMSightRecordView.C18935d f336693u;

    /* renamed from: v */
    public MMSightRecordView.C18934c f336694v;

    /* renamed from: w */
    public C104727e f336695w;

    /* renamed from: x */
    public C104729f f336696x;

    /* renamed from: y */
    public boolean f336697y = true;

    /* renamed from: z */
    public boolean f336698z;

    /* renamed from: yg2.a$a */
    public static final class C102858a extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C112445a f303614d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<Bitmap> f303615e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102858a(C112445a aVar, C8479f0<Bitmap> f0Var) {
            super(1);
            this.f303614d = aVar;
            this.f303615e = f0Var;
        }

        public Object invoke(Object obj) {
            T t = (Bitmap) obj;
            if (t != null) {
                C98607d dVar = this.f303614d.f336689q;
                C87412m.m108591d(dVar);
                float b = (float) dVar.mo138048b();
                boolean z = true;
                boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_photo_align_long_side, true);
                int i = C107835h0.f322852i.f322646B;
                if (i != -1) {
                    if (i == 0) {
                        wf = false;
                    } else if (i == 1) {
                        wf = true;
                    }
                }
                if (wf) {
                    if (t.getHeight() > t.getWidth()) {
                        if (((float) t.getHeight()) > 1920.0f) {
                            float height = 1920.0f / ((float) t.getHeight());
                            t = BitmapUtil.rotateAndScale(t, b, height, height);
                        } else {
                            if (b != 0.0f) {
                                z = false;
                            }
                            if (!z) {
                                t = BitmapUtil.rotate(t, b);
                            }
                        }
                    } else if (((float) t.getWidth()) > 1920.0f) {
                        float width = 1920.0f / ((float) t.getWidth());
                        t = BitmapUtil.rotateAndScale(t, b, width, width);
                    } else {
                        if (b != 0.0f) {
                            z = false;
                        }
                        if (!z) {
                            t = BitmapUtil.rotate(t, b);
                        }
                    }
                } else if (t.getHeight() > t.getWidth()) {
                    if (((float) t.getWidth()) > 1080.0f) {
                        float width2 = 1080.0f / ((float) t.getWidth());
                        t = BitmapUtil.rotateAndScale(t, b, width2, width2);
                    } else {
                        if (b != 0.0f) {
                            z = false;
                        }
                        if (!z) {
                            t = BitmapUtil.rotate(t, b);
                        }
                    }
                } else if (((float) t.getHeight()) > 1080.0f) {
                    float height2 = 1080.0f / ((float) t.getHeight());
                    t = BitmapUtil.rotateAndScale(t, b, height2, height2);
                } else {
                    if (b != 0.0f) {
                        z = false;
                    }
                    if (!z) {
                        t = BitmapUtil.rotate(t, b);
                    }
                }
                this.f303615e.f27484d = t;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: yg2.a$b */
    public static final class C112446b extends C87413o implements C32226l<byte[], C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C112445a f336699d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112446b(C112445a aVar) {
            super(1);
            this.f336699d = aVar;
        }

        public Object invoke(Object obj) {
            byte[] bArr = (byte[]) obj;
            C87412m.m108594g(bArr, "data");
            this.f336699d.mo164162m(bArr);
            return null;
        }
    }

    /* renamed from: yg2.a$c */
    public static final class C112447c extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C112445a f336700d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112447c(C112445a aVar) {
            super(1);
            this.f336700d = aVar;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                this.f336700d.mo164163n();
                if (C97884j.f287168e) {
                    C107509b bVar = this.f336700d.f336688p;
                    C87412m.m108591d(bVar);
                    C97884j.m126370a(bVar.f321642b.mo143173l(true));
                }
            } else {
                MMSightRecordView.C18935d dVar = this.f336700d.f336693u;
                if (dVar != null) {
                    ((AppBrandCameraView.C17871c) dVar).mo22128a();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: yg2.a$d */
    public static final class C112448d extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C112445a f336701d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112448d(C112445a aVar) {
            super(1);
            this.f336701d = aVar;
        }

        public Object invoke(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            C107509b bVar = this.f336701d.f336688p;
            C87412m.m108591d(bVar);
            boolean z = false;
            bVar.f321642b.mo143170i(false);
            if (bitmap != null) {
                C112445a aVar = this.f336701d;
                if (aVar.f336685j != aVar.f336683h) {
                    C98607d dVar = aVar.f336689q;
                    C87412m.m108591d(dVar);
                    float b = (float) dVar.mo138048b();
                    boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_photo_align_long_side, true);
                    int i = C107835h0.f322852i.f322646B;
                    if (i != -1) {
                        if (i == 0) {
                            wf = false;
                        } else if (i == 1) {
                            wf = true;
                        }
                    }
                    if (wf) {
                        if (bitmap.getHeight() > bitmap.getWidth()) {
                            if (((float) bitmap.getHeight()) > 1920.0f) {
                                float height = 1920.0f / ((float) bitmap.getHeight());
                                bitmap = BitmapUtil.rotateAndScale(bitmap, b, height, height);
                            } else {
                                if (b == 0.0f) {
                                    z = true;
                                }
                                if (!z) {
                                    bitmap = BitmapUtil.rotate(bitmap, b);
                                }
                            }
                        } else if (((float) bitmap.getWidth()) > 1920.0f) {
                            float width = 1920.0f / ((float) bitmap.getWidth());
                            bitmap = BitmapUtil.rotateAndScale(bitmap, b, width, width);
                        } else {
                            if (b == 0.0f) {
                                z = true;
                            }
                            if (!z) {
                                bitmap = BitmapUtil.rotate(bitmap, b);
                            }
                        }
                    } else if (bitmap.getHeight() > bitmap.getWidth()) {
                        if (((float) bitmap.getWidth()) > 1080.0f) {
                            float width2 = 1080.0f / ((float) bitmap.getWidth());
                            bitmap = BitmapUtil.rotateAndScale(bitmap, b, width2, width2);
                        } else {
                            if (b == 0.0f) {
                                z = true;
                            }
                            if (!z) {
                                bitmap = BitmapUtil.rotate(bitmap, b);
                            }
                        }
                    } else if (((float) bitmap.getHeight()) > 1080.0f) {
                        float height2 = 1080.0f / ((float) bitmap.getHeight());
                        bitmap = BitmapUtil.rotateAndScale(bitmap, b, height2, height2);
                    } else {
                        if (b == 0.0f) {
                            z = true;
                        }
                        if (!z) {
                            bitmap = BitmapUtil.rotate(bitmap, b);
                        }
                    }
                    MMSightRecordView.C18937g gVar = this.f336701d.f336690r;
                    if (gVar != null) {
                        gVar.mo22143b(bitmap);
                    }
                } else {
                    MMSightRecordView.C18937g gVar2 = aVar.f336690r;
                    if (gVar2 != null) {
                        gVar2.mo22143b(bitmap);
                    }
                }
            } else {
                MMSightRecordView.C18937g gVar3 = this.f336701d.f336690r;
                if (gVar3 != null) {
                    gVar3.mo22142a();
                }
                int i2 = C112445a.f336678E;
                Log.m105920e("MicroMsg.AppBrandCameraPluginLayout", "record picture error cause null bitmap ");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: yg2.a$e */
    public static final class C112449e extends C87413o implements C32226l<C98324b, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C112445a f336702d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112449e(C112445a aVar) {
            super(1);
            this.f336702d = aVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C98324b) obj, LocaleUtil.ITALIAN);
            MMSightRecordView.C18938h hVar = this.f336702d.f336691s;
            if (hVar != null) {
                hVar.mo22144a(false);
            }
            C107509b bVar = this.f336702d.f336688p;
            if (bVar != null) {
                bVar.mo157932e();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112445a(Context context) {
        super(context, (AttributeSet) null);
        C87412m.m108594g(context, "context");
    }

    private final int getScreenRotation() {
        if (this.f336684i == null) {
            Object systemService = MMApplicationContext.getContext().getSystemService("window");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            this.f336684i = (WindowManager) systemService;
        }
        WindowManager windowManager = this.f336684i;
        if (windowManager == null) {
            return 0;
        }
        Integer num = null;
        Display defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
        if (defaultDisplay != null) {
            num = Integer.valueOf(defaultDisplay.getRotation());
        }
        if (num != null && num.intValue() == 0) {
            return 0;
        }
        if (num != null && num.intValue() == 1) {
            return 90;
        }
        if (num != null && num.intValue() == 2) {
            return 180;
        }
        return (num != null && num.intValue() == 3) ? 270 : 0;
    }

    /* renamed from: f */
    public void mo129834f(C109344g0 g0Var) {
        C87412m.m108594g(g0Var, "plugin");
    }

    public final int getCameraRotation() {
        C107509b bVar = this.f336688p;
        if (bVar != null) {
            return bVar.f321642b.mo143163c();
        }
        return 90;
    }

    public final Bitmap getCurrentFramePicture() {
        C8479f0 f0Var = new C8479f0();
        C107509b bVar = this.f336688p;
        C87412m.m108591d(bVar);
        bVar.mo157941o(new C102858a(this, f0Var));
        return (Bitmap) f0Var.f27484d;
    }

    public final float getDisplayRatio() {
        return this.f336682D;
    }

    public final Point getDrawSizePoint() {
        return this.f336680B;
    }

    public final int getFlashMode() {
        C107509b bVar = this.f336688p;
        if (bVar != null) {
            return bVar.f321642b.getFlashMode();
        }
        return 0;
    }

    public final Point getPictureSize() {
        C97875a aVar = this.f336687o;
        return new Point(0, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f321642b.mo143173l(false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Point getPreviewSize() {
        /*
            r2 = this;
            f90.b r0 = r2.f336688p
            if (r0 == 0) goto L_0x000d
            r1 = 0
            y80.g r0 = r0.f321642b
            android.graphics.Point r0 = r0.mo143173l(r1)
            if (r0 != 0) goto L_0x0012
        L_0x000d:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yg2.C112445a.getPreviewSize():android.graphics.Point");
    }

    public final float[] getSupportZoomRatios() {
        C107509b bVar = this.f336688p;
        if (bVar == null || bVar.f321652l != 0) {
            return null;
        }
        return bVar.f321642b.mo143175n();
    }

    public final Point getVideoSize() {
        C97875a aVar = this.f336687o;
        return new Point(0, 0);
    }

    /* renamed from: m */
    public final boolean mo164162m(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        if (this.f336696x != null) {
            int screenRotation = getScreenRotation();
            C104729f fVar = this.f336696x;
            if (fVar != null && (fVar.f311014j || fVar.f311007c != null)) {
                C104731g gVar = new C104731g(fVar, bArr, screenRotation);
                if (fVar.f311005a.isAlive()) {
                    fVar.f311006b.post(gVar);
                }
            }
        }
        if (this.f336692t == null) {
            return true;
        }
        Point previewSize = getPreviewSize();
        MMSightRecordView.C18932a aVar = this.f336692t;
        if (aVar == null) {
            return true;
        }
        aVar.mo22127a(bArr, previewSize.x, previewSize.y);
        return true;
    }

    /* renamed from: n */
    public final void mo164163n() {
        Point previewSize = getPreviewSize();
        Point point = this.f336680B;
        int i = this.f336681C;
        point.y = i;
        point.x = (previewSize.x * i) / previewSize.y;
        if (getScreenRotation() == 0 || getScreenRotation() == 180) {
            Point point2 = this.f336680B;
            int i2 = point2.y;
            point2.y = point2.x;
            point2.x = i2;
        }
        C104729f fVar = this.f336696x;
        if (fVar != null) {
            int i3 = previewSize.x;
            int i4 = previewSize.y;
            C107509b bVar = this.f336688p;
            int c = bVar != null ? bVar.f321642b.mo143163c() : 0;
            Point point3 = this.f336680B;
            int i5 = point3.x;
            int i6 = point3.y;
            Log.m105925i("MicroMsg.YUVDateRenderToRBGBufferThread", "setFrameInfo, width: %s, height: %s, rotate: %s ,targetWidth:%d ,targetHeight:%d , this: %s ", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(c), Integer.valueOf(i5), Integer.valueOf(i6), fVar);
            if (!(i3 == fVar.f311009e && i4 == fVar.f311010f && c == fVar.f311011g)) {
                fVar.f311009e = i3;
                fVar.f311010f = i4;
                fVar.f311011g = c;
            }
            fVar.f311012h = i5;
            fVar.f311013i = i6;
        }
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.AppBrandCameraPluginLayout", "onPause");
        C107509b bVar = this.f336688p;
        C87412m.m108591d(bVar);
        bVar.mo157937k();
        C98607d dVar = this.f336689q;
        C87412m.m108591d(dVar);
        dVar.disable();
    }

    public void onResume() {
        super.onResume();
        C98607d dVar = this.f336689q;
        C87412m.m108591d(dVar);
        dVar.enable();
        C107509b bVar = this.f336688p;
        if (bVar != null) {
            C112446b bVar2 = new C112446b(this);
            ((C112397a) bVar.f321642b).mo164111H(true);
            bVar.f321642b.mo143182t(new C107508a(bVar2));
        }
        C107509b bVar3 = this.f336688p;
        C87412m.m108591d(bVar3);
        C107509b.m145625i(bVar3, this.f336697y, (Float) null, new C112447c(this), 2, (Object) null);
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        MMSightRecordView.C18935d dVar;
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal != 0) {
            boolean z = true;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    boolean z2 = false;
                    if (bundle != null) {
                        z2 = bundle.getBoolean("PARAM_PREPARE_CAMERA_IGNORE_FLIP_CHECK_BOOLEAN", false);
                    }
                    C107509b bVar2 = this.f336688p;
                    C87412m.m108591d(bVar2);
                    bVar2.mo157939m(z2);
                    mo164163n();
                } else if (ordinal != 4) {
                    if (ordinal == 5) {
                        if (bundle != null) {
                            z = bundle.getBoolean("PARAM_RECORD_RESULT_MIRROR_BOOLEAN", true);
                        }
                        C107509b bVar3 = this.f336688p;
                        if (bVar3 != null) {
                            bVar3.f321659s = z;
                        }
                        C87412m.m108591d(bVar3);
                        C98607d dVar2 = this.f336689q;
                        C87412m.m108591d(dVar2);
                        boolean c = dVar2.mo138049c();
                        C98607d dVar3 = this.f336689q;
                        C87412m.m108591d(dVar3);
                        if (!bVar3.mo157936j(c, dVar3.mo138047a()) && (dVar = this.f336693u) != null) {
                            ((AppBrandCameraView.C17871c) dVar).mo22128a();
                        }
                    } else if (ordinal == 6) {
                        C107509b bVar4 = this.f336688p;
                        C87412m.m108591d(bVar4);
                        if (!bVar4.mo157938l(new C112449e(this))) {
                            MMSightRecordView.C18938h hVar = this.f336691s;
                            if (hVar != null) {
                                hVar.mo22144a(true);
                            }
                            C107509b bVar5 = this.f336688p;
                            if (bVar5 != null) {
                                bVar5.mo157932e();
                            }
                        }
                    } else if (ordinal == 14) {
                        C107509b bVar6 = this.f336688p;
                        C87412m.m108591d(bVar6);
                        bVar6.f321642b.mo143170i(this.f336698z);
                        C107509b bVar7 = this.f336688p;
                        C87412m.m108591d(bVar7);
                        bVar7.mo157941o(new C112448d(this));
                    }
                } else if (bundle != null) {
                    float f = bundle.getFloat("PARAM_POINT_X");
                    float f2 = bundle.getFloat("PARAM_POINT_Y");
                    C107509b bVar8 = this.f336688p;
                    C87412m.m108591d(bVar8);
                    CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView = this.f336686n;
                    C87412m.m108591d(cameraPreviewGLSurfaceView);
                    int width = cameraPreviewGLSurfaceView.getWidth();
                    CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView2 = this.f336686n;
                    C87412m.m108591d(cameraPreviewGLSurfaceView2);
                    bVar8.mo157930c(f, f2, width, cameraPreviewGLSurfaceView2.getHeight(), 400);
                }
            } else if (bundle != null) {
                C107509b bVar9 = this.f336688p;
                C87412m.m108591d(bVar9);
                bVar9.mo157942p(bundle.getBoolean("PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN", true), bundle.getBoolean("PARAM_PREPARE_CAMERA_ZOOM_SCROLL_BOOLEAN", true), bundle.getInt("PARAM_PREPARE_CAMERA_ZOOM_FACTOR_INT"));
            }
        } else if (bundle != null) {
            C107509b bVar10 = this.f336688p;
            C87412m.m108591d(bVar10);
            int i = bundle.getInt("PARAM_PREPARE_CAMERA_ZOOM_LOCATION_INT");
            if (bVar10.f321652l == 0) {
                bVar10.f321642b.mo143172k(i, 10);
            }
        }
    }

    public void release() {
        super.release();
        CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView = this.f336686n;
        if (cameraPreviewGLSurfaceView != null) {
            cameraPreviewGLSurfaceView.setOnTouchListener((View.OnTouchListener) null);
        }
        CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView2 = this.f336686n;
        if (cameraPreviewGLSurfaceView2 != null) {
            cameraPreviewGLSurfaceView2.release();
        }
        this.f336686n = null;
        C107509b bVar = this.f336688p;
        if (bVar != null) {
            bVar.mo157931d();
        }
        this.f336688p = null;
        C98607d dVar = this.f336689q;
        if (dVar != null) {
            dVar.f289116g = null;
        }
        if (dVar != null) {
            dVar.disable();
        }
        this.f336689q = null;
        this.f336687o = null;
    }

    public final void setDisplayRatio(float f) {
        this.f336682D = f;
    }

    public final void setFlashMode(int i) {
        C107509b bVar = this.f336688p;
        if (bVar != null) {
            bVar.f321642b.setFlashMode(i);
        }
    }

    public final void setForceZoomTargetRatio(float f) {
        C107509b bVar = this.f336688p;
        if (bVar != null && bVar.f321652l == 0) {
            bVar.f321642b.mo143166f(f);
        }
    }

    public final void setFrameDataCallback(MMSightRecordView.C18932a aVar) {
        this.f336692t = aVar;
    }

    public final void setInitDoneCallback(MMSightRecordView.C18934c cVar) {
        this.f336694v = cVar;
    }

    public final void setInitErrorCallback(MMSightRecordView.C18935d dVar) {
        this.f336693u = dVar;
    }

    public final void setPreviewMode(int i) {
        this.f336685j = i;
    }

    public final void setRGBSizeLimit(int i) {
        this.f336681C = i;
    }

    public final void setRecordCallback(MMSightRecordView.C18938h hVar) {
        this.f336691s = hVar;
    }

    public final void setTouchListener(C104727e.C104728a aVar) {
        C87412m.m108594g(aVar, "callback");
        C104727e eVar = new C104727e();
        this.f336695w = eVar;
        eVar.f311004g = aVar;
    }

    public final void setUseBackCamera(boolean z) {
        this.f336697y = z;
    }
}
