package com.tencent.p014mm.storage;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.LinkedList;
import ob0.C47350c;
import ob0.C89144l0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C50021jp3;
import te3.C64449ip3;

/* renamed from: com.tencent.mm.storage.m0 */
public final class C19620m0 {

    /* renamed from: a */
    public static final C19620m0 f55507a = new C19620m0();

    /* renamed from: b */
    public static final C13601g f55508b = C36568h.m40985a(C6711b.f24122d);

    /* renamed from: c */
    public static final C13601g f55509c = C36568h.m40985a(C6712d.f24123d);

    /* renamed from: d */
    public static final C13601g f55510d = C36568h.m40985a(C19622c.f55515d);

    /* renamed from: com.tencent.mm.storage.m0$b */
    public static final class C6711b extends C87413o implements C32224a<MMKVSlotManager> {

        /* renamed from: d */
        public static final C6711b f24122d = new C6711b();

        public C6711b() {
            super(0);
        }

        public Object invoke() {
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("__biz_cardRecycleSlot_slot_mmkv_key__");
            C87412m.m108593f(mmkv, "getMMKV(\"__biz_cardRecycleSlot_slot_mmkv_key__\")");
            return new MMKVSlotManager(mmkv, 31536000);
        }
    }

    /* renamed from: com.tencent.mm.storage.m0$d */
    public static final class C6712d extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C6712d f24123d = new C6712d();

