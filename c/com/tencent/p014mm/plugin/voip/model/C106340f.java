package com.tencent.p014mm.plugin.voip.model;

import a70.C112760b;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.Size;
import android.view.Surface;
import androidx.exifinterface.media.ExifInterface;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedList;
import l33.C109247e;
import te3.C110957bf2;
import z33.C112593f;
import z33.C112595h;

/* renamed from: com.tencent.mm.plugin.voip.model.f */
public class C106340f {

    /* renamed from: I */
    public static int f317244I;

    /* renamed from: J */
    public static int f317245J = 18;

    /* renamed from: K */
    public static int f317246K = 19;

    /* renamed from: L */
    public static final String[] f317247L = {MediaCodecUtils.QCOM_PREFIX, MediaCodecUtils.EXYNOS_PREFIX, "OMX.hisi", "OMX.MTK", "OMX.sprd", "c2.exynos", "c2.qti", "c2.mtk", "c2.unisoc"};

    /* renamed from: M */
    public static int f317248M = 25;

    /* renamed from: A */
    public int f317249A;

    /* renamed from: B */
    public final int f317250B;

    /* renamed from: C */
    public C106342b f317251C;

    /* renamed from: D */
    public Surface f317252D;

    /* renamed from: E */
    public C106341a f317253E;

    /* renamed from: F */
    public int f317254F;

    /* renamed from: G */
    public int f317255G;

    /* renamed from: H */
    public Size f317256H;

    /* renamed from: a */
    public int f317257a = 0;

    /* renamed from: b */
    public int f317258b = 0;

    /* renamed from: c */
    public String f317259c = "h264";

    /* renamed from: d */
    public int f317260d = 12000;

    /* renamed from: e */
    public C104619a f317261e;

    /* renamed from: f */
    public MediaFormat f317262f;

    /* renamed from: g */
    public int f317263g = 8;

    /* renamed from: h */
    public int f317264h = 0;

    /* renamed from: i */
    public boolean f317265i = false;

    /* renamed from: j */
    public int f317266j;

    /* renamed from: k */
    public int f317267k;

    /* renamed from: l */
    public int f317268l;

    /* renamed from: m */
    public int f317269m;

    /* renamed from: n */
    public int f317270n;

    /* renamed from: o */
    public int f317271o;

    /* renamed from: p */
    public int f317272p;

    /* renamed from: q */
    public byte[] f317273q;

    /* renamed from: r */
    public byte[] f317274r;

    /* renamed from: s */
    public C106377r f317275s;

    /* renamed from: t */
    public LinkedList<C110957bf2> f317276t;

    /* renamed from: u */
    public LinkedList<Integer> f317277u;

    /* renamed from: v */
    public C106349h f317278v;

    /* renamed from: w */
    public int f317279w;

    /* renamed from: x */
    public int f317280x;

    /* renamed from: y */
    public int f317281y;

    /* renamed from: z */
    public int f317282z;

    /* renamed from: com.tencent.mm.plugin.voip.model.f$a */
    public interface C106341a {
        /* renamed from: a */
        void mo152572a(Surface surface, int i, int i2);

        /* renamed from: b */
        void mo152573b(Surface surface);
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.f$b */
    public class C106342b {

        /* renamed from: a */
        public short f317283a;

        /* renamed from: b */
        public byte f317284b;

        /* renamed from: c */
        public byte f317285c;

        /* renamed from: d */
        public byte f317286d;

        /* renamed from: e */
        public byte f317287e;

        /* renamed from: f */
        public byte f317288f;

        /* renamed from: g */
        public byte f317289g;

        /* renamed from: h */
        public byte f317290h;

        /* renamed from: i */
        public byte f317291i;

        /* renamed from: j */
        public byte f317292j;

        /* renamed from: k */
        public byte f317293k;

        /* renamed from: l */
        public byte f317294l;

        /* renamed from: m */
        public byte f317295m;

        /* renamed from: n */
        public short f317296n;

        /* renamed from: o */
        public short f317297o;

        /* renamed from: p */
        public byte[] f317298p = new byte[18];

        public C106342b(C106340f fVar) {
        }

        /* renamed from: a */
        public void mo152574a() {
            Log.m105924i("MicroMsg.AvcEncoder", "raw S2P:" + this.f317298p);
            Log.m105924i("MicroMsg.AvcEncoder", "-S2P- iKbps:" + this.f317283a + ", fps:" + this.f317284b + ", IP:" + this.f317285c + ", RS:" + this.f317286d + ", QPMin:" + this.f317287e + ", QPMax:" + this.f317288f + ", HPP:" + this.f317289g + ", SWitch:" + this.f317290h + ", Reso:" + this.f317291i + ", Rsvd1:" + this.f317292j + ", Rsvd2:" + this.f317293k + ", Skip:" + this.f317294l + ", IReq:" + this.f317295m + ", iEncW:" + this.f317296n + ", iEncH:" + this.f317297o);
        }
    }

    static {
        C112760b.m154195C();
    }

