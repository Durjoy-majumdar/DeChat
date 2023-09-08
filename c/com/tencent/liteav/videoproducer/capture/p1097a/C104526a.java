package com.tencent.liteav.videoproducer.capture.p1097a;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.tencent.liteav.base.p1095a.C104503a;
import com.tencent.liteav.base.util.C104506j;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videoproducer.capture.C104529ae;
import com.tencent.liteav.videoproducer.capture.C104530af;
import com.tencent.liteav.videoproducer.capture.C17404ad;
import com.tencent.liteav.videoproducer.capture.CameraCaptureParams;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.wxmm.v2helper;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.liteav.videoproducer.capture.a.a */
public final class C104526a implements Camera.ErrorCallback, C17404ad {

    /* renamed from: a */
    private boolean f309824a = true;

    /* renamed from: b */
    private Camera f309825b;

    /* renamed from: c */
    private Rotation f309826c = Rotation.NORMAL;

    /* renamed from: d */
    private SurfaceTexture f309827d;

    /* renamed from: e */
    private C104507p f309828e;

    /* renamed from: f */
    private boolean f309829f;

    /* renamed from: g */
    private boolean f309830g;

    /* renamed from: h */
    private boolean f309831h = true;

    /* renamed from: i */
    private int f309832i = 0;

    /* renamed from: j */
    private C104529ae f309833j;

    /* renamed from: k */
    private boolean f309834k = false;

    /* renamed from: l */
    private float f309835l;

    /* renamed from: m */
    private boolean f309836m = false;

    /* renamed from: n */
    private float f309837n = 0.0f;

    /* renamed from: o */
    private ServerVideoProducerConfig f309838o = null;

    /* renamed from: p */
    private final Camera.AutoFocusCallback f309839p = C104527b.m139867a();

