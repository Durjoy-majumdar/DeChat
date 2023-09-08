package p543h0;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p1104d1.C106969c;
import p175j0.C108504h;
import p246u1.C111064a0;
import p246u1.C111095y;
import p435a0.C103214y0;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: h0.r */
public final class C107974r {

    /* renamed from: a */
    public static final C65503j f323345a = C103214y0.m136594j(C65503j.C65504a.f188490d, (float) 24);

    /* renamed from: h0.r$a */
    public static final class C107975a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C106969c f323346d;

        /* renamed from: e */
        public final /* synthetic */ String f323347e;

        /* renamed from: f */
        public final /* synthetic */ C65503j f323348f;

        /* renamed from: g */
        public final /* synthetic */ long f323349g;

        /* renamed from: h */
        public final /* synthetic */ int f323350h;

        /* renamed from: i */
        public final /* synthetic */ int f323351i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107975a(C106969c cVar, String str, C65503j jVar, long j, int i, int i2) {
            super(2);
            this.f323346d = cVar;
            this.f323347e = str;
            this.f323348f = jVar;
            this.f323349g = j;
            this.f323350h = i;
            this.f323351i = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107974r.m146260a(this.f323346d, this.f323347e, this.f323348f, this.f323349g, (C108504h) obj, this.f323350h | 1, this.f323351i);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: h0.r$b */
    public static final class C107976b extends C87413o implements C32226l<C111064a0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f323352d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107976b(String str) {
            super(1);
            this.f323352d = str;
        }

        public Object invoke(Object obj) {
            C111064a0 a0Var = (C111064a0) obj;
            C87412m.m108594g(a0Var, "$this$semantics");
            C111095y.m151493a(a0Var, this.f323352d);
            C111095y.m151494b(a0Var, 5);
            return C13598b0.f38549a;
        }
    }

