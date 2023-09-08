package c43;

import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import b43.C104032b;
import b43.C104034c;
import b43.C104035d;
import com.tencent.p014mm.autogen.events.PermissionShowDlgEvent;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105153k;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.video.ObservableSurfaceView;
import com.tencent.p014mm.plugin.video.ObservableTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2helper;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import l33.C109247e;
import p156gj.C107848z;
import p156gj.C8325f0;
import u13.C111103a;
import u13.C111104b;

/* renamed from: c43.a */
public class C104296a implements C111103a, C111104b, C104032b.C104033a {

    /* renamed from: J */
    public static final Pattern f308656J = Pattern.compile(",");

    /* renamed from: A */
    public int f308657A;

    /* renamed from: B */
    public int f308658B;

    /* renamed from: C */
    public int f308659C = 0;

    /* renamed from: D */
    public int f308660D = 0;

    /* renamed from: E */
    public boolean f308661E = false;

    /* renamed from: F */
    public byte[] f308662F = null;

    /* renamed from: G */
    public C104032b f308663G;

    /* renamed from: H */
    public int f308664H;

    /* renamed from: I */
    public Camera.PreviewCallback f308665I = new C104297a();

    /* renamed from: d */
    public boolean f308666d = false;

    /* renamed from: e */
    public boolean f308667e = false;

    /* renamed from: f */
    public int f308668f = 0;

    /* renamed from: g */
    public C107848z f308669g;

    /* renamed from: h */
    public Camera.Parameters f308670h;

    /* renamed from: i */
    public C8325f0 f308671i;

    /* renamed from: j */
    public int f308672j;

    /* renamed from: n */
    public boolean f308673n = false;

    /* renamed from: o */
    public boolean f308674o = false;

    /* renamed from: p */
    public ObservableSurfaceView f308675p = null;

    /* renamed from: q */
    public ObservableTextureView f308676q;

    /* renamed from: r */
    public SurfaceTexture f308677r;

    /* renamed from: s */
    public boolean f308678s = false;

    /* renamed from: t */
    public int f308679t = -1;

    /* renamed from: u */
    public C104034c f308680u;

    /* renamed from: v */
    public boolean f308681v = false;

    /* renamed from: w */
    public boolean f308682w = false;

    /* renamed from: x */
    public byte[] f308683x = null;

    /* renamed from: y */
    public List<byte[]> f308684y;

    /* renamed from: z */
    public int f308685z;

