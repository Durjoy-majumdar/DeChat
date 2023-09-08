package com.tencent.p014mm.storage;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.plugin.biz.C55579f;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PLong;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86312j;
import fy3.C32224a;
import gw0.C76073b;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p227rn.C22240c0;
import rb0.C22221f;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import s90.C77627f;
import te3.C22501jg;
import te3.C22518og;
import te3.C49733ho3;
import te3.C64427hp3;
import te3.C64522lg;
import te3.re4;
import z04.C112550d0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.storage.z0 */
public final class C19641z0 {

    /* renamed from: a */
    public static final C19641z0 f55645a;

    /* renamed from: b */
    public static boolean f55646b;

    /* renamed from: c */
    public static int f55647c;

    /* renamed from: d */
    public static int f55648d;

    /* renamed from: e */
    public static boolean f55649e;

    /* renamed from: f */
    public static boolean f55650f;

    /* renamed from: g */
    public static long f55651g;

    /* renamed from: h */
    public static final C13601g f55652h = C36568h.m40985a(C19644c.f55662d);

    /* renamed from: i */
    public static final C13601g f55653i = C36568h.m40985a(C19645a.f55663d);

    /* renamed from: j */
    public static final C13601g f55654j = C36568h.m40985a(C19646b.f55664d);

    /* renamed from: k */
    public static boolean f55655k;

    /* renamed from: com.tencent.mm.storage.z0$d */
    public static final class C19642d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f55656d;

        /* renamed from: e */
        public final /* synthetic */ C64522lg f55657e;

        /* renamed from: f */
        public final /* synthetic */ long f55658f;

        public C19642d(int i, C64522lg lgVar, long j) {
            this.f55656d = i;
            this.f55657e = lgVar;
            this.f55658f = j;
        }

