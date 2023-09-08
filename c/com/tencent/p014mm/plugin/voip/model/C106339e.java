package com.tencent.p014mm.plugin.voip.model;

import a70.C112760b;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import z33.C112595h;

/* renamed from: com.tencent.mm.plugin.voip.model.e */
public class C106339e extends Thread {

    /* renamed from: v */
    public static byte[] f317224v = null;

    /* renamed from: w */
    public static byte[] f317225w = null;

    /* renamed from: x */
    public static byte[] f317226x = null;

    /* renamed from: y */
    public static int f317227y = 640;

    /* renamed from: z */
    public static int f317228z = 480;

    /* renamed from: d */
    public C104619a f317229d = null;

    /* renamed from: e */
    public Surface f317230e;

    /* renamed from: f */
    public byte[] f317231f = null;

    /* renamed from: g */
    public boolean f317232g = false;

    /* renamed from: h */
    public boolean f317233h = false;

    /* renamed from: i */
    public boolean f317234i = true;

    /* renamed from: j */
    public boolean f317235j = true;

    /* renamed from: n */
    public boolean f317236n = false;

    /* renamed from: o */
    public int f317237o = 0;

    /* renamed from: p */
    public boolean f317238p = false;

    /* renamed from: q */
    public C106377r f317239q = null;

    /* renamed from: r */
    public byte[] f317240r = {0, 0, 0, 1};

    /* renamed from: s */
    public int f317241s = 0;

    /* renamed from: t */
    public int f317242t = 0;

    /* renamed from: u */
    public int f317243u = 0;

    static {
        C112760b.m154195C();
    }

    public C106339e(Surface surface) {
        if (surface != null) {
            this.f317230e = surface;
        }
    }

