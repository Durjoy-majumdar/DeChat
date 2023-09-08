package sg1;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: sg1.d */
public final class C63883d implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C63888h f181082d;

    /* renamed from: sg1.d$a */
    public static final class C63884a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63888h f181083d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63884a(C63888h hVar) {
            super(0);
            this.f181083d = hVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x010e  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x014d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r18 = this;
                r0 = r18
                sg1.h r1 = r0.f181083d
                te3.dp2 r1 = r1.f181095i
                if (r1 == 0) goto L_0x000f
                int r1 = r1.f182791d
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                goto L_0x0010
            L_0x000f:
                r1 = 0
            L_0x0010:
                if (r1 != 0) goto L_0x0014
                goto L_0x0118
            L_0x0014:
                int r3 = r1.intValue()
                r4 = 1
                if (r3 != r4) goto L_0x0118
                sg1.h r1 = r0.f181083d
                int r3 = r1.f181096j
                int r3 = r3 + r4
                r1.f181096j = r3
                if (r3 <= 0) goto L_0x00c7
                boolean r4 = r1.f181097k
                if (r4 == 0) goto L_0x00c7
                int r4 = r1.f181090d
                int r4 = r3 % r4
                if (r4 != 0) goto L_0x00be
                java.lang.Class<hr.t> r1 = p165hr.C60106t.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                hr.t r1 = (p165hr.C60106t) r1
                hg1.b r1 = r1.yx0()
                sg1.h r3 = r0.f181083d
                long r13 = r3.f181088b
                int r3 = r3.f181096j
                ik1.b r1 = (ik1.C8923b) r1
                boolean r4 = r1.f28224f
                if (r4 != 0) goto L_0x0049
                r1.mo9437Lo()
            L_0x0049:
                com.tencent.mm.sdk.platformtools.LruCache<java.lang.Long, ik1.b$a> r4 = r1.f28225g
                java.lang.Long r5 = java.lang.Long.valueOf(r13)
                java.lang.Object r4 = r4.get(r5)
                ik1.b$a r4 = (ik1.C8923b.C8924a) r4
                if (r4 == 0) goto L_0x005a
                r4.f28227b = r3
                goto L_0x007b
            L_0x005a:
                com.tencent.mm.sdk.platformtools.LruCache<java.lang.Long, ik1.b$a> r15 = r1.f28225g
                java.lang.Long r12 = java.lang.Long.valueOf(r13)
                ik1.b$a r11 = new ik1.b$a
                r8 = 0
                r9 = 0
                r10 = 0
                r16 = 24
                r17 = 0
                r4 = r11
                r5 = r13
                r7 = r3
                r2 = r11
                r11 = r16
                r0 = r12
                r12 = r17
                r4.<init>(r5, r7, r8, r9, r10, r11, r12)
                java.lang.Object r0 = r15.put(r0, r2)
                ik1.b$a r0 = (ik1.C8923b.C8924a) r0
            L_0x007b:
                com.tencent.mm.sdk.platformtools.LruCache<java.lang.Long, ik1.b$a> r0 = r1.f28225g
                java.lang.Long r2 = java.lang.Long.valueOf(r13)
                java.lang.Object r0 = r0.get(r2)
                java.lang.String r2 = "chargeInfoCache.get(liveId)"
                gy3.C87412m.m108593f(r0, r2)
                ik1.b$a r0 = (ik1.C8923b.C8924a) r0
                r1.mo9735bD(r13, r0)
                ok1.e r0 = ok1.C62042e.f176370a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "insertLiveChargeInfo liveId:"
                r2.append(r4)
                r2.append(r13)
                java.lang.String r4 = ",time:"
                r2.append(r4)
                r2.append(r3)
                java.lang.String r3 = ",cache size:"
                r2.append(r3)
                com.tencent.mm.sdk.platformtools.LruCache<java.lang.Long, ik1.b$a> r1 = r1.f28225g
                int r1 = r1.size()
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "FinderLiveChargeInfoStorage"
                r0.mo86998D1(r2, r1)
                goto L_0x00c7
            L_0x00be:
                int r0 = r1.f181089c
                int r3 = r3 % r0
                if (r3 != 0) goto L_0x00c7
                r0 = 0
                r1.mo88653d(r0)
            L_0x00c7:
                r0 = r18
                sg1.h r8 = r0.f181083d
                te3.dp2 r9 = r8.f181095i
                if (r9 == 0) goto L_0x010b
                int r1 = r9.f182793f
                int r2 = r8.f181096j
                int r1 = r1 - r2
                r9.f182792e = r1
                if (r1 > 0) goto L_0x00e2
                long r2 = r8.f181088b
                r4 = 1
                r5 = 0
                r6 = 4
                r7 = 0
                r1 = r8
                sg1.C63881c.C63882a.m75104a(r1, r2, r4, r5, r6, r7)
            L_0x00e2:
                ok1.e r1 = ok1.C62042e.f176370a
                java.lang.String r2 = r8.f181091e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "countDownCallback DurationFromFirstJoin usedTimeSecond:"
                r3.append(r4)
                int r4 = r8.f181096j
                r3.append(r4)
                r4 = 33
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r1.mo86998D1(r2, r3)
                sg1.b r1 = r8.f181092f
                if (r1 == 0) goto L_0x010b
                r1.mo79436a(r9)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                goto L_0x010c
            L_0x010b:
                r2 = 0
            L_0x010c:
                if (r2 != 0) goto L_0x017d
                sg1.h r1 = r0.f181083d
                java.lang.String r1 = r1.f181091e
                java.lang.String r2 = "countDownCallback DurationFromFirstJoin liveFreeTimeInfo is null!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
                goto L_0x017d
            L_0x0118:
                if (r1 != 0) goto L_0x011b
                goto L_0x0157
            L_0x011b:
                int r1 = r1.intValue()
                r2 = 2
                if (r1 != r2) goto L_0x0157
                sg1.h r1 = r0.f181083d
                te3.dp2 r10 = r1.f181095i
                if (r10 == 0) goto L_0x014a
                sk1.a r3 = sk1.C63947a.f181274a
                te3.ga1 r4 = r1.f181094h
                int r2 = r3.mo88723i(r4, r2)
                r10.f182792e = r2
                r10.f182793f = r2
                if (r2 > 0) goto L_0x0140
                long r4 = r1.f181088b
                r6 = 1
                r7 = 0
                r8 = 4
                r9 = 0
                r3 = r1
                sg1.C63881c.C63882a.m75104a(r3, r4, r6, r7, r8, r9)
            L_0x0140:
                sg1.b r1 = r1.f181092f
                if (r1 == 0) goto L_0x014a
                r1.mo79436a(r10)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                goto L_0x014b
            L_0x014a:
                r2 = 0
            L_0x014b:
                if (r2 != 0) goto L_0x017d
                sg1.h r1 = r0.f181083d
                java.lang.String r1 = r1.f181091e
                java.lang.String r2 = "countDownCallback DurationFromLiveStart liveFreeTimeInfo is null!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
                goto L_0x017d
            L_0x0157:
                sg1.h r1 = r0.f181083d
                java.lang.String r1 = r1.f181091e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "count down but preview type err:"
                r2.append(r3)
                sg1.h r3 = r0.f181083d
                te3.dp2 r3 = r3.f181095i
                if (r3 == 0) goto L_0x0172
                int r3 = r3.f182791d
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                goto L_0x0173
            L_0x0172:
                r3 = 0
            L_0x0173:
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            L_0x017d:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: sg1.C63883d.C63884a.invoke():java.lang.Object");
        }
    }

    public C63883d(C63888h hVar) {
        this.f181082d = hVar;
    }

    public final boolean onTimerExpired() {
        C61926c.m72668M(new C63884a(this.f181082d));
        return true;
    }
}
