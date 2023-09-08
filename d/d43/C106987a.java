package d43;

import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.util.Size;
import b43.C104031a;
import b43.C104034c;
import b43.C104035d;
import c43.C104298b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.video.OpenGlRender;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;
import java.util.regex.Pattern;
import p156gj.C107835h0;
import p156gj.C107848z;
import w33.C111714a;

/* renamed from: d43.a */
public class C106987a extends C104031a {

    /* renamed from: o */
    public static final Pattern f320235o = Pattern.compile(",");

    /* renamed from: a */
    public boolean f320236a = true;

    /* renamed from: b */
    public int f320237b = 0;

    /* renamed from: c */
    public int f320238c = 0;

    /* renamed from: d */
    public volatile C107848z f320239d;

    /* renamed from: e */
    public Camera.Parameters f320240e;

    /* renamed from: f */
    public Size f320241f;

    /* renamed from: g */
    public int f320242g;

    /* renamed from: h */
    public boolean f320243h = false;

    /* renamed from: i */
    public C104034c f320244i;

    /* renamed from: j */
    public boolean f320245j = false;

    /* renamed from: k */
    public int f320246k;

    /* renamed from: l */
    public int f320247l;

    /* renamed from: m */
    public boolean f320248m = false;

    /* renamed from: n */
    public SurfaceTexture f320249n;

    public C106987a(int i, int i2) {
        this.f320246k = i;
        this.f320247l = i2;
        C104035d.m138788b(MMApplicationContext.getContext().getApplicationContext());
        Log.m105919d("MicroMsg.Voip.CaptureRender", "width: %d, height: %d", Integer.valueOf(this.f320246k), Integer.valueOf(this.f320247l));
    }

