package p720v;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
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
import p560i2.C33179k;
import p560i2.C33181m;
import p560i2.C33183o;
import p631o1.C109827a0;
import p631o1.C109854n0;
import p631o1.C109893x;
import p631o1.C109899z;
import p721v0.C111294a;
import rx3.C13598b0;
import rx3.C13603j;

/* renamed from: v.c0 */
public final class C111248c0 extends C111257g0 {

    /* renamed from: d */
    public final C111629c1<C111277n>.a<C33181m, C111654m> f333117d;

    /* renamed from: e */
    public final C111629c1<C111277n>.a<C33177j, C111654m> f333118e;

    /* renamed from: f */
    public final C60667k2<C111256g> f333119f;

    /* renamed from: g */
    public final C60667k2<C111256g> f333120g;

    /* renamed from: h */
    public final C60667k2<C111294a> f333121h;

    /* renamed from: i */
    public C111294a f333122i;

    /* renamed from: j */
    public final C32226l<C111629c1.C111632b<C111277n>, C37892b0<C33181m>> f333123j = new C111253e(this);

    /* renamed from: v.c0$a */
    public static final class C111249a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109854n0 f333124d;

        /* renamed from: e */
        public final /* synthetic */ long f333125e;

        /* renamed from: f */
        public final /* synthetic */ long f333126f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111249a(C109854n0 n0Var, long j, long j2) {
            super(1);
            this.f333124d = n0Var;
            this.f333125e = j;
            this.f333126f = j2;
        }

