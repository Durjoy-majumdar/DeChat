package p503e1;

import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: e1.r */
public final class C107133r {

    /* renamed from: e1.r$a */
    public static final class C107134a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107126n f320692d;

        /* renamed from: e */
        public final /* synthetic */ Map<String, C107122k> f320693e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107134a(C107126n nVar, Map<String, ? extends C107122k> map) {
            super(2);
            this.f320692d = nVar;
            this.f320693e = map;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                C107133r.m144996a((C107123l) this.f320692d, this.f320693e, hVar, 64, 0);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: e1.r$b */
    public static final class C107135b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107123l f320694d;

        /* renamed from: e */
        public final /* synthetic */ Map<String, C107122k> f320695e;

        /* renamed from: f */
        public final /* synthetic */ int f320696f;

        /* renamed from: g */
        public final /* synthetic */ int f320697g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107135b(C107123l lVar, Map<String, ? extends C107122k> map, int i, int i2) {
            super(2);
            this.f320694d = lVar;
            this.f320695e = map;
            this.f320696f = i;
            this.f320697g = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107133r.m144996a(this.f320694d, this.f320695e, (C108504h) obj, this.f320696f | 1, this.f320697g);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: e1.r$c */
    public static final class C107136c implements C107122k {
        /* renamed from: a */
        public <T> T mo157551a(C107140u<T> uVar, T t) {
            C87412m.m108594g(uVar, "property");
            return t;
        }
    }

    /* renamed from: e1.r$d */
    public static final class C107137d implements C107122k {
        /* renamed from: a */
        public <T> T mo157551a(C107140u<T> uVar, T t) {
            C87412m.m108594g(uVar, "property");
            return t;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0074  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m144996a(p503e1.C107123l r23, java.util.Map<java.lang.String, ? extends p503e1.C107122k> r24, p175j0.C108504h r25, int r26, int r27) {
        /*
            r0 = r23
            r1 = r26
            r2 = r27
            java.lang.String r3 = "group"
            gy3.C87412m.m108594g(r0, r3)
            fy3.q<j0.d<?>, j0.b2, j0.t1, rx3.b0> r3 = p175j0.C24715p.f70494a
            r3 = -446179233(0xffffffffe567d85f, float:-6.8428625E22)
            r4 = r25
            j0.h r3 = r4.mo51623z(r3)
            r4 = r2 & 1
            r5 = 2
            if (r4 == 0) goto L_0x001e
            r4 = r1 | 6
            goto L_0x002e
        L_0x001e:
            r4 = r1 & 14
            if (r4 != 0) goto L_0x002d
            boolean r4 = r3.mo51619x(r0)
            if (r4 == 0) goto L_0x002a
            r4 = 4
            goto L_0x002b
        L_0x002a:
            r4 = 2
        L_0x002b:
            r4 = r4 | r1
            goto L_0x002e
        L_0x002d:
            r4 = r1
        L_0x002e:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x0034
            r4 = r4 | 16
        L_0x0034:
            if (r6 != r5) goto L_0x004b
            r4 = r4 & 91
            r5 = 18
            if (r4 != r5) goto L_0x004b
            boolean r4 = r3.mo51575a()
            if (r4 != 0) goto L_0x0043
            goto L_0x004b
        L_0x0043:
            r3.mo51581d()
            r0 = r24
            r2 = r3
            goto L_0x0236
        L_0x004b:
            r3.mo51559J()
            r4 = r1 & 1
            if (r4 == 0) goto L_0x005d
            boolean r4 = r3.mo51582e()
            if (r4 == 0) goto L_0x0059
            goto L_0x005d
        L_0x0059:
            r3.mo51581d()
            goto L_0x0063
        L_0x005d:
            if (r6 == 0) goto L_0x0063
            sx3.g0 r4 = sx3.C36903g0.f97931d
            r15 = r4
            goto L_0x0065
        L_0x0063:
            r15 = r24
        L_0x0065:
            r3.mo51555G()
            java.util.List<e1.n> r4 = r0.f320671p
            java.util.Iterator r22 = r4.iterator()
        L_0x006e:
            boolean r4 = r22.hasNext()
            if (r4 == 0) goto L_0x0234
            java.lang.Object r4 = r22.next()
            e1.n r4 = (p503e1.C107126n) r4
            boolean r5 = r4 instanceof p503e1.C107139t
            if (r5 == 0) goto L_0x0156
            r5 = -326285910(0xffffffffec8d45aa, float:-1.3663002E27)
            r3.mo51557H(r5)
            e1.t r4 = (p503e1.C107139t) r4
            java.lang.String r5 = r4.f320699d
            java.lang.Object r5 = r15.get(r5)
            e1.k r5 = (p503e1.C107122k) r5
            if (r5 != 0) goto L_0x0095
            e1.r$c r5 = new e1.r$c
            r5.<init>()
        L_0x0095:
            e1.u$c r6 = p503e1.C107140u.C107143c.f320715a
            java.util.List<e1.e> r7 = r4.f320700e
            java.lang.Object r6 = r5.mo157551a(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r7 = r4.f320701f
            java.lang.String r8 = r4.f320699d
            e1.u$a r9 = p503e1.C107140u.C107141a.f320713a
            a1.q r10 = r4.f320702g
            java.lang.Object r9 = r5.mo157551a(r9, r10)
            a1.q r9 = (p436a1.C103257q) r9
            e1.u$b r10 = p503e1.C107140u.C107142b.f320714a
            float r11 = r4.f320703h
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            java.lang.Object r10 = r5.mo157551a(r10, r11)
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            e1.u$i r11 = p503e1.C107140u.C107149i.f320721a
            a1.q r12 = r4.f320704i
            java.lang.Object r11 = r5.mo157551a(r11, r12)
            a1.q r11 = (p436a1.C103257q) r11
            e1.u$j r12 = p503e1.C107140u.C107150j.f320722a
            float r13 = r4.f320705j
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.Object r12 = r5.mo157551a(r12, r13)
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            e1.u$k r13 = p503e1.C107140u.C107151k.f320723a
            float r14 = r4.f320706n
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            java.lang.Object r13 = r5.mo157551a(r13, r14)
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            int r14 = r4.f320707o
            r16 = r15
            int r15 = r4.f320708p
            float r0 = r4.f320709q
            e1.u$p r1 = p503e1.C107140u.C107156p.f320728a
            float r2 = r4.f320710r
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r1 = r5.mo157551a(r1, r2)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            e1.u$n r2 = p503e1.C107140u.C107154n.f320726a
            r25 = r3
            float r3 = r4.f320711s
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object r2 = r5.mo157551a(r2, r3)
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            e1.u$o r3 = p503e1.C107140u.C107155o.f320727a
            float r4 = r4.f320712t
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.Object r3 = r5.mo157551a(r3, r4)
            java.lang.Number r3 = (java.lang.Number) r3
            float r17 = r3.floatValue()
            r19 = 8
            r20 = 0
            r21 = 0
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            r14 = r0
            r0 = r16
            r15 = r1
            r16 = r2
            r18 = r25
            p503e1.C107093j.m144988b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r25.mo51565P()
            r3 = r25
            r1 = r26
            r2 = r27
            r15 = r0
            r0 = r23
            goto L_0x006e
        L_0x0156:
            r25 = r3
            r0 = r15
            boolean r1 = r4 instanceof p503e1.C107123l
            if (r1 == 0) goto L_0x021f
            r1 = -326284052(0xffffffffec8d4cec, float:-1.3665744E27)
            r2 = r25
            r2.mo51557H(r1)
            r1 = r4
            e1.l r1 = (p503e1.C107123l) r1
            java.lang.String r3 = r1.f320662d
            java.lang.Object r3 = r0.get(r3)
            e1.k r3 = (p503e1.C107122k) r3
            if (r3 != 0) goto L_0x0177
            e1.r$d r3 = new e1.r$d
            r3.<init>()
        L_0x0177:
            java.lang.String r5 = r1.f320662d
            e1.u$f r6 = p503e1.C107140u.C107146f.f320718a
            float r7 = r1.f320663e
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object r6 = r3.mo157551a(r6, r7)
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            e1.u$g r7 = p503e1.C107140u.C107147g.f320719a
            float r8 = r1.f320666h
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            java.lang.Object r7 = r3.mo157551a(r7, r8)
            java.lang.Number r7 = (java.lang.Number) r7
            float r8 = r7.floatValue()
            e1.u$h r7 = p503e1.C107140u.C107148h.f320720a
            float r9 = r1.f320667i
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            java.lang.Object r7 = r3.mo157551a(r7, r9)
            java.lang.Number r7 = (java.lang.Number) r7
            float r9 = r7.floatValue()
            e1.u$l r7 = p503e1.C107140u.C107152l.f320724a
            float r10 = r1.f320668j
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            java.lang.Object r7 = r3.mo157551a(r7, r10)
            java.lang.Number r7 = (java.lang.Number) r7
            float r10 = r7.floatValue()
            e1.u$m r7 = p503e1.C107140u.C107153m.f320725a
            float r11 = r1.f320669n
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            java.lang.Object r7 = r3.mo157551a(r7, r11)
            java.lang.Number r7 = (java.lang.Number) r7
            float r11 = r7.floatValue()
            e1.u$d r7 = p503e1.C107140u.C107144d.f320716a
            float r12 = r1.f320664f
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            java.lang.Object r7 = r3.mo157551a(r7, r12)
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            e1.u$e r12 = p503e1.C107140u.C107145e.f320717a
            float r13 = r1.f320665g
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.Object r12 = r3.mo157551a(r12, r13)
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            e1.u$c r13 = p503e1.C107140u.C107143c.f320715a
            java.util.List<e1.e> r1 = r1.f320670o
            java.lang.Object r1 = r3.mo157551a(r13, r1)
            java.util.List r1 = (java.util.List) r1
            r3 = 1450046638(0x566df4ae, float:6.5408787E13)
            e1.r$a r13 = new e1.r$a
            r13.<init>(r4, r0)
            r4 = 1
            q0.a r13 = p415q0.C110261c.m149878b(r2, r3, r4, r13)
            r15 = 939524096(0x38000000, float:3.0517578E-5)
            r16 = 0
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r12
            r12 = r1
            r14 = r2
            p503e1.C107093j.m144987a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2.mo51565P()
            goto L_0x022a
        L_0x021f:
            r2 = r25
            r1 = -326282582(0xffffffffec8d52aa, float:-1.3667913E27)
            r2.mo51557H(r1)
            r2.mo51565P()
        L_0x022a:
            r1 = r26
            r15 = r0
            r3 = r2
            r0 = r23
            r2 = r27
            goto L_0x006e
        L_0x0234:
            r2 = r3
            r0 = r15
        L_0x0236:
            j0.v1 r1 = r2.mo51596l()
            if (r1 != 0) goto L_0x023d
            goto L_0x024b
        L_0x023d:
            e1.r$b r2 = new e1.r$b
            r3 = r23
            r4 = r26
            r5 = r27
            r2.<init>(r3, r0, r4, r5)
            r1.mo51650a(r2)
        L_0x024b:
            fy3.q<j0.d<?>, j0.b2, j0.t1, rx3.b0> r0 = p175j0.C24715p.f70494a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p503e1.C107133r.m144996a(e1.l, java.util.Map, j0.h, int, int):void");
    }
}
