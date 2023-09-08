package com.tencent.p014mm.plugin.multitalk.model;

import a70.C112760b;
import android.media.MediaFormat;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.plugin.voip.model.C106349h;
import com.tencent.p014mm.sdk.platformtools.Log;
import ds3.C107064d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedList;
import nw3.C109779e;
import te3.C110957bf2;

/* renamed from: com.tencent.mm.plugin.multitalk.model.n */
public class C105820n {

    /* renamed from: A */
    public static int f314689A = 19;

    /* renamed from: B */
    public static final String[] f314690B = {MediaCodecUtils.QCOM_PREFIX, MediaCodecUtils.EXYNOS_PREFIX, "OMX.hisi", "OMX.MTK", "OMX.sprd", "c2.exynos", "c2.qti", "c2.mtk", "c2.unisoc"};

    /* renamed from: C */
    public static int f314691C = 39;

    /* renamed from: D */
    public static int f314692D = 53;

    /* renamed from: y */
    public static int f314693y;

    /* renamed from: z */
    public static int f314694z = 18;

    /* renamed from: a */
    public int f314695a = 0;

    /* renamed from: b */
    public String f314696b = "video/avc";

    /* renamed from: c */
    public C104619a f314697c;

    /* renamed from: d */
    public MediaFormat f314698d;

    /* renamed from: e */
    public int f314699e;

    /* renamed from: f */
    public int f314700f;

    /* renamed from: g */
    public int f314701g;

    /* renamed from: h */
    public int f314702h;

    /* renamed from: i */
    public int f314703i = 1;

    /* renamed from: j */
    public int f314704j;

    /* renamed from: k */
    public int f314705k;

    /* renamed from: l */
    public byte[] f314706l = null;

    /* renamed from: m */
    public long f314707m = 0;

    /* renamed from: n */
    public long f314708n = 0;

    /* renamed from: o */
    public LinkedList<C110957bf2> f314709o = new LinkedList<>();

    /* renamed from: p */
    public LinkedList<Integer> f314710p = new LinkedList<>();

    /* renamed from: q */
    public C106349h f314711q = null;

    /* renamed from: r */
    public int f314712r = 0;

    /* renamed from: s */
    public int f314713s = 8;

    /* renamed from: t */
    public int f314714t = 0;

    /* renamed from: u */
    public int f314715u = 0;

    /* renamed from: v */
    public int f314716v = 0;

    /* renamed from: w */
    public C105821a f314717w;

    /* renamed from: x */
    public int f314718x = 0;

    /* renamed from: com.tencent.mm.plugin.multitalk.model.n$a */
    public class C105821a {

        /* renamed from: a */
        public short f314719a;

        /* renamed from: b */
        public byte f314720b;

        /* renamed from: c */
        public byte f314721c;

        /* renamed from: d */
        public byte f314722d;

        /* renamed from: e */
        public byte f314723e;

        /* renamed from: f */
        public byte f314724f;

        /* renamed from: g */
        public byte f314725g;

        /* renamed from: h */
        public byte f314726h;

        /* renamed from: i */
        public byte f314727i;

        /* renamed from: j */
        public byte f314728j;

        /* renamed from: k */
        public byte f314729k;

        /* renamed from: l */
        public byte f314730l;

        /* renamed from: m */
        public byte f314731m;

        /* renamed from: n */
        public byte[] f314732n = new byte[18];

        public C105821a(C105820n nVar) {
        }
    }

    static {
        C112760b.m154195C();
    }

