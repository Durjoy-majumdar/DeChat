package p257w;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108494d2;
import p175j0.C108504h;
import p175j0.C60647d0;
import p175j0.C60651e0;
import p257w.C65915i0;
import rx3.C13598b0;

/* renamed from: w.j0 */
public final class C111648j0 {

    /* renamed from: w.j0$a */
    public static final class C111649a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ T f334240d;

        /* renamed from: e */
        public final /* synthetic */ C65915i0.C65920a<T, V> f334241e;

        /* renamed from: f */
        public final /* synthetic */ T f334242f;

        /* renamed from: g */
        public final /* synthetic */ C37902h0<T> f334243g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111649a(T t, C65915i0.C65920a<T, V> aVar, T t2, C37902h0<T> h0Var) {
            super(0);
            this.f334240d = t;
            this.f334241e = aVar;
            this.f334242f = t2;
            this.f334243g = h0Var;
        }

        public Object invoke() {
            if (!C87412m.m108589b(this.f334240d, this.f334241e.f189501d) || !C87412m.m108589b(this.f334242f, this.f334241e.f189502e)) {
                C65915i0.C65920a<T, V> aVar = this.f334241e;
                T t = this.f334240d;
                T t2 = this.f334242f;
                C37902h0<T> h0Var = this.f334243g;
                aVar.getClass();
                C87412m.m108594g(h0Var, "animationSpec");
                aVar.f189501d = t;
                aVar.f189502e = t2;
                aVar.f189504g = h0Var;
                aVar.f189506i = new C37893b1(h0Var, aVar.f189503f, t, t2, (C37919o) null, 16, (C8480h) null);
                ((C108494d2) aVar.f189510p.f189488b).setValue(Boolean.TRUE);
                aVar.f189507j = false;
                aVar.f189508n = true;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: w.j0$b */
    public static final class C111650b extends C87413o implements C32226l<C60651e0, C60647d0> {

        /* renamed from: d */
        public final /* synthetic */ C65915i0 f334244d;

        /* renamed from: e */
        public final /* synthetic */ C65915i0.C65920a<T, V> f334245e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111650b(C65915i0 i0Var, C65915i0.C65920a<T, V> aVar) {
            super(1);
            this.f334244d = i0Var;
            this.f334245e = aVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C60651e0) obj, "$this$DisposableEffect");
            C65915i0 i0Var = this.f334244d;
            C65915i0.C65920a<T, V> aVar = this.f334245e;
            i0Var.getClass();
            C87412m.m108594g(aVar, "animation");
            i0Var.f189487a.mo159860b(aVar);
            ((C108494d2) i0Var.f189488b).setValue(Boolean.TRUE);
            return new C111652k0(this.f334244d, this.f334245e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: w.i0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: w.i0$a} */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, V extends p257w.C37919o> p175j0.C60667k2<T> m152175a(p257w.C65915i0 r7, T r8, T r9, p257w.C37906k1<T, V> r10, p257w.C37902h0<T> r11, p175j0.C108504h r12, int r13) {
        /*
            java.lang.String r13 = "<this>"
            gy3.C87412m.m108594g(r7, r13)
            java.lang.String r13 = "typeConverter"
            gy3.C87412m.m108594g(r10, r13)
            java.lang.String r13 = "animationSpec"
            gy3.C87412m.m108594g(r11, r13)
            r13 = -1695411770(0xffffffff9af211c6, float:-1.0011757E-22)
            r12.mo51557H(r13)
            r13 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.mo51557H(r13)
            java.lang.Object r13 = r12.mo51606q()
            int r0 = p175j0.C108504h.f324828a
            java.lang.Object r0 = p175j0.C108504h.C60656a.f172772a
            if (r13 != r0) goto L_0x0033
            w.i0$a r13 = new w.i0$a
            r1 = r13
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r12.mo51553F(r13)
        L_0x0033:
            r12.mo51565P()
            w.i0$a r13 = (p257w.C65915i0.C65920a) r13
            w.j0$a r10 = new w.j0$a
            r10.<init>(r8, r13, r9, r11)
            r8 = 0
            p175j0.C60655g0.m70936g(r10, r12, r8)
            w.j0$b r8 = new w.j0$b
            r8.<init>(r7, r13)
            r7 = 6
            p175j0.C60655g0.m70930a(r13, r8, r12, r7)
            r12.mo51565P()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p257w.C111648j0.m152175a(w.i0, java.lang.Object, java.lang.Object, w.k1, w.h0, j0.h, int):j0.k2");
    }

    /* renamed from: b */
    public static final C65915i0 m152176b(C108504h hVar, int i) {
        hVar.mo51557H(-840193660);
        hVar.mo51557H(-492369756);
        Object q = hVar.mo51606q();
        int i2 = C108504h.f324828a;
        if (q == C108504h.C60656a.f172772a) {
            q = new C65915i0();
            hVar.mo51553F(q);
        }
        hVar.mo51565P();
        C65915i0 i0Var = (C65915i0) q;
        i0Var.mo89957a(hVar, 8);
        hVar.mo51565P();
        return i0Var;
    }
}
