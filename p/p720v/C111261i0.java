package p720v;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import p175j0.C108494d2;
import p257w.C111626b;
import p257w.C111654m;
import p257w.C111656m1;
import p257w.C37901h;
import p560i2.C108329n;
import p560i2.C33181m;
import p631o1.C109827a0;
import p631o1.C109854n0;
import p631o1.C109893x;
import p631o1.C109899z;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: v.i0 */
public final class C111261i0 extends C111257g0 {

    /* renamed from: d */
    public final C37901h<C33181m> f333142d;

    /* renamed from: e */
    public final C0000n0 f333143e;

    /* renamed from: f */
    public C32227p<? super C33181m, ? super C33181m, C13598b0> f333144f;

    /* renamed from: g */
    public C37627a f333145g;

    /* renamed from: v.i0$a */
    public static final class C37627a {

        /* renamed from: a */
        public final C111626b<C33181m, C111654m> f99762a;

        /* renamed from: b */
        public long f99763b;

        public C37627a(C111626b bVar, long j, C8480h hVar) {
            this.f99762a = bVar;
            this.f99763b = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37627a)) {
                return false;
            }
            C37627a aVar = (C37627a) obj;
            return C87412m.m108589b(this.f99762a, aVar.f99762a) && C33181m.m39965a(this.f99763b, aVar.f99763b);
        }

        public int hashCode() {
            long j = this.f99763b;
            return (this.f99762a.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "AnimData(anim=" + this.f99762a + ", startSize=" + C33181m.m39967c(this.f99763b) + ')';
        }
    }

    /* renamed from: v.i0$b */
    public static final class C111262b extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109854n0 f333146d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111262b(C109854n0 n0Var) {
            super(1);
            this.f333146d = n0Var;
        }

        public Object invoke(Object obj) {
            C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
            C87412m.m108594g(aVar, "$this$layout");
            C109854n0.C109855a.m149306f(aVar, this.f333146d, 0, 0, 0.0f, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    public C111261i0(C37901h<C33181m> hVar, C0000n0 n0Var) {
        C87412m.m108594g(hVar, "animSpec");
        C87412m.m108594g(n0Var, "scope");
        this.f333142d = hVar;
        this.f333143e = n0Var;
    }

    /* renamed from: G */
    public C109899z mo142877G(C109827a0 a0Var, C109893x xVar, long j) {
        C87412m.m108594g(a0Var, "$this$measure");
        C87412m.m108594g(xVar, "measurable");
        C109854n0 K = xVar.mo161155K(j);
        long a = C108329n.m146743a(K.f328779d, K.f328780e);
        C37627a aVar = this.f333145g;
        if (aVar == null) {
            aVar = new C37627a(new C111626b(new C33181m(a), C111656m1.f334263h, new C33181m(C108329n.m146743a(1, 1))), a, (C8480h) null);
        } else if (!C33181m.m39965a(a, ((C33181m) ((C108494d2) aVar.f99762a.f334168e).getValue()).f90057a)) {
            aVar.f99763b = aVar.f99762a.mo163295c().f90057a;
            C53895h.m60466d(this.f333143e, (C66212f) null, (C53934p0) null, new C37628j0(aVar, a, this, (C15601d<? super C37628j0>) null), 3, (Object) null);
        }
        this.f333145g = aVar;
        long j2 = aVar.f99762a.mo163295c().f90057a;
        return C109827a0.C109828a.m149247b(a0Var, (int) (j2 >> 32), C33181m.m39966b(j2), (Map) null, new C111262b(K), 4, (Object) null);
    }
}