    /* renamed from: o */
    public static Size m144743o(C107848z zVar, int i, int i2) {
        Camera.Parameters c = zVar.mo158259c();
        Point point = new Point(i, i2);
        String str = c.get("preview-size-values");
        if (str == null) {
            str = c.get("preview-size-value");
        }
        Point point2 = null;
        if (str != null) {
            Log.m105924i("MicroMsg.Voip.CaptureRender", "preview-size-values parameter: " + str);
            String[] split = f320235o.split(str);
            int length = split.length;
            int i3 = Integer.MAX_VALUE;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                String trim = split[i4].trim();
                int indexOf = trim.indexOf(120);
                if (indexOf < 0) {
                    Log.m105928w("MicroMsg.Voip.CaptureRender", "Bad preview-size: " + trim);
                } else {
                    try {
                        int i7 = Util.getInt(trim.substring(0, indexOf), 0);
                        int i8 = Util.getInt(trim.substring(indexOf + 1), 0);
                        int abs = Math.abs(i7 - point.x) + Math.abs(i8 - point.y);
                        if (abs == 0) {
                            i6 = i8;
                            i5 = i7;
                            break;
                        } else if (abs < i3 && i7 != i8) {
                            i6 = i8;
                            i3 = abs;
                            i5 = i7;
                        }
                    } catch (NumberFormatException unused) {
                        Log.m105928w("MicroMsg.Voip.CaptureRender", "Bad preview-size: " + trim);
                    }
                }
                i4++;
            }
            if (i5 > 0 && i6 > 0) {
                point2 = new Point(i5, i6);
            }
        }
        if (point2 == null) {
            point2 = new Point((point.x >> 3) << 3, (point.y >> 3) << 3);
        }
        return new Size(point2.x, point2.y);
    }

    /* renamed from: a */
    public void mo145629a(SurfaceTexture surfaceTexture) {
        this.f320249n = surfaceTexture;
    }

    /* renamed from: b */
    public int mo145630b() {
        return this.f320238c;
    }

    /* renamed from: c */
    public boolean mo145631c() {
        return this.f320236a;
    }

    /* renamed from: d */
    public Size mo145632d() {
        return this.f320241f;
    }

    /* renamed from: e */
    public int mo145633e(C104034c cVar, boolean z) {
        int p;
        C104298b bVar = C104035d.f307670a;
        if (bVar.f308688b <= 0) {
            this.f320238c = 1;
            return -1;
        }
        if (z) {
            if (!bVar.f308689c) {
                z = false;
            }
        } else if (!bVar.f308690d) {
            z = true;
        }
        this.f320244i = cVar;
        if (mo157421p(z, this.f320246k, this.f320247l) <= 0 && (p = mo157421p(z, this.f320246k, this.f320247l)) <= 0) {
            this.f320238c = 1;
            return p;
        }
        this.f320238c = 0;
        return 1;
    }

    /* renamed from: f */
    public boolean mo145634f() {
        char c;
        if (this.f320236a) {
            c = 0;
        } else {
            int i = OpenGlRender.f318118B;
            c = 16;
        }
        int i2 = OpenGlRender.f318118B;
        return c == 16;
    }

    /* renamed from: g */
    public boolean mo145635g() {
        return this.f320245j;
    }

    /* renamed from: h */
    public void mo145636h() {
        try {
            Camera.Parameters c = this.f320239d.mo158259c();
            if (this.f320236a) {
                C111714a.f334394m.mo163392a(c, 1);
            } else {
                C111714a.f334394m.mo163392a(c, 0);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    public void mo145637i(int i) {
    }

    /* renamed from: j */
    public int mo145638j() {
        if (!this.f320243h) {
            Log.m105920e("MicroMsg.Voip.CaptureRender", "StartCapture: failed without open camera");
            this.f320238c = 1;
            return -1;
        }
        Log.m105919d("MicroMsg.Voip.CaptureRender", "StartCapture now, isUesSurfacePreivew: %b", Boolean.FALSE);
        if (this.f320249n != null) {
            try {
                this.f320239d.mo158265i(this.f320249n);
            } catch (Exception e) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.idkeyStat(159, 0, 1, false);
                nVar.idkeyStat(159, 2, 1, false);
                this.f320238c = 1;
                Log.m105920e("MicroMsg.Voip.CaptureRender", "StartCapture:error:" + e.toString());
            }
        }
        mo145639k();
        return 1;
    }

    /* renamed from: k */
    public boolean mo145639k() {
        try {
            C104034c cVar = this.f320244i;
            if (cVar != null) {
                cVar.mo145645D(16);
            }
            this.f320239d.mo158267k();
            C104034c cVar2 = this.f320244i;
            if (cVar2 != null) {
                cVar2.mo145645D(21);
            }
            Camera.Parameters c = this.f320239d.mo158259c();
            this.f320240e = c;
            Camera.Size previewSize = c.getPreviewSize();
            if (previewSize != null) {
                Size size = new Size(previewSize.width, previewSize.height);
                this.f320241f = size;
                this.f320244i.mo145649t(size.getWidth(), this.f320241f.getHeight());
                Log.m105924i("MicroMsg.Voip.CaptureRender", "Camera Open Success, preview available : w,h:" + previewSize.width + "," + previewSize.height);
            }
            this.f320245j = true;
            return true;
        } catch (Exception e) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(159, 0, 1, false);
            nVar.idkeyStat(159, 2, 1, false);
            C104034c cVar3 = this.f320244i;
            if (cVar3 != null) {
                cVar3.mo145645D(2);
            }
            this.f320245j = false;
            this.f320238c = 1;
            C104034c cVar4 = this.f320244i;
            if (cVar4 != null) {
                cVar4.mo145648k();
            }
            Log.m105920e("MicroMsg.Voip.CaptureRender", "startPreview:error" + e.toString());
            return false;
        }
    }

    /* renamed from: l */
    public void mo145640l() {
        Log.m105918d("MicroMsg.Voip.CaptureRender", "StopCapture....mIsInCapture = " + this.f320245j);
        if (this.f320245j && this.f320239d != null) {
            if (!this.f320239d.f322938c) {
                this.f320239d.mo158263g((Camera.PreviewCallback) null);
            }
            mo145641m();
            this.f320245j = false;
        }
        Log.m105918d("MicroMsg.Voip.CaptureRender", "UnInitCapture....mCameraOpen = " + this.f320243h);
        if (this.f320243h) {
            this.f320238c = 0;
            if (this.f320239d != null && !this.f320239d.f322938c) {
                this.f320239d.mo158260d();
            }
            this.f320239d = null;
            this.f320243h = false;
        } else if (this.f320239d != null) {
            this.f320239d.mo158260d();
            this.f320239d = null;
            this.f320243h = false;
        }
        C104034c cVar = this.f320244i;
        if (cVar != null) {
            cVar.mo145645D(22);
        }
    }

    /* renamed from: m */
    public boolean mo145641m() {
        if (!this.f320245j || this.f320239d == null) {
            return true;
        }
        if (!this.f320239d.f322938c) {
            this.f320239d.mo158263g((Camera.PreviewCallback) null);
        }
        try {
            C104034c cVar = this.f320244i;
            if (cVar != null) {
                cVar.mo145645D(17);
            }
            this.f320239d.mo158268l();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.Voip.CaptureRender", "stopPreview:error" + e.toString());
        }
        this.f320245j = false;
        return true;
    }

    /* renamed from: n */
    public boolean mo145642n(int i, int i2) {
        if (!this.f320236a ? C104035d.f307670a.f308694h != null : C104035d.f307670a.f308693g != null) {
            return false;
        }
        Size size = this.f320241f;
        try {
            Size o = m144743o(this.f320239d, i, i2);
            if (((float) o.getWidth()) / ((float) o.getHeight()) != ((float) i) / ((float) i2)) {
                return false;
            }
            mo145641m();
            mo157422q(this.f320239d, o.getWidth(), o.getHeight());
            mo157423r(this.f320239d, this.f320236a);
            Camera.Parameters c = this.f320239d.mo158259c();
            this.f320240e = c;
            Camera.Size previewSize = c.getPreviewSize();
            if (previewSize != null) {
                this.f320241f = new Size(previewSize.width, previewSize.height);
            }
            mo145639k();
            this.f320246k = i;
            this.f320247l = i2;
            Size size2 = this.f320241f;
            return (size2 == null || size2 == size) ? false : true;
        } catch (Exception unused) {
            if (size != null) {
                try {
                    mo145641m();
                    this.f320245j = false;
                    mo157422q(this.f320239d, size.getWidth(), size.getHeight());
                    mo145639k();
                } catch (Exception unused2) {
                    Log.m105920e("MicroMsg.Voip.CaptureRender", "boom in recovery camera preview");
                }
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:166:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0452  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x047e  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0549  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x05bb A[Catch:{ Exception -> 0x062d }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x05e4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ce A[SYNTHETIC, Splitter:B:37:0x00ce] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01c7 A[Catch:{ Exception -> 0x0225 }, LOOP:1: B:67:0x01c1->B:69:0x01c7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0206 A[Catch:{ Exception -> 0x0225 }, LOOP:2: B:75:0x0200->B:77:0x0206, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0245 A[Catch:{ Exception -> 0x064b }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0272  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo157421p(boolean r31, int r32, int r33) {
        /*
            r30 = this;
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            b43.c r0 = r1.f320244i
            if (r0 == 0) goto L_0x0011
            r5 = 18
            r0.mo145645D(r5)
        L_0x0011:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "try open camera, face: "
            r0.append(r5)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "MicroMsg.Voip.CaptureRender"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            gj.z r0 = r1.f320239d
            r6 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0050
            boolean r0 = r1.f320236a
            if (r0 == r2) goto L_0x004d
            gj.z r0 = r1.f320239d
            boolean r0 = r0.f322938c
            if (r0 != 0) goto L_0x003c
            gj.z r0 = r1.f320239d
            r0.mo158263g(r6)
        L_0x003c:
            r30.mo145641m()     // Catch:{ Exception -> 0x0047 }
            gj.z r0 = r1.f320239d     // Catch:{ Exception -> 0x0047 }
            r0.mo158260d()     // Catch:{ Exception -> 0x0047 }
            r1.f320239d = r6     // Catch:{ Exception -> 0x0047 }
            goto L_0x0050
        L_0x0047:
            java.lang.String r0 = "init camera failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            goto L_0x0050
        L_0x004d:
            boolean r0 = r1.f320248m
            goto L_0x0051
        L_0x0050:
            r0 = 1
        L_0x0051:
            java.lang.String r8 = ","
            r9 = 2
            r10 = -1
            r11 = 0
            if (r0 == 0) goto L_0x0241
            c43.b r0 = b43.C104035d.f307670a
            int r0 = r0.f308688b
            if (r0 > 0) goto L_0x005f
            goto L_0x0090
        L_0x005f:
            boolean r0 = b43.C104035d.m138787a()
            if (r0 != 0) goto L_0x0066
            goto L_0x0090
        L_0x0066:
            java.lang.String r0 = "Camera"
            if (r2 != r7) goto L_0x0079
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0092 }
            gj.f r12 = p156gj.C107828e.m146101d(r12, r7, r6)     // Catch:{ Exception -> 0x0092 }
            java.lang.String r13 = "Use front"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)     // Catch:{ Exception -> 0x0092 }
            r0 = 1
            goto L_0x0087
        L_0x0079:
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0092 }
            gj.f r12 = p156gj.C107828e.m146101d(r12, r11, r6)     // Catch:{ Exception -> 0x0092 }
            java.lang.String r13 = "Use back"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)     // Catch:{ Exception -> 0x0092 }
            r0 = 0
        L_0x0087:
            if (r12 == 0) goto L_0x0090
            gj.z r12 = r12.f322839a     // Catch:{ Exception -> 0x0092 }
            r12.f322937b = r0     // Catch:{ Exception -> 0x008e }
            goto L_0x00cc
        L_0x008e:
            r0 = move-exception
            goto L_0x0094
        L_0x0090:
            r12 = r6
            goto L_0x00cc
        L_0x0092:
            r0 = move-exception
            r12 = r6
        L_0x0094:
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 159(0x9f, double:7.86E-322)
            r16 = 0
            r24 = 1
            r26 = 0
            r14 = 159(0x9f, double:7.86E-322)
            r18 = 1
            r20 = 0
            r13 = r21
            r13.idkeyStat(r14, r16, r18, r20)
            r16 = 1
            r14 = r22
            r18 = r24
            r20 = r26
            r13.idkeyStat(r14, r16, r18, r20)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "openCameraByHighApiLvl:error:"
            r13.append(r14)
            java.lang.String r0 = r0.toString()
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x00cc:
            if (r12 != 0) goto L_0x014d
            gj.z r12 = new gj.z     // Catch:{ Exception -> 0x010d }
            java.lang.Object r13 = new java.lang.Object     // Catch:{ Exception -> 0x010d }
            r13.<init>()     // Catch:{ Exception -> 0x010d }
            java.lang.String r14 = "com/tencent/mm/plugin/voip/video/camera/v2/NewCaptureRender"
            java.lang.String r15 = "safeOpenCamera"
            java.lang.String r16 = "(Z)Lcom/tencent/mm/compatible/deviceinfo/MCamera;"
            java.lang.String r17 = "android/hardware/Camera"
            java.lang.String r18 = "open"
            java.lang.String r19 = "()Landroid/hardware/Camera;"
            java.lang.Object r0 = j20.C117292a.m165363i(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x010d }
            android.hardware.Camera r0 = (android.hardware.Camera) r0     // Catch:{ Exception -> 0x010d }
            r12.<init>(r0)     // Catch:{ Exception -> 0x010d }
            if (r0 != 0) goto L_0x00fb
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x010d }
            r14 = 159(0x9f, double:7.86E-322)
            r16 = 0
            r18 = 1
            r20 = 0
            r13.idkeyStat(r14, r16, r18, r20)     // Catch:{ Exception -> 0x010d }
            goto L_0x022e
        L_0x00fb:
            r12.f322937b = r11     // Catch:{ Exception -> 0x010d }
            r1.f320236a = r11
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 159(0x9f, double:7.86E-322)
            r24 = 0
            r26 = 1
            r28 = 0
            r21.idkeyStat(r22, r24, r26, r28)
            goto L_0x014f
        L_0x010d:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r12 = "OpenCameraError:"
            r2.append(r12)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r20 = 159(0x9f, double:7.86E-322)
            r15 = 0
            r22 = 1
            r2 = 0
            r13 = 159(0x9f, double:7.86E-322)
            r17 = 1
            r19 = 0
            r12 = r0
            r12.idkeyStat(r13, r15, r17, r19)
            r15 = 1
            r13 = r20
            r17 = r22
            r19 = r2
            r12.idkeyStat(r13, r15, r17, r19)
            b43.c r0 = r1.f320244i
            if (r0 == 0) goto L_0x022e
            r0.mo145648k()
            goto L_0x022e
        L_0x014d:
            r1.f320236a = r2
        L_0x014f:
            android.hardware.Camera$CameraInfo r0 = new android.hardware.Camera$CameraInfo     // Catch:{ Exception -> 0x022e }
            r0.<init>()     // Catch:{ Exception -> 0x022e }
            int r2 = r12.f322937b     // Catch:{ Exception -> 0x022e }
            android.hardware.Camera.getCameraInfo(r2, r0)     // Catch:{ Exception -> 0x022e }
            int r0 = r0.orientation     // Catch:{ Exception -> 0x022e }
            r1.f320237b = r0     // Catch:{ Exception -> 0x022e }
            android.hardware.Camera$Parameters r0 = r12.mo158259c()     // Catch:{ Exception -> 0x0166 }
            java.util.List r0 = r0.getSupportedPreviewFrameRates()     // Catch:{ Exception -> 0x0166 }
            goto L_0x0180
        L_0x0166:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r13 = "getSupportedPreviewFrameRates:error:"
            r2.append(r13)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
            r0 = r6
        L_0x0180:
            java.lang.String r2 = "supportFps:"
            if (r0 == 0) goto L_0x01aa
            r13 = 0
        L_0x0185:
            int r14 = r0.size()
            if (r13 >= r14) goto L_0x01aa
            java.lang.Object r14 = r0.get(r13)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r2)
            r15.append(r14)
            r15.append(r8)
            java.lang.String r2 = r15.toString()
            int r13 = r13 + 1
            goto L_0x0185
        L_0x01aa:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            android.hardware.Camera$Parameters r0 = r12.mo158259c()     // Catch:{ Exception -> 0x0225 }
            java.util.List r0 = r0.getSupportedPreviewSizes()     // Catch:{ Exception -> 0x0225 }
            if (r0 == 0) goto L_0x01ec
            int r2 = r0.size()     // Catch:{ Exception -> 0x0225 }
            if (r2 == 0) goto L_0x01ec
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0225 }
        L_0x01c1:
            boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x0225 }
            if (r2 == 0) goto L_0x01ec
            java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x0225 }
            android.hardware.Camera$Size r2 = (android.hardware.Camera.Size) r2     // Catch:{ Exception -> 0x0225 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0225 }
            r13.<init>()     // Catch:{ Exception -> 0x0225 }
            java.lang.String r14 = "support Size:"
            r13.append(r14)     // Catch:{ Exception -> 0x0225 }
            int r14 = r2.width     // Catch:{ Exception -> 0x0225 }
            r13.append(r14)     // Catch:{ Exception -> 0x0225 }
            r13.append(r8)     // Catch:{ Exception -> 0x0225 }
            int r2 = r2.height     // Catch:{ Exception -> 0x0225 }
            r13.append(r2)     // Catch:{ Exception -> 0x0225 }
            java.lang.String r2 = r13.toString()     // Catch:{ Exception -> 0x0225 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r2)     // Catch:{ Exception -> 0x0225 }
            goto L_0x01c1
        L_0x01ec:
            android.hardware.Camera$Parameters r0 = r12.mo158259c()     // Catch:{ Exception -> 0x0225 }
            java.util.List r0 = r0.getSupportedPreviewFormats()     // Catch:{ Exception -> 0x0225 }
            if (r0 == 0) goto L_0x022f
            int r2 = r0.size()     // Catch:{ Exception -> 0x0225 }
            if (r2 == 0) goto L_0x022f
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0225 }
        L_0x0200:
            boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x0225 }
            if (r2 == 0) goto L_0x022f
            java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x0225 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x0225 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x0225 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0225 }
            r13.<init>()     // Catch:{ Exception -> 0x0225 }
            java.lang.String r14 = "support Format:"
            r13.append(r14)     // Catch:{ Exception -> 0x0225 }
            r13.append(r2)     // Catch:{ Exception -> 0x0225 }
            java.lang.String r2 = r13.toString()     // Catch:{ Exception -> 0x0225 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)     // Catch:{ Exception -> 0x0225 }
            goto L_0x0200
        L_0x0225:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.String r13 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r13, r2)
            goto L_0x022f
        L_0x022e:
            r12 = r6
        L_0x022f:
            r1.f320239d = r12
            gj.z r0 = r1.f320239d
            if (r0 != 0) goto L_0x023f
            r1.f320243h = r11
            b43.c r0 = r1.f320244i
            if (r0 == 0) goto L_0x023e
            r0.mo145645D(r9)
        L_0x023e:
            return r10
        L_0x023f:
            r1.f320248m = r11
        L_0x0241:
            gj.z r0 = r1.f320239d     // Catch:{ Exception -> 0x064b }
            if (r0 == 0) goto L_0x0265
            gj.z r0 = r1.f320239d     // Catch:{ Exception -> 0x064b }
            r0.mo158259c()     // Catch:{ Exception -> 0x064b }
            gj.z r0 = r1.f320239d     // Catch:{ Exception -> 0x064b }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ Exception -> 0x064b }
            java.lang.String r12 = "Voip-%d"
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x064b }
            gj.z r14 = r1.f320239d     // Catch:{ Exception -> 0x064b }
            int r14 = r14.hashCode()     // Catch:{ Exception -> 0x064b }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x064b }
            r13[r11] = r14     // Catch:{ Exception -> 0x064b }
            java.lang.String r2 = java.lang.String.format(r2, r12, r13)     // Catch:{ Exception -> 0x064b }
            r0.mo158266j(r2)     // Catch:{ Exception -> 0x064b }
        L_0x0265:
            r1.f320243h = r7
            gj.z r2 = r1.f320239d
            c43.b r0 = b43.C104035d.f307670a
            int r12 = r0.f308687a
            r15 = 3
            if (r2 != 0) goto L_0x0272
            goto L_0x0424
        L_0x0272:
            java.lang.String r0 = "safeSetFps: %s"
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x03d5 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x03d5 }
            r6[r11] = r17     // Catch:{ Exception -> 0x03d5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r6)     // Catch:{ Exception -> 0x03d5 }
            android.hardware.Camera$Parameters r0 = r2.mo158259c()     // Catch:{ Exception -> 0x03d5 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()     // Catch:{ Exception -> 0x03d5 }
            r10 = 26
            if (r6 == 0) goto L_0x029d
            java.lang.Class<lc3.b> r6 = lc3.C10485b.class
            k40.a r6 = f40.C86709a0.m107533q(r6)     // Catch:{ Exception -> 0x03d5 }
            lc3.b r6 = (lc3.C10485b) r6     // Catch:{ Exception -> 0x03d5 }
            pj.f r6 = r6.vh0()     // Catch:{ Exception -> 0x03d5 }
            java.lang.String r13 = "VoipCaptureRenderFpsRangeMinApiLevel"
            int r10 = r6.mo107404b(r13, r10)     // Catch:{ Exception -> 0x03d5 }
        L_0x029d:
            java.lang.String r6 = "setFpsRange minApiLevel:%s"
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x03d5 }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x03d5 }
            r13[r11] = r18     // Catch:{ Exception -> 0x03d5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r13)     // Catch:{ Exception -> 0x03d5 }
            boolean r6 = p206nj.C76866m.m92676e()     // Catch:{ Exception -> 0x03d5 }
            if (r6 != 0) goto L_0x02b6
            boolean r6 = p206nj.C11171e.m11046c(r10)     // Catch:{ Exception -> 0x03d5 }
            if (r6 == 0) goto L_0x03ef
        L_0x02b6:
            gj.d r6 = p156gj.C107835h0.f322845b     // Catch:{ Exception -> 0x03d5 }
            if (r6 == 0) goto L_0x02c3
            int r10 = r6.f322798M     // Catch:{ Exception -> 0x03d5 }
            int r10 = r10 * 1000
            int r6 = r6.f322799N     // Catch:{ Exception -> 0x03d5 }
            int r6 = r6 * 1000
            goto L_0x02c5
        L_0x02c3:
            r6 = -1
            r10 = -1
        L_0x02c5:
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 <= 0) goto L_0x02d1
            if (r6 <= 0) goto L_0x02d1
            if (r6 < r10) goto L_0x02d1
            r21 = 1
            goto L_0x0383
        L_0x02d1:
            if (r10 != 0) goto L_0x02dd
            if (r6 != 0) goto L_0x02dd
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r21 = 0
            goto L_0x0383
        L_0x02dd:
            java.util.List r6 = r0.getSupportedPreviewFpsRange()     // Catch:{ Exception -> 0x03d5 }
            if (r6 == 0) goto L_0x03ee
            int r10 = r6.size()     // Catch:{ Exception -> 0x03d5 }
            if (r10 != 0) goto L_0x02eb
            goto L_0x03ee
        L_0x02eb:
            int r10 = r6.size()     // Catch:{ Exception -> 0x03d5 }
            r13 = 0
            r19 = -2147483648(0xffffffff80000000, float:-0.0)
            r21 = 0
            r29 = 2147483647(0x7fffffff, float:NaN)
        L_0x02f7:
            if (r13 >= r10) goto L_0x037f
            java.lang.Object r22 = r6.get(r13)     // Catch:{ Exception -> 0x03d5 }
            r14 = r22
            int[] r14 = (int[]) r14     // Catch:{ Exception -> 0x03d5 }
            if (r14 == 0) goto L_0x0370
            int r9 = r14.length     // Catch:{ Exception -> 0x03d5 }
            if (r9 > r7) goto L_0x0308
            goto L_0x0370
        L_0x0308:
            r9 = r14[r11]     // Catch:{ Exception -> 0x03d5 }
            r14 = r14[r7]     // Catch:{ Exception -> 0x03d5 }
            java.lang.String r7 = "dkfps %d:[%d %d]"
            java.lang.Object[] r11 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x03d5 }
            java.lang.Integer r26 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x03d5 }
            r25 = 0
            r11[r25] = r26     // Catch:{ Exception -> 0x03d5 }
            java.lang.Integer r26 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x03d5 }
            r24 = 1
            r11[r24] = r26     // Catch:{ Exception -> 0x03d5 }
            java.lang.Integer r26 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x03d5 }
            r22 = 2
            r11[r22] = r26     // Catch:{ Exception -> 0x03d5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r11)     // Catch:{ Exception -> 0x03d5 }
            if (r9 < 0) goto L_0x0370
            if (r14 >= r9) goto L_0x0330
            goto L_0x0370
        L_0x0330:
            int r7 = r14 / 1000
            int r11 = r9 / 1000
            int r15 = r12 + 5
            r27 = r6
            r6 = 30
            int r6 = java.lang.Math.min(r15, r6)     // Catch:{ Exception -> 0x03d5 }
            int r15 = r12 + -5
            r28 = r9
            r9 = 5
            int r15 = java.lang.Math.max(r15, r9)     // Catch:{ Exception -> 0x03d5 }
            if (r7 < r15) goto L_0x0351
            if (r7 > r6) goto L_0x0351
            if (r11 < r15) goto L_0x0351
            if (r11 > r6) goto L_0x0351
            r6 = 1
            goto L_0x0352
        L_0x0351:
            r6 = 0
        L_0x0352:
            if (r6 == 0) goto L_0x036d
            int r6 = r12 - r11
            int r6 = java.lang.Math.abs(r6)     // Catch:{ Exception -> 0x03d5 }
            int r7 = r7 - r12
            int r7 = java.lang.Math.abs(r7)     // Catch:{ Exception -> 0x03d5 }
            int r6 = r6 + r7
            r7 = r29
            if (r6 >= r7) goto L_0x0373
            r29 = r6
            r18 = r14
            r19 = r28
            r21 = 1
            goto L_0x0375
        L_0x036d:
            r7 = r29
            goto L_0x0373
        L_0x0370:
            r27 = r6
            goto L_0x036d
        L_0x0373:
            r29 = r7
        L_0x0375:
            int r13 = r13 + 1
            r6 = r27
            r7 = 1
            r9 = 2
            r11 = 0
            r15 = 3
            goto L_0x02f7
        L_0x037f:
            r6 = r18
            r10 = r19
        L_0x0383:
            java.lang.String r7 = "steve: dkfps get fit  [%d %d], target fps %d, matchTargetFPS:%b"
            r9 = 4
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x03d5 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x03d5 }
            r13 = 0
            r11[r13] = r9     // Catch:{ Exception -> 0x03d5 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x03d5 }
            r13 = 1
            r11[r13] = r9     // Catch:{ Exception -> 0x03d5 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x03d5 }
            r13 = 2
            r11[r13] = r9     // Catch:{ Exception -> 0x03d5 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r21)     // Catch:{ Exception -> 0x03d5 }
            r13 = 3
            r11[r13] = r9     // Catch:{ Exception -> 0x03d5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r11)     // Catch:{ Exception -> 0x03d5 }
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r10 == r7) goto L_0x03ee
            if (r6 == r7) goto L_0x03ee
            if (r21 != 0) goto L_0x03b1
            goto L_0x03ee
        L_0x03b1:
            java.lang.String r7 = "steve: SafeSetFps by setPreviewFpsRange [%d %d], target fps %d"
            java.lang.Object[] r9 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x03d5 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x03d5 }
            r13 = 0
            r9[r13] = r11     // Catch:{ Exception -> 0x03d5 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x03d5 }
            r13 = 1
            r9[r13] = r11     // Catch:{ Exception -> 0x03d5 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x03d5 }
            r13 = 2
            r9[r13] = r11     // Catch:{ Exception -> 0x03d5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r9)     // Catch:{ Exception -> 0x03d5 }
            r0.setPreviewFpsRange(r10, r6)     // Catch:{ Exception -> 0x03d5 }
            r2.mo158262f(r0)     // Catch:{ Exception -> 0x03d5 }
            r7 = 0
            goto L_0x03ef
        L_0x03d5:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "steve: SafeSetFps by setPreviewFpsRange error:"
            r6.append(r7)
            java.lang.String r0 = r0.toString()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x03ee:
            r7 = 1
        L_0x03ef:
            if (r7 == 0) goto L_0x0424
            java.lang.String r0 = "steve: SafeSetFps by setPreviewFrameRate target fps %d"
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x040b }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x040b }
            r9 = 0
            r7[r9] = r6     // Catch:{ Exception -> 0x040b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r7)     // Catch:{ Exception -> 0x040b }
            android.hardware.Camera$Parameters r0 = r2.mo158259c()     // Catch:{ Exception -> 0x040b }
            r0.setPreviewFrameRate(r12)     // Catch:{ Exception -> 0x040b }
            r2.mo158262f(r0)     // Catch:{ Exception -> 0x040b }
            goto L_0x0424
        L_0x040b:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "steve: SafeSetFps by setPreviewFrameRate error:"
            r2.append(r6)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x0424:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Camera Open Success, try set size: w,h:"
            r0.append(r2)
            r0.append(r3)
            r0.append(r8)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            boolean r0 = r1.f320236a
            if (r0 == 0) goto L_0x0447
            c43.b r0 = b43.C104035d.f307670a
            android.graphics.Point r0 = r0.f308693g
            goto L_0x044b
        L_0x0447:
            c43.b r0 = b43.C104035d.f307670a
            android.graphics.Point r0 = r0.f308694h
        L_0x044b:
            if (r0 == 0) goto L_0x044f
            r2 = 1
            goto L_0x0450
        L_0x044f:
            r2 = 0
        L_0x0450:
            if (r0 == 0) goto L_0x047e
            android.util.Size r6 = new android.util.Size
            int r7 = r0.x
            int r0 = r0.y
            r6.<init>(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "getCameraSize from table:"
            r0.append(r7)
            int r7 = r6.getWidth()
            r0.append(r7)
            r0.append(r8)
            int r7 = r6.getHeight()
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x047f
        L_0x047e:
            r6 = 0
        L_0x047f:
            gj.z r0 = r1.f320239d     // Catch:{ Exception -> 0x04aa }
            android.util.Size r3 = m144743o(r0, r3, r4)     // Catch:{ Exception -> 0x04aa }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04a8 }
            r0.<init>()     // Catch:{ Exception -> 0x04a8 }
            java.lang.String r4 = "getCameraResolution:"
            r0.append(r4)     // Catch:{ Exception -> 0x04a8 }
            int r4 = r3.getWidth()     // Catch:{ Exception -> 0x04a8 }
            r0.append(r4)     // Catch:{ Exception -> 0x04a8 }
            r0.append(r8)     // Catch:{ Exception -> 0x04a8 }
            int r4 = r3.getHeight()     // Catch:{ Exception -> 0x04a8 }
            r0.append(r4)     // Catch:{ Exception -> 0x04a8 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x04a8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)     // Catch:{ Exception -> 0x04a8 }
            goto L_0x04bb
        L_0x04a8:
            r0 = move-exception
            goto L_0x04ac
        L_0x04aa:
            r0 = move-exception
            r3 = 0
        L_0x04ac:
            r4 = 1
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getMessage()
            r4 = 0
            r7[r4] = r0
            java.lang.String r0 = "getCameraResolution failed: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r7)
        L_0x04bb:
            java.lang.String r0 = ",h"
            if (r2 == 0) goto L_0x0549
            gj.z r2 = r1.f320239d
            int r4 = r6.getWidth()
            int r7 = r6.getHeight()
            boolean r2 = r1.mo157422q(r2, r4, r7)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "1.try config size first! w"
            r4.append(r7)
            int r7 = r6.getWidth()
            r4.append(r7)
            r4.append(r0)
            int r6 = r6.getHeight()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            if (r2 != 0) goto L_0x05a6
            if (r3 == 0) goto L_0x05a6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "1.try config size failed!,try support size: w"
            r2.append(r4)
            int r4 = r3.getWidth()
            r2.append(r4)
            r2.append(r0)
            int r4 = r3.getHeight()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r2)
            gj.z r2 = r1.f320239d
            int r4 = r3.getWidth()
            int r6 = r3.getHeight()
            boolean r2 = r1.mo157422q(r2, r4, r6)
            if (r2 != 0) goto L_0x05a6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "1.try support size fail: w"
            r2.append(r4)
            int r4 = r3.getWidth()
            r2.append(r4)
            r2.append(r0)
            int r0 = r3.getHeight()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            r2 = -1
            return r2
        L_0x0549:
            java.lang.String r2 = "2.no config size!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            if (r3 == 0) goto L_0x05a6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "2.try support size alternatively! w"
            r2.append(r4)
            int r4 = r3.getWidth()
            r2.append(r4)
            r2.append(r0)
            int r4 = r3.getHeight()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            gj.z r2 = r1.f320239d
            int r4 = r3.getWidth()
            int r6 = r3.getHeight()
            boolean r2 = r1.mo157422q(r2, r4, r6)
            if (r2 != 0) goto L_0x05a6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "2.try support size fail: w"
            r2.append(r4)
            int r4 = r3.getWidth()
            r2.append(r4)
            r2.append(r0)
            int r0 = r3.getHeight()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            r2 = -1
            return r2
        L_0x05a6:
            gj.z r0 = r1.f320239d
            boolean r2 = r1.f320236a
            r1.mo157423r(r0, r2)
            gj.z r0 = r1.f320239d     // Catch:{ Exception -> 0x062d }
            android.hardware.Camera$Parameters r0 = r0.mo158259c()     // Catch:{ Exception -> 0x062d }
            r1.f320240e = r0     // Catch:{ Exception -> 0x062d }
            android.hardware.Camera$Size r0 = r0.getPreviewSize()     // Catch:{ Exception -> 0x062d }
            if (r0 == 0) goto L_0x05c6
            android.util.Size r2 = new android.util.Size     // Catch:{ Exception -> 0x062d }
            int r3 = r0.width     // Catch:{ Exception -> 0x062d }
            int r0 = r0.height     // Catch:{ Exception -> 0x062d }
            r2.<init>(r3, r0)     // Catch:{ Exception -> 0x062d }
            r1.f320241f = r2     // Catch:{ Exception -> 0x062d }
        L_0x05c6:
            android.hardware.Camera$Parameters r0 = r1.f320240e     // Catch:{ Exception -> 0x05cd }
            int r0 = r0.getPreviewFrameRate()     // Catch:{ Exception -> 0x05cd }
            goto L_0x05de
        L_0x05cd:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r2 = 0
            r3[r2] = r0
            java.lang.String r0 = "getPreviewFrameRate failed: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r3)
            r0 = 0
        L_0x05de:
            int r2 = b43.C104035d.f307675f
            r1.f320242g = r2
            if (r2 > 0) goto L_0x05e7
            r2 = 7
            r1.f320242g = r2
        L_0x05e7:
            r2 = 6
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 0
            r2[r3] = r0
            android.util.Size r0 = r1.f320241f
            int r0 = r0.getWidth()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 1
            r2[r3] = r0
            android.util.Size r0 = r1.f320241f
            int r0 = r0.getHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 2
            r2[r3] = r0
            int r0 = r1.f320242g
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 3
            r2[r3] = r0
            int r0 = b43.C104035d.f307673d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 4
            r2[r3] = r0
            int r0 = r1.f320237b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 5
            r2[r3] = r0
            java.lang.String r0 = "Camera ok, fps: %d, mSize.width: %d, mSize.height: %d, format: %d, IsRotate180: %d, displayOrientation: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r2)
            r2 = 1
            return r2
        L_0x062d:
            r0 = move-exception
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 159(0x9f, double:7.86E-322)
            r9 = 0
            r11 = 1
            r13 = 0
            r6.idkeyStat(r7, r9, r11, r13)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "try getParameters and getPreviewSize fail, error:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r2)
            r2 = -1
            return r2
        L_0x064b:
            r0 = move-exception
            r2 = r0
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 159(0x9f, double:7.86E-322)
            r9 = 0
            r11 = 1
            r13 = 0
            r6.idkeyStat(r7, r9, r11, r13)
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r4 = r2.getMessage()
            r6 = 0
            r0[r6] = r4
            java.lang.String r4 = "Camera open failed, error:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r4, r0)
            b43.c r0 = r1.f320244i
            if (r0 == 0) goto L_0x06a3
            r0.mo145648k()     // Catch:{ Exception -> 0x0694 }
            r1.f320248m = r3     // Catch:{ Exception -> 0x0694 }
            gj.z r0 = r1.f320239d     // Catch:{ Exception -> 0x0691 }
            boolean r0 = r0.f322938c     // Catch:{ Exception -> 0x0691 }
            if (r0 != 0) goto L_0x067d
            gj.z r0 = r1.f320239d     // Catch:{ Exception -> 0x0691 }
            r3 = 0
            r0.mo158263g(r3)     // Catch:{ Exception -> 0x0691 }
        L_0x067d:
            b43.c r0 = r1.f320244i     // Catch:{ Exception -> 0x0691 }
            if (r0 == 0) goto L_0x0685
            r3 = 2
            r0.mo145645D(r3)     // Catch:{ Exception -> 0x0691 }
        L_0x0685:
            r30.mo145641m()     // Catch:{ Exception -> 0x0691 }
            gj.z r0 = r1.f320239d     // Catch:{ Exception -> 0x0691 }
            r0.mo158260d()     // Catch:{ Exception -> 0x0691 }
            r3 = 0
            r1.f320239d = r3     // Catch:{ Exception -> 0x0691 }
            goto L_0x06a3
        L_0x0691:
            r0 = move-exception
            r3 = 1
            goto L_0x0695
        L_0x0694:
            r0 = move-exception
        L_0x0695:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r2 = r2.getMessage()
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "Camera open failed2, error:%s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r2, r3)
        L_0x06a3:
            r2 = -1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d43.C106987a.mo157421p(boolean, int, int):int");
    }

    /* renamed from: q */
    public final boolean mo157422q(C107848z zVar, int i, int i2) {
        if (zVar == null) {
            return false;
        }
        try {
            Camera.Parameters c = zVar.mo158259c();
            if (i > 0 && i2 > 0) {
                c.setPreviewSize(i, i2);
            }
            zVar.mo158262f(c);
            return true;
        } catch (Exception e) {
            C115669n.INSTANCE.idkeyStat(159, 0, 1, false);
            Log.m105920e("MicroMsg.Voip.CaptureRender", "TryPreviewSize fail:" + e.toString());
            return false;
        }
    }

    /* renamed from: r */
    public final boolean mo157423r(C107848z zVar, boolean z) {
        if (zVar == null) {
            return false;
        }
        try {
            Log.m105925i("MicroMsg.Voip.CaptureRender", "trySetAutoFocus, isFrontCamera:%s", Boolean.valueOf(z));
            Camera.Parameters c = zVar.mo158259c();
            List<String> supportedFocusModes = c.getSupportedFocusModes();
            if (supportedFocusModes != null) {
                Log.m105924i("MicroMsg.Voip.CaptureRender", "supported focus modes size = " + supportedFocusModes.size());
                for (String str : supportedFocusModes) {
                    Log.m105924i("MicroMsg.Voip.CaptureRender", "supported focus modes : " + str);
                }
                int i = C107835h0.f322845b.f322793H;
                if (i != 0 || !z) {
                    if (i == 1 || !z) {
                        if (supportedFocusModes.contains("continuous-video")) {
                            Log.m105924i("MicroMsg.Voip.CaptureRender", "camera support continuous video focus");
                            c.setFocusMode("continuous-video");
                        } else if (supportedFocusModes.contains("auto")) {
                            Log.m105924i("MicroMsg.Voip.CaptureRender", "camera support auto focus");
                            c.setFocusMode("auto");
                        }
                    }
                } else if (supportedFocusModes.contains("auto")) {
                    Log.m105924i("MicroMsg.Voip.CaptureRender", "camera support auto focus");
                    c.setFocusMode("auto");
                } else if (supportedFocusModes.contains("continuous-video")) {
                    Log.m105924i("MicroMsg.Voip.CaptureRender", "camera support continuous video focus");
                    c.setFocusMode("continuous-video");
                }
                zVar.mo158262f(c);
            }
            return true;
        } catch (Exception e) {
            C115669n.INSTANCE.idkeyStat(159, 0, 1, false);
            Log.m105920e("MicroMsg.Voip.CaptureRender", "TrySetAutoFocus fail:" + e.toString());
            return false;
        }
    }
}
