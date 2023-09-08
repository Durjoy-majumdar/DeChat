package p631o1;

import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedHashMap;
import java.util.Map;
import p175j0.C108504h;
import p175j0.C24661b2;
import p175j0.C24665d;
import p175j0.C24715p;
import p175j0.C24724t1;
import p175j0.C33487v1;
import p175j0.C60647d0;
import p175j0.C60651e0;
import p175j0.C60667k2;
import p560i2.C108319b;
import p631o1.C109874t;
import p658q1.C110301j;
import p721v0.C65503j;
import rx3.C13598b0;
import um0.C22657f;

/* renamed from: o1.u0 */
public final class C109880u0 {

    /* renamed from: o1.u0$b */
    public static final class C61920b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65503j f176026d;

        /* renamed from: e */
        public final /* synthetic */ C32227p<C109894x0, C108319b, C109899z> f176027e;

        /* renamed from: f */
        public final /* synthetic */ int f176028f;

        /* renamed from: g */
        public final /* synthetic */ int f176029g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61920b(C65503j jVar, C32227p<? super C109894x0, ? super C108319b, ? extends C109899z> pVar, int i, int i2) {
            super(2);
            this.f176026d = jVar;
            this.f176027e = pVar;
            this.f176028f = i;
            this.f176029g = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C109880u0.m149371b(this.f176026d, this.f176027e, (C108504h) obj, this.f176028f | 1, this.f176029g);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: o1.u0$a */
    public static final class C109881a extends C87413o implements C32224a<C110301j> {

        /* renamed from: d */
        public final /* synthetic */ C32224a f328823d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109881a(C32224a aVar) {
            super(0);
            this.f328823d = aVar;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [q1.j, java.lang.Object] */
        public final C110301j invoke() {
            return this.f328823d.invoke();
        }
    }

    /* renamed from: o1.u0$c */
    public static final class C109882c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109888w0 f328824d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109882c(C109888w0 w0Var) {
            super(0);
            this.f328824d = w0Var;
        }

        public Object invoke() {
            C109874t a = this.f328824d.mo161196a();
            for (Map.Entry value : ((LinkedHashMap) a.f328801e).entrySet()) {
                ((C109874t.C109875a) value.getValue()).f328812d = true;
            }
            C110301j jVar = a.f328797a;
            if (!jVar.f329909X) {
                jVar.mo161712N(false);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: o1.u0$d */
    public static final class C109883d extends C87413o implements C32226l<C60651e0, C60647d0> {

        /* renamed from: d */
        public final /* synthetic */ C60667k2<C109888w0> f328825d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109883d(C60667k2<C109888w0> k2Var) {
            super(1);
            this.f328825d = k2Var;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C60651e0) obj, "$this$DisposableEffect");
            return new C109886v0(this.f328825d);
        }
    }

    /* renamed from: o1.u0$e */
    public static final class C109884e extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109888w0 f328826d;

        /* renamed from: e */
        public final /* synthetic */ C65503j f328827e;

        /* renamed from: f */
        public final /* synthetic */ C32227p<C109894x0, C108319b, C109899z> f328828f;

        /* renamed from: g */
        public final /* synthetic */ int f328829g;

        /* renamed from: h */
        public final /* synthetic */ int f328830h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109884e(C109888w0 w0Var, C65503j jVar, C32227p<? super C109894x0, ? super C108319b, ? extends C109899z> pVar, int i, int i2) {
            super(2);
            this.f328826d = w0Var;
            this.f328827e = jVar;
            this.f328828f = pVar;
            this.f328829g = i;
            this.f328830h = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C109880u0.m149370a(this.f328826d, this.f328827e, this.f328828f, (C108504h) obj, this.f328829g | 1, this.f328830h);
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ce, code lost:
        if (r4 == p175j0.C108504h.C60656a.f172772a) goto L_0x00d0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m149370a(p631o1.C109888w0 r8, p721v0.C65503j r9, fy3.C32227p<? super p631o1.C109894x0, ? super p560i2.C108319b, ? extends p631o1.C109899z> r10, p175j0.C108504h r11, int r12, int r13) {
        /*
            java.lang.String r0 = "state"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "measurePolicy"
            gy3.C87412m.m108594g(r10, r0)
            fy3.q<j0.d<?>, j0.b2, j0.t1, rx3.b0> r0 = p175j0.C24715p.f70494a
            r0 = -511989831(0xffffffffe17ba7b9, float:-2.9013865E20)
            j0.h r11 = r11.mo51623z(r0)
            r0 = r13 & 2
            if (r0 == 0) goto L_0x001b
            int r9 = p721v0.C65503j.f188489K0
            v0.j$a r9 = p721v0.C65503j.C65504a.f188490d
        L_0x001b:
            r2 = r9
            r9 = 0
            j0.r r0 = p175j0.C108501g.m147001b(r11, r9)
            v0.j r1 = p721v0.C111299g.m151788c(r11, r2)
            j0.f1<i2.d> r3 = androidx.compose.p002ui.platform.C103645l0.f306124e
            java.lang.Object r3 = r11.mo51598m(r3)
            i2.d r3 = (p560i2.C108322d) r3
            j0.f1<i2.o> r4 = androidx.compose.p002ui.platform.C103645l0.f306130k
            java.lang.Object r4 = r11.mo51598m(r4)
            i2.o r4 = (p560i2.C33183o) r4
            j0.f1<androidx.compose.ui.platform.i2> r5 = androidx.compose.p002ui.platform.C103645l0.f306134o
            java.lang.Object r5 = r11.mo51598m(r5)
            androidx.compose.ui.platform.i2 r5 = (androidx.compose.p002ui.platform.C103633i2) r5
            q1.j$$h r6 = p658q1.C110301j.f329884p0
            fy3.a<q1.j> r6 = p658q1.C110301j.f329885x0
            r7 = 1886828752(0x7076b8d0, float:3.0542695E29)
            r11.mo51557H(r7)
            j0.d r7 = r11.mo51543A()
            boolean r7 = r7 instanceof p175j0.C24665d
            if (r7 == 0) goto L_0x00f5
            r11.mo51545B()
            boolean r7 = r11.mo51621y()
            if (r7 == 0) goto L_0x0061
            o1.u0$a r7 = new o1.u0$a
            r7.<init>(r6)
            r11.mo51612t(r7)
            goto L_0x0064
        L_0x0061:
            r11.mo51579c()
        L_0x0064:
            fy3.p<q1.j, o1.w0, rx3.b0> r6 = r8.f328838c
            p175j0.C108508o2.m147049a(r11, r8, r6)
            fy3.p<q1.j, j0.r, rx3.b0> r6 = r8.f328839d
            p175j0.C108508o2.m147049a(r11, r0, r6)
            q1.a$a r0 = p658q1.C110269a.f329831D0
            r0.getClass()
            fy3.p<q1.a, v0.j, rx3.b0> r6 = p658q1.C110269a.C110270a.f329834c
            p175j0.C108508o2.m147049a(r11, r1, r6)
            fy3.p<q1.j, fy3.p<? super o1.x0, ? super i2.b, ? extends o1.z>, rx3.b0> r1 = r8.f328840e
            p175j0.C108508o2.m147049a(r11, r10, r1)
            r0.getClass()
            fy3.p<q1.a, i2.d, rx3.b0> r1 = p658q1.C110269a.C110270a.f329835d
            p175j0.C108508o2.m147049a(r11, r3, r1)
            r0.getClass()
            fy3.p<q1.a, i2.o, rx3.b0> r1 = p658q1.C110269a.C110270a.f329837f
            p175j0.C108508o2.m147049a(r11, r4, r1)
            r0.getClass()
            fy3.p<q1.a, androidx.compose.ui.platform.i2, rx3.b0> r0 = p658q1.C110269a.C110270a.f329838g
            p175j0.C108508o2.m147049a(r11, r5, r0)
            r11.mo51610s()
            r11.mo51565P()
            r0 = -607848778(0xffffffffdbc4f6b6, float:-1.10880714E17)
            r11.mo51557H(r0)
            boolean r0 = r11.mo51575a()
            if (r0 != 0) goto L_0x00af
            o1.u0$c r0 = new o1.u0$c
            r0.<init>(r8)
            p175j0.C60655g0.m70936g(r0, r11, r9)
        L_0x00af:
            r11.mo51565P()
            r0 = 8
            j0.k2 r0 = p175j0.C108500f2.m146998e(r8, r11, r0)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r3 = 1157296644(0x44faf204, float:2007.563)
            r11.mo51557H(r3)
            boolean r3 = r11.mo51619x(r0)
            java.lang.Object r4 = r11.mo51606q()
            if (r3 != 0) goto L_0x00d0
            int r3 = p175j0.C108504h.f324828a
            java.lang.Object r3 = p175j0.C108504h.C60656a.f172772a
            if (r4 != r3) goto L_0x00d8
        L_0x00d0:
            o1.u0$d r4 = new o1.u0$d
            r4.<init>(r0)
            r11.mo51553F(r4)
        L_0x00d8:
            r11.mo51565P()
            fy3.l r4 = (fy3.C32226l) r4
            p175j0.C60655g0.m70930a(r1, r4, r11, r9)
            j0.v1 r9 = r11.mo51596l()
            if (r9 != 0) goto L_0x00e7
            goto L_0x00f4
        L_0x00e7:
            o1.u0$e r11 = new o1.u0$e
            r0 = r11
            r1 = r8
            r3 = r10
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r9.mo51650a(r11)
        L_0x00f4:
            return
        L_0x00f5:
            p175j0.C108501g.m147000a()
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p631o1.C109880u0.m149370a(o1.w0, v0.j, fy3.p, j0.h, int, int):void");
    }

    /* renamed from: b */
    public static final void m149371b(C65503j jVar, C32227p<? super C109894x0, ? super C108319b, ? extends C109899z> pVar, C108504h hVar, int i, int i2) {
        int i3;
        C87412m.m108594g(pVar, "measurePolicy");
        C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> qVar = C24715p.f70494a;
        C108504h z = hVar.mo51623z(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (z.mo51619x(jVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= z.mo51619x(pVar) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !z.mo51575a()) {
            if (i4 != 0) {
                int i5 = C65503j.f188489K0;
                jVar = C65503j.C65504a.f188490d;
            }
            z.mo51557H(-492369756);
            Object q = z.mo51606q();
            int i6 = C108504h.f324828a;
            if (q == C108504h.C60656a.f172772a) {
                q = new C109888w0();
                z.mo51553F(q);
            }
            z.mo51565P();
            int i7 = i3 << 3;
            m149370a((C109888w0) q, jVar, pVar, z, (i7 & 112) | 8 | (i7 & C22657f.CTRL_INDEX), 0);
        } else {
            z.mo51581d();
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C61920b(jVar, pVar, i, i2));
        }
    }
}