    /* renamed from: i */
    private Camera.Parameters m139850i() {
        try {
            Camera camera = this.f309825b;
            if (camera != null) {
                return camera.getParameters();
            }
            return null;
        } catch (Exception e) {
            LiteavLog.m16899e("CameraController", "getCameraParameters failed.", (Throwable) e);
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo20552a(CameraCaptureParams cameraCaptureParams, SurfaceTexture surfaceTexture, C104529ae aeVar) {
        CameraCaptureParams cameraCaptureParams2 = cameraCaptureParams;
        SurfaceTexture surfaceTexture2 = surfaceTexture;
        this.f309833j = aeVar;
        if (cameraCaptureParams2 == null || surfaceTexture2 == null) {
            throw new IOException("captureParams or surfaceTexture is null");
        }
        try {
            if (this.f309825b != null) {
                LiteavLog.m16898e("CameraController", "it's capturing, you should Stop first.");
                return false;
            }
            this.f309827d = surfaceTexture2;
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            int a = m139843a(cameraCaptureParams2.f47179a.booleanValue(), cameraInfo);
            this.f309824a = cameraCaptureParams2.f47179a.booleanValue();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(a));
            this.f309825b = (Camera) C117292a.m165364j(new Object(), aVar.mo10232b(), "com/tencent/liteav/videoproducer/capture/a/a", "a", "(Lcom/tencent/liteav/videoproducer/capture/CameraCaptureParams;Landroid/graphics/SurfaceTexture;Lcom/tencent/liteav/videoproducer/capture/ae;)Z", "android/hardware/Camera", WeChatBrands.Business.GROUP_OPEN, "(I)Landroid/hardware/Camera;");
            ServerVideoProducerConfig serverVideoProducerConfig = this.f309838o;
            if (serverVideoProducerConfig == null || serverVideoProducerConfig.getCameraRealRotation(cameraCaptureParams2.f47179a.booleanValue()) == null) {
                this.f309826c = Rotation.m139836a(cameraInfo.orientation);
            } else {
                this.f309826c = this.f309838o.getCameraRealRotation(cameraCaptureParams2.f47179a.booleanValue());
            }
            LiteavLog.m16902i("CameraController", "open camera id: %d, isFrontCamera: %b, camera rotation: %s, camera info orientation: %d", Integer.valueOf(a), cameraCaptureParams2.f47179a, this.f309826c, Integer.valueOf(cameraInfo.orientation));
            Camera.Parameters parameters = this.f309825b.getParameters();
            this.f309829f = parameters.getMaxNumFocusAreas() > 0;
            this.f309830g = parameters.getMaxNumMeteringAreas() > 0;
            m139847a(parameters, this.f309831h);
            if (this.f309836m) {
                this.f309836m = false;
                int maxZoom = parameters.getMaxZoom();
                this.f309832i = maxZoom;
                if (maxZoom > 0 && parameters.isZoomSupported()) {
                    parameters.setZoom(C104506j.m139787a(Math.round(this.f309837n * ((float) this.f309832i)), 0, this.f309832i));
                }
            }
            if (this.f309834k) {
                this.f309834k = false;
                parameters.setExposureCompensation(m139842a(parameters, this.f309835l));
            }
            C104507p a2 = m139846a(parameters, this.f309826c, cameraCaptureParams2.f47184c, cameraCaptureParams2.f47185d);
            this.f309828e = a2;
            parameters.setPreviewSize(a2.f309736a, a2.f309737b);
            int[] a3 = m139848a(parameters, cameraCaptureParams2.f47183b);
            if (a3 != null) {
                parameters.setPreviewFpsRange(a3[0], a3[1]);
            } else {
                parameters.setPreviewFrameRate(m139841a(cameraCaptureParams2.f47183b));
            }
            if (cameraInfo.facing == 1) {
                this.f309825b.setDisplayOrientation((360 - this.f309826c.mValue) % v2helper.VOIP_ENC_HEIGHT_LV1);
            } else {
                this.f309825b.setDisplayOrientation(this.f309826c.mValue);
            }
            this.f309825b.setParameters(parameters);
            this.f309825b.setErrorCallback(this);
            this.f309825b.setPreviewTexture(this.f309827d);
            C117292a.m165363i(this.f309825b, "com/tencent/liteav/videoproducer/capture/a/a", "a", "(Lcom/tencent/liteav/videoproducer/capture/CameraCaptureParams;Landroid/graphics/SurfaceTexture;Lcom/tencent/liteav/videoproducer/capture/ae;)Z", "android/hardware/Camera", "startPreview", "()V");
            return true;
        } catch (Exception e) {
            LiteavLog.m16898e("CameraController", "open camera1 fail, Exception:".concat(String.valueOf(e)));
            return false;
        }
    }

    /* renamed from: b */
    public final void mo20555b(boolean z) {
        Camera.Parameters i;
        this.f309831h = z;
        if (this.f309825b != null && (i = m139850i()) != null) {
            m139847a(i, z);
        }
    }

    /* renamed from: d */
    public final C104507p mo20557d() {
        return this.f309828e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = m139850i();
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo20558e() {
        /*
            r3 = this;
            android.hardware.Camera r0 = r3.f309825b
            r1 = 0
            if (r0 == 0) goto L_0x001a
            android.hardware.Camera$Parameters r0 = r3.m139850i()
            if (r0 != 0) goto L_0x000c
            return r1
        L_0x000c:
            int r2 = r0.getMaxZoom()
            if (r2 <= 0) goto L_0x001a
            boolean r0 = r0.isZoomSupported()
            if (r0 == 0) goto L_0x001a
            r0 = 1
            return r0
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.capture.p1097a.C104526a.mo20558e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        r0 = (r0 = m139850i()).getSupportedFlashModes();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo20559f() {
        /*
            r3 = this;
            android.hardware.Camera r0 = r3.f309825b
            r1 = 0
            if (r0 == 0) goto L_0x001c
            android.hardware.Camera$Parameters r0 = r3.m139850i()
            if (r0 != 0) goto L_0x000c
            return r1
        L_0x000c:
            java.util.List r0 = r0.getSupportedFlashModes()
            if (r0 == 0) goto L_0x001c
            java.lang.String r2 = "torch"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x001c
            r0 = 1
            return r0
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.capture.p1097a.C104526a.mo20559f():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = m139850i();
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo20560g() {
        /*
            r2 = this;
            android.hardware.Camera r0 = r2.f309825b
            r1 = 0
            if (r0 == 0) goto L_0x0013
            android.hardware.Camera$Parameters r0 = r2.m139850i()
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getMaxNumDetectedFaces()
            if (r0 <= 0) goto L_0x0013
            r0 = 1
            return r0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.capture.p1097a.C104526a.mo20560g():boolean");
    }

    /* renamed from: h */
    public final boolean mo20561h() {
        return this.f309829f;
    }

    public final void onError(int i, Camera camera) {
        C104529ae aeVar;
        if ((i == 1 || i == 2 || i == 100) && (aeVar = this.f309833j) != null) {
            aeVar.onCameraError(this);
        }
    }

    /* renamed from: c */
    public final int mo20556c() {
        int i = this.f309832i;
        if (i != 0) {
            return i;
        }
        if (this.f309825b != null) {
            Camera.Parameters i2 = m139850i();
            if (i2 == null) {
                return this.f309832i;
            }
            if (i2.getMaxZoom() > 0 && i2.isZoomSupported()) {
                this.f309832i = i2.getMaxZoom();
            }
        }
        return this.f309832i;
    }

    /* renamed from: b */
    public final void mo20554b(float f) {
        this.f309835l = f;
        this.f309834k = true;
        if (this.f309825b != null) {
            this.f309834k = false;
            Camera.Parameters i = m139850i();
            if (i != null) {
                i.setExposureCompensation(m139842a(i, f));
                try {
                    this.f309825b.setParameters(i);
                } catch (Exception e) {
                    LiteavLog.m16899e("CameraController", "set exposure compensation failed.", (Throwable) e);
                }
            }
        }
    }

    /* renamed from: b */
    public final Rotation mo20553b() {
        return this.f309826c;
    }

    /* renamed from: a */
    public final boolean mo20551a(int i, int i2, boolean z) {
        boolean z2 = false;
        boolean z3 = true;
        if (this.f309825b != null) {
            Camera.Parameters i3 = m139850i();
            if (i3 == null) {
                return true;
            }
            C104507p a = m139846a(i3, this.f309826c, i, i2);
            if (a != null) {
                int i4 = a.f309736a * a.f309737b;
                C104507p pVar = this.f309828e;
                if (i4 > pVar.f309737b * pVar.f309736a) {
                    z3 = false;
                }
                if (!z || Math.abs(a.mo147179c() - this.f309828e.mo147179c()) <= 0.001d) {
                    z2 = z3;
                }
                LiteavLog.m16901i("CameraController", "isCurrentPreviewSizeAspectRatioMatch : ".concat(String.valueOf(z2)));
                return z2;
            }
        }
        z2 = true;
        LiteavLog.m16901i("CameraController", "isCurrentPreviewSizeAspectRatioMatch : ".concat(String.valueOf(z2)));
        return z2;
    }

    /* renamed from: a */
    public final void mo20549a(ServerVideoProducerConfig serverVideoProducerConfig) {
        this.f309838o = serverVideoProducerConfig;
    }

    /* renamed from: a */
    public final void mo20550a(boolean z) {
        List<String> supportedFlashModes;
        if (this.f309825b != null) {
            String str = z ? "torch" : "off";
            Camera.Parameters i = m139850i();
            if (i != null && (supportedFlashModes = i.getSupportedFlashModes()) != null && supportedFlashModes.contains(str)) {
                try {
                    i.setFlashMode(str);
                    this.f309825b.setParameters(i);
                } catch (Exception e) {
                    LiteavLog.m16899e("CameraController", "enable torch failed.", (Throwable) e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20548a(int i, int i2) {
        if (this.f309831h) {
            if (i >= 0) {
                C104507p pVar = this.f309828e;
                if (i < pVar.f309736a && i2 >= 0 && i2 < pVar.f309737b) {
                    LiteavLog.m16902i("CameraController", "Start auto focus at (%d, %d)", Integer.valueOf(i), Integer.valueOf(i2));
                    try {
                        this.f309825b.cancelAutoFocus();
                        Camera.Parameters i3 = m139850i();
                        if (i3 != null) {
                            if (this.f309829f) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(new Camera.Area(m139845a((float) i, (float) i2, 2.0f), 1000));
                                i3.setFocusAreas(arrayList);
                            }
                            if (this.f309830g) {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(new Camera.Area(m139845a((float) i, (float) i2, 3.0f), 1000));
                                i3.setMeteringAreas(arrayList2);
                            }
                            try {
                                this.f309825b.setParameters(i3);
                                this.f309825b.autoFocus(this.f309839p);
                                return;
                            } catch (Exception e) {
                                LiteavLog.m16899e("CameraController", "auto focus failed.", (Throwable) e);
                                return;
                            }
                        } else {
                            return;
                        }
                    } catch (Exception e2) {
                        LiteavLog.m16899e("CameraController", "cancel auto focus failed.", (Throwable) e2);
                        return;
                    }
                }
            }
            LiteavLog.m16906w("CameraController", "Start auto focus at (%d, %d) invalid ", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* renamed from: a */
    public final void mo20547a(float f) {
        this.f309837n = f;
        this.f309836m = true;
        if (this.f309825b != null) {
            this.f309836m = false;
            Camera.Parameters i = m139850i();
            if (i != null) {
                if (i.getMaxZoom() <= 0 || !i.isZoomSupported()) {
                    LiteavLog.m16901i("CameraController", "camera doesn't support zoom!");
                    return;
                }
                int maxZoom = i.getMaxZoom();
                try {
                    i.setZoom(C104506j.m139787a(Math.round(f * ((float) maxZoom)), 0, maxZoom));
                    this.f309825b.setParameters(i);
                } catch (Exception e) {
                    LiteavLog.m16899e("CameraController", "set zoom failed.", (Throwable) e);
                }
            }
        }
    }

    /* renamed from: a */
    private Rect m139845a(float f, float f2, float f3) {
        int i = (int) (f3 * 200.0f);
        C104507p pVar = this.f309828e;
        int i2 = i / 2;
        int a = C104506j.m139787a(((int) (((f / ((float) pVar.f309736a)) * 2000.0f) - 1000.0f)) - i2, -1000, 1000);
        int a2 = C104506j.m139787a(a + i, -1000, 1000);
        int a3 = C104506j.m139787a(((int) (((f2 / ((float) pVar.f309737b)) * 2000.0f) - 1000.0f)) - i2, -1000, 1000);
        return new Rect(a, a3, a2, C104506j.m139787a(i + a3, -1000, 1000));
    }

    /* renamed from: a */
    private static int m139842a(Camera.Parameters parameters, float f) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        if (minExposureCompensation == 0 && maxExposureCompensation == 0) {
            LiteavLog.m16901i("CameraController", "camera doesn't support exposure compensation");
            return minExposureCompensation;
        }
        C104503a.m139784a();
        return C104506j.m139787a((int) (C104506j.m139786a(f, -1.0f, 1.0f) * ((float) maxExposureCompensation)), minExposureCompensation, maxExposureCompensation);
    }

    /* renamed from: a */
    public final void mo20546a() {
        Camera camera = this.f309825b;
        if (camera != null) {
            camera.setErrorCallback((Camera.ErrorCallback) null);
            this.f309825b.stopPreview();
            C117292a.m165363i(this.f309825b, "com/tencent/liteav/videoproducer/capture/a/a", "a", "()V", "android/hardware/Camera", "release", "()V");
            this.f309825b = null;
        }
        this.f309827d = null;
    }

    /* renamed from: a */
    private static int m139843a(boolean z, Camera.CameraInfo cameraInfo) {
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < Camera.getNumberOfCameras(); i3++) {
            Camera.getCameraInfo(i3, cameraInfo);
            LiteavLog.m16901i("CameraController", "get camera info, index: " + i3 + ", facing: " + cameraInfo.facing);
            if (i == -1 && cameraInfo.facing == 1) {
                i = i3;
            } else if (i2 == -1 && cameraInfo.facing == 0) {
                i2 = i3;
            }
        }
        if (!z ? i2 != -1 : i == -1) {
            i = i2;
        }
        Camera.getCameraInfo(i, cameraInfo);
        return i;
    }

    /* renamed from: a */
    private static C104507p m139846a(Camera.Parameters parameters, Rotation rotation, int i, int i2) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes != null) {
            for (Camera.Size next : supportedPreviewSizes) {
                arrayList.add(new C104507p(next.width, next.height));
            }
        }
        return C104530af.m139869a(arrayList, rotation, i, i2);
    }

    /* renamed from: a */
    private static void m139847a(Camera.Parameters parameters, boolean z) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes != null) {
            if (z && supportedFocusModes.contains("auto")) {
                parameters.setFocusMode("auto");
                LiteavLog.m16901i("CameraController", "set focus mode to auto");
            } else if (supportedFocusModes.contains("continuous-video")) {
                parameters.setFocusMode("continuous-video");
                LiteavLog.m16901i("CameraController", "set focus mode to continuous-video");
            }
        }
    }

    /* renamed from: a */
    private int m139841a(int i) {
        Camera.Parameters i2 = m139850i();
        if (i2 == null) {
            return 1;
        }
        List<Integer> supportedPreviewFrameRates = i2.getSupportedPreviewFrameRates();
        if (supportedPreviewFrameRates == null || supportedPreviewFrameRates.isEmpty()) {
            LiteavLog.m16898e("CameraController", "supported preview frame rates is empty");
            return 1;
        }
        int intValue = supportedPreviewFrameRates.get(0).intValue();
        for (Integer intValue2 : supportedPreviewFrameRates) {
            int intValue3 = intValue2.intValue();
            if (Math.abs(i - intValue3) < Math.abs(i - intValue)) {
                intValue = intValue3;
            }
        }
        LiteavLog.m16902i("CameraController", "best matched frame rate: ", Integer.valueOf(intValue));
        return intValue;
    }

    /* renamed from: a */
    private static int[] m139848a(Camera.Parameters parameters, int i) {
        int i2 = i * 1000;
        LiteavLog.m16901i("CameraController", "preferred fps: ".concat(String.valueOf(i2)));
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        int[] iArr = null;
        if (supportedPreviewFpsRange != null && supportedPreviewFpsRange.size() > 0) {
            Collections.sort(supportedPreviewFpsRange, C104528c.m139868a());
            Iterator<int[]> it = supportedPreviewFpsRange.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int[] next = it.next();
                LiteavLog.m16901i("CameraController", "supported fps range: " + next[0] + "->" + next[1]);
                if (next[0] <= i2 && i2 <= next[1]) {
                    iArr = next;
                    break;
                }
            }
            if (iArr != null) {
                LiteavLog.m16901i("CameraController", "choosed fps range: " + iArr[0] + "->" + iArr[1]);
            }
        }
        return iArr;
    }

    /* renamed from: a */
    public static /* synthetic */ int m139844a(int[] iArr, int[] iArr2) {
        return iArr[1] - iArr2[1];
    }
}
