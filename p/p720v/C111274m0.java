package p720v;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import p175j0.C60667k2;
import p257w.C111629c1;
import p257w.C111654m;
import p257w.C37892b0;
import p560i2.C108329n;
import p560i2.C33177j;
import p631o1.C109827a0;
import p631o1.C109854n0;
import p631o1.C109893x;
import p631o1.C109899z;
import rx3.C13598b0;

/* renamed from: v.m0 */
public final class C111274m0 extends C111257g0 {

    /* renamed from: d */
    public final C111629c1<C111277n>.a<C33177j, C111654m> f333175d;

    /* renamed from: e */
    public final C60667k2<C37629k0> f333176e;

    /* renamed from: f */
    public final C60667k2<C37629k0> f333177f;

    /* renamed from: g */
    public final C32226l<C111629c1.C111632b<C111277n>, C37892b0<C33177j>> f333178g = new C111276b(this);

    /* renamed from: v.m0$a */
    public static final class C111275a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111274m0 f333179d;

        /* renamed from: e */
        public final /* synthetic */ C109854n0 f333180e;

        /* renamed from: f */
        public final /* synthetic */ long f333181f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111275a(C111274m0 m0Var, C109854n0 n0Var, long j) {
            super(1);
            this.f333179d = m0Var;
            this.f333180e = n0Var;
            this.f333181f = j;
        }

        public Object invoke(Object obj) {
            C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
            C87412m.m108594g(aVar, "$this$layout");
            C111274m0 m0Var = this.f333179d;
            C109854n0.C109855a.m149309j(aVar, this.f333180e, ((C33177j) ((C111629c1.C111630a.C111631a) m0Var.f333175d.mo163305a(m0Var.f333178g, new C111272l0(m0Var, this.f333181f))).getValue()).f90052a, 0.0f, (C32226l) null, 6, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: v.m0$b */
    public static final class C111276b extends C87413o implements C32226l<C111629c1.C111632b<C111277n>, C37892b0<C33177j>> {

        /* renamed from: d */
        public final /* synthetic */ C111274m0 f333182d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111276b(C111274m0 m0Var) {
            super(1);
            this.f333182d = m0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
            r3 = r3.f99769b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r3) {
            /*
                r2 = this;
                w.c1$b r3 = (p257w.C111629c1.C111632b) r3
                java.lang.String r0 = "$this$null"
                gy3.C87412m.m108594g(r3, r0)
                v.n r0 = p720v.C111277n.PreEnter
                v.n r1 = p720v.C111277n.Visible
                boolean r0 = r3.mo163307a(r0, r1)
                if (r0 == 0) goto L_0x0024
                v.m0 r3 = r2.f333182d
                j0.k2<v.k0> r3 = r3.f333176e
                java.lang.Object r3 = r3.getValue()
                v.k0 r3 = (p720v.C37629k0) r3
                if (r3 == 0) goto L_0x0021
                w.b0<i2.j> r3 = r3.f99769b
                if (r3 != 0) goto L_0x0041
            L_0x0021:
                w.w0<i2.j> r3 = p720v.C111278o.f333190d
                goto L_0x0041
            L_0x0024:
                v.n r0 = p720v.C111277n.PostExit
                boolean r3 = r3.mo163307a(r1, r0)
                if (r3 == 0) goto L_0x003f
                v.m0 r3 = r2.f333182d
                j0.k2<v.k0> r3 = r3.f333177f
                java.lang.Object r3 = r3.getValue()
                v.k0 r3 = (p720v.C37629k0) r3
                if (r3 == 0) goto L_0x003c
                w.b0<i2.j> r3 = r3.f99769b
                if (r3 != 0) goto L_0x0041
            L_0x003c:
                w.w0<i2.j> r3 = p720v.C111278o.f333190d
                goto L_0x0041
            L_0x003f:
                w.w0<i2.j> r3 = p720v.C111278o.f333190d
            L_0x0041:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p720v.C111274m0.C111276b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public C111274m0(C111629c1<C111277n>.a<C33177j, C111654m> aVar, C60667k2<C37629k0> k2Var, C60667k2<C37629k0> k2Var2) {
        C87412m.m108594g(aVar, "lazyAnimation");
        C87412m.m108594g(k2Var, "slideIn");
        C87412m.m108594g(k2Var2, "slideOut");
        this.f333175d = aVar;
        this.f333176e = k2Var;
        this.f333177f = k2Var2;
    }

    /* renamed from: G */
    public C109899z mo142877G(C109827a0 a0Var, C109893x xVar, long j) {
        C87412m.m108594g(a0Var, "$this$measure");
        C87412m.m108594g(xVar, "measurable");
        C109854n0 K = xVar.mo161155K(j);
        return C109827a0.C109828a.m149247b(a0Var, K.f328779d, K.f328780e, (Map) null, new C111275a(this, K, C108329n.m146743a(K.f328779d, K.f328780e)), 4, (Object) null);
    }
}
