package com.tencent.p014mm.plugin.multitalk.model;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.WindowManager;
import b43.C104034c;
import b43.C104035d;
import c43.C104298b;
import com.tencent.p014mm.autogen.events.PermissionShowDlgEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.wxmm.v2helper;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Result;
import kotlin.ResultKt;
import p156gj.C107848z;
import p156gj.C8325f0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.multitalk.model.k0 */
public final class C105811k0 {

    /* renamed from: t */
    public static final C105812a f314631t = new C105812a((C8480h) null);

    /* renamed from: u */
    public static final Pattern f314632u = Pattern.compile(",");

    /* renamed from: a */
    public boolean f314633a;

    /* renamed from: b */
    public Boolean f314634b;

    /* renamed from: c */
    public int f314635c;

    /* renamed from: d */
    public volatile C107848z f314636d;

    /* renamed from: e */
    public Camera.Parameters f314637e;

    /* renamed from: f */
    public C8325f0 f314638f;

    /* renamed from: g */
    public int f314639g;

    /* renamed from: h */
    public boolean f314640h;

    /* renamed from: i */
    public C104034c f314641i;

    /* renamed from: j */
    public boolean f314642j;

    /* renamed from: k */
    public byte[] f314643k;

    /* renamed from: l */
    public List<byte[]> f314644l;

    /* renamed from: m */
    public int f314645m;

    /* renamed from: n */
    public boolean f314646n;

    /* renamed from: o */
    public byte[] f314647o;

    /* renamed from: p */
    public SurfaceTexture f314648p;

    /* renamed from: q */
    public int f314649q = -1;

    /* renamed from: r */
    public boolean f314650r = true;

    /* renamed from: s */
    public Camera.PreviewCallback f314651s = new C105813b(this);

