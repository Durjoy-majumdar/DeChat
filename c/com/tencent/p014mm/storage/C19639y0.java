package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import eb0.C20583z;
import gy3.C45983e0;
import gy3.C87412m;
import java.util.List;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import pe3.C47465a;
import te3.C22518og;
import te3.C49588go3;
import te3.C64522lg;
import zt3.C119157j;

/* renamed from: com.tencent.mm.storage.y0 */
public final class C19639y0 implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ boolean f55635d;

    /* renamed from: e */
    public final /* synthetic */ int f55636e;

    /* renamed from: f */
    public final /* synthetic */ C45983e0 f55637f;

    /* renamed from: g */
    public final /* synthetic */ C64522lg f55638g;

    /* renamed from: h */
    public final /* synthetic */ List<C19623o0> f55639h;

    /* renamed from: com.tencent.mm.storage.y0$a */
    public static final class C19640a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C22518og f55640d;

        /* renamed from: e */
        public final /* synthetic */ int f55641e;

        /* renamed from: f */
        public final /* synthetic */ C45983e0 f55642f;

        /* renamed from: g */
        public final /* synthetic */ C64522lg f55643g;

        /* renamed from: h */
        public final /* synthetic */ List<C19623o0> f55644h;

        public C19640a(C22518og ogVar, int i, C45983e0 e0Var, C64522lg lgVar, List<? extends C19623o0> list) {
            this.f55640d = ogVar;
            this.f55641e = i;
            this.f55642f = e0Var;
            this.f55643g = lgVar;
            this.f55644h = list;
        }

        /* JADX WARNING: Removed duplicated region for block: B:151:0x035b  */
        /* JADX WARNING: Removed duplicated region for block: B:159:0x03bc  */
        /* JADX WARNING: Removed duplicated region for block: B:161:0x03cd  */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x03e5  */
        /* JADX WARNING: Removed duplicated region for block: B:167:0x03f9  */
        /* JADX WARNING: Removed duplicated region for block: B:168:0x03ff  */
        /* JADX WARNING: Removed duplicated region for block: B:171:0x048e  */
        /* JADX WARNING: Removed duplicated region for block: B:189:0x04db  */
        /* JADX WARNING: Removed duplicated region for block: B:232:0x0630  */
        /* JADX WARNING: Removed duplicated region for block: B:253:0x06e7  */
        /* JADX WARNING: Removed duplicated region for block: B:254:0x06f2  */
        /* JADX WARNING: Removed duplicated region for block: B:360:0x0a7a  */
        /* JADX WARNING: Removed duplicated region for block: B:363:0x0a8e  */
        /* JADX WARNING: Removed duplicated region for block: B:373:0x0127 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0124  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r53 = this;
                r0 = r53
                com.tencent.mm.storage.z0 r1 = com.tencent.p014mm.storage.C19641z0.f55645a
                te3.og r2 = r0.f55640d
                int r3 = r0.f55641e
                gy3.e0 r4 = r0.f55642f
                long r4 = r4.f124000d
                te3.lg r6 = r0.f55643g
                r7 = 0
                if (r6 == 0) goto L_0x0014
                int r6 = r6.f184091f
                goto L_0x0015
            L_0x0014:
                r6 = 0
            L_0x0015:
                java.util.List<com.tencent.mm.storage.o0> r8 = r0.f55644h
                boolean r9 = com.tencent.p014mm.storage.C19636w0.f55627d
                r15 = 1
                if (r9 == 0) goto L_0x0024
                boolean r9 = r1.mo25863f(r3)
                if (r9 != 0) goto L_0x0024
                r9 = 1
                goto L_0x0025
            L_0x0024:
                r9 = 0
            L_0x0025:
                java.lang.String r14 = "MicroMsg.BizTimeLineResortLogic"
                r10 = 8
                java.lang.String r13 = "ReSortBizMsgFailReason"
                if (r9 == 0) goto L_0x0041
                java.lang.String r3 = "handleReSortResult is isInTimeLine now"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r3)
                r1.mo25867j(r10)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = r1.mo25861d()
                r3.encode((java.lang.String) r13, (int) r15)
                r1.mo25868k(r2)
                goto L_0x0ad0
            L_0x0041:
                boolean r9 = r1.mo25862e(r3)
                r11 = 2
                if (r9 == 0) goto L_0x0054
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = r1.mo25861d()
                r3.encode((java.lang.String) r13, (int) r11)
                r1.mo25868k(r2)
                goto L_0x0ad0
            L_0x0054:
                boolean r9 = com.tencent.p014mm.storage.C19641z0.f55650f
                if (r9 == 0) goto L_0x0079
                java.lang.String r4 = "handleReSortResult inTimeLineStatusChange=true"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r4)
                com.tencent.p014mm.storage.C19641z0.f55650f = r7
                com.tencent.p014mm.storage.C19641z0.f55646b = r7
                r4 = 26
                r1.mo25867j(r4)
                boolean r3 = r1.mo25863f(r3)
                if (r3 == 0) goto L_0x006d
                r15 = 2
            L_0x006d:
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = r1.mo25861d()
                r3.encode((java.lang.String) r13, (int) r15)
                r1.mo25868k(r2)
                goto L_0x0ad0
            L_0x0079:
                java.util.LinkedList<te3.jg> r9 = r2.f64345i
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r10 = "handleReSortResult size %d, rank_sessionid %s, groupId="
                r12.append(r10)
                r12.append(r4)
                java.lang.String r10 = ", maxWeight="
                r12.append(r10)
                r12.append(r6)
                java.lang.String r10 = r12.toString()
                java.lang.Object[] r12 = new java.lang.Object[r11]
                int r17 = r9.size()
                java.lang.Integer r17 = java.lang.Integer.valueOf(r17)
                r12[r7] = r17
                java.lang.String r7 = r2.f64347n
                r12[r15] = r7
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r10, r12)
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r9)
                r10 = 5
                r12 = 4
                r20 = r13
                if (r7 == 0) goto L_0x00c1
                r1.mo25867j(r12)
                java.lang.String r4 = "handleReSortResult items is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r4)
                r40 = r2
                r0 = r3
                r4 = r6
                r18 = 4
                goto L_0x06fd
            L_0x00c1:
                boolean r7 = r1.mo25863f(r3)
                boolean r21 = com.tencent.p014mm.storage.C19641z0.f55655k
                if (r21 == 0) goto L_0x00d1
                boolean r21 = r1.mo25863f(r3)
                if (r21 != 0) goto L_0x00d1
                r13 = 1
                goto L_0x00d2
            L_0x00d1:
                r13 = 0
            L_0x00d2:
                gy3.e0 r15 = new gy3.e0
                r15.<init>()
                if (r7 != 0) goto L_0x00e1
                com.tencent.mm.storage.p0 r4 = rb0.C48009v0.Jx0()
                long r4 = r4.mo25791TO()
            L_0x00e1:
                r15.f124000d = r4
                if (r3 == r12) goto L_0x00ea
                if (r3 != r10) goto L_0x00e8
                goto L_0x00ea
            L_0x00e8:
                r4 = 0
                goto L_0x00eb
            L_0x00ea:
                r4 = 1
            L_0x00eb:
                if (r4 != 0) goto L_0x01a1
                com.tencent.mm.storage.m0 r4 = com.tencent.p014mm.storage.C19620m0.f55507a
                java.util.LinkedList r5 = new java.util.LinkedList
                r5.<init>()
                java.util.HashSet r10 = new java.util.HashSet
                r10.<init>()
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                java.util.Iterator r25 = r9.iterator()
            L_0x0102:
                boolean r26 = r25.hasNext()
                if (r26 == 0) goto L_0x012d
                java.lang.Object r11 = r25.next()
                r0 = r11
                te3.jg r0 = (te3.C22501jg) r0
                r27 = r6
                int r6 = r0.f64017s
                if (r6 == 0) goto L_0x0121
                int r0 = r0.f64024z
                r6 = r0 & 1
                if (r6 != 0) goto L_0x011f
                r0 = r0 & 4
                if (r0 == 0) goto L_0x0121
            L_0x011f:
                r0 = 1
                goto L_0x0122
            L_0x0121:
                r0 = 0
            L_0x0122:
                if (r0 == 0) goto L_0x0127
                r12.add(r11)
            L_0x0127:
                r0 = r53
                r6 = r27
                r11 = 2
                goto L_0x0102
            L_0x012d:
                r27 = r6
                java.util.Iterator r0 = r12.iterator()
            L_0x0133:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L_0x016c
                java.lang.Object r6 = r0.next()
                te3.jg r6 = (te3.C22501jg) r6
                te3.fp3 r11 = new te3.fp3
                r11.<init>()
                java.lang.String r12 = r6.f64021w
                r11.f133623d = r12
                r25 = r2
                r12 = r3
                long r2 = r6.f64019u
                r11.f133624e = r2
                r2 = 2
                r11.f133625f = r2
                java.lang.String r2 = r6.f63998A
                r11.f133626g = r2
                r5.add(r11)
                int r2 = r6.f64024z
                r3 = 4
                r2 = r2 & r3
                if (r2 == 0) goto L_0x0168
                long r2 = r6.f64019u
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r10.add(r2)
            L_0x0168:
                r3 = r12
                r2 = r25
                goto L_0x0133
            L_0x016c:
                r25 = r2
                r12 = r3
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto L_0x0181
                r2 = 5
                r4.mo25752d(r2)
                com.tencent.mm.storage.m0$a r0 = com.tencent.p014mm.storage.C19620m0.C19621a.RECYCLE_CARD_SCENE_RESORT
                java.util.LinkedList r0 = r4.mo25751b(r5, r0, r13, r10)
                goto L_0x0182
            L_0x0181:
                r0 = 0
            L_0x0182:
                if (r0 == 0) goto L_0x018d
                boolean r2 = r0.isEmpty()
                if (r2 == 0) goto L_0x018b
                goto L_0x018d
            L_0x018b:
                r2 = 0
                goto L_0x018e
            L_0x018d:
                r2 = 1
            L_0x018e:
                if (r2 != 0) goto L_0x0198
                com.tencent.mm.storage.a1 r2 = new com.tencent.mm.storage.a1
                r2.<init>(r0)
                o40.C61926c.m72675T(r9, r2)
            L_0x0198:
                com.tencent.mm.storage.b1 r0 = new com.tencent.mm.storage.b1
                r0.<init>(r8, r15)
                o40.C61926c.m72675T(r9, r0)
                goto L_0x01a6
            L_0x01a1:
                r25 = r2
                r12 = r3
                r27 = r6
            L_0x01a6:
                r0 = 5
                r1.mo25867j(r0)
                java.lang.String r0 = "handleReSortResult"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
                long r2 = r15.f124000d
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r1.mo25861d()
                java.lang.String r4 = "ReSortBizMsgMaxGroupId"
                r5 = 0
                long r10 = r0.decodeLong(r4, r5)
                int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
                if (r0 == 0) goto L_0x01d6
                if (r7 != 0) goto L_0x01d6
                r0 = 11
                r1.mo25867j(r0)
                java.lang.String r0 = "handleReSortResult MsgMaxGroupId has changed!"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
                r0 = r12
                r40 = r25
                r4 = r27
                r18 = 5
                goto L_0x06fd
            L_0x01d6:
                com.tencent.mm.storage.p0 r0 = rb0.C48009v0.Jx0()
                com.tencent.mm.storage.o0 r2 = r0.mo25809mL()
                if (r2 != 0) goto L_0x01e2
                r0 = 0
                goto L_0x01e8
            L_0x01e2:
                long r2 = r2.field_orderFlag
                int r0 = r0.mo25803gY(r2)
            L_0x01e8:
                if (r0 > 0) goto L_0x021e
                if (r7 != 0) goto L_0x021e
                r0 = 1
                if (r12 != r0) goto L_0x0209
                r0 = r25
                java.util.LinkedList<te3.ho3> r2 = r0.f64350q
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r2)
                if (r2 != 0) goto L_0x020b
                com.tencent.mm.storage.p0 r2 = rb0.C48009v0.Jx0()
                long r2 = r2.mo25790TE()
                r15.f124000d = r2
                r2 = 102(0x66, float:1.43E-43)
                r1.mo25867j(r2)
                goto L_0x0220
            L_0x0209:
                r0 = r25
            L_0x020b:
                java.lang.String r2 = "handleReSortResult no redDot"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
                r2 = 10
                r1.mo25867j(r2)
                r40 = r0
                r0 = r12
                r4 = r27
                r18 = 3
                goto L_0x06fd
            L_0x021e:
                r0 = r25
            L_0x0220:
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = r1.mo25861d()
                java.lang.String r4 = "BizLastMsgId"
                long r3 = r3.decodeLong(r4, r5)
                java.util.Iterator r8 = r9.iterator()
                r9 = 0
                r10 = 0
            L_0x0235:
                boolean r11 = r8.hasNext()
                java.lang.String r5 = "orderFlag"
                if (r11 == 0) goto L_0x064d
                java.lang.Object r6 = r8.next()
                te3.jg r6 = (te3.C22501jg) r6
                r25 = r10
                long r10 = r15.f124000d
                if (r6 != 0) goto L_0x025f
                r40 = r0
                r30 = r1
                r42 = r3
                r31 = r8
                r32 = r9
                r35 = r12
                r41 = r13
                r8 = 0
                r9 = 4
                r28 = 0
            L_0x025b:
                r13 = r2
                r2 = 5
                goto L_0x04d9
            L_0x025f:
                boolean r30 = r1.mo25863f(r12)
                r31 = r8
                com.tencent.mm.storage.p0 r8 = rb0.C48009v0.Jx0()
                r32 = r9
                r33 = r10
                long r9 = r6.f64019u
                com.tencent.mm.storage.o0 r8 = r8.mo25806kD(r9)
                if (r8 == 0) goto L_0x04c4
                long r9 = r8.field_msgId
                r28 = 0
                int r11 = (r9 > r28 ? 1 : (r9 == r28 ? 0 : -1))
                if (r11 != 0) goto L_0x028a
                r40 = r0
                r30 = r1
                r42 = r3
                r35 = r12
                r41 = r13
                r9 = 4
                goto L_0x04d1
            L_0x028a:
                int r9 = r8.field_isRead
                r10 = 1
                if (r9 != r10) goto L_0x0299
                if (r30 == 0) goto L_0x0299
                java.lang.String r5 = "getResortBizTimeLineInfo timeLineResort msg is read"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r5)
                r35 = r12
                goto L_0x02c7
            L_0x0299:
                boolean r9 = r1.mo25864g(r8, r13)
                if (r9 == 0) goto L_0x02a7
                java.lang.String r5 = "getResortBizTimeLineInfo msg is read"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r5)
                r35 = r12
                goto L_0x02c6
            L_0x02a7:
                long r9 = java.lang.System.currentTimeMillis()
                r35 = r12
                long r11 = r8.field_createTime
                long r9 = r9 - r11
                r36 = 604800000(0x240c8400, double:2.988109026E-315)
                int r38 = (r9 > r36 ? 1 : (r9 == r36 ? 0 : -1))
                if (r38 <= 0) goto L_0x02d1
                r9 = 1
                java.lang.Object[] r5 = new java.lang.Object[r9]
                java.lang.Long r8 = java.lang.Long.valueOf(r11)
                r9 = 0
                r5[r9] = r8
                java.lang.String r8 = "getResortBizTimeLineInfo too old msg %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r8, r5)
            L_0x02c6:
                r8 = 0
            L_0x02c7:
                r40 = r0
                r30 = r1
                r42 = r3
                r41 = r13
                r9 = 4
                goto L_0x025b
            L_0x02d1:
                int r9 = r6.f64006e
                long r9 = (long) r9
                r11 = 24
                long r9 = r9 << r11
                r11 = 4278190080(0xff000000, double:2.113706745E-314)
                long r9 = r9 & r11
                int r11 = r6.f64001D
                r12 = 2
                if (r11 != r12) goto L_0x02e4
                r11 = 1
                goto L_0x02e5
            L_0x02e4:
                r11 = 0
            L_0x02e5:
                int r12 = r6.f64003F
                r22 = 1
                r12 = r12 & 1
                if (r12 == 0) goto L_0x02ef
                r12 = 1
                goto L_0x02f0
            L_0x02ef:
                r12 = 0
            L_0x02f0:
                if (r11 == 0) goto L_0x033f
                if (r12 != 0) goto L_0x033f
                r38 = r9
                long r9 = r8.field_msgId
                int r40 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
                if (r40 != 0) goto L_0x0306
                r9 = 93
                r1.mo25867j(r9)
                r42 = r3
                r41 = r13
                goto L_0x0336
            L_0x0306:
                int r9 = r6.f64017s
                if (r9 != 0) goto L_0x0338
                long r9 = r8.mo25767q2()
                int r40 = (r9 > r33 ? 1 : (r9 == r33 ? 0 : -1))
                if (r40 != 0) goto L_0x0338
                com.tencent.mm.storage.c0 r9 = com.tencent.p014mm.storage.C19601c0.f55446a
                long r9 = r8.field_msgId
                r40 = r11
                rb0.f r11 = rb0.C22221f.f62962a
                java.lang.String r9 = java.lang.String.valueOf(r9)
                r42 = r3
                r41 = r13
                r3 = 0
                r10 = 2
                r13 = 0
                int r4 = com.tencent.p014mm.sdk.platformtools.MMKVSlotManager.decodeInt$default(r11, r9, r3, r10, r13)
                r3 = 1
                if (r4 != r3) goto L_0x032e
                r3 = 1
                goto L_0x032f
            L_0x032e:
                r3 = 0
            L_0x032f:
                if (r3 == 0) goto L_0x0344
                r3 = 94
                r1.mo25867j(r3)
            L_0x0336:
                r3 = 0
                goto L_0x0346
            L_0x0338:
                r42 = r3
            L_0x033a:
                r40 = r11
                r41 = r13
                goto L_0x0344
            L_0x033f:
                r42 = r3
                r38 = r9
                goto L_0x033a
            L_0x0344:
                r3 = r40
            L_0x0346:
                long r9 = r8.mo25767q2()
                int r4 = (r9 > r33 ? 1 : (r9 == r33 ? 0 : -1))
                if (r4 == 0) goto L_0x0355
                if (r3 != 0) goto L_0x0355
                if (r30 != 0) goto L_0x0355
                r4 = 1
                r8.f55519d1 = r4
            L_0x0355:
                r4 = 1000(0x3e8, float:1.401E-42)
                r9 = 32
                if (r3 == 0) goto L_0x03bc
                long r10 = r8.field_createTime
                r40 = r0
                r30 = r1
                long r0 = (long) r4
                long r10 = r10 / r0
                com.tencent.mm.storage.p0 r0 = rb0.C48009v0.Jx0()
                r0.getClass()
                r13 = r2
                long r1 = r33 << r9
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r9 = "SELECT * FROM BizTimeLineInfo where orderFlag < "
                r4.append(r9)
                r4.append(r1)
                java.lang.String r1 = " ORDER BY "
                r4.append(r1)
                r4.append(r5)
                java.lang.String r1 = " desc LIMIT 1 "
                r4.append(r1)
                java.lang.String r1 = r4.toString()
                zh3.f r0 = r0.f55550d
                r2 = 2
                r4 = 0
                android.database.Cursor r0 = r0.rawQuery(r1, r4, r2)
                com.tencent.mm.storage.o0 r1 = new com.tencent.mm.storage.o0
                r1.<init>()
                boolean r2 = r0.moveToFirst()
                if (r2 == 0) goto L_0x03a5
                r1.convertFrom(r0)
                r0.close()
                goto L_0x03a9
            L_0x03a5:
                r0.close()
                r1 = 0
            L_0x03a9:
                r4 = 604800(0x93a80, double:2.98811E-318)
                if (r1 != 0) goto L_0x03af
                goto L_0x03b8
            L_0x03af:
                long r0 = r1.field_createTime
                r44 = 1000(0x3e8, double:4.94E-321)
                long r0 = r0 / r44
                long r0 = r0 - r4
                long r4 = r10 - r0
            L_0x03b8:
                r0 = r4
                r4 = r33
                goto L_0x03cb
            L_0x03bc:
                r40 = r0
                r30 = r1
                r13 = r2
                long r0 = r8.field_createTime
                long r4 = (long) r4
                long r0 = r0 / r4
                r4 = r33
                long r0 = com.tencent.p014mm.storage.C19636w0.m21166h(r4, r0)
            L_0x03cb:
                if (r3 == 0) goto L_0x03e5
                r9 = 1
                long r10 = r4 - r9
                java.lang.String r2 = "getResortBizTimeLineInfo groupId - 1"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r2)
                com.tencent.mm.storage.z0 r2 = com.tencent.p014mm.storage.C19641z0.f55645a
                r4 = 92
                r2.mo25867j(r4)
                if (r12 == 0) goto L_0x03e6
                r4 = 90
                r2.mo25867j(r4)
                goto L_0x03e6
            L_0x03e5:
                r10 = r4
            L_0x03e6:
                r8.f55520e1 = r3
                r2 = 32
                long r4 = r10 << r2
                long r4 = r4 | r38
                long r0 = r0 | r4
                r8.field_orderFlag = r0
                com.tencent.p014mm.storage.C19636w0.m21173o(r8)
                int r0 = r6.f64007f
                r1 = 1
                if (r0 != r1) goto L_0x03ff
                int r0 = r8.field_bitFlag
                r0 = r0 | r1
                r8.field_bitFlag = r0
                goto L_0x0405
            L_0x03ff:
                int r0 = r8.field_bitFlag
                r0 = r0 & -2
                r8.field_bitFlag = r0
            L_0x0405:
                r0 = 1073741824(0x40000000, float:2.0)
                int r1 = r8.field_bitFlag
                r1 = r1 | r0
                r8.field_bitFlag = r1
                java.lang.String r1 = r6.f64004G
                r8.field_recommendReason = r1
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getResortBizTimeLineInfo msgid:%d pic_type:%d biz_flag:%d cardType:%d, weight:%d, groupId="
                r1.append(r2)
                r1.append(r10)
                java.lang.String r2 = ", groupFlag="
                r1.append(r2)
                int r2 = r6.f64001D
                r1.append(r2)
                java.lang.String r2 = ", lowerGroupFlag = "
                r1.append(r2)
                int r2 = r6.f64003F
                r1.append(r2)
                java.lang.String r2 = " isSink="
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = ", isRead="
                r1.append(r2)
                int r2 = r8.field_isRead
                r1.append(r2)
                java.lang.String r2 = "，reason="
                r1.append(r2)
                java.lang.String r2 = r6.f64004G
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r2 = 5
                java.lang.Object[] r3 = new java.lang.Object[r2]
                long r4 = r6.f64019u
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                r5 = 0
                r3[r5] = r4
                int r4 = r6.f64007f
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5 = 1
                r3[r5] = r4
                int r4 = r8.field_bitFlag
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5 = 2
                r3[r5] = r4
                int r4 = r6.f64017s
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5 = 3
                r3[r5] = r4
                int r4 = r6.f64006e
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r9 = 4
                r3[r9] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r1, r3)
                com.tencent.mm.storage.g0 r1 = com.tencent.p014mm.storage.C6710g0.f24120a
                boolean r3 = r1.mo7654a()
                if (r3 != 0) goto L_0x048e
                goto L_0x04d9
            L_0x048e:
                int r3 = r6.f64007f
                r4 = 1
                if (r3 != r4) goto L_0x0499
                boolean r3 = r8.mo25763m2(r4)
                if (r3 == 0) goto L_0x04a3
            L_0x0499:
                int r3 = r6.f64007f
                if (r3 == r4) goto L_0x04a8
                boolean r3 = r8.mo25763m2(r4)
                if (r3 == 0) goto L_0x04a8
            L_0x04a3:
                java.lang.String r3 = "checkRespData show big pic flag invalid!"
                r1.mo7655b(r3)
            L_0x04a8:
                boolean r0 = r8.mo25763m2(r0)
                if (r0 != 0) goto L_0x04b3
                java.lang.String r0 = "checkRespData resort flag invalid!"
                r1.mo7655b(r0)
            L_0x04b3:
                long r3 = java.lang.System.currentTimeMillis()
                long r10 = r8.field_createTime
                long r3 = r3 - r10
                int r0 = (r3 > r36 ? 1 : (r3 == r36 ? 0 : -1))
                if (r0 <= 0) goto L_0x04d9
                java.lang.String r0 = "CheckRespProcessedData time invalid!"
                r1.mo7655b(r0)
                goto L_0x04d9
            L_0x04c4:
                r40 = r0
                r30 = r1
                r42 = r3
                r35 = r12
                r41 = r13
                r9 = 4
                r28 = 0
            L_0x04d1:
                r13 = r2
                r2 = 5
                java.lang.String r0 = "getResortBizTimeLineInfo msg not found"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
                r8 = 0
            L_0x04d9:
                if (r8 == 0) goto L_0x0630
                int r0 = r8.field_isRead
                r1 = 1
                if (r0 != r1) goto L_0x04f4
                if (r7 == 0) goto L_0x04f4
                java.lang.String r0 = "handleReSortResult isTimeLineResort msg read"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
                r0 = 66
                r1 = r30
                r1.mo25867j(r0)
                r4 = r27
                r0 = r35
                goto L_0x06fb
            L_0x04f4:
                r1 = r30
                r0 = r40
                java.lang.String r3 = r0.f64347n
                r8.field_rankSessionId = r3
                java.lang.String r3 = r6.f64020v
                r8.field_resortBuffer = r3
                long r3 = r8.mo25767q2()
                long r10 = r15.f124000d
                int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
                if (r5 != 0) goto L_0x053d
                if (r7 == 0) goto L_0x0536
                int r3 = r6.f64006e
                r4 = r27
                if (r3 <= r4) goto L_0x0538
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "handleReSortResult weight invalid "
                r3.append(r5)
                int r5 = r6.f64006e
                r3.append(r5)
                r5 = 58
                r3.append(r5)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r3)
                r40 = r0
                r30 = r1
                goto L_0x0632
            L_0x0536:
                r4 = r27
            L_0x0538:
                int r3 = r32 + 1
                r32 = r3
                goto L_0x053f
            L_0x053d:
                r4 = r27
            L_0x053f:
                r13.add(r8)
                int r3 = r8.field_isRead
                r5 = 1
                if (r3 != r5) goto L_0x054e
                boolean r3 = r8.field_isValidExposed
                if (r3 != 0) goto L_0x054e
                int r10 = r25 + 1
                goto L_0x0550
            L_0x054e:
                r10 = r25
            L_0x0550:
                jw0.a r3 = jw0.C21287a.f60143a
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                long r11 = r8.field_msgId
                r5.append(r11)
                r11 = 45
                r5.append(r11)
                long r11 = r8.field_createTime
                r5.append(r11)
                java.lang.String r5 = r5.toString()
                java.lang.String r5 = r3.mo33260a(r5)
                rb0.f r11 = rb0.C22221f.f62962a
                java.lang.Object r12 = r11.findSlot(r5)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r12 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r12
                te3.z40 r2 = r6.f64023y
                java.lang.String r9 = "  "
                r25 = r10
                java.lang.String r10 = "MicroMsg.BizDigestUtil"
                if (r2 == 0) goto L_0x05f7
                java.util.LinkedList<te3.a50> r2 = r2.f145683d
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r2)
                if (r2 == 0) goto L_0x0589
                goto L_0x05f7
            L_0x0589:
                int r2 = r6.f64008g
                r27 = r15
                r15 = 1
                r2 = r2 & r15
                if (r2 == 0) goto L_0x05c3
                if (r12 == 0) goto L_0x059b
                boolean r2 = r12.containsKey(r5)
                if (r2 != r15) goto L_0x059b
                r2 = 1
                goto L_0x059c
            L_0x059b:
                r2 = 0
            L_0x059c:
                if (r2 == 0) goto L_0x05c3
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "saveWebViewAlbumInfoInfo not update "
                r2.append(r3)
                long r5 = r8.field_msgId
                r2.append(r5)
                r2.append(r9)
                java.lang.String r3 = r8.field_bizClientMsgId
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r2)
                r40 = r0
                r30 = r1
                goto L_0x0634
            L_0x05c3:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r12 = "saveWebViewAlbumInfoInfo "
                r2.append(r12)
                r40 = r0
                r30 = r1
                long r0 = r8.field_msgId
                r2.append(r0)
                r2.append(r9)
                java.lang.String r0 = r8.field_bizClientMsgId
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
                te3.z40 r0 = r6.f64023y
                java.lang.String r1 = "item.digest_info"
                gy3.C87412m.m108593f(r0, r1)
                java.lang.Object r1 = r11.getSlotForWrite()
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r1
                r3.mo33266g(r5, r0, r1)
                goto L_0x0634
            L_0x05f7:
                r40 = r0
                r30 = r1
                r27 = r15
                if (r12 == 0) goto L_0x0608
                boolean r0 = r12.containsKey(r5)
                r1 = 1
                if (r0 != r1) goto L_0x0608
                r0 = 1
                goto L_0x0609
            L_0x0608:
                r0 = 0
            L_0x0609:
                if (r0 == 0) goto L_0x0634
                if (r12 == 0) goto L_0x0610
                r12.removeValueForKey(r5)
            L_0x0610:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "saveWebViewAlbumInfoInfo remove "
                r0.append(r1)
                long r1 = r8.field_msgId
                r0.append(r1)
                r0.append(r9)
                java.lang.String r1 = r8.field_bizClientMsgId
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
                goto L_0x0634
            L_0x0630:
                r4 = r27
            L_0x0632:
                r27 = r15
            L_0x0634:
                r10 = r25
                r9 = r32
                r2 = r13
                r15 = r27
                r5 = r28
                r1 = r30
                r8 = r31
                r12 = r35
                r0 = r40
                r13 = r41
                r27 = r4
                r3 = r42
                goto L_0x0235
            L_0x064d:
                r40 = r0
                r30 = r1
                r13 = r2
                r42 = r3
                r32 = r9
                r25 = r10
                r35 = r12
                r4 = r27
                int r0 = r13.size()
                r3 = 3
                if (r9 >= r3) goto L_0x068e
                if (r9 >= r0) goto L_0x068e
                java.lang.Object[] r1 = new java.lang.Object[r3]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2 = 0
                r1[r2] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
                r2 = 1
                r1[r2] = r0
                java.lang.Long r0 = java.lang.Long.valueOf(r42)
                r2 = 2
                r1[r2] = r0
                java.lang.String r0 = "handleReSortResult return new size %d, newGroupCount %d， lastMsgId=%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r0, r1)
                r0 = 91
                r1 = r30
                r1.mo25867j(r0)
                r0 = r35
                r18 = 6
                goto L_0x06fd
            L_0x068e:
                r1 = r30
                if (r25 <= 0) goto L_0x0697
                r2 = 101(0x65, float:1.42E-43)
                r1.mo25867j(r2)
            L_0x0697:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r6 = "handleReSortResult new size "
                r2.append(r6)
                r2.append(r0)
                java.lang.String r0 = ", newGroupCount "
                r2.append(r0)
                r2.append(r9)
                java.lang.String r0 = "， lastMsgId="
                r2.append(r0)
                r8 = r42
                r2.append(r8)
                java.lang.String r0 = ", invalidExposedCount="
                r2.append(r0)
                r10 = r25
                r2.append(r10)
                java.lang.String r0 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r13)
                if (r0 != 0) goto L_0x0801
                r0 = 7
                r1.mo25867j(r0)
                boolean r0 = com.tencent.p014mm.storage.C19636w0.f55627d
                if (r0 == 0) goto L_0x06e0
                r0 = r35
                boolean r2 = r1.mo25863f(r0)
                if (r2 != 0) goto L_0x06e2
                r2 = 1
                goto L_0x06e3
            L_0x06e0:
                r0 = r35
            L_0x06e2:
                r2 = 0
            L_0x06e3:
                java.lang.String r6 = "batResortBizTimeLineInfo isInTimeLine just return"
                if (r2 == 0) goto L_0x06f2
                r2 = 8
                r1.mo25867j(r2)
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r6)
                r18 = 1
                goto L_0x06fd
            L_0x06f2:
                boolean r2 = r1.mo25862e(r0)
                if (r2 == 0) goto L_0x0704
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r6)
            L_0x06fb:
                r18 = 2
            L_0x06fd:
                r27 = r4
                r2 = r18
                r3 = 1
                goto L_0x080b
            L_0x0704:
                com.tencent.mm.storage.p0 r2 = rb0.C48009v0.Jx0()
                r2.getClass()
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r13)
                r8 = 0
                java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
                if (r6 == 0) goto L_0x071a
                r27 = r4
                goto L_0x07e4
            L_0x071a:
                zh3.f r6 = r2.f55550d
                java.lang.Thread r8 = java.lang.Thread.currentThread()
                long r10 = r8.getId()
                long r10 = r6.beginTransaction(r10)
                java.util.Iterator r6 = r13.iterator()
            L_0x072c:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L_0x07bf
                java.lang.Object r8 = r6.next()
                com.tencent.mm.storage.o0 r8 = (com.tencent.p014mm.storage.C19623o0) r8
                android.content.ContentValues r12 = new android.content.ContentValues
                r12.<init>()
                r27 = r4
                long r3 = r8.field_orderFlag
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r12.put(r5, r3)
                java.lang.String r3 = r8.field_recommendReason
                java.lang.String r4 = "recommendReason"
                r12.put(r4, r3)
                int r3 = r8.field_bitFlag
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.String r4 = "bitFlag"
                r12.put(r4, r3)
                if (r7 == 0) goto L_0x075e
                r3 = 4
                goto L_0x075f
            L_0x075e:
                r3 = 3
            L_0x075f:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.String r4 = "status"
                r12.put(r4, r3)
                boolean r3 = r8.f55520e1
                java.lang.String r4 = "hasShow"
                if (r3 == 0) goto L_0x0778
                r3 = 1
                java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
                r12.put(r4, r13)
                goto L_0x0784
            L_0x0778:
                boolean r3 = r8.f55519d1
                if (r3 == 0) goto L_0x0784
                r12.put(r4, r9)
                java.lang.String r3 = "isRead"
                r12.put(r3, r9)
            L_0x0784:
                java.lang.String r3 = r8.field_rankSessionId
                java.lang.String r4 = "rankSessionId"
                r12.put(r4, r3)
                java.lang.String r3 = r8.field_resortBuffer
                java.lang.String r4 = "resortBuffer"
                r12.put(r4, r3)
                zh3.f r3 = r2.f55550d
                r4 = 1
                java.lang.String[] r13 = new java.lang.String[r4]
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r15 = ""
                r4.append(r15)
                r15 = r5
                r16 = r6
                long r5 = r8.field_msgId
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r5 = 0
                r13[r5] = r4
                java.lang.String r4 = "BizTimeLineInfo"
                java.lang.String r6 = "msgId = ?"
                r3.update(r4, r12, r6, r13)
                r5 = r15
                r6 = r16
                r4 = r27
                r3 = 3
                goto L_0x072c
            L_0x07bf:
                r27 = r4
                r5 = 0
                zh3.f r3 = r2.f55550d
                int r3 = r3.endTransaction(r10)
                r4 = 1
                java.lang.Object[] r6 = new java.lang.Object[r4]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r6[r5] = r3
                java.lang.String r3 = "MicroMsg.BizTimeLineInfoStorage"
                java.lang.String r4 = "batResortBizTimeLineInfo ret=%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r6)
                zt3.t r3 = zt3.C119157j.f356862d
                com.tencent.mm.storage.s0 r4 = new com.tencent.mm.storage.s0
                r4.<init>(r2)
                zt3.j r3 = (zt3.C119157j) r3
                r3.mo183895z(r4)
            L_0x07e4:
                wc3.c r2 = wc3.C22881c.f65777a
                boolean r3 = r2.mo36060e()
                if (r3 == 0) goto L_0x07fa
                boolean r3 = r2.mo36061f()
                if (r3 == 0) goto L_0x07fa
                java.lang.String r3 = "BizImagePreloadStrategy preload after resort"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r3)
                r2.mo36062g()
            L_0x07fa:
                com.tencent.mm.storage.t r2 = com.tencent.p014mm.storage.C19627t.f55586a
                r3 = 1
                r2.mo25829c(r3)
                goto L_0x080a
            L_0x0801:
                r27 = r4
                r0 = r35
                r2 = 6
                r3 = 1
                r1.mo25867j(r2)
            L_0x080a:
                r2 = 0
            L_0x080b:
                if (r2 == r3) goto L_0x0abc
                r3 = 2
                if (r2 == r3) goto L_0x0abc
                r3 = r40
                java.lang.String r4 = r3.f64347n
                if (r2 != 0) goto L_0x0818
                r5 = 1
                goto L_0x0819
            L_0x0818:
                r5 = 0
            L_0x0819:
                java.lang.Class<rn.c0> r6 = p227rn.C22240c0.class
                di3.d r6 = di3.C86312j.m106911c(r6)
                rn.c0 r6 = (p227rn.C22240c0) r6
                boolean r6 = r6.mo35410vH()
                if (r6 == 0) goto L_0x082d
                r21 = r2
                r50 = r20
                goto L_0x0ac5
            L_0x082d:
                java.util.LinkedList r6 = new java.util.LinkedList
                r6.<init>()
                java.util.LinkedList<te3.ho3> r7 = r3.f64350q
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r7)
                java.lang.String r15 = "ReSortBizMsgRecBuffer"
                if (r7 != 0) goto L_0x0a65
                r7 = 1
                java.lang.Object[] r8 = new java.lang.Object[r7]
                java.util.LinkedList<te3.ho3> r7 = r3.f64350q
                int r7 = r7.size()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r9 = 0
                r8[r9] = r7
                java.lang.String r7 = "handleReSortResult recommend_article_info size = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r7, r8)
                boolean r0 = r1.mo25863f(r0)
                java.util.LinkedList<te3.ho3> r7 = r3.f64350q
                if (r7 == 0) goto L_0x0a5e
                java.util.Iterator r7 = r7.iterator()
                r16 = 0
            L_0x085f:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x0a55
                java.lang.Object r8 = r7.next()
                te3.ho3 r8 = (te3.C49733ho3) r8
                com.tencent.mm.storage.z0 r9 = com.tencent.p014mm.storage.C19641z0.f55645a
                java.lang.String r13 = r8.f134788d
                te3.z40 r12 = r8.f134794j
                java.lang.String r11 = r8.f134793i
                java.lang.String r10 = r8.f134795n
                if (r13 != 0) goto L_0x0878
                goto L_0x087e
            L_0x0878:
                boolean r8 = f40.C86709a0.m107522a()
                if (r8 != 0) goto L_0x0891
            L_0x087e:
                r23 = r0
                r21 = r2
                r24 = r4
                r18 = r7
                r0 = r14
                r52 = r15
                r50 = r20
                r4 = 1
                r15 = 0
                r20 = 0
                goto L_0x0a44
            L_0x0891:
                r30 = 0
                r31 = 0
                r32 = 6
                r33 = 0
                java.lang.String r29 = "<sysmsg"
                r28 = r13
                int r8 = z04.C112550d0.m153769E(r28, r29, r30, r31, r32, r33)
                r18 = r7
                r7 = -1
                if (r8 == r7) goto L_0x0a35
                java.lang.String r8 = r13.substring(r8)
                java.lang.String r7 = "this as java.lang.String).substring(startIndex)"
                gy3.C87412m.m108593f(r8, r7)
                java.lang.String r7 = "sysmsg"
                r23 = r10
                r10 = 0
                java.util.Map r7 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r8, r7, r10)
                if (r7 != 0) goto L_0x08c8
                r8 = 1
                java.lang.Object[] r7 = new java.lang.Object[r8]
                r8 = 0
                r7[r8] = r13
                java.lang.String r8 = "XmlParser values is null, msgContent %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r8, r7)
                goto L_0x0910
            L_0x08c8:
                boolean r8 = com.tencent.p014mm.storage.C19613h1.m21036i(r7)
                if (r8 == 0) goto L_0x09a6
                boolean r8 = com.tencent.p014mm.storage.C19613h1.m21047t()
                if (r8 != 0) goto L_0x08d5
                goto L_0x0910
            L_0x08d5:
                java.lang.String r8 = ".sysmsg.BizRecommendExpt.RedDotFlag"
                java.lang.Object r8 = r7.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                r10 = -1
                int r8 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r8, (int) r10)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r19 = r11
                java.lang.String r11 = "onReceiveRecCard canvas redDot = "
                r10.append(r11)
                r10.append(r8)
                java.lang.String r10 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r10)
                te3.re4 r11 = com.tencent.p014mm.storage.C19613h1.m21031d(r7)
                if (r11 != 0) goto L_0x08ff
                goto L_0x0910
            L_0x08ff:
                r10 = 0
                boolean r23 = com.tencent.p014mm.storage.C19613h1.m21043p(r11, r10)
                if (r23 != 0) goto L_0x091d
                r10 = 124(0x7c, float:1.74E-43)
                r9.mo25867j(r10)
                java.lang.String r7 = "[TRACE_BIZRECCARD] onBizRecommendExpt illegal"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r7)
            L_0x0910:
                r21 = r2
                r51 = r14
                r52 = r15
                r50 = r20
                r2 = 1
                r20 = 0
                goto L_0x09a2
            L_0x091d:
                if (r8 != 0) goto L_0x0935
                com.tencent.p014mm.storage.C19636w0.m21175q(r13)
                com.tencent.mm.storage.t r7 = com.tencent.p014mm.storage.C19627t.f55586a
                r13 = 0
                r7.mo25851y(r11, r13)
                r21 = r2
                r12 = r14
                r52 = r15
                r50 = r20
                r2 = 1
                r15 = 1
                r20 = r13
                goto L_0x09dc
            L_0x0935:
                r10 = 1
                r13 = 0
                if (r8 != r10) goto L_0x0992
                com.tencent.mm.pluginsdk.model.w0 r9 = new com.tencent.mm.pluginsdk.model.w0
                r21 = 0
                r22 = 16
                r23 = 0
                r8 = r9
                r46 = r9
                r9 = r27
                r24 = 1
                r10 = r0
                r48 = r11
                r47 = r19
                r11 = r4
                r49 = r12
                r12 = r5
                r50 = r20
                r20 = r13
                r13 = r21
                r51 = r14
                r14 = r22
                r21 = r2
                r52 = r15
                r2 = 1
                r15 = r23
                r8.<init>(r9, r10, r11, r12, r13, r14, r15)
                r9 = r46
                r8 = r48
                com.tencent.mm.storage.o0 r13 = com.tencent.p014mm.storage.C19613h1.m21034g(r7, r8, r9)
                if (r13 == 0) goto L_0x097b
                jw0.a r7 = jw0.C21287a.f60143a
                r14 = r49
                r7.mo33267h(r14, r13)
                r15 = r47
                r13.field_resortBuffer = r15
                goto L_0x097d
            L_0x097b:
                r13 = r20
            L_0x097d:
                if (r13 != 0) goto L_0x098d
                te3.hp3 r7 = new te3.hp3
                r7.<init>()
                java.lang.String r8 = r8.f64527s
                r7.f183530d = r8
                r7.f183534h = r2
                r6.add(r7)
            L_0x098d:
                if (r13 == 0) goto L_0x09a2
                r12 = r51
                goto L_0x09db
            L_0x0992:
                r21 = r2
                r51 = r14
                r52 = r15
                r50 = r20
                r2 = 1
                r7 = 124(0x7c, float:1.74E-43)
                r20 = r13
                r9.mo25867j(r7)
            L_0x09a2:
                r12 = r51
                r15 = 0
                goto L_0x09dc
            L_0x09a6:
                r21 = r2
                r51 = r14
                r52 = r15
                r50 = r20
                r2 = 1
                r20 = 0
                r15 = r11
                r14 = r12
                java.lang.String r8 = ".sysmsg.BizAccountRecommend.RedDotFlag"
                java.lang.Object r8 = r7.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                r10 = -1
                int r8 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r8, (int) r10)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "onReceiveRecCard redDot = "
                r10.append(r11)
                r10.append(r8)
                java.lang.String r10 = r10.toString()
                r12 = r51
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r10)
                if (r8 != 0) goto L_0x09e4
                com.tencent.p014mm.storage.C19636w0.m21175q(r13)
            L_0x09db:
                r15 = 1
            L_0x09dc:
                r23 = r0
                r24 = r4
                r0 = r12
                r4 = 1
                goto L_0x0a44
            L_0x09e4:
                if (r8 != r2) goto L_0x0a29
                com.tencent.mm.pluginsdk.model.w0 r11 = new com.tencent.mm.pluginsdk.model.w0
                r8 = r11
                r9 = r27
                r19 = r23
                r10 = r0
                r2 = r11
                r11 = r4
                r23 = r0
                r0 = r12
                r12 = r5
                r24 = r4
                r4 = r13
                r13 = r19
                r8.<init>(r9, r10, r11, r12, r13)
                com.tencent.mm.storage.o0 r13 = com.tencent.p014mm.storage.C19636w0.m21169k(r4, r7, r2)
                if (r13 == 0) goto L_0x0a0a
                jw0.a r2 = jw0.C21287a.f60143a
                r2.mo33267h(r14, r13)
                r13.field_resortBuffer = r15
                goto L_0x0a0c
            L_0x0a0a:
                r13 = r20
            L_0x0a0c:
                if (r13 != 0) goto L_0x0a24
                te3.hp3 r2 = new te3.hp3
                r2.<init>()
                java.lang.String r4 = ".sysmsg.BizAccountRecommend.ExtraData"
                java.lang.Object r4 = r7.get(r4)
                java.lang.String r4 = (java.lang.String) r4
                r2.f183530d = r4
                r4 = 1
                r2.f183534h = r4
                r6.add(r2)
                goto L_0x0a25
            L_0x0a24:
                r4 = 1
            L_0x0a25:
                if (r13 == 0) goto L_0x0a43
                r15 = 1
                goto L_0x0a44
            L_0x0a29:
                r23 = r0
                r24 = r4
                r0 = r12
                r2 = 124(0x7c, float:1.74E-43)
                r4 = 1
                r9.mo25867j(r2)
                goto L_0x0a43
            L_0x0a35:
                r23 = r0
                r21 = r2
                r24 = r4
                r0 = r14
                r52 = r15
                r50 = r20
                r4 = 1
                r20 = 0
            L_0x0a43:
                r15 = 0
            L_0x0a44:
                r16 = r15 | r16
                r14 = r0
                r7 = r18
                r2 = r21
                r0 = r23
                r4 = r24
                r20 = r50
                r15 = r52
                goto L_0x085f
            L_0x0a55:
                r21 = r2
                r0 = r14
                r50 = r20
                r7 = r15
                r9 = r16
                goto L_0x0a78
            L_0x0a5e:
                r21 = r2
                r0 = r14
                r50 = r20
                r7 = r15
                goto L_0x0a77
            L_0x0a65:
                r21 = r2
                r0 = r14
                r52 = r15
                r50 = r20
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = r1.mo25861d()
                java.lang.String r4 = r3.f64356w
                r7 = r52
                r2.encode((java.lang.String) r7, (java.lang.String) r4)
            L_0x0a77:
                r9 = 0
            L_0x0a78:
                if (r9 == 0) goto L_0x0a88
                r2 = 120(0x78, float:1.68E-43)
                r1.mo25867j(r2)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = r1.mo25861d()
                java.lang.String r3 = r3.f64356w
                r2.encode((java.lang.String) r7, (java.lang.String) r3)
            L_0x0a88:
                boolean r2 = r6.isEmpty()
                if (r2 != 0) goto L_0x0ac5
                if (r5 == 0) goto L_0x0a93
                r2 = 121(0x79, float:1.7E-43)
                goto L_0x0a95
            L_0x0a93:
                r2 = 122(0x7a, float:1.71E-43)
            L_0x0a95:
                r1.mo25867j(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "handleReSortResult recycleReportList size = "
                r2.append(r3)
                int r3 = r6.size()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
                com.tencent.mm.storage.m0 r7 = com.tencent.p014mm.storage.C19620m0.f55507a
                r9 = 0
                r10 = 0
                r11 = 1
                r12 = 6
                r13 = 0
                r8 = r6
                com.tencent.p014mm.storage.C19620m0.m21071c(r7, r8, r9, r10, r11, r12, r13)
                goto L_0x0ac5
            L_0x0abc:
                r21 = r2
                r50 = r20
                r3 = r40
                r1.mo25868k(r3)
            L_0x0ac5:
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r1.mo25861d()
                r1 = r21
                r2 = r50
                r0.encode((java.lang.String) r2, (int) r1)
            L_0x0ad0:
                com.tencent.mm.storage.z0 r0 = com.tencent.p014mm.storage.C19641z0.f55645a
                r0 = 0
                com.tencent.p014mm.storage.C19641z0.f55650f = r0
                com.tencent.p014mm.storage.C19641z0.f55646b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C19639y0.C19640a.run():void");
        }
    }

    public C19639y0(boolean z, int i, C45983e0 e0Var, C64522lg lgVar, List<? extends C19623o0> list) {
        this.f55635d = z;
        this.f55636e = i;
        this.f55637f = e0Var;
        this.f55638g = lgVar;
        this.f55639h = list;
    }

    /* renamed from: a */
    public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        int i3 = 2;
        int i4 = 1;
        Log.m105925i("MicroMsg.BizTimeLineResortLogic", "doReSortCgi CGI callback errType=%d, errCode=%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0 && i2 == 0) {
            C19641z0 z0Var = C19641z0.f55645a;
            if (this.f55635d) {
                i4 = 61;
            }
            z0Var.mo25867j(i4);
            C47465a aVar = cVar.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizMsgReSortResp");
            C22518og ogVar = (C22518og) aVar;
            int i5 = this.f55636e;
            MultiProcessMMKV d = z0Var.mo25861d();
            String str2 = "ReSortBizMsgNextReqTime-" + i5;
            long j = ogVar.f64340d;
            if (j > 604800) {
                j = 604800;
            }
            d.encode(str2, j);
            z0Var.mo25861d().encode("ReSortBizMsgMinUnExposedCount-" + i5, ogVar.f64341e);
            z0Var.mo25861d().encode("ReSortBizMsgMinUnReadCount-" + i5, ogVar.f64342f);
            z0Var.mo25861d().encode("ReSortBizMsgLimitTime-" + i5, ogVar.f64343g);
            z0Var.mo25861d().encode("ReSortBizMsgContextMsgLimit-" + i5, ogVar.f64354u);
            z0Var.mo25861d().encode("ReSortBizMsgReqCount-" + i5, ogVar.f64344h);
            z0Var.mo25861d().encode("ReSortBizMsgExtraRecMsgCount-" + i5, ogVar.f64355v);
            z0Var.mo25861d().encode("ReSortBizMsgFlag", ogVar.f64349p);
            z0Var.mo25861d().encode("ReSortBizMsgBuffer", ogVar.f64351r);
            C49588go3 go32 = ogVar.f64352s;
            if (go32 != null) {
                z0Var.mo25861d().encode("RecCardMaxKeepMsgCount", go32.f134178e);
                z0Var.mo25861d().encode("RecCardMinNewMsgCount", go32.f134177d);
            }
            C20583z.f57949a.mo32230c().encode("SubscribeMsgLimit", ogVar.f64353t);
            Log.m105924i("MicroMsg.BizTimeLineResortLogic", "saveConfig subscribeMsgLimit=" + ogVar.f64353t + ", flag=" + ogVar.f64349p);
            ((C119157j) C119157j.f356862d).mo183876g(new C19640a(ogVar, this.f55636e, this.f55637f, this.f55638g, this.f55639h), "BizReSortThread");
            return 0;
        }
        C19641z0 z0Var2 = C19641z0.f55645a;
        if (this.f55635d) {
            i3 = 62;
        }
        z0Var2.mo25867j(i3);
        C19641z0.f55650f = false;
        C19641z0.f55646b = false;
        return 0;
    }
}