        public C6712d() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getSingleMMKV("brandService");
        }
    }

    /* renamed from: com.tencent.mm.storage.m0$e */
    public static final class C6713e extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C6713e f24124d = new C6713e();

        public C6713e() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_biz_recycle_card, 1) != 1) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            boolean booleanValue = valueOf.booleanValue();
            Log.m105924i("MicroMsg.BizRecycleCardLogic", "recycleCardOpen open " + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: com.tencent.mm.storage.m0$a */
    public enum C19621a {
        RECYCLE_CARD_SCENE_FEEDBACK(3),
        RECYCLE_CARD_SCENE_RESORT(4);
        

        /* renamed from: d */
        public final int f55514d;

        /* access modifiers changed from: public */
        C19621a(int i) {
            this.f55514d = i;
        }
    }

    /* renamed from: com.tencent.mm.storage.m0$c */
    public static final class C19622c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C19622c f55515d = new C19622c();

        public C19622c() {
            super(0);
        }

        public Object invoke() {
            C19620m0 m0Var = C19620m0.f55507a;
            boolean z = true;
            if (((MultiProcessMMKV) ((C36570n) C19620m0.f55509c).getValue()).decodeInt("BizTimeLineRecycleCardCheck", 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        C36568h.m40985a(C6713e.f24124d);
    }

    /* renamed from: c */
    public static LinkedList m21071c(C19620m0 m0Var, LinkedList linkedList, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        m0Var.getClass();
        C87412m.m108594g(linkedList, "recycleReportList");
        C47350c.C47352b bVar = new C47350c.C47352b();
        C64449ip3 ip32 = new C64449ip3();
        ip32.f183714d = linkedList;
        ip32.f183715e = i;
        ip32.f183716f = i2;
        bVar.f127066a = ip32;
        bVar.f127067b = new C50021jp3();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/timeline/recyclecardreport";
        bVar.f127069d = 4768;
        C89144l0.m111429e(bVar.mo72403a(), new C6714n0(linkedList, i3), false);
        return linkedList;
    }

    /* renamed from: a */
    public final boolean mo25750a(C19623o0 o0Var) {
        String str = "CardRecycleReport" + o0Var.field_msgId + '-' + o0Var.field_recommendCardId;
        C13601g gVar = f55508b;
        if (((MMKVSlotManager) ((C36570n) gVar).getValue()).decodeBool(str, false)) {
            return false;
        }
        ((MultiProcessMMKV) ((MMKVSlotManager) ((C36570n) gVar).getValue()).getSlotForWrite()).encode(str, true);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x01e4  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedList<te3.C64427hp3> mo25751b(java.util.LinkedList<te3.C49456fp3> r22, com.tencent.p014mm.storage.C19620m0.C19621a r23, boolean r24, java.util.HashSet<java.lang.Long> r25) {
        /*
            r21 = this;
            r0 = r23
            r1 = r25
            java.lang.String r2 = "list"
            r3 = r22
            gy3.C87412m.m108594g(r3, r2)
            java.lang.String r2 = "fromScene"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.String r2 = "forceDeleteSet"
            gy3.C87412m.m108594g(r1, r2)
            boolean r2 = r22.isEmpty()
            r4 = 0
            java.lang.String r5 = "MicroMsg.BizRecycleCardLogic"
            if (r2 == 0) goto L_0x0024
            java.lang.String r0 = "handleRecycleCardResult list is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            return r4
        L_0x0024:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            com.tencent.mm.storage.m0$a r6 = com.tencent.p014mm.storage.C19620m0.C19621a.RECYCLE_CARD_SCENE_FEEDBACK
            java.lang.String r7 = "handleRecycleCardResult ok "
            java.lang.String r8 = "handleRecycleCardResult flag "
            r9 = 2
            if (r0 != r6) goto L_0x00cd
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r6 = r22.iterator()
        L_0x003b:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto L_0x0069
            java.lang.Object r12 = r6.next()
            r13 = r12
            te3.fp3 r13 = (te3.C49456fp3) r13
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r8)
            int r15 = r13.f133625f
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r14)
            int r13 = r13.f133625f
            if (r13 != r9) goto L_0x0062
            r13 = 1
            goto L_0x0063
        L_0x0062:
            r13 = 0
        L_0x0063:
            if (r13 == 0) goto L_0x003b
            r1.add(r12)
            goto L_0x003b
        L_0x0069:
            java.util.Iterator r1 = r1.iterator()
        L_0x006d:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x02f7
            java.lang.Object r6 = r1.next()
            te3.fp3 r6 = (te3.C49456fp3) r6
            com.tencent.mm.storage.p0 r8 = rb0.C48009v0.Jx0()
            long r9 = r6.f133624e
            com.tencent.mm.storage.o0 r8 = r8.mo25806kD(r9)
            if (r8 == 0) goto L_0x006d
            boolean r9 = r8.mo25758F2()
            if (r9 != 0) goto L_0x008c
            goto L_0x006d
        L_0x008c:
            te3.hp3 r9 = new te3.hp3
            r9.<init>()
            te3.re4 r10 = r8.mo25774x2()
            if (r10 == 0) goto L_0x009a
            java.lang.String r10 = r10.f64527s
            goto L_0x009b
        L_0x009a:
            r10 = r4
        L_0x009b:
            r9.f183530d = r10
            long r12 = r6.f133624e
            r9.f183531e = r12
            java.lang.String r10 = r6.f133626g
            r9.f183533g = r10
            r2.add(r9)
            com.tencent.mm.storage.p0 r9 = rb0.C48009v0.Jx0()
            long r12 = r6.f133624e
            r9.mo25785Lo(r12)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            long r8 = r8.field_msgId
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            com.tencent.mm.storage.m0 r6 = f55507a
            r8 = 12
            r6.mo25752d(r8)
            goto L_0x006d
        L_0x00cd:
            com.tencent.mm.storage.p0 r6 = rb0.C48009v0.Jx0()
            com.tencent.mm.storage.o0 r6 = r6.mo25809mL()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r13 = r22.iterator()
        L_0x00de:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x010d
            java.lang.Object r14 = r13.next()
            r15 = r14
            te3.fp3 r15 = (te3.C49456fp3) r15
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r8)
            int r10 = r15.f133625f
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r4)
            int r4 = r15.f133625f
            if (r4 != r9) goto L_0x0105
            r4 = 1
            goto L_0x0106
        L_0x0105:
            r4 = 0
        L_0x0106:
            if (r4 == 0) goto L_0x010b
            r12.add(r14)
        L_0x010b:
            r4 = 0
            goto L_0x00de
        L_0x010d:
            java.util.Iterator r4 = r12.iterator()
        L_0x0111:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x02f7
            java.lang.Object r8 = r4.next()
            te3.fp3 r8 = (te3.C49456fp3) r8
            com.tencent.mm.storage.p0 r10 = rb0.C48009v0.Jx0()
            long r12 = r8.f133624e
            com.tencent.mm.storage.o0 r10 = r10.mo25806kD(r12)
            long r12 = r8.f133624e
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            boolean r12 = r1.contains(r12)
            if (r10 == 0) goto L_0x02eb
            boolean r13 = r10.mo25758F2()
            if (r13 != 0) goto L_0x013b
            goto L_0x02eb
        L_0x013b:
            r13 = 21314(0x5342, float:2.9867E-41)
            if (r12 != 0) goto L_0x01a1
            com.tencent.mm.storage.z0 r14 = com.tencent.p014mm.storage.C19641z0.f55645a
            r15 = r24
            boolean r14 = r14.mo25864g(r10, r15)
            if (r14 == 0) goto L_0x01a3
            com.tencent.mm.storage.m0 r14 = f55507a
            rx3.g r17 = f55510d
            rx3.n r17 = (rx3.C36570n) r17
            java.lang.Object r17 = r17.getValue()
            java.lang.Boolean r17 = (java.lang.Boolean) r17
            boolean r17 = r17.booleanValue()
            if (r17 == 0) goto L_0x01a3
            boolean r8 = r14.mo25750a(r10)
            if (r8 == 0) goto L_0x0189
            r11 = 1
            r14.mo25752d(r11)
            te3.re4 r8 = r10.mo25774x2()
            if (r8 == 0) goto L_0x016f
            java.lang.String r8 = r8.f64527s
            goto L_0x0170
        L_0x016f:
            r8 = 0
        L_0x0170:
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r12 = new java.lang.Object[r9]
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.WebViewUtilities.doUrlEncode(r8)
            r14 = 0
            r12[r14] = r8
            r8 = 1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            r12[r8] = r14
            r11.mo160131h(r13, r12)
        L_0x0189:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "handleRecycleCardResult msgIsRead "
            r8.append(r11)
            long r10 = r10.field_msgId
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)
            goto L_0x02ed
        L_0x01a1:
            r15 = r24
        L_0x01a3:
            if (r12 != 0) goto L_0x0226
            com.tencent.mm.storage.m0 r11 = f55507a
            long r18 = java.lang.System.currentTimeMillis()
            long r13 = r10.field_createTime
            long r18 = r18 - r13
            r13 = 172800000(0xa4cb800, double:8.53745436E-316)
            int r20 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
            if (r20 <= 0) goto L_0x01b8
            r14 = r4
            goto L_0x01cb
        L_0x01b8:
            rb0.f r13 = rb0.C22221f.f62962a
            r14 = r4
            long r3 = r10.field_msgId
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r4 = 0
            int r3 = r13.decodeInt(r3, r4)
            r4 = 1
            if (r3 != r4) goto L_0x01cb
            r3 = 1
            goto L_0x01cc
        L_0x01cb:
            r3 = 0
        L_0x01cc:
            if (r3 == 0) goto L_0x0227
            rx3.g r3 = f55510d
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0227
            boolean r3 = r11.mo25750a(r10)
            if (r3 == 0) goto L_0x020e
            r3 = 2
            r11.mo25752d(r3)
            te3.re4 r3 = r10.mo25774x2()
            if (r3 == 0) goto L_0x01f2
            java.lang.String r3 = r3.f64527s
            goto L_0x01f3
        L_0x01f2:
            r3 = 0
        L_0x01f3:
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r8 = new java.lang.Object[r9]
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.WebViewUtilities.doUrlEncode(r3)
            r11 = 0
            r8[r11] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r11 = 1
            r8[r11] = r3
            r3 = 21314(0x5342, float:2.9867E-41)
            r4.mo160131h(r3, r8)
        L_0x020e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "handleRecycleCardResult msg digest IsRead "
            r3.append(r4)
            long r10 = r10.field_msgId
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            goto L_0x02ee
        L_0x0226:
            r14 = r4
        L_0x0227:
            if (r12 != 0) goto L_0x0296
            long r3 = r10.field_msgId
            r13 = r10
            long r9 = r6.field_msgId
            int r18 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r18 != 0) goto L_0x0294
            com.tencent.mm.storage.m0 r3 = f55507a
            rx3.g r4 = f55510d
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0294
            r4 = r13
            boolean r8 = r3.mo25750a(r4)
            if (r8 == 0) goto L_0x0279
            r8 = 3
            r3.mo25752d(r8)
            r3 = 3
            te3.re4 r8 = r4.mo25774x2()
            if (r8 == 0) goto L_0x025a
            java.lang.String r8 = r8.f64527s
            goto L_0x025b
        L_0x025a:
            r8 = 0
        L_0x025b:
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 2
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.WebViewUtilities.doUrlEncode(r8)
            r13 = 0
            r11[r13] = r8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r16 = 1
            r11[r16] = r3
            r3 = 21314(0x5342, float:2.9867E-41)
            r9.mo160131h(r3, r11)
            goto L_0x027d
        L_0x0279:
            r10 = 2
            r13 = 0
            r16 = 1
        L_0x027d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "handleRecycleCardResult msg is newest card "
            r3.append(r8)
            long r8 = r4.field_msgId
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            goto L_0x02f1
        L_0x0294:
            r4 = r13
            goto L_0x0297
        L_0x0296:
            r4 = r10
        L_0x0297:
            r10 = 2
            r13 = 0
            r16 = 1
            com.tencent.mm.storage.p0 r3 = rb0.C48009v0.Jx0()
            long r10 = r8.f133624e
            r3.mo25785Lo(r10)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            long r10 = r4.field_msgId
            r3.append(r10)
            java.lang.String r10 = ", forceDelete="
            r3.append(r10)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            com.tencent.mm.storage.m0 r3 = f55507a
            r10 = 4
            r3.mo25752d(r10)
            if (r12 == 0) goto L_0x02ce
            r10 = 6
            r3.mo25752d(r10)
        L_0x02ce:
            te3.hp3 r3 = new te3.hp3
            r3.<init>()
            te3.re4 r4 = r4.mo25774x2()
            if (r4 == 0) goto L_0x02dc
            java.lang.String r4 = r4.f64527s
            goto L_0x02dd
        L_0x02dc:
            r4 = 0
        L_0x02dd:
            r3.f183530d = r4
            long r10 = r8.f133624e
            r3.f183531e = r10
            java.lang.String r4 = r8.f133626g
            r3.f183533g = r4
            r2.add(r3)
            goto L_0x02f1
        L_0x02eb:
            r15 = r24
        L_0x02ed:
            r14 = r4
        L_0x02ee:
            r13 = 0
            r16 = 1
        L_0x02f1:
            r3 = r22
            r4 = r14
            r9 = 2
            goto L_0x0111
        L_0x02f7:
            r13 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "handleRecycleCardResult recycleReportList fromScene="
            r1.append(r3)
            int r0 = r0.f55514d
            r1.append(r0)
            java.lang.String r0 = ", size = "
            r1.append(r0)
            int r0 = r2.size()
            r1.append(r0)
            r0 = 47
            r1.append(r0)
            int r0 = r22.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x032e
            r0 = 0
            return r0
        L_0x032e:
            com.tencent.mm.storage.p0 r0 = rb0.C48009v0.Jx0()
            com.tencent.mm.storage.p0 r1 = rb0.C48009v0.Jx0()
            long r3 = r1.mo25791TO()
            r1 = 32
            long r3 = r3 << r1
            java.util.List r0 = r0.mo25808mI(r3)
            java.util.Iterator r0 = r0.iterator()
            r8 = 0
            r9 = 0
        L_0x0347:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x035e
            java.lang.Object r1 = r0.next()
            com.tencent.mm.storage.o0 r1 = (com.tencent.p014mm.storage.C19623o0) r1
            boolean r3 = r1.mo25754B2()
            int r8 = r8 + r3
            boolean r1 = r1.mo25758F2()
            int r9 = r9 + r1
            goto L_0x0347
        L_0x035e:
            r10 = 0
            r11 = 8
            r12 = 0
            r6 = r21
            r7 = r2
            m21071c(r6, r7, r8, r9, r10, r11, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C19620m0.mo25751b(java.util.LinkedList, com.tencent.mm.storage.m0$a, boolean, java.util.HashSet):java.util.LinkedList");
    }

    /* renamed from: d */
    public final void mo25752d(long j) {
        C115669n.INSTANCE.mo175913w(1534, j, 1);
    }
}