    /* renamed from: com.tencent.mm.plugin.multitalk.model.k0$a */
    public static final class C105812a {
        public C105812a(C8480h hVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:40:0x0107  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final p156gj.C8325f0 m142166a(com.tencent.p014mm.plugin.multitalk.model.C105811k0.C105812a r12, p156gj.C107848z r13, int r14, int r15) {
            /*
                r12.getClass()
                gy3.C87412m.m108591d(r13)
                android.hardware.Camera$Parameters r12 = r13.mo158259c()
                android.graphics.Point r13 = new android.graphics.Point
                r13.<init>(r14, r15)
                java.lang.String r14 = "preview-size-values"
                java.lang.String r14 = r12.get(r14)
                if (r14 != 0) goto L_0x001d
                java.lang.String r14 = "preview-size-value"
                java.lang.String r14 = r12.get(r14)
            L_0x001d:
                if (r14 == 0) goto L_0x0104
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r15 = "preview-size-values parameter: "
                r12.append(r15)
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                java.lang.String r15 = "MicroMsg.Voip.CaptureRender"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r12)
                java.util.regex.Pattern r12 = com.tencent.p014mm.plugin.multitalk.model.C105811k0.f314632u
                java.lang.String[] r12 = r12.split(r14)
                java.lang.String r14 = "COMMA_PATTERN.split(previewSizeValueString)"
                gy3.C87412m.m108593f(r12, r14)
                int r14 = r12.length
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
            L_0x0048:
                if (r2 >= r14) goto L_0x00fa
                r5 = r12[r2]
                java.lang.String r6 = "previewSize"
                gy3.C87412m.m108593f(r5, r6)
                int r6 = r5.length()
                r7 = 1
                int r6 = r6 - r7
                r8 = 0
                r9 = 0
            L_0x0059:
                if (r8 > r6) goto L_0x007e
                if (r9 != 0) goto L_0x005f
                r10 = r8
                goto L_0x0060
            L_0x005f:
                r10 = r6
            L_0x0060:
                char r10 = r5.charAt(r10)
                r11 = 32
                int r10 = gy3.C87412m.m108596i(r10, r11)
                if (r10 > 0) goto L_0x006e
                r10 = 1
                goto L_0x006f
            L_0x006e:
                r10 = 0
            L_0x006f:
                if (r9 != 0) goto L_0x0078
                if (r10 != 0) goto L_0x0075
                r9 = 1
                goto L_0x0059
            L_0x0075:
                int r8 = r8 + 1
                goto L_0x0059
            L_0x0078:
                if (r10 != 0) goto L_0x007b
                goto L_0x007e
            L_0x007b:
                int r6 = r6 + -1
                goto L_0x0059
            L_0x007e:
                int r6 = r6 + 1
                java.lang.CharSequence r5 = r5.subSequence(r8, r6)
                java.lang.String r5 = r5.toString()
                r7 = 120(0x78, float:1.68E-43)
                r8 = 0
                r9 = 0
                r10 = 6
                r11 = 0
                r6 = r5
                int r6 = z04.C112550d0.m153768D(r6, r7, r8, r9, r10, r11)
                java.lang.String r7 = "Bad preview-size: "
                if (r6 >= 0) goto L_0x00aa
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r7)
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r5)
                goto L_0x00f6
            L_0x00aa:
                java.lang.String r8 = r5.substring(r1, r6)     // Catch:{ NumberFormatException -> 0x00e4 }
                java.lang.String r9 = "this as java.lang.String…ing(startIndex, endIndex)"
                gy3.C87412m.m108593f(r8, r9)     // Catch:{ NumberFormatException -> 0x00e4 }
                int r8 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r8, (int) r1)     // Catch:{ NumberFormatException -> 0x00e4 }
                int r6 = r6 + 1
                java.lang.String r6 = r5.substring(r6)     // Catch:{ NumberFormatException -> 0x00e4 }
                java.lang.String r9 = "this as java.lang.String).substring(startIndex)"
                gy3.C87412m.m108593f(r6, r9)     // Catch:{ NumberFormatException -> 0x00e4 }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r1)     // Catch:{ NumberFormatException -> 0x00e4 }
                int r6 = r13.x
                int r6 = r8 - r6
                int r6 = java.lang.Math.abs(r6)
                int r7 = r13.y
                int r7 = r5 - r7
                int r7 = java.lang.Math.abs(r7)
                int r6 = r6 + r7
                if (r6 != 0) goto L_0x00dc
                r4 = r5
                r3 = r8
                goto L_0x00fa
            L_0x00dc:
                if (r6 >= r0) goto L_0x00f6
                if (r8 == r5) goto L_0x00f6
                r4 = r5
                r0 = r6
                r3 = r8
                goto L_0x00f6
            L_0x00e4:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r7)
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r5)
            L_0x00f6:
                int r2 = r2 + 1
                goto L_0x0048
            L_0x00fa:
                if (r3 <= 0) goto L_0x0104
                if (r4 <= 0) goto L_0x0104
                android.graphics.Point r12 = new android.graphics.Point
                r12.<init>(r3, r4)
                goto L_0x0105
            L_0x0104:
                r12 = 0
            L_0x0105:
                if (r12 != 0) goto L_0x0118
                android.graphics.Point r12 = new android.graphics.Point
                int r14 = r13.x
                int r14 = r14 >> 3
                int r14 = r14 << 3
                int r13 = r13.y
                int r13 = r13 >> 3
                int r13 = r13 << 3
                r12.<init>(r14, r13)
            L_0x0118:
                gj.f0 r13 = new gj.f0
                int r14 = r12.x
                int r12 = r12.y
                r13.<init>(r14, r12)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.C105811k0.C105812a.m142166a(com.tencent.mm.plugin.multitalk.model.k0$a, gj.z, int, int):gj.f0");
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.k0$b */
    public static final class C105813b implements Camera.PreviewCallback {

        /* renamed from: d */
        public final /* synthetic */ C105811k0 f314652d;

        public C105813b(C105811k0 k0Var) {
            this.f314652d = k0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
            if (r2.length != r1.length) goto L_0x004f;
         */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0095  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0099  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00ba  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0117  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0156  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x015c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPreviewFrame(byte[] r29, android.hardware.Camera r30) {
            /*
                r28 = this;
                r0 = r28
                r1 = r29
                java.lang.String r2 = "data"
                gy3.C87412m.m108594g(r1, r2)
                java.lang.String r2 = "arg1"
                r3 = r30
                gy3.C87412m.m108594g(r3, r2)
                int r2 = r1.length
                if (r2 > 0) goto L_0x0032
                com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r4 = 159(0x9f, double:7.86E-322)
                r6 = 0
                r8 = 1
                r10 = 0
                r3 = r1
                r3.idkeyStat(r4, r6, r8, r10)
                r6 = 3
                r3.idkeyStat(r4, r6, r8, r10)
                com.tencent.mm.plugin.multitalk.model.k0 r1 = r0.f314652d
                b43.c r1 = r1.f314641i
                if (r1 == 0) goto L_0x0031
                gy3.C87412m.m108591d(r1)
                r1.mo145648k()
            L_0x0031:
                return
            L_0x0032:
                com.tencent.mm.plugin.multitalk.model.k0 r2 = r0.f314652d
                gj.f0 r3 = r2.f314638f
                java.lang.String r4 = "MicroMsg.Voip.CaptureRender"
                if (r3 != 0) goto L_0x0040
                java.lang.String r1 = "onPreviewFrame mSize is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
                return
            L_0x0040:
                b43.c r3 = r2.f314641i
                if (r3 == 0) goto L_0x016c
                byte[] r2 = r2.f314647o
                if (r2 == 0) goto L_0x004f
                gy3.C87412m.m108591d(r2)
                int r2 = r2.length
                int r3 = r1.length
                if (r2 == r3) goto L_0x0056
            L_0x004f:
                com.tencent.mm.plugin.multitalk.model.k0 r2 = r0.f314652d
                int r3 = r1.length
                byte[] r3 = new byte[r3]
                r2.f314647o = r3
            L_0x0056:
                com.tencent.mm.plugin.multitalk.model.k0 r2 = r0.f314652d
                byte[] r2 = r2.f314647o
                int r3 = r1.length
                r5 = 0
                java.lang.System.arraycopy(r1, r5, r2, r5, r3)
                com.tencent.mm.plugin.multitalk.model.k0 r2 = r0.f314652d
                boolean r3 = r2.f314633a
                r6 = 1
                if (r3 == 0) goto L_0x0077
                int r3 = b43.C104035d.f307673d
                gj.d r7 = p156gj.C107835h0.f322845b
                boolean r8 = r7.f322811j
                if (r8 == 0) goto L_0x008b
                gj.d$a r7 = r7.f322810i
                int r8 = r7.f322831d
                if (r8 == 0) goto L_0x008b
                int r7 = r7.f322832e
                goto L_0x0087
            L_0x0077:
                int r3 = b43.C104035d.f307674e
                gj.d r7 = p156gj.C107835h0.f322845b
                boolean r8 = r7.f322813l
                if (r8 == 0) goto L_0x008b
                gj.d$a r7 = r7.f322812k
                int r8 = r7.f322831d
                if (r8 == 0) goto L_0x008b
                int r7 = r7.f322832e
            L_0x0087:
                r17 = r7
                r7 = 1
                goto L_0x008e
            L_0x008b:
                r7 = 0
                r17 = 1
            L_0x008e:
                if (r3 <= 0) goto L_0x0095
                r8 = 32
                r25 = 32
                goto L_0x0097
            L_0x0095:
                r25 = 0
            L_0x0097:
                if (r7 == 0) goto L_0x009c
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                goto L_0x00a4
            L_0x009c:
                if (r3 <= 0) goto L_0x009f
                goto L_0x00a0
            L_0x009f:
                r6 = 0
            L_0x00a0:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
            L_0x00a4:
                r2.f314634b = r3
                com.tencent.mm.plugin.multitalk.model.k0 r2 = r0.f314652d
                gj.f0 r2 = r2.f314638f
                gy3.C87412m.m108591d(r2)
                int r2 = r2.f27283a
                com.tencent.mm.plugin.multitalk.model.k0 r3 = r0.f314652d
                gj.f0 r3 = r3.f314638f
                gy3.C87412m.m108591d(r3)
                int r3 = r3.f27284b
                if (r7 == 0) goto L_0x0117
                com.tencent.mm.plugin.multitalk.model.k0 r6 = r0.f314652d
                r6.getClass()
                com.tencent.mm.plugin.multitalk.model.k0 r6 = r0.f314652d
                byte[] r7 = r6.f314643k
                if (r7 != 0) goto L_0x00d3
                int r7 = r2 * r3
                int r7 = r7 * 3
                int r7 = r7 / 2
                byte[] r7 = new byte[r7]
                r6.f314643k = r7
                r6 = 90
                r7[r5] = r6
            L_0x00d3:
                com.tencent.mm.plugin.voip.model.h0 r7 = l33.C109247e.xx0()
                com.tencent.mm.plugin.multitalk.model.k0 r5 = r0.f314652d
                byte[] r8 = r5.f314647o
                gy3.C87412m.m108591d(r8)
                int r9 = r8.length
                com.tencent.mm.plugin.multitalk.model.k0 r5 = r0.f314652d
                int r12 = r5.f314639g
                byte[] r13 = r5.f314643k
                gy3.C87412m.m108591d(r13)
                int r14 = r13.length
                r10 = r2
                r11 = r3
                r15 = r2
                r16 = r3
                r7.mo152601O(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                com.tencent.mm.plugin.multitalk.model.k0 r5 = r0.f314652d
                b43.c r5 = r5.f314641i
                gy3.C87412m.m108591d(r5)
                com.tencent.mm.plugin.multitalk.model.k0 r6 = r0.f314652d
                byte[] r6 = r6.f314643k
                gy3.C87412m.m108591d(r6)
                int r7 = r6.length
                long r7 = (long) r7
                com.tencent.mm.plugin.multitalk.model.k0 r9 = r0.f314652d
                int r9 = r9.f314639g
                r26 = 0
                r18 = r5
                r19 = r6
                r20 = r7
                r22 = r2
                r23 = r3
                r24 = r9
                r18.mo145646I(r19, r20, r22, r23, r24, r25, r26)
                goto L_0x014e
            L_0x0117:
                com.tencent.mm.plugin.multitalk.model.k0 r2 = r0.f314652d
                b43.c r2 = r2.f314641i
                gy3.C87412m.m108591d(r2)
                com.tencent.mm.plugin.multitalk.model.k0 r3 = r0.f314652d
                byte[] r3 = r3.f314647o
                gy3.C87412m.m108591d(r3)
                int r5 = r3.length
                long r5 = (long) r5
                com.tencent.mm.plugin.multitalk.model.k0 r7 = r0.f314652d
                gj.f0 r7 = r7.f314638f
                gy3.C87412m.m108591d(r7)
                int r7 = r7.f27283a
                com.tencent.mm.plugin.multitalk.model.k0 r8 = r0.f314652d
                gj.f0 r8 = r8.f314638f
                gy3.C87412m.m108591d(r8)
                int r8 = r8.f27284b
                com.tencent.mm.plugin.multitalk.model.k0 r9 = r0.f314652d
                int r9 = r9.f314639g
                r26 = 0
                r18 = r2
                r19 = r3
                r20 = r5
                r22 = r7
                r23 = r8
                r24 = r9
                r18.mo145646I(r19, r20, r22, r23, r24, r25, r26)
            L_0x014e:
                android.net.Uri r2 = z33.C91617n.f262467a
                com.tencent.mm.plugin.multitalk.model.k0 r2 = r0.f314652d
                gj.z r2 = r2.f314636d
                if (r2 != 0) goto L_0x015c
                java.lang.String r1 = "the camera is null and has been release"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
                return
            L_0x015c:
                com.tencent.mm.plugin.multitalk.model.k0 r2 = r0.f314652d
                gj.z r2 = r2.f314636d
                if (r2 == 0) goto L_0x016c
                com.tencent.mm.plugin.multitalk.model.k0 r2 = r0.f314652d
                gj.z r2 = r2.f314636d
                gy3.C87412m.m108591d(r2)
                r2.mo158257a(r1)
            L_0x016c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.C105811k0.C105813b.onPreviewFrame(byte[], android.hardware.Camera):void");
        }
    }

    public C105811k0(int i, int i2) {
        C104035d.m138788b(MMApplicationContext.getContext().getApplicationContext());
        Log.m105919d("MicroMsg.Voip.CaptureRender", "width: %d, height: %d", 640, 480);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x040c  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0435  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0476  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0618 A[Catch:{ Exception -> 0x06a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x061d A[Catch:{ Exception -> 0x06a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0620 A[Catch:{ Exception -> 0x06a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0636  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0640  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0647  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x066a  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0671  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0679  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0681  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cd A[SYNTHETIC, Splitter:B:32:0x00cd] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ae A[Catch:{ Exception -> 0x0208 }, LOOP:1: B:60:0x01a8->B:62:0x01ae, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ed A[Catch:{ Exception -> 0x0208 }, LOOP:2: B:68:0x01e7->B:70:0x01ed, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0221 A[Catch:{ Exception -> 0x06c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0236  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo150775a(boolean r33, int r34, int r35) {
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
            gj.z r0 = r1.f314636d
            r6 = 0
            r7 = 1
            if (r0 == 0) goto L_0x004f
            boolean r0 = r1.f314633a
            if (r0 == r2) goto L_0x004c
            gj.z r0 = r1.f314636d
            gy3.C87412m.m108591d(r0)
            boolean r0 = r0.f322938c
            if (r0 != 0) goto L_0x0039
            gj.z r0 = r1.f314636d
            gy3.C87412m.m108591d(r0)
            r0.mo158263g(r6)
        L_0x0039:
            gj.z r0 = r1.f314636d
            gy3.C87412m.m108591d(r0)
            r0.mo158268l()
            gj.z r0 = r1.f314636d
            gy3.C87412m.m108591d(r0)
            r0.mo158260d()
            r1.f314636d = r6
            goto L_0x004f
        L_0x004c:
            boolean r0 = r1.f314646n
            goto L_0x0050
        L_0x004f:
            r0 = 1
        L_0x0050:
            r8 = 44
            r9 = -1
            r10 = 0
            if (r0 == 0) goto L_0x021d
            c43.b r0 = b43.C104035d.f307670a
            int r0 = r0.f308688b
            if (r0 > 0) goto L_0x005d
            goto L_0x0093
        L_0x005d:
            boolean r0 = b43.C104035d.f307676g
            if (r0 != 0) goto L_0x0062
            goto L_0x0093
        L_0x0062:
            java.lang.String r0 = "Camera"
            if (r2 != r7) goto L_0x0077
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0095 }
            int r12 = b43.C104035d.f307671b     // Catch:{ Exception -> 0x0095 }
            gj.f r11 = p156gj.C107828e.m146101d(r11, r12, r6)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r12 = "Use front"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)     // Catch:{ Exception -> 0x0095 }
            r0 = 1
            goto L_0x0087
        L_0x0077:
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0095 }
            int r12 = b43.C104035d.f307672c     // Catch:{ Exception -> 0x0095 }
            gj.f r11 = p156gj.C107828e.m146101d(r11, r12, r6)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r12 = "Use back"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)     // Catch:{ Exception -> 0x0095 }
            r0 = 0
        L_0x0087:
            if (r11 == 0) goto L_0x0093
            gj.z r11 = r11.f322839a     // Catch:{ Exception -> 0x0095 }
            if (r11 != 0) goto L_0x008e
            goto L_0x00cb
        L_0x008e:
            r11.f322937b = r0     // Catch:{ Exception -> 0x0091 }
            goto L_0x00cb
        L_0x0091:
            r0 = move-exception
            goto L_0x0097
        L_0x0093:
            r11 = r6
            goto L_0x00cb
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
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x00cb:
            if (r11 != 0) goto L_0x0137
            gj.z r11 = new gj.z     // Catch:{ Exception -> 0x00f9 }
            java.lang.Object r12 = new java.lang.Object     // Catch:{ Exception -> 0x00f9 }
            r12.<init>()     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r13 = "com/tencent/mm/plugin/multitalk/model/MultitalkCaptureRenderer"
            java.lang.String r14 = "safeOpenCamera"
            java.lang.String r15 = "(Z)Lcom/tencent/mm/compatible/deviceinfo/MCamera;"
            java.lang.String r16 = "android/hardware/Camera"
            java.lang.String r17 = "open"
            java.lang.String r18 = "()Landroid/hardware/Camera;"
            java.lang.Object r0 = j20.C117292a.m165363i(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x00f9 }
            android.hardware.Camera r0 = (android.hardware.Camera) r0     // Catch:{ Exception -> 0x00f9 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x00f9 }
            r1.f314633a = r10
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 159(0x9f, double:7.86E-322)
            r15 = 0
            r17 = 1
            r19 = 0
            r12.idkeyStat(r13, r15, r17, r19)
            goto L_0x0139
        L_0x00f9:
            r0 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "OpenCameraError:"
            r11.append(r12)
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
            b43.c r0 = r1.f314641i
            if (r0 == 0) goto L_0x0134
            r0.mo145648k()
        L_0x0134:
            r11 = r6
            goto L_0x0212
        L_0x0137:
            r1.f314633a = r2
        L_0x0139:
            android.hardware.Camera$CameraInfo r0 = new android.hardware.Camera$CameraInfo     // Catch:{ Exception -> 0x0211 }
            r0.<init>()     // Catch:{ Exception -> 0x0211 }
            int r12 = r11.f322937b     // Catch:{ Exception -> 0x0211 }
            android.hardware.Camera.getCameraInfo(r12, r0)     // Catch:{ Exception -> 0x0211 }
            int r0 = r0.orientation     // Catch:{ Exception -> 0x0211 }
            r1.f314649q = r0
            android.hardware.Camera$Parameters r0 = r11.mo158259c()     // Catch:{ Exception -> 0x0150 }
            java.util.List r0 = r0.getSupportedPreviewFrameRates()     // Catch:{ Exception -> 0x0150 }
            goto L_0x0166
        L_0x0150:
            r0 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "getSupportedPreviewFrameRates:error:"
            r12.append(r13)
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
            r0 = r6
        L_0x0166:
            java.lang.String r12 = "supportFps:"
            if (r0 == 0) goto L_0x0191
            int r13 = r0.size()
            r14 = 0
        L_0x016f:
            if (r14 >= r13) goto L_0x0191
            java.lang.Object r15 = r0.get(r14)
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r12)
            r6.append(r15)
            r6.append(r8)
            java.lang.String r12 = r6.toString()
            int r14 = r14 + 1
            r6 = 0
            goto L_0x016f
        L_0x0191:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r12)
            android.hardware.Camera$Parameters r0 = r11.mo158259c()     // Catch:{ Exception -> 0x0208 }
            java.util.List r0 = r0.getSupportedPreviewSizes()     // Catch:{ Exception -> 0x0208 }
            if (r0 == 0) goto L_0x01d3
            int r6 = r0.size()     // Catch:{ Exception -> 0x0208 }
            if (r6 == 0) goto L_0x01d3
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0208 }
        L_0x01a8:
            boolean r6 = r0.hasNext()     // Catch:{ Exception -> 0x0208 }
            if (r6 == 0) goto L_0x01d3
            java.lang.Object r6 = r0.next()     // Catch:{ Exception -> 0x0208 }
            android.hardware.Camera$Size r6 = (android.hardware.Camera.Size) r6     // Catch:{ Exception -> 0x0208 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0208 }
            r12.<init>()     // Catch:{ Exception -> 0x0208 }
            java.lang.String r13 = "support Size:"
            r12.append(r13)     // Catch:{ Exception -> 0x0208 }
            int r13 = r6.width     // Catch:{ Exception -> 0x0208 }
            r12.append(r13)     // Catch:{ Exception -> 0x0208 }
            r12.append(r8)     // Catch:{ Exception -> 0x0208 }
            int r6 = r6.height     // Catch:{ Exception -> 0x0208 }
            r12.append(r6)     // Catch:{ Exception -> 0x0208 }
            java.lang.String r6 = r12.toString()     // Catch:{ Exception -> 0x0208 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r6)     // Catch:{ Exception -> 0x0208 }
            goto L_0x01a8
        L_0x01d3:
            android.hardware.Camera$Parameters r0 = r11.mo158259c()     // Catch:{ Exception -> 0x0208 }
            java.util.List r0 = r0.getSupportedPreviewFormats()     // Catch:{ Exception -> 0x0208 }
            if (r0 == 0) goto L_0x0212
            int r6 = r0.size()     // Catch:{ Exception -> 0x0208 }
            if (r6 == 0) goto L_0x0212
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0208 }
        L_0x01e7:
            boolean r6 = r0.hasNext()     // Catch:{ Exception -> 0x0208 }
            if (r6 == 0) goto L_0x0212
            java.lang.Object r6 = r0.next()     // Catch:{ Exception -> 0x0208 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Exception -> 0x0208 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0208 }
            r12.<init>()     // Catch:{ Exception -> 0x0208 }
            java.lang.String r13 = "support Format:"
            r12.append(r13)     // Catch:{ Exception -> 0x0208 }
            r12.append(r6)     // Catch:{ Exception -> 0x0208 }
            java.lang.String r6 = r12.toString()     // Catch:{ Exception -> 0x0208 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)     // Catch:{ Exception -> 0x0208 }
            goto L_0x01e7
        L_0x0208:
            r0 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r10]
            java.lang.String r12 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r12, r6)
            goto L_0x0212
        L_0x0211:
            r11 = 0
        L_0x0212:
            r1.f314636d = r11
            gj.z r0 = r1.f314636d
            if (r0 != 0) goto L_0x021b
            r1.f314640h = r10
            return r9
        L_0x021b:
            r1.f314646n = r10
        L_0x021d:
            gj.z r0 = r1.f314636d     // Catch:{ Exception -> 0x06c5 }
            if (r0 == 0) goto L_0x0229
            gj.z r0 = r1.f314636d     // Catch:{ Exception -> 0x06c5 }
            gy3.C87412m.m108591d(r0)     // Catch:{ Exception -> 0x06c5 }
            r0.mo158259c()     // Catch:{ Exception -> 0x06c5 }
        L_0x0229:
            r1.f314640h = r7
            gj.z r6 = r1.f314636d
            c43.b r0 = b43.C104035d.f307670a
            int r11 = r0.f308687a
            r14 = 3
            if (r6 != 0) goto L_0x0236
            goto L_0x03e3
        L_0x0236:
            java.lang.String r0 = "safeSetFps: %s"
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x039c }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x039c }
            r9[r10] = r18     // Catch:{ Exception -> 0x039c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r9)     // Catch:{ Exception -> 0x039c }
            android.hardware.Camera$Parameters r0 = r6.mo158259c()     // Catch:{ Exception -> 0x039c }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()     // Catch:{ Exception -> 0x039c }
            r8 = 26
            if (r9 == 0) goto L_0x0261
            java.lang.Class<lc3.b> r9 = lc3.C10485b.class
            k40.a r9 = f40.C86709a0.m107533q(r9)     // Catch:{ Exception -> 0x039c }
            lc3.b r9 = (lc3.C10485b) r9     // Catch:{ Exception -> 0x039c }
            pj.f r9 = r9.vh0()     // Catch:{ Exception -> 0x039c }
            java.lang.String r12 = "VoipCaptureRenderFpsRangeMinApiLevel"
            int r8 = r9.mo107404b(r12, r8)     // Catch:{ Exception -> 0x039c }
        L_0x0261:
            java.lang.String r9 = "setFpsRange minApiLevel:%s"
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x039c }
            java.lang.Integer r20 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x039c }
            r12[r10] = r20     // Catch:{ Exception -> 0x039c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r12)     // Catch:{ Exception -> 0x039c }
            boolean r9 = p206nj.C76866m.m92676e()     // Catch:{ Exception -> 0x039c }
            if (r9 != 0) goto L_0x027a
            boolean r8 = p206nj.C11171e.m11046c(r8)     // Catch:{ Exception -> 0x039c }
            if (r8 == 0) goto L_0x03b2
        L_0x027a:
            gj.d r8 = p156gj.C107835h0.f322845b     // Catch:{ Exception -> 0x039c }
            if (r8 == 0) goto L_0x0287
            int r9 = r8.f322798M     // Catch:{ Exception -> 0x039c }
            int r9 = r9 * 1000
            int r8 = r8.f322799N     // Catch:{ Exception -> 0x039c }
            int r8 = r8 * 1000
            goto L_0x0289
        L_0x0287:
            r8 = -1
            r9 = -1
        L_0x0289:
            r20 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 <= 0) goto L_0x0295
            if (r8 <= 0) goto L_0x0295
            if (r8 < r9) goto L_0x0295
            r23 = 1
            goto L_0x034a
        L_0x0295:
            if (r9 != 0) goto L_0x02a1
            if (r8 != 0) goto L_0x02a1
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r23 = 0
            goto L_0x034a
        L_0x02a1:
            java.util.List r8 = r0.getSupportedPreviewFpsRange()     // Catch:{ Exception -> 0x039c }
            if (r8 == 0) goto L_0x03b1
            int r9 = r8.size()     // Catch:{ Exception -> 0x039c }
            if (r9 != 0) goto L_0x02af
            goto L_0x03b1
        L_0x02af:
            int r9 = r8.size()     // Catch:{ Exception -> 0x039c }
            r12 = 0
            r21 = -2147483648(0xffffffff80000000, float:-0.0)
            r23 = 0
            r26 = 2147483647(0x7fffffff, float:NaN)
        L_0x02bb:
            if (r12 >= r9) goto L_0x0346
            java.lang.Object r24 = r8.get(r12)     // Catch:{ Exception -> 0x039c }
            r13 = r24
            int[] r13 = (int[]) r13     // Catch:{ Exception -> 0x039c }
            if (r13 == 0) goto L_0x0334
            int r15 = r13.length     // Catch:{ Exception -> 0x039c }
            if (r15 > r7) goto L_0x02cc
            goto L_0x0334
        L_0x02cc:
            r15 = r13[r10]     // Catch:{ Exception -> 0x039c }
            r13 = r13[r7]     // Catch:{ Exception -> 0x039c }
            java.lang.String r7 = "dkfps %d:[%d %d]"
            java.lang.Object[] r10 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x039c }
            java.lang.Integer r29 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x039c }
            r28 = 0
            r10[r28] = r29     // Catch:{ Exception -> 0x039c }
            java.lang.Integer r29 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x039c }
            r27 = 1
            r10[r27] = r29     // Catch:{ Exception -> 0x039c }
            java.lang.Integer r29 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x039c }
            r24 = 2
            r10[r24] = r29     // Catch:{ Exception -> 0x039c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r10)     // Catch:{ Exception -> 0x039c }
            if (r15 < 0) goto L_0x0334
            if (r13 >= r15) goto L_0x02f4
            goto L_0x0334
        L_0x02f4:
            int r7 = r13 / 1000
            int r10 = r15 / 1000
            int r14 = r11 + 5
            r30 = r8
            r8 = 30
            int r8 = java.lang.Math.min(r14, r8)     // Catch:{ Exception -> 0x039c }
            int r14 = r11 + -5
            r31 = r9
            r9 = 5
            int r14 = java.lang.Math.max(r14, r9)     // Catch:{ Exception -> 0x039c }
            if (r7 < r14) goto L_0x0315
            if (r7 > r8) goto L_0x0315
            if (r10 < r14) goto L_0x0315
            if (r10 > r8) goto L_0x0315
            r8 = 1
            goto L_0x0316
        L_0x0315:
            r8 = 0
        L_0x0316:
            if (r8 == 0) goto L_0x0331
            int r8 = r11 - r10
            int r8 = java.lang.Math.abs(r8)     // Catch:{ Exception -> 0x039c }
            int r7 = r7 - r11
            int r7 = java.lang.Math.abs(r7)     // Catch:{ Exception -> 0x039c }
            int r8 = r8 + r7
            r7 = r26
            if (r8 >= r7) goto L_0x0339
            r26 = r8
            r20 = r13
            r21 = r15
            r23 = 1
            goto L_0x033b
        L_0x0331:
            r7 = r26
            goto L_0x0339
        L_0x0334:
            r30 = r8
            r31 = r9
            goto L_0x0331
        L_0x0339:
            r26 = r7
        L_0x033b:
            int r12 = r12 + 1
            r8 = r30
            r9 = r31
            r7 = 1
            r10 = 0
            r14 = 3
            goto L_0x02bb
        L_0x0346:
            r8 = r20
            r9 = r21
        L_0x034a:
            java.lang.String r7 = "steve: dkfps get fit  [%d %d], target fps %d, matchTargetFPS:%b"
            r10 = 4
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x039c }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x039c }
            r13 = 0
            r12[r13] = r10     // Catch:{ Exception -> 0x039c }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x039c }
            r13 = 1
            r12[r13] = r10     // Catch:{ Exception -> 0x039c }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x039c }
            r13 = 2
            r12[r13] = r10     // Catch:{ Exception -> 0x039c }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r23)     // Catch:{ Exception -> 0x039c }
            r13 = 3
            r12[r13] = r10     // Catch:{ Exception -> 0x039c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r12)     // Catch:{ Exception -> 0x039c }
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r9 == r7) goto L_0x03b1
            if (r8 == r7) goto L_0x03b1
            if (r23 != 0) goto L_0x0378
            goto L_0x03b1
        L_0x0378:
            java.lang.String r7 = "steve: SafeSetFps by setPreviewFpsRange [%d %d], target fps %d"
            java.lang.Object[] r10 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x039c }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x039c }
            r13 = 0
            r10[r13] = r12     // Catch:{ Exception -> 0x039c }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x039c }
            r13 = 1
            r10[r13] = r12     // Catch:{ Exception -> 0x039c }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x039c }
            r13 = 2
            r10[r13] = r12     // Catch:{ Exception -> 0x039c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r10)     // Catch:{ Exception -> 0x039c }
            r0.setPreviewFpsRange(r9, r8)     // Catch:{ Exception -> 0x039c }
            r6.mo158262f(r0)     // Catch:{ Exception -> 0x039c }
            r7 = 0
            goto L_0x03b2
        L_0x039c:
            r0 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "steve: SafeSetFps by setPreviewFpsRange error:"
            r7.append(r8)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x03b1:
            r7 = 1
        L_0x03b2:
            if (r7 == 0) goto L_0x03e3
            java.lang.String r0 = "steve: SafeSetFps by setPreviewFrameRate target fps %d"
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x03ce }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x03ce }
            r9 = 0
            r8[r9] = r7     // Catch:{ Exception -> 0x03ce }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r8)     // Catch:{ Exception -> 0x03ce }
            android.hardware.Camera$Parameters r0 = r6.mo158259c()     // Catch:{ Exception -> 0x03ce }
            r0.setPreviewFrameRate(r11)     // Catch:{ Exception -> 0x03ce }
            r6.mo158262f(r0)     // Catch:{ Exception -> 0x03ce }
            goto L_0x03e3
        L_0x03ce:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "steve: SafeSetFps by setPreviewFrameRate error:"
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x03e3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Camera Open Success, try set size: w,h:"
            r0.append(r6)
            r0.append(r3)
            r6 = 44
            r0.append(r6)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            c43.b r0 = b43.C104035d.f307670a
            if (r2 == 0) goto L_0x0406
            android.graphics.Point r0 = r0.f308693g
            goto L_0x0408
        L_0x0406:
            android.graphics.Point r0 = r0.f308694h
        L_0x0408:
            if (r0 == 0) goto L_0x040c
            r2 = 1
            goto L_0x040d
        L_0x040c:
            r2 = 0
        L_0x040d:
            if (r0 == 0) goto L_0x0435
            gj.f0 r6 = new gj.f0
            int r7 = r0.x
            int r0 = r0.y
            r6.<init>(r7, r0)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "getCameraSize from table:"
            r8.append(r9)
            r8.append(r7)
            r7 = 44
            r8.append(r7)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x0436
        L_0x0435:
            r6 = 0
        L_0x0436:
            com.tencent.mm.plugin.multitalk.model.k0$a r0 = f314631t     // Catch:{ Exception -> 0x0461 }
            gj.z r7 = r1.f314636d     // Catch:{ Exception -> 0x0461 }
            gj.f0 r3 = com.tencent.p014mm.plugin.multitalk.model.C105811k0.C105812a.m142166a(r0, r7, r3, r4)     // Catch:{ Exception -> 0x0461 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x045f }
            r0.<init>()     // Catch:{ Exception -> 0x045f }
            java.lang.String r4 = "getCameraResolution:"
            r0.append(r4)     // Catch:{ Exception -> 0x045f }
            int r4 = r3.f27283a     // Catch:{ Exception -> 0x045f }
            r0.append(r4)     // Catch:{ Exception -> 0x045f }
            r4 = 44
            r0.append(r4)     // Catch:{ Exception -> 0x045f }
            int r4 = r3.f27284b     // Catch:{ Exception -> 0x045f }
            r0.append(r4)     // Catch:{ Exception -> 0x045f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x045f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)     // Catch:{ Exception -> 0x045f }
            goto L_0x0472
        L_0x045f:
            r0 = move-exception
            goto L_0x0463
        L_0x0461:
            r0 = move-exception
            r3 = 0
        L_0x0463:
            r4 = 1
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getMessage()
            r4 = 0
            r7[r4] = r0
            java.lang.String r0 = "getCameraResolution failed: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r7)
        L_0x0472:
            java.lang.String r0 = ",h"
            if (r2 == 0) goto L_0x04ef
            gj.z r2 = r1.f314636d
            gy3.C87412m.m108591d(r6)
            int r4 = r6.f27283a
            int r7 = r6.f27284b
            boolean r2 = r1.mo150780f(r2, r4, r7)
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
            if (r2 != 0) goto L_0x0540
            if (r3 == 0) goto L_0x0540
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
            gj.z r2 = r1.f314636d
            int r4 = r3.f27283a
            int r6 = r3.f27284b
            boolean r2 = r1.mo150780f(r2, r4, r6)
            if (r2 != 0) goto L_0x0540
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
        L_0x04ef:
            java.lang.String r2 = "2.no config size!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            if (r3 == 0) goto L_0x0540
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
            gj.z r2 = r1.f314636d
            int r4 = r3.f27283a
            int r6 = r3.f27284b
            boolean r2 = r1.mo150780f(r2, r4, r6)
            if (r2 != 0) goto L_0x0540
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
        L_0x0540:
            gj.z r0 = r1.f314636d
            boolean r2 = r1.f314633a
            if (r0 != 0) goto L_0x0548
            goto L_0x060b
        L_0x0548:
            java.lang.String r3 = "trySetAutoFocus, isFrontCamera:%s"
            r4 = 1
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x05ea }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x05ea }
            r7 = 0
            r6[r7] = r4     // Catch:{ Exception -> 0x05ea }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r6)     // Catch:{ Exception -> 0x05ea }
            android.hardware.Camera$Parameters r3 = r0.mo158259c()     // Catch:{ Exception -> 0x05ea }
            java.util.List r4 = r3.getSupportedFocusModes()     // Catch:{ Exception -> 0x05ea }
            if (r4 == 0) goto L_0x060b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05ea }
            r6.<init>()     // Catch:{ Exception -> 0x05ea }
            java.lang.String r7 = "supported focus modes size = "
            r6.append(r7)     // Catch:{ Exception -> 0x05ea }
            int r7 = r4.size()     // Catch:{ Exception -> 0x05ea }
            r6.append(r7)     // Catch:{ Exception -> 0x05ea }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x05ea }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)     // Catch:{ Exception -> 0x05ea }
            java.util.Iterator r6 = r4.iterator()     // Catch:{ Exception -> 0x05ea }
        L_0x057d:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x05ea }
            if (r7 == 0) goto L_0x059e
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x05ea }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x05ea }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05ea }
            r8.<init>()     // Catch:{ Exception -> 0x05ea }
            java.lang.String r9 = "supported focus modes : "
            r8.append(r9)     // Catch:{ Exception -> 0x05ea }
            r8.append(r7)     // Catch:{ Exception -> 0x05ea }
            java.lang.String r7 = r8.toString()     // Catch:{ Exception -> 0x05ea }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)     // Catch:{ Exception -> 0x05ea }
            goto L_0x057d
        L_0x059e:
            gj.d r6 = p156gj.C107835h0.f322845b     // Catch:{ Exception -> 0x05ea }
            int r6 = r6.f322793H     // Catch:{ Exception -> 0x05ea }
            java.lang.String r7 = "camera support continuous video focus"
            java.lang.String r8 = "camera support auto focus"
            java.lang.String r9 = "continuous-video"
            java.lang.String r10 = "auto"
            if (r6 != 0) goto L_0x05c8
            if (r2 == 0) goto L_0x05c8
            boolean r2 = r4.contains(r10)     // Catch:{ Exception -> 0x05ea }
            if (r2 == 0) goto L_0x05bb
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)     // Catch:{ Exception -> 0x05ea }
            r3.setFocusMode(r10)     // Catch:{ Exception -> 0x05ea }
            goto L_0x05e6
        L_0x05bb:
            boolean r2 = r4.contains(r9)     // Catch:{ Exception -> 0x05ea }
            if (r2 == 0) goto L_0x05e6
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)     // Catch:{ Exception -> 0x05ea }
            r3.setFocusMode(r9)     // Catch:{ Exception -> 0x05ea }
            goto L_0x05e6
        L_0x05c8:
            r11 = 1
            if (r6 == r11) goto L_0x05cd
            if (r2 != 0) goto L_0x05e6
        L_0x05cd:
            boolean r2 = r4.contains(r9)     // Catch:{ Exception -> 0x05ea }
            if (r2 == 0) goto L_0x05da
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)     // Catch:{ Exception -> 0x05ea }
            r3.setFocusMode(r9)     // Catch:{ Exception -> 0x05ea }
            goto L_0x05e6
        L_0x05da:
            boolean r2 = r4.contains(r10)     // Catch:{ Exception -> 0x05ea }
            if (r2 == 0) goto L_0x05e6
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)     // Catch:{ Exception -> 0x05ea }
            r3.setFocusMode(r10)     // Catch:{ Exception -> 0x05ea }
        L_0x05e6:
            r0.mo158262f(r3)     // Catch:{ Exception -> 0x05ea }
            goto L_0x060b
        L_0x05ea:
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
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x060b:
            gj.z r0 = r1.f314636d     // Catch:{ Exception -> 0x06a7 }
            gy3.C87412m.m108591d(r0)     // Catch:{ Exception -> 0x06a7 }
            android.hardware.Camera$Parameters r0 = r0.mo158259c()     // Catch:{ Exception -> 0x06a7 }
            r1.f314637e = r0     // Catch:{ Exception -> 0x06a7 }
            if (r0 == 0) goto L_0x061d
            android.hardware.Camera$Size r0 = r0.getPreviewSize()     // Catch:{ Exception -> 0x06a7 }
            goto L_0x061e
        L_0x061d:
            r0 = 0
        L_0x061e:
            if (r0 == 0) goto L_0x0632
            gj.f0 r2 = new gj.f0     // Catch:{ Exception -> 0x06a7 }
            int r3 = r0.width     // Catch:{ Exception -> 0x06a7 }
            int r0 = r0.height     // Catch:{ Exception -> 0x06a7 }
            r2.<init>(r3, r0)     // Catch:{ Exception -> 0x06a7 }
            r1.f314638f = r2     // Catch:{ Exception -> 0x06a7 }
            b43.c r2 = r1.f314641i     // Catch:{ Exception -> 0x06a7 }
            if (r2 == 0) goto L_0x0632
            r2.mo145649t(r3, r0)     // Catch:{ Exception -> 0x06a7 }
        L_0x0632:
            android.hardware.Camera$Parameters r0 = r1.f314637e
            if (r0 == 0) goto L_0x0640
            int r0 = r0.getPreviewFrameRate()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = r0
            goto L_0x0641
        L_0x0640:
            r2 = 0
        L_0x0641:
            int r0 = b43.C104035d.f307675f
            r1.f314639g = r0
            if (r0 > 0) goto L_0x064a
            r0 = 7
            r1.f314639g = r0
        L_0x064a:
            gj.z r0 = r1.f314636d     // Catch:{ Exception -> 0x0651 }
            r1.mo150777c(r0)     // Catch:{ Exception -> 0x0651 }
            r3 = 0
            goto L_0x0661
        L_0x0651:
            r0 = move-exception
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getMessage()
            r3 = 0
            r4[r3] = r0
            java.lang.String r0 = "setDisplayOrientation failed: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r4)
        L_0x0661:
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r2
            gj.f0 r2 = r1.f314638f
            if (r2 == 0) goto L_0x0671
            int r2 = r2.f27283a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0672
        L_0x0671:
            r2 = 0
        L_0x0672:
            r3 = 1
            r0[r3] = r2
            gj.f0 r2 = r1.f314638f
            if (r2 == 0) goto L_0x0681
            int r2 = r2.f27284b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r2 = 2
            goto L_0x0683
        L_0x0681:
            r2 = 2
            r6 = 0
        L_0x0683:
            r0[r2] = r6
            int r2 = r1.f314639g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 3
            r0[r3] = r2
            int r2 = b43.C104035d.f307673d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 4
            r0[r3] = r2
            int r2 = r1.f314645m
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 5
            r0[r3] = r2
            java.lang.String r2 = "Camera ok, fps: %d, mSize.width: %d, mSize.height: %d, format: %d, IsRotate180: %d, displayOrientation: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r0)
            r2 = 1
            return r2
        L_0x06a7:
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
        L_0x06c5:
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
            java.lang.String r3 = r2.getMessage()
            r4 = 0
            r0[r4] = r3
            java.lang.String r3 = "Camera open failed, error:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r3, r0)
            b43.c r0 = r1.f314641i
            if (r0 == 0) goto L_0x0727
            gy3.C87412m.m108591d(r0)     // Catch:{ Exception -> 0x0717 }
            r0.mo145648k()     // Catch:{ Exception -> 0x0717 }
            r3 = 1
            r1.f314646n = r3     // Catch:{ Exception -> 0x0715 }
            gj.z r0 = r1.f314636d     // Catch:{ Exception -> 0x0717 }
            gy3.C87412m.m108591d(r0)     // Catch:{ Exception -> 0x0717 }
            boolean r0 = r0.f322938c     // Catch:{ Exception -> 0x0717 }
            if (r0 != 0) goto L_0x0701
            gj.z r0 = r1.f314636d     // Catch:{ Exception -> 0x0717 }
            gy3.C87412m.m108591d(r0)     // Catch:{ Exception -> 0x0717 }
            r3 = 0
            r0.mo158263g(r3)     // Catch:{ Exception -> 0x0717 }
        L_0x0701:
            gj.z r0 = r1.f314636d     // Catch:{ Exception -> 0x0717 }
            gy3.C87412m.m108591d(r0)     // Catch:{ Exception -> 0x0717 }
            r0.mo158268l()     // Catch:{ Exception -> 0x0717 }
            gj.z r0 = r1.f314636d     // Catch:{ Exception -> 0x0717 }
            gy3.C87412m.m108591d(r0)     // Catch:{ Exception -> 0x0717 }
            r0.mo158260d()     // Catch:{ Exception -> 0x0717 }
            r3 = 0
            r1.f314636d = r3     // Catch:{ Exception -> 0x0717 }
            goto L_0x0727
        L_0x0715:
            r0 = move-exception
            goto L_0x0719
        L_0x0717:
            r0 = move-exception
            r3 = 1
        L_0x0719:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r2 = r2.getMessage()
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "Camera open failed2, error:%s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r2, r3)
        L_0x0727:
            r2 = -1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.C105811k0.mo150775a(boolean, int, int):int");
    }

    /* renamed from: b */
    public final int mo150776b(C104034c cVar, boolean z) {
        int a;
        C104298b bVar = C104035d.f307670a;
        if (bVar.f308688b <= 0) {
            this.f314635c = 1;
            return -1;
        }
        if (z) {
            if (!bVar.f308689c) {
                z = false;
            }
        } else if (!bVar.f308690d) {
            z = true;
        }
        this.f314641i = cVar;
        if (mo150775a(z, 640, 480) <= 0 && (a = mo150775a(z, 640, 480)) <= 0) {
            this.f314635c = 1;
            return a;
        }
        this.f314633a = z;
        if (this.f314650r) {
            Log.m105924i("MicroMsg.Voip.CaptureRender", "initCapture: use preview callback");
            try {
                if (this.f314636d != null && this.f314640h) {
                    C8325f0 f0Var = this.f314638f;
                    if (f0Var != null && f0Var.f27284b > 0) {
                        C87412m.m108591d(f0Var);
                        if (f0Var.f27283a > 0) {
                            C8325f0 f0Var2 = this.f314638f;
                            C87412m.m108591d(f0Var2);
                            int i = f0Var2.f27284b;
                            C8325f0 f0Var3 = this.f314638f;
                            C87412m.m108591d(f0Var3);
                            int i2 = ((i * f0Var3.f27283a) * 3) / 2;
                            if (this.f314644l == null) {
                                this.f314644l = new ArrayList(3);
                                for (int i3 = 0; i3 < 3; i3++) {
                                    List<byte[]> list = this.f314644l;
                                    if (list != null) {
                                        ((ArrayList) list).add(new byte[i2]);
                                    }
                                }
                            }
                            List<byte[]> list2 = this.f314644l;
                            C87412m.m108591d(list2);
                            int size = ((ArrayList) list2).size();
                            for (int i4 = 0; i4 < size; i4++) {
                                if (this.f314636d != null) {
                                    C107848z zVar = this.f314636d;
                                    C87412m.m108591d(zVar);
                                    List<byte[]> list3 = this.f314644l;
                                    C87412m.m108591d(list3);
                                    zVar.mo158257a((byte[]) ((ArrayList) list3).get(i4));
                                }
                            }
                            C107848z zVar2 = this.f314636d;
                            C87412m.m108591d(zVar2);
                            zVar2.mo158264h(this.f314651s);
                        }
                    }
                    C107848z zVar3 = this.f314636d;
                    C87412m.m108591d(zVar3);
                    zVar3.mo158263g(this.f314651s);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Voip.CaptureRender", e, "setPreviewCallback error: %s", e.getMessage());
            }
        } else {
            Log.m105924i("MicroMsg.Voip.CaptureRender", "initCapture: not use preview callback");
        }
        this.f314635c = 0;
        return 1;
    }

    /* renamed from: c */
    public final void mo150777c(C107848z zVar) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.f314633a ? C104035d.f307671b : C104035d.f307672c, cameraInfo);
        Object systemService = MMApplicationContext.getContext().getSystemService("window");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        int rotation = ((WindowManager) systemService).getDefaultDisplay().getRotation();
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
        int i2 = this.f314633a ? (360 - ((cameraInfo.orientation + i) % v2helper.VOIP_ENC_HEIGHT_LV1)) % v2helper.VOIP_ENC_HEIGHT_LV1 : ((cameraInfo.orientation - i) + v2helper.VOIP_ENC_HEIGHT_LV1) % v2helper.VOIP_ENC_HEIGHT_LV1;
        C87412m.m108591d(zVar);
        zVar.mo158261e(i2);
        this.f314645m = i2;
    }

    /* renamed from: d */
    public final int mo150778d() {
        Object obj;
        C13598b0 b0Var;
        Camera.Parameters c;
        String str;
        if (!this.f314640h) {
            Log.m105920e("MicroMsg.Voip.CaptureRender", "StartCapture: failed without open camera");
            this.f314635c = 1;
            return -1;
        } else if (this.f314642j) {
            Log.m105920e("MicroMsg.Voip.CaptureRender", "StartCapture: is in capture already ");
            return -1;
        } else {
            Log.m105919d("MicroMsg.Voip.CaptureRender", "StartCapture now, isUesSurfacePreivew: %b", Boolean.FALSE);
            if (this.f314648p != null) {
                try {
                    C107848z zVar = this.f314636d;
                    C87412m.m108591d(zVar);
                    zVar.mo158265i(this.f314648p);
                } catch (Exception e) {
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.idkeyStat(159, 0, 1, false);
                    nVar.idkeyStat(159, 2, 1, false);
                    this.f314635c = 1;
                    Log.m105920e("MicroMsg.Voip.CaptureRender", "StartCapture:error:" + e);
                }
            }
            try {
                C107848z zVar2 = this.f314636d;
                C87412m.m108591d(zVar2);
                zVar2.mo158267k();
            } catch (Exception e2) {
                C115669n nVar2 = C115669n.INSTANCE;
                nVar2.idkeyStat(159, 0, 1, false);
                nVar2.idkeyStat(159, 2, 1, false);
                this.f314635c = 1;
                C104034c cVar = this.f314641i;
                if (cVar != null) {
                    C87412m.m108591d(cVar);
                    cVar.mo145648k();
                }
                Log.m105920e("MicroMsg.Voip.CaptureRender", "startPreview:error" + e2);
            }
            try {
                Result.Companion companion = Result.Companion;
                C107848z zVar3 = this.f314636d;
                if (zVar3 == null || (c = zVar3.mo158259c()) == null || (str = c.get("preview-size-values")) == null) {
                    b0Var = null;
                } else {
                    Log.m105924i("MicroMsg.Voip.CaptureRender", "startCaptureUseSurfaceHolder: preview-size-values " + str);
                    b0Var = C13598b0.f38549a;
                }
                obj = Result.m168114constructorimpl(b0Var);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
            }
            Throwable r0 = Result.m168117exceptionOrNullimpl(obj);
            if (r0 != null) {
                Log.m105921e("MicroMsg.Voip.CaptureRender", "startCaptureUseSurfaceHolder: get parameters error", r0);
            }
            if (this.f314636d != null && this.f314650r) {
                C107848z zVar4 = this.f314636d;
                C87412m.m108591d(zVar4);
                zVar4.mo158263g(this.f314651s);
            }
            this.f314642j = true;
            return 1;
        }
    }

    /* renamed from: e */
    public final void mo150779e() {
        Log.m105918d("MicroMsg.Voip.CaptureRender", "StopCapture....mIsInCapture = " + this.f314642j);
        if (this.f314642j && this.f314636d != null) {
            C107848z zVar = this.f314636d;
            C87412m.m108591d(zVar);
            if (!zVar.f322938c) {
                C107848z zVar2 = this.f314636d;
                C87412m.m108591d(zVar2);
                zVar2.mo158263g((Camera.PreviewCallback) null);
            }
            try {
                C107848z zVar3 = this.f314636d;
                C87412m.m108591d(zVar3);
                zVar3.mo158268l();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.Voip.CaptureRender", "stopPreview:error" + e);
            }
            this.f314642j = false;
        }
        if (1 == this.f314635c) {
            PermissionShowDlgEvent permissionShowDlgEvent = new PermissionShowDlgEvent();
            permissionShowDlgEvent.f264988d.f264990a = 2;
            permissionShowDlgEvent.publish();
        }
        Log.m105918d("MicroMsg.Voip.CaptureRender", "UnInitCapture....mCameraOpen = " + this.f314640h);
        if (this.f314640h) {
            this.f314635c = 0;
            if (this.f314636d != null) {
                C107848z zVar4 = this.f314636d;
                C87412m.m108591d(zVar4);
                if (!zVar4.f322938c) {
                    C107848z zVar5 = this.f314636d;
                    C87412m.m108591d(zVar5);
                    zVar5.mo158263g((Camera.PreviewCallback) null);
                    C107848z zVar6 = this.f314636d;
                    C87412m.m108591d(zVar6);
                    zVar6.mo158260d();
                }
            }
            this.f314636d = null;
            this.f314640h = false;
        } else if (this.f314636d != null) {
            C107848z zVar7 = this.f314636d;
            C87412m.m108591d(zVar7);
            if (!zVar7.f322938c) {
                C107848z zVar8 = this.f314636d;
                C87412m.m108591d(zVar8);
                zVar8.mo158263g((Camera.PreviewCallback) null);
            }
            C107848z zVar9 = this.f314636d;
            C87412m.m108591d(zVar9);
            zVar9.mo158260d();
            this.f314636d = null;
            this.f314640h = false;
        }
        this.f314643k = null;
        List<byte[]> list = this.f314644l;
        if (list != null) {
            C87412m.m108591d(list);
            list.clear();
        }
        this.f314644l = null;
    }

    /* renamed from: f */
    public final boolean mo150780f(C107848z zVar, int i, int i2) {
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
            Log.m105920e("MicroMsg.Voip.CaptureRender", "TryPreviewSize fail:" + e);
            return false;
        }
    }
}