    public C105820n(int i, int i2, int i3, int i4, int i5, String str) {
        Log.m105925i("MultiAvcEncoder[HWEnc]", "anlingao[multi_hw] MultiAvcEncoder width[%d], height[%d], framerate[%d], bitrate[%d], profileCfg[%d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), str);
        this.f314699e = i;
        this.f314700f = i2;
        this.f314704j = i;
        this.f314705k = i2;
        this.f314696b = str;
        this.f314701g = i3;
        this.f314702h = i4;
        this.f314703i = i5;
        f314693y = 0;
        this.f314707m = 0;
        this.f314717w = new C105821a(this);
        this.f314697c = null;
        this.f314713s = 8;
        this.f314712r = 0;
        this.f314714t = 0;
        this.f314695a = 0;
        C110957bf2 bf22 = new C110957bf2();
        bf22.f331889d = 1;
        bf22.f331890e = 24;
        bf22.f331891f = 1;
        bf22.f331892g = 24;
        bf22.f331893h = 0;
        bf22.f331894i = 0;
        this.f314709o.add(bf22);
        this.f314710p.add(0);
        this.f314706l = null;
        this.f314715u = 0;
        this.f314716v = 0;
        this.f314708n = 0;
        try {
            mo150798d();
        } catch (Exception e) {
            Log.m105920e("MultiAvcEncoder[HWEnc]", "mediacodec init error: " + e.getMessage());
            this.f314695a = 2003;
        }
    }

    /* renamed from: a */
    public int mo150795a(int i, boolean z, boolean z2, boolean z3) {
        if (i < 0) {
            Log.m105920e("MultiAvcEncoder[HWEnc]", "Error targetCodec: " + i);
            return -1;
        }
        Log.m105924i("MultiAvcEncoder[HWEnc]", "closecodec: targetCodec: " + i + "localClose: " + z + "remoteClose: " + z2 + "isEncoderTag: " + z3);
        ByteBuffer allocate = ByteBuffer.allocate(6);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort(2);
        allocate.putShort((short) i);
        allocate.putShort(0);
        ((C109779e) C105851w0.xx0().f314798d).mo161038i(f314691C, allocate.array(), 6);
        return 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v44, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v26, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r16v0 */
    /* JADX WARNING: type inference failed for: r25v8, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r16v15 */
    /* JADX WARNING: type inference failed for: r12v25 */
    /* JADX WARNING: type inference failed for: r16v28 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x05b5 A[Catch:{ Exception -> 0x0719 }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x056b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x02bc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x032b  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo150796b(byte[] r33, int r34, int r35, int r36) {
        /*
            r32 = this;
            r1 = r32
            r0 = r33
            r11 = r34
            r12 = r35
            java.lang.String r13 = "anlingao[multi_hw] outputBufferIndex: "
            java.lang.String r14 = ", time:"
            java.lang.String r15 = ", idx:"
            int r2 = r1.f314702h
            r1.mo150799e(r2)
            r10 = 6
            java.lang.Object[] r2 = new java.lang.Object[r10]
            int r3 = r1.f314704j
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9 = 0
            r2[r9] = r3
            int r3 = r1.f314705k
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8 = 1
            r2[r8] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r34)
            r7 = 2
            r2[r7] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r35)
            r6 = 3
            r2[r6] = r3
            int r3 = r1.f314699e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 4
            r2[r5] = r3
            int r3 = r1.f314700f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 5
            r2[r4] = r3
            java.lang.String r3 = "MultiAvcEncoder[HWEnc]"
            java.lang.String r4 = "anlingao[multi_hw] m_CapW[%d], m_CapH[%d], w[%d], h[%d], m_width[%d], m_height[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r2)
            int r2 = r1.f314704j
            if (r11 != r2) goto L_0x0057
            int r2 = r1.f314705k
            if (r12 == r2) goto L_0x0064
        L_0x0057:
            r1.f314704j = r11
            r1.f314705k = r12
            int r2 = r11 * r12
            int r2 = r2 * 3
            int r2 = r2 / r7
            byte[] r2 = new byte[r2]
            r1.f314706l = r2
        L_0x0064:
            byte[] r2 = r1.f314706l
            if (r2 != 0) goto L_0x0075
            int r2 = r1.f314704j
            int r5 = r1.f314705k
            int r2 = r2 * r5
            int r2 = r2 * 3
            int r2 = r2 / r7
            byte[] r2 = new byte[r2]
            r1.f314706l = r2
        L_0x0075:
            java.lang.Object[] r2 = new java.lang.Object[r10]
            int r5 = r1.f314704j
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2[r9] = r5
            int r5 = r1.f314705k
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2[r8] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r34)
            r2[r7] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r35)
            r2[r6] = r5
            int r5 = r1.f314699e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r17 = 4
            r2[r17] = r5
            int r5 = r1.f314700f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r16 = 5
            r2[r16] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "steve: m_framerate: "
            r2.append(r5)
            int r5 = r1.f314701g
            r2.append(r5)
            java.lang.String r5 = ", m_br_kbps:"
            r2.append(r5)
            int r5 = r1.f314702h
            r2.append(r5)
            java.lang.String r5 = ", format:"
            r2.append(r5)
            r5 = r36
            r2.append(r5)
            java.lang.String r10 = ", cSkipFlag:"
            r2.append(r10)
            com.tencent.mm.plugin.multitalk.model.n$a r10 = r1.f314717w
            byte r10 = r10.f314730l
            r2.append(r10)
            java.lang.String r10 = ", m_width:"
            r2.append(r10)
            int r10 = r1.f314699e
            r2.append(r10)
            java.lang.String r10 = ", m_height:"
            r2.append(r10)
            int r10 = r1.f314700f
            r2.append(r10)
            java.lang.String r10 = ", w:"
            r2.append(r10)
            r2.append(r11)
            java.lang.String r10 = ", h:"
            r2.append(r10)
            r2.append(r12)
            java.lang.String r10 = ", rawFrame:"
            r2.append(r10)
            r2.append(r0)
            java.lang.String r10 = ", yuv420sp:"
            r2.append(r10)
            byte[] r10 = r1.f314706l
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            com.tencent.mm.plugin.multitalk.model.n$a r2 = r1.f314717w
            byte r2 = r2.f314730l
            java.lang.String r10 = " error:"
            if (r2 != 0) goto L_0x0332
            byte[] r2 = r1.f314706l
            if (r2 == 0) goto L_0x0332
            int r2 = r1.f314704j
            int r7 = r1.f314705k
            com.tencent.mm.plugin.multitalk.model.w r8 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.xx0()
            ds3.d r8 = r8.f314798d
            int r9 = r1.f314704j
            int r6 = r1.f314705k
            r23 = r7
            byte[] r7 = r1.f314706l
            nw3.e r8 = (nw3.C109779e) r8
            r8.getClass()
            nw3.f r8 = nw3.C109770a.m149092a()
            r24 = r2
            boolean r2 = r8.f328591n
            java.lang.String r11 = "TalkRoomService"
            if (r2 == 0) goto L_0x022f
            nw3.b r2 = r8.f328564K
            if (r2 == 0) goto L_0x022f
            r22 = r3
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x020a }
            java.lang.String r25 = "sendScreen "
            r21 = 0
            r3[r21] = r25     // Catch:{ Exception -> 0x020a }
            java.lang.Integer r25 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x020a }
            r20 = 1
            r3[r20] = r25     // Catch:{ Exception -> 0x020a }
            java.lang.Integer r25 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x020a }
            r19 = 2
            r3[r19] = r25     // Catch:{ Exception -> 0x020a }
            bs3.C104161b.m138993b(r11, r3)     // Catch:{ Exception -> 0x020a }
            nw3.b r3 = r8.f328564K     // Catch:{ Exception -> 0x020a }
            if (r0 == 0) goto L_0x01c7
            com.tencent.mm.plugin.multi.talk r2 = r3.f328532a     // Catch:{ Exception -> 0x01b1 }
            if (r2 != 0) goto L_0x0185
            r29 = r8
            r19 = r9
            r30 = r10
            r16 = r14
            r12 = r22
            r25 = r23
            r26 = r24
            r14 = 4
            r24 = r6
            r22 = r13
            r13 = r4
            goto L_0x01de
        L_0x0185:
            r26 = r24
            r24 = 3
            r12 = r22
            r3 = r33
            r22 = r13
            r16 = r14
            r14 = 5
            r13 = r4
            r4 = r9
            r14 = 4
            r5 = r6
            r24 = r6
            r6 = r36
            r25 = r23
            r29 = r8
            r8 = r26
            r19 = r9
            r9 = r25
            r30 = r10
            r10 = r36
            r2.screenTrans(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0204 }
            r3 = 3
            r4 = 1
            r5 = 0
        L_0x01ae:
            r6 = 2
            goto L_0x0247
        L_0x01b1:
            r0 = move-exception
            r29 = r8
            r19 = r9
            r30 = r10
            r16 = r14
            r12 = r22
            r25 = r23
            r26 = r24
            r14 = 4
            r24 = r6
            r22 = r13
            r13 = r4
            goto L_0x0205
        L_0x01c7:
            r29 = r8
            r19 = r9
            r30 = r10
            r16 = r14
            r12 = r22
            r25 = r23
            r26 = r24
            r14 = 4
            r24 = r6
            r22 = r13
            r13 = r4
            r3.getClass()     // Catch:{ Exception -> 0x0204 }
        L_0x01de:
            java.lang.Object[] r2 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0204 }
            java.lang.String r4 = "steve:screenTrans null, buf:"
            r5 = 0
            r2[r5] = r4     // Catch:{ Exception -> 0x0200 }
            r4 = 1
            r2[r4] = r0     // Catch:{ Exception -> 0x01fd }
            java.lang.String r0 = ", engine:"
            r6 = 2
            r2[r6] = r0     // Catch:{ Exception -> 0x01fa }
            com.tencent.mm.plugin.multi.talk r0 = r3.f328532a     // Catch:{ Exception -> 0x01fa }
            r3 = 3
            r2[r3] = r0     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r0 = "simon:TalkRoomContext"
            bs3.C104161b.m138997f(r0, r2)     // Catch:{ Exception -> 0x01f8 }
            goto L_0x0247
        L_0x01f8:
            r0 = move-exception
            goto L_0x0223
        L_0x01fa:
            r0 = move-exception
            r3 = 3
            goto L_0x0223
        L_0x01fd:
            r0 = move-exception
            r3 = 3
            goto L_0x0208
        L_0x0200:
            r0 = move-exception
            r3 = 3
            r4 = 1
            goto L_0x0208
        L_0x0204:
            r0 = move-exception
        L_0x0205:
            r3 = 3
            r4 = 1
            r5 = 0
        L_0x0208:
            r6 = 2
            goto L_0x0223
        L_0x020a:
            r0 = move-exception
            r29 = r8
            r19 = r9
            r30 = r10
            r16 = r14
            r12 = r22
            r25 = r23
            r26 = r24
            r3 = 3
            r5 = 0
            r14 = 4
            r24 = r6
            r22 = r13
            r6 = 2
            r13 = r4
            r4 = 1
        L_0x0223:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r7 = "videoTrans error: "
            r2[r5] = r7
            r2[r4] = r0
            bs3.C104161b.m138997f(r11, r2)
            goto L_0x0247
        L_0x022f:
            r12 = r3
            r29 = r8
            r19 = r9
            r30 = r10
            r22 = r13
            r16 = r14
            r25 = r23
            r26 = r24
            r3 = 3
            r5 = 0
            r14 = 4
            r13 = r4
            r24 = r6
            r4 = 1
            goto L_0x01ae
        L_0x0247:
            r0 = 7
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "screenTrans finished, "
            r0[r5] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            r0[r4] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r24)
            r0[r6] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r36)
            r0[r3] = r2
            r2 = r29
            boolean r7 = r2.f328591n
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r0[r14] = r7
            java.lang.String r7 = " engine: "
            r8 = 5
            r0[r8] = r7
            nw3.b r2 = r2.f328564K
            r7 = 6
            r0[r7] = r2
            bs3.C104161b.m138993b(r11, r0)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            int r2 = r1.f314704j
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r5] = r2
            int r2 = r1.f314705k
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r4] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r34)
            r0[r6] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r35)
            r0[r3] = r2
            int r2 = r1.f314699e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r14] = r2
            int r2 = r1.f314700f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7 = 5
            r0[r7] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r0)
            byte[] r2 = r1.f314706l
            int r0 = r1.f314699e
            int r7 = r1.f314700f
            int r8 = r0 * r7
            int r8 = r8 * 3
            int r8 = r8 >> r4
            r1.f314718x = r8
            r8 = r26
            r9 = r25
            if (r0 != r8) goto L_0x02c3
            if (r7 == r9) goto L_0x02bf
            goto L_0x02c3
        L_0x02bf:
            r7 = r30
            r9 = 0
            goto L_0x032d
        L_0x02c3:
            r1.f314699e = r8
            r1.f314700f = r9
            int r0 = r8 * r9
            int r0 = r0 * 3
            int r0 = r0 >> r4
            r1.f314718x = r0
            int r0 = r32.mo150798d()     // Catch:{ Exception -> 0x02d4 }
        L_0x02d2:
            r9 = r0
            goto L_0x02f6
        L_0x02d4:
            r0 = move-exception
            r7 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "mediacodec init error: "
            r0.append(r8)
            java.lang.String r7 = r7.getMessage()
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            r0 = 2003(0x7d3, float:2.807E-42)
            r1.f314695a = r0
            int r0 = r1.f314695a
            int r0 = -r0
            goto L_0x02d2
        L_0x02f6:
            if (r9 >= 0) goto L_0x032b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "mediacodec init failed, stop HW encoding! ret: "
            r0.append(r2)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            r32.mo150800f()     // Catch:{ Exception -> 0x0310 }
            goto L_0x032a
        L_0x0310:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r7 = r30
            r0.append(r7)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
        L_0x032a:
            return r9
        L_0x032b:
            r7 = r30
        L_0x032d:
            int r0 = f314693y
            r8 = 100
            goto L_0x033f
        L_0x0332:
            r12 = r3
            r7 = r10
            r22 = r13
            r16 = r14
            r3 = 3
            r4 = 1
            r5 = 0
            r6 = 2
            r14 = 4
            r2 = 0
            r9 = 0
        L_0x033f:
            if (r2 == 0) goto L_0x073b
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f314697c
            if (r0 == 0) goto L_0x073b
            r1.f314715u = r5     // Catch:{ Exception -> 0x071b }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x071b }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x071b }
            r0.<init>()     // Catch:{ Exception -> 0x071b }
            java.lang.String r8 = "steve: put YUV into encoder, size:"
            r0.append(r8)     // Catch:{ Exception -> 0x071b }
            int r8 = r1.f314718x     // Catch:{ Exception -> 0x071b }
            r0.append(r8)     // Catch:{ Exception -> 0x071b }
            r0.append(r15)     // Catch:{ Exception -> 0x071b }
            int r8 = f314693y     // Catch:{ Exception -> 0x071b }
            r0.append(r8)     // Catch:{ Exception -> 0x071b }
            r8 = r16
            r0.append(r8)     // Catch:{ Exception -> 0x071b }
            r0.append(r10)     // Catch:{ Exception -> 0x071b }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x071b }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r0)     // Catch:{ Exception -> 0x071b }
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f314697c     // Catch:{ Exception -> 0x071b }
            java.nio.ByteBuffer[] r0 = r0.mo148208j()     // Catch:{ Exception -> 0x071b }
            com.tencent.mm.compatible.deviceinfo.a r10 = r1.f314697c     // Catch:{ Exception -> 0x071b }
            java.nio.ByteBuffer[] r10 = r10.mo148211m()     // Catch:{ Exception -> 0x071b }
            com.tencent.mm.compatible.deviceinfo.a r11 = r1.f314697c     // Catch:{ Exception -> 0x071b }
            r13 = r15
            r14 = -1
            int r11 = r11.mo148204f(r14)     // Catch:{ Exception -> 0x071b }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x071b }
            r14.<init>()     // Catch:{ Exception -> 0x071b }
            java.lang.String r15 = "anlingao[multi_hw] inputBufferIndex: "
            r14.append(r15)     // Catch:{ Exception -> 0x071b }
            r14.append(r11)     // Catch:{ Exception -> 0x071b }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x071b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r14)     // Catch:{ Exception -> 0x071b }
            if (r11 < 0) goto L_0x0400
            long r14 = r1.f314707m     // Catch:{ Exception -> 0x071b }
            int r4 = r1.f314701g     // Catch:{ Exception -> 0x071b }
            r3 = 15
            int r3 = java.lang.Math.max(r4, r3)     // Catch:{ Exception -> 0x071b }
            r4 = 30
            int r3 = java.lang.Math.min(r3, r4)     // Catch:{ Exception -> 0x071b }
            r17 = 0
            int r4 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x03c2
            long r14 = r1.f314708n     // Catch:{ Exception -> 0x071b }
            int r4 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r4 != 0) goto L_0x03b9
            goto L_0x03c2
        L_0x03b9:
            r4 = 1000000(0xf4240, float:1.401298E-39)
            int r4 = r4 / r3
            long r3 = (long) r4     // Catch:{ Exception -> 0x071b }
            long r14 = r14 + r3
            r1.f314708n = r14     // Catch:{ Exception -> 0x071b }
            goto L_0x03c6
        L_0x03c2:
            r3 = 132(0x84, double:6.5E-322)
            r1.f314708n = r3     // Catch:{ Exception -> 0x071b }
        L_0x03c6:
            long r3 = r1.f314708n     // Catch:{ Exception -> 0x071b }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x071b }
            r14.<init>()     // Catch:{ Exception -> 0x071b }
            java.lang.String r15 = "anlingao[multi_hw] pts: "
            r14.append(r15)     // Catch:{ Exception -> 0x071b }
            r14.append(r3)     // Catch:{ Exception -> 0x071b }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x071b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r14)     // Catch:{ Exception -> 0x071b }
            r0 = r0[r11]     // Catch:{ Exception -> 0x071b }
            r0.clear()     // Catch:{ Exception -> 0x071b }
            int r14 = r1.f314718x     // Catch:{ Exception -> 0x071b }
            r0.put(r2, r5, r14)     // Catch:{ Exception -> 0x071b }
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f314697c     // Catch:{ Exception -> 0x071b }
            r25 = 0
            int r2 = r1.f314718x     // Catch:{ Exception -> 0x071b }
            r29 = 0
            r23 = r0
            r24 = r11
            r26 = r2
            r27 = r3
            r23.mo148213o(r24, r25, r26, r27, r29)     // Catch:{ Exception -> 0x071b }
            long r2 = r1.f314707m     // Catch:{ Exception -> 0x071b }
            r14 = 1
            long r2 = r2 + r14
            r1.f314707m = r2     // Catch:{ Exception -> 0x071b }
        L_0x0400:
            android.media.MediaCodec$BufferInfo r0 = new android.media.MediaCodec$BufferInfo     // Catch:{ Exception -> 0x071b }
            r0.<init>()     // Catch:{ Exception -> 0x071b }
            com.tencent.mm.compatible.deviceinfo.a r2 = r1.f314697c     // Catch:{ Exception -> 0x071b }
            r3 = 12000(0x2ee0, float:1.6816E-41)
            long r3 = (long) r3     // Catch:{ Exception -> 0x071b }
            int r2 = r2.mo148205g(r0, r3)     // Catch:{ Exception -> 0x071b }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x071b }
            r11.<init>()     // Catch:{ Exception -> 0x071b }
            r14 = r22
            r11.append(r14)     // Catch:{ Exception -> 0x071b }
            r11.append(r2)     // Catch:{ Exception -> 0x071b }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x071b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)     // Catch:{ Exception -> 0x071b }
            r11 = -2
            if (r2 != r11) goto L_0x043f
            com.tencent.mm.compatible.deviceinfo.a r11 = r1.f314697c     // Catch:{ Exception -> 0x071b }
            android.media.MediaFormat r11 = r11.mo148212n()     // Catch:{ Exception -> 0x071b }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x071b }
            r15.<init>()     // Catch:{ Exception -> 0x071b }
            java.lang.String r5 = "steve: encoder output format changed: "
            r15.append(r5)     // Catch:{ Exception -> 0x071b }
            r15.append(r11)     // Catch:{ Exception -> 0x071b }
            java.lang.String r5 = r15.toString()     // Catch:{ Exception -> 0x071b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r5)     // Catch:{ Exception -> 0x071b }
        L_0x043f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x071b }
            r5.<init>()     // Catch:{ Exception -> 0x071b }
            r5.append(r14)     // Catch:{ Exception -> 0x071b }
            r5.append(r2)     // Catch:{ Exception -> 0x071b }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x071b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r5)     // Catch:{ Exception -> 0x071b }
        L_0x0451:
            if (r2 < 0) goto L_0x074e
            r5 = r10[r2]     // Catch:{ Exception -> 0x071b }
            int r9 = r0.size     // Catch:{ Exception -> 0x071b }
            byte[] r9 = new byte[r9]     // Catch:{ Exception -> 0x071b }
            r5.get(r9)     // Catch:{ Exception -> 0x071b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x071b }
            r5.<init>()     // Catch:{ Exception -> 0x071b }
            java.lang.String r11 = "anlingao[multi_hw] bufferInfo.flags: "
            r5.append(r11)     // Catch:{ Exception -> 0x071b }
            int r11 = r0.flags     // Catch:{ Exception -> 0x071b }
            r5.append(r11)     // Catch:{ Exception -> 0x071b }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x071b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r5)     // Catch:{ Exception -> 0x071b }
            int r5 = r0.flags     // Catch:{ Exception -> 0x071b }
            java.lang.String r14 = "mediacodec reinit error: "
            java.lang.String r15 = ", checkCodeForBSlice:"
            java.lang.String r11 = "steve:B-frames exist in High Profile, reset to Baseline!!!,maxAllowedProfile:"
            r35 = r10
            java.lang.String r10 = ", len:"
            if (r5 != r6) goto L_0x05e1
            r5 = 0
            java.util.ArrayList r6 = r1.mo150803i(r9, r5)     // Catch:{ Exception -> 0x071b }
            te3.af2 r5 = new te3.af2     // Catch:{ Exception -> 0x071b }
            r5.<init>()     // Catch:{ Exception -> 0x071b }
            r36 = r13
            int r13 = r6.size()     // Catch:{ Exception -> 0x071b }
            r30 = r7
            r7 = 3
            if (r13 != r7) goto L_0x04ea
            java.lang.String r13 = r1.f314696b     // Catch:{ Exception -> 0x0719 }
            java.lang.String r7 = "video/hevc"
            boolean r7 = r13.equalsIgnoreCase(r7)     // Catch:{ Exception -> 0x0719 }
            if (r7 == 0) goto L_0x04ea
            r7 = 0
            java.lang.Object r13 = r6.get(r7)     // Catch:{ Exception -> 0x0719 }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ Exception -> 0x0719 }
            int r7 = r13.intValue()     // Catch:{ Exception -> 0x0719 }
            r13 = 4
            int r7 = r7 + r13
            r13 = 1
            java.lang.Object r16 = r6.get(r13)     // Catch:{ Exception -> 0x0719 }
            java.lang.Integer r16 = (java.lang.Integer) r16     // Catch:{ Exception -> 0x0719 }
            int r13 = r16.intValue()     // Catch:{ Exception -> 0x0719 }
            r16 = 4
            int r13 = r13 + 4
            r17 = r3
            r3 = 2
            java.lang.Object r4 = r6.get(r3)     // Catch:{ Exception -> 0x0719 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x0719 }
            int r3 = r4.intValue()     // Catch:{ Exception -> 0x0719 }
            int r3 = r3 + 4
            int r4 = r13 - r7
            int r4 = r4 + -4
            int r6 = r3 - r13
            int r6 = r6 + -4
            r33 = r6
            int r6 = r0.size     // Catch:{ Exception -> 0x0719 }
            int r6 = r6 - r3
            r19 = r3
            pe3.b r3 = new pe3.b     // Catch:{ Exception -> 0x0719 }
            r3.<init>(r9, r7, r4)     // Catch:{ Exception -> 0x0719 }
            r5.f331877g = r3     // Catch:{ Exception -> 0x0719 }
            r3 = r33
            r33 = r2
            r2 = r4
            r4 = r7
            r7 = r6
            r6 = r19
            goto L_0x0524
        L_0x04ea:
            r17 = r3
            int r3 = r6.size()     // Catch:{ Exception -> 0x0719 }
            r4 = 2
            if (r3 != r4) goto L_0x051c
            r3 = 0
            java.lang.Object r7 = r6.get(r3)     // Catch:{ Exception -> 0x0719 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Exception -> 0x0719 }
            int r3 = r7.intValue()     // Catch:{ Exception -> 0x0719 }
            r7 = 4
            int r3 = r3 + r7
            r13 = 1
            java.lang.Object r6 = r6.get(r13)     // Catch:{ Exception -> 0x0719 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Exception -> 0x0719 }
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x0719 }
            int r6 = r6 + r7
            int r13 = r6 - r3
            int r13 = r13 - r7
            int r7 = r0.size     // Catch:{ Exception -> 0x0719 }
            int r7 = r7 - r6
            r33 = r2
            r2 = 0
            r4 = 0
            r31 = r13
            r13 = r3
            r3 = r31
            goto L_0x0524
        L_0x051c:
            r33 = r2
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r13 = 0
        L_0x0524:
            r19 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0719 }
            r8.<init>()     // Catch:{ Exception -> 0x0719 }
            r20 = r0
            java.lang.String r0 = "sps start: "
            r8.append(r0)     // Catch:{ Exception -> 0x0719 }
            r8.append(r13)     // Catch:{ Exception -> 0x0719 }
            r8.append(r10)     // Catch:{ Exception -> 0x0719 }
            r8.append(r3)     // Catch:{ Exception -> 0x0719 }
            java.lang.String r0 = ", pps start:"
            r8.append(r0)     // Catch:{ Exception -> 0x0719 }
            r8.append(r6)     // Catch:{ Exception -> 0x0719 }
            r8.append(r10)     // Catch:{ Exception -> 0x0719 }
            r8.append(r7)     // Catch:{ Exception -> 0x0719 }
            java.lang.String r0 = ", vps start: "
            r8.append(r0)     // Catch:{ Exception -> 0x0719 }
            r8.append(r4)     // Catch:{ Exception -> 0x0719 }
            r8.append(r10)     // Catch:{ Exception -> 0x0719 }
            r8.append(r2)     // Catch:{ Exception -> 0x0719 }
            java.lang.String r0 = r8.toString()     // Catch:{ Exception -> 0x0719 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r0)     // Catch:{ Exception -> 0x0719 }
            int r0 = r1.f314712r     // Catch:{ Exception -> 0x0719 }
            r2 = 1
            if (r0 == r2) goto L_0x05b5
            com.tencent.mm.plugin.voip.model.h r0 = r1.f314711q     // Catch:{ Exception -> 0x0719 }
            boolean r0 = r0.mo152584b(r9)     // Catch:{ Exception -> 0x0719 }
            if (r0 == 0) goto L_0x05b5
            com.tencent.mm.plugin.voip.model.h r0 = r1.f314711q     // Catch:{ Exception -> 0x0719 }
            int r0 = r0.f317324a     // Catch:{ Exception -> 0x0719 }
            r1.f314714t = r0     // Catch:{ Exception -> 0x0719 }
            r2 = 1
            r1.f314713s = r2     // Catch:{ Exception -> 0x0719 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0719 }
            r0.<init>()     // Catch:{ Exception -> 0x0719 }
            r0.append(r11)     // Catch:{ Exception -> 0x0719 }
            int r2 = r1.f314713s     // Catch:{ Exception -> 0x0719 }
            r0.append(r2)     // Catch:{ Exception -> 0x0719 }
            r0.append(r15)     // Catch:{ Exception -> 0x0719 }
            int r2 = r1.f314714t     // Catch:{ Exception -> 0x0719 }
            r0.append(r2)     // Catch:{ Exception -> 0x0719 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0719 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ Exception -> 0x0719 }
            int r0 = r32.mo150798d()     // Catch:{ Exception -> 0x0595 }
            goto L_0x05b4
        L_0x0595:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0719 }
            r0.<init>()     // Catch:{ Exception -> 0x0719 }
            r0.append(r14)     // Catch:{ Exception -> 0x0719 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ Exception -> 0x0719 }
            r0.append(r2)     // Catch:{ Exception -> 0x0719 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0719 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)     // Catch:{ Exception -> 0x0719 }
            r2 = 2005(0x7d5, float:2.81E-42)
            r1.f314695a = r2     // Catch:{ Exception -> 0x0719 }
            int r0 = r1.f314695a     // Catch:{ Exception -> 0x0719 }
            int r0 = -r0
        L_0x05b4:
            return r0
        L_0x05b5:
            r2 = 4
            r5.f331874d = r2     // Catch:{ Exception -> 0x0719 }
            pe3.b r0 = new pe3.b     // Catch:{ Exception -> 0x0719 }
            r0.<init>(r9, r13, r3)     // Catch:{ Exception -> 0x0719 }
            r5.f331875e = r0     // Catch:{ Exception -> 0x0719 }
            pe3.b r0 = new pe3.b     // Catch:{ Exception -> 0x0719 }
            r0.<init>(r9, r6, r7)     // Catch:{ Exception -> 0x0719 }
            r5.f331876f = r0     // Catch:{ Exception -> 0x0719 }
            byte[] r0 = r5.toByteArray()     // Catch:{ Exception -> 0x0719 }
            int r0 = r0.length     // Catch:{ Exception -> 0x0719 }
            byte[] r2 = r5.toByteArray()     // Catch:{ Exception -> 0x0719 }
            r3 = r20
            int r4 = r3.flags     // Catch:{ Exception -> 0x0719 }
            int r0 = r1.mo150804j(r2, r4, r0)     // Catch:{ Exception -> 0x0719 }
            if (r0 >= 0) goto L_0x05da
            return r0
        L_0x05da:
            r6 = r36
            r7 = r19
            r2 = 4
            goto L_0x06f5
        L_0x05e1:
            r33 = r2
            r17 = r3
            r30 = r7
            r19 = r8
            r36 = r13
            r3 = r0
            int r0 = r1.f314712r     // Catch:{ Exception -> 0x0719 }
            r2 = 1
            if (r0 == r2) goto L_0x0643
            com.tencent.mm.plugin.voip.model.h r0 = r1.f314711q     // Catch:{ Exception -> 0x0719 }
            boolean r0 = r0.mo152585c(r9)     // Catch:{ Exception -> 0x0719 }
            if (r0 == 0) goto L_0x0643
            com.tencent.mm.plugin.voip.model.h r0 = r1.f314711q     // Catch:{ Exception -> 0x0719 }
            int r0 = r0.f317324a     // Catch:{ Exception -> 0x0719 }
            r1.f314714t = r0     // Catch:{ Exception -> 0x0719 }
            r2 = 1
            r1.f314713s = r2     // Catch:{ Exception -> 0x0719 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0719 }
            r0.<init>()     // Catch:{ Exception -> 0x0719 }
            r0.append(r11)     // Catch:{ Exception -> 0x0719 }
            int r2 = r1.f314713s     // Catch:{ Exception -> 0x0719 }
            r0.append(r2)     // Catch:{ Exception -> 0x0719 }
            r0.append(r15)     // Catch:{ Exception -> 0x0719 }
            int r2 = r1.f314714t     // Catch:{ Exception -> 0x0719 }
            r0.append(r2)     // Catch:{ Exception -> 0x0719 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0719 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ Exception -> 0x0719 }
            int r0 = r32.mo150798d()     // Catch:{ Exception -> 0x0623 }
            goto L_0x0642
        L_0x0623:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0719 }
            r0.<init>()     // Catch:{ Exception -> 0x0719 }
            r0.append(r14)     // Catch:{ Exception -> 0x0719 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ Exception -> 0x0719 }
            r0.append(r2)     // Catch:{ Exception -> 0x0719 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0719 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)     // Catch:{ Exception -> 0x0719 }
            r2 = 2005(0x7d5, float:2.81E-42)
            r1.f314695a = r2     // Catch:{ Exception -> 0x0719 }
            int r0 = r1.f314695a     // Catch:{ Exception -> 0x0719 }
            int r0 = -r0
        L_0x0642:
            return r0
        L_0x0643:
            int r0 = r3.flags     // Catch:{ Exception -> 0x0719 }
            if (r0 == 0) goto L_0x066e
            r2 = 1
            if (r0 == r2) goto L_0x066e
            r0 = 2009(0x7d9, float:2.815E-42)
            r1.f314695a = r0     // Catch:{ Exception -> 0x0719 }
            int r0 = -r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0719 }
            r2.<init>()     // Catch:{ Exception -> 0x0719 }
            java.lang.String r4 = "steve:unknown frame error!!! type:"
            r2.append(r4)     // Catch:{ Exception -> 0x0719 }
            int r4 = r3.flags     // Catch:{ Exception -> 0x0719 }
            r2.append(r4)     // Catch:{ Exception -> 0x0719 }
            r2.append(r10)     // Catch:{ Exception -> 0x0719 }
            int r3 = r3.size     // Catch:{ Exception -> 0x0719 }
            r2.append(r3)     // Catch:{ Exception -> 0x0719 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0719 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)     // Catch:{ Exception -> 0x0719 }
            return r0
        L_0x066e:
            r2 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r2)     // Catch:{ Exception -> 0x0719 }
            int r4 = r3.size     // Catch:{ Exception -> 0x0719 }
            int r4 = r4 - r2
            r0.putInt(r4)     // Catch:{ Exception -> 0x0719 }
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x0719 }
            java.nio.ByteBuffer r0 = r0.order(r4)     // Catch:{ Exception -> 0x0719 }
            byte[] r0 = r0.array()     // Catch:{ Exception -> 0x0719 }
            r4 = 0
            java.lang.System.arraycopy(r0, r4, r9, r4, r2)     // Catch:{ Exception -> 0x0719 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0719 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0719 }
            r0.<init>()     // Catch:{ Exception -> 0x0719 }
            java.lang.String r6 = " type:"
            r0.append(r6)     // Catch:{ Exception -> 0x0719 }
            int r6 = r3.flags     // Catch:{ Exception -> 0x0719 }
            r0.append(r6)     // Catch:{ Exception -> 0x0719 }
            java.lang.String r6 = ", size:"
            r0.append(r6)     // Catch:{ Exception -> 0x0719 }
            int r6 = r3.size     // Catch:{ Exception -> 0x0719 }
            r0.append(r6)     // Catch:{ Exception -> 0x0719 }
            r6 = r36
            r0.append(r6)     // Catch:{ Exception -> 0x0719 }
            int r7 = f314693y     // Catch:{ Exception -> 0x0719 }
            r0.append(r7)     // Catch:{ Exception -> 0x0719 }
            r7 = r19
            r0.append(r7)     // Catch:{ Exception -> 0x0719 }
            r0.append(r4)     // Catch:{ Exception -> 0x0719 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0719 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r0)     // Catch:{ Exception -> 0x0719 }
            te3.ze2 r0 = new te3.ze2     // Catch:{ Exception -> 0x0719 }
            r0.<init>()     // Catch:{ Exception -> 0x0719 }
            int r4 = r3.size     // Catch:{ Exception -> 0x0719 }
            pe3.b r5 = new pe3.b     // Catch:{ Exception -> 0x0719 }
            r8 = 0
            r5.<init>(r9, r8, r4)     // Catch:{ Exception -> 0x0719 }
            r0.f332381d = r5     // Catch:{ Exception -> 0x0719 }
            r4 = 1
            r0.f332382e = r4     // Catch:{ Exception -> 0x0719 }
            java.util.LinkedList<te3.bf2> r4 = r1.f314709o     // Catch:{ Exception -> 0x0719 }
            r0.f332383f = r4     // Catch:{ Exception -> 0x0719 }
            java.util.LinkedList<java.lang.Integer> r4 = r1.f314710p     // Catch:{ Exception -> 0x0719 }
            int r5 = r3.size     // Catch:{ Exception -> 0x0719 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0719 }
            r8 = 0
            r4.set(r8, r5)     // Catch:{ Exception -> 0x0719 }
            java.util.LinkedList<java.lang.Integer> r4 = r1.f314710p     // Catch:{ Exception -> 0x0719 }
            r0.f332384g = r4     // Catch:{ Exception -> 0x0719 }
            byte[] r4 = r0.toByteArray()     // Catch:{ Exception -> 0x0719 }
            int r4 = r4.length     // Catch:{ Exception -> 0x0719 }
            byte[] r0 = r0.toByteArray()     // Catch:{ Exception -> 0x0719 }
            int r5 = r3.flags     // Catch:{ Exception -> 0x0719 }
            int r0 = r1.mo150804j(r0, r5, r4)     // Catch:{ Exception -> 0x0719 }
            if (r0 >= 0) goto L_0x06f5
            return r0
        L_0x06f5:
            int r9 = r3.flags     // Catch:{ Exception -> 0x0719 }
            int r0 = f314693y     // Catch:{ Exception -> 0x0719 }
            r4 = 1
            int r0 = r0 + r4
            f314693y = r0     // Catch:{ Exception -> 0x0719 }
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f314697c     // Catch:{ Exception -> 0x0719 }
            r5 = r33
            r8 = 0
            r0.mo148216r(r5, r8)     // Catch:{ Exception -> 0x0719 }
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f314697c     // Catch:{ Exception -> 0x0719 }
            r10 = r17
            int r0 = r0.mo148205g(r3, r10)     // Catch:{ Exception -> 0x0719 }
            r2 = r0
            r0 = r3
            r13 = r6
            r8 = r7
            r3 = r10
            r7 = r30
            r6 = 2
            r10 = r35
            goto L_0x0451
        L_0x0719:
            r0 = move-exception
            goto L_0x071e
        L_0x071b:
            r0 = move-exception
            r30 = r7
        L_0x071e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = r30
            r2.append(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            r0 = 2004(0x7d4, float:2.808E-42)
            r1.f314695a = r0
            goto L_0x074d
        L_0x073b:
            int r0 = r1.f314715u
            int r2 = r0 + 1
            r1.f314715u = r2
            r2 = 5
            if (r0 <= r2) goto L_0x074e
            java.lang.String r0 = " anlingao[multi_hw] ENUM_AVCEncNULLPointer: 2006"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            r0 = 2006(0x7d6, float:2.811E-42)
            r1.f314695a = r0
        L_0x074d:
            int r9 = -r0
        L_0x074e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.C105820n.mo150796b(byte[], int, int, int):int");
    }

    /* renamed from: c */
    public void mo150797c() {
        C107064d dVar = C105851w0.xx0().f314798d;
        int i = f314692D;
        byte[] bArr = this.f314717w.f314732n;
        int i2 = ((C109779e) dVar).mo161038i(i, bArr, bArr.length);
        Log.m105925i("MultiAvcEncoder[HWEnc]", "anlingao[multi_hw] EMethodGetQosPara ret[%d], len[%d]", Integer.valueOf(i2), Integer.valueOf(this.f314717w.f314732n.length));
        if (i2 >= 0) {
            C105821a aVar = this.f314717w;
            ByteBuffer wrap = ByteBuffer.wrap(aVar.f314732n);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            aVar.f314719a = wrap.getShort();
            aVar.f314720b = wrap.get();
            aVar.f314721c = wrap.get();
            aVar.f314722d = wrap.get();
            aVar.f314723e = wrap.get();
            aVar.f314724f = wrap.get();
            aVar.f314725g = wrap.get();
            aVar.f314726h = wrap.get();
            aVar.f314727i = wrap.get();
            aVar.f314728j = wrap.get();
            aVar.f314729k = wrap.get();
            aVar.f314730l = wrap.get();
            aVar.f314731m = wrap.get();
            C105821a aVar2 = this.f314717w;
            aVar2.getClass();
            Log.m105918d("MultiAvcEncoder[HWEnc]", "raw S2P:" + aVar2.f314732n);
            Log.m105918d("MultiAvcEncoder[HWEnc]", "-S2P- iKbps:" + aVar2.f314719a + ", fps:" + aVar2.f314720b + ", IP:" + aVar2.f314721c + ", RS:" + aVar2.f314722d + ", QPMin:" + aVar2.f314723e + ", QPMax:" + aVar2.f314724f + ", HPP:" + aVar2.f314725g + ", SWitch:" + aVar2.f314726h + ", Reso:" + aVar2.f314727i + ", Rsvd1:" + aVar2.f314728j + ", Rsvd2:" + aVar2.f314729k + ", Skip:" + aVar2.f314730l + ", IReq:" + aVar2.f314731m);
        }
        short s = this.f314717w.f314719a;
        if (this.f314702h != s) {
            mo150799e(s);
            Log.m105924i("MultiAvcEncoder[HWEnc]", "steve[QoS]: Update BR! frameID: " + f314693y + ", new_br: " + this.f314702h + ", tuneBR:" + s);
            this.f314702h = s;
        }
        if (1 == this.f314717w.f314731m && f314693y > 0) {
            if (this.f314697c != null) {
                Log.m105926v("MultiAvcEncoder[HWEnc]", "steve: Sync frame request soon!");
                Bundle bundle = new Bundle();
                bundle.putInt("request-sync", 0);
                this.f314697c.mo148220w(bundle);
            }
            Log.m105924i("MultiAvcEncoder[HWEnc]", "steve[QoS]: Force I Frame! frameID: " + f314693y);
        }
        byte b = this.f314717w.f314720b;
        if (b != this.f314701g) {
            this.f314701g = b;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0207 A[Catch:{ Exception -> 0x027b }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0217 A[Catch:{ Exception -> 0x027b }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo150798d() {
        /*
            r17 = this;
            r1 = r17
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "anlingao[multi_hw] InitHWEncoder!"
            r0.append(r2)
            java.lang.String r2 = r1.f314696b
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MultiAvcEncoder[HWEnc]"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f314697c
            if (r0 == 0) goto L_0x0021
            r17.mo150800f()
        L_0x0021:
            java.lang.String r0 = r1.f314696b
            int r3 = android.media.MediaCodecList.getCodecCount()
            r5 = 0
        L_0x0028:
            if (r5 >= r3) goto L_0x0075
            android.media.MediaCodecInfo r7 = android.media.MediaCodecList.getCodecInfoAt(r5)
            boolean r8 = r7.isEncoder()
            if (r8 != 0) goto L_0x0035
            goto L_0x0072
        L_0x0035:
            java.lang.String[] r8 = r7.getSupportedTypes()
            r9 = 0
        L_0x003a:
            int r10 = r8.length
            if (r9 >= r10) goto L_0x0072
            r10 = r8[r9]
            boolean r10 = r10.equalsIgnoreCase(r0)
            if (r10 == 0) goto L_0x006f
            java.lang.String r10 = r7.getName()
            java.lang.String[] r11 = f314690B
            int r12 = r11.length
            r13 = 0
        L_0x004d:
            if (r13 >= r12) goto L_0x006f
            r14 = r11[r13]
            boolean r14 = r10.startsWith(r14)
            if (r14 == 0) goto L_0x006c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "steve : H.264 HW encoder found:"
            r0.append(r3)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x0076
        L_0x006c:
            int r13 = r13 + 1
            goto L_0x004d
        L_0x006f:
            int r9 = r9 + 1
            goto L_0x003a
        L_0x0072:
            int r5 = r5 + 1
            goto L_0x0028
        L_0x0075:
            r7 = 0
        L_0x0076:
            if (r7 != 0) goto L_0x0094
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "steve: Unable to find an appropriate codec for "
            r0.append(r3)
            java.lang.String r3 = r1.f314696b
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            r0 = 2001(0x7d1, float:2.804E-42)
            r1.f314695a = r0
            int r0 = -r0
            return r0
        L_0x0094:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "steve: found HW codec: "
            r0.append(r3)
            java.lang.String r3 = r7.getName()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.lang.String r0 = r1.f314696b
            int r3 = r1.f314699e
            int r5 = r1.f314700f
            android.media.MediaFormat r0 = android.media.MediaFormat.createVideoFormat(r0, r3, r5)
            r1.f314698d = r0
            r3 = 21
            java.lang.String r5 = "color-format"
            r0.setInteger(r5, r3)
            android.media.MediaFormat r0 = r1.f314698d
            int r3 = r1.f314702h
            int r3 = r3 * 1000
            java.lang.String r5 = "bitrate"
            r0.setInteger(r5, r3)
            android.media.MediaFormat r0 = r1.f314698d
            int r3 = r1.f314701g
            java.lang.String r5 = "frame-rate"
            r0.setInteger(r5, r3)
            android.media.MediaFormat r0 = r1.f314698d
            java.lang.String r3 = "i-frame-interval"
            r5 = 1
            r0.setInteger(r3, r5)
            android.media.MediaFormat r0 = r1.f314698d
            java.lang.String r3 = "mime"
            java.lang.String r3 = r0.getString(r3)
            r1.f314712r = r5
            java.lang.String r0 = r1.f314696b
            java.lang.String r8 = "video/avc"
            boolean r0 = r0.equalsIgnoreCase(r8)
            if (r0 == 0) goto L_0x02a3
            java.lang.String r0 = r7.getName()
            java.lang.String[] r9 = f314690B
            int r10 = r9.length
            r11 = 0
        L_0x00f7:
            if (r11 >= r10) goto L_0x011a
            r12 = r9[r11]
            boolean r12 = r0.startsWith(r12)
            if (r12 == 0) goto L_0x0117
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "steve : known H.264 HW encoder :"
            r9.append(r10)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            r0 = 1
            goto L_0x011b
        L_0x0117:
            int r11 = r11 + 1
            goto L_0x00f7
        L_0x011a:
            r0 = 0
        L_0x011b:
            if (r0 == 0) goto L_0x02a3
            r0 = 23
            boolean r9 = p206nj.C11171e.m11046c(r0)
            if (r9 == 0) goto L_0x02a3
            int r9 = r1.f314703i
            if (r9 <= 0) goto L_0x012f
            r10 = r9 & 1
            if (r10 == 0) goto L_0x012f
            r10 = 1
            goto L_0x0130
        L_0x012f:
            r10 = 0
        L_0x0130:
            if (r9 <= 0) goto L_0x0138
            r9 = r9 & 4
            if (r9 == 0) goto L_0x0138
            r9 = 1
            goto L_0x0139
        L_0x0138:
            r9 = 0
        L_0x0139:
            int r11 = r1.f314713s
            r12 = 8
            if (r12 > r11) goto L_0x01a5
            java.lang.String r11 = r7.getName()
            java.lang.String[] r13 = f314690B
            int r14 = r13.length
            r15 = 0
            r16 = 0
        L_0x0149:
            if (r15 >= r14) goto L_0x01a7
            r6 = r13[r15]
            boolean r6 = r11.startsWith(r6)
            if (r6 == 0) goto L_0x019d
            android.media.MediaCodecInfo$CodecCapabilities r6 = r7.getCapabilitiesForType(r3)     // Catch:{ Exception -> 0x019d }
            android.media.MediaCodecInfo$CodecProfileLevel[] r6 = r6.profileLevels     // Catch:{ Exception -> 0x019d }
            int r8 = r6.length     // Catch:{ Exception -> 0x019d }
            r4 = 0
        L_0x015b:
            if (r4 >= r8) goto L_0x019d
            r0 = r6[r4]     // Catch:{ Exception -> 0x019d }
            int r5 = r0.profile     // Catch:{ Exception -> 0x019d }
            if (r5 != r12) goto L_0x0165
            r16 = 1
        L_0x0165:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x019d }
            r5.<init>()     // Catch:{ Exception -> 0x019d }
            java.lang.String r12 = "steve : ["
            r5.append(r12)     // Catch:{ Exception -> 0x019d }
            r5.append(r11)     // Catch:{ Exception -> 0x019d }
            java.lang.String r12 = "] supported profiles:"
            r5.append(r12)     // Catch:{ Exception -> 0x019d }
            int r0 = r0.profile     // Catch:{ Exception -> 0x019d }
            r5.append(r0)     // Catch:{ Exception -> 0x019d }
            java.lang.String r0 = ", maxAllowedProfile: "
            r5.append(r0)     // Catch:{ Exception -> 0x019d }
            int r0 = r1.f314713s     // Catch:{ Exception -> 0x019d }
            r5.append(r0)     // Catch:{ Exception -> 0x019d }
            java.lang.String r0 = ", MIME:"
            r5.append(r0)     // Catch:{ Exception -> 0x019d }
            r5.append(r3)     // Catch:{ Exception -> 0x019d }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x019d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ Exception -> 0x019d }
            int r4 = r4 + 1
            r0 = 23
            r5 = 1
            r12 = 8
            goto L_0x015b
        L_0x019d:
            int r15 = r15 + 1
            r0 = 23
            r5 = 1
            r12 = 8
            goto L_0x0149
        L_0x01a5:
            r16 = 0
        L_0x01a7:
            r0 = 256(0x100, float:3.59E-43)
            java.lang.String r4 = "level"
            java.lang.String r5 = "profile"
            if (r9 == 0) goto L_0x01be
            if (r16 == 0) goto L_0x01be
            android.media.MediaFormat r6 = r1.f314698d
            r7 = 8
            r6.setInteger(r5, r7)
            android.media.MediaFormat r6 = r1.f314698d
            r6.setInteger(r4, r0)
            goto L_0x01cb
        L_0x01be:
            if (r10 == 0) goto L_0x01ce
            android.media.MediaFormat r6 = r1.f314698d
            r7 = 1
            r6.setInteger(r5, r7)
            android.media.MediaFormat r6 = r1.f314698d
            r6.setInteger(r4, r0)
        L_0x01cb:
            r0 = 1
            goto L_0x0295
        L_0x01ce:
            int r6 = r1.f314713s
            r8 = 23
            boolean r8 = p206nj.C11171e.m11046c(r8)
            if (r8 == 0) goto L_0x0294
            android.media.MediaCodecInfo$CodecCapabilities r7 = r7.getCapabilitiesForType(r3)     // Catch:{ Exception -> 0x027b }
            if (r7 == 0) goto L_0x0294
            android.media.MediaCodecInfo$CodecProfileLevel[] r7 = r7.profileLevels     // Catch:{ Exception -> 0x027b }
            if (r7 == 0) goto L_0x0294
            android.media.MediaCodecInfo$CodecProfileLevel r8 = new android.media.MediaCodecInfo$CodecProfileLevel     // Catch:{ Exception -> 0x027b }
            r8.<init>()     // Catch:{ Exception -> 0x027b }
            r9 = 0
            r8.level = r9     // Catch:{ Exception -> 0x027b }
            r8.profile = r9     // Catch:{ Exception -> 0x027b }
            int r9 = r7.length     // Catch:{ Exception -> 0x027b }
            r10 = 0
        L_0x01ee:
            if (r10 >= r9) goto L_0x0247
            r11 = r7[r10]     // Catch:{ Exception -> 0x027b }
            int r12 = r11.profile     // Catch:{ Exception -> 0x027b }
            int r11 = r11.level     // Catch:{ Exception -> 0x027b }
            r13 = 1
            if (r12 == r13) goto L_0x0202
            r13 = 2
            if (r12 == r13) goto L_0x0202
            r13 = 8
            if (r12 == r13) goto L_0x0204
            r14 = 0
            goto L_0x0205
        L_0x0202:
            r13 = 8
        L_0x0204:
            r14 = 1
        L_0x0205:
            if (r14 == 0) goto L_0x0217
            int r14 = r8.profile     // Catch:{ Exception -> 0x027b }
            if (r12 < r14) goto L_0x0215
            int r14 = r8.level     // Catch:{ Exception -> 0x027b }
            if (r11 < r14) goto L_0x0215
            if (r12 > r6) goto L_0x0215
            r8.profile = r12     // Catch:{ Exception -> 0x027b }
            r8.level = r11     // Catch:{ Exception -> 0x027b }
        L_0x0215:
            r14 = 1
            goto L_0x0218
        L_0x0217:
            r14 = 0
        L_0x0218:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x027b }
            r15.<init>()     // Catch:{ Exception -> 0x027b }
            java.lang.String r13 = "steve : profile: "
            r15.append(r13)     // Catch:{ Exception -> 0x027b }
            r15.append(r12)     // Catch:{ Exception -> 0x027b }
            java.lang.String r12 = ", level: "
            r15.append(r12)     // Catch:{ Exception -> 0x027b }
            r15.append(r11)     // Catch:{ Exception -> 0x027b }
            java.lang.String r11 = ", maxProfile: "
            r15.append(r11)     // Catch:{ Exception -> 0x027b }
            r15.append(r6)     // Catch:{ Exception -> 0x027b }
            java.lang.String r11 = ", isRecognized:"
            r15.append(r11)     // Catch:{ Exception -> 0x027b }
            r15.append(r14)     // Catch:{ Exception -> 0x027b }
            java.lang.String r11 = r15.toString()     // Catch:{ Exception -> 0x027b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r11)     // Catch:{ Exception -> 0x027b }
            int r10 = r10 + 1
            goto L_0x01ee
        L_0x0247:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x027b }
            r6.<init>()     // Catch:{ Exception -> 0x027b }
            java.lang.String r7 = "best profile: "
            r6.append(r7)     // Catch:{ Exception -> 0x027b }
            int r7 = r8.profile     // Catch:{ Exception -> 0x027b }
            r6.append(r7)     // Catch:{ Exception -> 0x027b }
            java.lang.String r7 = ", best level: "
            r6.append(r7)     // Catch:{ Exception -> 0x027b }
            int r7 = r8.level     // Catch:{ Exception -> 0x027b }
            r6.append(r7)     // Catch:{ Exception -> 0x027b }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x027b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)     // Catch:{ Exception -> 0x027b }
            int r6 = r8.profile     // Catch:{ Exception -> 0x027b }
            if (r6 <= 0) goto L_0x0294
            int r7 = r8.level     // Catch:{ Exception -> 0x027b }
            if (r7 < r0) goto L_0x0294
            android.media.MediaFormat r7 = r1.f314698d     // Catch:{ Exception -> 0x027b }
            r7.setInteger(r5, r6)     // Catch:{ Exception -> 0x027b }
            android.media.MediaFormat r6 = r1.f314698d     // Catch:{ Exception -> 0x027b }
            r6.setInteger(r4, r0)     // Catch:{ Exception -> 0x027b }
            goto L_0x01cb
        L_0x027b:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "trySetProfile error: "
            r4.append(r6)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x0294:
            r0 = 0
        L_0x0295:
            if (r0 == 0) goto L_0x02a0
            android.media.MediaFormat r0 = r1.f314698d
            int r0 = r0.getInteger(r5)
            r1.f314712r = r0
            goto L_0x02a3
        L_0x02a0:
            r4 = 1
            r1.f314712r = r4
        L_0x02a3:
            android.media.MediaFormat r0 = r1.f314698d
            java.lang.String r4 = "bitrate-mode"
            r5 = 2
            r0.setInteger(r4, r5)
            r4 = 0
            com.tencent.mm.compatible.deviceinfo.a r0 = com.tencent.p014mm.compatible.deviceinfo.C104619a.m140212d(r3, r4)     // Catch:{ Exception -> 0x02ef }
            r1.f314697c = r0     // Catch:{ Exception -> 0x02ef }
            int r0 = r1.f314702h     // Catch:{ Exception -> 0x02ef }
            r1.mo150799e(r0)     // Catch:{ Exception -> 0x02ef }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "steve: mediaFormat: "
            r0.append(r3)
            android.media.MediaFormat r3 = r1.f314698d
            r0.append(r3)
            java.lang.String r3 = ", actProfile: "
            r0.append(r3)
            int r3 = r1.f314712r
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f314697c
            android.media.MediaFormat r2 = r1.f314698d
            r3 = 0
            r4 = 1
            r0.mo148202a(r2, r3, r3, r4)
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f314697c
            r0.mo148222y()
            com.tencent.mm.plugin.voip.model.h r0 = new com.tencent.mm.plugin.voip.model.h
            r0.<init>()
            r1.f314711q = r0
            r0 = 2000(0x7d0, float:2.803E-42)
            return r0
        L_0x02ef:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = " error:"
            r3.append(r4)
            java.lang.String r0 = r0.toString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            r0 = 2002(0x7d2, float:2.805E-42)
            r1.f314695a = r0
            int r0 = -r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.C105820n.mo150798d():int");
    }

    /* renamed from: e */
    public boolean mo150799e(int i) {
        try {
            if (this.f314697c == null) {
                return false;
            }
            if (i <= 0) {
                i = 700;
            }
            Bundle bundle = new Bundle();
            int i2 = i * 1000;
            Log.m105926v("MultiAvcEncoder[HWEnc]", "steve: setRates: " + i2);
            bundle.putInt("video-bitrate", i2);
            this.f314697c.mo148220w(bundle);
            return true;
        } catch (Exception e) {
            Log.m105920e("MultiAvcEncoder[HWEnc]", "steve: setRates failed:" + e);
            return false;
        }
    }

    /* renamed from: f */
    public final void mo150800f() {
        try {
            C104619a aVar = this.f314697c;
            if (aVar != null) {
                aVar.mo148223z();
                this.f314697c.mo148214p();
            }
        } catch (Exception e) {
            Log.m105920e("MultiAvcEncoder[HWEnc]", " error:" + e.toString());
        }
    }

    /* renamed from: g */
    public String mo150801g(byte[] bArr) {
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
    public boolean mo150802h() {
        Log.m105924i("MultiAvcEncoder[HWEnc]", "anlingao[multi_hw] cRsvd1: " + this.f314717w.f314728j);
        return (this.f314717w.f314728j & 1) == 1;
    }

    /* renamed from: i */
    public ArrayList<Integer> mo150803i(byte[] bArr, int i) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        String g = mo150801g(bArr);
        String g2 = mo150801g(new byte[]{0, 0, 0, 1});
        Log.m105918d("MultiAvcEncoder[HWEnc]", "parent: " + g + ", child:" + g2);
        while (true) {
            int indexOf = g.indexOf(g2, i);
            if (indexOf == -1) {
                return arrayList;
            }
            Log.m105918d("MultiAvcEncoder[HWEnc]", "vps/sps/pps start: " + i + ", nextStartIdx:" + indexOf);
            i = g2.length() + indexOf;
            arrayList.add(Integer.valueOf(indexOf / 2));
        }
    }

    /* renamed from: j */
    public int mo150804j(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null) {
            return 0;
        }
        int i4 = f314694z;
        if (this.f314696b.equalsIgnoreCase("video/hevc")) {
            i4 = f314689A;
        }
        if (C105851w0.zx0().mo150680v()) {
            i3 = C105724z.INSTANCE.mo150609s(bArr, this.f314699e, i, i4 + 128);
        } else {
            i3 = ((C109779e) C105851w0.xx0().f314798d).mo161036g(bArr, i2, this.f314699e, i, i4);
        }
        Log.m105925i("MultiAvcEncoder[HWEnc]", "anlingao[multi_hw] ret[%d],  m_width[%d], m_height[%d], type[%d], format[%d]", Integer.valueOf(i3), Integer.valueOf(this.f314699e), Integer.valueOf(this.f314700f), Integer.valueOf(i), Integer.valueOf(i4));
        if (i3 >= 0) {
            this.f314716v = 0;
            Log.m105918d("MultiAvcEncoder[HWEnc]", "steve: send successfully! frameLen = " + i2 + ", type = " + i + ", pkt cnt = " + i3);
            return i3;
        }
        int i5 = this.f314716v;
        this.f314716v = i5 + 1;
        if (i5 <= 5) {
            return 0;
        }
        this.f314695a = 2008;
        int i6 = -2008;
        Log.m105920e("MultiAvcEncoder[HWEnc]", "steve: hw send error for 5 times!! send ret = " + i6);
        return i6;
    }
}
