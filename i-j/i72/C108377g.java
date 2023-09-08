package i72;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.PermissionShowDlgEvent;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import cw0.C106963a;
import j72.C108619m;
import j72.C98921l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import nj3.C76879j;
import p156gj.C107825d;
import p156gj.C107828e;
import p156gj.C107831f;
import p156gj.C107835h0;
import p156gj.C107848z;
import p206nj.C11171e;
import p206nj.C76861g;
import p903ij.C76359b;
import qo3.C77398g;

/* renamed from: i72.g */
public class C108377g implements SensorEventListener {

    /* renamed from: R */
    public static boolean f324482R = true;

    /* renamed from: A */
    public List<C108382h> f324483A = new ArrayList();

    /* renamed from: B */
    public boolean f324484B = false;

    /* renamed from: C */
    public C108380c f324485C = C108380c.Preview;

    /* renamed from: D */
    public C108376c f324486D = new C108376c("prevcameraCallback");

    /* renamed from: E */
    public C108376c f324487E = new C108376c("cameraCallback");

    /* renamed from: F */
    public C108376c f324488F = new C108376c("cameraPreviewCallback");

    /* renamed from: G */
    public C108376c f324489G = new C108376c("cameraCropCallback");

    /* renamed from: H */
    public C108376c f324490H = new C108376c("mirrorCameraCallback");

    /* renamed from: I */
    public C108376c f324491I = new C108376c("finishCallbackTimeCallback");

    /* renamed from: J */
    public VideoTransPara f324492J;

    /* renamed from: K */
    public volatile byte[] f324493K = null;

    /* renamed from: L */
    public volatile boolean f324494L = false;

    /* renamed from: M */
    public boolean f324495M = false;

    /* renamed from: N */
    public Camera.AutoFocusCallback f324496N = new C108379b();

    /* renamed from: P */
    public C108381d f324497P = new C108381d(Looper.getMainLooper());

    /* renamed from: Q */
    public boolean f324498Q = true;

    /* renamed from: d */
    public int f324499d = -1;

    /* renamed from: e */
    public int f324500e = -1;

    /* renamed from: f */
    public C108393s f324501f = C108393s.m146851a();

    /* renamed from: g */
    public boolean f324502g = false;

    /* renamed from: h */
    public C107848z f324503h = null;

    /* renamed from: i */
    public boolean f324504i = false;

    /* renamed from: j */
    public int f324505j = 0;

    /* renamed from: n */
    public C107831f f324506n;

    /* renamed from: o */
    public SensorManager f324507o;

    /* renamed from: p */
    public Sensor f324508p;

    /* renamed from: q */
    public float f324509q = 0.0f;

    /* renamed from: r */
    public float f324510r = 0.0f;

    /* renamed from: s */
    public float f324511s = 0.0f;

    /* renamed from: t */
    public Context f324512t = null;

    /* renamed from: u */
    public Point f324513u = null;

    /* renamed from: v */
    public Point f324514v = null;

    /* renamed from: w */
    public Point f324515w = null;

    /* renamed from: x */
    public byte[] f324516x;

    /* renamed from: y */
    public boolean f324517y = false;

    /* renamed from: z */
    public C106963a f324518z = new C106963a();

