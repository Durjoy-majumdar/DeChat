package com.tencent.p014mm.plugin.flash;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.HandlerThread;
import com.tencent.p014mm.memory.C92702a;
import com.tencent.p014mm.p136ui.base.MMTextureView;
import com.tencent.p014mm.plugin.facedetect.model.C105224h;
import com.tencent.p014mm.plugin.facedetect.model.C93390g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import eu3.C58834h;
import eu3.C97749e;
import java.io.IOException;
import java.util.Comparator;
import p156gj.C107831f;
import p156gj.C107848z;

/* renamed from: com.tencent.mm.plugin.flash.l */
public class C105349l {

    /* renamed from: a */
    public MMTextureView f313124a;

    /* renamed from: b */
    public HandlerThread f313125b;

    /* renamed from: c */
    public MMHandler f313126c;

    /* renamed from: d */
    public C107848z f313127d;

    /* renamed from: e */
    public int f313128e;

    /* renamed from: f */
    public int f313129f;

    /* renamed from: g */
    public int f313130g;

    /* renamed from: h */
    public boolean f313131h;

    /* renamed from: i */
    public boolean f313132i;

    /* renamed from: j */
    public boolean f313133j;

    /* renamed from: k */
    public boolean f313134k;

    /* renamed from: l */
    public Point f313135l = null;

    /* renamed from: m */
    public Point f313136m = null;

    /* renamed from: n */
    public Point f313137n = null;

    /* renamed from: o */
    public int f313138o = 0;

    /* renamed from: p */
    public C107831f f313139p;

    /* renamed from: q */
    public Context f313140q;

    /* renamed from: r */
    public C105224h.C105226b f313141r = new C105350d(this);

    /* renamed from: com.tencent.mm.plugin.flash.l$a */
    public class C4393a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C4396e f19040d;

        public C4393a(C4396e eVar) {
            this.f19040d = eVar;
        }

