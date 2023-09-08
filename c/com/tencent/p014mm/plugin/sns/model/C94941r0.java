package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import java.util.Vector;
import jr2.C99014h;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import os2.C100399d0;
import te3.b94;
import te3.c94;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.model.r0 */
public class C94941r0 extends C117747y implements C1311n, C99014h {

    /* renamed from: E */
    public static Vector<String> f275154E = new Vector<>();

    /* renamed from: A */
    public int f275155A;

    /* renamed from: B */
    public int f275156B;

    /* renamed from: C */
    public int f275157C;

    /* renamed from: D */
    public int f275158D;

    /* renamed from: d */
    public C47350c f275159d;

    /* renamed from: e */
    public String f275160e;

    /* renamed from: f */
    public boolean f275161f;

    /* renamed from: g */
    public boolean f275162g;

    /* renamed from: h */
    public long f275163h;

    /* renamed from: i */
    public long f275164i;

    /* renamed from: j */
    public long f275165j;

    /* renamed from: n */
    public int f275166n;

    /* renamed from: o */
    public boolean f275167o;

    /* renamed from: p */
    public String f275168p;

    /* renamed from: q */
    public String f275169q;

    /* renamed from: r */
    public long f275170r;

    /* renamed from: s */
    public boolean f275171s;

    /* renamed from: t */
    public boolean f275172t;

    /* renamed from: u */
    public boolean f275173u;

    /* renamed from: v */
    public boolean f275174v;

    /* renamed from: w */
    public int f275175w;

    /* renamed from: x */
    public int f275176x;

    /* renamed from: y */
    public C11385n f275177y;

    /* renamed from: z */
    public long f275178z;

    public C94941r0(String str, long j, boolean z, int i, int i2, int i3, int i4, int i5) {
        this(str, j, z, i, i2, i3, i4, i5, 1);
    }