    public C106340f(int i, int i2, int i3, int i4, int i5, String str) {
        boolean z = true;
        this.f317270n = 1;
        this.f317273q = null;
        this.f317274r = null;
        this.f317275s = null;
        this.f317276t = new LinkedList<>();
        this.f317277u = new LinkedList<>();
        this.f317278v = null;
        this.f317279w = 0;
        this.f317280x = 8;
        this.f317281y = 0;
        this.f317282z = 0;
        this.f317249A = 0;
        this.f317250B = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_VOIP_ForceHardEncode_Int, 0);
        this.f317251C = null;
        this.f317254F = 640;
        this.f317255G = 480;
        this.f317256H = C112595h.m153924k();
        this.f317265i = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_voip_ignore2007, 0) != 1 ? false : z;
        this.f317266j = i;
        this.f317267k = i2;
        this.f317271o = i;
        this.f317272p = i2;
        Size size = this.f317256H;
        if (size != null) {
            this.f317266j = size.getWidth();
            this.f317267k = this.f317256H.getHeight();
            this.f317271o = this.f317256H.getWidth();
            this.f317272p = this.f317256H.getHeight();
        }
        this.f317259c = str;
        this.f317268l = i3;
        this.f317269m = i4;
        this.f317270n = i5;
        this.f317260d = 5000;
        f317244I = 0;
        this.f317251C = new C106342b(this);
        this.f317261e = null;
        this.f317280x = 8;
        this.f317279w = 0;
        this.f317281y = 0;
        this.f317257a = 0;
        this.f317258b = 0;
        C110957bf2 bf22 = new C110957bf2();
        bf22.f331889d = 1;
        bf22.f331890e = 24;
        bf22.f331891f = 1;
        bf22.f331892g = 24;
        bf22.f331893h = 0;
        bf22.f331894i = 0;
        this.f317276t.add(bf22);
        this.f317277u.add(0);
        this.f317282z = 0;
        this.f317249A = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:150:0x0518 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo152561a(java.nio.ByteBuffer r25, int r26, int r27, int r28, boolean r29) {
        /*
            r24 = this;
            r1 = r24
            r0 = r26
            r2 = r27
            java.lang.String r3 = "bitrate"
            com.tencent.mm.plugin.voip.model.f$b r4 = r1.f317251C
            byte r4 = r4.f317294l
            r5 = 2
            r6 = 1
            java.lang.String r7 = "MicroMsg.AvcEncoder"
            r8 = 0
            if (r4 != 0) goto L_0x011d
            com.tencent.mm.plugin.voip.model.r r4 = r1.f317275s
            if (r4 == 0) goto L_0x011d
            com.tencent.mm.plugin.voip.model.v2protocal r4 = r4.f317500x
            if (r4 == 0) goto L_0x011d
            int r4 = r1.f317271o
            if (r0 != r4) goto L_0x0023
            int r4 = r1.f317272p
            if (r2 == r4) goto L_0x0043
        L_0x0023:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "update CapW = "
            r4.append(r9)
            r4.append(r0)
            java.lang.String r9 = ", CapH = "
            r4.append(r9)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            r1.f317271o = r0
            r1.f317272p = r2
        L_0x0043:
            com.tencent.mm.plugin.voip.model.r r4 = r1.f317275s
            com.tencent.mm.plugin.voip.model.v2protocal r4 = r4.f317500x
            int r4 = r4.videoGetEncWH(r0, r2)
            com.tencent.mm.plugin.voip.model.r r9 = r1.f317275s
            com.tencent.mm.plugin.voip.model.v2protocal r9 = r9.f317500x
            int r10 = r9.field_HWEncW
            int r9 = r9.field_HWEncH
            int r11 = r1.f317250B
            if (r11 == 0) goto L_0x0064
            int r11 = z33.C112593f.f337157b
            if (r11 <= 0) goto L_0x0064
            int r11 = z33.C112593f.f337158c
            if (r11 <= 0) goto L_0x0064
            int r10 = z33.C112593f.f337157b
            int r9 = z33.C112593f.f337158c
            goto L_0x007f
        L_0x0064:
            int r11 = r1.f317266j
            if (r11 != r10) goto L_0x006c
            int r11 = r1.f317267k
            if (r11 == r9) goto L_0x007f
        L_0x006c:
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            r11[r8] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            r11[r6] = r12
            java.lang.String r12 = "surface update enc size:[%d, %d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r12, r11)
        L_0x007f:
            int r11 = r1.f317266j
            if (r11 != r10) goto L_0x0091
            int r11 = r1.f317267k
            if (r11 != r9) goto L_0x0091
            com.tencent.mm.compatible.deviceinfo.a r11 = r1.f317261e
            if (r11 == 0) goto L_0x0091
            int r11 = r1.f317264h
            int r12 = r1.f317263g
            if (r11 == r12) goto L_0x011e
        L_0x0091:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "restart encoder! clipWH:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = "x"
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = ", wh:"
            r3.append(r2)
            int r2 = r1.f317266j
            r3.append(r2)
            r3.append(r0)
            int r0 = r1.f317267k
            r3.append(r0)
            java.lang.String r0 = ", mCodecTypePrev: "
            r3.append(r0)
            int r0 = r1.f317264h
            r3.append(r0)
            java.lang.String r0 = ", mCodecType: "
            r3.append(r0)
            int r0 = r1.f317263g
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r1.f317266j = r10
            r1.f317267k = r9
            int r0 = r24.mo152563c()     // Catch:{ Exception -> 0x00dd }
            goto L_0x00fe
        L_0x00dd:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "mediacodec init error: "
            r0.append(r3)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            r0 = 2003(0x7d3, float:2.807E-42)
            r1.mo152571k(r0)
            r0 = -2003(0xfffffffffffff82d, float:NaN)
        L_0x00fe:
            if (r0 >= 0) goto L_0x0118
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mediacodec init failed, stop HW encoding! ret: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r2)
            r24.mo152566f()
            return r0
        L_0x0118:
            int r0 = r1.f317263g
            r1.f317264h = r0
            return r8
        L_0x011d:
            r4 = 0
        L_0x011e:
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f317261e
            if (r0 == 0) goto L_0x056b
            r1.f317282z = r8     // Catch:{ Exception -> 0x0547 }
            java.nio.ByteBuffer[] r0 = r0.mo148211m()     // Catch:{ Exception -> 0x0547 }
            android.media.MediaCodec$BufferInfo r9 = new android.media.MediaCodec$BufferInfo     // Catch:{ Exception -> 0x0547 }
            r9.<init>()     // Catch:{ Exception -> 0x0547 }
            com.tencent.mm.compatible.deviceinfo.a r10 = r1.f317261e     // Catch:{ Exception -> 0x0547 }
            int r11 = r1.f317260d     // Catch:{ Exception -> 0x0547 }
            long r11 = (long) r11     // Catch:{ Exception -> 0x0547 }
            int r10 = r10.mo148205g(r9, r11)     // Catch:{ Exception -> 0x0547 }
            r11 = -2
            if (r10 != r11) goto L_0x01a9
            com.tencent.mm.compatible.deviceinfo.a r11 = r1.f317261e     // Catch:{ Exception -> 0x0547 }
            android.media.MediaFormat r11 = r11.mo148212n()     // Catch:{ Exception -> 0x0547 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0547 }
            r12.<init>()     // Catch:{ Exception -> 0x0547 }
            java.lang.String r13 = "steve: encoder output format changed: "
            r12.append(r13)     // Catch:{ Exception -> 0x0547 }
            r12.append(r11)     // Catch:{ Exception -> 0x0547 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0547 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r12)     // Catch:{ Exception -> 0x0547 }
            boolean r12 = r11.containsKey(r3)     // Catch:{ Exception -> 0x0547 }
            if (r12 == 0) goto L_0x01a9
            int r12 = r11.getInteger(r3)     // Catch:{ Exception -> 0x0547 }
            double r12 = (double) r12     // Catch:{ Exception -> 0x0547 }
            int r14 = r1.f317269m     // Catch:{ Exception -> 0x0547 }
            int r14 = r14 * 1000
            double r14 = (double) r14     // Catch:{ Exception -> 0x0547 }
            r16 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r14 = r14 * r16
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x01a9
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0547 }
            r12.<init>()     // Catch:{ Exception -> 0x0547 }
            java.lang.String r13 = "steve: bitrate NOT match!! real:"
            r12.append(r13)     // Catch:{ Exception -> 0x0547 }
            int r3 = r11.getInteger(r3)     // Catch:{ Exception -> 0x0547 }
            r12.append(r3)     // Catch:{ Exception -> 0x0547 }
            java.lang.String r3 = ", target:"
            r12.append(r3)     // Catch:{ Exception -> 0x0547 }
            int r3 = r1.f317269m     // Catch:{ Exception -> 0x0547 }
            r12.append(r3)     // Catch:{ Exception -> 0x0547 }
            java.lang.String r3 = ", mBIgnore2007: "
            r12.append(r3)     // Catch:{ Exception -> 0x0547 }
            boolean r3 = r1.f317265i     // Catch:{ Exception -> 0x0547 }
            r12.append(r3)     // Catch:{ Exception -> 0x0547 }
            java.lang.String r3 = r12.toString()     // Catch:{ Exception -> 0x0547 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r3)     // Catch:{ Exception -> 0x0547 }
            boolean r3 = r1.f317265i     // Catch:{ Exception -> 0x0547 }
            if (r3 == 0) goto L_0x01a1
            r3 = 12007(0x2ee7, float:1.6825E-41)
            r1.mo152571k(r3)     // Catch:{ Exception -> 0x0547 }
            goto L_0x01a9
        L_0x01a1:
            r0 = 2007(0x7d7, float:2.812E-42)
            r1.mo152571k(r0)     // Catch:{ Exception -> 0x0547 }
            r0 = -2007(0xfffffffffffff829, float:NaN)
            return r0
        L_0x01a9:
            if (r10 < 0) goto L_0x057b
            r3 = r0[r10]     // Catch:{ Exception -> 0x0547 }
            int r4 = r9.size     // Catch:{ Exception -> 0x0547 }
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x0547 }
            r3.get(r4)     // Catch:{ Exception -> 0x0547 }
            int r3 = r9.flags     // Catch:{ Exception -> 0x0547 }
            java.lang.String r12 = "send stream error! ret: "
            java.lang.String r14 = "mediacodec reinit error: "
            java.lang.String r15 = ", checkCodeForBSlice:"
            java.lang.String r11 = "steve:B-frames exist in High Profile, reset to Baseline!!!,maxAllowedProfile:"
            r2 = 3
            java.lang.String r13 = ", len:"
            if (r3 != r5) goto L_0x034b
            java.util.ArrayList r3 = r1.mo152568h(r4, r8)     // Catch:{ Exception -> 0x0547 }
            te3.af2 r5 = new te3.af2     // Catch:{ Exception -> 0x0547 }
            r5.<init>()     // Catch:{ Exception -> 0x0547 }
            int r6 = r3.size()     // Catch:{ Exception -> 0x0547 }
            if (r6 != r2) goto L_0x0226
            java.lang.String r2 = r1.f317259c     // Catch:{ Exception -> 0x0547 }
            java.lang.String r6 = "video/hevc"
            boolean r2 = r2.equalsIgnoreCase(r6)     // Catch:{ Exception -> 0x0547 }
            if (r2 == 0) goto L_0x0226
            java.lang.Object r2 = r3.get(r8)     // Catch:{ Exception -> 0x0547 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x0547 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x0547 }
            r6 = 4
            int r2 = r2 + r6
            r8 = 1
            java.lang.Object r16 = r3.get(r8)     // Catch:{ Exception -> 0x0547 }
            java.lang.Integer r16 = (java.lang.Integer) r16     // Catch:{ Exception -> 0x0547 }
            int r8 = r16.intValue()     // Catch:{ Exception -> 0x0547 }
            int r8 = r8 + r6
            r6 = 2
            java.lang.Object r3 = r3.get(r6)     // Catch:{ Exception -> 0x0547 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x0547 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x0547 }
            r6 = 4
            int r3 = r3 + r6
            int r16 = r8 - r2
            r18 = r0
            int r0 = r16 + -4
            int r16 = r3 - r8
            int r19 = r16 + -4
            int r6 = r9.size     // Catch:{ Exception -> 0x0547 }
            int r6 = r6 - r3
            r20 = r3
            pe3.b r3 = new pe3.b     // Catch:{ Exception -> 0x0547 }
            r3.<init>(r4, r2, r0)     // Catch:{ Exception -> 0x0547 }
            r5.f331877g = r3     // Catch:{ Exception -> 0x0547 }
            r3 = r20
            r20 = r12
            r23 = r10
            r10 = r0
            r0 = r8
            r8 = r6
            r6 = r19
            r19 = r23
            goto L_0x025f
        L_0x0226:
            r18 = r0
            int r0 = r3.size()     // Catch:{ Exception -> 0x0547 }
            r2 = 2
            if (r0 != r2) goto L_0x0255
            r2 = 0
            java.lang.Object r0 = r3.get(r2)     // Catch:{ Exception -> 0x0547 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0547 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0547 }
            r2 = 4
            int r0 = r0 + r2
            r6 = 1
            java.lang.Object r3 = r3.get(r6)     // Catch:{ Exception -> 0x0547 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x0547 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x0547 }
            int r3 = r3 + r2
            int r6 = r3 - r0
            int r6 = r6 - r2
            int r2 = r9.size     // Catch:{ Exception -> 0x0547 }
            int r2 = r2 - r3
            r8 = r2
            r19 = r10
            r20 = r12
            r2 = 0
            goto L_0x025e
        L_0x0255:
            r19 = r10
            r20 = r12
            r0 = 0
            r2 = 0
            r3 = 0
            r6 = 0
            r8 = 0
        L_0x025e:
            r10 = 0
        L_0x025f:
            byte[] r12 = r1.f317273q     // Catch:{ Exception -> 0x0547 }
            if (r12 != 0) goto L_0x0269
            int r12 = r9.size     // Catch:{ Exception -> 0x0547 }
            byte[] r12 = new byte[r12]     // Catch:{ Exception -> 0x0547 }
            r1.f317273q = r12     // Catch:{ Exception -> 0x0547 }
        L_0x0269:
            byte[] r12 = r1.f317273q     // Catch:{ Exception -> 0x0547 }
            if (r12 == 0) goto L_0x0281
            r21 = r5
            int r5 = r9.size     // Catch:{ Exception -> 0x0547 }
            int r12 = r12.length     // Catch:{ Exception -> 0x0547 }
            if (r5 <= r12) goto L_0x0278
            byte[] r12 = new byte[r5]     // Catch:{ Exception -> 0x0547 }
            r1.f317273q = r12     // Catch:{ Exception -> 0x0547 }
        L_0x0278:
            byte[] r12 = r1.f317273q     // Catch:{ Exception -> 0x0547 }
            r22 = r9
            r9 = 0
            java.lang.System.arraycopy(r4, r9, r12, r9, r5)     // Catch:{ Exception -> 0x0547 }
            goto L_0x0285
        L_0x0281:
            r21 = r5
            r22 = r9
        L_0x0285:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0547 }
            r5.<init>()     // Catch:{ Exception -> 0x0547 }
            java.lang.String r9 = "sps start: "
            r5.append(r9)     // Catch:{ Exception -> 0x0547 }
            r5.append(r0)     // Catch:{ Exception -> 0x0547 }
            r5.append(r13)     // Catch:{ Exception -> 0x0547 }
            r5.append(r6)     // Catch:{ Exception -> 0x0547 }
            java.lang.String r9 = ", pps start:"
            r5.append(r9)     // Catch:{ Exception -> 0x0547 }
            r5.append(r3)     // Catch:{ Exception -> 0x0547 }
            r5.append(r13)     // Catch:{ Exception -> 0x0547 }
            r5.append(r8)     // Catch:{ Exception -> 0x0547 }
            java.lang.String r9 = ", vps start: "
            r5.append(r9)     // Catch:{ Exception -> 0x0547 }
            r5.append(r2)     // Catch:{ Exception -> 0x0547 }
            r5.append(r13)     // Catch:{ Exception -> 0x0547 }
            r5.append(r10)     // Catch:{ Exception -> 0x0547 }
            java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x0547 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r2)     // Catch:{ Exception -> 0x0547 }
            int r2 = r1.f317279w     // Catch:{ Exception -> 0x0547 }
            r5 = 1
            if (r2 == r5) goto L_0x0312
            com.tencent.mm.plugin.voip.model.h r2 = r1.f317278v     // Catch:{ Exception -> 0x0547 }
            boolean r2 = r2.mo152584b(r4)     // Catch:{ Exception -> 0x0547 }
            if (r2 == 0) goto L_0x0312
            com.tencent.mm.plugin.voip.model.h r0 = r1.f317278v     // Catch:{ Exception -> 0x0547 }
            int r0 = r0.f317324a     // Catch:{ Exception -> 0x0547 }
            r1.f317281y = r0     // Catch:{ Exception -> 0x0547 }
            r0 = 1
            r1.f317280x = r0     // Catch:{ Exception -> 0x0547 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0547 }
            r0.<init>()     // Catch:{ Exception -> 0x0547 }
            r0.append(r11)     // Catch:{ Exception -> 0x0547 }
            int r2 = r1.f317280x     // Catch:{ Exception -> 0x0547 }
            r0.append(r2)     // Catch:{ Exception -> 0x0547 }
            r0.append(r15)     // Catch:{ Exception -> 0x0547 }
            int r2 = r1.f317281y     // Catch:{ Exception -> 0x0547 }
            r0.append(r2)     // Catch:{ Exception -> 0x0547 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0547 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)     // Catch:{ Exception -> 0x0547 }
            int r11 = r24.mo152563c()     // Catch:{ Exception -> 0x02f2 }
            goto L_0x0311
        L_0x02f2:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0547 }
            r0.<init>()     // Catch:{ Exception -> 0x0547 }
            r0.append(r14)     // Catch:{ Exception -> 0x0547 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ Exception -> 0x0547 }
            r0.append(r2)     // Catch:{ Exception -> 0x0547 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0547 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)     // Catch:{ Exception -> 0x0547 }
            r2 = 2005(0x7d5, float:2.81E-42)
            r1.mo152571k(r2)     // Catch:{ Exception -> 0x0547 }
            r11 = -2005(0xfffffffffffff82b, float:NaN)
        L_0x0311:
            return r11
        L_0x0312:
            r2 = r21
            r5 = 4
            r2.f331874d = r5     // Catch:{ Exception -> 0x0547 }
            pe3.b r5 = new pe3.b     // Catch:{ Exception -> 0x0547 }
            r5.<init>(r4, r0, r6)     // Catch:{ Exception -> 0x0547 }
            r2.f331875e = r5     // Catch:{ Exception -> 0x0547 }
            pe3.b r0 = new pe3.b     // Catch:{ Exception -> 0x0547 }
            r0.<init>(r4, r3, r8)     // Catch:{ Exception -> 0x0547 }
            r2.f331876f = r0     // Catch:{ Exception -> 0x0547 }
            byte[] r0 = r2.toByteArray()     // Catch:{ Exception -> 0x0547 }
            int r0 = r0.length     // Catch:{ Exception -> 0x0547 }
            byte[] r2 = r2.toByteArray()     // Catch:{ Exception -> 0x0547 }
            r3 = r22
            int r4 = r3.flags     // Catch:{ Exception -> 0x0547 }
            int r0 = r1.mo152569i(r2, r4, r0)     // Catch:{ Exception -> 0x0547 }
            if (r0 >= 0) goto L_0x0348
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0547 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0547 }
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x0547 }
            r5 = r20
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r5, r2)     // Catch:{ Exception -> 0x0547 }
            return r0
        L_0x0348:
            r8 = 2
            goto L_0x0526
        L_0x034b:
            r18 = r0
            r3 = r9
            r19 = r10
            r5 = r12
            int r0 = r1.f317279w     // Catch:{ Exception -> 0x0547 }
            r6 = 1
            if (r0 == r6) goto L_0x03a8
            com.tencent.mm.plugin.voip.model.h r0 = r1.f317278v     // Catch:{ Exception -> 0x0547 }
            boolean r0 = r0.mo152585c(r4)     // Catch:{ Exception -> 0x0547 }
            if (r0 == 0) goto L_0x03a8
            com.tencent.mm.plugin.voip.model.h r0 = r1.f317278v     // Catch:{ Exception -> 0x0547 }
            int r0 = r0.f317324a     // Catch:{ Exception -> 0x0547 }
            r1.f317281y = r0     // Catch:{ Exception -> 0x0547 }
            r0 = 1
            r1.f317280x = r0     // Catch:{ Exception -> 0x0547 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0547 }
            r0.<init>()     // Catch:{ Exception -> 0x0547 }
            r0.append(r11)     // Catch:{ Exception -> 0x0547 }
            int r2 = r1.f317280x     // Catch:{ Exception -> 0x0547 }
            r0.append(r2)     // Catch:{ Exception -> 0x0547 }
            r0.append(r15)     // Catch:{ Exception -> 0x0547 }
            int r2 = r1.f317281y     // Catch:{ Exception -> 0x0547 }
            r0.append(r2)     // Catch:{ Exception -> 0x0547 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0547 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)     // Catch:{ Exception -> 0x0547 }
            int r11 = r24.mo152563c()     // Catch:{ Exception -> 0x0388 }
            goto L_0x03a7
        L_0x0388:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0547 }
            r0.<init>()     // Catch:{ Exception -> 0x0547 }
            r0.append(r14)     // Catch:{ Exception -> 0x0547 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ Exception -> 0x0547 }
            r0.append(r2)     // Catch:{ Exception -> 0x0547 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0547 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)     // Catch:{ Exception -> 0x0547 }
            r2 = 2005(0x7d5, float:2.81E-42)
            r1.mo152571k(r2)     // Catch:{ Exception -> 0x0547 }
            r11 = -2005(0xfffffffffffff82b, float:NaN)
        L_0x03a7:
            return r11
        L_0x03a8:
            int r0 = r3.flags     // Catch:{ Exception -> 0x0547 }
            if (r0 == 0) goto L_0x03d5
            r6 = 1
            if (r0 == r6) goto L_0x03d5
            r0 = 2009(0x7d9, float:2.815E-42)
            r1.mo152571k(r0)     // Catch:{ Exception -> 0x0547 }
            r0 = -2009(0xfffffffffffff827, float:NaN)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0547 }
            r2.<init>()     // Catch:{ Exception -> 0x0547 }
            java.lang.String r4 = "steve:unknown frame error!!! type:"
            r2.append(r4)     // Catch:{ Exception -> 0x0547 }
            int r4 = r3.flags     // Catch:{ Exception -> 0x0547 }
            r2.append(r4)     // Catch:{ Exception -> 0x0547 }
            r2.append(r13)     // Catch:{ Exception -> 0x0547 }
            int r3 = r3.size     // Catch:{ Exception -> 0x0547 }
            r2.append(r3)     // Catch:{ Exception -> 0x0547 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0547 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)     // Catch:{ Exception -> 0x0547 }
            return r0
        L_0x03d5:
            r6 = 1
            if (r0 != r6) goto L_0x04c3
            byte[] r0 = r1.f317273q     // Catch:{ Exception -> 0x0547 }
            int r6 = r0.length     // Catch:{ Exception -> 0x0547 }
            byte[] r6 = new byte[r6]     // Catch:{ Exception -> 0x0547 }
            int r8 = r3.size     // Catch:{ Exception -> 0x0547 }
            int r9 = r0.length     // Catch:{ Exception -> 0x0547 }
            if (r8 <= r9) goto L_0x03e3
            int r8 = r0.length     // Catch:{ Exception -> 0x0547 }
        L_0x03e3:
            r9 = 0
            java.lang.System.arraycopy(r4, r9, r6, r9, r8)     // Catch:{ Exception -> 0x0547 }
            byte[] r0 = r1.f317273q     // Catch:{ Exception -> 0x0547 }
            boolean r0 = java.util.Arrays.equals(r6, r0)     // Catch:{ Exception -> 0x0547 }
            if (r0 == 0) goto L_0x0405
            byte[] r0 = r1.f317273q     // Catch:{ Exception -> 0x0547 }
            int r0 = r0.length     // Catch:{ Exception -> 0x0547 }
            java.lang.String r2 = "EQU!!!, head_len[%d]"
            r6 = 1
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0547 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0547 }
            r9 = 0
            r8[r9] = r6     // Catch:{ Exception -> 0x0547 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r2, r8)     // Catch:{ Exception -> 0x0547 }
            r2 = 4
            r8 = 2
            goto L_0x04c6
        L_0x0405:
            byte[] r0 = r1.f317274r     // Catch:{ Exception -> 0x0547 }
            r6 = 100
            if (r0 != 0) goto L_0x040f
            byte[] r0 = new byte[r6]     // Catch:{ Exception -> 0x0547 }
            r1.f317274r = r0     // Catch:{ Exception -> 0x0547 }
        L_0x040f:
            int r0 = r3.size     // Catch:{ Exception -> 0x0547 }
            if (r0 <= r6) goto L_0x0414
            goto L_0x0415
        L_0x0414:
            r6 = r0
        L_0x0415:
            byte[] r0 = r1.f317274r     // Catch:{ Exception -> 0x0547 }
            r8 = 0
            java.lang.System.arraycopy(r4, r8, r0, r8, r6)     // Catch:{ Exception -> 0x0547 }
            byte[] r0 = r1.f317274r     // Catch:{ Exception -> 0x0547 }
            java.util.ArrayList r0 = r1.mo152568h(r0, r8)     // Catch:{ Exception -> 0x0547 }
            int r6 = r0.size()     // Catch:{ Exception -> 0x0547 }
            if (r6 != r2) goto L_0x04c3
            java.lang.String r6 = r1.f317259c     // Catch:{ Exception -> 0x0547 }
            java.lang.String r8 = "video/avc"
            boolean r6 = r6.equalsIgnoreCase(r8)     // Catch:{ Exception -> 0x0547 }
            if (r6 == 0) goto L_0x04c3
            r6 = 0
            java.lang.Object r8 = r0.get(r6)     // Catch:{ Exception -> 0x0547 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ Exception -> 0x0547 }
            int r6 = r8.intValue()     // Catch:{ Exception -> 0x0547 }
            r8 = 1
            java.lang.Object r9 = r0.get(r8)     // Catch:{ Exception -> 0x0547 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ Exception -> 0x0547 }
            int r8 = r9.intValue()     // Catch:{ Exception -> 0x0547 }
            r9 = 2
            java.lang.Object r0 = r0.get(r9)     // Catch:{ Exception -> 0x0547 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0547 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0547 }
            int r9 = r8 - r6
            int r10 = r0 - r8
            java.lang.String r11 = "spsStart[%d], ppsStart[%d], frameStart[%d], spsLen[%d], ppsLen[%d]"
            r12 = 5
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0547 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0547 }
            r14 = 0
            r13[r14] = r12     // Catch:{ Exception -> 0x0547 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0547 }
            r14 = 1
            r13[r14] = r12     // Catch:{ Exception -> 0x0547 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0547 }
            r14 = 2
            r13[r14] = r12     // Catch:{ Exception -> 0x0547 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0547 }
            r13[r2] = r12     // Catch:{ Exception -> 0x0547 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0547 }
            r12 = 4
            r13[r12] = r2     // Catch:{ Exception -> 0x0547 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r11, r13)     // Catch:{ Exception -> 0x0547 }
            byte[] r2 = r1.f317273q     // Catch:{ Exception -> 0x0547 }
            int r2 = r2.length     // Catch:{ Exception -> 0x0547 }
            int r11 = r9 + r10
            if (r2 >= r11) goto L_0x048c
            byte[] r2 = new byte[r11]     // Catch:{ Exception -> 0x0547 }
            r1.f317273q = r2     // Catch:{ Exception -> 0x0547 }
        L_0x048c:
            byte[] r2 = r1.f317273q     // Catch:{ Exception -> 0x0547 }
            r11 = 0
            java.lang.System.arraycopy(r4, r6, r2, r11, r9)     // Catch:{ Exception -> 0x0547 }
            byte[] r2 = r1.f317273q     // Catch:{ Exception -> 0x0547 }
            java.lang.System.arraycopy(r4, r10, r2, r9, r10)     // Catch:{ Exception -> 0x0547 }
            te3.af2 r2 = new te3.af2     // Catch:{ Exception -> 0x0547 }
            r2.<init>()     // Catch:{ Exception -> 0x0547 }
            r11 = 4
            r2.f331874d = r11     // Catch:{ Exception -> 0x0547 }
            int r6 = r6 + 4
            int r9 = r9 + -4
            pe3.b r11 = new pe3.b     // Catch:{ Exception -> 0x0547 }
            r11.<init>(r4, r6, r9)     // Catch:{ Exception -> 0x0547 }
            r2.f331875e = r11     // Catch:{ Exception -> 0x0547 }
            int r8 = r8 + 4
            int r10 = r10 + -4
            pe3.b r6 = new pe3.b     // Catch:{ Exception -> 0x0547 }
            r6.<init>(r4, r8, r10)     // Catch:{ Exception -> 0x0547 }
            r2.f331876f = r6     // Catch:{ Exception -> 0x0547 }
            byte[] r6 = r2.toByteArray()     // Catch:{ Exception -> 0x0547 }
            int r6 = r6.length     // Catch:{ Exception -> 0x0547 }
            byte[] r2 = r2.toByteArray()     // Catch:{ Exception -> 0x0547 }
            r8 = 2
            r1.mo152569i(r2, r8, r6)     // Catch:{ Exception -> 0x0547 }
            goto L_0x04c5
        L_0x04c3:
            r8 = 2
            r0 = 0
        L_0x04c5:
            r2 = 4
        L_0x04c6:
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r2)     // Catch:{ Exception -> 0x0547 }
            int r9 = r3.size     // Catch:{ Exception -> 0x0547 }
            int r9 = r9 - r2
            int r9 = r9 - r0
            r6.putInt(r9)     // Catch:{ Exception -> 0x0547 }
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x0547 }
            java.nio.ByteBuffer r2 = r6.order(r2)     // Catch:{ Exception -> 0x0547 }
            byte[] r2 = r2.array()     // Catch:{ Exception -> 0x0547 }
            r6 = 4
            r9 = 0
            java.lang.System.arraycopy(r2, r9, r4, r0, r6)     // Catch:{ Exception -> 0x0547 }
            te3.ze2 r2 = new te3.ze2     // Catch:{ Exception -> 0x0547 }
            r2.<init>()     // Catch:{ Exception -> 0x0547 }
            int r6 = r3.size     // Catch:{ Exception -> 0x0547 }
            int r6 = r6 - r0
            pe3.b r9 = new pe3.b     // Catch:{ Exception -> 0x0547 }
            r9.<init>(r4, r0, r6)     // Catch:{ Exception -> 0x0547 }
            r2.f332381d = r9     // Catch:{ Exception -> 0x0547 }
            r4 = 1
            r2.f332382e = r4     // Catch:{ Exception -> 0x0547 }
            java.util.LinkedList<te3.bf2> r4 = r1.f317276t     // Catch:{ Exception -> 0x0547 }
            r2.f332383f = r4     // Catch:{ Exception -> 0x0547 }
            java.util.LinkedList<java.lang.Integer> r4 = r1.f317277u     // Catch:{ Exception -> 0x0547 }
            int r6 = r3.size     // Catch:{ Exception -> 0x0547 }
            int r6 = r6 - r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0547 }
            r6 = 0
            r4.set(r6, r0)     // Catch:{ Exception -> 0x0547 }
            java.util.LinkedList<java.lang.Integer> r0 = r1.f317277u     // Catch:{ Exception -> 0x0547 }
            r2.f332384g = r0     // Catch:{ Exception -> 0x0547 }
            byte[] r0 = r2.toByteArray()     // Catch:{ Exception -> 0x0547 }
            int r0 = r0.length     // Catch:{ Exception -> 0x0547 }
            byte[] r2 = r2.toByteArray()     // Catch:{ Exception -> 0x0547 }
            int r4 = r3.flags     // Catch:{ Exception -> 0x0547 }
            int r0 = r1.mo152569i(r2, r4, r0)     // Catch:{ Exception -> 0x0547 }
            if (r0 >= 0) goto L_0x0526
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0547 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0547 }
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x0547 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r5, r2)     // Catch:{ Exception -> 0x0547 }
            return r0
        L_0x0526:
            int r4 = r3.flags     // Catch:{ Exception -> 0x0547 }
            int r0 = f317244I     // Catch:{ Exception -> 0x0547 }
            r2 = 1
            int r0 = r0 + r2
            f317244I = r0     // Catch:{ Exception -> 0x0547 }
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f317261e     // Catch:{ Exception -> 0x0547 }
            r10 = r19
            r5 = 0
            r0.mo148216r(r10, r5)     // Catch:{ Exception -> 0x0547 }
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f317261e     // Catch:{ Exception -> 0x0547 }
            int r5 = r1.f317260d     // Catch:{ Exception -> 0x0547 }
            long r5 = (long) r5     // Catch:{ Exception -> 0x0547 }
            int r10 = r0.mo148205g(r3, r5)     // Catch:{ Exception -> 0x0547 }
            r9 = r3
            r0 = r18
            r5 = 2
            r6 = 1
            r8 = 0
            goto L_0x01a9
        L_0x0547:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "DoMediaCodecEnc error:"
            r2.append(r3)
            java.lang.String r3 = r0.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r2, r3)
            r0 = 2004(0x7d4, float:2.808E-42)
            r1.mo152571k(r0)
            r4 = -2004(0xfffffffffffff82c, float:NaN)
            goto L_0x057b
        L_0x056b:
            int r0 = r1.f317282z
            int r2 = r0 + 1
            r1.f317282z = r2
            r2 = 5
            if (r0 <= r2) goto L_0x057b
            r0 = 2006(0x7d6, float:2.811E-42)
            r1.mo152571k(r0)
            r4 = -2006(0xfffffffffffff82a, float:NaN)
        L_0x057b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.model.C106340f.mo152561a(java.nio.ByteBuffer, int, int, int, boolean):int");
    }

    /* renamed from: b */
    public void mo152562b() {
        v2protocal v2protocal;
        C106377r rVar = this.f317275s;
        if (rVar != null && (v2protocal = rVar.f317500x) != null) {
            if (!(rVar == null || v2protocal == null)) {
                int i = f317248M;
                byte[] bArr = this.f317251C.f317298p;
                if (v2protocal.setAppCmd(i, bArr, bArr.length) >= 0) {
                    C106342b bVar = this.f317251C;
                    ByteBuffer wrap = ByteBuffer.wrap(bVar.f317298p);
                    wrap.order(ByteOrder.LITTLE_ENDIAN);
                    bVar.f317283a = wrap.getShort();
                    bVar.f317284b = wrap.get();
                    bVar.f317285c = wrap.get();
                    bVar.f317286d = wrap.get();
                    bVar.f317287e = wrap.get();
                    bVar.f317288f = wrap.get();
                    bVar.f317289g = wrap.get();
                    bVar.f317290h = wrap.get();
                    bVar.f317291i = wrap.get();
                    bVar.f317292j = wrap.get();
                    bVar.f317293k = wrap.get();
                    bVar.f317294l = wrap.get();
                    bVar.f317295m = wrap.get();
                    bVar.f317296n = wrap.getShort();
                    bVar.f317297o = wrap.getShort();
                    C106342b bVar2 = this.f317251C;
                    int i2 = bVar2.f317296n;
                    int i3 = bVar2.f317297o;
                    byte b = bVar2.f317292j;
                    if (1 == (b & 1)) {
                        int i4 = b >> 1;
                        if (8 == i4) {
                            this.f317263g = 8;
                            this.f317259c = "video/avc";
                        } else if (4 == i4) {
                            this.f317263g = 4;
                            this.f317259c = "video/hevc";
                        }
                        if (this.f317263g != this.f317264h) {
                            Log.m105924i("MicroMsg.AvcEncoder", "use hw encoder, ENCODING: " + this.f317259c + ", mCodecType: " + this.f317263g + ", mCodecTypePrev: " + this.f317264h);
                            this.f317251C.mo152574a();
                        }
                        C112593f.f337156a.mo164365c(false);
                    } else {
                        if (this.f317264h != 0) {
                            Log.m105924i("MicroMsg.AvcEncoder", "use soft encoder, ENCODING: " + this.f317259c + ", mCodecType: " + this.f317263g + ", mCodecTypePrev: " + this.f317264h);
                            this.f317251C.mo152574a();
                        }
                        this.f317264h = 0;
                        C112593f.f337156a.mo164365c(true);
                    }
                    if (!v2protocal.f317533T1 && (i2 >= 1280 || i3 >= 1280)) {
                        i2 = (((i2 >> 1) + 8) / 16) * 16;
                        i3 = (((i3 >> 1) + 8) / 16) * 16;
                    }
                    if (!v2protocal.f317534U1 && (i2 >= 1920 || i3 >= 1920)) {
                        Log.m105929w("MicroMsg.AvcEncoder", "error qos param: exp: %dx%d, used: %dx%d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(this.f317254F), Integer.valueOf(this.f317255G));
                        i2 = this.f317254F;
                        i3 = this.f317255G;
                    }
                    this.f317254F = i2;
                    this.f317255G = i3;
                    Size size = this.f317256H;
                    if (size != null) {
                        this.f317254F = size.getWidth();
                        this.f317255G = this.f317256H.getHeight();
                    }
                    if (this.f317250B == 0) {
                        C112593f.f337156a.mo164366d(this.f317254F, this.f317255G);
                    }
                }
            }
            int i5 = this.f317251C.f317283a;
            if (this.f317259c.equalsIgnoreCase("video/avc")) {
                if (!(this.f317279w == 8)) {
                    i5 = (int) (((double) i5) * (((((double) Math.max(Math.min(this.f317275s.f317500x.f317585M0, 30), 0)) * 1.0d) / 100.0d) + 1.0d));
                }
            }
            if (this.f317269m != i5) {
                try {
                    if (this.f317261e != null) {
                        Bundle bundle = new Bundle();
                        int i6 = i5 * 1000;
                        Log.m105926v("MicroMsg.AvcEncoder", "steve: setRates: " + i6);
                        bundle.putInt("video-bitrate", i6);
                        this.f317261e.mo148220w(bundle);
                        C109247e.vx0().f333460t = i5;
                    }
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.AvcEncoder", "steve: setRates failed:" + e);
                }
                Log.m105924i("MicroMsg.AvcEncoder", "steve[QoS]: Update BR! frameID: " + f317244I + ", new_br: " + this.f317269m + ", tuneBR:" + i5 + ", tuneRatio:" + this.f317275s.f317500x.f317585M0);
                this.f317269m = i5;
            }
            if (1 == this.f317251C.f317295m && f317244I > 0) {
                mo152564d();
                Log.m105924i("MicroMsg.AvcEncoder", "steve[QoS]: Force I Frame! frameID: " + f317244I);
            }
            byte b2 = this.f317251C.f317284b;
            if (b2 != this.f317268l) {
                this.f317268l = b2;
            }
            C109247e.vx0().f333461u = (long) this.f317268l;
            this.f317275s.f317502z.mo152495v0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02d4  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo152563c() {
        /*
            r18 = this;
            r1 = r18
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f317261e
            if (r0 == 0) goto L_0x0009
            r18.mo152565e()
        L_0x0009:
            java.lang.String r0 = r1.f317259c
            int r2 = android.media.MediaCodecList.getCodecCount()
            r4 = 0
        L_0x0010:
            java.lang.String r6 = "MicroMsg.AvcEncoder"
            if (r4 >= r2) goto L_0x005f
            android.media.MediaCodecInfo r7 = android.media.MediaCodecList.getCodecInfoAt(r4)
            boolean r8 = r7.isEncoder()
            if (r8 != 0) goto L_0x001f
            goto L_0x005c
        L_0x001f:
            java.lang.String[] r8 = r7.getSupportedTypes()
            r9 = 0
        L_0x0024:
            int r10 = r8.length
            if (r9 >= r10) goto L_0x005c
            r10 = r8[r9]
            boolean r10 = r10.equalsIgnoreCase(r0)
            if (r10 == 0) goto L_0x0059
            java.lang.String r10 = r7.getName()
            java.lang.String[] r11 = f317247L
            int r12 = r11.length
            r13 = 0
        L_0x0037:
            if (r13 >= r12) goto L_0x0059
            r14 = r11[r13]
            boolean r14 = r10.startsWith(r14)
            if (r14 == 0) goto L_0x0056
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "steve : H.264 HW encoder found:"
            r0.append(r2)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x0060
        L_0x0056:
            int r13 = r13 + 1
            goto L_0x0037
        L_0x0059:
            int r9 = r9 + 1
            goto L_0x0024
        L_0x005c:
            int r4 = r4 + 1
            goto L_0x0010
        L_0x005f:
            r7 = 0
        L_0x0060:
            if (r7 != 0) goto L_0x0080
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "steve: Unable to find an appropriate codec for "
            r0.append(r2)
            java.lang.String r2 = r1.f317259c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            r0 = 2001(0x7d1, float:2.804E-42)
            r1.mo152571k(r0)
            r0 = -2001(0xfffffffffffff82f, float:NaN)
            return r0
        L_0x0080:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "licaguo: InitHWEncoder, name: "
            r0.append(r2)
            java.lang.String r2 = r7.getName()
            r0.append(r2)
            java.lang.String r2 = ", width = "
            r0.append(r2)
            int r2 = r1.f317266j
            r0.append(r2)
            java.lang.String r2 = " height = "
            r0.append(r2)
            int r2 = r1.f317267k
            r0.append(r2)
            java.lang.String r2 = ", ENCODING: "
            r0.append(r2)
            java.lang.String r2 = r1.f317259c
            r0.append(r2)
            java.lang.String r2 = ", mCodecType: "
            r0.append(r2)
            int r2 = r1.f317263g
            r0.append(r2)
            java.lang.String r2 = ", mCodecTypePrev: "
            r0.append(r2)
            int r2 = r1.f317264h
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            java.lang.String r0 = r1.f317259c
            int r2 = r1.f317266j
            int r4 = r1.f317267k
            android.media.MediaFormat r0 = android.media.MediaFormat.createVideoFormat(r0, r2, r4)
            r1.f317262f = r0
            r2 = 2130708361(0x7f000789, float:1.701803E38)
            java.lang.String r4 = "color-format"
            r0.setInteger(r4, r2)
            java.lang.String r0 = "InitHWEncoder with surface encode"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            android.media.MediaFormat r0 = r1.f317262f
            int r2 = r1.f317266j
            java.lang.String r4 = "stride"
            r0.setInteger(r4, r2)
            android.media.MediaFormat r0 = r1.f317262f
            int r2 = r1.f317269m
            int r2 = r2 * 1000
            java.lang.String r4 = "bitrate"
            r0.setInteger(r4, r2)
            android.media.MediaFormat r0 = r1.f317262f
            int r2 = r1.f317268l
            java.lang.String r4 = "frame-rate"
            r0.setInteger(r4, r2)
            android.media.MediaFormat r0 = r1.f317262f
            java.lang.String r2 = "i-frame-interval"
            r4 = 4
            r0.setInteger(r2, r4)
            android.media.MediaFormat r0 = r1.f317262f
            java.lang.String r2 = "mime"
            java.lang.String r2 = r0.getString(r2)
            r8 = 1
            r1.f317279w = r8
            java.lang.String r0 = r1.f317259c
            java.lang.String r9 = "video/avc"
            boolean r0 = r0.equalsIgnoreCase(r9)
            r11 = 8
            if (r0 == 0) goto L_0x02d7
            java.lang.String r0 = r7.getName()
            java.lang.String[] r12 = f317247L
            int r13 = r12.length
            r14 = 0
        L_0x0128:
            if (r14 >= r13) goto L_0x014b
            r15 = r12[r14]
            boolean r15 = r0.startsWith(r15)
            if (r15 == 0) goto L_0x0148
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "steve : known H.264 HW encoder :"
            r12.append(r13)
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
            r0 = 1
            goto L_0x014c
        L_0x0148:
            int r14 = r14 + 1
            goto L_0x0128
        L_0x014b:
            r0 = 0
        L_0x014c:
            if (r0 == 0) goto L_0x02d7
            r0 = 23
            boolean r12 = p206nj.C11171e.m11046c(r0)
            if (r12 == 0) goto L_0x02d7
            int r12 = r1.f317270n
            if (r12 <= 0) goto L_0x0160
            r13 = r12 & 1
            if (r13 == 0) goto L_0x0160
            r13 = 1
            goto L_0x0161
        L_0x0160:
            r13 = 0
        L_0x0161:
            if (r12 <= 0) goto L_0x0168
            r12 = r12 & r4
            if (r12 == 0) goto L_0x0168
            r12 = 1
            goto L_0x0169
        L_0x0168:
            r12 = 0
        L_0x0169:
            int r14 = r1.f317280x
            if (r11 > r14) goto L_0x01d7
            java.lang.String r14 = r7.getName()
            java.lang.String[] r15 = f317247L
            int r4 = r15.length
            r5 = 0
            r16 = 0
        L_0x0177:
            if (r5 >= r4) goto L_0x01d9
            r10 = r15[r5]
            boolean r10 = r14.startsWith(r10)
            if (r10 == 0) goto L_0x01cf
            android.media.MediaCodecInfo$CodecCapabilities r10 = r7.getCapabilitiesForType(r2)     // Catch:{ Exception -> 0x01cf }
            android.media.MediaCodecInfo$CodecProfileLevel[] r10 = r10.profileLevels     // Catch:{ Exception -> 0x01cf }
            int r3 = r10.length     // Catch:{ Exception -> 0x01cf }
            r0 = 0
        L_0x0189:
            if (r0 >= r3) goto L_0x01cf
            r8 = r10[r0]     // Catch:{ Exception -> 0x01cf }
            int r11 = r8.profile     // Catch:{ Exception -> 0x01cf }
            r17 = r3
            r3 = 8
            if (r11 != r3) goto L_0x0197
            r16 = 1
        L_0x0197:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01cf }
            r3.<init>()     // Catch:{ Exception -> 0x01cf }
            java.lang.String r11 = "steve : ["
            r3.append(r11)     // Catch:{ Exception -> 0x01cf }
            r3.append(r14)     // Catch:{ Exception -> 0x01cf }
            java.lang.String r11 = "] supported profiles:"
            r3.append(r11)     // Catch:{ Exception -> 0x01cf }
            int r8 = r8.profile     // Catch:{ Exception -> 0x01cf }
            r3.append(r8)     // Catch:{ Exception -> 0x01cf }
            java.lang.String r8 = ", maxAllowedProfile: "
            r3.append(r8)     // Catch:{ Exception -> 0x01cf }
            int r8 = r1.f317280x     // Catch:{ Exception -> 0x01cf }
            r3.append(r8)     // Catch:{ Exception -> 0x01cf }
            java.lang.String r8 = ", MIME:"
            r3.append(r8)     // Catch:{ Exception -> 0x01cf }
            r3.append(r2)     // Catch:{ Exception -> 0x01cf }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01cf }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)     // Catch:{ Exception -> 0x01cf }
            int r0 = r0 + 1
            r3 = r17
            r8 = 1
            r11 = 8
            goto L_0x0189
        L_0x01cf:
            int r5 = r5 + 1
            r0 = 23
            r8 = 1
            r11 = 8
            goto L_0x0177
        L_0x01d7:
            r16 = 0
        L_0x01d9:
            r0 = 256(0x100, float:3.59E-43)
            java.lang.String r3 = "level"
            java.lang.String r4 = "profile"
            if (r12 == 0) goto L_0x01f0
            if (r16 == 0) goto L_0x01f0
            android.media.MediaFormat r5 = r1.f317262f
            r7 = 8
            r5.setInteger(r4, r7)
            android.media.MediaFormat r5 = r1.f317262f
            r5.setInteger(r3, r0)
            goto L_0x01fd
        L_0x01f0:
            if (r13 == 0) goto L_0x0200
            android.media.MediaFormat r5 = r1.f317262f
            r7 = 1
            r5.setInteger(r4, r7)
            android.media.MediaFormat r5 = r1.f317262f
            r5.setInteger(r3, r0)
        L_0x01fd:
            r0 = 1
            goto L_0x02c9
        L_0x0200:
            int r5 = r1.f317280x
            r8 = 23
            boolean r8 = p206nj.C11171e.m11046c(r8)
            if (r8 == 0) goto L_0x02c8
            android.media.MediaCodecInfo$CodecCapabilities r7 = r7.getCapabilitiesForType(r2)     // Catch:{ Exception -> 0x02af }
            if (r7 == 0) goto L_0x02c8
            android.media.MediaCodecInfo$CodecProfileLevel[] r7 = r7.profileLevels     // Catch:{ Exception -> 0x02af }
            if (r7 == 0) goto L_0x02c8
            android.media.MediaCodecInfo$CodecProfileLevel r8 = new android.media.MediaCodecInfo$CodecProfileLevel     // Catch:{ Exception -> 0x02af }
            r8.<init>()     // Catch:{ Exception -> 0x02af }
            r10 = 0
            r8.level = r10     // Catch:{ Exception -> 0x02af }
            r8.profile = r10     // Catch:{ Exception -> 0x02af }
            int r10 = r7.length     // Catch:{ Exception -> 0x02af }
            r11 = 0
        L_0x0220:
            if (r11 >= r10) goto L_0x0279
            r12 = r7[r11]     // Catch:{ Exception -> 0x02af }
            int r13 = r12.profile     // Catch:{ Exception -> 0x02af }
            int r12 = r12.level     // Catch:{ Exception -> 0x02af }
            r14 = 1
            if (r13 == r14) goto L_0x0234
            r14 = 2
            if (r13 == r14) goto L_0x0234
            r14 = 8
            if (r13 == r14) goto L_0x0234
            r14 = 0
            goto L_0x0235
        L_0x0234:
            r14 = 1
        L_0x0235:
            if (r14 == 0) goto L_0x0247
            int r14 = r8.profile     // Catch:{ Exception -> 0x02af }
            if (r13 < r14) goto L_0x0245
            int r14 = r8.level     // Catch:{ Exception -> 0x02af }
            if (r12 < r14) goto L_0x0245
            if (r13 > r5) goto L_0x0245
            r8.profile = r13     // Catch:{ Exception -> 0x02af }
            r8.level = r12     // Catch:{ Exception -> 0x02af }
        L_0x0245:
            r14 = 1
            goto L_0x0248
        L_0x0247:
            r14 = 0
        L_0x0248:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02af }
            r15.<init>()     // Catch:{ Exception -> 0x02af }
            java.lang.String r0 = "steve : profile: "
            r15.append(r0)     // Catch:{ Exception -> 0x02af }
            r15.append(r13)     // Catch:{ Exception -> 0x02af }
            java.lang.String r0 = ", level: "
            r15.append(r0)     // Catch:{ Exception -> 0x02af }
            r15.append(r12)     // Catch:{ Exception -> 0x02af }
            java.lang.String r0 = ", maxProfile: "
            r15.append(r0)     // Catch:{ Exception -> 0x02af }
            r15.append(r5)     // Catch:{ Exception -> 0x02af }
            java.lang.String r0 = ", isRecognized:"
            r15.append(r0)     // Catch:{ Exception -> 0x02af }
            r15.append(r14)     // Catch:{ Exception -> 0x02af }
            java.lang.String r0 = r15.toString()     // Catch:{ Exception -> 0x02af }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ Exception -> 0x02af }
            int r11 = r11 + 1
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x0220
        L_0x0279:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02af }
            r0.<init>()     // Catch:{ Exception -> 0x02af }
            java.lang.String r5 = "best profile: "
            r0.append(r5)     // Catch:{ Exception -> 0x02af }
            int r5 = r8.profile     // Catch:{ Exception -> 0x02af }
            r0.append(r5)     // Catch:{ Exception -> 0x02af }
            java.lang.String r5 = ", best level: "
            r0.append(r5)     // Catch:{ Exception -> 0x02af }
            int r5 = r8.level     // Catch:{ Exception -> 0x02af }
            r0.append(r5)     // Catch:{ Exception -> 0x02af }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02af }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ Exception -> 0x02af }
            int r0 = r8.profile     // Catch:{ Exception -> 0x02af }
            if (r0 <= 0) goto L_0x02c8
            int r5 = r8.level     // Catch:{ Exception -> 0x02af }
            r7 = 256(0x100, float:3.59E-43)
            if (r5 < r7) goto L_0x02c8
            android.media.MediaFormat r5 = r1.f317262f     // Catch:{ Exception -> 0x02af }
            r5.setInteger(r4, r0)     // Catch:{ Exception -> 0x02af }
            android.media.MediaFormat r0 = r1.f317262f     // Catch:{ Exception -> 0x02af }
            r0.setInteger(r3, r7)     // Catch:{ Exception -> 0x02af }
            goto L_0x01fd
        L_0x02af:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "trySetProfile error: "
            r3.append(r5)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x02c8:
            r0 = 0
        L_0x02c9:
            if (r0 == 0) goto L_0x02d4
            android.media.MediaFormat r0 = r1.f317262f
            int r0 = r0.getInteger(r4)
            r1.f317279w = r0
            goto L_0x02d7
        L_0x02d4:
            r3 = 1
            r1.f317279w = r3
        L_0x02d7:
            android.media.MediaFormat r0 = r1.f317262f
            java.lang.String r3 = "bitrate-mode"
            r4 = 2
            r0.setInteger(r3, r4)
            r3 = 0
            com.tencent.mm.compatible.deviceinfo.a r0 = com.tencent.p014mm.compatible.deviceinfo.C104619a.m140212d(r2, r3)     // Catch:{ Exception -> 0x0389 }
            r1.f317261e = r0     // Catch:{ Exception -> 0x0389 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "steve: mediaFormat: "
            r0.append(r2)
            android.media.MediaFormat r2 = r1.f317262f
            r0.append(r2)
            java.lang.String r2 = ", actProfile: "
            r0.append(r2)
            int r2 = r1.f317279w
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f317261e
            android.media.MediaFormat r2 = r1.f317262f
            r3 = 0
            r4 = 1
            r0.mo148202a(r2, r3, r3, r4)
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f317261e
            android.view.Surface r0 = r0.mo148203e()
            r1.f317252D = r0
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f317261e
            r0.mo148222y()
            z33.f r0 = z33.C112593f.f337156a
            z33.C112593f.f337160e = r4
            com.tencent.mm.plugin.voip.model.f$a r0 = r1.f317253E
            if (r0 == 0) goto L_0x032e
            android.view.Surface r2 = r1.f317252D
            int r3 = r1.f317266j
            int r4 = r1.f317267k
            r0.mo152572a(r2, r3, r4)
            goto L_0x0333
        L_0x032e:
            java.lang.String r0 = "listener is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
        L_0x0333:
            com.tencent.mm.plugin.voip.model.h r0 = new com.tencent.mm.plugin.voip.model.h
            r0.<init>()
            r1.f317278v = r0
            java.lang.String r0 = r1.f317259c
            boolean r0 = r0.equalsIgnoreCase(r9)
            if (r0 == 0) goto L_0x0349
            r2 = 8
            r1.f317264h = r2
            r1.f317263g = r2
            goto L_0x0370
        L_0x0349:
            java.lang.String r0 = r1.f317259c
            java.lang.String r2 = "video/hevc"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x035a
            r2 = 4
            r1.f317264h = r2
            r1.f317263g = r2
            goto L_0x0370
        L_0x035a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "can not recognize ENCODING: "
            r0.append(r2)
            java.lang.String r2 = r1.f317259c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x0370:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "InitHWEncoder ok, mCodecType: "
            r0.append(r2)
            int r2 = r1.f317263g
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            r0 = 2000(0x7d0, float:2.803E-42)
            return r0
        L_0x0389:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "InitHWEncoder error:"
            r2.append(r3)
            java.lang.String r3 = r0.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r2, r3)
            r0 = 2002(0x7d2, float:2.805E-42)
            r1.mo152571k(r0)
            r0 = -2002(0xfffffffffffff82e, float:NaN)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.model.C106340f.mo152563c():int");
    }

    /* renamed from: d */
    public void mo152564d() {
        if (this.f317261e != null) {
            Log.m105926v("MicroMsg.AvcEncoder", "steve: Sync frame request soon!");
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            try {
                this.f317261e.mo148220w(bundle);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.AvcEncoder", "make I failed, just ignored, exception: " + e);
            }
        }
    }

    /* renamed from: e */
    public final void mo152565e() {
        try {
            C112593f fVar = C112593f.f337156a;
            C112593f.f337160e = false;
            if (this.f317261e != null) {
                Log.m105924i("MicroMsg.AvcEncoder", "licaguo, now we call StopEncoder");
                this.f317261e.mo148221x();
                C106341a aVar = this.f317253E;
                if (aVar != null) {
                    aVar.mo152573b(this.f317252D);
                }
                this.f317261e.mo148223z();
                this.f317261e.mo148214p();
            }
            this.f317261e = null;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AvcEncoder", e, "StopEncoder error:" + e.toString(), new Object[0]);
        }
    }

    /* renamed from: f */
    public void mo152566f() {
        try {
            mo152565e();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.AvcEncoder", " error:" + e.toString());
        }
    }

    /* renamed from: g */
    public String mo152567g(byte[] bArr) {
        String str = "";
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & ExifInterface.MARKER);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            str = str + hexString;
        }
        return str;
    }

    /* renamed from: h */
    public ArrayList<Integer> mo152568h(byte[] bArr, int i) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        String g = mo152567g(bArr);
        String g2 = mo152567g(new byte[]{0, 0, 0, 1});
        Log.m105918d("MicroMsg.AvcEncoder", "parent: " + g + ", child:" + g2);
        while (true) {
            int indexOf = g.indexOf(g2, i);
            if (indexOf == -1) {
                return arrayList;
            }
            Log.m105918d("MicroMsg.AvcEncoder", "vps/sps/pps start: " + i + ", nextStartIdx:" + indexOf);
            i = g2.length() + indexOf;
            arrayList.add(Integer.valueOf(indexOf / 2));
        }
    }

    /* renamed from: i */
    public int mo152569i(byte[] bArr, int i, int i2) {
        if (bArr == null || this.f317275s.f317500x == null) {
            return 0;
        }
        int i3 = f317245J;
        if (this.f317259c.equalsIgnoreCase("video/hevc")) {
            i3 = f317246K;
        }
        byte[] bArr2 = bArr;
        int i4 = i2;
        int videoEncodeToSend = this.f317275s.f317500x.videoEncodeToSend(bArr2, i4, this.f317266j, i, i3);
        if (videoEncodeToSend >= 0) {
            this.f317249A = 0;
            return videoEncodeToSend;
        }
        mo152564d();
        Log.m105920e("MicroMsg.AvcEncoder", "licaguo: type = " + i + ", length = " + i2 + ", ret = " + videoEncodeToSend);
        int i5 = this.f317249A;
        this.f317249A = i5 + 1;
        if (i5 <= 5) {
            return 0;
        }
        mo152571k(2008);
        Log.m105920e("MicroMsg.AvcEncoder", "steve: hw send error for 5 times!! send ret = -2008");
        return -2008;
    }

    /* renamed from: j */
    public void mo152570j(C106377r rVar) {
        this.f317275s = rVar;
    }

    /* renamed from: k */
    public final void mo152571k(int i) {
        if (this.f317259c.equalsIgnoreCase("video/hevc")) {
            this.f317258b = i;
        } else {
            this.f317257a = i;
        }
        Log.m105921e("MicroMsg.AvcEncoder", "ENCODING: " + this.f317259c + ", encoder error, ErrCode: ", Integer.valueOf(i));
    }
}
