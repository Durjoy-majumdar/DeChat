package com.tencent.liteav.videoproducer.capture.p1098b;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.C104506j;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.base.util.C17118l;
import com.tencent.liteav.base.util.C17123s;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videoproducer.capture.C104529ae;
import com.tencent.liteav.videoproducer.capture.C104530af;
import com.tencent.liteav.videoproducer.capture.C17404ad;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k20.C9556a;

/* renamed from: com.tencent.liteav.videoproducer.capture.b.a */
public final class C104534a implements C17404ad {

    /* renamed from: b */
    private static final HashMap<String, CameraCharacteristics> f309856b = new HashMap<>();

    /* renamed from: c */
    private static boolean f309857c;

    /* renamed from: d */
    private static String f309858d = "";

    /* renamed from: e */
    private static String f309859e = "";

    /* renamed from: A */
    private final CameraDevice.StateCallback f309860A = new CameraDevice.StateCallback() {
        public final void onClosed(CameraDevice cameraDevice) {
            LiteavLog.m16901i("Camera2Controller", "CameraDevice onClosed");
        }

        public final void onDisconnected(CameraDevice cameraDevice) {
            LiteavLog.m16898e("Camera2Controller", "CameraDevice onDisconnected!");
            C104534a.this.m139883a(false, cameraDevice);
            C104534a.this.f309866g.mo19369a(C104540b.m139924a(C104534a.this));
        }

        public final void onError(CameraDevice cameraDevice, int i) {
            LiteavLog.m16898e("Camera2Controller", "CameraDevice onError, error:".concat(String.valueOf(i)));
            C104534a.this.m139883a(false, cameraDevice);
        }

        public final void onOpened(CameraDevice cameraDevice) {
            LiteavLog.m16901i("Camera2Controller", "CameraDevice onOpen!");
            C104534a.this.m139883a(true, cameraDevice);
        }
    };