    /* renamed from: c43.a$a */
    public class C104297a implements Camera.PreviewCallback {
        public C104297a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00ef  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00f5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPreviewFrame(byte[] r29, android.hardware.Camera r30) {
            /*
                r28 = this;
                r0 = r28
                r1 = r29
                if (r1 == 0) goto L_0x00fb
                int r2 = r1.length
                if (r2 > 0) goto L_0x000b
                goto L_0x00fb
            L_0x000b:
                c43.a r2 = c43.C104296a.this
                gj.f0 r3 = r2.f308671i
                java.lang.String r4 = "MicroMsg.Voip.CaptureRender"
                if (r3 != 0) goto L_0x0019
                java.lang.String r1 = "onPreviewFrame mSize is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
                return
            L_0x0019:
                b43.c r3 = r2.f308680u
                if (r3 == 0) goto L_0x00fa
                byte[] r3 = r2.f308662F
                if (r3 == 0) goto L_0x0025
                int r3 = r3.length
                int r5 = r1.length
                if (r3 == r5) goto L_0x002a
            L_0x0025:
                int r3 = r1.length
                byte[] r3 = new byte[r3]
                r2.f308662F = r3
            L_0x002a:
                byte[] r2 = r2.f308662F
                int r3 = r1.length
                r5 = 0
                java.lang.System.arraycopy(r1, r5, r2, r5, r3)
                c43.a r2 = c43.C104296a.this
                boolean r3 = r2.f308666d
                r6 = 1
                if (r3 == 0) goto L_0x0049
                int r3 = b43.C104035d.f307673d
                gj.d r7 = p156gj.C107835h0.f322845b
                boolean r8 = r7.f322811j
                if (r8 == 0) goto L_0x005d
                gj.d$a r7 = r7.f322810i
                int r8 = r7.f322831d
                if (r8 == 0) goto L_0x005d
                int r7 = r7.f322832e
                goto L_0x0059
            L_0x0049:
                int r3 = b43.C104035d.f307674e
                gj.d r7 = p156gj.C107835h0.f322845b
                boolean r8 = r7.f322813l
                if (r8 == 0) goto L_0x005d
                gj.d$a r7 = r7.f322812k
                int r8 = r7.f322831d
                if (r8 == 0) goto L_0x005d
                int r7 = r7.f322832e
            L_0x0059:
                r17 = r7
                r7 = 1
                goto L_0x0060
            L_0x005d:
                r7 = 0
                r17 = 1
            L_0x0060:
                if (r3 <= 0) goto L_0x0067
                r8 = 32
                r25 = 32
                goto L_0x0069
            L_0x0067:
                r25 = 0
            L_0x0069:
                if (r7 == 0) goto L_0x006d
            L_0x006b:
                r6 = 0
                goto L_0x006f
            L_0x006d:
                if (r3 <= 0) goto L_0x006b
            L_0x006f:
                r2.f308667e = r6
                gj.f0 r3 = r2.f308671i
                int r6 = r3.f27283a
                int r3 = r3.f27284b
                if (r7 == 0) goto L_0x00c6
                r2.getClass()
                boolean r2 = r2 instanceof com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105153k
                if (r2 != 0) goto L_0x00c6
                c43.a r2 = c43.C104296a.this
                byte[] r7 = r2.f308683x
                if (r7 != 0) goto L_0x0094
                int r7 = r6 * r3
                int r7 = r7 * 3
                int r7 = r7 / 2
                byte[] r7 = new byte[r7]
                r2.f308683x = r7
                r2 = 90
                r7[r5] = r2
            L_0x0094:
                com.tencent.mm.plugin.voip.model.h0 r7 = l33.C109247e.xx0()
                c43.a r2 = c43.C104296a.this
                byte[] r8 = r2.f308662F
                int r9 = r8.length
                int r12 = r2.f308672j
                byte[] r13 = r2.f308683x
                int r14 = r13.length
                r10 = r6
                r11 = r3
                r15 = r6
                r16 = r3
                r7.mo152601O(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                c43.a r2 = c43.C104296a.this
                b43.c r5 = r2.f308680u
                byte[] r7 = r2.f308683x
                int r8 = r7.length
                long r8 = (long) r8
                int r2 = r2.f308672j
                r26 = 0
                r18 = r5
                r19 = r7
                r20 = r8
                r22 = r6
                r23 = r3
                r24 = r2
                r18.mo145646I(r19, r20, r22, r23, r24, r25, r26)
                goto L_0x00e7
            L_0x00c6:
                c43.a r2 = c43.C104296a.this
                b43.c r3 = r2.f308680u
                byte[] r5 = r2.f308662F
                int r6 = r5.length
                long r6 = (long) r6
                gj.f0 r8 = r2.f308671i
                int r9 = r8.f27283a
                int r8 = r8.f27284b
                int r2 = r2.f308672j
                r26 = 0
                r18 = r3
                r19 = r5
                r20 = r6
                r22 = r9
                r23 = r8
                r24 = r2
                r18.mo145646I(r19, r20, r22, r23, r24, r25, r26)
            L_0x00e7:
                android.net.Uri r2 = z33.C91617n.f262467a
                c43.a r2 = c43.C104296a.this
                gj.z r2 = r2.f308669g
                if (r2 != 0) goto L_0x00f5
                java.lang.String r1 = "the camera is null and has been release"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
                return
            L_0x00f5:
                if (r2 == 0) goto L_0x00fa
                r2.mo158257a(r1)
            L_0x00fa:
                return
            L_0x00fb:
                com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r6 = 159(0x9f, double:7.86E-322)
                r8 = 0
                r10 = 1
                r12 = 0
                r5 = r1
                r5.idkeyStat(r6, r8, r10, r12)
                r8 = 3
                r5.idkeyStat(r6, r8, r10, r12)
                c43.a r1 = c43.C104296a.this
                b43.c r1 = r1.f308680u
                if (r1 == 0) goto L_0x0116
                r1.mo145648k()
            L_0x0116:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c43.C104296a.C104297a.onPreviewFrame(byte[], android.hardware.Camera):void");
        }
    }

    public C104296a(int i, int i2) {
        this.f308685z = i;
        this.f308657A = i2;
        C104035d.m138788b(MMApplicationContext.getContext().getApplicationContext());
        Log.m105919d("MicroMsg.Voip.CaptureRender", "width: %d, height: %d", Integer.valueOf(this.f308685z), Integer.valueOf(this.f308657A));
    }

    /* renamed from: b */
    public static C8325f0 m139246b(C107848z zVar, int i, int i2) {
        Camera.Parameters c = zVar.mo158259c();
        Point point = new Point(i, i2);
        String str = c.get("preview-size-values");
        if (str == null) {
            str = c.get("preview-size-value");
        }
        Point point2 = null;
        if (str != null) {
            Log.m105924i("MicroMsg.Voip.CaptureRender", "preview-size-values parameter: " + str);
            String[] split = f308656J.split(str);
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
        return new C8325f0(point2.x, point2.y);
    }

    /* renamed from: a */
    public void mo145975a() {
        if (C104035d.f307670a.f308688b < 2) {
            Log.m105920e("MicroMsg.Voip.CaptureRender", "ExchangeCapture...gCameraNum= " + C104035d.f307670a.f308688b);
            return;
        }
        Log.m105924i("MicroMsg.Voip.CaptureRender", "ExchangeCapture start, gCameraNum= " + C104035d.f307670a.f308688b);
        mo145981i();
        mo145977e(this.f308680u, this.f308666d ^ true);
        mo145980h();
        if (!(this instanceof C105153k)) {
            C109247e.xx0().mo152591E(this.f308668f);
        }
    }

    /* renamed from: c */
    public void mo145644c(int i) {
        this.f308664H = i;
        this.f308680u.mo145647c(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0436  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0439  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x049a  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0510  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0569  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x063e A[Catch:{ Exception -> 0x06af }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0655  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1 A[SYNTHETIC, Splitter:B:34:0x00d1] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ca A[Catch:{ Exception -> 0x0234 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0215 A[Catch:{ Exception -> 0x0234 }, LOOP:2: B:75:0x020f->B:77:0x0215, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0249 A[Catch:{ Exception -> 0x06cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x025a  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo145976d(boolean r33, int r34, int r35) {
        /*
            r32 = this;
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "try open camera, face: "
            r0.append(r5)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "MicroMsg.Voip.CaptureRender"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            gj.z r0 = r1.f308669g
            r6 = 0
            r7 = 0
            r8 = 1
            if (r0 == 0) goto L_0x0051
            boolean r9 = r1.f308666d
            if (r9 == r2) goto L_0x004e
            boolean r0 = r0.f322938c     // Catch:{ Exception -> 0x003f }
            if (r0 != 0) goto L_0x0032
            gj.z r0 = r1.f308669g     // Catch:{ Exception -> 0x003f }
            r0.mo158263g(r6)     // Catch:{ Exception -> 0x003f }
        L_0x0032:
            gj.z r0 = r1.f308669g     // Catch:{ Exception -> 0x003f }
            r0.mo158268l()     // Catch:{ Exception -> 0x003f }
            gj.z r0 = r1.f308669g     // Catch:{ Exception -> 0x003f }
            r0.mo158260d()     // Catch:{ Exception -> 0x003f }
            r1.f308669g = r6     // Catch:{ Exception -> 0x003f }
            goto L_0x0051
        L_0x003f:
            r0 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Throwable r0 = r0.fillInStackTrace()
            r9[r7] = r0
            java.lang.String r0 = "stop preview crash cause %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r9)
            goto L_0x0051
        L_0x004e:
            boolean r0 = r1.f308661E
            goto L_0x0052
        L_0x0051:
            r0 = 1
        L_0x0052:
            java.lang.String r9 = ","
            r10 = -1
            if (r0 == 0) goto L_0x0245
            c43.b r0 = b43.C104035d.f307670a
            int r0 = r0.f308688b
            if (r0 > 0) goto L_0x005e
            goto L_0x0093
        L_0x005e:
            boolean r0 = b43.C104035d.m138787a()
            if (r0 != 0) goto L_0x0065
            goto L_0x0093
        L_0x0065:
            java.lang.String r0 = "Camera"
            if (r2 != r8) goto L_0x007a
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0095 }
            int r12 = b43.C104035d.f307671b     // Catch:{ Exception -> 0x0095 }
            gj.f r11 = p156gj.C107828e.m146101d(r11, r12, r6)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r12 = "Use front"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)     // Catch:{ Exception -> 0x0095 }
            r0 = 1
            goto L_0x008a
        L_0x007a:
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0095 }
            int r12 = b43.C104035d.f307672c     // Catch:{ Exception -> 0x0095 }
            gj.f r11 = p156gj.C107828e.m146101d(r11, r12, r6)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r12 = "Use back"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)     // Catch:{ Exception -> 0x0095 }
            r0 = 0
        L_0x008a:
            if (r11 == 0) goto L_0x0093
            gj.z r11 = r11.f322839a     // Catch:{ Exception -> 0x0095 }
            r11.f322937b = r0     // Catch:{ Exception -> 0x0091 }
            goto L_0x00cf
        L_0x0091:
            r0 = move-exception
            goto L_0x0097
        L_0x0093:
            r11 = r6
            goto L_0x00cf
        L_0x0095:
            r0 = move-exception
            r11 = r6
        L_0x0097:
            com.tencent.mm.plugin.report.service.n r20 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r21 = 159(0x9f, double:7.86E-322)
            r15 = 0
            r23 = 1
            r25 = 0
            r13 = 159(0x9f, double:7.86E-322)
            r17 = 1
            r19 = 0
            r12 = r20
            r12.idkeyStat(r13, r15, r17, r19)
            r15 = 1
            r13 = r21
            r17 = r23
            r19 = r25
            r12.idkeyStat(r13, r15, r17, r19)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "openCameraByHighApiLvl:error:"
            r12.append(r13)
            java.lang.String r0 = r0.toString()
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x00cf:
            if (r11 != 0) goto L_0x013f
            gj.z r11 = new gj.z     // Catch:{ Exception -> 0x00fd }
            java.lang.Object r12 = new java.lang.Object     // Catch:{ Exception -> 0x00fd }
            r12.<init>()     // Catch:{ Exception -> 0x00fd }
            java.lang.String r13 = "com/tencent/mm/plugin/voip/video/camera/prev/CaptureRender"
            java.lang.String r14 = "safeOpenCamera"
            java.lang.String r15 = "(Z)Lcom/tencent/mm/compatible/deviceinfo/MCamera;"
            java.lang.String r16 = "android/hardware/Camera"
            java.lang.String r17 = "open"
            java.lang.String r18 = "()Landroid/hardware/Camera;"
            java.lang.Object r0 = j20.C117292a.m165363i(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x00fd }
            android.hardware.Camera r0 = (android.hardware.Camera) r0     // Catch:{ Exception -> 0x00fd }
            r11.<init>(r0)     // Catch:{ Exception -> 0x00fd }
            r1.f308666d = r7
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 159(0x9f, double:7.86E-322)
            r15 = 0
            r17 = 1
            r19 = 0
            r12.idkeyStat(r13, r15, r17, r19)
            goto L_0x0148
        L_0x00fd:
            r0 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "OpenCameraError:"
            r11.append(r12)
            java.lang.String r0 = r0.toString()
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r19 = 159(0x9f, double:7.86E-322)
            r14 = 0
            r21 = 1
            r23 = 0
            r12 = 159(0x9f, double:7.86E-322)
            r16 = 1
            r18 = 0
            r11 = r0
            r11.idkeyStat(r12, r14, r16, r18)
            r14 = 1
            r12 = r19
            r16 = r21
            r18 = r23
            r11.idkeyStat(r12, r14, r16, r18)
            b43.c r0 = r1.f308680u
            if (r0 == 0) goto L_0x013c
            r0.mo145648k()
        L_0x013c:
            r11 = r6
            goto L_0x023c
        L_0x013f:
            r1.f308666d = r2
            b43.c r0 = r1.f308680u
            int r12 = r1.f308664H
            r0.mo145647c(r12)
        L_0x0148:
            android.hardware.Camera$CameraInfo r0 = new android.hardware.Camera$CameraInfo     // Catch:{ Exception -> 0x0157 }
            r0.<init>()     // Catch:{ Exception -> 0x0157 }
            int r12 = r11.f322937b     // Catch:{ Exception -> 0x0157 }
            android.hardware.Camera.getCameraInfo(r12, r0)     // Catch:{ Exception -> 0x0157 }
            int r0 = r0.orientation     // Catch:{ Exception -> 0x0157 }
            r1.f308679t = r0     // Catch:{ Exception -> 0x0157 }
            goto L_0x015f
        L_0x0157:
            r0 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r7]
            java.lang.String r13 = "get camori error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r13, r12)
        L_0x015f:
            android.hardware.Camera$Parameters r0 = r11.mo158259c()     // Catch:{ Exception -> 0x0168 }
            java.util.List r0 = r0.getSupportedPreviewFrameRates()     // Catch:{ Exception -> 0x0168 }
            goto L_0x0182
        L_0x0168:
            r0 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "getSupportedPreviewFrameRates:error:"
            r12.append(r13)
            java.lang.String r0 = r0.toString()
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
            r0 = r6
        L_0x0182:
            java.lang.String r12 = "supportFps:"
            if (r0 == 0) goto L_0x01ac
            r13 = 0
        L_0x0187:
            int r14 = r0.size()
            if (r13 >= r14) goto L_0x01ac
            java.lang.Object r14 = r0.get(r13)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r12)
            r15.append(r14)
            r15.append(r9)
            java.lang.String r12 = r15.toString()
            int r13 = r13 + 1
            goto L_0x0187
        L_0x01ac:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r12)
            android.hardware.Camera$Parameters r0 = r11.mo158259c()     // Catch:{ Exception -> 0x0234 }
            java.util.List r0 = r0.getSupportedPreviewSizes()     // Catch:{ Exception -> 0x0234 }
            if (r0 == 0) goto L_0x01fb
            int r12 = r0.size()     // Catch:{ Exception -> 0x0234 }
            if (r12 == 0) goto L_0x01fb
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0234 }
            r12 = 0
        L_0x01c4:
            boolean r13 = r0.hasNext()     // Catch:{ Exception -> 0x0234 }
            if (r13 == 0) goto L_0x01fb
            java.lang.Object r13 = r0.next()     // Catch:{ Exception -> 0x0234 }
            android.hardware.Camera$Size r13 = (android.hardware.Camera.Size) r13     // Catch:{ Exception -> 0x0234 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0234 }
            r14.<init>()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r15 = "support Size:"
            r14.append(r15)     // Catch:{ Exception -> 0x0234 }
            int r15 = r13.width     // Catch:{ Exception -> 0x0234 }
            r14.append(r15)     // Catch:{ Exception -> 0x0234 }
            r14.append(r9)     // Catch:{ Exception -> 0x0234 }
            int r15 = r13.height     // Catch:{ Exception -> 0x0234 }
            r14.append(r15)     // Catch:{ Exception -> 0x0234 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x0234 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r14)     // Catch:{ Exception -> 0x0234 }
            if (r12 != 0) goto L_0x01f8
            int r14 = r13.width     // Catch:{ Exception -> 0x0234 }
            r1.f308659C = r14     // Catch:{ Exception -> 0x0234 }
            int r13 = r13.height     // Catch:{ Exception -> 0x0234 }
            r1.f308660D = r13     // Catch:{ Exception -> 0x0234 }
        L_0x01f8:
            int r12 = r12 + 1
            goto L_0x01c4
        L_0x01fb:
            android.hardware.Camera$Parameters r0 = r11.mo158259c()     // Catch:{ Exception -> 0x0234 }
            java.util.List r0 = r0.getSupportedPreviewFormats()     // Catch:{ Exception -> 0x0234 }
            if (r0 == 0) goto L_0x023c
            int r12 = r0.size()     // Catch:{ Exception -> 0x0234 }
            if (r12 == 0) goto L_0x023c
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0234 }
        L_0x020f:
            boolean r12 = r0.hasNext()     // Catch:{ Exception -> 0x0234 }
            if (r12 == 0) goto L_0x023c
            java.lang.Object r12 = r0.next()     // Catch:{ Exception -> 0x0234 }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ Exception -> 0x0234 }
            int r12 = r12.intValue()     // Catch:{ Exception -> 0x0234 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0234 }
            r13.<init>()     // Catch:{ Exception -> 0x0234 }
            java.lang.String r14 = "support Format:"
            r13.append(r14)     // Catch:{ Exception -> 0x0234 }
            r13.append(r12)     // Catch:{ Exception -> 0x0234 }
            java.lang.String r12 = r13.toString()     // Catch:{ Exception -> 0x0234 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r12)     // Catch:{ Exception -> 0x0234 }
            goto L_0x020f
        L_0x0234:
            r0 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r7]
            java.lang.String r13 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r13, r12)
        L_0x023c:
            r1.f308669g = r11
            if (r11 != 0) goto L_0x0243
            r1.f308673n = r7
            return r10
        L_0x0243:
            r1.f308661E = r7
        L_0x0245:
            gj.z r0 = r1.f308669g     // Catch:{ Exception -> 0x06cd }
            if (r0 == 0) goto L_0x024c
            r0.mo158259c()     // Catch:{ Exception -> 0x06cd }
        L_0x024c:
            r1.f308673n = r8
            gj.z r11 = r1.f308669g
            c43.b r0 = b43.C104035d.f307670a
            int r12 = r0.f308687a
            r16 = 2
            if (r11 != 0) goto L_0x025a
            goto L_0x040d
        L_0x025a:
            java.lang.String r0 = "safeSetFps: %s"
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x03be }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x03be }
            r6[r7] = r18     // Catch:{ Exception -> 0x03be }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r6)     // Catch:{ Exception -> 0x03be }
            android.hardware.Camera$Parameters r0 = r11.mo158259c()     // Catch:{ Exception -> 0x03be }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()     // Catch:{ Exception -> 0x03be }
            r10 = 26
            if (r6 == 0) goto L_0x0285
            java.lang.Class<lc3.b> r6 = lc3.C10485b.class
            k40.a r6 = f40.C86709a0.m107533q(r6)     // Catch:{ Exception -> 0x03be }
            lc3.b r6 = (lc3.C10485b) r6     // Catch:{ Exception -> 0x03be }
            pj.f r6 = r6.vh0()     // Catch:{ Exception -> 0x03be }
            java.lang.String r13 = "VoipCaptureRenderFpsRangeMinApiLevel"
            int r10 = r6.mo107404b(r13, r10)     // Catch:{ Exception -> 0x03be }
        L_0x0285:
            java.lang.String r6 = "setFpsRange minApiLevel:%s"
            java.lang.Object[] r13 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x03be }
            java.lang.Integer r20 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x03be }
            r13[r7] = r20     // Catch:{ Exception -> 0x03be }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r13)     // Catch:{ Exception -> 0x03be }
            boolean r6 = p206nj.C76866m.m92676e()     // Catch:{ Exception -> 0x03be }
            if (r6 != 0) goto L_0x029e
            boolean r6 = p206nj.C11171e.m11046c(r10)     // Catch:{ Exception -> 0x03be }
            if (r6 == 0) goto L_0x03d8
        L_0x029e:
            gj.d r6 = p156gj.C107835h0.f322845b     // Catch:{ Exception -> 0x03be }
            if (r6 == 0) goto L_0x02ab
            int r10 = r6.f322798M     // Catch:{ Exception -> 0x03be }
            int r10 = r10 * 1000
            int r6 = r6.f322799N     // Catch:{ Exception -> 0x03be }
            int r6 = r6 * 1000
            goto L_0x02ad
        L_0x02ab:
            r6 = -1
            r10 = -1
        L_0x02ad:
            r20 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 <= 0) goto L_0x02b9
            if (r6 <= 0) goto L_0x02b9
            if (r6 < r10) goto L_0x02b9
            r23 = 1
            goto L_0x036e
        L_0x02b9:
            if (r10 != 0) goto L_0x02c5
            if (r6 != 0) goto L_0x02c5
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r23 = 0
            goto L_0x036e
        L_0x02c5:
            java.util.List r6 = r0.getSupportedPreviewFpsRange()     // Catch:{ Exception -> 0x03be }
            if (r6 == 0) goto L_0x03d7
            int r10 = r6.size()     // Catch:{ Exception -> 0x03be }
            if (r10 != 0) goto L_0x02d3
            goto L_0x03d7
        L_0x02d3:
            int r10 = r6.size()     // Catch:{ Exception -> 0x03be }
            r13 = 0
            r21 = -2147483648(0xffffffff80000000, float:-0.0)
            r23 = 0
            r26 = 2147483647(0x7fffffff, float:NaN)
        L_0x02df:
            if (r13 >= r10) goto L_0x036a
            java.lang.Object r24 = r6.get(r13)     // Catch:{ Exception -> 0x03be }
            r14 = r24
            int[] r14 = (int[]) r14     // Catch:{ Exception -> 0x03be }
            if (r14 == 0) goto L_0x0359
            int r15 = r14.length     // Catch:{ Exception -> 0x03be }
            if (r15 > r8) goto L_0x02f0
            goto L_0x0359
        L_0x02f0:
            r15 = r14[r7]     // Catch:{ Exception -> 0x03be }
            r14 = r14[r8]     // Catch:{ Exception -> 0x03be }
            java.lang.String r8 = "dkfps %d:[%d %d]"
            r29 = r6
            r7 = 3
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x03be }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x03be }
            r28 = 0
            r6[r28] = r7     // Catch:{ Exception -> 0x03be }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x03be }
            r27 = 1
            r6[r27] = r7     // Catch:{ Exception -> 0x03be }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x03be }
            r6[r16] = r7     // Catch:{ Exception -> 0x03be }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r6)     // Catch:{ Exception -> 0x03be }
            if (r15 < 0) goto L_0x035b
            if (r14 >= r15) goto L_0x0319
            goto L_0x035b
        L_0x0319:
            int r6 = r14 / 1000
            int r7 = r15 / 1000
            int r8 = r12 + 5
            r30 = r10
            r10 = 30
            int r8 = java.lang.Math.min(r8, r10)     // Catch:{ Exception -> 0x03be }
            int r10 = r12 + -5
            r31 = r14
            r14 = 5
            int r10 = java.lang.Math.max(r10, r14)     // Catch:{ Exception -> 0x03be }
            if (r6 < r10) goto L_0x033a
            if (r6 > r8) goto L_0x033a
            if (r7 < r10) goto L_0x033a
            if (r7 > r8) goto L_0x033a
            r8 = 1
            goto L_0x033b
        L_0x033a:
            r8 = 0
        L_0x033b:
            if (r8 == 0) goto L_0x0356
            int r7 = r12 - r7
            int r7 = java.lang.Math.abs(r7)     // Catch:{ Exception -> 0x03be }
            int r6 = r6 - r12
            int r6 = java.lang.Math.abs(r6)     // Catch:{ Exception -> 0x03be }
            int r7 = r7 + r6
            r6 = r26
            if (r7 >= r6) goto L_0x035e
            r26 = r7
            r21 = r15
            r20 = r31
            r23 = 1
            goto L_0x0360
        L_0x0356:
            r6 = r26
            goto L_0x035e
        L_0x0359:
            r29 = r6
        L_0x035b:
            r30 = r10
            goto L_0x0356
        L_0x035e:
            r26 = r6
        L_0x0360:
            int r13 = r13 + 1
            r6 = r29
            r10 = r30
            r7 = 0
            r8 = 1
            goto L_0x02df
        L_0x036a:
            r6 = r20
            r10 = r21
        L_0x036e:
            java.lang.String r7 = "steve: dkfps get fit  [%d %d], target fps %d, matchTargetFPS:%b"
            r8 = 4
            java.lang.Object[] r13 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x03be }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x03be }
            r14 = 0
            r13[r14] = r8     // Catch:{ Exception -> 0x03be }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x03be }
            r14 = 1
            r13[r14] = r8     // Catch:{ Exception -> 0x03be }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x03be }
            r13[r16] = r8     // Catch:{ Exception -> 0x03be }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r23)     // Catch:{ Exception -> 0x03be }
            r14 = 3
            r13[r14] = r8     // Catch:{ Exception -> 0x03be }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r13)     // Catch:{ Exception -> 0x03be }
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r10 == r7) goto L_0x03d7
            if (r6 == r7) goto L_0x03d7
            if (r23 != 0) goto L_0x039b
            goto L_0x03d7
        L_0x039b:
            java.lang.String r7 = "steve: SafeSetFps by setPreviewFpsRange [%d %d], target fps %d"
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x03be }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x03be }
            r14 = 0
            r8[r14] = r13     // Catch:{ Exception -> 0x03be }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x03be }
            r14 = 1
            r8[r14] = r13     // Catch:{ Exception -> 0x03be }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x03be }
            r8[r16] = r13     // Catch:{ Exception -> 0x03be }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r8)     // Catch:{ Exception -> 0x03be }
            r0.setPreviewFpsRange(r10, r6)     // Catch:{ Exception -> 0x03be }
            r11.mo158262f(r0)     // Catch:{ Exception -> 0x03be }
            r8 = 0
            goto L_0x03d8
        L_0x03be:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "steve: SafeSetFps by setPreviewFpsRange error:"
            r6.append(r7)
            java.lang.String r0 = r0.toString()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x03d7:
            r8 = 1
        L_0x03d8:
            if (r8 == 0) goto L_0x040d
            java.lang.String r0 = "steve: SafeSetFps by setPreviewFrameRate target fps %d"
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x03f4 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x03f4 }
            r8 = 0
            r7[r8] = r6     // Catch:{ Exception -> 0x03f4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r7)     // Catch:{ Exception -> 0x03f4 }
            android.hardware.Camera$Parameters r0 = r11.mo158259c()     // Catch:{ Exception -> 0x03f4 }
            r0.setPreviewFrameRate(r12)     // Catch:{ Exception -> 0x03f4 }
            r11.mo158262f(r0)     // Catch:{ Exception -> 0x03f4 }
            goto L_0x040d
        L_0x03f4:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "steve: SafeSetFps by setPreviewFrameRate error:"
            r6.append(r7)
            java.lang.String r0 = r0.toString()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x040d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Camera Open Success, try set size: w,h:"
            r0.append(r6)
            r0.append(r3)
            r0.append(r9)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            if (r2 == 0) goto L_0x042e
            c43.b r0 = b43.C104035d.f307670a
            android.graphics.Point r0 = r0.f308693g
            goto L_0x0432
        L_0x042e:
            c43.b r0 = b43.C104035d.f307670a
            android.graphics.Point r0 = r0.f308694h
        L_0x0432:
            if (r0 == 0) goto L_0x0436
            r2 = 1
            goto L_0x0437
        L_0x0436:
            r2 = 0
        L_0x0437:
            if (r0 == 0) goto L_0x045d
            gj.f0 r6 = new gj.f0
            int r7 = r0.x
            int r0 = r0.y
            r6.<init>(r7, r0)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "getCameraSize from table:"
            r8.append(r10)
            r8.append(r7)
            r8.append(r9)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x045e
        L_0x045d:
            r6 = 0
        L_0x045e:
            gj.z r0 = r1.f308669g     // Catch:{ Exception -> 0x0485 }
            gj.f0 r3 = m139246b(r0, r3, r4)     // Catch:{ Exception -> 0x0485 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0483 }
            r0.<init>()     // Catch:{ Exception -> 0x0483 }
            java.lang.String r4 = "getCameraResolution:"
            r0.append(r4)     // Catch:{ Exception -> 0x0483 }
            int r4 = r3.f27283a     // Catch:{ Exception -> 0x0483 }
            r0.append(r4)     // Catch:{ Exception -> 0x0483 }
            r0.append(r9)     // Catch:{ Exception -> 0x0483 }
            int r4 = r3.f27284b     // Catch:{ Exception -> 0x0483 }
            r0.append(r4)     // Catch:{ Exception -> 0x0483 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0483 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)     // Catch:{ Exception -> 0x0483 }
            goto L_0x0496
        L_0x0483:
            r0 = move-exception
            goto L_0x0487
        L_0x0485:
            r0 = move-exception
            r3 = 0
        L_0x0487:
            r4 = 1
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getMessage()
            r4 = 0
            r7[r4] = r0
            java.lang.String r0 = "getCameraResolution failed: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r7)
        L_0x0496:
            java.lang.String r0 = ",h"
            if (r2 == 0) goto L_0x0510
            gj.z r2 = r1.f308669g
            int r4 = r6.f27283a
            int r7 = r6.f27284b
            boolean r2 = r1.mo145982j(r2, r4, r7)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "1.try config size first! w"
            r4.append(r7)
            int r7 = r6.f27283a
            r4.append(r7)
            r4.append(r0)
            int r6 = r6.f27284b
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            if (r2 != 0) goto L_0x0561
            if (r3 == 0) goto L_0x0561
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "1.try config size failed!,try support size: w"
            r2.append(r4)
            int r4 = r3.f27283a
            r2.append(r4)
            r2.append(r0)
            int r4 = r3.f27284b
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r2)
            gj.z r2 = r1.f308669g
            int r4 = r3.f27283a
            int r6 = r3.f27284b
            boolean r2 = r1.mo145982j(r2, r4, r6)
            if (r2 != 0) goto L_0x0561
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "1.try support size fail: w"
            r2.append(r4)
            int r4 = r3.f27283a
            r2.append(r4)
            r2.append(r0)
            int r0 = r3.f27284b
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            r2 = -1
            return r2
        L_0x0510:
            java.lang.String r2 = "2.no config size!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            if (r3 == 0) goto L_0x0561
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "2.try support size alternatively! w"
            r2.append(r4)
            int r4 = r3.f27283a
            r2.append(r4)
            r2.append(r0)
            int r4 = r3.f27284b
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            gj.z r2 = r1.f308669g
            int r4 = r3.f27283a
            int r6 = r3.f27284b
            boolean r2 = r1.mo145982j(r2, r4, r6)
            if (r2 != 0) goto L_0x0561
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "2.try support size fail: w"
            r2.append(r4)
            int r4 = r3.f27283a
            r2.append(r4)
            r2.append(r0)
            int r0 = r3.f27284b
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            r2 = -1
            return r2
        L_0x0561:
            gj.z r0 = r1.f308669g
            boolean r2 = r1.f308666d
            if (r0 != 0) goto L_0x0569
            goto L_0x0630
        L_0x0569:
            java.lang.String r3 = "trySetAutoFocus, isFrontCamera:%s"
            r4 = 1
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x060b }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x060b }
            r7 = 0
            r6[r7] = r4     // Catch:{ Exception -> 0x060b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r6)     // Catch:{ Exception -> 0x060b }
            android.hardware.Camera$Parameters r3 = r0.mo158259c()     // Catch:{ Exception -> 0x060b }
            java.util.List r4 = r3.getSupportedFocusModes()     // Catch:{ Exception -> 0x060b }
            if (r4 == 0) goto L_0x0630
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x060b }
            r6.<init>()     // Catch:{ Exception -> 0x060b }
            java.lang.String r7 = "supported focus modes size = "
            r6.append(r7)     // Catch:{ Exception -> 0x060b }
            int r7 = r4.size()     // Catch:{ Exception -> 0x060b }
            r6.append(r7)     // Catch:{ Exception -> 0x060b }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x060b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)     // Catch:{ Exception -> 0x060b }
            java.util.Iterator r6 = r4.iterator()     // Catch:{ Exception -> 0x060b }
        L_0x059e:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x060b }
            if (r7 == 0) goto L_0x05bf
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x060b }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x060b }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x060b }
            r8.<init>()     // Catch:{ Exception -> 0x060b }
            java.lang.String r9 = "supported focus modes : "
            r8.append(r9)     // Catch:{ Exception -> 0x060b }
            r8.append(r7)     // Catch:{ Exception -> 0x060b }
            java.lang.String r7 = r8.toString()     // Catch:{ Exception -> 0x060b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)     // Catch:{ Exception -> 0x060b }
            goto L_0x059e
        L_0x05bf:
            gj.d r6 = p156gj.C107835h0.f322845b     // Catch:{ Exception -> 0x060b }
            int r6 = r6.f322793H     // Catch:{ Exception -> 0x060b }
            java.lang.String r7 = "camera support continuous video focus"
            java.lang.String r8 = "camera support auto focus"
            java.lang.String r9 = "continuous-video"
            java.lang.String r10 = "auto"
            if (r6 != 0) goto L_0x05e9
            if (r2 == 0) goto L_0x05e9
            boolean r2 = r4.contains(r10)     // Catch:{ Exception -> 0x060b }
            if (r2 == 0) goto L_0x05dc
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)     // Catch:{ Exception -> 0x060b }
            r3.setFocusMode(r10)     // Catch:{ Exception -> 0x060b }
            goto L_0x0607
        L_0x05dc:
            boolean r2 = r4.contains(r9)     // Catch:{ Exception -> 0x060b }
            if (r2 == 0) goto L_0x0607
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)     // Catch:{ Exception -> 0x060b }
            r3.setFocusMode(r9)     // Catch:{ Exception -> 0x060b }
            goto L_0x0607
        L_0x05e9:
            r11 = 1
            if (r6 == r11) goto L_0x05ee
            if (r2 != 0) goto L_0x0607
        L_0x05ee:
            boolean r2 = r4.contains(r9)     // Catch:{ Exception -> 0x060b }
            if (r2 == 0) goto L_0x05fb
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)     // Catch:{ Exception -> 0x060b }
            r3.setFocusMode(r9)     // Catch:{ Exception -> 0x060b }
            goto L_0x0607
        L_0x05fb:
            boolean r2 = r4.contains(r10)     // Catch:{ Exception -> 0x060b }
            if (r2 == 0) goto L_0x0607
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)     // Catch:{ Exception -> 0x060b }
            r3.setFocusMode(r10)     // Catch:{ Exception -> 0x060b }
        L_0x0607:
            r0.mo158262f(r3)     // Catch:{ Exception -> 0x060b }
            goto L_0x0630
        L_0x060b:
            r0 = move-exception
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 159(0x9f, double:7.86E-322)
            r9 = 0
            r11 = 1
            r13 = 0
            r6.idkeyStat(r7, r9, r11, r13)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "TrySetAutoFocus fail:"
            r2.append(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x0630:
            gj.z r0 = r1.f308669g     // Catch:{ Exception -> 0x06af }
            android.hardware.Camera$Parameters r0 = r0.mo158259c()     // Catch:{ Exception -> 0x06af }
            r1.f308670h = r0     // Catch:{ Exception -> 0x06af }
            android.hardware.Camera$Size r0 = r0.getPreviewSize()     // Catch:{ Exception -> 0x06af }
            if (r0 == 0) goto L_0x0649
            gj.f0 r2 = new gj.f0     // Catch:{ Exception -> 0x06af }
            int r3 = r0.width     // Catch:{ Exception -> 0x06af }
            int r0 = r0.height     // Catch:{ Exception -> 0x06af }
            r2.<init>(r3, r0)     // Catch:{ Exception -> 0x06af }
            r1.f308671i = r2     // Catch:{ Exception -> 0x06af }
        L_0x0649:
            android.hardware.Camera$Parameters r0 = r1.f308670h
            int r2 = r0.getPreviewFrameRate()
            int r0 = b43.C104035d.f307675f
            r1.f308672j = r0
            if (r0 > 0) goto L_0x0658
            r0 = 7
            r1.f308672j = r0
        L_0x0658:
            gj.z r0 = r1.f308669g     // Catch:{ Exception -> 0x065f }
            r1.mo145978f(r0)     // Catch:{ Exception -> 0x065f }
            r3 = 0
            goto L_0x066f
        L_0x065f:
            r0 = move-exception
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getMessage()
            r3 = 0
            r4[r3] = r0
            java.lang.String r0 = "setDisplayOrientation failed: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r4)
        L_0x066f:
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r3] = r2
            gj.f0 r2 = r1.f308671i
            int r2 = r2.f27283a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r0[r3] = r2
            gj.f0 r2 = r1.f308671i
            int r2 = r2.f27284b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r16] = r2
            int r2 = r1.f308672j
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 3
            r0[r3] = r2
            int r2 = b43.C104035d.f307673d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 4
            r0[r3] = r2
            int r2 = r1.f308658B
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 5
            r0[r3] = r2
            java.lang.String r2 = "Camera ok, fps: %d, mSize.width: %d, mSize.height: %d, format: %d, IsRotate180: %d, displayOrientation: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r0)
            r2 = 1
            return r2
        L_0x06af:
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
        L_0x06cd:
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
            b43.c r0 = r1.f308680u
            if (r0 == 0) goto L_0x071f
            r0.mo145648k()     // Catch:{ Exception -> 0x0710 }
            r1.f308661E = r3     // Catch:{ Exception -> 0x0710 }
            gj.z r0 = r1.f308669g     // Catch:{ Exception -> 0x070d }
            boolean r0 = r0.f322938c     // Catch:{ Exception -> 0x070d }
            if (r0 != 0) goto L_0x06ff
            gj.z r0 = r1.f308669g     // Catch:{ Exception -> 0x070d }
            r3 = 0
            r0.mo158263g(r3)     // Catch:{ Exception -> 0x070d }
        L_0x06ff:
            gj.z r0 = r1.f308669g     // Catch:{ Exception -> 0x070d }
            r0.mo158268l()     // Catch:{ Exception -> 0x070d }
            gj.z r0 = r1.f308669g     // Catch:{ Exception -> 0x070d }
            r0.mo158260d()     // Catch:{ Exception -> 0x070d }
            r3 = 0
            r1.f308669g = r3     // Catch:{ Exception -> 0x070d }
            goto L_0x071f
        L_0x070d:
            r0 = move-exception
            r3 = 1
            goto L_0x0711
        L_0x0710:
            r0 = move-exception
        L_0x0711:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r2 = r2.getMessage()
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "Camera open failed2, error:%s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r2, r3)
        L_0x071f:
            r2 = -1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c43.C104296a.mo145976d(boolean, int, int):int");
    }

    /* renamed from: e */
    public int mo145977e(C104034c cVar, boolean z) {
        int d;
        C104298b bVar = C104035d.f307670a;
        if (bVar.f308688b <= 0) {
            this.f308668f = 1;
            return -1;
        }
        if (z) {
            if (!bVar.f308689c) {
                z = false;
            }
        } else if (!bVar.f308690d) {
            z = true;
        }
        this.f308680u = cVar;
        if (mo145976d(z, this.f308685z, this.f308657A) <= 0 && (d = mo145976d(z, this.f308685z, this.f308657A)) <= 0) {
            this.f308668f = 1;
            return d;
        }
        mo145979g();
        this.f308668f = 0;
        return 1;
    }

    /* renamed from: f */
    public final void mo145978f(C107848z zVar) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.f308666d ? C104035d.f307671b : C104035d.f307672c, cameraInfo);
        int rotation = ((WindowManager) MMApplicationContext.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
        int i = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = 180;
            } else if (rotation == 3) {
                i = 270;
            }
        }
        int i2 = this.f308666d ? (360 - ((cameraInfo.orientation + i) % v2helper.VOIP_ENC_HEIGHT_LV1)) % v2helper.VOIP_ENC_HEIGHT_LV1 : ((cameraInfo.orientation - i) + v2helper.VOIP_ENC_HEIGHT_LV1) % v2helper.VOIP_ENC_HEIGHT_LV1;
        zVar.mo158261e(i2);
        this.f308658B = i2;
    }

    /* renamed from: g */
    public final void mo145979g() {
        int i;
        int i2;
        try {
            C107848z zVar = this.f308669g;
            if (zVar != null && this.f308673n) {
                C8325f0 f0Var = this.f308671i;
                if (f0Var == null || (i = f0Var.f27284b) <= 0 || (i2 = f0Var.f27283a) <= 0) {
                    zVar.mo158263g(this.f308665I);
                    return;
                }
                int i3 = ((i * i2) * 3) / 2;
                if (this.f308684y == null) {
                    this.f308684y = new ArrayList(3);
                    for (int i4 = 0; i4 < 3; i4++) {
                        this.f308684y.add(new byte[i3]);
                    }
                }
                for (int i5 = 0; i5 < this.f308684y.size(); i5++) {
                    C107848z zVar2 = this.f308669g;
                    if (zVar2 != null) {
                        zVar2.mo158257a(this.f308684y.get(i5));
                    }
                }
                this.f308669g.mo158264h(this.f308665I);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Voip.CaptureRender", e, "setPreviewCallback error: %s", e.getMessage());
        }
    }

    /* renamed from: h */
    public int mo145980h() {
        if (!this.f308673n) {
            Log.m105920e("MicroMsg.Voip.CaptureRender", "StartCapture: failed without open camera");
            this.f308668f = 1;
            return -1;
        } else if (this.f308681v) {
            Log.m105920e("MicroMsg.Voip.CaptureRender", "StartCapture: is in capture already ");
            return -1;
        } else {
            ObservableSurfaceView observableSurfaceView = this.f308675p;
            if (observableSurfaceView == null || observableSurfaceView.f316398f) {
                Log.m105919d("MicroMsg.Voip.CaptureRender", "StartCapture now, isUesSurfacePreivew: %b", Boolean.valueOf(this.f308674o));
                ObservableSurfaceView observableSurfaceView2 = this.f308675p;
                if (observableSurfaceView2 == null || !this.f308674o) {
                    ObservableTextureView observableTextureView = this.f308676q;
                    if (observableTextureView == null || this.f308674o) {
                        SurfaceTexture surfaceTexture = this.f308677r;
                        if (surfaceTexture != null && this.f308678s) {
                            try {
                                this.f308669g.mo158265i(surfaceTexture);
                            } catch (Exception e) {
                                C115669n nVar = C115669n.INSTANCE;
                                nVar.idkeyStat(159, 0, 1, false);
                                nVar.idkeyStat(159, 2, 1, false);
                                this.f308668f = 1;
                                Log.m105920e("MicroMsg.Voip.CaptureRender", "StartCapture:error: texture preview" + e.toString());
                            }
                        }
                    } else {
                        try {
                            this.f308669g.mo158265i(observableTextureView.getSurfaceTexture());
                        } catch (Exception e2) {
                            C115669n nVar2 = C115669n.INSTANCE;
                            nVar2.idkeyStat(159, 0, 1, false);
                            nVar2.idkeyStat(159, 2, 1, false);
                            this.f308668f = 1;
                            Log.m105920e("MicroMsg.Voip.CaptureRender", "StartCapture:error:" + e2.toString());
                        }
                    }
                } else {
                    try {
                        C107848z zVar = this.f308669g;
                        SurfaceHolder surfaceHolder = observableSurfaceView2.getSurfaceHolder();
                        Camera camera = zVar.f322936a;
                        if (camera != null) {
                            camera.setPreviewDisplay(surfaceHolder);
                        }
                    } catch (Exception e3) {
                        C115669n nVar3 = C115669n.INSTANCE;
                        nVar3.idkeyStat(159, 0, 1, false);
                        nVar3.idkeyStat(159, 2, 1, false);
                        this.f308668f = 1;
                        Log.m105920e("MicroMsg.Voip.CaptureRender", "StartCapture:error:" + e3.toString());
                    }
                }
                try {
                    this.f308669g.mo158267k();
                } catch (Exception e4) {
                    C115669n nVar4 = C115669n.INSTANCE;
                    nVar4.idkeyStat(159, 0, 1, false);
                    nVar4.idkeyStat(159, 2, 1, false);
                    this.f308668f = 1;
                    C104034c cVar = this.f308680u;
                    if (cVar != null) {
                        cVar.mo145648k();
                    }
                    Log.m105920e("MicroMsg.Voip.CaptureRender", "startPreview:error" + e4.toString());
                }
                this.f308681v = true;
                if (this.f308663G == null) {
                    this.f308663G = new C104032b(this);
                }
                this.f308680u.mo145647c(this.f308664H);
                return 1;
            }
            Log.m105918d("MicroMsg.Voip.CaptureRender", "StartCapture:surface not ready, try later.... ");
            this.f308682w = true;
            return 0;
        }
    }

    /* renamed from: i */
    public void mo145981i() {
        C107848z zVar;
        Log.m105918d("MicroMsg.Voip.CaptureRender", "StopCapture....mIsInCapture = " + this.f308681v);
        if (this.f308681v && (zVar = this.f308669g) != null) {
            this.f308682w = false;
            if (!zVar.f322938c) {
                this.f308669g.mo158263g((Camera.PreviewCallback) null);
            }
            try {
                this.f308669g.mo158268l();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.Voip.CaptureRender", "stopPreview:error" + e.toString());
            }
            this.f308681v = false;
        }
        if (1 == this.f308668f) {
            PermissionShowDlgEvent permissionShowDlgEvent = new PermissionShowDlgEvent();
            permissionShowDlgEvent.f264988d.f264990a = 2;
            permissionShowDlgEvent.publish();
        }
        Log.m105918d("MicroMsg.Voip.CaptureRender", "UnInitCapture....mCameraOpen = " + this.f308673n);
        if (this.f308673n) {
            this.f308668f = 0;
            this.f308682w = false;
            C107848z zVar2 = this.f308669g;
            if (zVar2 != null && !zVar2.f322938c) {
                this.f308669g.mo158263g((Camera.PreviewCallback) null);
                this.f308669g.mo158260d();
            }
            this.f308669g = null;
            this.f308673n = false;
        } else {
            C107848z zVar3 = this.f308669g;
            if (zVar3 != null) {
                if (!zVar3.f322938c) {
                    this.f308669g.mo158263g((Camera.PreviewCallback) null);
                }
                this.f308669g.mo158260d();
                this.f308669g = null;
                this.f308673n = false;
            }
        }
        this.f308683x = null;
        List<byte[]> list = this.f308684y;
        if (list != null) {
            ((ArrayList) list).clear();
        }
        this.f308684y = null;
        C104032b bVar = this.f308663G;
        if (bVar != null) {
            bVar.disable();
            bVar.f307669c = null;
            this.f308663G = null;
        }
    }

    /* renamed from: j */
    public final boolean mo145982j(C107848z zVar, int i, int i2) {
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

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105918d("MicroMsg.Voip.CaptureRender", "onSurfaceTextureAvailable");
        boolean z = this.f308673n;
        boolean z2 = false;
        if (!z || surfaceTexture == null) {
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(z);
            if (surfaceTexture == null) {
                z2 = true;
            }
            objArr[1] = Boolean.valueOf(z2);
            Log.m105921e("MicroMsg.Voip.CaptureRender", "onSurfaceTextureAvailable failed, CameraOpen: %b, surface: %b", objArr);
            return;
        }
        try {
            if (!this.f308669g.f322938c) {
                this.f308669g.mo158263g((Camera.PreviewCallback) null);
            }
            this.f308669g.mo158268l();
            this.f308669g.mo158265i(surfaceTexture);
            mo145979g();
            this.f308669g.mo158267k();
        } catch (Exception e) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(159, 0, 1, false);
            nVar.idkeyStat(159, 2, 1, false);
            Log.m105920e("MicroMsg.Voip.CaptureRender", "surfaceChange failed" + e.getMessage());
            this.f308668f = 1;
        }
        if (this.f308682w) {
            mo145980h();
            this.f308682w = false;
        }
        if (!(this instanceof C105153k)) {
            C109247e.xx0().mo152591E(this.f308668f);
        }
    }
}