        public void run() {
            boolean a = C105349l.m141478a(C105349l.this);
            if (!a) {
                Log.m105924i("MicroMsg.FaceFlashManagerCamera", "reopen Camera");
                C115669n nVar = C115669n.INSTANCE;
                C105349l.this.getClass();
                nVar.idkeyStat(917, 39, 1, false);
                a = C105349l.m141478a(C105349l.this);
            }
            Log.m105925i("MicroMsg.FaceFlashManagerCamera", "isOpenCamera：%s", Boolean.valueOf(a));
            C115669n nVar2 = C115669n.INSTANCE;
            C105349l.this.getClass();
            nVar2.idkeyStat(917, 38, 1, false);
            this.f19040d.mo5233a(Boolean.valueOf(a), C105349l.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.flash.l$b */
    public class C4394b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ SurfaceTexture f19042d;

        /* renamed from: e */
        public final /* synthetic */ C4396e f19043e;

        public C4394b(SurfaceTexture surfaceTexture, C4396e eVar) {
            this.f19042d = surfaceTexture;
            this.f19043e = eVar;
        }

        public void run() {
            try {
                C105349l.this.f313127d.mo158265i(this.f19042d);
                C105349l lVar = C105349l.this;
                C93390g.m117951o(lVar.f313128e, lVar.f313129f, 5);
                try {
                    C105349l.this.f313127d.mo158267k();
                } catch (Exception e) {
                    Log.m105924i("MicroMsg.FaceFlashManagerCamera", "startPreview failed:" + e.getMessage());
                    C105349l.this.f313134k = false;
                    C4396e eVar = this.f19043e;
                    if (eVar != null) {
                        eVar.mo5233a(Boolean.FALSE, (C105349l) null);
                    }
                }
            } catch (IOException e2) {
                Log.m105924i("MicroMsg.FaceFlashManagerCamera", "setPreviewTexture failed:" + e2.getMessage());
                C105349l.this.f313134k = false;
                C4396e eVar2 = this.f19043e;
                if (eVar2 != null) {
                    eVar2.mo5233a(Boolean.FALSE, (C105349l) null);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.flash.l$c */
    public class C4395c implements Camera.PreviewCallback {

        /* renamed from: d */
        public final /* synthetic */ Camera.PreviewCallback f19045d;

        public C4395c(C105349l lVar, Camera.PreviewCallback previewCallback) {
            this.f19045d = previewCallback;
        }

        public void onPreviewFrame(byte[] bArr, Camera camera) {
            Camera.PreviewCallback previewCallback = this.f19045d;
            if (previewCallback != null) {
                previewCallback.onPreviewFrame(bArr, camera);
            }
            camera.addCallbackBuffer(bArr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.flash.l$e */
    public interface C4396e {
        /* renamed from: a */
        void mo5233a(Boolean bool, C105349l lVar);
    }

    /* renamed from: com.tencent.mm.plugin.flash.l$d */
    public class C105350d implements C105224h.C105226b {
        public C105350d(C105349l lVar) {
        }

        /* renamed from: a */
        public void mo149592a(byte[] bArr) {
            C93390g gVar = C93390g.f269584d;
            synchronized (gVar) {
                gVar.mo126900k(bArr);
            }
        }

        /* renamed from: b */
        public C92702a<byte[]> mo149593b() {
            return C93390g.f269584d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.flash.l$f */
    public static class C105351f implements Comparator<Camera.Size> {
        public C105351f(C4393a aVar) {
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

    public C105349l(Context context) {
        this.f313140q = context;
        this.f313134k = false;
        this.f313125b = null;
        this.f313133j = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:151:0x0473  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m141478a(com.tencent.p014mm.plugin.flash.C105349l r19) {
        /*
            r1 = r19
            r19.getClass()
            java.lang.String r2 = "MicroMsg.FaceFlashManagerCamera"
            java.lang.String r0 = "start open camera"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r3 = 0
            r1.f313133j = r3
            r4 = 1
            r1.f313132i = r4
            int r0 = android.hardware.Camera.getNumberOfCameras()
            r5 = 0
        L_0x0017:
            r6 = -1
            if (r5 >= r0) goto L_0x003f
            android.hardware.Camera$CameraInfo r7 = new android.hardware.Camera$CameraInfo
            r7.<init>()
            android.hardware.Camera.getCameraInfo(r5, r7)
            int r7 = r7.facing
            if (r7 != r4) goto L_0x0030
            boolean r8 = r1.f313132i
            if (r8 == 0) goto L_0x0030
            java.lang.String r0 = "openCamera found front Camera "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x0040
        L_0x0030:
            if (r7 != 0) goto L_0x003c
            boolean r7 = r1.f313132i
            if (r7 != 0) goto L_0x003c
            java.lang.String r0 = "openCamera found front Camera"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x0040
        L_0x003c:
            int r5 = r5 + 1
            goto L_0x0017
        L_0x003f:
            r5 = -1
        L_0x0040:
            if (r5 != r6) goto L_0x0049
            java.lang.String r0 = "not found available camera id"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x04e9
        L_0x0049:
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            gj.f r0 = r1.f313139p
            r8 = 0
            if (r0 != 0) goto L_0x006a
            java.lang.String r0 = "openCameraRes is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            android.content.Context r0 = r1.f313140q     // Catch:{ Exception -> 0x0060 }
            gj.f r0 = p156gj.C107828e.m146101d(r0, r5, r8)     // Catch:{ Exception -> 0x0060 }
            r1.f313139p = r0     // Catch:{ Exception -> 0x0060 }
            goto L_0x006a
        L_0x0060:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r4 = "MicroMsg.FaceFlashManagerError"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r1)
            goto L_0x04e9
        L_0x006a:
            gj.f r0 = r1.f313139p
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = "in open(), openCameraRes == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x04e9
        L_0x0075:
            r1.f313138o = r5
            r1.f313133j = r4
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r3] = r5
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r6)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r0[r4] = r5
            java.lang.String r5 = "openCamera done, cameraId=[%s] costTime=[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r0)
            gj.f r0 = r1.f313139p
            int r5 = r0.f322840b
            r1.f313130g = r5
            int r5 = r5 % 180
            if (r5 == 0) goto L_0x009d
            r5 = 1
            goto L_0x009e
        L_0x009d:
            r5 = 0
        L_0x009e:
            r1.f313131h = r5
            gj.z r0 = r0.f322839a
            r1.f313127d = r0
            if (r0 != 0) goto L_0x00b5
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            r0[r3] = r1
            java.lang.String r1 = "in open(), camera == null, bNeedRotate=[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r0)
            goto L_0x04e9
        L_0x00b5:
            android.hardware.Camera$Parameters r5 = r0.mo158259c()     // Catch:{ Exception -> 0x04da }
            if (r5 != 0) goto L_0x00c2
            java.lang.String r0 = "in open(), parameters == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x04e9
        L_0x00c2:
            android.content.Context r0 = r1.f313140q
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            android.content.Context r6 = r1.f313140q
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            int r6 = r6.heightPixels
            android.graphics.Point r7 = new android.graphics.Point
            r7.<init>(r0, r6)
            r1.f313136m = r7
            java.lang.String r0 = "preview-size-values"
            java.lang.String r0 = r5.get(r0)
            if (r0 != 0) goto L_0x00ef
            java.lang.String r0 = "preview-size-value"
            java.lang.String r0 = r5.get(r0)
        L_0x00ef:
            r6 = 3
            if (r0 == 0) goto L_0x0261
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "preview-size-values parameter: "
            r10.append(r11)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r10 = r5.getSupportedPreviewSizes()
            r0.<init>(r10)
            com.tencent.mm.plugin.flash.l$f r10 = new com.tencent.mm.plugin.flash.l$f
            r10.<init>(r8)
            java.util.Collections.sort(r0, r10)
            int r10 = r7.x
            float r11 = (float) r10
            int r12 = r7.y
            float r12 = (float) r12
            float r11 = r11 / r12
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r12[r3] = r10
            int r10 = r7.y
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r12[r4] = r10
            java.lang.Float r10 = java.lang.Float.valueOf(r11)
            r12[r9] = r10
            java.lang.String r10 = "screen.x: %d, screen.y: %d, ratio: %f"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r10, r12)
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.getAvailableMemoryMB(r10)
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.Long r14 = java.lang.Long.valueOf(r12)
            r10[r3] = r14
            java.lang.String r14 = "systemAvailableMemInMB: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r14, r10)
            java.util.Iterator r0 = r0.iterator()
            r10 = 2139095040(0x7f800000, float:Infinity)
            r14 = r8
        L_0x0155:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L_0x0220
            java.lang.Object r15 = r0.next()
            android.hardware.Camera$Size r15 = (android.hardware.Camera.Size) r15
            int r8 = r15.width
            int r15 = r15.height
            java.lang.Object[] r6 = new java.lang.Object[r9]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r8)
            r6[r3] = r16
            java.lang.Integer r16 = java.lang.Integer.valueOf(r15)
            r6[r4] = r16
            java.lang.String r4 = "realWidth: %d, realHeight: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r6)
            int r4 = r8 * r15
            r6 = 150400(0x24b80, float:2.10755E-40)
            if (r4 >= r6) goto L_0x0180
            goto L_0x0184
        L_0x0180:
            r6 = 983040(0xf0000, float:1.377532E-39)
            if (r4 <= r6) goto L_0x0188
        L_0x0184:
            r17 = r0
            goto L_0x0218
        L_0x0188:
            if (r8 <= r15) goto L_0x018c
            r4 = 1
            goto L_0x018d
        L_0x018c:
            r4 = 0
        L_0x018d:
            if (r4 == 0) goto L_0x0191
            r6 = r15
            goto L_0x0192
        L_0x0191:
            r6 = r8
        L_0x0192:
            r17 = r0
            if (r4 == 0) goto L_0x0198
            r4 = r8
            goto L_0x0199
        L_0x0198:
            r4 = r15
        L_0x0199:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r18 = java.lang.Integer.valueOf(r6)
            r0[r3] = r18
            java.lang.Integer r18 = java.lang.Integer.valueOf(r4)
            r16 = 1
            r0[r16] = r18
            java.lang.String r9 = "maybeFlippedWidth: %d, maybeFlippedHeight: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r9, r0)
            int r0 = r7.x
            if (r6 != r0) goto L_0x01d7
            int r0 = r7.y
            if (r4 != r0) goto L_0x01d7
            boolean r0 = m141479d(r6, r4, r12)
            if (r0 == 0) goto L_0x01d7
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r8, r15)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Found preview size exactly matching screen size: "
            r4.append(r6)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            goto L_0x0262
        L_0x01d7:
            float r0 = (float) r6
            float r4 = (float) r4
            float r0 = r0 / r4
            float r0 = r0 - r11
            float r0 = java.lang.Math.abs(r0)
            int r4 = r8 % 10
            if (r4 == 0) goto L_0x01e4
            goto L_0x0218
        L_0x01e4:
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x01f5
            boolean r4 = m141479d(r8, r15, r12)
            if (r4 == 0) goto L_0x01f5
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>(r8, r15)
            r10 = r0
            r14 = r4
        L_0x01f5:
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Float r6 = java.lang.Float.valueOf(r10)
            r4[r3] = r6
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r6 = 1
            r4[r6] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r6 = 2
            r4[r6] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r6 = 3
            r4[r6] = r0
            java.lang.String r0 = "diff:[%s] newdiff:[%s] w:[%s] h:[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r4)
        L_0x0218:
            r0 = r17
            r4 = 1
            r6 = 3
            r8 = 0
            r9 = 2
            goto L_0x0155
        L_0x0220:
            if (r14 != 0) goto L_0x024b
            android.hardware.Camera$Size r0 = r5.getPreviewSize()
            if (r0 == 0) goto L_0x0246
            android.graphics.Point r14 = new android.graphics.Point
            int r4 = r0.width
            int r0 = r0.height
            r14.<init>(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "No suitable preview sizes, using default: "
            r0.append(r4)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x024b
        L_0x0246:
            java.lang.String r0 = "hy: can not find default size!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x024b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Found best approximate preview size: "
            r0.append(r4)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r0 = r14
            goto L_0x0262
        L_0x0261:
            r0 = 0
        L_0x0262:
            if (r0 == 0) goto L_0x04d6
            r1.f313135l = r0
            android.graphics.Point r0 = new android.graphics.Point
            android.graphics.Point r4 = r1.f313135l
            r0.<init>(r4)
            r1.f313137n = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "getCameraResolution: "
            r0.append(r4)
            android.graphics.Point r4 = r1.f313136m
            r0.append(r4)
            java.lang.String r4 = " camera:"
            r0.append(r4)
            android.graphics.Point r4 = r1.f313135l
            r0.append(r4)
            java.lang.String r4 = "bestVideoEncodeSize: "
            r0.append(r4)
            android.graphics.Point r4 = r1.f313137n
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            android.graphics.Point r0 = r1.f313135l
            int r4 = r0.x
            r1.f313128e = r4
            int r0 = r0.y
            r1.f313129f = r0
            r5.setPreviewSize(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "mDesiredPreviewWidth："
            r0.append(r4)
            int r4 = r1.f313128e
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "mDesiredPreviewHeight："
            r0.append(r4)
            int r4 = r1.f313129f
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            r5.setZoom(r3)
            java.lang.String r0 = "auto"
            r5.setSceneMode(r0)
            java.util.List r4 = r5.getSupportedFocusModes()     // Catch:{ Exception -> 0x02f9 }
            if (r4 == 0) goto L_0x02f3
            java.util.List r4 = r5.getSupportedFocusModes()     // Catch:{ Exception -> 0x02f9 }
            boolean r4 = r4.contains(r0)     // Catch:{ Exception -> 0x02f9 }
            if (r4 == 0) goto L_0x02f3
            java.lang.String r4 = "set FocusMode to FOCUS_MODE_AUTO"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)     // Catch:{ Exception -> 0x02f9 }
            r5.setFocusMode(r0)     // Catch:{ Exception -> 0x02f9 }
            goto L_0x0308
        L_0x02f3:
            java.lang.String r0 = "camera not support FOCUS_MODE_AUTO"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ Exception -> 0x02f9 }
            goto L_0x0308
        L_0x02f9:
            r0 = move-exception
            r4 = 1
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getMessage()
            r6[r3] = r0
            java.lang.String r0 = "set focus mode error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r6)
        L_0x0308:
            java.util.List r0 = r5.getSupportedPreviewFormats()
            java.util.Iterator r4 = r0.iterator()
            r6 = 0
        L_0x0311:
            boolean r7 = r4.hasNext()
            r8 = 842094169(0x32315659, float:1.0322389E-8)
            r9 = 17
            if (r7 == 0) goto L_0x0342
            java.lang.Object r7 = r4.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "supportedPreviewFormat: "
            r10.append(r11)
            r10.append(r7)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r10)
            if (r7 != r9) goto L_0x033e
            r4 = 1
            goto L_0x0343
        L_0x033e:
            if (r7 != r8) goto L_0x0311
            r6 = 1
            goto L_0x0311
        L_0x0342:
            r4 = 0
        L_0x0343:
            if (r4 == 0) goto L_0x0349
            r5.setPreviewFormat(r9)
            goto L_0x036f
        L_0x0349:
            if (r6 == 0) goto L_0x0354
            java.lang.String r0 = "Preview not support PixelFormat.YCbCr_420_SP, but hasYU12"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            r5.setPreviewFormat(r8)
            goto L_0x036f
        L_0x0354:
            r4 = 1
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Object r4 = r0.get(r3)
            r6[r3] = r4
            java.lang.String r4 = "Preview not support PixelFormat.YCbCr_420_SP. Use format: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r4, r6)
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r5.setPreviewFormat(r0)
        L_0x036f:
            boolean r0 = r1.f313131h
            if (r0 == 0) goto L_0x0378
            int r0 = r1.f313130g
            r5.setRotation(r0)
        L_0x0378:
            int r0 = r1.f313128e
            double r6 = (double) r0
            int r0 = r1.f313129f
            double r8 = (double) r0
            double r6 = r6 / r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "new ratio="
            r0.append(r4)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            gj.d r0 = p156gj.C107835h0.f322845b
            int r0 = r0.f322821t
            if (r0 <= 0) goto L_0x03a0
            java.lang.String r0 = "set frame rate > 0, do not try set preview fps range"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x0450
        L_0x03a0:
            java.util.List r0 = r5.getSupportedPreviewFpsRange()
            if (r0 == 0) goto L_0x0450
            int r4 = r0.size()
            if (r4 != 0) goto L_0x03ae
            goto L_0x0450
        L_0x03ae:
            int r4 = r0.size()
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 0
            r9 = 0
        L_0x03b8:
            if (r9 >= r4) goto L_0x03f9
            java.lang.Object r10 = r0.get(r9)
            int[] r10 = (int[]) r10
            if (r10 == 0) goto L_0x03f6
            int r11 = r10.length
            r12 = 1
            if (r11 > r12) goto L_0x03c7
            goto L_0x03f6
        L_0x03c7:
            r11 = r10[r3]
            r10 = r10[r12]
            r13 = 3
            java.lang.Object[] r14 = new java.lang.Object[r13]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            r14[r3] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r14[r12] = r13
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            r13 = 2
            r14[r13] = r12
            java.lang.String r12 = "dkfps %d:[%d %d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r12, r14)
            if (r11 < 0) goto L_0x03f6
            if (r10 >= r11) goto L_0x03eb
            goto L_0x03f6
        L_0x03eb:
            if (r10 < r7) goto L_0x03f1
            if (r8 != 0) goto L_0x03f1
            r7 = r10
            r6 = r11
        L_0x03f1:
            r11 = 30000(0x7530, float:4.2039E-41)
            if (r10 < r11) goto L_0x03f6
            r8 = 1
        L_0x03f6:
            int r9 = r9 + 1
            goto L_0x03b8
        L_0x03f9:
            r8 = 3
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r0[r3] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r8 = 1
            r0[r8] = r4
            r4 = 30
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8 = 2
            r0[r8] = r4
            java.lang.String r4 = "dkfps get fit  [%d %d], max target fps %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r0) goto L_0x0450
            if (r7 != r0) goto L_0x041f
            goto L_0x0450
        L_0x041f:
            r5.setPreviewFpsRange(r6, r7)     // Catch:{ Exception -> 0x043a }
            java.lang.String r0 = "set fps range %d %d"
            r4 = 2
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0438 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x043a }
            r8[r3] = r4     // Catch:{ Exception -> 0x043a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x043a }
            r6 = 1
            r8[r6] = r4     // Catch:{ Exception -> 0x043a }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r8)     // Catch:{ Exception -> 0x043a }
            goto L_0x0450
        L_0x0438:
            r0 = move-exception
            goto L_0x043c
        L_0x043a:
            r0 = move-exception
            r4 = 2
        L_0x043c:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            android.os.Looper r6 = android.os.Looper.myLooper()
            r4[r3] = r6
            java.lang.String r0 = r0.getMessage()
            r6 = 1
            r4[r6] = r0
            java.lang.String r0 = "trySetPreviewFpsRangeParameters Exception, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r4)
        L_0x0450:
            java.util.List r0 = r5.getSupportedPreviewFpsRange()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "range:"
            r4.append(r6)
            int r6 = r0.size()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r4)
            r4 = 0
        L_0x046d:
            int r6 = r0.size()
            if (r4 >= r6) goto L_0x0493
            java.lang.Object r6 = r0.get(r4)
            int[] r6 = (int[]) r6
            r7 = 0
        L_0x047a:
            int r8 = r6.length
            if (r7 >= r8) goto L_0x0490
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r8 = r6[r7]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9[r3] = r8
            java.lang.String r8 = "Camera SupportedPreviewFpsRange："
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r8, r9)
            int r7 = r7 + 1
            goto L_0x047a
        L_0x0490:
            int r4 = r4 + 1
            goto L_0x046d
        L_0x0493:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Camera preview-fps-range："
            r0.append(r4)
            java.lang.String r6 = "preview-fps-range"
            java.lang.String r6 = r5.get(r6)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = "preview-frame-rate"
            java.lang.String r4 = r5.get(r4)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            gj.z r0 = r1.f313127d     // Catch:{ Exception -> 0x04cb }
            r0.mo158262f(r5)     // Catch:{ Exception -> 0x04cb }
            goto L_0x04d3
        L_0x04cb:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "setParameters error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r3)
        L_0x04d3:
            boolean r3 = r1.f313133j
            goto L_0x04e9
        L_0x04d6:
            android.graphics.Point r0 = new android.graphics.Point
            r0 = 0
            throw r0
        L_0x04da:
            r0 = move-exception
            r1 = r0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r4 = r1.getMessage()
            r0[r3] = r4
            java.lang.String r4 = "camera getParameters error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r4, r0)
        L_0x04e9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.flash.C105349l.m141478a(com.tencent.mm.plugin.flash.l):boolean");
    }

    /* renamed from: d */
    public static boolean m141479d(int i, int i2, long j) {
        double d = ((((((double) i) * ((double) i2)) * 3.0d) / 2.0d) / 1024.0d) / 1024.0d;
        Log.m105919d("MicroMsg.FaceFlashManagerCamera", "dataSizeInMB: %f, availableMemInMb: %d", Double.valueOf(d), Long.valueOf(j));
        return ((double) j) / d >= 5.0d;
    }

    /* renamed from: b */
    public float mo149954b() {
        try {
            String str = this.f313127d.mo158259c().get("preview-size");
            Log.m105925i("MicroMsg.FaceFlashManagerCamera", "preview size:%s", str);
            String[] split = str.split("x");
            return (((float) Integer.parseInt(split[0])) * 1.0f) / ((float) Integer.parseInt(split[1]));
        } catch (Exception unused) {
            return 1.0f;
        }
    }

    /* renamed from: c */
    public Point mo149955c() {
        try {
            String str = this.f313127d.mo158259c().get("preview-size");
            Log.m105925i("MicroMsg.FaceFlashManagerCamera", "preview size:%s", str);
            String[] split = str.split("x");
            this.f313128e = Integer.parseInt(split[0]);
            this.f313129f = Integer.parseInt(split[1]);
        } catch (Exception unused) {
        }
        return new Point(this.f313128e, this.f313129f);
    }

    /* renamed from: e */
    public void mo149956e(MMTextureView mMTextureView, C4396e eVar) {
        Log.m105924i("MicroMsg.FaceFlashManagerCamera", "openCameraForSurfaceTexture");
        this.f313124a = mMTextureView;
        if (this.f313125b == null) {
            Log.m105924i("MicroMsg.FaceFlashManagerCamera", "start camera thread");
            int i = C58834h.f168432b;
            HandlerThread a = C97749e.m126093a("cameraBackground", 5);
            this.f313125b = a;
            a.start();
            this.f313126c = new MMHandler(this.f313125b.getLooper());
        }
        MMHandler mMHandler = this.f313126c;
        if (mMHandler != null) {
            mMHandler.post(new C4393a(eVar));
        } else {
            Log.m105924i("MicroMsg.FaceFlashManagerCamera", "back thread is not running");
        }
    }

    /* renamed from: f */
    public void mo149957f(Camera.PreviewCallback previewCallback) {
        C107848z zVar = this.f313127d;
        if (zVar == null) {
            Log.m105928w("MicroMsg.FaceFlashManagerCamera", "hy: camera is null. setPreviewCallback failed");
            return;
        }
        int bitsPerPixel = ((this.f313128e * this.f313129f) * ImageFormat.getBitsPerPixel(zVar.mo158259c().getPreviewFormat())) / 8;
        for (int i = 0; i < 5; i++) {
            this.f313127d.mo158257a(C93390g.f269584d.mo126905m(Integer.valueOf(bitsPerPixel)));
        }
        this.f313127d.mo158264h(new C4395c(this, previewCallback));
        C105224h.m141309b().mo149588a(this.f313141r);
    }

    /* renamed from: g */
    public boolean mo149958g(SurfaceTexture surfaceTexture, C4396e eVar) {
        Log.m105924i("MicroMsg.FaceFlashManagerCamera", "mIsPreviewing is " + this.f313134k);
        if (this.f313127d != null && !this.f313134k) {
            this.f313134k = true;
            this.f313126c.post(new C4394b(surfaceTexture, eVar));
            Log.m105924i("MicroMsg.FaceFlashManagerCamera", "start preview, is previewing");
        }
        return this.f313134k;
    }

    /* renamed from: h */
    public void mo149959h() {
        Log.m105925i("MicroMsg.FaceFlashManagerCamera", "stopPreview, isPreviewing: %s", Boolean.valueOf(this.f313134k));
        C107848z zVar = this.f313127d;
        if (zVar != null && !zVar.f322938c && this.f313134k) {
            Log.m105924i("MicroMsg.FaceFlashManagerCamera", "just stopPreview");
            this.f313127d.mo158268l();
            this.f313134k = false;
            C93390g.f269584d.mo126892c();
        }
    }
}