    /* renamed from: B */
    private final CameraCaptureSession.StateCallback f309861B = new CameraCaptureSession.StateCallback() {
        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            LiteavLog.m16898e("Camera2Controller", "CameraCaptureSession onConfigureFailed!");
            C104534a.this.m139882a(false, cameraCaptureSession);
        }

        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            LiteavLog.m16901i("Camera2Controller", "CameraCaptureSession onConfigured!");
            C104534a.this.m139882a(true, cameraCaptureSession);
        }
    };

    /* renamed from: C */
    private final CameraManager.AvailabilityCallback f309862C = new CameraManager.AvailabilityCallback() {
        public final void onCameraAccessPrioritiesChanged() {
            super.onCameraAccessPrioritiesChanged();
        }

        public final void onCameraAvailable(String str) {
            super.onCameraAvailable(str);
            LiteavLog.m16901i("Camera2Controller", "onCameraAvailable: ".concat(String.valueOf(str)));
            if (!C104534a.this.m139903o() && C104534a.m139889d(C104534a.this.f309876q).equals(str) && C104534a.this.f309867h.get()) {
                LiteavLog.m16905w("Camera2Controller", "Current camera is available, it could be interrupted by system app.");
                C104534a aVar = C104534a.this;
                aVar.m139883a(false, (CameraDevice) aVar.f309868i.get());
                C104534a.this.f309866g.mo19369a(C104540b.m139924a(C104534a.this));
            }
        }

        public final void onCameraUnavailable(String str) {
            super.onCameraUnavailable(str);
            LiteavLog.m16901i("Camera2Controller", "onCameraUnavailable: ".concat(String.valueOf(str)));
        }
    };

    /* renamed from: D */
    private final CameraCaptureSession.CaptureCallback f309863D = new CameraCaptureSession.CaptureCallback() {
        /* renamed from: a */
        private static boolean m139923a(CaptureRequest captureRequest) {
            return (captureRequest.getTag() instanceof C104534a) && !((C104534a) captureRequest.getTag()).f309864a;
        }

        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            C104534a.this.f309866g.mo19369a(C104542d.m139926a(this, totalCaptureResult, cameraCaptureSession, captureRequest));
        }

        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            LiteavLog.m16898e("Camera2Controller", "onCaptureFailed failure reason:" + captureFailure.getReason());
            C104534a.this.f309866g.mo19369a(C104543e.m139927a(this, captureRequest, cameraCaptureSession));
        }

        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        }

        /* renamed from: a */
        private void m139920a(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, boolean z) {
            if (!C104534a.this.m139903o()) {
                boolean unused = C104534a.this.f309881v = false;
                try {
                    C104534a.this.f309872m.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                    C104534a.this.f309872m.set(CaptureRequest.CONTROL_AF_MODE, 3);
                    cameraCaptureSession.setRepeatingRequest(captureRequest, (CameraCaptureSession.CaptureCallback) null, (Handler) null);
                    if (captureRequest.getTag() instanceof C104534a) {
                        C104534a.m139879a((C104534a) captureRequest.getTag(), z);
                    }
                } catch (Exception e) {
                    LiteavLog.m16898e("Camera2Controller", "mAfCaptureCallback exception:".concat(String.valueOf(e)));
                }
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m139921a(C1045384 r1, CaptureRequest captureRequest, CameraCaptureSession cameraCaptureSession) {
            if (!m139923a(captureRequest)) {
                boolean unused = C104534a.this.f309881v = false;
            } else {
                r1.m139920a(cameraCaptureSession, captureRequest, false);
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m139922a(C1045384 r2, TotalCaptureResult totalCaptureResult, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest) {
            if (!m139923a(captureRequest)) {
                boolean unused = C104534a.this.f309881v = false;
                return;
            }
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num == null) {
                LiteavLog.m16898e("Camera2Controller", "handleCaptureCompleted get afState fail");
                r2.m139920a(cameraCaptureSession, captureRequest, false);
            } else if (4 == num.intValue() || 5 == num.intValue()) {
                r2.m139920a(cameraCaptureSession, captureRequest, true);
            }
        }
    };

    /* renamed from: a */
    public boolean f309864a = false;

    /* renamed from: f */
    private final Handler f309865f = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C17118l f309866g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final AtomicBoolean f309867h = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final AtomicReference<CameraDevice> f309868i = new AtomicReference<>();

    /* renamed from: j */
    private final AtomicBoolean f309869j = new AtomicBoolean(false);

    /* renamed from: k */
    private final AtomicReference<CameraCaptureSession> f309870k = new AtomicReference<>();

    /* renamed from: l */
    private CaptureRequest f309871l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public CaptureRequest.Builder f309872m;

    /* renamed from: n */
    private C104507p f309873n;

    /* renamed from: o */
    private Rotation f309874o = Rotation.NORMAL;

    /* renamed from: p */
    private SurfaceTexture f309875p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f309876q = true;

    /* renamed from: r */
    private boolean f309877r = true;

    /* renamed from: s */
    private boolean f309878s = true;

    /* renamed from: t */
    private int f309879t = -1;

    /* renamed from: u */
    private C104539a f309880u = C104539a.IDLE;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f309881v = false;

    /* renamed from: w */
    private CountDownLatch f309882w;

    /* renamed from: x */
    private CountDownLatch f309883x;

    /* renamed from: y */
    private C104529ae f309884y;

    /* renamed from: z */
    private float f309885z = 0.0f;

    /* renamed from: com.tencent.liteav.videoproducer.capture.b.a$a */
    public enum C104539a {
        IDLE,
        PREVIEWING
    }

    public C104534a(C17118l lVar) {
        this.f309866g = lVar;
    }

    /* renamed from: j */
    private void m139898j() {
        CameraCaptureSession andSet = this.f309870k.getAndSet((Object) null);
        if (andSet != null) {
            andSet.close();
        }
    }

    /* renamed from: k */
    private void m139899k() {
        CameraDevice andSet = this.f309868i.getAndSet((Object) null);
        if (andSet != null) {
            andSet.close();
        }
        ((CameraManager) ContextUtils.getApplicationContext().getSystemService("camera")).unregisterAvailabilityCallback(this.f309862C);
    }

    /* renamed from: l */
    private void m139900l() {
        CaptureRequest.Builder builder;
        CameraCaptureSession cameraCaptureSession = this.f309870k.get();
        if (cameraCaptureSession != null && (builder = this.f309872m) != null) {
            try {
                cameraCaptureSession.setRepeatingRequest(builder.build(), (CameraCaptureSession.CaptureCallback) null, (Handler) null);
            } catch (Exception e) {
                LiteavLog.m16898e("Camera2Controller", "updatePreview exception:".concat(String.valueOf(e)));
            }
        }
    }

    /* renamed from: m */
    private List<C104507p> m139901m() {
        if (m139896i() == null) {
            LiteavLog.m16898e("Camera2Controller", "getPreviewSizes error, Characteristics is null");
            return null;
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) m139896i().get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            LiteavLog.m16898e("Camera2Controller", "getPreviewSizes map null");
            return null;
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        if (outputSizes == null) {
            LiteavLog.m16898e("Camera2Controller", "getPreviewSizes choices is null");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new C104507p(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    /* renamed from: n */
    private List<int[]> m139902n() {
        if (m139896i() == null) {
            LiteavLog.m16900e("Camera2Controller", "getPreviewFps error, Characteristics: ", m139896i());
            return null;
        }
        Range[] rangeArr = (Range[]) m139896i().get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        ArrayList arrayList = new ArrayList();
        if (rangeArr != null) {
            for (Range range : rangeArr) {
                arrayList.add(new int[]{((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue()});
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public boolean m139903o() {
        return m139896i() == null || this.f309872m == null || this.f309880u != C104539a.PREVIEWING;
    }

    /* renamed from: a */
    public final void mo20549a(ServerVideoProducerConfig serverVideoProducerConfig) {
    }

    /* renamed from: b */
    public final void mo20554b(float f) {
        if (m139903o()) {
            LiteavLog.m16898e("Camera2Controller", "setExposureCompensation fail, value:" + f + " mCameraStatus:" + this.f309880u);
            return;
        }
        Range range = (Range) m139896i().get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        int intValue = ((Integer) range.getLower()).intValue();
        int intValue2 = ((Integer) range.getUpper()).intValue();
        if (intValue == 0 && intValue2 == 0) {
            LiteavLog.m16901i("Camera2Controller", "camera doesn't support exposure compensation");
            return;
        }
        this.f309872m.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(C104506j.m139787a(((int) ((((float) (intValue2 - intValue)) * (C104506j.m139786a(f, -1.0f, 1.0f) - -1.0f)) / 2.0f)) + intValue, intValue, intValue2)));
        m139900l();
    }

    /* renamed from: c */
    public final int mo20556c() {
        return 100;
    }

    /* renamed from: i */
    private CameraCharacteristics m139896i() {
        String d = m139889d(this.f309876q);
        if (!TextUtils.isEmpty(d)) {
            return f309856b.get(d);
        }
        return null;
    }

    /* renamed from: d */
    public final C104507p mo20557d() {
        return this.f309873n;
    }

    /* renamed from: e */
    public final boolean mo20558e() {
        return m139896i() != null && ((Float) m139896i().get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue() > 0.0f;
    }

    /* renamed from: f */
    public final boolean mo20559f() {
        return m139896i() != null && ((Boolean) m139896i().get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo20560g() {
        return m139896i() != null && ((Integer) m139896i().get(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT)).intValue() > 0;
    }

    /* renamed from: h */
    public final boolean mo20561h() {
        return m139896i() != null && ((Integer) m139896i().get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static String m139889d(boolean z) {
        return z ? !TextUtils.isEmpty(f309859e) ? f309859e : f309858d : !TextUtils.isEmpty(f309858d) ? f309858d : f309859e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0113  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo20552a(com.tencent.liteav.videoproducer.capture.CameraCaptureParams r13, android.graphics.SurfaceTexture r14, com.tencent.liteav.videoproducer.capture.C104529ae r15) {
        /*
            r12 = this;
            java.lang.String r0 = "1"
            r12.f309884y = r15
            boolean r15 = f309857c
            java.lang.String r1 = "camera"
            r2 = 1
            r3 = 0
            java.lang.String r4 = "Camera2Controller"
            if (r15 != 0) goto L_0x008e
            android.content.Context r15 = com.tencent.liteav.base.ContextUtils.getApplicationContext()     // Catch:{ Exception -> 0x007c }
            java.lang.Object r15 = r15.getSystemService(r1)     // Catch:{ Exception -> 0x007c }
            android.hardware.camera2.CameraManager r15 = (android.hardware.camera2.CameraManager) r15     // Catch:{ Exception -> 0x007c }
            java.lang.String[] r5 = r15.getCameraIdList()     // Catch:{ Exception -> 0x007c }
            int r6 = r5.length     // Catch:{ Exception -> 0x007c }
            r7 = 0
        L_0x001e:
            if (r7 >= r6) goto L_0x005e
            r8 = r5[r7]     // Catch:{ Exception -> 0x007c }
            android.hardware.camera2.CameraCharacteristics r9 = r15.getCameraCharacteristics(r8)     // Catch:{ Exception -> 0x007c }
            android.hardware.camera2.CameraCharacteristics$Key r10 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch:{ Exception -> 0x007c }
            java.lang.Object r10 = r9.get(r10)     // Catch:{ Exception -> 0x007c }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ Exception -> 0x007c }
            if (r10 == 0) goto L_0x0044
            int r11 = r10.intValue()     // Catch:{ Exception -> 0x007c }
            if (r11 != 0) goto L_0x0044
            boolean r11 = r0.equals(r8)     // Catch:{ Exception -> 0x007c }
            if (r11 == 0) goto L_0x0044
            java.util.HashMap<java.lang.String, android.hardware.camera2.CameraCharacteristics> r10 = f309856b     // Catch:{ Exception -> 0x007c }
            r10.put(r8, r9)     // Catch:{ Exception -> 0x007c }
            f309859e = r8     // Catch:{ Exception -> 0x007c }
            goto L_0x005b
        L_0x0044:
            if (r10 == 0) goto L_0x005b
            int r10 = r10.intValue()     // Catch:{ Exception -> 0x007c }
            if (r10 != r2) goto L_0x005b
            java.lang.String r10 = "0"
            boolean r10 = r10.equals(r8)     // Catch:{ Exception -> 0x007c }
            if (r10 == 0) goto L_0x005b
            java.util.HashMap<java.lang.String, android.hardware.camera2.CameraCharacteristics> r10 = f309856b     // Catch:{ Exception -> 0x007c }
            r10.put(r8, r9)     // Catch:{ Exception -> 0x007c }
            f309858d = r8     // Catch:{ Exception -> 0x007c }
        L_0x005b:
            int r7 = r7 + 1
            goto L_0x001e
        L_0x005e:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007c }
            java.lang.String r5 = "initCamera2Ability front:"
            r15.<init>(r5)     // Catch:{ Exception -> 0x007c }
            java.lang.String r5 = f309859e     // Catch:{ Exception -> 0x007c }
            r15.append(r5)     // Catch:{ Exception -> 0x007c }
            java.lang.String r5 = ", back:"
            r15.append(r5)     // Catch:{ Exception -> 0x007c }
            java.lang.String r5 = f309858d     // Catch:{ Exception -> 0x007c }
            r15.append(r5)     // Catch:{ Exception -> 0x007c }
            java.lang.String r15 = r15.toString()     // Catch:{ Exception -> 0x007c }
            com.tencent.liteav.base.util.LiteavLog.m16901i(r4, r15)     // Catch:{ Exception -> 0x007c }
            goto L_0x008c
        L_0x007c:
            r15 = move-exception
            f309859e = r0
            java.lang.String r15 = java.lang.String.valueOf(r15)
            java.lang.String r0 = "initCamera2Ability exception!"
            java.lang.String r15 = r0.concat(r15)
            com.tencent.liteav.base.util.LiteavLog.m16898e(r4, r15)
        L_0x008c:
            f309857c = r2
        L_0x008e:
            if (r13 == 0) goto L_0x015b
            if (r14 != 0) goto L_0x0094
            goto L_0x015b
        L_0x0094:
            com.tencent.liteav.videoproducer.capture.b.a$a r15 = r12.f309880u
            com.tencent.liteav.videoproducer.capture.b.a$a r0 = com.tencent.liteav.videoproducer.capture.p1098b.C104534a.C104539a.IDLE
            if (r15 == r0) goto L_0x00a0
            java.lang.String r13 = "it's capturing, you should Stop first."
            com.tencent.liteav.base.util.LiteavLog.m16898e(r4, r13)
            return r3
        L_0x00a0:
            r12.f309875p = r14
            java.lang.Boolean r15 = r13.f47179a
            boolean r15 = r15.booleanValue()
            r12.f309876q = r15
            android.hardware.camera2.CameraCharacteristics r15 = r12.m139896i()
            if (r15 != 0) goto L_0x00b2
        L_0x00b0:
            r15 = 0
            goto L_0x00eb
        L_0x00b2:
            android.hardware.camera2.CameraCharacteristics r15 = r12.m139896i()
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES
            java.lang.Object r15 = r15.get(r5)
            int[] r15 = (int[]) r15
            int r5 = r15.length
            if (r5 == 0) goto L_0x00cb
            int r5 = r15.length
            if (r5 != r2) goto L_0x00c9
            r15 = r15[r3]
            if (r15 != 0) goto L_0x00c9
            goto L_0x00cb
        L_0x00c9:
            r15 = 1
            goto L_0x00eb
        L_0x00cb:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r5 = "Current "
            r15.<init>(r5)
            boolean r5 = r12.f309876q
            if (r5 == 0) goto L_0x00d9
            java.lang.String r5 = "front camera "
            goto L_0x00db
        L_0x00d9:
            java.lang.String r5 = "back camera "
        L_0x00db:
            r15.append(r5)
            java.lang.String r5 = " is not support auto focus."
            r15.append(r5)
            java.lang.String r15 = r15.toString()
            com.tencent.liteav.base.util.LiteavLog.m16905w(r4, r15)
            goto L_0x00b0
        L_0x00eb:
            r12.f309878s = r15
            android.content.Context r15 = com.tencent.liteav.base.ContextUtils.getApplicationContext()
            java.lang.Object r15 = r15.getSystemService(r1)
            android.hardware.camera2.CameraManager r15 = (android.hardware.camera2.CameraManager) r15
            android.hardware.camera2.CameraManager$AvailabilityCallback r1 = r12.f309862C
            android.os.Handler r5 = r12.f309865f
            r15.registerAvailabilityCallback(r1, r5)
            int r15 = r13.f47184c
            int r1 = r13.f47185d
            boolean r15 = r12.m139886b(r15, r1)
            if (r15 != 0) goto L_0x0113
            java.lang.String r13 = "openCamera failed."
            com.tencent.liteav.base.util.LiteavLog.m16898e(r4, r13)
            r12.m139899k()
            r12.f309880u = r0
            return r3
        L_0x0113:
            boolean r14 = r12.m139884a((android.graphics.SurfaceTexture) r14)
            if (r14 != 0) goto L_0x0124
            java.lang.String r13 = "startPreview failed."
            com.tencent.liteav.base.util.LiteavLog.m16898e(r4, r13)
            r12.m139898j()
            r12.f309880u = r0
            return r3
        L_0x0124:
            android.hardware.camera2.CaptureRequest$Builder r14 = r12.f309872m
            android.hardware.camera2.CaptureRequest$Key r15 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r14.set(r15, r0)
            int r13 = r13.f47183b
            android.util.Range r13 = r12.m139877a((int) r13)
            android.hardware.camera2.CaptureRequest$Builder r14 = r12.f309872m
            android.hardware.camera2.CaptureRequest$Key r15 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
            r14.set(r15, r13)
            boolean r13 = r12.f309877r
            r12.m139892e((boolean) r13)
            float r13 = r12.f309885z
            r12.mo20547a((float) r13)
            android.hardware.camera2.CaptureRequest$Builder r13 = r12.f309872m
            android.hardware.camera2.CaptureRequest r13 = r13.build()
            r12.f309871l = r13
            r12.m139900l()
            com.tencent.liteav.videoproducer.capture.b.a$a r13 = com.tencent.liteav.videoproducer.capture.p1098b.C104534a.C104539a.PREVIEWING
            r12.f309880u = r13
            java.lang.String r13 = "startCaptureInternal ok."
            com.tencent.liteav.base.util.LiteavLog.m16901i(r4, r13)
            return r2
        L_0x015b:
            java.lang.String r13 = "captureParams or surfaceTexture is null"
            com.tencent.liteav.base.util.LiteavLog.m16898e(r4, r13)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.capture.p1098b.C104534a.mo20552a(com.tencent.liteav.videoproducer.capture.CameraCaptureParams, android.graphics.SurfaceTexture, com.tencent.liteav.videoproducer.capture.ae):boolean");
    }

    /* renamed from: e */
    private void m139892e(boolean z) {
        CaptureRequest.Builder builder = this.f309872m;
        if (builder != null) {
            int i = z ? 1 : 3;
            builder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(i));
            LiteavLog.m16901i("Camera2Controller", "setFocusMode to ".concat(String.valueOf(i)));
        }
    }

    /* renamed from: b */
    public final Rotation mo20553b() {
        return this.f309874o;
    }

    /* renamed from: b */
    public final void mo20555b(boolean z) {
        this.f309877r = z;
        m139892e(z);
    }

    /* renamed from: b */
    private boolean m139886b(int i, int i2) {
        String d = m139889d(this.f309876q);
        if (m139896i() == null) {
            LiteavLog.m16898e("Camera2Controller", "openCamera fail getCameraCharacteristics null");
            return false;
        }
        this.f309874o = Rotation.m139836a(((Integer) m139896i().get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue());
        this.f309873n = C104530af.m139869a(m139901m(), this.f309874o, i, i2);
        StringBuilder sb = new StringBuilder("openCamera ");
        sb.append(this.f309876q ? "front camera" : "back camera");
        sb.append(" mPreviewSize ");
        sb.append(this.f309873n);
        sb.append(" mCameraRotation ");
        sb.append(this.f309874o);
        sb.append(" mIsCameraSupportAutoFocus ");
        sb.append(this.f309878s);
        LiteavLog.m16901i("Camera2Controller", sb.toString());
        try {
            this.f309882w = new CountDownLatch(1);
            CameraDevice.StateCallback stateCallback = this.f309860A;
            Handler handler = this.f309865f;
            C9556a aVar = new C9556a();
            aVar.mo10233c(handler);
            aVar.mo10233c(stateCallback);
            aVar.mo10233c(d);
            C117292a.m165364j((CameraManager) ContextUtils.getApplicationContext().getSystemService("camera"), aVar.mo10232b(), "com/tencent/liteav/videoproducer/capture/b/a", "b", "(II)Z", "android/hardware/camera2/CameraManager", "openCamera", "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V");
            this.f309882w.await();
        } catch (Exception e) {
            LiteavLog.m16898e("Camera2Controller", "openCamera exception:".concat(String.valueOf(e)));
            m139883a(false, (CameraDevice) null);
        }
        return this.f309867h.get();
    }

    /* renamed from: a */
    public final void mo20548a(int i, int i2) {
        CameraCaptureSession cameraCaptureSession;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        int i3 = i;
        int i4 = i2;
        if (this.f309877r && this.f309878s) {
            if (m139903o() || this.f309881v) {
                LiteavLog.m16898e("Camera2Controller", "autoFocus not preview, mCameraStatus:" + this.f309880u + " mIsAutoFocusing:" + this.f309881v);
                return;
            }
            CameraCaptureSession cameraCaptureSession2 = this.f309870k.get();
            if (cameraCaptureSession2 == null) {
                LiteavLog.m16898e("Camera2Controller", "CameraCaptureSession get fail");
                return;
            }
            if (i3 >= 0) {
                C104507p pVar = this.f309873n;
                if (i3 < pVar.f309736a && i4 >= 0 && i4 < pVar.f309737b) {
                    LiteavLog.m16902i("Camera2Controller", "Start auto focus at (%d, %d)", Integer.valueOf(i), Integer.valueOf(i2));
                    double d6 = (double) i3;
                    double d7 = (double) i4;
                    C104507p pVar2 = this.f309873n;
                    int i5 = pVar2.f309736a;
                    int i6 = pVar2.f309737b;
                    Rotation rotation = this.f309874o;
                    Rotation rotation2 = Rotation.ROTATION_90;
                    if (!(rotation == rotation2 || rotation == Rotation.ROTATION_270)) {
                        int i7 = i5;
                        i5 = i6;
                        i6 = i7;
                    }
                    C104507p a = C17123s.m16934a(ContextUtils.getApplicationContext());
                    int i8 = a.f309736a;
                    int i9 = i5 * i8;
                    int i15 = a.f309737b;
                    double d8 = 0.0d;
                    if (i9 > i6 * i15) {
                        d = (((double) i8) * 1.0d) / ((double) i6);
                        cameraCaptureSession = cameraCaptureSession2;
                        d3 = (((double) i5) - (((double) i15) / d)) / 2.0d;
                        d2 = 0.0d;
                    } else {
                        cameraCaptureSession = cameraCaptureSession2;
                        double d9 = (((double) i15) * 1.0d) / ((double) i5);
                        d2 = (((double) i6) - (((double) i8) / d9)) / 2.0d;
                        d = d9;
                        d3 = 0.0d;
                    }
                    double d15 = (d6 / d) + d2;
                    double d16 = (d7 / d) + d3;
                    Rotation rotation3 = this.f309874o;
                    if (rotation3 == rotation2) {
                        double d17 = ((double) this.f309873n.f309737b) - d15;
                        d15 = d16;
                        d16 = d17;
                    } else if (rotation3 == Rotation.ROTATION_270) {
                        double d18 = ((double) this.f309873n.f309736a) - d16;
                        d16 = d15;
                        d15 = d18;
                    }
                    Rect rect = (Rect) this.f309871l.get(CaptureRequest.SCALER_CROP_REGION);
                    if (rect == null) {
                        LiteavLog.m16898e("Camera2Controller", "getMeteringRect can't get crop region");
                        rect = (Rect) m139896i().get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                    }
                    int width = rect.width();
                    int height = rect.height();
                    C104507p pVar3 = this.f309873n;
                    int i16 = pVar3.f309737b;
                    int i17 = i16 * width;
                    int i18 = pVar3.f309736a;
                    if (i17 > i18 * height) {
                        d4 = (((double) height) * 1.0d) / ((double) i16);
                        double d19 = (((double) width) - (((double) i18) * d4)) / 2.0d;
                        d5 = 0.0d;
                        d8 = d19;
                    } else {
                        d4 = (((double) width) * 1.0d) / ((double) i18);
                        d5 = (((double) height) - (((double) i16) * d4)) / 2.0d;
                    }
                    double d25 = (d15 * d4) + d8 + ((double) rect.left);
                    double d26 = (d16 * d4) + d5 + ((double) rect.top);
                    Rect rect2 = new Rect();
                    rect2.left = C104506j.m139787a((int) (d25 - (((double) rect.width()) * 0.05d)), 0, rect.width());
                    rect2.right = C104506j.m139787a((int) (d25 + (((double) rect.width()) * 0.05d)), 0, rect.width());
                    rect2.top = C104506j.m139787a((int) (d26 - (((double) rect.height()) * 0.05d)), 0, rect.height());
                    rect2.bottom = C104506j.m139787a((int) (d26 + (((double) rect.height()) * 0.05d)), 0, rect.height());
                    try {
                        this.f309872m.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect2, 1000)});
                        this.f309872m.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect2, 1000)});
                        this.f309872m.set(CaptureRequest.CONTROL_AF_MODE, 1);
                        this.f309872m.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                        this.f309872m.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                        this.f309881v = true;
                        this.f309864a = false;
                        this.f309872m.setTag(this);
                        cameraCaptureSession.setRepeatingRequest(this.f309872m.build(), this.f309863D, this.f309865f);
                        return;
                    } catch (Exception e) {
                        LiteavLog.m16898e("Camera2Controller", "startAutoFocusAtPosition exception:".concat(String.valueOf(e)));
                        return;
                    }
                }
            }
            LiteavLog.m16906w("Camera2Controller", "Start auto focus at (%d, %d) invalid ", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* renamed from: a */
    public final void mo20547a(float f) {
        this.f309885z = f;
        CaptureRequest.Builder builder = this.f309872m;
        if (builder == null) {
            LiteavLog.m16898e("Camera2Controller", "setZoom fail, scale:" + f + " mPreviewBuilder is null.");
            return;
        }
        CaptureRequest.Key key = CaptureRequest.SCALER_CROP_REGION;
        Rect rect = (Rect) m139896i().get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        float floatValue = ((Float) m139896i().get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        float f2 = floatValue - 1.0f;
        float a = (C104506j.m139786a(f, 0.0f, 1.0f) * f2) + 1.0f;
        int height = (int) (((float) rect.height()) / floatValue);
        int width = rect.width() - ((int) (((float) rect.width()) / floatValue));
        int height2 = rect.height() - height;
        float f3 = a - 1.0f;
        int i = (int) (((((float) width) * f3) / f2) / 2.0f);
        int i2 = (int) (((((float) height2) * f3) / f2) / 2.0f);
        Rect rect2 = new Rect(i, i2, rect.width() - i, rect.height() - i2);
        LiteavLog.m16901i("Camera2Controller", "calculateZoomRect calculatedZoomLevel:" + a + " rect:" + rect + " newRect2:" + rect2);
        builder.set(key, rect2);
        m139900l();
    }

    /* renamed from: a */
    public final void mo20550a(boolean z) {
        if (m139903o()) {
            LiteavLog.m16898e("Camera2Controller", "turnOnTorch error mCameraStatus:" + this.f309880u);
            return;
        }
        boolean z2 = true;
        if (z && this.f309879t != 2) {
            this.f309879t = 2;
        } else if (!z) {
            this.f309879t = 0;
        } else {
            z2 = false;
        }
        LiteavLog.m16901i("Camera2Controller", "turnOnTorch:" + z + ", mode:" + this.f309879t + ", updateView:" + z2);
        if (z2) {
            this.f309872m.set(CaptureRequest.FLASH_MODE, Integer.valueOf(this.f309879t));
            m139900l();
        }
    }

    /* renamed from: a */
    public final boolean mo20551a(int i, int i2, boolean z) {
        C104507p a = C104530af.m139869a(m139901m(), this.f309874o, i, i2);
        boolean z2 = false;
        boolean z3 = a.mo147178b() <= this.f309873n.mo147178b();
        if (!z || Math.abs(a.mo147179c() - this.f309873n.mo147179c()) <= 0.001d) {
            z2 = z3;
        }
        LiteavLog.m16901i("Camera2Controller", "isCurrentPreviewSizeAspectRatioMatch:".concat(String.valueOf(z2)));
        return z2;
    }

    /* renamed from: a */
    public static /* synthetic */ void m139878a(C104534a aVar) {
        if (aVar.m139903o()) {
            LiteavLog.m16898e("Camera2Controller", "onCameraError, but camera is invalid, do not send camera error.");
            return;
        }
        C104529ae aeVar = aVar.f309884y;
        if (aeVar != null) {
            aeVar.onCameraError(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m139883a(boolean z, CameraDevice cameraDevice) {
        CountDownLatch countDownLatch = this.f309882w;
        this.f309867h.set(z);
        this.f309868i.set(cameraDevice);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m139882a(boolean z, CameraCaptureSession cameraCaptureSession) {
        CountDownLatch countDownLatch = this.f309883x;
        this.f309869j.set(z);
        this.f309870k.set(cameraCaptureSession);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    /* renamed from: a */
    private boolean m139884a(SurfaceTexture surfaceTexture) {
        try {
            CameraDevice cameraDevice = this.f309868i.get();
            if (cameraDevice == null || surfaceTexture == null) {
                throw new IOException("startPreview cameraDevice null!");
            }
            m139898j();
            SurfaceTexture surfaceTexture2 = this.f309875p;
            C104507p pVar = this.f309873n;
            surfaceTexture2.setDefaultBufferSize(pVar.f309736a, pVar.f309737b);
            Surface surface = new Surface(this.f309875p);
            CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(3);
            this.f309872m = createCaptureRequest;
            createCaptureRequest.addTarget(surface);
            List singletonList = Collections.singletonList(surface);
            this.f309883x = new CountDownLatch(1);
            cameraDevice.createCaptureSession(singletonList, this.f309861B, this.f309865f);
            this.f309883x.await();
            return this.f309869j.get();
        } catch (Exception e) {
            LiteavLog.m16899e("Camera2Controller", "startPreview exception", (Throwable) e);
            m139882a(false, (CameraCaptureSession) null);
        }
    }

    /* renamed from: a */
    private Range<Integer> m139877a(int i) {
        LiteavLog.m16901i("Camera2Controller", "preferred fps: ".concat(String.valueOf(i)));
        Range<Integer> range = new Range<>(Integer.valueOf(i), Integer.valueOf(i));
        List<int[]> n = m139902n();
        if (n == null || n.isEmpty()) {
            return range;
        }
        Collections.sort(n, C104541c.m139925a());
        int[] iArr = null;
        Iterator<int[]> it = n.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int[] next = it.next();
            if (next[0] <= i && i <= next[1]) {
                iArr = next;
                break;
            }
        }
        return (iArr == null || iArr.length < 2) ? range : new Range<>(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
    }

    /* renamed from: a */
    public static /* synthetic */ int m139876a(int[] iArr, int[] iArr2) {
        return iArr[1] - iArr2[1];
    }

    /* renamed from: a */
    public final void mo20546a() {
        CountDownLatch countDownLatch = this.f309882w;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        this.f309882w = null;
        CountDownLatch countDownLatch2 = this.f309883x;
        if (countDownLatch2 != null) {
            countDownLatch2.countDown();
        }
        this.f309883x = null;
        m139898j();
        m139899k();
        this.f309871l = null;
        this.f309864a = false;
        this.f309875p = null;
        this.f309879t = -1;
        this.f309880u = C104539a.IDLE;
        LiteavLog.m16901i("Camera2Controller", "stopCapture success");
    }

    /* renamed from: a */
    public static /* synthetic */ void m139879a(C104534a aVar, boolean z) {
        LiteavLog.m16901i("Camera2Controller", "onFocusCallback success:".concat(String.valueOf(z)));
        aVar.f309864a = true;
    }
}