    static {
        int i = C65503j.f188489K0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0098, code lost:
        if (r5 == p175j0.C108504h.C60656a.f172772a) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m146260a(p1104d1.C106969c r17, java.lang.String r18, p721v0.C65503j r19, long r20, p175j0.C108504h r22, int r23, int r24) {
        /*
            r2 = r18
            java.lang.String r0 = "painter"
            r1 = r17
            gy3.C87412m.m108594g(r1, r0)
            fy3.q<j0.d<?>, j0.b2, j0.t1, rx3.b0> r0 = p175j0.C24715p.f70494a
            r0 = -1142959010(0xffffffffbbdfd45e, float:-0.006830736)
            r3 = r22
            j0.h r0 = r3.mo51623z(r0)
            r3 = r24 & 4
            if (r3 == 0) goto L_0x001e
            int r3 = p721v0.C65503j.f188489K0
            v0.j$a r3 = p721v0.C65503j.C65504a.f188490d
            r12 = r3
            goto L_0x0020
        L_0x001e:
            r12 = r19
        L_0x0020:
            r3 = r24 & 8
            if (r3 == 0) goto L_0x0046
            j0.f1<a1.w> r3 = p543h0.C107958j.f323310a
            java.lang.Object r3 = r0.mo51598m(r3)
            a1.w r3 = (p436a1.C103272w) r3
            long r4 = r3.f304517a
            j0.f1<java.lang.Float> r3 = p543h0.C107956i.f323296a
            java.lang.Object r3 = r0.mo51598m(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            float r6 = r3.floatValue()
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 14
            r11 = 0
            long r3 = p436a1.C103272w.m136780b(r4, r6, r7, r8, r9, r10, r11)
            r13 = r3
            goto L_0x0048
        L_0x0046:
            r13 = r20
        L_0x0048:
            int r3 = p436a1.C103272w.f304516h
            long r3 = p436a1.C103272w.f304515g
            boolean r3 = p436a1.C103272w.m136781c(r13, r3)
            if (r3 == 0) goto L_0x0055
            r3 = 0
            r9 = r3
            goto L_0x0077
        L_0x0055:
            r3 = 5
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r4 < r5) goto L_0x0063
            a1.o r4 = p436a1.C103251o.f304456a
            android.graphics.BlendModeColorFilter r3 = r4.mo143024a(r13, r3)
            goto L_0x0071
        L_0x0063:
            android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter
            int r5 = p436a1.C103276y.m136796g(r13)
            android.graphics.PorterDuff$Mode r3 = p436a1.C103220a.m136601b(r3)
            r4.<init>(r5, r3)
            r3 = r4
        L_0x0071:
            a1.x r4 = new a1.x
            r4.<init>(r3)
            r9 = r4
        L_0x0077:
            r3 = 1547385429(0x5c3b3a55, float:2.1079983E17)
            r0.mo51557H(r3)
            r15 = 0
            if (r2 == 0) goto L_0x00ac
            int r3 = p721v0.C65503j.f188489K0
            v0.j$a r3 = p721v0.C65503j.C65504a.f188490d
            r4 = 1157296644(0x44faf204, float:2007.563)
            r0.mo51557H(r4)
            boolean r4 = r0.mo51619x(r2)
            java.lang.Object r5 = r0.mo51606q()
            if (r4 != 0) goto L_0x009a
            int r4 = p175j0.C108504h.f324828a
            java.lang.Object r4 = p175j0.C108504h.C60656a.f172772a
            if (r5 != r4) goto L_0x00a2
        L_0x009a:
            h0.r$b r5 = new h0.r$b
            r5.<init>(r2)
            r0.mo51553F(r5)
        L_0x00a2:
            r0.mo51565P()
            fy3.l r5 = (fy3.C32226l) r5
            v0.j r3 = p246u1.C111082p.m151476b(r3, r15, r5)
            goto L_0x00b0
        L_0x00ac:
            int r3 = p721v0.C65503j.f188489K0
            v0.j$a r3 = p721v0.C65503j.C65504a.f188490d
        L_0x00b0:
            r11 = r3
            r0.mo51565P()
            java.lang.String r3 = "<this>"
            gy3.C87412m.m108594g(r12, r3)
            fy3.l<androidx.compose.ui.platform.e1, rx3.b0> r3 = androidx.compose.p002ui.platform.C103612c1.f306063a
            long r3 = r17.mo84458h()
            long r5 = p1166z0.C112545k.f336974c
            boolean r3 = p1166z0.C112545k.m153755a(r3, r5)
            if (r3 != 0) goto L_0x00e8
            long r3 = r17.mo84458h()
            float r5 = p1166z0.C112545k.m153758d(r3)
            boolean r5 = java.lang.Float.isInfinite(r5)
            if (r5 == 0) goto L_0x00e1
            float r3 = p1166z0.C112545k.m153756b(r3)
            boolean r3 = java.lang.Float.isInfinite(r3)
            if (r3 == 0) goto L_0x00e1
            r3 = 1
            goto L_0x00e2
        L_0x00e1:
            r3 = 0
        L_0x00e2:
            if (r3 == 0) goto L_0x00e5
            goto L_0x00e8
        L_0x00e5:
            v0.j$a r3 = p721v0.C65503j.C65504a.f188490d
            goto L_0x00ea
        L_0x00e8:
            v0.j r3 = f323345a
        L_0x00ea:
            v0.j r3 = r12.mo74972i0(r3)
            int r4 = p631o1.C109836f.f328763a
            o1.f r7 = p631o1.C109836f.C109837a.f328765b
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 22
            r16 = 0
            r4 = r17
            r15 = r11
            r11 = r16
            v0.j r3 = p868x0.C111989n.m152718a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            v0.j r3 = r3.mo74972i0(r15)
            r4 = 0
            p435a0.C103141f.m136470a(r3, r0, r4)
            j0.v1 r8 = r0.mo51596l()
            if (r8 != 0) goto L_0x0111
            goto L_0x0124
        L_0x0111:
            h0.r$a r9 = new h0.r$a
            r0 = r9
            r1 = r17
            r2 = r18
            r3 = r12
            r4 = r13
            r6 = r23
            r7 = r24
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r8.mo51650a(r9)
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p543h0.C107974r.m146260a(d1.c, java.lang.String, v0.j, long, j0.h, int, int):void");
    }
}
