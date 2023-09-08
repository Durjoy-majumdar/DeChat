package com.tencent.p014mm.plugin.facedetect.model;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Comparator;
import p156gj.C107848z;

/* renamed from: com.tencent.mm.plugin.facedetect.model.s */
public class C105228s {

    /* renamed from: a */
    public Context f312613a;

    /* renamed from: b */
    public C107848z f312614b;

    /* renamed from: c */
    public boolean f312615c = false;

    /* renamed from: d */
    public Point f312616d = null;

    /* renamed from: e */
    public Point f312617e = null;

    /* renamed from: f */
    public boolean f312618f;

    /* renamed from: g */
    public int f312619g;

    /* renamed from: h */
    public boolean f312620h = true;

    /* renamed from: i */
    public boolean f312621i = false;

    /* renamed from: j */
    public Point f312622j = null;

    /* renamed from: com.tencent.mm.plugin.facedetect.model.s$a */
    public class C105229a implements Camera.PreviewCallback {

        /* renamed from: d */
        public final /* synthetic */ Camera.PreviewCallback f312623d;

        public C105229a(C105228s sVar, Camera.PreviewCallback previewCallback) {
            this.f312623d = previewCallback;
        }

        public void onPreviewFrame(byte[] bArr, Camera camera) {
            Camera.PreviewCallback previewCallback = this.f312623d;
            if (previewCallback != null) {
                previewCallback.onPreviewFrame(bArr, camera);
            }
            camera.addCallbackBuffer(bArr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.model.s$b */
    public static class C105230b implements Comparator<Camera.Size> {
        public C105230b(C105229a aVar) {
        }

        public int compare(Object obj, Object obj2) {
            Camera.Size size = (Camera.Size) obj;
            Camera.Size size2 = (Camera.Size) obj2;
            int i = size.height * size.width;
            int i2 = size2.height * size2.width;
            if (i2 < i) {
                return -1;
            }
            return i2 > i ? 1 : 0;
        }
    }

    public C105228s(Context context) {
        this.f312613a = context;
    }

    /* renamed from: c */
    public static boolean m141317c(int i, int i2, long j) {
        double d = ((((((double) i) * ((double) i2)) * 3.0d) / 2.0d) / 1024.0d) / 1024.0d;
        Log.m105919d("MicroMsg.FaceScanCamera", "dataSizeInMB: %f, availableMemInMb: %d", Double.valueOf(d), Long.valueOf(j));
        return ((double) j) / d >= 5.0d;
    }

    /* renamed from: a */
    public int mo149596a() {
        Log.m105927v("MicroMsg.FaceScanCamera", "hy: preview height: %d", Integer.valueOf(this.f312616d.y));
        return this.f312616d.y;
    }

    /* renamed from: b */
    public int mo149597b() {
        Log.m105927v("MicroMsg.FaceScanCamera", "hy: preview width: %d", Integer.valueOf(this.f312616d.x));
        return this.f312616d.x;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        r0 = r5;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo149598d(android.graphics.SurfaceTexture r20, boolean r21, int r22) {
        /*
            r19 = this;
            r1 = r19
            boolean r0 = r1.f312615c
            java.lang.String r2 = "MicroMsg.FaceScanCamera"
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = "in open(), previewing"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            r19.mo149599e()
        L_0x0010:
            r0 = r21
            r1.f312620h = r0
            r0 = -1
            ej.c r3 = p149ej.C107276c.f320945a
            int r3 = r3.mo157751d()
            r4 = 0
            r5 = 0
        L_0x001d:
            r6 = 1
            if (r5 >= r3) goto L_0x0044
            android.hardware.Camera$CameraInfo r7 = new android.hardware.Camera$CameraInfo
            r7.<init>()
            android.hardware.Camera.getCameraInfo(r5, r7)
            int r7 = r7.facing
            java.lang.String r8 = "hy: front Camera found"
            if (r7 != r6) goto L_0x0036
            boolean r9 = r1.f312620h
            if (r9 == 0) goto L_0x0036
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r8)
            goto L_0x003f
        L_0x0036:
            if (r7 != 0) goto L_0x0041
            boolean r7 = r1.f312620h
            if (r7 != 0) goto L_0x0041
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r8)
        L_0x003f:
            r0 = r5
            goto L_0x0044
        L_0x0041:
            int r5 = r5 + 1
            goto L_0x001d
        L_0x0044:
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            android.content.Context r3 = r1.f312613a
            r5 = 0
            gj.f r3 = p156gj.C107828e.m146101d(r3, r0, r5)
            if (r3 == 0) goto L_0x0316
            r1.f312621i = r6
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10[r4] = r0
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r7)
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r10[r6] = r0
            java.lang.String r0 = "openCamera done, cameraId=[%s] costTime=[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r0, r10)
            int r0 = r3.f322840b
            r1.f312619g = r0
            int r0 = r0 % 180
            if (r0 == 0) goto L_0x0076
            r0 = 1
            goto L_0x0077
        L_0x0076:
            r0 = 0
        L_0x0077:
            r1.f312618f = r0
            gj.z r3 = r3.f322839a
            r1.f312614b = r3
            if (r3 == 0) goto L_0x0302
            r7 = r20
            r3.mo158265i(r7)
            gj.z r0 = r1.f312614b
            android.hardware.Camera$Parameters r3 = r0.mo158259c()
            android.graphics.Point r0 = r1.f312617e
            java.lang.String r7 = "preview-size-values"
            java.lang.String r7 = r3.get(r7)
            if (r7 != 0) goto L_0x009c
            java.lang.String r7 = "preview-size-value"
            java.lang.String r7 = r3.get(r7)
        L_0x009c:
            if (r7 == 0) goto L_0x020e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "preview-size-values parameter: "
            r8.append(r10)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.List r8 = r3.getSupportedPreviewSizes()
            r7.<init>(r8)
            com.tencent.mm.plugin.facedetect.model.s$b r8 = new com.tencent.mm.plugin.facedetect.model.s$b
            r8.<init>(r5)
            java.util.Collections.sort(r7, r8)
            int r8 = r0.x
            float r10 = (float) r8
            int r11 = r0.y
            float r11 = (float) r11
            float r10 = r10 / r11
            r11 = 3
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12[r4] = r8
            int r8 = r0.y
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12[r6] = r8
            java.lang.Float r8 = java.lang.Float.valueOf(r10)
            r12[r9] = r8
            java.lang.String r8 = "screen.x: %d, screen.y: %d, ratio: %f"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r8, r12)
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.getAvailableMemoryMB(r8)
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.Long r14 = java.lang.Long.valueOf(r12)
            r8[r4] = r14
            java.lang.String r14 = "systemAvailableMemInMB: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r14, r8)
            java.util.Iterator r7 = r7.iterator()
            r8 = 2139095040(0x7f800000, float:Infinity)
            r14 = r5
        L_0x0105:
            boolean r15 = r7.hasNext()
            if (r15 == 0) goto L_0x01cd
            java.lang.Object r15 = r7.next()
            android.hardware.Camera$Size r15 = (android.hardware.Camera.Size) r15
            int r5 = r15.width
            int r15 = r15.height
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r5)
            r11[r4] = r16
            java.lang.Integer r16 = java.lang.Integer.valueOf(r15)
            r11[r6] = r16
            java.lang.String r6 = "realWidth: %d, realHeight: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r11)
            int r6 = r5 * r15
            r11 = 150400(0x24b80, float:2.10755E-40)
            if (r6 >= r11) goto L_0x0131
            goto L_0x0135
        L_0x0131:
            r11 = 983040(0xf0000, float:1.377532E-39)
            if (r6 <= r11) goto L_0x0139
        L_0x0135:
            r5 = 0
            r6 = 1
        L_0x0137:
            r11 = 3
            goto L_0x0105
        L_0x0139:
            if (r5 <= r15) goto L_0x013d
            r6 = 1
            goto L_0x013e
        L_0x013d:
            r6 = 0
        L_0x013e:
            if (r6 == 0) goto L_0x0142
            r11 = r15
            goto L_0x0143
        L_0x0142:
            r11 = r5
        L_0x0143:
            if (r6 == 0) goto L_0x0149
            r6 = r5
            r16 = r7
            goto L_0x014c
        L_0x0149:
            r16 = r7
            r6 = r15
        L_0x014c:
            java.lang.Object[] r7 = new java.lang.Object[r9]
            java.lang.Integer r17 = java.lang.Integer.valueOf(r11)
            r7[r4] = r17
            java.lang.Integer r17 = java.lang.Integer.valueOf(r6)
            r18 = 1
            r7[r18] = r17
            java.lang.String r9 = "maybeFlippedWidth: %d, maybeFlippedHeight: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r9, r7)
            int r7 = r0.x
            if (r11 != r7) goto L_0x018a
            int r7 = r0.y
            if (r6 != r7) goto L_0x018a
            boolean r7 = m141317c(r11, r6, r12)
            if (r7 == 0) goto L_0x018a
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r5, r15)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Found preview size exactly matching screen size: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            goto L_0x020f
        L_0x018a:
            float r7 = (float) r11
            float r6 = (float) r6
            float r7 = r7 / r6
            float r7 = r7 - r10
            float r6 = java.lang.Math.abs(r7)
            int r7 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x01a3
            boolean r7 = m141317c(r5, r15, r12)
            if (r7 == 0) goto L_0x01a3
            android.graphics.Point r7 = new android.graphics.Point
            r7.<init>(r5, r15)
            r8 = r6
            r14 = r7
        L_0x01a3:
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Float r9 = java.lang.Float.valueOf(r8)
            r7[r4] = r9
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r9 = 1
            r7[r9] = r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 2
            r7[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r9 = 3
            r7[r9] = r5
            java.lang.String r5 = "diff:[%s] newdiff:[%s] w:[%s] h:[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r7)
            r7 = r16
            r5 = 0
            r6 = 1
            r9 = 2
            goto L_0x0137
        L_0x01cd:
            if (r14 != 0) goto L_0x01f8
            android.hardware.Camera$Size r0 = r3.getPreviewSize()
            if (r0 == 0) goto L_0x01f3
            android.graphics.Point r14 = new android.graphics.Point
            int r5 = r0.width
            int r0 = r0.height
            r14.<init>(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "No suitable preview sizes, using default: "
            r0.append(r5)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x01f8
        L_0x01f3:
            java.lang.String r0 = "hy: can not find default size!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x01f8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Found best approximate preview size: "
            r0.append(r5)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r0 = r14
            goto L_0x020f
        L_0x020e:
            r0 = 0
        L_0x020f:
            if (r0 == 0) goto L_0x02fe
            r1.f312616d = r0
            android.graphics.Point r5 = new android.graphics.Point
            r5.<init>(r0)
            r1.f312622j = r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "getCameraResolution: "
            r0.append(r5)
            android.graphics.Point r5 = r1.f312617e
            r0.append(r5)
            java.lang.String r5 = " camera:"
            r0.append(r5)
            android.graphics.Point r5 = r1.f312616d
            r0.append(r5)
            java.lang.String r5 = "bestVideoEncodeSize: "
            r0.append(r5)
            android.graphics.Point r5 = r1.f312622j
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            android.graphics.Point r0 = r1.f312616d
            int r5 = r0.x
            int r0 = r0.y
            r3.setPreviewSize(r5, r0)
            r3.setZoom(r4)
            java.lang.String r0 = "auto"
            r3.setSceneMode(r0)
            java.util.List r5 = r3.getSupportedFocusModes()     // Catch:{ Exception -> 0x0275 }
            if (r5 == 0) goto L_0x026f
            java.util.List r5 = r3.getSupportedFocusModes()     // Catch:{ Exception -> 0x0275 }
            boolean r5 = r5.contains(r0)     // Catch:{ Exception -> 0x0275 }
            if (r5 == 0) goto L_0x026f
            java.lang.String r5 = "set FocusMode to FOCUS_MODE_AUTO"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)     // Catch:{ Exception -> 0x0275 }
            r3.setFocusMode(r0)     // Catch:{ Exception -> 0x0275 }
            goto L_0x0285
        L_0x026f:
            java.lang.String r0 = "camera not support FOCUS_MODE_AUTO"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ Exception -> 0x0275 }
            goto L_0x0285
        L_0x0275:
            r0 = move-exception
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r0 = r0.getMessage()
            r6[r4] = r0
            java.lang.String r0 = "set focus mode error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r6)
        L_0x0285:
            java.util.List r0 = r3.getSupportedPreviewFormats()
            java.util.Iterator r5 = r0.iterator()
            r18 = 0
        L_0x028f:
            boolean r6 = r5.hasNext()
            r7 = 842094169(0x32315659, float:1.0322389E-8)
            r8 = 17
            if (r6 == 0) goto L_0x02c2
            java.lang.Object r6 = r5.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "supportedPreviewFormat: "
            r9.append(r10)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r9)
            if (r6 != r8) goto L_0x02bd
            r5 = 1
            goto L_0x02c3
        L_0x02bd:
            if (r6 != r7) goto L_0x028f
            r18 = 1
            goto L_0x028f
        L_0x02c2:
            r5 = 0
        L_0x02c3:
            if (r5 == 0) goto L_0x02c9
            r3.setPreviewFormat(r8)
            goto L_0x02ef
        L_0x02c9:
            if (r18 == 0) goto L_0x02d4
            java.lang.String r0 = "Preview not support PixelFormat.YCbCr_420_SP, but hasYU12"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            r3.setPreviewFormat(r7)
            goto L_0x02ef
        L_0x02d4:
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Object r6 = r0.get(r4)
            r5[r4] = r6
            java.lang.String r6 = "Preview not support PixelFormat.YCbCr_420_SP. Use format: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r6, r5)
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.setPreviewFormat(r0)
        L_0x02ef:
            boolean r0 = r1.f312618f
            if (r0 == 0) goto L_0x02f8
            int r0 = r1.f312619g
            r3.setRotation(r0)
        L_0x02f8:
            gj.z r0 = r1.f312614b
            r0.mo158262f(r3)
            return
        L_0x02fe:
            android.graphics.Point r0 = new android.graphics.Point
            r0 = 0
            throw r0
        L_0x0302:
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3[r4] = r0
            java.lang.String r0 = "in open(), camera == null, bNeedRotate=[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r3)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>()
            throw r0
        L_0x0316:
            java.lang.String r0 = "in open(), openCameraRes == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.facedetect.model.C105228s.mo149598d(android.graphics.SurfaceTexture, boolean, int):void");
    }

    /* renamed from: e */
    public void mo149599e() {
        Log.m105919d("MicroMsg.FaceScanCamera", "release(), previewing = [%s]", Boolean.valueOf(this.f312615c));
        if (this.f312614b != null) {
            long currentTicks = Util.currentTicks();
            if (this.f312615c) {
                this.f312614b.mo158263g((Camera.PreviewCallback) null);
                this.f312614b.mo158268l();
                this.f312615c = false;
                Log.m105919d("MicroMsg.FaceScanCamera", "stopPreview costTime=[%s]", Long.valueOf(Util.ticksToNow(currentTicks)));
            }
            long currentTicks2 = Util.currentTicks();
            this.f312614b.mo158260d();
            this.f312614b = null;
            this.f312621i = false;
            Log.m105919d("MicroMsg.FaceScanCamera", "camera.release() costTime=[%s]", Long.valueOf(Util.ticksToNow(currentTicks2)));
        }
    }

    /* renamed from: f */
    public void mo149600f(Camera.PreviewCallback previewCallback) {
        if (this.f312614b == null) {
            Log.m105928w("MicroMsg.FaceScanCamera", "hy: camera is null. setPreviewCallback failed");
            return;
        }
        try {
            this.f312614b.mo158257a(C93390g.f269584d.mo126905m(Integer.valueOf(((mo149597b() * mo149596a()) * ImageFormat.getBitsPerPixel(this.f312614b.mo158259c().getPreviewFormat())) / 8)));
            this.f312614b.mo158264h(new C105229a(this, previewCallback));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FaceScanCamera", e, "setPreviewCallback error: %s", e.getMessage());
        }
    }

    /* renamed from: g */
    public void mo149601g(SurfaceTexture surfaceTexture) {
        long currentTicks = Util.currentTicks();
        if (this.f312614b != null && !this.f312615c) {
            if (surfaceTexture != null) {
                Log.m105924i("MicroMsg.FaceScanCamera", "hy: SurfaceTexture is not null");
                this.f312614b.mo158265i(surfaceTexture);
            }
            C93390g.m117951o(mo149597b(), mo149596a(), 5);
            this.f312614b.mo158267k();
            this.f312615c = true;
            Log.m105919d("MicroMsg.FaceScanCamera", "startPreview done costTime=[%s]", Long.valueOf(Util.ticksToNow(currentTicks)));
        }
    }
}