        public Object invoke(Object obj) {
            C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
            C87412m.m108594g(aVar, "$this$layout");
            C109854n0 n0Var = this.f333124d;
            long j = this.f333125e;
            int i = C33177j.f90051c;
            int i2 = (int) (this.f333126f >> 32);
            C109854n0.C109855a.m149304c(aVar, n0Var, i2 + ((int) (j >> 32)), C33177j.m39962a(this.f333126f) + C33177j.m39962a(j), 0.0f, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: v.c0$b */
    public static final class C111250b extends C87413o implements C32226l<C111277n, C33181m> {

        /* renamed from: d */
        public final /* synthetic */ C111248c0 f333127d;

        /* renamed from: e */
        public final /* synthetic */ long f333128e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111250b(C111248c0 c0Var, long j) {
            super(1);
            this.f333127d = c0Var;
            this.f333128e = j;
        }

        public Object invoke(Object obj) {
            C111277n nVar = (C111277n) obj;
            C87412m.m108594g(nVar, LocaleUtil.ITALIAN);
            C111248c0 c0Var = this.f333127d;
            long j = this.f333128e;
            c0Var.getClass();
            C111256g value = c0Var.f333119f.getValue();
            long j2 = value != null ? value.f333137b.invoke(new C33181m(j)).f90057a : j;
            C111256g value2 = c0Var.f333120g.getValue();
            long j3 = value2 != null ? value2.f333137b.invoke(new C33181m(j)).f90057a : j;
            int ordinal = nVar.ordinal();
            if (ordinal == 0) {
                j = j2;
            } else if (ordinal != 1) {
                if (ordinal == 2) {
                    j = j3;
                } else {
                    throw new C13603j();
                }
            }
            return new C33181m(j);
        }
    }

    /* renamed from: v.c0$c */
    public static final class C111251c extends C87413o implements C32226l<C111629c1.C111632b<C111277n>, C37892b0<C33177j>> {

        /* renamed from: d */
        public static final C111251c f333129d = new C111251c();

        public C111251c() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C111629c1.C111632b) obj, "$this$animate");
            return C111278o.f333190d;
        }
    }

    /* renamed from: v.c0$d */
    public static final class C111252d extends C87413o implements C32226l<C111277n, C33177j> {

        /* renamed from: d */
        public final /* synthetic */ C111248c0 f333130d;

        /* renamed from: e */
        public final /* synthetic */ long f333131e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111252d(C111248c0 c0Var, long j) {
            super(1);
            this.f333130d = c0Var;
            this.f333131e = j;
        }

        public Object invoke(Object obj) {
            long j;
            C111277n nVar = (C111277n) obj;
            C87412m.m108594g(nVar, LocaleUtil.ITALIAN);
            C111248c0 c0Var = this.f333130d;
            long j2 = this.f333131e;
            c0Var.getClass();
            if (c0Var.f333122i == null) {
                j = C33177j.f90050b;
            } else if (c0Var.f333121h.getValue() == null) {
                j = C33177j.f90050b;
            } else if (C87412m.m108589b(c0Var.f333122i, c0Var.f333121h.getValue())) {
                j = C33177j.f90050b;
            } else {
                int ordinal = nVar.ordinal();
                if (ordinal == 0) {
                    j = C33177j.f90050b;
                } else if (ordinal == 1) {
                    j = C33177j.f90050b;
                } else if (ordinal == 2) {
                    C111256g value = c0Var.f333120g.getValue();
                    if (value != null) {
                        long j3 = value.f333137b.invoke(new C33181m(j2)).f90057a;
                        C111294a value2 = c0Var.f333121h.getValue();
                        C87412m.m108591d(value2);
                        long j4 = j2;
                        long j5 = j3;
                        C33183o oVar = C33183o.Ltr;
                        long a = value2.mo61256a(j4, j5, oVar);
                        C111294a aVar = c0Var.f333122i;
                        C87412m.m108591d(aVar);
                        long a2 = aVar.mo61256a(j4, j5, oVar);
                        j = C33179k.m39964a(((int) (a >> 32)) - ((int) (a2 >> 32)), C33177j.m39962a(a) - C33177j.m39962a(a2));
                    } else {
                        j = C33177j.f90050b;
                    }
                } else {
                    throw new C13603j();
                }
            }
            return new C33177j(j);
        }
    }

    /* renamed from: v.c0$e */
    public static final class C111253e extends C87413o implements C32226l<C111629c1.C111632b<C111277n>, C37892b0<C33181m>> {

        /* renamed from: d */
        public final /* synthetic */ C111248c0 f333132d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111253e(C111248c0 c0Var) {
            super(1);
            this.f333132d = c0Var;
        }

        public Object invoke(Object obj) {
            C111629c1.C111632b bVar = (C111629c1.C111632b) obj;
            C87412m.m108594g(bVar, "$this$null");
            C111277n nVar = C111277n.PreEnter;
            C111277n nVar2 = C111277n.Visible;
            Object obj2 = null;
            if (bVar.mo163307a(nVar, nVar2)) {
                C111256g value = this.f333132d.f333119f.getValue();
                if (value != null) {
                    obj2 = value.f333138c;
                }
            } else if (bVar.mo163307a(nVar2, C111277n.PostExit)) {
                C111256g value2 = this.f333132d.f333120g.getValue();
                if (value2 != null) {
                    obj2 = value2.f333138c;
                }
            } else {
                obj2 = C111278o.f333191e;
            }
            return obj2 == null ? C111278o.f333191e : obj2;
        }
    }

    public C111248c0(C111629c1<C111277n>.a<C33181m, C111654m> aVar, C111629c1<C111277n>.a<C33177j, C111654m> aVar2, C60667k2<C111256g> k2Var, C60667k2<C111256g> k2Var2, C60667k2<? extends C111294a> k2Var3) {
        C87412m.m108594g(aVar, "sizeAnimation");
        C87412m.m108594g(aVar2, "offsetAnimation");
        C87412m.m108594g(k2Var, "expand");
        C87412m.m108594g(k2Var2, "shrink");
        C87412m.m108594g(k2Var3, "alignment");
        this.f333117d = aVar;
        this.f333118e = aVar2;
        this.f333119f = k2Var;
        this.f333120g = k2Var2;
        this.f333121h = k2Var3;
    }

    /* renamed from: G */
    public C109899z mo142877G(C109827a0 a0Var, C109893x xVar, long j) {
        long j2;
        C87412m.m108594g(a0Var, "$this$measure");
        C87412m.m108594g(xVar, "measurable");
        C109854n0 K = xVar.mo161155K(j);
        long a = C108329n.m146743a(K.f328779d, K.f328780e);
        long j3 = ((C33181m) ((C111629c1.C111630a.C111631a) this.f333117d.mo163305a(this.f333123j, new C111250b(this, a))).getValue()).f90057a;
        long j4 = ((C33177j) ((C111629c1.C111630a.C111631a) this.f333118e.mo163305a(C111251c.f333129d, new C111252d(this, a))).getValue()).f90052a;
        C111294a aVar = this.f333122i;
        if (aVar != null) {
            j2 = aVar.mo61256a(a, j3, C33183o.Ltr);
        } else {
            int i = C33177j.f90051c;
            j2 = C33177j.f90050b;
        }
        return C109827a0.C109828a.m149247b(a0Var, (int) (j3 >> 32), C33181m.m39966b(j3), (Map) null, new C111249a(K, j2, j4), 4, (Object) null);
    }
}