    /* renamed from: a */
    public int mo152555a() {
        this.f317237o++;
        Log.m105924i("MicroMsg.AvcDecoder", "[HW]:DecFrmError: I Req mIReqFlag = " + this.f317236n + ", mIsHWDecEnable = " + this.f317234i + ", mHWErrorDecFrmCount = " + this.f317237o);
        if (!this.f317234i || this.f317237o > 64) {
            this.f317235j = false;
            this.f317239q.mo152710m(true, this.f317232g);
            if (this.f317232g) {
                this.f317243u |= 64;
            } else {
                this.f317242t |= 64;
            }
            Log.m105924i("MicroMsg.AvcDecoder", "[HW]: ErrFrm > threshold, end HWDec!!");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.put((byte) 1);
        this.f317239q.f317500x.setAppCmd(28, allocate.array(), 1);
        this.f317236n = true;
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03d3, code lost:
        if (r0 != 39) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03e4, code lost:
        if (r0 != 6) goto L_0x03e7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03f2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x029a A[SYNTHETIC, Splitter:B:79:0x029a] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo152556b(byte[] r20, int r21, boolean r22, boolean r23) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r21
            java.lang.String r3 = " sps/pps parsing error:"
            java.lang.String r4 = " frame parsing error:"
            java.lang.String r5 = "TAG"
            r6 = -1
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "DECODER_THREAD:: data not ready yet!"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
            return r6
        L_0x0015:
            if (r23 == 0) goto L_0x001f
            r19.mo152557c()
            java.lang.String r7 = "DoMediacodecDec reset!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
        L_0x001f:
            boolean r7 = r1.f317234i
            r8 = 1
            if (r7 != 0) goto L_0x0039
            boolean r0 = r1.f317232g
            if (r0 == 0) goto L_0x002e
            int r0 = r1.f317243u
            r0 = r0 | r8
            r1.f317243u = r0
            goto L_0x0033
        L_0x002e:
            int r0 = r1.f317242t
            r0 = r0 | r8
            r1.f317242t = r0
        L_0x0033:
            java.lang.String r0 = "DECODER_THREAD:: HWDec NOT supported!"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
            return r6
        L_0x0039:
            java.lang.System.currentTimeMillis()
            java.lang.String r5 = "MicroMsg.AvcDecoder"
            r9 = 4
            r10 = 0
            if (r22 == 0) goto L_0x0294
            r11 = 2
            if (r2 != r11) goto L_0x01b0
            te3.af2 r2 = new te3.af2     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            r2.<init>()     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            pe3.a r0 = r2.parseFrom(r0)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            te3.af2 r0 = (te3.C110955af2) r0     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            pe3.b r2 = r0.f331877g     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            if (r2 != 0) goto L_0x0056
            r2 = 0
            goto L_0x0059
        L_0x0056:
            byte[] r2 = r2.f257327a     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r2 = r2.length     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
        L_0x0059:
            pe3.b r4 = r0.f331875e     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r4 = r4.f257327a     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r4 = r4.length     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            pe3.b r12 = r0.f331876f     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r12 = r12.f257327a     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r12 = r12.length     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            if (r2 == 0) goto L_0x00d1
            boolean r13 = r1.f317232g     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            if (r13 != 0) goto L_0x006b
            r1.f317233h = r10     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
        L_0x006b:
            r1.f317232g = r8     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r2 = r2 + r9
            byte[] r2 = new byte[r2]     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            f317224v = r2     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r4 = r4 + r9
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            f317225w = r4     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r12 = r12 + r9
            byte[] r4 = new byte[r12]     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            f317226x = r4     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r4 = r1.f317240r     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            java.lang.System.arraycopy(r4, r10, r2, r10, r9)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r2 = r1.f317240r     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r4 = f317225w     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            java.lang.System.arraycopy(r2, r10, r4, r10, r9)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r2 = r1.f317240r     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r4 = f317226x     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            java.lang.System.arraycopy(r2, r10, r4, r10, r9)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            pe3.b r2 = r0.f331877g     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r4 = f317224v     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            r2.mo123700c(r4, r9)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            pe3.b r2 = r0.f331875e     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r4 = f317225w     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            r2.mo123700c(r4, r9)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            pe3.b r0 = r0.f331876f     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r2 = f317226x     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            r0.mo123700c(r2, r9)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r0 = f317224v     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r2 = r0.length     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r4 = f317225w     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r4 = r4.length     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r2 = r2 + r4
            byte[] r4 = f317226x     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r4 = r4.length     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r2 = r2 + r4
            byte[] r2 = new byte[r2]     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            r1.f317231f = r2     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r4 = r0.length     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            java.lang.System.arraycopy(r0, r10, r2, r10, r4)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r0 = f317224v     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r0 = r0.length     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r0 = r0 + r10
            byte[] r2 = f317225w     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r4 = r1.f317231f     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r12 = r2.length     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            java.lang.System.arraycopy(r2, r10, r4, r0, r12)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r2 = f317225w     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r2 = r2.length     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r0 = r0 + r2
            byte[] r2 = f317226x     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r4 = r1.f317231f     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r12 = r2.length     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            java.lang.System.arraycopy(r2, r10, r4, r0, r12)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            goto L_0x015f
        L_0x00d1:
            boolean r2 = r1.f317232g     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            if (r2 == 0) goto L_0x00d7
            r1.f317233h = r10     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
        L_0x00d7:
            r1.f317232g = r10     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r2 = r4 + 4
            byte[] r2 = new byte[r2]     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r13 = r1.f317240r     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            java.lang.System.arraycopy(r13, r10, r2, r10, r9)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            pe3.b r13 = r0.f331875e     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            r13.mo123700c(r2, r9)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            r13.<init>()     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            java.lang.String r14 = " old sps: "
            r13.append(r14)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            r13.append(r2)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r13)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            boolean r13 = r1.mo152559e(r2, r10)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            if (r13 == 0) goto L_0x0109
            java.lang.String r13 = " Hack code existed!! NO modify "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r13)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            f317225w = r2     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            goto L_0x0114
        L_0x0109:
            com.tencent.mm.plugin.voip.model.h r13 = new com.tencent.mm.plugin.voip.model.h     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            r13.<init>()     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r2 = r13.mo152583a(r2)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            f317225w = r2     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
        L_0x0114:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            r2.<init>()     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            java.lang.String r13 = " Parsing protobuf, spsLen = "
            r2.append(r13)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r13 = f317225w     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r13 = r13.length     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            r2.append(r13)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            java.lang.String r13 = ", original="
            r2.append(r13)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            r2.append(r4)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r2)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r12 = r12 + r9
            byte[] r2 = new byte[r12]     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            f317226x = r2     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r4 = r1.f317240r     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            java.lang.System.arraycopy(r4, r10, r2, r10, r9)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            pe3.b r0 = r0.f331876f     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r2 = f317226x     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            r0.mo123700c(r2, r9)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r0 = f317225w     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r2 = r0.length     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r4 = f317226x     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r4 = r4.length     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r2 = r2 + r4
            byte[] r2 = new byte[r2]     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            r1.f317231f = r2     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r4 = r0.length     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            java.lang.System.arraycopy(r0, r10, r2, r10, r4)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r0 = f317225w     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r0 = r0.length     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r0 = r0 + r10
            byte[] r2 = f317226x     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            byte[] r4 = r1.f317231f     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            int r12 = r2.length     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
            java.lang.System.arraycopy(r2, r10, r4, r0, r12)     // Catch:{ Exception -> 0x0189, OutOfMemoryError -> 0x0162 }
        L_0x015f:
            r11 = 0
            goto L_0x0296
        L_0x0162:
            r0 = move-exception
            boolean r2 = r1.f317232g
            if (r2 == 0) goto L_0x016d
            int r2 = r1.f317243u
            r2 = r2 | r11
            r1.f317243u = r2
            goto L_0x0172
        L_0x016d:
            int r2 = r1.f317242t
            r2 = r2 | r11
            r1.f317242t = r2
        L_0x0172:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            return r6
        L_0x0189:
            r0 = move-exception
            boolean r2 = r1.f317232g
            if (r2 == 0) goto L_0x0194
            int r2 = r1.f317243u
            r2 = r2 | r11
            r1.f317243u = r2
            goto L_0x0199
        L_0x0194:
            int r2 = r1.f317242t
            r2 = r2 | r11
            r1.f317242t = r2
        L_0x0199:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            return r6
        L_0x01b0:
            te3.ze2 r3 = new te3.ze2     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            r3.<init>()     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            pe3.a r0 = r3.parseFrom(r0)     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            te3.ze2 r0 = (te3.C110976ze2) r0     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            java.util.LinkedList<java.lang.Integer> r3 = r0.f332384g     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            java.lang.Object r3 = r3.getFirst()     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            r11.<init>()     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            java.lang.String r12 = " Parsing protobuf, framelen = "
            r11.append(r12)     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            r11.append(r3)     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r11)     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            if (r2 != r8) goto L_0x01ea
            byte[] r11 = r1.f317231f     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            int r12 = r11.length     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            int r13 = r3 + r12
            byte[] r14 = new byte[r13]     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            java.lang.System.arraycopy(r11, r10, r14, r10, r12)     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            int r12 = r12 + r10
            r11 = r14
            goto L_0x01ee
        L_0x01ea:
            byte[] r11 = new byte[r3]     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            r13 = r3
            r12 = 0
        L_0x01ee:
            r14 = 0
        L_0x01ef:
            java.nio.ByteBuffer r15 = java.nio.ByteBuffer.allocate(r9)     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            pe3.b r8 = r0.f332381d     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            byte[] r7 = r15.array()     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            byte[] r8 = r8.f257327a     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            java.lang.System.arraycopy(r8, r14, r7, r10, r9)     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            java.nio.ByteOrder r7 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            r15.order(r7)     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            int r7 = r15.getInt(r10)     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            byte[] r8 = r1.f317240r     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            int r15 = r14 + r12
            java.lang.System.arraycopy(r8, r10, r11, r15, r9)     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            int r14 = r14 + 4
            pe3.b r8 = r0.f332381d     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            int r15 = r14 + r12
            byte[] r8 = r8.f257327a     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            java.lang.System.arraycopy(r8, r14, r11, r15, r7)     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            int r14 = r14 + r7
            int r8 = r7 + 4
            int r3 = r3 - r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            r8.<init>()     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            java.lang.String r15 = "steve: nTmpLen :"
            r8.append(r15)     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            r8.append(r7)     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            java.lang.String r7 = ", framelen:"
            r8.append(r7)     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            r8.append(r13)     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            java.lang.String r7 = ", naluType:"
            r8.append(r7)     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            r8.append(r2)     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            java.lang.String r7 = r8.toString()     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r7)     // Catch:{ Exception -> 0x026d, OutOfMemoryError -> 0x0246 }
            if (r3 > 0) goto L_0x0244
            goto L_0x0295
        L_0x0244:
            r8 = 1
            goto L_0x01ef
        L_0x0246:
            r0 = move-exception
            boolean r2 = r1.f317232g
            if (r2 == 0) goto L_0x0251
            int r2 = r1.f317243u
            r2 = r2 | r9
            r1.f317243u = r2
            goto L_0x0256
        L_0x0251:
            int r2 = r1.f317242t
            r2 = r2 | r9
            r1.f317242t = r2
        L_0x0256:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            return r6
        L_0x026d:
            r0 = move-exception
            boolean r2 = r1.f317232g
            if (r2 == 0) goto L_0x0278
            int r2 = r1.f317243u
            r2 = r2 | r9
            r1.f317243u = r2
            goto L_0x027d
        L_0x0278:
            int r2 = r1.f317242t
            r2 = r2 | r9
            r1.f317242t = r2
        L_0x027d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            return r6
        L_0x0294:
            r11 = r0
        L_0x0295:
            r8 = 0
        L_0x0296:
            r2 = 8
            if (r8 == 0) goto L_0x03a4
            byte[] r0 = f317225w     // Catch:{ Exception -> 0x037a }
            if (r0 == 0) goto L_0x03a4
            byte[] r0 = f317226x     // Catch:{ Exception -> 0x037a }
            if (r0 == 0) goto L_0x03a4
            boolean r0 = r1.f317233h     // Catch:{ Exception -> 0x037a }
            if (r0 != 0) goto L_0x0378
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f317229d     // Catch:{ Exception -> 0x037a }
            if (r0 == 0) goto L_0x02cf
            r0.mo148223z()     // Catch:{ Exception -> 0x02b6 }
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f317229d     // Catch:{ Exception -> 0x02b6 }
            r0.mo148214p()     // Catch:{ Exception -> 0x02b6 }
            r3 = 0
            r1.f317229d = r3     // Catch:{ Exception -> 0x02b6 }
            goto L_0x02cf
        L_0x02b6:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x037a }
            r3.<init>()     // Catch:{ Exception -> 0x037a }
            java.lang.String r4 = " decoder stop  error:"
            r3.append(r4)     // Catch:{ Exception -> 0x037a }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x037a }
            r3.append(r0)     // Catch:{ Exception -> 0x037a }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x037a }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)     // Catch:{ Exception -> 0x037a }
        L_0x02cf:
            boolean r0 = r1.f317232g     // Catch:{ Exception -> 0x037a }
            if (r0 == 0) goto L_0x02df
            java.lang.String r0 = "video/hevc"
            int r3 = f317227y     // Catch:{ Exception -> 0x037a }
            int r4 = f317228z     // Catch:{ Exception -> 0x037a }
            android.media.MediaFormat r0 = android.media.MediaFormat.createVideoFormat(r0, r3, r4)     // Catch:{ Exception -> 0x037a }
            goto L_0x02ea
        L_0x02df:
            java.lang.String r0 = "video/avc"
            int r3 = f317227y     // Catch:{ Exception -> 0x037a }
            int r4 = f317228z     // Catch:{ Exception -> 0x037a }
            android.media.MediaFormat r0 = android.media.MediaFormat.createVideoFormat(r0, r3, r4)     // Catch:{ Exception -> 0x037a }
        L_0x02ea:
            java.lang.String r3 = "rotation-degrees"
            r4 = 90
            r0.setInteger(r3, r4)     // Catch:{ Exception -> 0x037a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x037a }
            r3.<init>()     // Catch:{ Exception -> 0x037a }
            java.lang.String r4 = "create HW decoder, format : "
            r3.append(r4)     // Catch:{ Exception -> 0x037a }
            r3.append(r0)     // Catch:{ Exception -> 0x037a }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x037a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)     // Catch:{ Exception -> 0x037a }
            java.lang.String r3 = "mime"
            java.lang.String r3 = r0.getString(r3)     // Catch:{ Exception -> 0x037a }
            java.lang.String r4 = "video/"
            boolean r4 = r3.startsWith(r4)     // Catch:{ Exception -> 0x037a }
            if (r4 == 0) goto L_0x0378
            com.tencent.mm.compatible.deviceinfo.a r4 = com.tencent.p014mm.compatible.deviceinfo.C104619a.m140211c(r3)     // Catch:{ Exception -> 0x037a }
            r1.f317229d = r4     // Catch:{ Exception -> 0x037a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0348 }
            r4.<init>()     // Catch:{ Exception -> 0x0348 }
            java.lang.String r7 = "configure, format : "
            r4.append(r7)     // Catch:{ Exception -> 0x0348 }
            r4.append(r0)     // Catch:{ Exception -> 0x0348 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0348 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r4)     // Catch:{ Exception -> 0x0348 }
            com.tencent.mm.compatible.deviceinfo.a r4 = r1.f317229d     // Catch:{ Exception -> 0x0348 }
            android.view.Surface r7 = r1.f317230e     // Catch:{ Exception -> 0x0348 }
            r8 = 0
            r4.mo148202a(r0, r7, r8, r10)     // Catch:{ Exception -> 0x0348 }
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f317229d     // Catch:{ Exception -> 0x037a }
            r0.mo148222y()     // Catch:{ Exception -> 0x037a }
            r3 = 1
            r1.f317233h = r3     // Catch:{ Exception -> 0x037a }
            boolean r0 = r1.f317238p     // Catch:{ Exception -> 0x037a }
            if (r0 != 0) goto L_0x0378
            r19.start()     // Catch:{ Exception -> 0x037a }
            r1.f317238p = r3     // Catch:{ Exception -> 0x037a }
            goto L_0x0378
        L_0x0348:
            r0 = move-exception
            boolean r4 = r1.f317232g     // Catch:{ Exception -> 0x037a }
            if (r4 == 0) goto L_0x0353
            int r4 = r1.f317243u     // Catch:{ Exception -> 0x037a }
            r4 = r4 | r2
            r1.f317243u = r4     // Catch:{ Exception -> 0x037a }
            goto L_0x0358
        L_0x0353:
            int r4 = r1.f317242t     // Catch:{ Exception -> 0x037a }
            r4 = r4 | r2
            r1.f317242t = r4     // Catch:{ Exception -> 0x037a }
        L_0x0358:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x037a }
            r4.<init>()     // Catch:{ Exception -> 0x037a }
            java.lang.String r7 = "codec '"
            r4.append(r7)     // Catch:{ Exception -> 0x037a }
            r4.append(r3)     // Catch:{ Exception -> 0x037a }
            java.lang.String r3 = "' failed configuration. "
            r4.append(r3)     // Catch:{ Exception -> 0x037a }
            r4.append(r0)     // Catch:{ Exception -> 0x037a }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x037a }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)     // Catch:{ Exception -> 0x037a }
            r19.mo152555a()     // Catch:{ Exception -> 0x037a }
            return r6
        L_0x0378:
            r2 = 1
            return r2
        L_0x037a:
            r0 = move-exception
            boolean r3 = r1.f317232g
            if (r3 == 0) goto L_0x0386
            int r3 = r1.f317243u
            r3 = r3 | 16
            r1.f317243u = r3
            goto L_0x038c
        L_0x0386:
            int r3 = r1.f317242t
            r3 = r3 | 16
            r1.f317242t = r3
        L_0x038c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = " error:"
            r3.append(r4)
            java.lang.String r0 = r0.toString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x03a4:
            boolean r0 = r1.f317233h
            if (r0 != 0) goto L_0x03ae
            java.lang.String r0 = "DECODER_THREAD:: decoder not ready yet"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            return r6
        L_0x03ae:
            boolean r0 = r1.f317235j
            if (r0 != 0) goto L_0x03b5
            r3 = 1
            r1.f317235j = r3
        L_0x03b5:
            int r15 = r11.length
            boolean r0 = r1.f317232g
            r3 = 73
            r4 = 32
            r6 = 80
            if (r0 == 0) goto L_0x03d6
            byte r0 = r11[r9]
            r0 = r0 & 126(0x7e, float:1.77E-43)
            r2 = 1
            int r0 = r0 >> r2
            if (r0 == r4) goto L_0x03ea
            r2 = 33
            if (r0 != r2) goto L_0x03cd
            goto L_0x03ea
        L_0x03cd:
            r2 = 19
            if (r0 == r2) goto L_0x03ec
            r2 = 39
            if (r0 != r2) goto L_0x03e7
            goto L_0x03ec
        L_0x03d6:
            byte r0 = r11[r9]
            r0 = r0 & 31
            r7 = 7
            if (r0 == r7) goto L_0x03ea
            if (r0 != r2) goto L_0x03e0
            goto L_0x03ea
        L_0x03e0:
            r2 = 5
            if (r0 == r2) goto L_0x03ec
            r2 = 6
            if (r0 != r2) goto L_0x03e7
            goto L_0x03ec
        L_0x03e7:
            r3 = 80
            goto L_0x03ec
        L_0x03ea:
            r3 = 83
        L_0x03ec:
            boolean r0 = r1.f317236n
            r2 = 28
            if (r0 == 0) goto L_0x0413
            if (r3 != r6) goto L_0x0413
            r7 = 1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r7)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r3)
            r0.put(r7)
            com.tencent.mm.plugin.voip.model.r r3 = r1.f317239q
            com.tencent.mm.plugin.voip.model.v2protocal r3 = r3.f317500x
            byte[] r0 = r0.array()
            r3.setAppCmd(r2, r0, r7)
            java.lang.String r0 = "DECODER_THREAD:: IRequest, not decodeable!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            r0 = -2
            return r0
        L_0x0413:
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f317229d
            r7 = 10000(0x2710, double:4.9407E-320)
            int r13 = r0.mo148204f(r7)
            if (r13 < 0) goto L_0x0486
            if (r15 <= 0) goto L_0x04b4
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "steve: (10000us)put data into inputbuffer,idx="
            r0.append(r4)
            r0.append(r13)
            java.lang.String r4 = ", frameLen="
            r0.append(r4)
            r0.append(r15)
            java.lang.String r4 = ", frmType="
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = ", inputpts="
            r0.append(r3)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f317229d
            java.nio.ByteBuffer r0 = r0.mo148207i(r13)
            r0.clear()
            r0.put(r11, r10, r15)
            com.tencent.mm.compatible.deviceinfo.a r12 = r1.f317229d
            r14 = 0
            r18 = 0
            r16 = r6
            r12.mo148213o(r13, r14, r15, r16, r18)
            r1.f317237o = r10
            boolean r0 = r1.f317236n
            if (r0 == 0) goto L_0x04b4
            r3 = 1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r3)
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r4)
            r0.put(r10)
            com.tencent.mm.plugin.voip.model.r r4 = r1.f317239q
            com.tencent.mm.plugin.voip.model.v2protocal r4 = r4.f317500x
            byte[] r0 = r0.array()
            r4.setAppCmd(r2, r0, r3)
            r1.f317236n = r10
            goto L_0x04b4
        L_0x0486:
            boolean r0 = r1.f317236n
            if (r0 == 0) goto L_0x049b
            if (r3 == r6) goto L_0x049b
            boolean r0 = r1.f317232g
            if (r0 == 0) goto L_0x0496
            int r0 = r1.f317243u
            r0 = r0 | r4
            r1.f317243u = r0
            goto L_0x049b
        L_0x0496:
            int r0 = r1.f317242t
            r0 = r0 | r4
            r1.f317242t = r0
        L_0x049b:
            boolean r0 = r1.f317232g
            if (r0 == 0) goto L_0x04a6
            int r0 = r1.f317243u
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.f317243u = r0
            goto L_0x04ac
        L_0x04a6:
            int r0 = r1.f317242t
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.f317242t = r0
        L_0x04ac:
            r19.mo152555a()
            java.lang.String r0 = "steve: fail to input data into mediacodec inputbuffer!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x04b4:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.model.C106339e.mo152556b(byte[], int, boolean, boolean):int");
    }

    /* renamed from: c */
    public void mo152557c() {
        if (this.f317229d != null) {
            this.f317233h = false;
        }
    }

    /* renamed from: d */
    public String mo152558d(byte[] bArr) {
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

    /* renamed from: e */
    public boolean mo152559e(byte[] bArr, int i) {
        String d = mo152558d(bArr);
        String d2 = mo152558d(new byte[]{0, 0, 3});
        Log.m105918d("MicroMsg.AvcDecoder", "parent: " + d + ", child:" + d2);
        int indexOf = d.indexOf(d2, i);
        if (indexOf == -1) {
            return false;
        }
        Log.m105918d("MicroMsg.AvcDecoder", "hack code detected!!pos: " + indexOf);
        return true;
    }

    public void run() {
        C104619a aVar;
        while (!Thread.interrupted() && this.f317234i) {
            if (this.f317229d == null || !this.f317233h || !this.f317235j) {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    InterruptedException interruptedException = e;
                    Log.m105920e("MicroMsg.AvcDecoder", " error:" + interruptedException.toString());
                }
            } else {
                try {
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    int g = this.f317229d.mo148205g(bufferInfo, 10000);
                    Log.m105918d("MicroMsg.AvcDecoder", "steve:  outIndex=" + g);
                    if (g == -3) {
                        Log.m105918d("MicroMsg.AvcDecoder", "INFO_OUTPUT_BUFFERS_CHANGED");
                    } else if (g == -2) {
                        MediaFormat n = this.f317229d.mo148212n();
                        Log.m105924i("MicroMsg.AvcDecoder", "DECODER_THREAD:: New format : " + n);
                        int integer = n.getInteger("width");
                        int integer2 = n.getInteger("height");
                        if (C112595h.f337169d) {
                            if (n.containsKey("crop-left") && n.containsKey("crop-right")) {
                                integer = (n.getInteger("crop-right") + 1) - n.getInteger("crop-left");
                            }
                            if (n.containsKey("crop-top") && n.containsKey("crop-bottom")) {
                                integer2 = (n.getInteger("crop-bottom") + 1) - n.getInteger("crop-top");
                            }
                        }
                        C106377r rVar = this.f317239q;
                        if (rVar != null) {
                            rVar.f317470U.post(new C106392s(rVar, integer2, integer));
                        }
                    } else if (g == -1) {
                        Log.m105918d("MicroMsg.AvcDecoder", "DECODER_THREAD:: dequeueOutputBuffer timed out!");
                    } else if (bufferInfo.size > 0) {
                        long j = bufferInfo.presentationTimeUs;
                        Log.m105918d("MicroMsg.AvcDecoder", "DECODER_THREAD:: decoded SUCCESSFULLY!!! cnt : " + this.f317241s + ", size:" + bufferInfo.size + ", pts:" + bufferInfo.presentationTimeUs + ", latency:" + (System.currentTimeMillis() - j));
                        this.f317241s = this.f317241s + 1;
                        this.f317229d.mo148216r(g, true);
                        long currentTimeMillis = System.currentTimeMillis();
                        Log.m105918d("MicroMsg.AvcDecoder", "steve: Avcdecoder frame processTime = " + (currentTimeMillis - j) + ", decFrameCnt=" + this.f317241s + ", endTime=" + currentTimeMillis);
                    } else {
                        Log.m105918d("MicroMsg.AvcDecoder", "steve: drop frame: " + this.f317241s + ", size:" + bufferInfo.size + ", pts:" + bufferInfo.presentationTimeUs);
                        this.f317229d.mo148216r(g, false);
                    }
                } catch (Exception e2) {
                    if (this.f317232g) {
                        this.f317243u |= 128;
                    } else {
                        this.f317242t |= 128;
                    }
                    mo152555a();
                    Log.m105920e("MicroMsg.AvcDecoder", " dequeueOutputBuffer/releaseOutputBuffer error:" + e2.toString());
                }
            }
        }
        if (!this.f317234i && (aVar = this.f317229d) != null) {
            try {
                aVar.mo148223z();
                this.f317229d.mo148214p();
                this.f317229d = null;
            } catch (Exception e3) {
                Log.m105920e("MicroMsg.AvcDecoder", " decoder stop  error:" + e3.toString());
            }
        }
    }
}