    /* renamed from: j1 */
    public static synchronized boolean m120520j1(String str) {
        synchronized (C94941r0.class) {
            SnsMethodCalculate.markStartTimeMs("addSnsUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
            if (f275154E.contains(str)) {
                SnsMethodCalculate.markEndTimeMs("addSnsUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
                return false;
            }
            f275154E.add(str);
            SnsMethodCalculate.markEndTimeMs("addSnsUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
            return true;
        }
    }

    /* renamed from: n1 */
    public static synchronized boolean m120521n1(String str) {
        synchronized (C94941r0.class) {
            SnsMethodCalculate.markStartTimeMs("removeUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
            f275154E.remove(str);
            SnsMethodCalculate.markEndTimeMs("removeUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        }
        return true;
    }

    /* renamed from: C */
    public String mo131161C() {
        SnsMethodCalculate.markStartTimeMs("getRecentTips", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        String str = this.f275169q;
        SnsMethodCalculate.markEndTimeMs("getRecentTips", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return str;
    }

    /* renamed from: C0 */
    public boolean mo131162C0() {
        SnsMethodCalculate.markStartTimeMs("isBgChange", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        boolean z = this.f275167o;
        SnsMethodCalculate.markEndTimeMs("isBgChange", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return z;
    }

    /* renamed from: D0 */
    public boolean mo131163D0() {
        SnsMethodCalculate.markStartTimeMs("isPrivacy", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        boolean z = this.f275174v;
        SnsMethodCalculate.markEndTimeMs("isPrivacy", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return z;
    }

    /* renamed from: M0 */
    public int mo131164M0() {
        SnsMethodCalculate.markStartTimeMs("getFetchMode", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        int i = this.f275155A;
        SnsMethodCalculate.markEndTimeMs("getFetchMode", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return i;
    }

    /* renamed from: Z0 */
    public boolean mo131165Z0() {
        SnsMethodCalculate.markStartTimeMs("isFp", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        boolean z = this.f275161f;
        SnsMethodCalculate.markEndTimeMs("isFp", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return z;
    }

    /* renamed from: a0 */
    public long mo131166a0() {
        SnsMethodCalculate.markStartTimeMs("getUserLastId", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        long j = this.f275165j;
        SnsMethodCalculate.markEndTimeMs("getUserLastId", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return j;
    }

    public final int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        this.f275177y = nVar;
        int dispatch = dispatch(gVar, this.f275159d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return dispatch;
    }

    /* renamed from: g1 */
    public boolean mo131167g1() {
        SnsMethodCalculate.markStartTimeMs("isUpAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        boolean z = this.f275172t;
        SnsMethodCalculate.markEndTimeMs("isUpAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return z;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return 212;
    }

    public String getUserName() {
        SnsMethodCalculate.markStartTimeMs("getUserName", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        String str = this.f275160e;
        SnsMethodCalculate.markEndTimeMs("getUserName", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return str;
    }

    /* renamed from: k */
    public boolean mo131169k() {
        SnsMethodCalculate.markStartTimeMs("isUpFetchFinish", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        SnsMethodCalculate.markEndTimeMs("isUpFetchFinish", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return false;
    }

    /* renamed from: k1 */
    public final void mo131219k1(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("checkLocalData", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        int X90 = C94866e1.Yx0().X90(11, this.f275160e, this.f275162g);
        if (X90 <= 10 && X90 > 0 && i == 0 && i2 == 0) {
            this.f275173u = true;
        } else if (X90 == 0) {
            this.f275171s = true;
        }
        SnsMethodCalculate.markEndTimeMs("checkLocalData", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
    }

    /* renamed from: l1 */
    public final void mo131220l1(c94 c94, String str) {
        SnsMethodCalculate.markStartTimeMs("insertListAndUpdateFaultInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        C94897n1.m120370h(this.f275160e, this.f275175w, c94.f298008f, str);
        long j = this.f275164i;
        if (j == 0) {
            this.f275164i = c94.f298008f.getFirst().f283891Id;
        } else {
            this.f275164i = C43038l.m46673a(j);
        }
        this.f275165j = c94.f298008f.getLast().f283891Id;
        Log.m105925i("MicroMsg.NetSceneSnsUserPage", "insertListAndUpdateFaultInfo userName %s maxId %s minId %s NewRequestTime %s", this.f275160e, C102236a0.m134765q0(this.f275164i), C102236a0.m134765q0(this.f275165j), Integer.valueOf(c94.f298011i));
        C43038l.m46676d(this.f275160e, this.f275164i, this.f275165j, c94.f298011i);
        SnsMethodCalculate.markEndTimeMs("insertListAndUpdateFaultInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
    }

    /* renamed from: m1 */
    public final boolean mo131221m1() {
        SnsMethodCalculate.markStartTimeMs("isAlbumSelf", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        boolean z = this.f275175w == 64;
        SnsMethodCalculate.markEndTimeMs("isAlbumSelf", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return z;
    }

    /* renamed from: n0 */
    public boolean mo131173n0() {
        SnsMethodCalculate.markStartTimeMs("isOtherFetch", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        int i = this.f275155A;
        boolean z = true;
        if (!(i == 0 || i == 2 || i == 1)) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isOtherFetch", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x0704  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0739  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r30, int r31, int r32, java.lang.String r33, com.tencent.p014mm.network.C114799u r34, byte[] r35) {
        /*
            r29 = this;
            r0 = r29
            r1 = r31
            r2 = r32
            r3 = r33
            java.lang.String r4 = "onGYNetEnd"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "netId : "
            r6.append(r7)
            r7 = r30
            r6.append(r7)
            java.lang.String r7 = " errType :"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = " errCode: "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = " errMsg :"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.NetSceneSnsUserPage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            r6 = r34
            ob0.c r6 = (ob0.C47350c) r6
            ob0.c$d r6 = r6.f127056b
            pe3.a r6 = r6.f127083a
            te3.c94 r6 = (te3.c94) r6
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "ShowWithTaEntrance_"
            r9.append(r10)
            java.lang.String r11 = r0.f275160e
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r11 = 0
            boolean r8 = r8.getBoolean(r9, r11)
            r9 = 1
            if (r8 != 0) goto L_0x0086
            int r8 = r6.f298021v
            if (r8 <= 0) goto L_0x0086
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            java.lang.String r10 = r0.f275160e
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r8.encode((java.lang.String) r10, (boolean) r9)
        L_0x0086:
            r8 = 4
            r10 = 3
            if (r6 == 0) goto L_0x00dd
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r13 = r6.f298008f
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r13)
            if (r13 != 0) goto L_0x00dd
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r13 = r6.f298008f
            java.util.Iterator r13 = r13.iterator()
        L_0x0098:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x00dd
            java.lang.Object r14 = r13.next()
            com.tencent.mm.protocal.protobuf.SnsObject r14 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r14
            if (r14 == 0) goto L_0x00d7
            java.lang.Object[] r15 = new java.lang.Object[r8]
            int r8 = r14.CreateTime
            r35 = r13
            long r12 = (long) r8
            java.lang.String r8 = vr2.C102236a0.m134772u(r12)
            r15[r11] = r8
            int r8 = r14.CreateTime
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r15[r9] = r8
            long r12 = r14.f283891Id
            java.lang.String r8 = vr2.C102236a0.m134763p0(r12)
            r12 = 2
            r15[r12] = r8
            long r12 = r14.f283891Id
            java.lang.Long r8 = java.lang.Long.valueOf(r12)
            r15[r10] = r8
            java.lang.String r8 = "[SnsFeedInfo|s] createTime:%s[%s] snsId:[%s, %s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r15)
            vr2.b0$a r8 = vr2.C65874b0.f189421a
            r8.mo89928g(r7, r14, r9)
            goto L_0x00d9
        L_0x00d7:
            r35 = r13
        L_0x00d9:
            r13 = r35
            r8 = 4
            goto L_0x0098
        L_0x00dd:
            int r8 = r0.f275155A
            r12 = -1
            java.lang.String r13 = "error: server give size zero"
            java.lang.String r14 = ", requestTime:"
            java.lang.String r15 = ", ContinueID:"
            java.lang.String r10 = ", retTips:"
            java.lang.String r9 = "doFetchByContinueID"
            r11 = 207(0xcf, float:2.9E-43)
            r19 = r13
            r20 = r14
            r13 = 0
            if (r8 != r12) goto L_0x0629
            java.lang.String r8 = "handleNormalRequest"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r5)
            ob0.c r12 = r0.f275159d
            ob0.c$d r12 = r12.f127056b
            int r12 = r12.getRetCode()
            if (r12 == r11) goto L_0x012a
            ob0.c r12 = r0.f275159d
            ob0.c$d r12 = r12.f127056b
            int r12 = r12.getRetCode()
            if (r12 == 0) goto L_0x012a
            ob0.c r12 = r0.f275159d
            ob0.c$d r12 = r12.f127056b
            int r12 = r12.getRetCode()
            boolean r12 = com.tencent.p014mm.storage.C96986x1.m124656a(r12)
            if (r12 != 0) goto L_0x012a
            java.lang.String r6 = r0.f275160e
            m120521n1(r6)
            ob0.n r6 = r0.f275177y
            r6.onSceneEnd(r1, r2, r3, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r5)
            goto L_0x0288
        L_0x012a:
            long r11 = r6.f298015p
            int r22 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r22 == 0) goto L_0x0154
            int r13 = r0.f275158D
            r14 = 10
            if (r13 > r14) goto L_0x0154
            ob0.c r13 = r0.f275159d
            ob0.c$c r13 = r13.f127055a
            pe3.a r13 = r13.f127080a
            te3.b94 r13 = (te3.b94) r13
            r13.f297949f = r11
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r5)
            com.tencent.mm.sdk.platformtools.MMHandler r11 = com.tencent.p014mm.plugin.sns.model.C94866e1.my0()
            com.tencent.mm.plugin.sns.model.q0 r12 = new com.tencent.mm.plugin.sns.model.q0
            r12.<init>(r0, r13)
            r11.post(r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r5)
            r9 = 1
            goto L_0x0155
        L_0x0154:
            r9 = 0
        L_0x0155:
            ob0.c r11 = r0.f275159d
            ob0.c$d r11 = r11.f127056b
            int r11 = r11.getRetCode()
            r12 = 2003(0x7d3, float:2.807E-42)
            if (r11 != r12) goto L_0x016a
            os2.e0 r11 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r12 = r0.f275160e
            r11.mo139823kD(r12)
        L_0x016a:
            java.lang.String r11 = r6.f298016q
            r0.f275169q = r11
            int r11 = r6.f298012j
            r0.f275176x = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "ForSameMd5 count: "
            r11.append(r12)
            int r12 = r6.f298012j
            r11.append(r12)
            java.lang.String r12 = " , objCount:"
            r11.append(r12)
            int r12 = r6.f298007e
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r0.f275169q
            r11.append(r10)
            r11.append(r15)
            long r12 = r6.f298015p
            java.lang.String r10 = vr2.C102236a0.m134765q0(r12)
            r11.append(r10)
            r12 = r20
            r11.append(r12)
            int r10 = r0.f275158D
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
            long r10 = r6.f298014o
            r0.f275178z = r10
            long r10 = r0.f275164i
            java.lang.String r10 = vr2.C102236a0.m134763p0(r10)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r11 = r6.f298008f
            int r11 = r11.size()
            r0.f275157C = r11
            boolean r11 = r0.f275161f
            if (r11 != 0) goto L_0x0222
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "np  "
            r11.append(r12)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r12 = r6.f298008f
            int r12 = r12.size()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r11)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r7 = r6.f298008f
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x020f
            if (r9 != 0) goto L_0x0212
            ob0.c r6 = r0.f275159d
            ob0.c$d r6 = r6.f127056b
            int r6 = r6.getRetCode()
            r7 = 203(0xcb, float:2.84E-43)
            if (r6 != r7) goto L_0x01f9
            r11 = 1
            goto L_0x01fa
        L_0x01f9:
            r11 = 0
        L_0x01fa:
            r0.f275174v = r11
            os2.e0 r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r7 = r0.f275160e
            boolean r11 = r0.f275162g
            r6.Bx0(r7, r11, r10)
            r6 = 1
            r0.f275171s = r6
            long r6 = r0.f275164i
            r0.f275165j = r6
            goto L_0x0212
        L_0x020f:
            r0.mo131220l1(r6, r10)
        L_0x0212:
            if (r9 != 0) goto L_0x0219
            java.lang.String r6 = r0.f275160e
            m120521n1(r6)
        L_0x0219:
            ob0.n r6 = r0.f275177y
            r6.onSceneEnd(r1, r2, r3, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r5)
            goto L_0x0288
        L_0x0222:
            os2.d0 r11 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()
            java.lang.String r12 = r0.f275160e
            java.util.LinkedList<te3.q94> r13 = r6.f298018s
            r11.mo139777NQ(r12, r13)
            java.lang.String r11 = r0.f275168p
            java.lang.String r12 = r6.f298006d
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x028b
            os2.e0 r23 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            boolean r6 = r0.f275161f
            if (r6 == 0) goto L_0x0242
            r24 = 0
            goto L_0x0246
        L_0x0242:
            long r13 = r0.f275163h
            r24 = r13
        L_0x0246:
            int r6 = r0.f275176x
            java.lang.String r10 = r0.f275160e
            boolean r11 = r0.f275162g
            r26 = r6
            r27 = r10
            r28 = r11
            long r10 = r23.Ab0(r24, r26, r27, r28)
            r0.f275165j = r10
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r11 = 0
            r6[r11] = r10
            java.lang.String r10 = "md5 is nochange the new minid %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r6)
            r0.mo131219k1(r1, r2)
            if (r9 != 0) goto L_0x0272
            java.lang.String r1 = r0.f275160e
            m120521n1(r1)
        L_0x0272:
            os2.d0 r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()
            java.lang.String r2 = r0.f275160e
            os2.c0 r1 = r1.mo139782Yt(r2)
            ob0.n r2 = r0.f275177y
            int r6 = r1.field_lastFirstPageRequestErrType
            int r1 = r1.field_lastFirstPageRequestErrCode
            r2.onSceneEnd(r6, r1, r3, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r5)
        L_0x0288:
            r1 = r4
            goto L_0x07be
        L_0x028b:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "fp  "
            r11.append(r12)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r12 = r6.f298008f
            int r12 = r12.size()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r11)
            java.lang.String r11 = "readfpInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r5)
            boolean r12 = r0.f275161f
            if (r12 == 0) goto L_0x04e9
            java.lang.String r12 = r0.f275168p
            java.lang.String r13 = r6.f298006d
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x02bb
            goto L_0x04e9
        L_0x02bb:
            int r12 = r6.f298009g
            r0.f275166n = r12
            os2.d0 r12 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()
            java.lang.String r13 = r0.f275160e
            os2.c0 r12 = r12.mo139782Yt(r13)
            int r13 = r0.f275166n
            r12.field_icount = r13
            te3.a94 r13 = r6.f298010h
            if (r13 == 0) goto L_0x04c8
            long r14 = r13.f130394f
            java.lang.String r14 = vr2.C102236a0.m134765q0(r14)
            java.lang.String r15 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            r20 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r30 = r10
            java.lang.String r10 = r0.f275160e
            r4.append(r10)
            java.lang.String r10 = "bg_"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r17 = r8
            java.lang.String r8 = r0.f275160e
            r10.append(r8)
            java.lang.String r8 = "tbg_"
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r10 = 2
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r10 = r12.field_bgId
            r16 = 0
            r1[r16] = r10
            r10 = 1
            r1[r10] = r14
            java.lang.String r10 = "current ext bg id:%s net_id:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r1)
            java.lang.String r1 = r12.field_bgUrl
            if (r1 == 0) goto L_0x0325
            java.lang.String r1 = r12.field_bgId
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x0381
        L_0x0325:
            java.lang.String r1 = r12.field_bgId
            r12.field_older_bgId = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r10 = r0.f275160e
            java.lang.String r10 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r15, r10)
            r1.append(r10)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r1 == 0) goto L_0x0365
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r10 = r0.f275160e
            java.lang.String r10 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r15, r10)
            r1.append(r10)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r1)
            java.lang.String r1 = r0.f275160e
            java.lang.String r1 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r15, r1)
            com.tencent.p014mm.vfs.C86013q1.m106435Q(r1, r4, r8)
        L_0x0365:
            r1 = 1
            r0.f275167o = r1
            r12.mo139772o2()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "get new  bgid "
            r1.append(r4)
            java.lang.String r4 = r13.f130393e
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
        L_0x0381:
            r12.field_bgId = r14
            java.lang.String r1 = r13.f130393e
            r12.field_bgUrl = r1
            os2.d0 r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()
            java.lang.String r4 = r13.f130393e
            java.lang.String r8 = r0.f275160e
            r1.mo139786jo(r12, r4, r8)
            long r14 = r13.f130394f
            r12.field_snsBgId = r14
            os2.z r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Ux0()
            java.lang.String r4 = r0.f275160e
            os2.y r1 = r1.mo139909Yt(r4)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            boolean r8 = r0.f275167o
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r10 = 0
            r4[r10] = r8
            long r14 = r1.field_snsBgId
            java.lang.String r8 = vr2.C102236a0.m134765q0(r14)
            r10 = 1
            r4[r10] = r8
            long r14 = r13.f130394f
            java.lang.String r8 = vr2.C102236a0.m134765q0(r14)
            r10 = 2
            r4[r10] = r8
            java.lang.String r8 = "isBgChange:%b  coverId:%s extId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r4)
            boolean r4 = r0.f275167o
            if (r4 != 0) goto L_0x03d7
            long r14 = r1.field_snsBgId
            long r1 = r13.f130394f
            int r4 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x03d1
            goto L_0x03d7
        L_0x03d1:
            r23 = r6
            r24 = r7
            goto L_0x04d2
        L_0x03d7:
            os2.z r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Ux0()
            java.lang.String r2 = r0.f275160e
            r1.getClass()
            java.lang.String r4 = "updateUserSnsCoverNetScene"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.storage.SnsCoverStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r8)
            java.lang.String r10 = "userName"
            gy3.C87412m.m108594g(r2, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r14 = "updateUserSnsCoverNetScene "
            r10.append(r14)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            java.lang.String r14 = "MicroMsg.SnsCoverStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r10)
            os2.z r10 = com.tencent.p014mm.plugin.sns.model.C94866e1.Ux0()
            os2.y r10 = r10.mo139909Yt(r2)
            r23 = r6
            r24 = r7
            long r6 = r10.field_snsBgId
            r35 = r11
            r34 = r12
            long r11 = r13.f130394f
            java.lang.String r15 = "user:"
            int r18 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r18 != 0) goto L_0x0490
            r6 = 0
            int r18 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r18 == 0) goto L_0x0490
            java.lang.String r6 = r13.f130393e
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0488
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r15)
            r6.append(r2)
            java.lang.String r2 = " has been block"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
            java.lang.String r2 = "reportCoverBlock"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r6)
            com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct r7 = new com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct
            r7.<init>()
            java.lang.String r11 = r10.getUserName()
            java.lang.String r12 = "UserName"
            r14 = 1
            java.lang.String r11 = r7.mo86045b(r12, r11, r14)
            r7.f265989f = r11
            r11 = 5
            r7.f265987d = r11
            java.lang.String r12 = r10.toString()
            java.lang.String r14 = "snsCover.toString()"
            gy3.C87412m.m108593f(r12, r14)
            java.lang.String r14 = ","
            java.lang.String r15 = ";"
            r11 = 0
            java.lang.String r11 = z04.C112551y.m153814n(r12, r14, r15, r11)
            r7.mo126629s(r11)
            r7.mo86054n()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r6)
            r2 = 5
            r10.field_type = r2
            r2 = 1
            r1.mo139910bD(r10, r2)
            r1.mo139907Lo(r10)
        L_0x0488:
            boolean r2 = r10.field_success
            if (r2 == 0) goto L_0x04bd
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r8)
            goto L_0x04d6
        L_0x0490:
            r6 = 0
            int r18 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r18 != 0) goto L_0x04bd
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r15)
            r11.append(r2)
            java.lang.String r2 = " only chatting"
            r11.append(r2)
            java.lang.String r2 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
            r2 = 0
            r10.field_type = r2
            r10.field_snsBgId = r6
            r2 = 1
            r1.mo139910bD(r10, r2)
            r1.mo139907Lo(r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r8)
            goto L_0x04d6
        L_0x04bd:
            ct2.b r1 = r1.f294200f
            long r6 = r13.f130394f
            r1.mo136642e3(r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r8)
            goto L_0x04d6
        L_0x04c8:
            r20 = r4
            r23 = r6
            r24 = r7
            r17 = r8
            r30 = r10
        L_0x04d2:
            r35 = r11
            r34 = r12
        L_0x04d6:
            os2.d0 r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()
            r2 = r34
            r1.mo139775LL(r2)
            r1 = r35
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r5)
            r6 = r23
            r7 = r24
            goto L_0x050e
        L_0x04e9:
            r20 = r4
            r23 = r6
            r24 = r7
            r17 = r8
            r30 = r10
            r1 = r11
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = r0.f275168p
            r6 = 0
            r2[r6] = r4
            r6 = r23
            java.lang.String r4 = r6.f298006d
            r7 = 1
            r2[r7] = r4
            java.lang.String r4 = "jump readfpInfo for requestMd5:%s FirstPageMd5:%s"
            r7 = r24
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r5)
        L_0x050e:
            ob0.c r1 = r0.f275159d
            ob0.c$d r1 = r1.f127056b
            int r1 = r1.getRetCode()
            r2 = 207(0xcf, float:2.9E-43)
            if (r1 == r2) goto L_0x0597
            ob0.c r1 = r0.f275159d
            ob0.c$d r1 = r1.f127056b
            int r1 = r1.getRetCode()
            r2 = 2001(0x7d1, float:2.804E-42)
            if (r1 == r2) goto L_0x0597
            ob0.c r1 = r0.f275159d
            ob0.c$d r1 = r1.f127056b
            int r1 = r1.getRetCode()
            r2 = 2004(0x7d4, float:2.808E-42)
            if (r1 == r2) goto L_0x0597
            ob0.c r1 = r0.f275159d
            ob0.c$d r1 = r1.f127056b
            int r1 = r1.getRetCode()
            r2 = 2005(0x7d5, float:2.81E-42)
            if (r1 != r2) goto L_0x053f
            goto L_0x0597
        L_0x053f:
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r1 = r6.f298008f
            int r1 = r1.size()
            if (r1 != 0) goto L_0x055e
            if (r9 != 0) goto L_0x0557
            r1 = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r1)
            ob0.n r1 = r0.f275177y
            r2 = r31
            r4 = r32
            r1.onSceneEnd(r2, r4, r3, r0)
        L_0x0557:
            r1 = r17
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r5)
            goto L_0x0667
        L_0x055e:
            r2 = r31
            r4 = r32
            r1 = r17
            boolean r7 = r29.mo131221m1()
            if (r7 == 0) goto L_0x0576
            os2.d0 r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()
            java.lang.String r8 = r0.f275160e
            java.lang.String r10 = r6.f298006d
            r7.mo139780TE(r8, r10, r2, r4)
            goto L_0x0581
        L_0x0576:
            os2.d0 r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()
            java.lang.String r8 = r0.f275160e
            java.lang.String r10 = r6.f298006d
            r7.mo139788mI(r8, r10, r2, r4)
        L_0x0581:
            r7 = r30
            r0.mo131220l1(r6, r7)
            if (r9 != 0) goto L_0x058d
            java.lang.String r6 = r0.f275160e
            m120521n1(r6)
        L_0x058d:
            ob0.n r6 = r0.f275177y
            r6.onSceneEnd(r2, r4, r3, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r5)
            goto L_0x0667
        L_0x0597:
            r7 = r30
            r2 = r31
            r4 = r32
            r1 = r17
            os2.d0 r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()
            java.lang.String r10 = r0.f275160e
            java.lang.String r11 = ""
            r8.mo139785bO(r10, r11)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r8 = r6.f298008f
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x05c4
            if (r9 != 0) goto L_0x0616
            os2.e0 r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r7 = r0.f275160e
            boolean r8 = r0.f275162g
            r6.Ax0(r7, r8)
            long r6 = r0.f275164i
            r0.f275165j = r6
            goto L_0x0616
        L_0x05c4:
            boolean r8 = r29.mo131221m1()
            if (r8 == 0) goto L_0x05d6
            os2.d0 r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()
            java.lang.String r10 = r0.f275160e
            java.lang.String r11 = r6.f298006d
            r8.mo139780TE(r10, r11, r2, r4)
            goto L_0x05e1
        L_0x05d6:
            os2.d0 r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()
            java.lang.String r10 = r0.f275160e
            java.lang.String r11 = r6.f298006d
            r8.mo139788mI(r10, r11, r2, r4)
        L_0x05e1:
            os2.e0 r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r10 = r0.f275160e
            boolean r11 = r0.f275162g
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r12 = r6.f298008f
            java.lang.Object r12 = r12.getFirst()
            com.tencent.mm.protocal.protobuf.SnsObject r12 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r12
            long r12 = r12.f283891Id
            java.lang.String r12 = vr2.C102236a0.m134763p0(r12)
            r8.zx0(r10, r11, r12)
            os2.e0 r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r10 = r0.f275160e
            boolean r11 = r0.f275162g
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r12 = r6.f298008f
            java.lang.Object r12 = r12.getLast()
            com.tencent.mm.protocal.protobuf.SnsObject r12 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r12
            long r12 = r12.f283891Id
            java.lang.String r12 = vr2.C102236a0.m134763p0(r12)
            r8.Bx0(r10, r11, r12)
            r0.mo131220l1(r6, r7)
        L_0x0616:
            r0.mo131219k1(r2, r4)
            if (r9 != 0) goto L_0x0620
            java.lang.String r6 = r0.f275160e
            m120521n1(r6)
        L_0x0620:
            ob0.n r6 = r0.f275177y
            r6.onSceneEnd(r2, r4, r3, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r5)
            goto L_0x0667
        L_0x0629:
            r12 = r20
            r20 = r4
            r4 = r2
            r2 = r1
            r1 = r19
            java.lang.String r8 = "handleAdvanceRequest"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r5)
            ob0.c r11 = r0.f275159d
            ob0.c$d r11 = r11.f127056b
            int r11 = r11.getRetCode()
            r13 = 207(0xcf, float:2.9E-43)
            if (r11 == r13) goto L_0x066b
            ob0.c r11 = r0.f275159d
            ob0.c$d r11 = r11.f127056b
            int r11 = r11.getRetCode()
            if (r11 == 0) goto L_0x066b
            ob0.c r11 = r0.f275159d
            ob0.c$d r11 = r11.f127056b
            int r11 = r11.getRetCode()
            boolean r11 = com.tencent.p014mm.storage.C96986x1.m124656a(r11)
            if (r11 != 0) goto L_0x066b
            java.lang.String r1 = r0.f275160e
            m120521n1(r1)
            ob0.n r1 = r0.f275177y
            r1.onSceneEnd(r2, r4, r3, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r5)
        L_0x0667:
            r1 = r20
            goto L_0x07be
        L_0x066b:
            long r13 = r6.f298015p
            r21 = 0
            int r11 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r11 == 0) goto L_0x0699
            int r11 = r0.f275158D
            r19 = r8
            r8 = 10
            if (r11 > r8) goto L_0x069b
            ob0.c r8 = r0.f275159d
            ob0.c$c r8 = r8.f127055a
            pe3.a r8 = r8.f127080a
            te3.b94 r8 = (te3.b94) r8
            r8.f297949f = r13
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r5)
            com.tencent.mm.sdk.platformtools.MMHandler r11 = com.tencent.p014mm.plugin.sns.model.C94866e1.my0()
            com.tencent.mm.plugin.sns.model.q0 r13 = new com.tencent.mm.plugin.sns.model.q0
            r13.<init>(r0, r8)
            r11.post(r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r5)
            r8 = 1
            goto L_0x069c
        L_0x0699:
            r19 = r8
        L_0x069b:
            r8 = 0
        L_0x069c:
            java.lang.String r9 = r6.f298016q
            r0.f275169q = r9
            int r9 = r6.f298012j
            r0.f275176x = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "ForSameMd5: "
            r9.append(r11)
            int r11 = r6.f298012j
            r9.append(r11)
            java.lang.String r11 = " , objCount:  "
            r9.append(r11)
            int r11 = r6.f298007e
            r9.append(r11)
            r9.append(r10)
            java.lang.String r10 = r0.f275169q
            r9.append(r10)
            java.lang.String r10 = ", prePageDayEndFlag:"
            r9.append(r10)
            boolean r10 = r6.f298019t
            r9.append(r10)
            java.lang.String r10 = ", ObjectList:"
            r9.append(r10)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r10 = r6.f298008f
            int r10 = r10.size()
            r9.append(r10)
            r9.append(r15)
            long r10 = r6.f298015p
            java.lang.String r10 = vr2.C102236a0.m134765q0(r10)
            r9.append(r10)
            r9.append(r12)
            int r10 = r0.f275158D
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r9)
            long r9 = r6.f298014o
            r0.f275178z = r9
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r9 = r6.f298008f
            int r9 = r9.size()
            if (r9 != 0) goto L_0x0739
            if (r8 != 0) goto L_0x0732
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            ob0.c r1 = r0.f275159d
            ob0.c$d r1 = r1.f127056b
            int r1 = r1.getRetCode()
            r6 = 203(0xcb, float:2.84E-43)
            if (r1 != r6) goto L_0x0717
            r11 = 1
            goto L_0x0718
        L_0x0717:
            r11 = 0
        L_0x0718:
            r0.f275174v = r11
            int r1 = r0.f275155A
            r6 = 1
            if (r1 != r6) goto L_0x0722
            r0.f275172t = r6
            goto L_0x0724
        L_0x0722:
            r0.f275171s = r6
        L_0x0724:
            java.lang.String r1 = r0.f275160e
            m120521n1(r1)
            ob0.n r1 = r0.f275177y
            r1.onSceneEnd(r2, r4, r3, r0)
            long r1 = r0.f275164i
            r0.f275165j = r1
        L_0x0732:
            r1 = r19
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r5)
            goto L_0x0667
        L_0x0739:
            r1 = r19
            int r9 = r0.f275155A
            r10 = 1
            if (r9 != r10) goto L_0x0751
            boolean r9 = r6.f298019t
            if (r9 == 0) goto L_0x075f
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r9 = r6.f298008f
            java.lang.Object r9 = r9.getFirst()
            com.tencent.mm.protocal.protobuf.SnsObject r9 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r9
            long r9 = r9.f283891Id
            r0.f275170r = r9
            goto L_0x075f
        L_0x0751:
            if (r9 != 0) goto L_0x075f
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r9 = r6.f298008f
            java.lang.Object r9 = r9.getFirst()
            com.tencent.mm.protocal.protobuf.SnsObject r9 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r9
            long r9 = r9.f283891Id
            r0.f275170r = r9
        L_0x075f:
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r9 = r6.f298008f
            java.lang.Object r9 = r9.getFirst()
            com.tencent.mm.protocal.protobuf.SnsObject r9 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r9
            long r9 = r9.f283891Id
            java.lang.String r9 = vr2.C102236a0.m134763p0(r9)
            java.lang.String r10 = "insertSearchCacheList"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r5)
            java.lang.String r11 = r0.f275160e
            int r12 = r0.f275175w
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r13 = r6.f298008f
            com.tencent.p014mm.plugin.sns.model.C94897n1.m120370h(r11, r12, r13, r9)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r9 = r6.f298008f
            int r11 = r0.f275155A
            com.tencent.p014mm.plugin.sns.model.C94897n1.m120382t(r9, r11)
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r11 = r0.f275160e
            r12 = 0
            r9[r12] = r11
            long r11 = com.tencent.p014mm.plugin.sns.model.C94897n1.f274987a
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r12 = 1
            r9[r12] = r11
            long r11 = com.tencent.p014mm.plugin.sns.model.C94897n1.f274988b
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r12 = 2
            r9[r12] = r11
            int r6 = r6.f298011i
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r11 = 3
            r9[r11] = r6
            java.lang.String r6 = "insertSearchCacheList userName:%s maxId:%s minId:%s NewRequestTime:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r6, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r5)
            if (r8 != 0) goto L_0x07b4
            java.lang.String r6 = r0.f275160e
            m120521n1(r6)
        L_0x07b4:
            ob0.n r6 = r0.f275177y
            r6.onSceneEnd(r2, r4, r3, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r5)
            goto L_0x0667
        L_0x07be:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94941r0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }

    /* renamed from: p0 */
    public long mo131174p0() {
        SnsMethodCalculate.markStartTimeMs("getRecentLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        long j = this.f275178z;
        SnsMethodCalculate.markEndTimeMs("getRecentLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return j;
    }

    /* renamed from: t0 */
    public boolean mo131175t0() {
        SnsMethodCalculate.markStartTimeMs("isDownAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        boolean z = this.f275171s;
        SnsMethodCalculate.markEndTimeMs("isDownAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return z;
    }

    /* renamed from: w */
    public boolean mo131176w() {
        SnsMethodCalculate.markStartTimeMs("isNeedGetNextPage", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        boolean z = this.f275173u;
        SnsMethodCalculate.markEndTimeMs("isNeedGetNextPage", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return z;
    }

    /* renamed from: y */
    public int mo131177y() {
        SnsMethodCalculate.markStartTimeMs("respCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        int i = this.f275157C;
        SnsMethodCalculate.markEndTimeMs("respCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return i;
    }

    public C94941r0(String str, long j, boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
        String str2 = str;
        long j2 = j;
        int i7 = i;
        int i8 = i2;
        this.f275163h = 0;
        this.f275165j = 0;
        this.f275166n = 0;
        this.f275167o = false;
        this.f275168p = "";
        this.f275169q = "";
        this.f275170r = 0;
        this.f275171s = false;
        this.f275172t = false;
        this.f275173u = false;
        this.f275174v = false;
        this.f275176x = 0;
        this.f275156B = 0;
        this.f275157C = 0;
        this.f275158D = i6;
        this.f275160e = str2;
        this.f275164i = j2;
        this.f275162g = z;
        this.f275155A = i8;
        int i9 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i9 == 0) {
            Log.m105924i("MicroMsg.NetSceneSnsUserPage", "fp userName " + str2);
        } else {
            Log.m105924i("MicroMsg.NetSceneSnsUserPage", "np userName " + str2);
        }
        this.f275175w = i4;
        this.f275156B = i5;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new b94();
        bVar.f127067b = new c94();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmsnsuserpage";
        bVar.f127069d = 212;
        bVar.f127070e = 99;
        bVar.f127071f = 1000000099;
        Log.m105925i("MicroMsg.NetSceneSnsUserPage", "filterType:%d sourceType:%d serverType:%d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        C47350c a = bVar.mo72403a();
        this.f275159d = a;
        b94 b94 = (b94) a.f127055a.f127080a;
        b94.f297948e = str2;
        b94.f297949f = j2;
        b94.f297953j = i3;
        MultiProcessMMKV multiProcessMMKV = MultiProcessMMKV.getDefault();
        if (!multiProcessMMKV.getBoolean("ShowWithTaEntrance_" + str2, false)) {
            b94.f297957q = 1;
        }
        this.f275161f = i9 == 0;
        if (i8 == 1 || i8 == 2 || i8 == 0) {
            b94.f297951h = 0;
            b94.f297950g = i7;
            if (i8 == 1) {
                b94.f297954n = 1;
            }
            this.f275175w = 16;
            Log.m105925i("MicroMsg.NetSceneSnsUserPage", "maxId:%s, minId:%s, snsSource:%s, pullType:%s", C102236a0.m134765q0(j), C102236a0.m134765q0(this.f275165j), Integer.valueOf(i), Integer.valueOf(b94.f297954n));
        } else {
            int i15 = C94866e1.dy0().mo6418i(str2);
            long Ab0 = C94866e1.Yx0().Ab0(this.f275161f ? 0 : j2, i15, str, z);
            this.f275165j = Ab0;
            b94.f297951h = Ab0;
            int c = C43038l.m46675c(Ab0, j2, str2);
            b94.f297952i = c;
            b94.f297950g = i7;
            if (this.f275161f) {
                if (mo131221m1()) {
                    C100399d0 Xx0 = C94866e1.Xx0();
                    Xx0.getClass();
                    SnsMethodCalculate.markStartTimeMs("getAlbumMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                    String str3 = Xx0.mo139782Yt(str2).field_albumMd5;
                    SnsMethodCalculate.markEndTimeMs("getAlbumMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                    this.f275168p = str3;
                } else {
                    C100399d0 Xx02 = C94866e1.Xx0();
                    Xx02.getClass();
                    SnsMethodCalculate.markStartTimeMs("getMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                    String str4 = Xx02.mo139782Yt(str2).field_md5;
                    SnsMethodCalculate.markEndTimeMs("getMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                    this.f275168p = str4;
                }
                if (this.f275168p == null) {
                    this.f275168p = "";
                }
                b94.f297947d = this.f275168p;
            }
            Log.m105924i("MicroMsg.NetSceneSnsUserPage", "nextCount: " + i15 + " maxId:" + C102236a0.m134765q0(j) + " minId:" + C102236a0.m134765q0(this.f275165j) + " lastReqTime:" + c + " snsSource:" + i7 + " FirstPageMd5:" + this.f275168p);
        }
        this.f275163h = j2;
    }
}
