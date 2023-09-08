package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.storage.C19620m0;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.p0$$f;
import com.tencent.p014mm.storage.p0$$g;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import pe3.C47465a;
import rb0.C48009v0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import te3.C22493dh;
import te3.C22495eh;
import te3.C22499hb0;
import te3.C22521pi1;
import te3.C49421fh;
import te3.C49559gh;
import te3.C49844ih;
import te3.C49990jh;
import te3.C49993ji;
import te3.C64846y23;
import te3.re4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.r */
public final class C18342r {

    /* renamed from: a */
    public static final C18342r f50785a = new C18342r();

    /* renamed from: b */
    public static AtomicInteger f50786b = new AtomicInteger(2);

    /* renamed from: c */
    public static final ConcurrentLinkedDeque<C49559gh> f50787c = new ConcurrentLinkedDeque<>();

    /* renamed from: d */
    public static final HashSet<Long> f50788d = new HashSet<>();

    /* renamed from: e */
    public static final HashSet<Long> f50789e = new HashSet<>();

    /* renamed from: f */
    public static final C13601g f50790f = C36568h.m40985a(C18343a.f50791d);

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.r$a */
    public static final class C18343a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C18343a f50791d = new C18343a();

        public C18343a() {
            super(0);
        }

        public Object invoke() {
            C19620m0 m0Var = C19620m0.f55507a;
            boolean z = true;
            if (((MultiProcessMMKV) ((C36570n) C19620m0.f55509c).getValue()).decodeInt("BizTimeLineUpdateCard", 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.r$b */
    public static final class C18344b implements l0$$e {

        /* renamed from: d */
        public static final C18344b f50792d = new C18344b();

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.r$b$a */
        public static final class C18345a<_Ret, _Var> implements C87581a {

            /* renamed from: a */
            public final /* synthetic */ C19623o0 f50793a;

            /* renamed from: b */
            public final /* synthetic */ C8478d0 f50794b;

            /* renamed from: c */
            public final /* synthetic */ C49990jh f50795c;

            /* renamed from: d */
            public final /* synthetic */ C8479f0<String> f50796d;

            public C18345a(C19623o0 o0Var, C8478d0 d0Var, C49990jh jhVar, C8479f0<String> f0Var) {
                this.f50793a = o0Var;
                this.f50794b = d0Var;
                this.f50795c = jhVar;
                this.f50796d = f0Var;
            }

            public Object call(Object obj) {
                re4 x2;
                C64846y23 y232;
                LinkedList<C22521pi1> linkedList;
                LinkedList<C49993ji> linkedList2;
                Void voidR = (Void) obj;
                re4 x25 = this.f50793a.mo25774x2();
                if ((x25 != null ? x25.f64523o : null) != null) {
                    switch (this.f50793a.mo25774x2().f64521j) {
                        case 101:
                        case 102:
                        case 103:
                        case 105:
                            re4 x26 = this.f50793a.mo25774x2();
                            C49990jh jhVar = this.f50795c;
                            C8478d0 d0Var = this.f50794b;
                            C8479f0<String> f0Var = this.f50796d;
                            C22499hb0 hb02 = x26.f64523o;
                            int i = jhVar.f136114d.f133490d;
                            hb02.f63906h = i;
                            d0Var.f27483d = i;
                            LinkedList<C22495eh> linkedList3 = hb02.f63905g;
                            C87412m.m108593f(linkedList3, "extraInfo.BizInfo");
                            int i2 = 0;
                            for (T next : linkedList3) {
                                int i3 = i2 + 1;
                                if (i2 >= 0) {
                                    C22495eh ehVar = (C22495eh) next;
                                    if (i2 < jhVar.f136114d.f133492f.size() && jhVar.f136114d.f133492f.get(i2) != null) {
                                        x26.f64523o.f63905g.set(i2, jhVar.f136114d.f133492f.get(i2));
                                        x26.f64523o.f63905g.get(i2).f63801o = ehVar.f63801o;
                                        x26.f64523o.f63905g.get(i2).f63802p = ehVar.f63802p;
                                        LinkedList<C22493dh> linkedList4 = x26.f64523o.f63905g.get(i2).f63800n;
                                        C87412m.m108593f(linkedList4, "extraInfo.BizInfo[index].AppMsg");
                                        int i4 = 0;
                                        for (T next2 : linkedList4) {
                                            int i5 = i4 + 1;
                                            if (i4 >= 0) {
                                                C22493dh dhVar = (C22493dh) next2;
                                                LinkedList<C22493dh> linkedList5 = ehVar.f63800n;
                                                if (!(linkedList5 == null || linkedList5.get(i4) == null)) {
                                                    C22493dh dhVar2 = ehVar.f63800n.get(i4);
                                                    dhVar.f63742A = dhVar2.f63742A;
                                                    dhVar.f63743B = dhVar2.f63743B;
                                                    if (dhVar.f63750d != 1) {
                                                        dhVar.f63750d = dhVar2.f63750d;
                                                    }
                                                    dhVar.f63748G = dhVar2.f63748G;
                                                    dhVar.f63747F = dhVar2.f63747F;
                                                    f0Var.f27484d = ((String) f0Var.f27484d) + " |||| " + dhVar2.f63751e;
                                                }
                                                i4 = i5;
                                            } else {
                                                C64197v.m75542k();
                                                throw null;
                                            }
                                        }
                                        continue;
                                    }
                                    i2 = i3;
                                } else {
                                    C64197v.m75542k();
                                    throw null;
                                }
                            }
                            x26.f64516e = System.currentTimeMillis();
                            break;
                        default:
                            this.f50794b.f27483d = this.f50795c.f136114d.f133490d;
                            re4 x27 = this.f50793a.mo25774x2();
                            C49990jh jhVar2 = this.f50795c;
                            C8479f0<String> f0Var2 = this.f50796d;
                            C8478d0 d0Var2 = this.f50794b;
                            C22499hb0 hb03 = x27.f64523o;
                            C49421fh fhVar = jhVar2.f136114d;
                            hb03.f63906h = fhVar.f133490d;
                            hb03.f63902d = fhVar.f133491e;
                            hb03.f63905g = fhVar.f133492f;
                            x27.f64516e = System.currentTimeMillis();
                            f0Var2.f27484d = ((String) f0Var2.f27484d) + " |||| " + jhVar2.f136114d.f133491e;
                            d0Var2.f27483d = jhVar2.f136114d.f133490d;
                            if (!(this.f50793a.mo25774x2().f64521j != 104 || (x2 = this.f50793a.mo25774x2()) == null || (y232 = x2.f64529u) == null || (linkedList = y232.f186439e) == null)) {
                                C49990jh jhVar3 = this.f50795c;
                                for (C22521pi1 pi12 : linkedList) {
                                    C49421fh fhVar2 = jhVar3.f136114d;
                                    if (!(fhVar2 == null || (linkedList2 = fhVar2.f133494h) == null)) {
                                        for (C49993ji jiVar : linkedList2) {
                                            if (C87412m.m108589b(jiVar.f136127d, pi12.f64435r)) {
                                                pi12.f64421Q = jiVar.f136128e ? 1 : 0;
                                                if (jiVar.f136130g) {
                                                    pi12.f64413H = jiVar.f136129f;
                                                }
                                                Log.m105924i("MicroMsg.BizTLCardUpdateMgr", "update finder: finder_object_id = " + jiVar.f136127d + ", is_red_packet = " + jiVar.f136128e + ", rec_reason = " + jiVar.f136129f + ", rec_reason_upd_flag = " + jiVar.f136130g);
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                    }
                    C19623o0 o0Var = this.f50793a;
                    o0Var.mo25762J2(o0Var.mo25774x2());
                    if (this.f50793a.mo25774x2().f64523o.f63906h == 1) {
                        C48009v0.Jx0().mo25785Lo(this.f50793a.field_msgId);
                    }
                    Log.m105924i("MicroMsg.BizTLCardUpdateMgr", "recommendUpdate finish, msgId = " + this.f50793a.field_msgId + ", flag = " + this.f50794b.f27483d + ", title = " + ((String) this.f50796d.f27484d));
                    C48009v0.Jx0().updateNotify(this.f50793a, false, "msgId");
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.r$b$b */
        public static final class C18346b<_Ret, _Var> implements C87581a {

            /* renamed from: a */
            public final /* synthetic */ C19623o0 f50797a;

            public C18346b(C19623o0 o0Var) {
                this.f50797a = o0Var;
            }

            public Object call(Object obj) {
                C13598b0 b0Var = (C13598b0) obj;
                p0$$f p0__f = new p0$$f();
                p0__f.f55562a = p0$$g.UPDATE;
                LinkedList linkedList = new LinkedList();
                linkedList.add(this.f50797a);
                p0__f.f55565d = linkedList;
                C48009v0.Jx0().mo25805jo(p0__f);
                return C13598b0.f38549a;
            }
        }

        /* JADX WARNING: type inference failed for: r7v3, types: [pe3.a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo1488a(int r6, int r7, java.lang.String r8, ob0.C47350c r9, ob0.C117747y r10) {
            /*
                r5 = this;
                java.lang.String r8 = "rr"
                gy3.C87412m.m108594g(r9, r8)
                java.lang.String r8 = "scene"
                gy3.C87412m.m108594g(r10, r8)
                com.tencent.mm.plugin.brandservice.ui.timeline.item.r r8 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18342r.f50785a
                java.util.concurrent.atomic.AtomicInteger r10 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18342r.f50786b
                r0 = 2
                r10.set(r0)
                r8.mo22912b()
                java.lang.String r8 = "MicroMsg.BizTLCardUpdateMgr"
                r10 = 0
                if (r6 != 0) goto L_0x0116
                if (r7 == 0) goto L_0x0020
                goto L_0x0116
            L_0x0020:
                ob0.c$d r6 = r9.f127056b
                pe3.a r6 = r6.f127083a
                boolean r7 = r6 instanceof te3.C49990jh
                r0 = 0
                if (r7 == 0) goto L_0x002c
                te3.jh r6 = (te3.C49990jh) r6
                goto L_0x002d
            L_0x002c:
                r6 = r0
            L_0x002d:
                if (r6 != 0) goto L_0x0030
                return r10
            L_0x0030:
                ob0.c$c r7 = r9.f127055a
                pe3.a r7 = r7.f127080a
                boolean r9 = r7 instanceof te3.C49844ih
                if (r9 == 0) goto L_0x003b
                r0 = r7
                te3.ih r0 = (te3.C49844ih) r0
            L_0x003b:
                if (r0 != 0) goto L_0x003e
                return r10
            L_0x003e:
                te3.gh r7 = r0.f135335d
                long r1 = r7.f134043d
                te3.fh r7 = r6.f136114d
                long r3 = r7.f133493g
                int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r7 == 0) goto L_0x004b
                return r10
            L_0x004b:
                com.tencent.mm.storage.p0 r7 = rb0.C48009v0.Jx0()
                te3.gh r9 = r0.f135335d
                long r0 = r9.f134043d
                com.tencent.mm.storage.o0 r7 = r7.mo25806kD(r0)
                if (r7 == 0) goto L_0x010f
                te3.re4 r9 = r7.mo25774x2()
                if (r9 != 0) goto L_0x0061
                goto L_0x010f
            L_0x0061:
                te3.re4 r9 = r7.mo25774x2()
                int r9 = r9.f64521j
                r0 = 101(0x65, float:1.42E-43)
                r1 = 1
                if (r9 == r0) goto L_0x008a
                te3.re4 r9 = r7.mo25774x2()
                int r9 = r9.f64521j
                r0 = 102(0x66, float:1.43E-43)
                if (r9 == r0) goto L_0x008a
                te3.re4 r9 = r7.mo25774x2()
                int r9 = r9.f64521j
                r0 = 103(0x67, float:1.44E-43)
                if (r9 == r0) goto L_0x008a
                te3.re4 r9 = r7.mo25774x2()
                int r9 = r9.f64521j
                r0 = 105(0x69, float:1.47E-43)
                if (r9 != r0) goto L_0x0097
            L_0x008a:
                te3.fh r9 = r6.f136114d
                if (r9 == 0) goto L_0x0099
                java.util.LinkedList<te3.eh> r9 = r9.f133492f
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r9)
                if (r9 == 0) goto L_0x0097
                goto L_0x0099
            L_0x0097:
                r9 = 0
                goto L_0x009a
            L_0x0099:
                r9 = 1
            L_0x009a:
                te3.re4 r0 = r7.mo25774x2()
                int r0 = r0.f64521j
                r2 = 104(0x68, float:1.46E-43)
                if (r0 != r2) goto L_0x00a9
                te3.fh r0 = r6.f136114d
                if (r0 != 0) goto L_0x00a9
                goto L_0x00aa
            L_0x00a9:
                r1 = 0
            L_0x00aa:
                if (r9 != 0) goto L_0x0108
                if (r1 == 0) goto L_0x00af
                goto L_0x0108
            L_0x00af:
                java.util.HashSet<java.lang.Long> r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18342r.f50788d
                long r0 = r7.field_msgId
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r9.remove(r0)
                java.lang.String r9 = "brandService"
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r9)
                r0 = 60
                int r1 = r6.f136115e
                int r0 = java.lang.Math.min(r0, r1)
                java.lang.String r1 = "BizRecommendCardRefreshIntervalSec"
                r9.encode((java.lang.String) r1, (int) r0)
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r0 = "recommendUpdate success msgId = "
                r9.append(r0)
                long r0 = r7.field_msgId
                r9.append(r0)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
                gy3.f0 r8 = new gy3.f0
                r8.<init>()
                java.lang.String r9 = ""
                r8.f27484d = r9
                gy3.d0 r9 = new gy3.d0
                r9.<init>()
                nr3.e r0 = nr3.C89060f.m111322a()
                com.tencent.mm.plugin.brandservice.ui.timeline.item.r$b$a r1 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.r$b$a
                r1.<init>(r7, r9, r6, r8)
                nr3.e r6 = r0.mo123064p(r1)
                com.tencent.mm.plugin.brandservice.ui.timeline.item.r$b$b r8 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.r$b$b
                r8.<init>(r7)
                r6.mo123062e(r8)
                return r10
            L_0x0108:
                java.lang.String r6 = "recommendUpdate check bad!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
                return r10
            L_0x010f:
                java.lang.String r6 = "recommendUpdate info == null!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
                return r10
            L_0x0116:
                java.lang.String r6 = "recommendUpdate, fail!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18342r.C18344b.mo1488a(int, int, java.lang.String, ob0.c, ob0.y):int");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0081, code lost:
        r4 = r3.f64523o;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m18907a(com.tencent.p014mm.storage.C19623o0 r10) {
        /*
            java.lang.String r0 = "info"
            gy3.C87412m.m108594g(r10, r0)
            te3.re4 r0 = r10.mo25774x2()
            r1 = 0
            if (r0 == 0) goto L_0x0148
            boolean r0 = r10.mo25758F2()
            if (r0 != 0) goto L_0x0014
            goto L_0x0148
        L_0x0014:
            te3.re4 r0 = r10.mo25774x2()
            int r0 = r0.f64521j
            boolean r0 = com.tencent.p014mm.storage.C19613h1.m21038k(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0138
            java.lang.String r0 = "MicroMsg.BizTLCardUpdateMgr"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkUpdate msgId = "
            r3.append(r4)
            long r4 = r10.field_msgId
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            com.tencent.mm.plugin.brandservice.ui.timeline.item.r r0 = f50785a
            rx3.g r3 = f50790f
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x004d
            goto L_0x0137
        L_0x004d:
            boolean r3 = r10.mo25758F2()
            if (r3 != 0) goto L_0x0055
            goto L_0x0137
        L_0x0055:
            java.lang.Class<h81.h> r3 = h81.C32735h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_open_timeline_reccard_update
            int r3 = r3.mo58779Qe(r4, r2)
            if (r3 != 0) goto L_0x0067
            goto L_0x0137
        L_0x0067:
            te3.re4 r3 = r10.mo25774x2()
            int r4 = r3.f64521j
            r5 = 101(0x65, float:1.42E-43)
            if (r4 == r5) goto L_0x007d
            r5 = 102(0x66, float:1.43E-43)
            if (r4 == r5) goto L_0x007d
            r5 = 103(0x67, float:1.44E-43)
            if (r4 == r5) goto L_0x007d
            r5 = 105(0x69, float:1.47E-43)
            if (r4 != r5) goto L_0x008e
        L_0x007d:
            te3.me4 r4 = r3.f64515d
            if (r4 == 0) goto L_0x0090
            te3.hb0 r4 = r3.f64523o
            if (r4 == 0) goto L_0x0090
            java.util.LinkedList<te3.eh> r4 = r4.f63905g
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r4)
            if (r4 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            r4 = 0
            goto L_0x0091
        L_0x0090:
            r4 = 1
        L_0x0091:
            int r5 = r3.f64521j
            r6 = 104(0x68, float:1.46E-43)
            if (r5 != r6) goto L_0x009d
            te3.me4 r5 = r3.f64515d
            if (r5 != 0) goto L_0x009d
            r5 = 1
            goto L_0x009e
        L_0x009d:
            r5 = 0
        L_0x009e:
            if (r4 != 0) goto L_0x0137
            if (r5 == 0) goto L_0x00a4
            goto L_0x0137
        L_0x00a4:
            java.util.HashSet<java.lang.Long> r4 = f50789e
            long r5 = r10.field_msgId
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            boolean r5 = r4.contains(r5)
            if (r5 == 0) goto L_0x00df
            java.lang.String r5 = "brandService"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r5)
            java.lang.String r6 = "BizRecommendCardRefreshIntervalSec"
            r7 = 300(0x12c, float:4.2E-43)
            int r5 = r5.decodeInt(r6, r7)
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r3.f64516e
            long r6 = r6 - r8
            long r6 = java.lang.Math.abs(r6)
            r3 = 1000(0x3e8, float:1.401E-42)
            long r8 = (long) r3
            long r6 = r6 / r8
            long r8 = (long) r5
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x00d5
            r1 = 1
        L_0x00d5:
            if (r1 != 0) goto L_0x00df
            java.lang.String r10 = "MicroMsg.BizTLCardUpdateMgr"
            java.lang.String r0 = "Has not expired, not to update now."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r0)
            goto L_0x0137
        L_0x00df:
            long r5 = r10.field_msgId
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r4.add(r1)
            monitor-enter(r0)
            java.util.HashSet<java.lang.Long> r1 = f50788d     // Catch:{ all -> 0x0134 }
            long r3 = r10.field_msgId     // Catch:{ all -> 0x0134 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0134 }
            boolean r3 = r1.contains(r3)     // Catch:{ all -> 0x0134 }
            if (r3 != 0) goto L_0x012d
            te3.gh r3 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18350s.m18918a(r10)     // Catch:{ all -> 0x0134 }
            long r4 = r3.f134043d     // Catch:{ all -> 0x0134 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0134 }
            r1.add(r4)     // Catch:{ all -> 0x0134 }
            java.util.concurrent.ConcurrentLinkedDeque<te3.gh> r1 = f50787c     // Catch:{ all -> 0x0134 }
            r1.add(r3)     // Catch:{ all -> 0x0134 }
            java.lang.String r3 = "MicroMsg.BizTLCardUpdateMgr"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0134 }
            r4.<init>()     // Catch:{ all -> 0x0134 }
            java.lang.String r5 = "addUpdateQueue msgId = "
            r4.append(r5)     // Catch:{ all -> 0x0134 }
            long r5 = r10.field_msgId     // Catch:{ all -> 0x0134 }
            r4.append(r5)     // Catch:{ all -> 0x0134 }
            java.lang.String r10 = ", queue size = "
            r4.append(r10)     // Catch:{ all -> 0x0134 }
            int r10 = r1.size()     // Catch:{ all -> 0x0134 }
            r4.append(r10)     // Catch:{ all -> 0x0134 }
            java.lang.String r10 = r4.toString()     // Catch:{ all -> 0x0134 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r10)     // Catch:{ all -> 0x0134 }
        L_0x012d:
            rx3.b0 r10 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0134 }
            monitor-exit(r0)
            r0.mo22912b()
            goto L_0x0137
        L_0x0134:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L_0x0137:
            return r2
        L_0x0138:
            te3.re4 r10 = r10.mo25774x2()
            int r10 = r10.f64521j
            r0 = 1001(0x3e9, float:1.403E-42)
            if (r10 != r0) goto L_0x0144
            r10 = 1
            goto L_0x0145
        L_0x0144:
            r10 = 0
        L_0x0145:
            if (r10 == 0) goto L_0x0148
            return r2
        L_0x0148:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18342r.m18907a(com.tencent.mm.storage.o0):boolean");
    }

    /* renamed from: b */
    public final void mo22912b() {
        ConcurrentLinkedDeque<C49559gh> concurrentLinkedDeque = f50787c;
        if (concurrentLinkedDeque.size() <= 0) {
            Log.m105924i("MicroMsg.BizTLCardUpdateMgr", "tryUpdate size <= 0");
            return;
        }
        synchronized (this) {
            if (f50786b.get() != 1) {
                f50786b.set(1);
                C13598b0 b0Var = C13598b0.f38549a;
                C47350c.C47352b bVar = new C47350c.C47352b();
                bVar.f127066a = new C49844ih();
                bVar.f127067b = new C49990jh();
                bVar.f127068c = "/cgi-bin/mmbiz-bin/timeline/bizrecommendarticle";
                bVar.f127069d = 1084;
                C47350c a = bVar.mo72403a();
                C47465a aVar = a.f127055a.f127080a;
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizRecommendArticleReq");
                C49844ih ihVar = (C49844ih) aVar;
                ihVar.f135335d = concurrentLinkedDeque.removeFirst();
                Log.m105924i("MicroMsg.BizTLCardUpdateMgr", "recommendUpdate, msgId = " + ihVar.f135335d.f134043d + ", extraData = " + ihVar.f135335d.f134047h);
                C89144l0.m111429e(a, C18344b.f50792d, false);
            }
        }
    }
}