    /* renamed from: i72.g$a */
    public class C108378a implements Camera.PreviewCallback {
        public C108378a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v44, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPreviewFrame(byte[] r18, android.hardware.Camera r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                i72.g r2 = i72.C108377g.this
                boolean r3 = r2.f324484B
                java.lang.String r4 = "MicroMsg.MMSightCamera"
                r5 = 2
                r6 = 0
                r7 = 1
                if (r3 != 0) goto L_0x0020
                java.lang.Object[] r3 = new java.lang.Object[r5]
                r3[r6] = r1
                gj.z r2 = r2.f324503h
                r3[r7] = r2
                java.lang.String r2 = "onPreviewFrame: %s %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r3)
                i72.g r2 = i72.C108377g.this
                r2.f324484B = r7
            L_0x0020:
                if (r1 == 0) goto L_0x01c2
                int r2 = r1.length
                if (r2 > 0) goto L_0x0027
                goto L_0x01c2
            L_0x0027:
                i72.g r2 = i72.C108377g.this
                cw0.a r2 = r2.f324518z
                int r3 = r2.f320183c
                if (r3 != 0) goto L_0x003e
                int r3 = r2.f320182b
                int r3 = r3 + r7
                r2.f320182b = r3
                java.lang.String r3 = p156gj.C107842p.m146109b()
                int r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r3)
                r2.f320181a = r3
            L_0x003e:
                int r3 = r2.f320183c
                int r3 = r3 + r7
                r2.f320183c = r3
                r4 = 90
                if (r3 < r4) goto L_0x0048
                r3 = 0
            L_0x0048:
                r2.f320183c = r3
                i72.g r2 = i72.C108377g.this
                boolean r2 = r2.f324494L
                r8 = 1
                if (r2 != 0) goto L_0x019e
                i72.g r2 = i72.C108377g.this
                java.util.List<i72.h> r2 = r2.f324483A
                if (r2 == 0) goto L_0x019e
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                int r2 = r2.size()
                if (r2 <= 0) goto L_0x019e
                i72.g r2 = i72.C108377g.this
                android.graphics.Point r3 = r2.f324515w
                r10 = 270(0x10e, float:3.78E-43)
                if (r3 == 0) goto L_0x0113
                j72.l r11 = j72.C98921l.f289964d
                i72.s r2 = r2.f324501f
                int r2 = r2.f324562c
                int r3 = r3.y
                int r2 = r2 * r3
                int r2 = r2 * 3
                int r2 = r2 / r5
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                byte[] r2 = r11.mo126905m(r2)
                i72.g r3 = i72.C108377g.this
                i72.c r3 = r3.f324488F
                r3.mo158893a(r8)
                long r12 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                i72.g r3 = i72.C108377g.this
                i72.s r14 = r3.f324501f
                int r15 = r14.f324562c
                int r14 = r14.f324561b
                android.graphics.Point r3 = r3.f324515w
                int r3 = r3.y
                com.tencent.p014mm.plugin.sight.base.SightVideoJNI.cropCameraData(r1, r2, r15, r14, r3)
                i72.g r3 = i72.C108377g.this
                android.graphics.Point r14 = r3.f324515w
                int r15 = r14.x
                i72.s r3 = r3.f324501f
                int r3 = r3.f324562c
                if (r15 >= r3) goto L_0x00c5
                int r3 = r14.y
                int r15 = r15 * r3
                int r15 = r15 * 3
                int r15 = r15 / r5
                java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
                byte[] r3 = r11.mo126905m(r3)
                i72.g r5 = i72.C108377g.this
                i72.s r14 = r5.f324501f
                int r14 = r14.f324562c
                android.graphics.Point r5 = r5.f324515w
                int r15 = r5.x
                int r5 = r5.y
                com.tencent.p014mm.plugin.sight.base.SightVideoJNI.cropCameraDataLongEdge(r2, r3, r14, r15, r5)
                r11.mo138260o(r2)
                r2 = r3
            L_0x00c5:
                long r14 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r12)
                i72.g r3 = i72.C108377g.this
                i72.c r3 = r3.f324489G
                r3.mo158893a(r14)
                i72.g r3 = i72.C108377g.this
                boolean r3 = r3.f324498Q
                if (r3 != 0) goto L_0x00f9
                long r12 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                i72.g r3 = i72.C108377g.this
                android.graphics.Point r5 = r3.f324515w
                int r11 = r5.x
                int r5 = r5.y
                gj.f r3 = r3.f324506n
                int r3 = r3.f322840b
                if (r3 == r10) goto L_0x00ea
                if (r3 != r4) goto L_0x00eb
            L_0x00ea:
                r6 = 1
            L_0x00eb:
                com.tencent.p014mm.plugin.sight.base.SightVideoJNI.mirrorCameraData(r2, r11, r5, r6)
                long r3 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r12)
                i72.g r5 = i72.C108377g.this
                i72.c r5 = r5.f324490H
                r5.mo158893a(r3)
            L_0x00f9:
                i72.g r3 = i72.C108377g.this
                boolean r3 = i72.C108377g.m146804a(r3, r2)
                long r4 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r12)
                if (r3 == 0) goto L_0x010c
                i72.g r3 = i72.C108377g.this
                i72.c r3 = r3.f324491I
                r3.mo158893a(r4)
            L_0x010c:
                r16 = r2
                r2 = r1
                r1 = r16
                goto L_0x019f
            L_0x0113:
                long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                i72.g r5 = i72.C108377g.this
                boolean r11 = r5.f324498Q
                if (r11 != 0) goto L_0x013a
                i72.s r11 = r5.f324501f
                int r12 = r11.f324562c
                int r11 = r11.f324561b
                gj.f r5 = r5.f324506n
                int r5 = r5.f322840b
                if (r5 == r10) goto L_0x012b
                if (r5 != r4) goto L_0x012c
            L_0x012b:
                r6 = 1
            L_0x012c:
                com.tencent.p014mm.plugin.sight.base.SightVideoJNI.mirrorCameraData(r1, r12, r11, r6)
                long r4 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)
                i72.g r6 = i72.C108377g.this
                i72.c r6 = r6.f324490H
                r6.mo158893a(r4)
            L_0x013a:
                i72.g r4 = i72.C108377g.this
                boolean r5 = r4.f324517y
                if (r5 == 0) goto L_0x0156
                byte[] r5 = r4.f324516x
                if (r5 == 0) goto L_0x0156
                android.graphics.Point r6 = r4.f324514v
                int r7 = r6.x
                android.graphics.Point r4 = r4.f324513u
                int r4 = r4.y
                int r6 = r6.y
                com.tencent.p014mm.plugin.sight.base.SightVideoJNI.paddingYuvData16(r1, r5, r7, r4, r6)
                i72.g r4 = i72.C108377g.this
                byte[] r4 = r4.f324516x
                goto L_0x0157
            L_0x0156:
                r4 = r1
            L_0x0157:
                i72.g r5 = i72.C108377g.this
                boolean r5 = i72.C108377g.m146804a(r5, r4)
                long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)
                if (r5 == 0) goto L_0x016a
                i72.g r6 = i72.C108377g.this
                i72.c r6 = r6.f324491I
                r6.mo158893a(r2)
            L_0x016a:
                i72.g r2 = i72.C108377g.this
                boolean r3 = r2.f324517y
                if (r3 == 0) goto L_0x0175
                byte[] r2 = r2.f324516x
                if (r2 == 0) goto L_0x0175
                goto L_0x0182
            L_0x0175:
                if (r5 == 0) goto L_0x0182
                j72.l r2 = j72.C98921l.f289964d
                int r1 = r1.length
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                byte[] r1 = r2.mo126905m(r1)
            L_0x0182:
                i72.g r2 = i72.C108377g.this
                boolean r3 = r2.f324517y
                if (r3 == 0) goto L_0x019b
                byte[] r3 = r2.f324516x
                if (r3 == 0) goto L_0x019b
                if (r5 == 0) goto L_0x0199
                j72.l r5 = j72.C98921l.f289964d
                int r3 = r3.length
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                byte[] r3 = r5.mo126905m(r3)
            L_0x0199:
                r2.f324516x = r3
            L_0x019b:
                r2 = r1
                r1 = r4
                goto L_0x019f
            L_0x019e:
                r2 = r1
            L_0x019f:
                i72.g r3 = i72.C108377g.this
                r3.f324493K = r1
                i72.g r1 = i72.C108377g.this
                i72.g$c r3 = r1.f324485C
                i72.g$c r4 = i72.C108377g.C108380c.Preview
                if (r3 != r4) goto L_0x01b1
                i72.c r1 = r1.f324487E
                r1.mo158893a(r8)
                goto L_0x01ba
            L_0x01b1:
                i72.g$c r4 = i72.C108377g.C108380c.Recording
                if (r3 != r4) goto L_0x01ba
                i72.c r1 = r1.f324486D
                r1.mo158893a(r8)
            L_0x01ba:
                i72.g r1 = i72.C108377g.this
                gj.z r1 = r1.f324503h
                r1.mo158257a(r2)
                return
            L_0x01c2:
                java.lang.String r1 = "onPreviewFrame, frame data is null!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i72.C108377g.C108378a.onPreviewFrame(byte[], android.hardware.Camera):void");
        }
    }

    /* renamed from: i72.g$b */
    public class C108379b implements Camera.AutoFocusCallback {
        public C108379b() {
        }

        public void onAutoFocus(boolean z, Camera camera) {
            Log.m105927v("MicroMsg.MMSightCamera", "auto focus callback success %s, status: %s", Boolean.valueOf(z), C108377g.this.f324485C);
            C108377g.f324482R = true;
        }
    }

    /* renamed from: i72.g$c */
    public enum C108380c {
        Preview,
        Recording,
        Stoping
    }

    /* renamed from: i72.g$d */
    public class C108381d extends MMHandler {

        /* renamed from: a */
        public boolean f324525a = false;

        /* renamed from: b */
        public float f324526b;

        /* renamed from: c */
        public float f324527c;

        /* renamed from: d */
        public int f324528d;

        /* renamed from: e */
        public int f324529e;

        public C108381d(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public Rect mo158919a(float f, float f2, float f3, int i, int i2) {
            float f4 = f3 * 80.0f;
            float f5 = f4 / 2.0f;
            float f6 = (((f / ((float) i)) * 2000.0f) - 1000.0f) - f5;
            float f7 = (((f2 / ((float) i2)) * 2000.0f) - 1000.0f) - f5;
            RectF rectF = new RectF();
            rectF.set(f6, f7, f6 + f4, f4 + f7);
            int round = Math.round(rectF.left);
            int i3 = -1000;
            if (round > 1000) {
                round = 1000;
            } else if (round < -1000) {
                round = -1000;
            }
            int round2 = Math.round(rectF.top);
            if (round2 > 1000) {
                round2 = 1000;
            } else if (round2 < -1000) {
                round2 = -1000;
            }
            int round3 = Math.round(rectF.right);
            if (round3 > 1000) {
                round3 = 1000;
            } else if (round3 < -1000) {
                round3 = -1000;
            }
            int round4 = Math.round(rectF.bottom);
            if (round4 > 1000) {
                i3 = 1000;
            } else if (round4 >= -1000) {
                i3 = round4;
            }
            return new Rect(round, round2, round3, i3);
        }

        /* renamed from: b */
        public void mo158920b(C107848z zVar) {
            if (zVar == null) {
                Log.m105928w("MicroMsg.MMSightCamera", "want to auto focus, but camera is null, do nothing");
            } else if (!C108377g.f324482R) {
                Log.m105928w("MicroMsg.MMSightCamera", "auto focus not back");
            } else {
                C108377g.f324482R = false;
                try {
                    Log.m105924i("MicroMsg.MMSightCamera", "triggerAutoFocus");
                    Camera camera = zVar.f322936a;
                    if (camera != null) {
                        camera.cancelAutoFocus();
                    }
                    zVar.mo158258b(C108377g.this.f324496N);
                } catch (Exception e) {
                    Log.m105929w("MicroMsg.MMSightCamera", "autofocus fail, exception %s", e.getMessage());
                    C108377g.f324482R = true;
                }
            }
        }

        public void handleMessage(Message message) {
            Message message2 = message;
            int i = message2.what;
            boolean z = true;
            if (i != 4353) {
                if (i == 4354) {
                    C107848z zVar = (C107848z) message2.obj;
                    if (this.f324528d == 0 || this.f324529e == 0 || C11171e.m11044a(14)) {
                        mo158920b(zVar);
                        return;
                    }
                    float f = this.f324526b;
                    float f2 = this.f324527c;
                    int i2 = this.f324528d;
                    int i3 = this.f324529e;
                    if (zVar == null) {
                        Log.m105928w("MicroMsg.MMSightCamera", "want to auto focus, but camera is null, do nothing");
                    } else if (!C108377g.f324482R) {
                        Log.m105928w("MicroMsg.MMSightCamera", "auto focus not back");
                    } else {
                        C108377g.f324482R = false;
                        try {
                            Camera camera = zVar.f322936a;
                            if (camera != null) {
                                camera.cancelAutoFocus();
                            }
                            Log.m105925i("MicroMsg.MMSightCamera", "ashutest:: touch %f %f, display %d %d", Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i2), Integer.valueOf(i3));
                            String str = "auto";
                            Rect a = mo158919a(f, f2, 1.0f, i2, i3);
                            Rect a2 = mo158919a(f, f2, 1.5f, i2, i3);
                            Log.m105925i("MicroMsg.MMSightCamera", "ashutest:: focus rect %s, meter rect %s", a, a2);
                            Camera.Parameters c = zVar.mo158259c();
                            List<String> supportedFocusModes = c.getSupportedFocusModes();
                            if (supportedFocusModes != null) {
                                String str2 = str;
                                if (supportedFocusModes.contains(str2)) {
                                    c.setFocusMode(str2);
                                }
                            }
                            if (c.getMaxNumFocusAreas() > 0) {
                                ArrayList arrayList = new ArrayList(1);
                                arrayList.add(new Camera.Area(a, 1000));
                                c.setFocusAreas(arrayList);
                            }
                            if (c.getMaxNumMeteringAreas() > 0) {
                                ArrayList arrayList2 = new ArrayList(1);
                                arrayList2.add(new Camera.Area(a2, 1000));
                                c.setMeteringAreas(arrayList2);
                            }
                            zVar.mo158262f(c);
                            zVar.mo158258b(C108377g.this.f324496N);
                        } catch (Exception e) {
                            Log.m105929w("MicroMsg.MMSightCamera", "autofocus with area fail, exception %s", e.getMessage());
                            C108377g.f324482R = true;
                        }
                    }
                }
            } else if (!this.f324525a) {
                Camera camera2 = (Camera) message2.obj;
                Camera.Parameters parameters = camera2.getParameters();
                Log.m105925i("MicroMsg.MMSightCamera", "zoomed %s curZoomStep %s params.getZoom() %s", Boolean.FALSE, 0, Integer.valueOf(parameters.getZoom()));
                int zoom = parameters.getZoom() + 0;
                if (zoom <= 0) {
                    zoom = 0;
                } else {
                    sendMessageDelayed(obtainMessage(4353, message2.obj), 20);
                    z = false;
                }
                parameters.setZoom(zoom);
                try {
                    camera2.setParameters(parameters);
                } catch (Exception unused) {
                }
                if (z) {
                    this.f324528d = 0;
                    this.f324529e = 0;
                }
            }
        }
    }

    public C108377g(VideoTransPara videoTransPara, int i) {
        this.f324492J = videoTransPara;
    }

    /* renamed from: a */
    public static boolean m146804a(C108377g gVar, byte[] bArr) {
        gVar.getClass();
        Util.currentTicks();
        List<C108382h> list = gVar.f324483A;
        boolean z = false;
        if (!(list == null || ((ArrayList) list).size() == 0)) {
            Iterator it = ((ArrayList) gVar.f324483A).iterator();
            while (it.hasNext()) {
                z |= ((C108382h) it.next()).mo157927f(bArr);
            }
        }
        return z;
    }

    /* renamed from: b */
    public final void mo158897b() {
        try {
            SensorManager sensorManager = this.f324507o;
            if (!(sensorManager == null || this.f324508p == null)) {
                sensorManager.unregisterListener(this);
            }
            Log.m105924i("MicroMsg.MMSightCamera", this.f324486D.mo158895c());
            Log.m105924i("MicroMsg.MMSightCamera", this.f324487E.mo158895c());
            Log.m105924i("MicroMsg.MMSightCamera", this.f324488F.mo158895c());
            Log.m105924i("MicroMsg.MMSightCamera", this.f324489G.mo158895c());
            Log.m105924i("MicroMsg.MMSightCamera", this.f324490H.mo158895c());
            Log.m105924i("MicroMsg.MMSightCamera", this.f324491I.mo158895c());
            if (this.f324503h != null) {
                long currentTicks = Util.currentTicks();
                Log.m105925i("MicroMsg.MMSightCamera", "release camera beg, %s", Looper.myLooper());
                this.f324497P.removeCallbacksAndMessages((Object) null);
                this.f324497P.f324525a = true;
                this.f324503h.mo158263g((Camera.PreviewCallback) null);
                this.f324503h.mo158268l();
                this.f324503h.mo158260d();
                this.f324503h = null;
                this.f324504i = false;
                Log.m105925i("MicroMsg.MMSightCamera", "release camera end, use %dms, %s", Long.valueOf(Util.ticksToNow(currentTicks)), Looper.myLooper());
            }
            this.f324509q = 0.0f;
            this.f324510r = 0.0f;
            this.f324511s = 0.0f;
            f324482R = true;
            this.f324512t = null;
            this.f324495M = false;
            this.f324514v = null;
            this.f324515w = null;
            this.f324493K = null;
            this.f324484B = false;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMSightCamera", e, "cameraRelease error", new Object[0]);
        }
    }

    /* renamed from: c */
    public int mo158898c() {
        C107831f fVar = this.f324506n;
        if (fVar == null || !this.f324504i) {
            return -1;
        }
        return fVar.f322840b;
    }

    /* renamed from: d */
    public int mo158899d() {
        C107831f fVar;
        if (!(this.f324503h == null || (fVar = this.f324506n) == null)) {
            try {
                if (!this.f324517y || this.f324516x == null) {
                    Point point = this.f324515w;
                    if (point == null) {
                        int i = fVar.f322840b;
                        if (i != 0) {
                            if (i != 180) {
                                return this.f324501f.f324562c;
                            }
                        }
                        return this.f324501f.f324561b;
                    }
                    int i2 = fVar.f322840b;
                    if (i2 != 0) {
                        if (i2 != 180) {
                            return point.x;
                        }
                    }
                    return point.y;
                }
                int i3 = fVar.f322840b;
                if (i3 != 0) {
                    if (i3 != 180) {
                        return this.f324514v.x;
                    }
                }
                return this.f324514v.y;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MMSightCamera", "getPreviewHeight: %s", e.getMessage());
            }
        }
        return 0;
    }

    /* renamed from: e */
    public int mo158900e() {
        C107831f fVar;
        if (!(this.f324503h == null || (fVar = this.f324506n) == null)) {
            try {
                if (!this.f324517y || this.f324516x == null) {
                    Point point = this.f324515w;
                    if (point == null) {
                        int i = fVar.f322840b;
                        if (i != 0) {
                            if (i != 180) {
                                return this.f324501f.f324561b;
                            }
                        }
                        return this.f324501f.f324562c;
                    }
                    int i2 = fVar.f322840b;
                    if (i2 != 0) {
                        if (i2 != 180) {
                            return point.y;
                        }
                    }
                    return point.x;
                }
                int i3 = fVar.f322840b;
                if (i3 != 0) {
                    if (i3 != 180) {
                        return this.f324514v.y;
                    }
                }
                return this.f324514v.x;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MMSightCamera", "getPreviewWidth: %s", e.getMessage());
            }
        }
        return 0;
    }

    /* renamed from: f */
    public boolean mo158901f(Context context, boolean z) {
        Object obj;
        Context context2 = context;
        boolean z2 = z;
        if (!C108388k.f324540d.f324558h) {
            SensorManager sensorManager = (SensorManager) MMApplicationContext.getContext().getSystemService("sensor");
            this.f324507o = sensorManager;
            this.f324508p = sensorManager.getDefaultSensor(1);
        } else if (C107835h0.f322845b.f322827z == 0 && this.f324507o == null && this.f324508p == null) {
            SensorManager sensorManager2 = (SensorManager) MMApplicationContext.getContext().getSystemService("sensor");
            this.f324507o = sensorManager2;
            this.f324508p = sensorManager2.getDefaultSensor(1);
        }
        if (this.f324503h == null) {
            mo158897b();
            this.f324498Q = z2;
            if (z2) {
                try {
                    this.f324505j = C107828e.m146098a();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.MMSightCamera", e, "try to get cameraid error %s, useBackCamera: %s", e.getMessage(), Boolean.valueOf(this.f324498Q));
                    this.f324505j = 0;
                }
            } else {
                this.f324505j = C107828e.m146099b();
            }
            Log.m105925i("MicroMsg.MMSightCamera", "use camera id %d, SrvDeviceInfo id %d", Integer.valueOf(this.f324505j), Integer.valueOf(C107835h0.f322845b.f322787B));
            this.f324495M = false;
            this.f324512t = context2;
            C108391q qVar = new C108391q();
            int i = this.f324505j;
            C107831f fVar = null;
            if (context2 != null) {
                long nowMilliSecond = Util.nowMilliSecond();
                long id = Thread.currentThread().getId();
                Object obj2 = qVar.f324548a;
                synchronized (obj2) {
                    try {
                        qVar.f324549b = false;
                        qVar.f324550c = null;
                        obj = obj2;
                        try {
                            C108390p pVar = new C108390p(qVar, id, nowMilliSecond, context, i);
                            ThreadPool.post(pVar, "SightCamera_openCamera");
                            qVar.f324548a.wait(30000);
                        } catch (InterruptedException e2) {
                            Log.m105921e("MicroMsg.SightCamera.OpenCameraThread", "Lock wait failed e:%s", e2.getMessage());
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                        C107831f fVar2 = qVar.f324550c;
                        if (fVar2 == null || fVar2.f322839a == null) {
                            qVar.f324549b = true;
                            Log.m105921e("MicroMsg.SightCamera.OpenCameraThread", "Open Camera Timeout:%d", Long.valueOf(Util.nowMilliSecond() - nowMilliSecond));
                        } else {
                            Log.m105925i("MicroMsg.SightCamera.OpenCameraThread", "Open Camera Succ thread:%d Time:%d camera:%s", Long.valueOf(id), Long.valueOf(Util.nowMilliSecond() - nowMilliSecond), qVar.f324550c.f322839a);
                            fVar = qVar.f324550c;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj2;
                        throw th;
                    }
                }
            }
            this.f324506n = fVar;
            Log.m105925i("MicroMsg.MMSightCamera", "open camera end, %s", Looper.myLooper());
            C107831f fVar3 = this.f324506n;
            if (fVar3 == null) {
                Log.m105925i("MicroMsg.MMSightCamera", "open camera FAILED, %s", Looper.myLooper());
                mo158909n();
                return false;
            }
            C107848z zVar = fVar3.f322839a;
            this.f324503h = zVar;
            this.f324497P.f324525a = false;
            this.f324501f.f324564e = fVar3.f322840b;
            if (zVar == null) {
                Log.m105920e("MicroMsg.MMSightCamera", "start camera FAILED!");
                mo158909n();
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo158902g(C107848z zVar) {
        if (zVar == null) {
            return false;
        }
        try {
            Camera.Parameters c = zVar.mo158259c();
            List<String> supportedFocusModes = c.getSupportedFocusModes();
            if (supportedFocusModes != null && supportedFocusModes.contains("continuous-picture")) {
                Log.m105924i("MicroMsg.MMSightCameraSetting", "support continuous picture");
                c.setFocusMode("continuous-picture");
            } else if (supportedFocusModes != null && supportedFocusModes.contains("continuous-video")) {
                Log.m105924i("MicroMsg.MMSightCameraSetting", "support continuous video");
                c.setFocusMode("continuous-video");
            } else if (supportedFocusModes == null || !supportedFocusModes.contains("auto")) {
                Log.m105924i("MicroMsg.MMSightCameraSetting", "not support continuous video or auto focus");
            } else {
                Log.m105924i("MicroMsg.MMSightCameraSetting", "support auto focus");
                c.setFocusMode("auto");
            }
            zVar.mo158262f(c);
            return true;
        } catch (Exception e) {
            Log.m105925i("MicroMsg.MMSightCameraSetting", "setFocusMode Exception, %s, %s", Looper.myLooper(), e.getMessage());
            return false;
        }
    }

    /* renamed from: h */
    public boolean mo158903h(C107848z zVar) {
        if (zVar == null) {
            return false;
        }
        try {
            Log.m105924i("MicroMsg.MMSightCameraSetting", "safeSetMetering");
            Camera.Parameters c = zVar.mo158259c();
            if (c.getMaxNumMeteringAreas() > 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Camera.Area(new Rect(-1000, -1000, 1000, 1000), 600));
                c.setMeteringAreas(arrayList);
            }
            zVar.mo158262f(c);
            return true;
        } catch (Exception e) {
            Log.m105925i("MicroMsg.MMSightCameraSetting", "safeSetMetering Exception, %s, %s", Looper.myLooper(), e.getMessage());
            return false;
        }
    }

    /* renamed from: i */
    public boolean mo158904i(C107848z zVar) {
        if (zVar == null) {
            return false;
        }
        try {
            Log.m105924i("MicroMsg.MMSightCameraSetting", "safeSetPreviewFormat");
            Camera.Parameters c = zVar.mo158259c();
            List<Integer> supportedPreviewFormats = c.getSupportedPreviewFormats();
            if (supportedPreviewFormats == null || !supportedPreviewFormats.contains(17)) {
                Log.m105920e("MicroMsg.MMSightCameraSetting", "not support YCbCr_420_SP");
            }
            c.setPreviewFormat(17);
            zVar.mo158262f(c);
            return true;
        } catch (Exception e) {
            Log.m105925i("MicroMsg.MMSightCameraSetting", "setPreviewFormat Exception, %s, %s", Looper.myLooper(), e.getMessage());
            return false;
        }
    }

    /* renamed from: j */
    public boolean mo158905j(C107848z zVar, boolean z) {
        if (zVar == null) {
            return false;
        }
        try {
            Camera.Parameters c = zVar.mo158259c();
            if (z) {
                mo158916s(c);
            } else {
                mo158915r(c);
            }
            Log.m105925i("MicroMsg.MMSightCameraSetting", "use fix mode %B, supported preview frame rates %s", Boolean.valueOf(z), c.getSupportedPreviewFrameRates());
            zVar.mo158262f(c);
            return true;
        } catch (Exception e) {
            Log.m105925i("MicroMsg.MMSightCameraSetting", "setPreviewFrameRate Exception, %s, %s", Looper.myLooper(), e.getMessage());
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a6, code lost:
        if (r2.f324531a == null) goto L_0x00a8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01ae A[Catch:{ Exception -> 0x0441 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0275 A[Catch:{ Exception -> 0x0441 }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0383 A[ADDED_TO_REGION, Catch:{ Exception -> 0x0441 }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x03e9 A[ADDED_TO_REGION, Catch:{ Exception -> 0x0441 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00db A[Catch:{ Exception -> 0x0441 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e9 A[Catch:{ Exception -> 0x0441 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0130 A[Catch:{ Exception -> 0x0441 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0154 A[Catch:{ Exception -> 0x0441 }] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo158906k(p156gj.C107848z r21, boolean r22, int r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r23
            java.lang.String r3 = "MicroMsg.MMSightCameraSetting"
            r4 = 0
            if (r0 != 0) goto L_0x000c
            return r4
        L_0x000c:
            r5 = 2
            r6 = 1
            android.hardware.Camera$Parameters r7 = r21.mo158259c()     // Catch:{ Exception -> 0x0441 }
            android.content.Context r8 = r1.f324512t     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r8 = f72.C97842b.m126290g(r8)     // Catch:{ Exception -> 0x0441 }
            boolean r9 = r1.f324498Q     // Catch:{ Exception -> 0x0441 }
            if (r9 == 0) goto L_0x0030
            i72.b r9 = i72.C108375b.m146794b()     // Catch:{ Exception -> 0x0441 }
            java.util.List r10 = r7.getSupportedPreviewSizes()     // Catch:{ Exception -> 0x0441 }
            java.util.List r11 = r7.getSupportedPictureSizes()     // Catch:{ Exception -> 0x0441 }
            gj.f r12 = r1.f324506n     // Catch:{ Exception -> 0x0441 }
            int r12 = r12.f322840b     // Catch:{ Exception -> 0x0441 }
            r9.mo158891e(r10, r11, r12)     // Catch:{ Exception -> 0x0441 }
            goto L_0x0043
        L_0x0030:
            i72.b r9 = i72.C108375b.m146794b()     // Catch:{ Exception -> 0x0441 }
            java.util.List r10 = r7.getSupportedPreviewSizes()     // Catch:{ Exception -> 0x0441 }
            java.util.List r11 = r7.getSupportedPictureSizes()     // Catch:{ Exception -> 0x0441 }
            gj.f r12 = r1.f324506n     // Catch:{ Exception -> 0x0441 }
            int r12 = r12.f322840b     // Catch:{ Exception -> 0x0441 }
            r9.mo158892f(r10, r11, r12)     // Catch:{ Exception -> 0x0441 }
        L_0x0043:
            r9 = 90
            r10 = 270(0x10e, float:3.78E-43)
            if (r22 == 0) goto L_0x005a
            gj.f r11 = r1.f324506n     // Catch:{ Exception -> 0x0441 }
            int r11 = r11.f322840b     // Catch:{ Exception -> 0x0441 }
            if (r11 == r9) goto L_0x0054
            if (r11 != r10) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r11 = 0
            goto L_0x0055
        L_0x0054:
            r11 = 1
        L_0x0055:
            com.tencent.mm.modelcontrol.VideoTransPara r12 = r1.f324492J     // Catch:{ Exception -> 0x0441 }
            i72.C108388k.m146835a(r7, r11, r12)     // Catch:{ Exception -> 0x0441 }
        L_0x005a:
            if (r2 == 0) goto L_0x008c
            if (r2 == r6) goto L_0x0077
            if (r2 == r5) goto L_0x0075
            i72.r r2 = i72.C108388k.f324540d     // Catch:{ Exception -> 0x0441 }
            int r2 = r2.f324557g     // Catch:{ Exception -> 0x0441 }
            gj.f r11 = r1.f324506n     // Catch:{ Exception -> 0x0441 }
            int r11 = r11.f322840b     // Catch:{ Exception -> 0x0441 }
            if (r11 == r9) goto L_0x006f
            if (r11 != r10) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r11 = 0
            goto L_0x0070
        L_0x006f:
            r11 = 1
        L_0x0070:
            i72.i$d r2 = i72.C108383i.m146830d(r7, r8, r2, r4, r11)     // Catch:{ Exception -> 0x0441 }
            goto L_0x00a0
        L_0x0075:
            r2 = 0
            goto L_0x00a0
        L_0x0077:
            i72.r r2 = i72.C108388k.f324540d     // Catch:{ Exception -> 0x0441 }
            int r2 = r2.f324557g     // Catch:{ Exception -> 0x0441 }
            gj.f r11 = r1.f324506n     // Catch:{ Exception -> 0x0441 }
            int r11 = r11.f322840b     // Catch:{ Exception -> 0x0441 }
            if (r11 == r9) goto L_0x0086
            if (r11 != r10) goto L_0x0084
            goto L_0x0086
        L_0x0084:
            r11 = 0
            goto L_0x0087
        L_0x0086:
            r11 = 1
        L_0x0087:
            i72.i$d r2 = i72.C108383i.m146831e(r7, r8, r2, r11)     // Catch:{ Exception -> 0x0441 }
            goto L_0x00a0
        L_0x008c:
            i72.r r2 = i72.C108388k.f324540d     // Catch:{ Exception -> 0x0441 }
            int r2 = r2.f324557g     // Catch:{ Exception -> 0x0441 }
            gj.f r11 = r1.f324506n     // Catch:{ Exception -> 0x0441 }
            int r11 = r11.f322840b     // Catch:{ Exception -> 0x0441 }
            if (r11 == r9) goto L_0x009b
            if (r11 != r10) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r11 = 0
            goto L_0x009c
        L_0x009b:
            r11 = 1
        L_0x009c:
            i72.i$d r2 = i72.C108383i.m146830d(r7, r8, r2, r4, r11)     // Catch:{ Exception -> 0x0441 }
        L_0x00a0:
            java.lang.String r11 = "MicroMsg.MMSightCamera"
            if (r2 == 0) goto L_0x00a8
            android.graphics.Point r12 = r2.f324531a     // Catch:{ Exception -> 0x0441 }
            if (r12 != 0) goto L_0x00d4
        L_0x00a8:
            java.lang.String r2 = "fuck, preview size still null!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r2)     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r2 = new android.graphics.Point     // Catch:{ Exception -> 0x0441 }
            int r12 = r8.x     // Catch:{ Exception -> 0x0441 }
            int r13 = r8.y     // Catch:{ Exception -> 0x0441 }
            int r12 = java.lang.Math.min(r12, r13)     // Catch:{ Exception -> 0x0441 }
            int r13 = r8.x     // Catch:{ Exception -> 0x0441 }
            int r8 = r8.y     // Catch:{ Exception -> 0x0441 }
            int r8 = java.lang.Math.max(r13, r8)     // Catch:{ Exception -> 0x0441 }
            r2.<init>(r12, r8)     // Catch:{ Exception -> 0x0441 }
            r8 = 2100(0x834, float:2.943E-42)
            gj.f r12 = r1.f324506n     // Catch:{ Exception -> 0x0441 }
            int r12 = r12.f322840b     // Catch:{ Exception -> 0x0441 }
            if (r12 == r9) goto L_0x00cf
            if (r12 != r10) goto L_0x00cd
            goto L_0x00cf
        L_0x00cd:
            r12 = 0
            goto L_0x00d0
        L_0x00cf:
            r12 = 1
        L_0x00d0:
            i72.i$d r2 = i72.C108383i.m146832f(r7, r2, r8, r12)     // Catch:{ Exception -> 0x0441 }
        L_0x00d4:
            i72.C108388k.m146837c(r2)     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r8 = r2.f324531a     // Catch:{ Exception -> 0x0441 }
            if (r8 != 0) goto L_0x00e9
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0441 }
            r13 = 440(0x1b8, double:2.174E-321)
            r15 = 140(0x8c, double:6.9E-322)
            r17 = 0
            r19 = 0
            r12.idkeyStat(r13, r15, r17, r19)     // Catch:{ Exception -> 0x0441 }
            return r4
        L_0x00e9:
            i72.s r12 = r1.f324501f     // Catch:{ Exception -> 0x0441 }
            int r13 = r8.x     // Catch:{ Exception -> 0x0441 }
            r12.f324562c = r13     // Catch:{ Exception -> 0x0441 }
            int r13 = r8.y     // Catch:{ Exception -> 0x0441 }
            r12.f324561b = r13     // Catch:{ Exception -> 0x0441 }
            r1.f324514v = r8     // Catch:{ Exception -> 0x0441 }
            android.content.Context r12 = r1.f324512t     // Catch:{ Exception -> 0x0441 }
            gj.f r13 = r1.f324506n     // Catch:{ Exception -> 0x0441 }
            int r13 = r13.f322840b     // Catch:{ Exception -> 0x0441 }
            if (r13 == r9) goto L_0x0102
            if (r13 != r10) goto L_0x0100
            goto L_0x0102
        L_0x0100:
            r13 = 0
            goto L_0x0103
        L_0x0102:
            r13 = 1
        L_0x0103:
            boolean r12 = f72.C97842b.m126287d(r12, r8, r13)     // Catch:{ Exception -> 0x0441 }
            gj.f r13 = r1.f324506n     // Catch:{ Exception -> 0x0441 }
            int r13 = r13.f322840b     // Catch:{ Exception -> 0x0441 }
            java.lang.String r14 = "previewSize %s not support real scale"
            if (r13 == r9) goto L_0x0128
            if (r13 != r10) goto L_0x0112
            goto L_0x0128
        L_0x0112:
            int r13 = r8.x     // Catch:{ Exception -> 0x0441 }
            com.tencent.mm.modelcontrol.VideoTransPara r15 = r1.f324492J     // Catch:{ Exception -> 0x0441 }
            int r10 = r15.f267166d     // Catch:{ Exception -> 0x0441 }
            if (r13 < r10) goto L_0x0120
            int r10 = r8.y     // Catch:{ Exception -> 0x0441 }
            int r13 = r15.f267167e     // Catch:{ Exception -> 0x0441 }
            if (r10 >= r13) goto L_0x0137
        L_0x0120:
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0441 }
            r10[r4] = r8     // Catch:{ Exception -> 0x0441 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r11, r14, r10)     // Catch:{ Exception -> 0x0441 }
            goto L_0x0140
        L_0x0128:
            int r10 = r8.y     // Catch:{ Exception -> 0x0441 }
            com.tencent.mm.modelcontrol.VideoTransPara r13 = r1.f324492J     // Catch:{ Exception -> 0x0441 }
            int r15 = r13.f267166d     // Catch:{ Exception -> 0x0441 }
            if (r10 < r15) goto L_0x0139
            int r10 = r8.x     // Catch:{ Exception -> 0x0441 }
            int r13 = r13.f267167e     // Catch:{ Exception -> 0x0441 }
            if (r10 >= r13) goto L_0x0137
            goto L_0x0139
        L_0x0137:
            r10 = 1
            goto L_0x0141
        L_0x0139:
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0441 }
            r10[r4] = r8     // Catch:{ Exception -> 0x0441 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r11, r14, r10)     // Catch:{ Exception -> 0x0441 }
        L_0x0140:
            r10 = 0
        L_0x0141:
            java.lang.String r13 = "checkIfNeedUsePreviewLarge, needCrop: %s"
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0441 }
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r12)     // Catch:{ Exception -> 0x0441 }
            r14[r4] = r15     // Catch:{ Exception -> 0x0441 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r13, r14)     // Catch:{ Exception -> 0x0441 }
            r13 = 2147483647(0x7fffffff, float:NaN)
            r15 = 3
            if (r12 == 0) goto L_0x01ae
            i72.r r14 = i72.C108388k.f324540d     // Catch:{ Exception -> 0x0441 }
            int r14 = r14.f324551a     // Catch:{ Exception -> 0x0441 }
            if (r14 != r5) goto L_0x0185
            android.graphics.Point r2 = r2.f324533c     // Catch:{ Exception -> 0x0441 }
            r1.f324515w = r2     // Catch:{ Exception -> 0x0441 }
            int r14 = r2.x     // Catch:{ Exception -> 0x0441 }
            int r4 = r8.x     // Catch:{ Exception -> 0x0441 }
            if (r14 < r4) goto L_0x016a
            int r4 = r2.y     // Catch:{ Exception -> 0x0441 }
            int r6 = r8.y     // Catch:{ Exception -> 0x0441 }
            if (r4 >= r6) goto L_0x0189
        L_0x016a:
            gj.f r4 = r1.f324506n     // Catch:{ Exception -> 0x0441 }
            int r4 = r4.f322840b     // Catch:{ Exception -> 0x0441 }
            if (r4 == r9) goto L_0x017c
            r6 = 270(0x10e, float:3.78E-43)
            if (r4 != r6) goto L_0x0175
            goto L_0x017c
        L_0x0175:
            int r4 = f72.C97842b.m126285b(r14, r13)     // Catch:{ Exception -> 0x0441 }
            r2.x = r4     // Catch:{ Exception -> 0x0441 }
            goto L_0x0189
        L_0x017c:
            int r4 = r2.y     // Catch:{ Exception -> 0x0441 }
            int r4 = f72.C97842b.m126285b(r4, r13)     // Catch:{ Exception -> 0x0441 }
            r2.y = r4     // Catch:{ Exception -> 0x0441 }
            goto L_0x0189
        L_0x0185:
            android.graphics.Point r2 = r2.f324532b     // Catch:{ Exception -> 0x0441 }
            r1.f324515w = r2     // Catch:{ Exception -> 0x0441 }
        L_0x0189:
            android.graphics.Point r2 = new android.graphics.Point     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r4 = r1.f324515w     // Catch:{ Exception -> 0x0441 }
            int r6 = r4.x     // Catch:{ Exception -> 0x0441 }
            int r4 = r4.y     // Catch:{ Exception -> 0x0441 }
            r2.<init>(r6, r4)     // Catch:{ Exception -> 0x0441 }
            r1.f324514v = r2     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r2 = r1.f324515w     // Catch:{ Exception -> 0x0441 }
            int r4 = r2.x     // Catch:{ Exception -> 0x0441 }
            int r6 = r2.y     // Catch:{ Exception -> 0x0441 }
            int r4 = r4 * r6
            int r4 = r4 * 3
            int r4 = r4 / r5
            java.lang.String r4 = "cropSize: %s"
            r6 = 1
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0441 }
            r6 = 0
            r13[r6] = r2     // Catch:{ Exception -> 0x0441 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r13)     // Catch:{ Exception -> 0x0441 }
            goto L_0x026f
        L_0x01ae:
            i72.r r2 = i72.C108388k.f324540d     // Catch:{ Exception -> 0x0441 }
            boolean r4 = r2.f324556f     // Catch:{ Exception -> 0x0441 }
            if (r4 == 0) goto L_0x026f
            int r2 = r2.f324557g     // Catch:{ Exception -> 0x0441 }
            r4 = 1080(0x438, float:1.513E-42)
            if (r2 != r4) goto L_0x026f
            if (r10 == 0) goto L_0x026f
            gj.f r2 = r1.f324506n     // Catch:{ Exception -> 0x0441 }
            int r2 = r2.f322840b     // Catch:{ Exception -> 0x0441 }
            r4 = 8
            if (r2 == r9) goto L_0x021c
            r6 = 270(0x10e, float:3.78E-43)
            if (r2 != r6) goto L_0x01c9
            goto L_0x021c
        L_0x01c9:
            int r2 = r8.x     // Catch:{ Exception -> 0x0441 }
            int r2 = r2 / r5
            int r6 = f72.C97842b.m126302s(r2)     // Catch:{ Exception -> 0x0441 }
            int r14 = r8.y     // Catch:{ Exception -> 0x0441 }
            int r14 = r14 / r5
            int r19 = f72.C97842b.m126302s(r14)     // Catch:{ Exception -> 0x0441 }
            int r6 = r6 - r2
            int r2 = java.lang.Math.abs(r6)     // Catch:{ Exception -> 0x0441 }
            if (r2 >= r4) goto L_0x01e6
            int r19 = r19 - r14
            int r2 = java.lang.Math.abs(r19)     // Catch:{ Exception -> 0x0441 }
            if (r2 < r4) goto L_0x026f
        L_0x01e6:
            android.graphics.Point r2 = new android.graphics.Point     // Catch:{ Exception -> 0x0441 }
            int r4 = r8.x     // Catch:{ Exception -> 0x0441 }
            int r6 = r8.y     // Catch:{ Exception -> 0x0441 }
            r2.<init>(r4, r6)     // Catch:{ Exception -> 0x0441 }
            r1.f324515w = r2     // Catch:{ Exception -> 0x0441 }
            int r4 = r8.x     // Catch:{ Exception -> 0x0441 }
            int r4 = f72.C97842b.m126285b(r4, r13)     // Catch:{ Exception -> 0x0441 }
            r2.y = r4     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r2 = r1.f324515w     // Catch:{ Exception -> 0x0441 }
            int r4 = r8.y     // Catch:{ Exception -> 0x0441 }
            int r4 = f72.C97842b.m126285b(r4, r13)     // Catch:{ Exception -> 0x0441 }
            r2.x = r4     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r2 = new android.graphics.Point     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r4 = r1.f324515w     // Catch:{ Exception -> 0x0441 }
            int r6 = r4.x     // Catch:{ Exception -> 0x0441 }
            int r4 = r4.y     // Catch:{ Exception -> 0x0441 }
            r2.<init>(r6, r4)     // Catch:{ Exception -> 0x0441 }
            r1.f324514v = r2     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r2 = r1.f324515w     // Catch:{ Exception -> 0x0441 }
            int r4 = r2.x     // Catch:{ Exception -> 0x0441 }
            int r2 = r2.y     // Catch:{ Exception -> 0x0441 }
            int r4 = r4 * r2
            int r4 = r4 * 3
            int r4 = r4 / r5
            goto L_0x026e
        L_0x021c:
            int r2 = r8.y     // Catch:{ Exception -> 0x0441 }
            int r2 = r2 / r5
            int r6 = f72.C97842b.m126302s(r2)     // Catch:{ Exception -> 0x0441 }
            int r14 = r8.x     // Catch:{ Exception -> 0x0441 }
            int r14 = r14 / r5
            int r19 = f72.C97842b.m126302s(r14)     // Catch:{ Exception -> 0x0441 }
            int r6 = r6 - r2
            int r2 = java.lang.Math.abs(r6)     // Catch:{ Exception -> 0x0441 }
            if (r2 >= r4) goto L_0x0239
            int r19 = r19 - r14
            int r2 = java.lang.Math.abs(r19)     // Catch:{ Exception -> 0x0441 }
            if (r2 < r4) goto L_0x026f
        L_0x0239:
            android.graphics.Point r2 = new android.graphics.Point     // Catch:{ Exception -> 0x0441 }
            int r4 = r8.x     // Catch:{ Exception -> 0x0441 }
            int r6 = r8.y     // Catch:{ Exception -> 0x0441 }
            r2.<init>(r4, r6)     // Catch:{ Exception -> 0x0441 }
            r1.f324515w = r2     // Catch:{ Exception -> 0x0441 }
            int r4 = r8.y     // Catch:{ Exception -> 0x0441 }
            int r4 = f72.C97842b.m126285b(r4, r13)     // Catch:{ Exception -> 0x0441 }
            r2.y = r4     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r2 = r1.f324515w     // Catch:{ Exception -> 0x0441 }
            int r4 = r8.x     // Catch:{ Exception -> 0x0441 }
            int r4 = f72.C97842b.m126285b(r4, r13)     // Catch:{ Exception -> 0x0441 }
            r2.x = r4     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r2 = new android.graphics.Point     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r4 = r1.f324515w     // Catch:{ Exception -> 0x0441 }
            int r6 = r4.x     // Catch:{ Exception -> 0x0441 }
            int r4 = r4.y     // Catch:{ Exception -> 0x0441 }
            r2.<init>(r6, r4)     // Catch:{ Exception -> 0x0441 }
            r1.f324514v = r2     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r2 = r1.f324515w     // Catch:{ Exception -> 0x0441 }
            int r4 = r2.x     // Catch:{ Exception -> 0x0441 }
            int r2 = r2.y     // Catch:{ Exception -> 0x0441 }
            int r4 = r4 * r2
            int r4 = r4 * 3
            int r4 = r4 / r5
        L_0x026e:
            r12 = 1
        L_0x026f:
            i72.r r2 = i72.C108388k.f324540d     // Catch:{ Exception -> 0x0441 }
            boolean r4 = r2.f324556f     // Catch:{ Exception -> 0x0441 }
            if (r4 == 0) goto L_0x0376
            gj.f r4 = r1.f324506n     // Catch:{ Exception -> 0x0441 }
            int r4 = r4.f322840b     // Catch:{ Exception -> 0x0441 }
            r6 = 1061158912(0x3f400000, float:0.75)
            r13 = 720(0x2d0, float:1.009E-42)
            if (r4 == r9) goto L_0x02ff
            r9 = 270(0x10e, float:3.78E-43)
            if (r4 != r9) goto L_0x0285
            goto L_0x02ff
        L_0x0285:
            if (r10 == 0) goto L_0x0376
            int r2 = r2.f324557g     // Catch:{ Exception -> 0x0441 }
            r4 = 1080(0x438, float:1.513E-42)
            if (r2 != r4) goto L_0x02c2
            android.graphics.Point r2 = r1.f324515w     // Catch:{ Exception -> 0x0441 }
            if (r2 != 0) goto L_0x0294
            int r4 = r8.y     // Catch:{ Exception -> 0x0441 }
            goto L_0x0296
        L_0x0294:
            int r4 = r2.y     // Catch:{ Exception -> 0x0441 }
        L_0x0296:
            int r4 = r4 / r5
            if (r2 != 0) goto L_0x029c
            int r2 = r8.x     // Catch:{ Exception -> 0x0441 }
            goto L_0x029e
        L_0x029c:
            int r2 = r2.x     // Catch:{ Exception -> 0x0441 }
        L_0x029e:
            int r2 = r2 / r5
            android.graphics.Point r6 = new android.graphics.Point     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r9 = r1.f324515w     // Catch:{ Exception -> 0x0441 }
            if (r9 != 0) goto L_0x02a8
            int r9 = r8.y     // Catch:{ Exception -> 0x0441 }
            goto L_0x02aa
        L_0x02a8:
            int r9 = r9.y     // Catch:{ Exception -> 0x0441 }
        L_0x02aa:
            int r4 = f72.C97842b.m126303t(r4, r9)     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r9 = r1.f324515w     // Catch:{ Exception -> 0x0441 }
            if (r9 != 0) goto L_0x02b5
            int r9 = r8.x     // Catch:{ Exception -> 0x0441 }
            goto L_0x02b7
        L_0x02b5:
            int r9 = r9.x     // Catch:{ Exception -> 0x0441 }
        L_0x02b7:
            int r2 = f72.C97842b.m126303t(r2, r9)     // Catch:{ Exception -> 0x0441 }
            r6.<init>(r4, r2)     // Catch:{ Exception -> 0x0441 }
            r1.f324514v = r6     // Catch:{ Exception -> 0x0441 }
            goto L_0x0376
        L_0x02c2:
            if (r2 != r13) goto L_0x0376
            android.graphics.Point r2 = r1.f324515w     // Catch:{ Exception -> 0x0441 }
            if (r2 != 0) goto L_0x02cb
            int r4 = r8.y     // Catch:{ Exception -> 0x0441 }
            goto L_0x02cd
        L_0x02cb:
            int r4 = r2.y     // Catch:{ Exception -> 0x0441 }
        L_0x02cd:
            float r4 = (float) r4     // Catch:{ Exception -> 0x0441 }
            float r4 = r4 * r6
            int r4 = (int) r4     // Catch:{ Exception -> 0x0441 }
            if (r2 != 0) goto L_0x02d6
            int r2 = r8.x     // Catch:{ Exception -> 0x0441 }
            goto L_0x02d8
        L_0x02d6:
            int r2 = r2.x     // Catch:{ Exception -> 0x0441 }
        L_0x02d8:
            float r2 = (float) r2     // Catch:{ Exception -> 0x0441 }
            float r2 = r2 * r6
            int r2 = (int) r2     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r6 = new android.graphics.Point     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r9 = r1.f324515w     // Catch:{ Exception -> 0x0441 }
            if (r9 != 0) goto L_0x02e5
            int r9 = r8.y     // Catch:{ Exception -> 0x0441 }
            goto L_0x02e7
        L_0x02e5:
            int r9 = r9.y     // Catch:{ Exception -> 0x0441 }
        L_0x02e7:
            int r4 = f72.C97842b.m126303t(r4, r9)     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r9 = r1.f324515w     // Catch:{ Exception -> 0x0441 }
            if (r9 != 0) goto L_0x02f2
            int r9 = r8.x     // Catch:{ Exception -> 0x0441 }
            goto L_0x02f4
        L_0x02f2:
            int r9 = r9.x     // Catch:{ Exception -> 0x0441 }
        L_0x02f4:
            int r2 = f72.C97842b.m126303t(r2, r9)     // Catch:{ Exception -> 0x0441 }
            r6.<init>(r4, r2)     // Catch:{ Exception -> 0x0441 }
            r1.f324514v = r6     // Catch:{ Exception -> 0x0441 }
            goto L_0x0376
        L_0x02ff:
            if (r10 == 0) goto L_0x0376
            int r2 = r2.f324557g     // Catch:{ Exception -> 0x0441 }
            r4 = 1080(0x438, float:1.513E-42)
            if (r2 != r4) goto L_0x033b
            android.graphics.Point r2 = r1.f324515w     // Catch:{ Exception -> 0x0441 }
            if (r2 != 0) goto L_0x030e
            int r4 = r8.x     // Catch:{ Exception -> 0x0441 }
            goto L_0x0310
        L_0x030e:
            int r4 = r2.x     // Catch:{ Exception -> 0x0441 }
        L_0x0310:
            int r4 = r4 / r5
            if (r2 != 0) goto L_0x0316
            int r2 = r8.y     // Catch:{ Exception -> 0x0441 }
            goto L_0x0318
        L_0x0316:
            int r2 = r2.y     // Catch:{ Exception -> 0x0441 }
        L_0x0318:
            int r2 = r2 / r5
            android.graphics.Point r6 = new android.graphics.Point     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r9 = r1.f324515w     // Catch:{ Exception -> 0x0441 }
            if (r9 != 0) goto L_0x0322
            int r9 = r8.x     // Catch:{ Exception -> 0x0441 }
            goto L_0x0324
        L_0x0322:
            int r9 = r9.x     // Catch:{ Exception -> 0x0441 }
        L_0x0324:
            int r4 = f72.C97842b.m126303t(r4, r9)     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r9 = r1.f324515w     // Catch:{ Exception -> 0x0441 }
            if (r9 != 0) goto L_0x032f
            int r9 = r8.y     // Catch:{ Exception -> 0x0441 }
            goto L_0x0331
        L_0x032f:
            int r9 = r9.y     // Catch:{ Exception -> 0x0441 }
        L_0x0331:
            int r2 = f72.C97842b.m126303t(r2, r9)     // Catch:{ Exception -> 0x0441 }
            r6.<init>(r4, r2)     // Catch:{ Exception -> 0x0441 }
            r1.f324514v = r6     // Catch:{ Exception -> 0x0441 }
            goto L_0x0376
        L_0x033b:
            if (r2 != r13) goto L_0x0376
            android.graphics.Point r2 = r1.f324515w     // Catch:{ Exception -> 0x0441 }
            if (r2 != 0) goto L_0x0344
            int r4 = r8.x     // Catch:{ Exception -> 0x0441 }
            goto L_0x0346
        L_0x0344:
            int r4 = r2.x     // Catch:{ Exception -> 0x0441 }
        L_0x0346:
            float r4 = (float) r4     // Catch:{ Exception -> 0x0441 }
            float r4 = r4 * r6
            int r4 = (int) r4     // Catch:{ Exception -> 0x0441 }
            if (r2 != 0) goto L_0x034f
            int r2 = r8.y     // Catch:{ Exception -> 0x0441 }
            goto L_0x0351
        L_0x034f:
            int r2 = r2.y     // Catch:{ Exception -> 0x0441 }
        L_0x0351:
            float r2 = (float) r2     // Catch:{ Exception -> 0x0441 }
            float r2 = r2 * r6
            int r2 = (int) r2     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r6 = new android.graphics.Point     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r9 = r1.f324515w     // Catch:{ Exception -> 0x0441 }
            if (r9 != 0) goto L_0x035e
            int r9 = r8.x     // Catch:{ Exception -> 0x0441 }
            goto L_0x0360
        L_0x035e:
            int r9 = r9.x     // Catch:{ Exception -> 0x0441 }
        L_0x0360:
            int r4 = f72.C97842b.m126303t(r4, r9)     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r9 = r1.f324515w     // Catch:{ Exception -> 0x0441 }
            if (r9 != 0) goto L_0x036b
            int r9 = r8.y     // Catch:{ Exception -> 0x0441 }
            goto L_0x036d
        L_0x036b:
            int r9 = r9.y     // Catch:{ Exception -> 0x0441 }
        L_0x036d:
            int r2 = f72.C97842b.m126303t(r2, r9)     // Catch:{ Exception -> 0x0441 }
            r6.<init>(r4, r2)     // Catch:{ Exception -> 0x0441 }
            r1.f324514v = r6     // Catch:{ Exception -> 0x0441 }
        L_0x0376:
            i72.b r2 = i72.C108375b.m146794b()     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r4 = r1.f324515w     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r6 = r1.f324514v     // Catch:{ Exception -> 0x0441 }
            r2.mo158890d(r8, r4, r6)     // Catch:{ Exception -> 0x0441 }
            if (r22 == 0) goto L_0x03e9
            if (r12 != 0) goto L_0x03e3
            i72.r r2 = i72.C108388k.f324540d     // Catch:{ Exception -> 0x0441 }
            int r2 = r2.f324551a     // Catch:{ Exception -> 0x0441 }
            if (r2 != r5) goto L_0x03e3
            android.graphics.Point r2 = r1.f324514v     // Catch:{ Exception -> 0x0441 }
            int r2 = r2.y     // Catch:{ Exception -> 0x0441 }
            int r4 = r2 % 16
            if (r4 != 0) goto L_0x0395
            r4 = 1
            goto L_0x0396
        L_0x0395:
            r4 = 0
        L_0x0396:
            if (r4 != 0) goto L_0x03e3
            int r2 = f72.C97842b.m126302s(r2)     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r4 = r1.f324514v     // Catch:{ Exception -> 0x0441 }
            int r4 = r4.y     // Catch:{ Exception -> 0x0441 }
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)     // Catch:{ Exception -> 0x0441 }
            r6 = 16
            if (r4 > r6) goto L_0x03dd
            java.lang.String r4 = "padding 16 for encode video best size: %s, alignY: %s"
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r9 = r1.f324514v     // Catch:{ Exception -> 0x0441 }
            r10 = 0
            r6[r10] = r9     // Catch:{ Exception -> 0x0441 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0441 }
            r10 = 1
            r6[r10] = r9     // Catch:{ Exception -> 0x0441 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r4, r6)     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r4 = new android.graphics.Point     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r6 = r1.f324514v     // Catch:{ Exception -> 0x0441 }
            int r9 = r6.x     // Catch:{ Exception -> 0x0441 }
            int r6 = r6.y     // Catch:{ Exception -> 0x0441 }
            r4.<init>(r9, r6)     // Catch:{ Exception -> 0x0441 }
            r1.f324513u = r4     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r4 = r1.f324514v     // Catch:{ Exception -> 0x0441 }
            r4.y = r2     // Catch:{ Exception -> 0x0441 }
            r6 = 1
            r1.f324517y = r6     // Catch:{ Exception -> 0x0441 }
            int r4 = r4.x     // Catch:{ Exception -> 0x0441 }
            int r4 = r4 * r2
            int r4 = r4 * 3
            int r4 = r4 / r5
            byte[] r2 = new byte[r4]     // Catch:{ Exception -> 0x0441 }
            r1.f324516x = r2     // Catch:{ Exception -> 0x0441 }
            goto L_0x0420
        L_0x03dd:
            android.graphics.Point r2 = r1.f324514v     // Catch:{ Exception -> 0x0441 }
            i72.C108388k.m146836b(r2)     // Catch:{ Exception -> 0x0441 }
            goto L_0x0420
        L_0x03e3:
            android.graphics.Point r2 = r1.f324514v     // Catch:{ Exception -> 0x0441 }
            i72.C108388k.m146836b(r2)     // Catch:{ Exception -> 0x0441 }
            goto L_0x0420
        L_0x03e9:
            if (r12 != 0) goto L_0x0420
            i72.r r2 = i72.C108388k.f324540d     // Catch:{ Exception -> 0x0441 }
            int r2 = r2.f324551a     // Catch:{ Exception -> 0x0441 }
            if (r2 != r5) goto L_0x0420
            android.graphics.Point r2 = r1.f324514v     // Catch:{ Exception -> 0x0441 }
            int r2 = r2.y     // Catch:{ Exception -> 0x0441 }
            int r4 = r2 % 16
            if (r4 != 0) goto L_0x03fb
            r4 = 1
            goto L_0x03fc
        L_0x03fb:
            r4 = 0
        L_0x03fc:
            if (r4 != 0) goto L_0x0420
            boolean r4 = r1.f324517y     // Catch:{ Exception -> 0x0441 }
            if (r4 == 0) goto L_0x0420
            byte[] r4 = r1.f324516x     // Catch:{ Exception -> 0x0441 }
            if (r4 == 0) goto L_0x0420
            android.graphics.Point r4 = r1.f324513u     // Catch:{ Exception -> 0x0441 }
            int r4 = r4.y     // Catch:{ Exception -> 0x0441 }
            if (r4 != r2) goto L_0x0420
            int r2 = f72.C97842b.m126302s(r2)     // Catch:{ Exception -> 0x0441 }
            byte[] r4 = r1.f324516x     // Catch:{ Exception -> 0x0441 }
            int r4 = r4.length     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r6 = r1.f324514v     // Catch:{ Exception -> 0x0441 }
            int r9 = r6.x     // Catch:{ Exception -> 0x0441 }
            int r9 = r9 * r2
            int r9 = r9 * 3
            int r9 = r9 / r5
            if (r4 != r9) goto L_0x0420
            r6.y = r2     // Catch:{ Exception -> 0x0441 }
        L_0x0420:
            java.lang.String r2 = "final set camera preview size: %s, encodeVideoBestSize: %s, cropSize: %s"
            java.lang.Object[] r4 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0441 }
            r6 = 0
            r4[r6] = r8     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r6 = r1.f324514v     // Catch:{ Exception -> 0x0441 }
            r8 = 1
            r4[r8] = r6     // Catch:{ Exception -> 0x0441 }
            android.graphics.Point r6 = r1.f324515w     // Catch:{ Exception -> 0x0441 }
            r4[r5] = r6     // Catch:{ Exception -> 0x0441 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r4)     // Catch:{ Exception -> 0x0441 }
            i72.s r2 = r1.f324501f     // Catch:{ Exception -> 0x0441 }
            int r4 = r2.f324562c     // Catch:{ Exception -> 0x0441 }
            int r2 = r2.f324561b     // Catch:{ Exception -> 0x0441 }
            r7.setPreviewSize(r4, r2)     // Catch:{ Exception -> 0x0441 }
            r0.mo158262f(r7)     // Catch:{ Exception -> 0x0441 }
            r2 = 1
            return r2
        L_0x0441:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r5]
            android.os.Looper r4 = android.os.Looper.myLooper()
            r5 = 0
            r2[r5] = r4
            java.lang.String r0 = r0.getMessage()
            r4 = 1
            r2[r4] = r0
            java.lang.String r0 = "setPreviewSize Exception, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i72.C108377g.mo158906k(gj.z, boolean, int):boolean");
    }

    /* renamed from: l */
    public void mo158907l() {
        C107848z zVar = this.f324503h;
        if (zVar != null) {
            try {
                Camera.Parameters c = zVar.mo158259c();
                Log.m105924i("MicroMsg.MMSightCamera", "setPreviewCallbackImpl");
                C108393s sVar = this.f324501f;
                int bitsPerPixel = ((sVar.f324562c * sVar.f324561b) * ImageFormat.getBitsPerPixel(c.getPreviewFormat())) / 8;
                for (int i = 0; i < 5; i++) {
                    this.f324503h.mo158257a(C98921l.f289964d.mo126905m(Integer.valueOf(bitsPerPixel)));
                }
                this.f324486D.mo158896d();
                this.f324487E.mo158896d();
                this.f324488F.mo158896d();
                this.f324489G.mo158896d();
                this.f324490H.mo158896d();
                this.f324491I.mo158896d();
                this.f324518z = new C106963a();
                this.f324503h.mo158264h(new C108378a());
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MMSightCamera", "setPreviewCallbackImpl error: %s", e.getMessage());
            }
        }
    }

    /* renamed from: m */
    public void mo158908m(C108380c cVar) {
        this.f324485C = cVar;
        if (cVar == C108380c.Stoping) {
            C108375b b = C108375b.m146794b();
            String b2 = this.f324487E.mo158894b();
            String b3 = this.f324486D.mo158894b();
            C106963a aVar = this.f324518z;
            int i = aVar.f320182b;
            int i2 = i == 0 ? 0 : aVar.f320181a / i;
            b.getClass();
            b.f324469s = (int) (Util.safeParseDouble(b2) * 10.0d);
            b.f324470t = (int) (Util.safeParseDouble(b3) * 10.0d);
            b.f324443B = i2;
        }
    }

    /* renamed from: n */
    public final void mo158909n() {
        if (true != this.f324495M && this.f324512t != null) {
            if (!Build.MANUFACTURER.equalsIgnoreCase("meizu") || C76359b.m91785b()) {
                PermissionShowDlgEvent permissionShowDlgEvent = new PermissionShowDlgEvent();
                permissionShowDlgEvent.f264988d.f264990a = 2;
                permissionShowDlgEvent.publish();
                permissionShowDlgEvent.f264989e.getClass();
                C77398g i = C76879j.m92738i(this.f324512t, C0966R.string.j7_, C0966R.string.a3h);
                if (i != null) {
                    i.setCancelable(false);
                    i.setCanceledOnTouchOutside(false);
                    i.show();
                    this.f324495M = true;
                }
            }
        }
    }

    /* renamed from: o */
    public int mo158910o(SurfaceTexture surfaceTexture, boolean z, int i) {
        SensorManager sensorManager;
        Sensor sensor;
        long currentTicks = Util.currentTicks();
        this.f324484B = false;
        Log.m105925i("MicroMsg.MMSightCamera", "start preview, previewing %B, %s %s autoConfig %s", Boolean.valueOf(this.f324504i), Looper.myLooper(), surfaceTexture, Boolean.valueOf(z));
        if (this.f324504i) {
            return 0;
        }
        if (surfaceTexture == null) {
            return 0 - C76861g.m92658a();
        }
        Log.m105925i("MicroMsg.MMSightCamera", "this texture %s", surfaceTexture);
        try {
            mo158906k(this.f324503h, z, i);
            Integer num = 0;
            SightParams sightParams = C108619m.f325223b.f325224a;
            if (sightParams != null) {
                num = Integer.valueOf(sightParams.f248463t);
            }
            Object[] objArr = new Object[6];
            objArr[0] = num;
            C107825d dVar = C107835h0.f322845b;
            objArr[1] = dVar.f322824w == 1 ? "Range" : dVar.f322823v == 1 ? "Fix" : "Error";
            objArr[2] = Boolean.valueOf(dVar.f322825x == 1);
            objArr[3] = Boolean.valueOf(C107835h0.f322845b.f322826y == 1);
            objArr[4] = Boolean.valueOf(C107835h0.f322845b.f322827z == 1);
            objArr[5] = Boolean.valueOf(C107835h0.f322845b.f322786A == 1);
            Log.m105925i("MicroMsg.MMSightCamera", "startPreview Texture:: sightTest %s, config list: setFPS[%s], setYUV420SP[%B], useMetering[%B], useContinueFocus[%B] mUseContinueVideoFocusMode[%B]", objArr);
            if (C107835h0.f322845b.f322824w == 1 && (num.intValue() == 0 || num.intValue() == 1)) {
                mo158905j(this.f324503h, false);
            } else if (C107835h0.f322845b.f322823v == 1 && (num.intValue() == 0 || num.intValue() == 5)) {
                mo158905j(this.f324503h, true);
            }
            if (C107835h0.f322845b.f322825x == 1 && (num.intValue() == 0 || num.intValue() == 2)) {
                mo158904i(this.f324503h);
            }
            int i2 = C107835h0.f322852i.f322660i;
            if (i2 != -1 && i2 == 1 && C11171e.m11045b(14)) {
                mo158903h(this.f324503h);
            }
            if (C107835h0.f322845b.f322827z == 1 && (num.intValue() == 0 || num.intValue() == 4)) {
                mo158902g(this.f324503h);
            }
            if (C107835h0.f322845b.f322786A == 1 && num.intValue() != 0) {
                int intValue = num.intValue();
            }
            C107848z zVar = this.f324503h;
            try {
                Camera.Parameters c = zVar.mo158259c();
                if (c.isZoomSupported()) {
                    c.setZoom(0);
                }
                zVar.mo158262f(c);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MMSightCamera", "safeResetZoom error: %s", e.getMessage());
            }
            mo158907l();
            this.f324503h.mo158265i(surfaceTexture);
            this.f324503h.mo158267k();
            if (!C108388k.f324540d.f324558h) {
                this.f324507o.registerListener(this, this.f324508p, 2);
            } else if (!(C107835h0.f322845b.f322827z != 0 || (sensorManager = this.f324507o) == null || (sensor = this.f324508p) == null)) {
                sensorManager.registerListener(this, sensor, 2);
            }
            this.f324504i = true;
            Log.m105925i("MicroMsg.MMSightCamera", "start preview end, use %dms %s", Long.valueOf(Util.ticksToNow(currentTicks)), Looper.myLooper());
            return 0;
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.MMSightCamera", "start preview FAILED, %s, %s", Looper.myLooper(), e2.getMessage());
            return 0 - C76861g.m92658a();
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        if (Math.abs(this.f324509q - f) > 5.0f || Math.abs(this.f324510r - f2) > 5.0f || Math.abs(this.f324511s - f3) > 5.0f) {
            Log.m105925i("MicroMsg.MMSightCamera", "match accel limit %f, try auto focus x %s y %s z %s", Float.valueOf(5.0f), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
            this.f324497P.mo158920b(this.f324503h);
            this.f324509q = f;
            this.f324510r = f2;
            this.f324511s = f3;
        }
    }

    /* renamed from: p */
    public boolean mo158913p(Context context, SurfaceTexture surfaceTexture, boolean z) {
        Log.m105925i("MicroMsg.MMSightCamera", "switch camera, current useBack: %s", Boolean.valueOf(this.f324498Q));
        try {
            mo158897b();
            mo158901f(context, !this.f324498Q);
            mo158910o(surfaceTexture, z, 0);
            return true;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MMSightCamera", "switchCamera error: %s", e);
            return false;
        }
    }

    /* renamed from: q */
    public void mo158914q(boolean z, boolean z2, int i) {
        int i2;
        if (this.f324503h != null && this.f324504i) {
            try {
                Log.m105919d("MicroMsg.MMSightCamera", "triggerSmallZoom, zoom: %s", Boolean.valueOf(z));
                if (this.f324502g) {
                    Log.m105918d("MicroMsg.MMSightCamera", "triggerSmallZoom, zooming, ignore");
                    this.f324502g = false;
                    return;
                }
                Camera.Parameters c = this.f324503h.mo158259c();
                if (c.isZoomSupported()) {
                    this.f324502g = true;
                    int zoom = c.getZoom();
                    int maxZoom = c.getMaxZoom();
                    if (!z2) {
                        if (this.f324499d <= 0) {
                            int round = Math.round(((float) maxZoom) / 15.0f);
                            this.f324499d = round;
                            if (round > 5) {
                                this.f324499d = 5;
                            }
                        }
                        i2 = this.f324499d;
                    } else {
                        i2 = this.f324500e;
                        if (i2 <= 0) {
                            Log.m105921e("MicroMsg.MMSightCamera", "scroll zoom error, scrollSmallZoomStep: %s", Integer.valueOf(i2));
                            this.f324502g = false;
                            return;
                        }
                    }
                    Log.m105919d("MicroMsg.MMSightCamera", "triggerSmallZoom, currentZoom: %s, maxZoom: %s, smallZoomStep: %s, scrollSmallZoomStep: %s, factor: %s", Integer.valueOf(zoom), Integer.valueOf(maxZoom), Integer.valueOf(this.f324499d), Integer.valueOf(this.f324500e), Integer.valueOf(i));
                    if (i >= 1) {
                        i2 *= i;
                    }
                    if (z) {
                        if (zoom >= maxZoom) {
                            this.f324502g = false;
                            return;
                        }
                        int i3 = zoom + i2;
                        if (i3 < maxZoom) {
                            maxZoom = i3;
                        }
                    } else if (zoom == 0) {
                        this.f324502g = false;
                        return;
                    } else {
                        maxZoom = zoom - i2;
                        if (maxZoom <= 0) {
                            maxZoom = 0;
                        }
                    }
                    Log.m105919d("MicroMsg.MMSightCamera", "triggerSmallZoom, nextZoom: %s", Integer.valueOf(maxZoom));
                    c.setZoom(maxZoom);
                    this.f324503h.mo158262f(c);
                }
                this.f324502g = false;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MMSightCamera", "triggerSmallZoom error: %s", e.getMessage());
            } catch (Throwable th) {
                this.f324502g = false;
                throw th;
            }
        }
    }

    /* renamed from: r */
    public final void mo158915r(Camera.Parameters parameters) {
        if (C107835h0.f322845b.f322821t > 0) {
            Log.m105924i("MicroMsg.MMSightCameraSetting", "set frame rate > 0, do not try set preview fps range");
            return;
        }
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (supportedPreviewFpsRange != null && supportedPreviewFpsRange.size() != 0) {
            int size = supportedPreviewFpsRange.size();
            int i = Integer.MIN_VALUE;
            int i2 = Integer.MIN_VALUE;
            boolean z = false;
            for (int i3 = 0; i3 < size; i3++) {
                int[] iArr = supportedPreviewFpsRange.get(i3);
                if (iArr != null && iArr.length > 1) {
                    int i4 = iArr[0];
                    int i5 = iArr[1];
                    Log.m105925i("MicroMsg.MMSightCamera", "dkfps %d:[%d %d]", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
                    if (i4 >= 0 && i5 >= i4) {
                        if (i5 >= i2 && !z) {
                            i2 = i5;
                            i = i4;
                        }
                        if (i5 >= 30000) {
                            z = true;
                        }
                    }
                }
            }
            Log.m105925i("MicroMsg.MMSightCameraSetting", "dkfps get fit  [%d %d], max target fps %d", Integer.valueOf(i), Integer.valueOf(i2), 30);
            if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
                try {
                    parameters.setPreviewFpsRange(i, i2);
                    Log.m105925i("MicroMsg.MMSightCameraSetting", "set fps range %d %d", Integer.valueOf(i), Integer.valueOf(i2));
                } catch (Exception e) {
                    Log.m105925i("MicroMsg.MMSightCameraSetting", "trySetPreviewFpsRangeParameters Exception, %s, %s", Looper.myLooper(), e.getMessage());
                }
            }
        }
    }

    /* renamed from: s */
    public final void mo158916s(Camera.Parameters parameters) {
        if (C107835h0.f322845b.f322821t > 0) {
            Log.m105924i("MicroMsg.MMSightCameraSetting", "set frame rate > 0, do not try set preview frame rate");
        } else if (parameters == null) {
            Log.m105920e("MicroMsg.MMSightCamera", "trySetPreviewFrameRateParameters error, p is null!");
        } else {
            try {
                List<Integer> supportedPreviewFrameRates = parameters.getSupportedPreviewFrameRates();
                if (supportedPreviewFrameRates != null && supportedPreviewFrameRates.size() > 0) {
                    int min = Math.min(30, ((Integer) Collections.max(supportedPreviewFrameRates)).intValue());
                    parameters.setPreviewFrameRate(min);
                    Log.m105925i("MicroMsg.MMSightCameraSetting", "set preview frame rate %d", Integer.valueOf(min));
                }
            } catch (Exception e) {
                Log.m105925i("MicroMsg.MMSightCameraSetting", "trySetPreviewFrameRateParameters Exception, %s, %s", Looper.myLooper(), e.getMessage());
            }
        }
    }
}
