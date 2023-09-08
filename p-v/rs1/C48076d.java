package rs1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import it1.C60625c;
import java.util.List;
import o40.C61926c;
import ob0.C117747y;
import te3.C49284eh0;
import te3.C49335eu3;
import te3.C49712hj1;

/* renamed from: rs1.d */
public final class C48076d extends C60625c<C49284eh0> {

    /* renamed from: s */
    public final List<Long> f128925s;

    /* renamed from: t */
    public final List<Long> f128926t;

    /* renamed from: rs1.d$a */
    public static final class C48077a extends C87413o implements C32226l<Long, CharSequence> {

        /* renamed from: d */
        public static final C48077a f128927d = new C48077a();

        public C48077a() {
            super(1);
        }

        public Object invoke(Object obj) {
            return C61926c.m72691p(((Number) obj).longValue());
        }
    }

    /* renamed from: rs1.d$b */
    public static final class C48078b extends C87413o implements C32226l<Long, CharSequence> {

        /* renamed from: d */
        public static final C48078b f128928d = new C48078b();

        public C48078b() {
            super(1);
        }

        public Object invoke(Object obj) {
            return C61926c.m72691p(((Number) obj).longValue());
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C48076d(java.util.List<java.lang.Long> r19, java.util.List<java.lang.Long> r20, te3.C49712hj1 r21, pe3.C89349b r22, te3.C64414h71 r23) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            java.lang.String r6 = "unreadIdList"
            gy3.C87412m.m108594g(r1, r6)
            java.lang.String r6 = "hasReadIdList"
            gy3.C87412m.m108594g(r2, r6)
            r6 = 0
            r7 = 2
            r0.<init>(r3, r6, r7, r6)
            r0.f128925s = r1
            r0.f128926t = r2
            te3.dh0 r2 = new te3.dh0
            r2.<init>()
            je1.h2 r7 = je1.C46523h2.f125330a
            r8 = 6658(0x1a02, float:9.33E-42)
            te3.ig0 r9 = r7.mo71860b(r8, r3)
            r2.f132318f = r9
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r12 = sx3.C36907w.m41090l(r1, r11)
            r10.<init>(r12)
            java.util.Iterator r1 = r19.iterator()
        L_0x003d:
            boolean r12 = r1.hasNext()
            r13 = 0
            if (r12 == 0) goto L_0x0063
            java.lang.Object r12 = r1.next()
            java.lang.Number r12 = (java.lang.Number) r12
            long r14 = r12.longValue()
            rx3.l r12 = new rx3.l
            if (r3 == 0) goto L_0x0054
            int r13 = r3.f134675i
        L_0x0054:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r12.<init>(r13, r14)
            r10.add(r12)
            goto L_0x003d
        L_0x0063:
            r7.mo71865g(r9, r10, r6)
            je1.h2 r1 = je1.C46523h2.f125330a
            te3.ig0 r7 = r2.f132318f
            java.util.List<java.lang.Long> r9 = r0.f128926t
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = sx3.C36907w.m41090l(r9, r11)
            r10.<init>(r11)
            java.util.Iterator r9 = r9.iterator()
        L_0x0079:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x00a0
            java.lang.Object r11 = r9.next()
            java.lang.Number r11 = (java.lang.Number) r11
            long r11 = r11.longValue()
            rx3.l r14 = new rx3.l
            if (r3 == 0) goto L_0x0090
            int r15 = r3.f134675i
            goto L_0x0091
        L_0x0090:
            r15 = 0
        L_0x0091:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r14.<init>(r15, r11)
            r10.add(r14)
            goto L_0x0079
        L_0x00a0:
            r1.mo71865g(r7, r10, r6)
            java.util.LinkedList<java.lang.Long> r1 = r2.f132320h
            java.util.List<java.lang.Long> r7 = r0.f128925s
            r1.addAll(r7)
            java.util.LinkedList<java.lang.Long> r1 = r2.f132319g
            java.util.List<java.lang.Long> r7 = r0.f128926t
            r1.addAll(r7)
            r2.f132321i = r4
            r2.f132322j = r5
            r1 = 1
            r2.f132323n = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "initCommReqResp: commentScene="
            r1.append(r7)
            if (r3 == 0) goto L_0x00ca
            int r3 = r3.f134675i
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
        L_0x00ca:
            r1.append(r6)
            java.lang.String r3 = ", unreadIdList:"
            r1.append(r3)
            java.util.List<java.lang.Long> r9 = r0.f128925s
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            rs1.d$a r15 = rs1.C48076d.C48077a.f128927d
            r16 = 30
            r17 = 0
            java.lang.String r10 = ";"
            java.lang.String r3 = sx3.C110818d0.m150921S(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1.append(r3)
            java.lang.String r3 = ", hasReadIdList:"
            r1.append(r3)
            java.util.List<java.lang.Long> r9 = r0.f128926t
            rs1.d$b r15 = rs1.C48076d.C48078b.f128928d
            java.lang.String r10 = ";"
            java.lang.String r3 = sx3.C110818d0.m150921S(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1.append(r3)
            java.lang.String r3 = ", last_check_context="
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ", live_report_base_info="
            r1.append(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "CgiFeedSafeCheck"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            ob0.c$b r1 = new ob0.c$b
            r1.<init>()
            r1.f127066a = r2
            te3.eh0 r2 = new te3.eh0
            r2.<init>()
            te3.ja r3 = new te3.ja
            r3.<init>()
            r2.setBaseResponse(r3)
            te3.ja r3 = r2.getBaseResponse()
            te3.rv3 r4 = new te3.rv3
            r4.<init>()
            r3.f135956e = r4
            r1.f127067b = r2
            java.lang.String r2 = "/cgi-bin/micromsg-bin/findercheckprefetch"
            r1.f127068c = r2
            r1.f127069d = r8
            ob0.c r1 = r1.mo72403a()
            r0.mo123453j(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C48076d.<init>(java.util.List, java.util.List, te3.hj1, pe3.b, te3.h71):void");
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C49284eh0) eu32, "resp");
        StringBuilder sb = new StringBuilder();
        sb.append("onCgiEnd: errType ");
        sb.append(i);
        sb.append(", errCode ");
        sb.append(i2);
        sb.append(", errMsg ");
        sb.append(str);
        sb.append(", commentScene=");
        C49712hj1 hj12 = this.f172731j;
        sb.append(hj12 != null ? Integer.valueOf(hj12.f134675i) : null);
        Log.m105924i("CgiFeedSafeCheck", sb.toString());
    }
}