        public final void run() {
            C19641z0.m21179a(C19641z0.f55645a, this.f55656d, this.f55657e, this.f55658f);
        }
    }

    /* renamed from: com.tencent.mm.storage.z0$e */
    public static final class C19643e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f55659d;

        /* renamed from: e */
        public final /* synthetic */ C64522lg f55660e;

        /* renamed from: f */
        public final /* synthetic */ long f55661f;

        public C19643e(int i, C64522lg lgVar, long j) {
            this.f55659d = i;
            this.f55660e = lgVar;
            this.f55661f = j;
        }

        public final void run() {
            C19641z0.m21179a(C19641z0.f55645a, this.f55659d, this.f55660e, this.f55661f);
        }
    }

    /* renamed from: com.tencent.mm.storage.z0$c */
    public static final class C19644c extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C19644c f55662d = new C19644c();

        public C19644c() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getSingleMMKV("brandService");
        }
    }

    /* renamed from: com.tencent.mm.storage.z0$a */
    public static final class C19645a extends C87413o implements C32224a<MMKVSlotManager> {

        /* renamed from: d */
        public static final C19645a f55663d = new C19645a();

        public C19645a() {
            super(0);
        }

        public Object invoke() {
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("__biz_digest_expose_slot_mmkv_key__");
            C87412m.m108593f(mmkv, "getMMKV(\"__biz_digest_expose_slot_mmkv_key__\")");
            return new MMKVSlotManager(mmkv, 864000);
        }
    }

    /* renamed from: com.tencent.mm.storage.z0$b */
    public static final class C19646b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C19646b f55664d = new C19646b();

        public C19646b() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (C19641z0.f55645a.mo25861d().decodeInt("BizTimeLineReSortMsgCheck", 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        C19641z0 z0Var = new C19641z0();
        f55645a = z0Var;
        f55655k = z0Var.mo25861d().decodeBool("ReSortBizMsgRetrieveInvalidExposureCard", false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.util.LinkedList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: java.util.LinkedList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v24, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v29, resolved type: java.util.LinkedList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0455  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0478  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x049c  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x059f  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x06a4  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x06a7  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x02e7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0397 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x043d A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m21179a(com.tencent.p014mm.storage.C19641z0 r38, int r39, te3.C64522lg r40, long r41) {
        /*
            r7 = r38
            r0 = r39
            r38.getClass()
            r5 = 2
            java.lang.Object[] r1 = new java.lang.Object[r5]
            boolean r2 = f55646b
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6 = 0
            r1[r6] = r2
            boolean r2 = com.tencent.p014mm.storage.C19636w0.f55627d
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4 = 1
            r1[r4] = r2
            java.lang.String r3 = "MicroMsg.BizTimeLineResortLogic"
            java.lang.String r2 = "doReSortCgi isDoingSortBizMsg=%b, isInTimeLine=%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r2, r1)
            boolean r1 = f55646b
            if (r1 == 0) goto L_0x0029
            goto L_0x06d2
        L_0x0029:
            boolean r1 = com.tencent.p014mm.storage.C19636w0.f55627d
            if (r1 == 0) goto L_0x0035
            boolean r1 = r38.mo25863f(r39)
            if (r1 != 0) goto L_0x0035
            r1 = 1
            goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            if (r1 == 0) goto L_0x003f
            r0 = 9
            r7.mo25867j(r0)
            goto L_0x06d2
        L_0x003f:
            boolean r1 = r38.mo25862e(r39)
            if (r1 == 0) goto L_0x0047
            goto L_0x06d2
        L_0x0047:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r38.mo25861d()
            java.lang.String r2 = "ReSortBizMsgLastTime"
            r14 = 0
            long r8 = r1.decodeLong(r2, r14)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r38.mo25861d()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "ReSortBizMsgNextReqTime-"
            r10.append(r11)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            long r10 = r1.decodeLong(r10, r14)
            if (r0 == 0) goto L_0x0076
            if (r0 == r4) goto L_0x0073
            r12 = 2
            goto L_0x0078
        L_0x0073:
            r12 = 180(0xb4, double:8.9E-322)
            goto L_0x0078
        L_0x0076:
            r12 = 60
        L_0x0078:
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 >= 0) goto L_0x007d
            r10 = r12
        L_0x007d:
            rx3.g r1 = f55654j
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0094
            r12 = 10
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x0094
            r10 = r12
        L_0x0094:
            long r12 = java.lang.System.currentTimeMillis()
            r1 = 1000(0x3e8, float:1.401E-42)
            long r14 = (long) r1
            long r12 = r12 / r14
            boolean r18 = r38.mo25863f(r39)
            long r19 = r12 - r8
            long r21 = java.lang.Math.abs(r19)
            r1 = 4
            int r24 = (r21 > r10 ? 1 : (r21 == r10 ? 0 : -1))
            if (r24 >= 0) goto L_0x00d7
            if (r18 == 0) goto L_0x00b0
            r0 = 41
            goto L_0x00b2
        L_0x00b0:
            r0 = 42
        L_0x00b2:
            r7.mo25867j(r0)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            r0[r6] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r0[r4] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r19)
            r0[r5] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            r2 = 3
            r0[r2] = r1
            java.lang.String r1 = "doReSortCgi return currentTime:%d, lastReSortBizMsgTime:%d, timePast:%d, minReSortBizMsgGap:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r0)
            goto L_0x06d2
        L_0x00d7:
            com.tencent.mm.storage.p0 r8 = rb0.C48009v0.Jx0()
            com.tencent.mm.storage.o0 r10 = r8.mo25809mL()
            if (r10 == 0) goto L_0x06cc
            long r8 = r10.field_msgId
            r16 = 0
            int r11 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r11 != 0) goto L_0x00eb
            goto L_0x06cc
        L_0x00eb:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = r38.mo25861d()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "ReSortBizMsgReqCount-"
            r9.append(r11)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r11 = 10
            int r8 = r8.decodeInt(r9, r11)
            r9 = 5
            if (r8 >= r9) goto L_0x010a
            r8 = 5
        L_0x010a:
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 <= r9) goto L_0x010f
            goto L_0x0110
        L_0x010f:
            r9 = r8
        L_0x0110:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = r38.mo25861d()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "ReSortBizMsgExtraRecMsgCount-"
            r6.append(r1)
            r6.append(r0)
            java.lang.String r1 = r6.toString()
            int r1 = r8.decodeInt(r1, r11)
            if (r1 >= 0) goto L_0x012c
            r1 = 0
        L_0x012c:
            r6 = 50
            if (r1 <= r6) goto L_0x0131
            goto L_0x0132
        L_0x0131:
            r6 = r1
        L_0x0132:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r38.mo25861d()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "ReSortBizMsgMinUnExposedCount-"
            r8.append(r11)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            int r1 = r1.decodeInt(r8, r5)
            if (r1 >= 0) goto L_0x014e
            r1 = 0
        L_0x014e:
            r8 = 20
            if (r1 <= r8) goto L_0x0154
            r1 = 20
        L_0x0154:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r11 = r38.mo25861d()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "ReSortBizMsgMinUnReadCount-"
            r5.append(r8)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            int r5 = r11.decodeInt(r5, r4)
            if (r5 >= 0) goto L_0x0170
            r5 = 0
        L_0x0170:
            r8 = 20
            if (r5 <= r8) goto L_0x0176
            r5 = 20
        L_0x0176:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = r38.mo25861d()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r4 = "ReSortBizMsgLimitTime-"
            r11.append(r4)
            r11.append(r0)
            java.lang.String r4 = r11.toString()
            r11 = 86400(0x15180, float:1.21072E-40)
            int r4 = r8.decodeInt(r4, r11)
            r8 = 21600(0x5460, float:3.0268E-41)
            r25 = r10
            if (r4 >= r8) goto L_0x019a
            r4 = 21600(0x5460, float:3.0268E-41)
        L_0x019a:
            long r10 = (long) r4
            long r12 = r12 - r10
            long r26 = r12 * r14
            com.tencent.mm.storage.p0 r8 = rb0.C48009v0.Jx0()
            long r12 = r8.mo25791TO()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = r38.mo25861d()
            java.lang.String r10 = "ReSortBizMsgMaxGroupId"
            r8.encode((java.lang.String) r10, (long) r12)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "doReSortCgi fromScene="
            r8.append(r10)
            r8.append(r0)
            java.lang.String r10 = " reqLimit=%d, unReadLimit=%d, unExposedLimit=%d, limitTime=%d, fromScene="
            r8.append(r10)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r10 = 4
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r20 = 0
            r11[r20] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r24 = 1
            r11[r24] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r22 = 2
            r11[r22] = r10
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r10 = 3
            r11[r10] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r11)
            gy3.e0 r4 = new gy3.e0
            r4.<init>()
            r16 = 0
            if (r18 == 0) goto L_0x020d
            int r8 = (r41 > r16 ? 1 : (r41 == r16 ? 0 : -1))
            if (r8 > 0) goto L_0x0201
            java.lang.String r0 = "doReSortCgi orderFlag <= 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x06d2
        L_0x0201:
            r10 = -4294967296(0xffffffff00000000, double:NaN)
            long r10 = r41 & r10
            r8 = 32
            long r10 = r10 >> r8
            r4.f124000d = r10
        L_0x020d:
            boolean r8 = f55655k
            if (r8 == 0) goto L_0x0219
            boolean r8 = r38.mo25863f(r39)
            if (r8 != 0) goto L_0x0219
            r10 = 1
            goto L_0x021a
        L_0x0219:
            r10 = 0
        L_0x021a:
            com.tencent.mm.storage.p0 r8 = rb0.C48009v0.Jx0()     // Catch:{ Exception -> 0x06ac }
            if (r9 >= r1) goto L_0x0222
            r11 = r1
            goto L_0x0223
        L_0x0222:
            r11 = r9
        L_0x0223:
            r23 = r1
            r19 = r9
            r1 = 5
            r9 = r11
            r28 = r25
            r25 = r10
            r10 = r26
            r29 = r12
            r12 = r41
            r16 = r14
            r14 = r39
            r15 = r25
            java.util.List r8 = r8.mo25801fY(r9, r10, r12, r14, r15)     // Catch:{ Exception -> 0x06ac }
            if (r6 <= 0) goto L_0x02ef
            r9 = 4
            if (r0 == r9) goto L_0x0247
            if (r0 != r1) goto L_0x0245
            goto L_0x0247
        L_0x0245:
            r1 = 0
            goto L_0x0248
        L_0x0247:
            r1 = 1
        L_0x0248:
            if (r1 != 0) goto L_0x02ef
            com.tencent.mm.storage.p0 r1 = rb0.C48009v0.Jx0()
            r9 = 620757041(0x25000031, float:1.1102295E-16)
            r1.getClass()
            r10 = r25
            if (r10 == 0) goto L_0x025b
            java.lang.String r11 = " and isValidExposed = false "
            goto L_0x025d
        L_0x025b:
            java.lang.String r11 = " and isRead = 0 "
        L_0x025d:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "SELECT * FROM BizTimeLineInfo where  type = "
            r12.append(r13)
            r12.append(r9)
            r12.append(r11)
            java.lang.String r9 = " order by orderFlag DESC limit "
            r12.append(r9)
            r12.append(r6)
            java.lang.String r9 = r12.toString()
            zh3.f r11 = r1.f55550d
            r12 = 0
            android.database.Cursor r9 = r11.rawQuery(r9, r12)
            java.util.List r1 = r1.mo25797bD(r9)
            java.util.Iterator r9 = r1.iterator()
        L_0x0288:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0298
            java.lang.Object r11 = r9.next()
            com.tencent.mm.storage.o0 r11 = (com.tencent.p014mm.storage.C19623o0) r11
            r12 = 1
            r11.f55521f1 = r12
            goto L_0x0288
        L_0x0298:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x02a1:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x02ec
            java.lang.Object r11 = r1.next()
            r12 = r11
            com.tencent.mm.storage.o0 r12 = (com.tencent.p014mm.storage.C19623o0) r12
            boolean r13 = r8.isEmpty()
            if (r13 == 0) goto L_0x02b9
        L_0x02b4:
            r41 = r1
            r21 = r2
            goto L_0x02e1
        L_0x02b9:
            java.util.Iterator r13 = r8.iterator()
        L_0x02bd:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x02b4
            java.lang.Object r14 = r13.next()
            com.tencent.mm.storage.o0 r14 = (com.tencent.p014mm.storage.C19623o0) r14
            long r14 = r14.field_msgId
            r41 = r1
            r21 = r2
            long r1 = r12.field_msgId
            int r25 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r25 != 0) goto L_0x02d7
            r1 = 1
            goto L_0x02d8
        L_0x02d7:
            r1 = 0
        L_0x02d8:
            if (r1 == 0) goto L_0x02dc
            r1 = 1
            goto L_0x02e2
        L_0x02dc:
            r1 = r41
            r2 = r21
            goto L_0x02bd
        L_0x02e1:
            r1 = 0
        L_0x02e2:
            if (r1 != 0) goto L_0x02e7
            r9.add(r11)
        L_0x02e7:
            r1 = r41
            r2 = r21
            goto L_0x02a1
        L_0x02ec:
            r21 = r2
            goto L_0x02f9
        L_0x02ef:
            r21 = r2
            r10 = r25
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r9 = r1
        L_0x02f9:
            java.util.LinkedList r11 = new java.util.LinkedList
            r11.<init>()
            com.tencent.mm.pointers.PLong r12 = new com.tencent.mm.pointers.PLong
            r13 = 0
            r12.<init>(r13)
            com.tencent.mm.storage.c0 r1 = com.tencent.p014mm.storage.C19601c0.f55446a
            long r13 = java.lang.System.currentTimeMillis()
            boolean r2 = com.tencent.p014mm.storage.C19601c0.f55454i
            r15 = r3
            if (r2 == 0) goto L_0x0330
            long r2 = com.tencent.p014mm.storage.C19601c0.f55459n
            r31 = 0
            int r25 = (r2 > r31 ? 1 : (r2 == r31 ? 0 : -1))
            if (r25 <= 0) goto L_0x0330
            r1.mo25728q(r2, r13)
            rb0.f r2 = rb0.C22221f.f62962a
            java.lang.Object r2 = r2.getSlotForWrite()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r2
            long r33 = com.tencent.p014mm.storage.C19601c0.f55459n
            java.lang.String r3 = java.lang.String.valueOf(r33)
            java.lang.String r1 = r1.mo25712a(r3)
            r2.encode((java.lang.String) r1, (long) r13)
        L_0x0330:
            long r1 = f55651g
            r13 = 0
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x0339
            goto L_0x0358
        L_0x0339:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r38.mo25861d()
            java.lang.String r2 = "BizTimeLineReSortClientUpdateTime"
            long r31 = r1.decodeLong(r2, r13)
            f55651g = r31
            int r1 = (r31 > r13 ? 1 : (r31 == r13 ? 0 : -1))
            if (r1 > 0) goto L_0x0358
            long r13 = eb0.C75604z3.m90844p()
            f55651g = r13
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r38.mo25861d()
            long r13 = f55651g
            r1.encode((java.lang.String) r2, (long) r13)
        L_0x0358:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r1.addAll(r8)
            r1.addAll(r9)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x036e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x039b
            java.lang.Object r3 = r1.next()
            r13 = r3
            com.tencent.mm.storage.o0 r13 = (com.tencent.p014mm.storage.C19623o0) r13
            r25 = r4
            r14 = r5
            long r4 = r13.field_createTime
            long r33 = f55651g
            int r35 = (r4 > r33 ? 1 : (r4 == r33 ? 0 : -1))
            if (r35 >= 0) goto L_0x038f
            int r4 = r13.field_isRead
            r5 = 1
            if (r4 == r5) goto L_0x038c
            goto L_0x0390
        L_0x038c:
            r24 = 0
            goto L_0x0392
        L_0x038f:
            r5 = 1
        L_0x0390:
            r24 = 1
        L_0x0392:
            if (r24 == 0) goto L_0x0397
            r2.add(r3)
        L_0x0397:
            r5 = r14
            r4 = r25
            goto L_0x036e
        L_0x039b:
            r25 = r4
            r14 = r5
            r5 = 1
            java.util.Iterator r13 = r2.iterator()
        L_0x03a3:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x043d
            java.lang.Object r1 = r13.next()
            r4 = r1
            com.tencent.mm.storage.o0 r4 = (com.tencent.p014mm.storage.C19623o0) r4
            long r1 = r4.field_createTime
            int r3 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
            if (r3 >= 0) goto L_0x03bb
            boolean r1 = r4.f55521f1
            if (r1 != 0) goto L_0x03bb
            goto L_0x03a3
        L_0x03bb:
            te3.jg r3 = new te3.jg
            r3.<init>()
            r2 = r23
            r1 = r38
            r41 = r13
            r42 = r14
            r13 = r21
            r14 = r2
            r2 = r4
            r13 = r15
            r15 = r3
            r5 = r4
            r24 = r9
            r23 = r25
            r9 = 1
            r4 = r12
            r36 = r42
            r9 = r5
            r20 = r6
            r42 = r12
            r12 = 2
            r5 = r29
            boolean r1 = r1.mo25859b(r2, r3, r4, r5)
            if (r1 != 0) goto L_0x03e6
            goto L_0x0427
        L_0x03e6:
            r11.add(r15)
            boolean r1 = r9.f55521f1
            if (r1 != 0) goto L_0x041e
            com.tencent.mm.storage.g0 r1 = com.tencent.p014mm.storage.C6710g0.f24120a
            boolean r2 = r1.mo7654a()
            if (r2 != 0) goto L_0x03f6
            goto L_0x041e
        L_0x03f6:
            int r2 = r15.f64007f
            r3 = 1
            if (r2 != r3) goto L_0x0401
            boolean r2 = r9.mo25763m2(r3)
            if (r2 == 0) goto L_0x040b
        L_0x0401:
            int r2 = r15.f64007f
            if (r2 == r3) goto L_0x0410
            boolean r2 = r9.mo25763m2(r3)
            if (r2 == 0) goto L_0x0410
        L_0x040b:
            java.lang.String r2 = "checkReqData show big pic flag invalid!"
            r1.mo7655b(r2)
        L_0x0410:
            int r2 = r15.f64010i
            long r2 = (long) r2
            long r4 = r26 / r16
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x041e
            java.lang.String r2 = "CheckReqData Msg time invalid!"
            r1.mo7655b(r2)
        L_0x041e:
            int r1 = r11.size()
            int r9 = r19 + r20
            if (r1 < r9) goto L_0x0427
            goto L_0x044b
        L_0x0427:
            r12 = r42
            r15 = r13
            r6 = r20
            r25 = r23
            r9 = r24
            r5 = 1
            r20 = 0
            r22 = 2
            r13 = r41
            r23 = r14
            r14 = r36
            goto L_0x03a3
        L_0x043d:
            r20 = r6
            r24 = r9
            r42 = r12
            r36 = r14
            r13 = r15
            r14 = r23
            r23 = r25
            r12 = 2
        L_0x044b:
            com.tencent.mm.storage.g0 r1 = com.tencent.p014mm.storage.C6710g0.f24120a
            int r9 = r19 + r20
            int r2 = r11.size()
            if (r9 >= r2) goto L_0x045a
            java.lang.String r2 = "checkReqLimit reqLimit check fail!"
            r1.mo7655b(r2)
        L_0x045a:
            com.tencent.mm.storage.p0 r1 = rb0.C48009v0.Jx0()
            com.tencent.mm.storage.o0 r2 = r1.mo25809mL()
            if (r2 != 0) goto L_0x0466
            r9 = 0
            goto L_0x046d
        L_0x0466:
            long r2 = r2.field_orderFlag
            int r6 = r1.mo25803gY(r2)
            r9 = r6
        L_0x046d:
            java.util.Iterator r1 = r8.iterator()
            r6 = 0
        L_0x0472:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x048c
            java.lang.Object r2 = r1.next()
            com.tencent.mm.storage.o0 r2 = (com.tencent.p014mm.storage.C19623o0) r2
            java.lang.String r3 = "info"
            gy3.C87412m.m108593f(r2, r3)
            boolean r2 = r7.mo25864g(r2, r10)
            if (r2 != 0) goto L_0x0472
            int r6 = r6 + 1
            goto L_0x0472
        L_0x048c:
            rx3.g r1 = f55654j
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x04c6
            if (r18 != 0) goto L_0x04b3
            r5 = r36
            if (r9 >= r5) goto L_0x04b3
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r8 = 0
            r0[r8] = r1
            java.lang.String r1 = "doReSortCgi unReadLimit return %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r0)
            goto L_0x06d2
        L_0x04b3:
            r1 = 1
            r8 = 0
            if (r6 >= r14) goto L_0x04c7
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r0[r8] = r1
            java.lang.String r1 = "doReSortCgi unExposedLimit return %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r0)
            goto L_0x06d2
        L_0x04c6:
            r8 = 0
        L_0x04c7:
            ob0.c$b r1 = new ob0.c$b
            r1.<init>()
            te3.ng r2 = new te3.ng
            r2.<init>()
            r1.f127066a = r2
            te3.og r2 = new te3.og
            r2.<init>()
            r1.f127067b = r2
            java.lang.String r2 = "/cgi-bin/mmbiz-bin/timeline/bizmsgresort"
            r1.f127068c = r2
            r2 = 2818(0xb02, float:3.949E-42)
            r1.f127069d = r2
            ob0.c r14 = r1.mo72403a()
            ob0.c$c r1 = r14.f127055a
            pe3.a r1 = r1.f127080a
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizMsgReSortReq"
            gy3.C87412m.m108592e(r1, r2)
            r15 = r1
            te3.ng r15 = (te3.C22516ng) r15
            r15.f64298d = r11
            r15.f64299e = r0
            r15.f64300f = r8
            r5 = r40
            r15.f64306o = r5
            java.lang.Class<ex0.d> r1 = ex0.C45696d.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            ex0.d r1 = (ex0.C45696d) r1
            int r6 = r1.mo71017z3()
            r15.f64309r = r6
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r38.mo25861d()
            java.lang.String r2 = "ReSortBizMsgBuffer"
            java.lang.String r1 = r1.decodeString(r2)
            r15.f64302h = r1
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r38.mo25861d()
            java.lang.String r2 = "ReSortBizMsgRecBuffer"
            java.lang.String r1 = r1.decodeString(r2)
            r15.f64313v = r1
            java.lang.String r1 = com.tencent.p014mm.storage.C19601c0.f55451f
            r15.f64310s = r1
            r15.f64305n = r9
            com.tencent.mm.storage.l0 r1 = rb0.C48009v0.Ix0()
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r2 = com.tencent.p014mm.storage.C30753k0.f82699t
            int r1 = r1.mo57658jo(r12)
            r15.f64307p = r1
            com.tencent.mm.storage.l0 r1 = rb0.C48009v0.Ix0()
            r2 = 1
            int r1 = r1.mo57658jo(r2)
            r15.f64308q = r1
            te3.jg r12 = new te3.jg
            r12.<init>()
            boolean r1 = com.tencent.p014mm.storage.C19601c0.f55457l
            if (r1 == 0) goto L_0x0552
            java.lang.String r1 = com.tencent.p014mm.storage.C19601c0.f55460o
            r12.f64000C = r1
            r1 = 7
            r12.f63999B = r1
        L_0x054f:
            r37 = r6
            goto L_0x0585
        L_0x0552:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r38.mo25861d()
            java.lang.String r2 = "BizLastMsgId"
            long r1 = r1.decodeLong(r2)
            com.tencent.mm.storage.p0 r3 = rb0.C48009v0.Jx0()
            com.tencent.mm.storage.o0 r3 = r3.mo25806kD(r1)
            if (r3 != 0) goto L_0x0576
            r19 = 0
            int r4 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r4 >= 0) goto L_0x0576
            com.tencent.mm.storage.d1 r3 = rb0.C48009v0.Kx0()
            com.tencent.mm.storage.o0 r1 = r3.mo25733Ow(r1)
            r2 = r1
            goto L_0x0577
        L_0x0576:
            r2 = r3
        L_0x0577:
            if (r2 == 0) goto L_0x054f
            r1 = r38
            r3 = r12
            r4 = r42
            r37 = r6
            r5 = r29
            r1.mo25859b(r2, r3, r4, r5)
        L_0x0585:
            r15.f64311t = r12
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r38.mo25861d()
            java.lang.String r2 = "ReSortBizMsgFailReason"
            int r1 = r1.decodeInt(r2, r8)
            r15.f64312u = r1
            r1 = r28
            long r1 = r1.field_orderFlag
            r3 = r42
            long r3 = r3.value
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x05a5
            int r1 = r15.f64300f
            r2 = 1
            r1 = r1 | r2
            r15.f64300f = r1
        L_0x05a5:
            com.tencent.mm.pluginsdk.model.a r1 = com.tencent.p014mm.pluginsdk.model.C44545a.f120794a
            java.lang.String r2 = r1.mo69323a()
            r15.f64316y = r2
            boolean r1 = r1.mo69325c()
            r15.f64317z = r1
            jw0.a r1 = jw0.C21287a.f60143a
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 43200000(0x2932e00, double:2.1343636E-316)
            long r2 = r2 / r4
            java.lang.String r2 = java.lang.String.valueOf(r2)
            long r19 = java.lang.System.currentTimeMillis()
            long r19 = r19 - r4
            long r19 = r19 / r4
            java.lang.String r3 = java.lang.String.valueOf(r19)
            rb0.f r4 = rb0.C22221f.f62962a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "digest_show_bold_"
            r5.append(r6)
            r5.append(r2)
            r12 = 125(0x7d, float:1.75E-43)
            r5.append(r12)
            java.lang.String r5 = r5.toString()
            int r5 = r4.decodeInt(r5, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r3)
            r8.append(r12)
            java.lang.String r6 = r8.toString()
            r8 = 0
            int r6 = r4.decodeInt(r6, r8)
            int r5 = r5 + r6
            r15.f64303i = r5
            java.lang.String r2 = r1.mo33261b(r2)
            int r2 = r4.decodeInt(r2, r8)
            java.lang.String r1 = r1.mo33261b(r3)
            int r1 = r4.decodeInt(r1, r8)
            int r2 = r2 + r1
            r15.f64304j = r2
            r1 = 1
            f55646b = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "doReSortCgi retrieveInvalidExposeCard = "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = ", bitFlag="
            r1.append(r2)
            int r2 = r15.f64300f
            r1.append(r2)
            java.lang.String r2 = ", size="
            r1.append(r2)
            int r2 = r11.size()
            r1.append(r2)
            java.lang.String r2 = ", officialAccountPos="
            r1.append(r2)
            r2 = r37
            r1.append(r2)
            java.lang.String r2 = ", lastFailReason="
            r1.append(r2)
            int r2 = r15.f64312u
            r1.append(r2)
            java.lang.String r2 = " recListSize = "
            r1.append(r2)
            int r2 = r24.size()
            r1.append(r2)
            java.lang.String r2 = " unReadCounts="
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = " netType = "
            r1.append(r2)
            java.lang.String r2 = r15.f64316y
            r1.append(r2)
            java.lang.String r2 = ", isHeadsetOn="
            r1.append(r2)
            boolean r2 = r15.f64317z
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r38.mo25861d()
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 / r16
            r4 = r21
            r1.encode((java.lang.String) r4, (long) r2)
            com.tencent.mm.storage.y0 r8 = new com.tencent.mm.storage.y0
            r1 = r8
            r2 = r18
            r3 = r39
            r4 = r23
            r5 = r40
            r6 = r24
            r1.<init>(r2, r3, r4, r5, r6)
            r0 = 0
            ob0.C89144l0.m111429e(r14, r8, r0)
            if (r18 == 0) goto L_0x06a7
            r6 = 60
            goto L_0x06a8
        L_0x06a7:
            r6 = 0
        L_0x06a8:
            r7.mo25867j(r6)
            goto L_0x06d2
        L_0x06ac:
            r0 = move-exception
            r13 = r3
            r1 = 112(0x70, float:1.57E-43)
            r7.mo25867j(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "doReSortCgi getUnReadListNew ex "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            goto L_0x06d2
        L_0x06cc:
            r13 = r3
            java.lang.String r0 = "doReSortCgi getLastBizTimeLineInfo return null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
        L_0x06d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C19641z0.m21179a(com.tencent.mm.storage.z0, int, te3.lg, long):void");
    }

    /* renamed from: b */
    public final boolean mo25859b(C19623o0 o0Var, C22501jg jgVar, PLong pLong, long j) {
        int i;
        C87412m.m108594g(o0Var, "info");
        C87412m.m108594g(jgVar, "item");
        C87412m.m108594g(pLong, "maxOrderFlag");
        if (!o0Var.mo25754B2() && !o0Var.mo25758F2()) {
            return false;
        }
        jgVar.f64005d = o0Var.field_bizClientMsgId;
        jgVar.f64019u = o0Var.field_msgId;
        jgVar.f64006e = (int) ((o0Var.field_orderFlag & 4278190080L) >> 24);
        jgVar.f64007f = o0Var.mo25763m2(1) ? 1 : 2;
        jgVar.f64010i = (int) (o0Var.field_createTime / ((long) 1000));
        int i2 = o0Var.field_hasShow == 1 ? 1 : 0;
        if (o0Var.field_isRead == 1) {
            i = 2;
        } else {
            i = (o0Var.mo25767q2() < j ? 4 : 0) | 0;
        }
        jgVar.f64008g = i | i2;
        if (o0Var.field_isRead == 1) {
            MMKVSlotManager c = mo25860c();
            String s2 = o0Var.mo25769s2();
            C87412m.m108593f(s2, "info.key");
            int decodeInt$default = MMKVSlotManager.decodeInt$default(c, "exposeTimes-" + s2, 0, 2, (Object) null);
            if (decodeInt$default < 1) {
                decodeInt$default = 1;
            }
            jgVar.f64015q = decodeInt$default;
            MMKVSlotManager c2 = mo25860c();
            String s25 = o0Var.mo25769s2();
            C87412m.m108593f(s25, "info.key");
            jgVar.f64002E = MMKVSlotManager.decodeInt$default(c2, "exposeRatio-" + s25, 0, 2, (Object) null);
        }
        C19601c0 c0Var = C19601c0.f55446a;
        String valueOf = String.valueOf(o0Var.field_msgId);
        C22221f fVar = C22221f.f62962a;
        jgVar.f64011j = MMKVSlotManager.decodeInt$default(fVar, valueOf, 0, 2, (Object) null) == 1 ? 1 : 0;
        jgVar.f64012n = fVar.decodeInt(c0Var.mo25714c(valueOf), 0);
        jgVar.f64013o = (int) fVar.decodeLong(c0Var.mo25715d(valueOf), 0);
        jgVar.f64014p = fVar.decodeInt(c0Var.mo25713b(valueOf), 0);
        Log.m105918d("setExposeParams", "setExposeParams digest_exposure=" + jgVar.f64011j + ", digest_exposure_cnt=" + jgVar.f64012n + ", digest_exposure_period=" + jgVar.f64013o + ", digest_exposure_pos=" + jgVar.f64014p);
        long j2 = o0Var.field_orderFlag;
        if (j2 > pLong.value) {
            pLong.value = j2;
        }
        if (o0Var.mo25754B2()) {
            try {
                C77627f JZ = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(o0Var.field_msgId, o0Var.field_content);
                if (JZ != null && !Util.isNullOrNil((List) JZ.f226295i)) {
                    jgVar.f64009h = JZ.f226295i.get(0).f226326e;
                    jgVar.f64016r = JZ.f226295i.get(0).f226333o;
                }
            } catch (Exception unused) {
            }
            jgVar.f64017s = C19613h1.m21029b(o0Var);
        } else if (!o0Var.mo25758F2()) {
            return false;
        } else {
            re4 x2 = o0Var.mo25774x2();
            if (x2 != null) {
                jgVar.f64021w = x2.f64527s;
            }
            jgVar.f64017s = C19613h1.m21029b(o0Var);
        }
        return true;
    }

    /* renamed from: c */
    public final MMKVSlotManager mo25860c() {
        return (MMKVSlotManager) ((C36570n) f55653i).getValue();
    }

    /* renamed from: d */
    public final MultiProcessMMKV mo25861d() {
        return (MultiProcessMMKV) f55652h.getValue();
    }

    /* renamed from: e */
    public final boolean mo25862e(int i) {
        boolean z = true;
        if ((!(f55649e && f55647c != f55648d) && C19636w0.f55627d) || !mo25863f(i)) {
            z = false;
        }
        if (z) {
            mo25867j(34);
            Log.m105924i("MicroMsg.BizTimeLineResortLogic", "hasScrollNotDoResort");
        }
        return z;
    }

    /* renamed from: f */
    public final boolean mo25863f(int i) {
        return i == 3 || i == 4 || i == 5;
    }

    /* renamed from: g */
    public final boolean mo25864g(C19623o0 o0Var, boolean z) {
        C87412m.m108594g(o0Var, "info");
        if (z || o0Var.field_isRead != 1) {
            return z && o0Var.field_isValidExposed;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo25865h() {
        return mo25861d().decodeBool("ReSortBizMsgRedDotSample", false);
    }

    /* renamed from: i */
    public final void mo25866i(int i, C64522lg lgVar, long j) {
        if (!((C22240c0) C86312j.m106911c(C22240c0.class)).mo35407eG()) {
            long currentTimeMillis = System.currentTimeMillis() - C55579f.f158250d;
            if (currentTimeMillis < 15000) {
                C119179t tVar = C119157j.f356862d;
                C19642d dVar = new C19642d(i, lgVar, j);
                long j2 = 15000 - currentTimeMillis;
                if (j2 < FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                    j2 = 5000;
                }
                ((C119157j) tVar).mo183879j(dVar, j2, "BizReSortThread");
                return;
            }
            ((C119157j) C119157j.f356862d).mo183876g(new C19643e(i, lgVar, j), "BizReSortThread");
        }
    }

    /* renamed from: j */
    public final void mo25867j(int i) {
        C115669n.INSTANCE.idkeyStat(1130, (long) i, 1, false);
    }

    /* renamed from: k */
    public final void mo25868k(C22518og ogVar) {
        if (ogVar != null && !Util.isNullOrNil((List) ogVar.f64350q)) {
            LinkedList linkedList = new LinkedList();
            LinkedList<C49733ho3> linkedList2 = ogVar.f64350q;
            if (linkedList2 != null) {
                for (C49733ho3 ho32 : linkedList2) {
                    String str = ho32 != null ? ho32.f134788d : null;
                    int E = str != null ? C112550d0.m153769E(str, "<sysmsg", 0, false, 6, (Object) null) : -1;
                    if (!(str == null || E == -1)) {
                        String substring = str.substring(E);
                        C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
                        Map<String, String> parseXml = XmlParser.parseXml(substring, "sysmsg", (String) null);
                        if (parseXml != null) {
                            C64427hp3 hp32 = new C64427hp3();
                            String str2 = parseXml.get(".sysmsg.BizAccountRecommend.ExtraData");
                            if (str2 == null) {
                                str2 = parseXml.get(".sysmsg.BizRecommendExpt.ExtraData");
                            }
                            hp32.f183530d = str2;
                            hp32.f183534h = 1;
                            linkedList.add(hp32);
                        }
                    }
                }
            }
            if (!linkedList.isEmpty()) {
                mo25867j(122);
                Log.m105924i("MicroMsg.BizTimeLineResortLogic", "reportRecycle recycleReportList size = " + linkedList.size());
                C19620m0.m21071c(C19620m0.f55507a, linkedList, 0, 0, 1, 6, (Object) null);
            }
        }
    }
}
