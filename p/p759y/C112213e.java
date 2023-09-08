package p759y;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import androidx.compose.p002ui.platform.C103612c1;
import androidx.compose.p002ui.platform.C103618e1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p1140p1.C110100f;
import p1166z0.C112539e;
import p1166z0.C112541g;
import p1166z0.C112542h;
import p1166z0.C112545k;
import p257w.C37901h;
import p267x.C111957s0;
import p267x.C66227t0;
import p463c0.C104200k;
import p463c0.C104201l;
import p560i2.C108329n;
import p560i2.C33181m;
import p631o1.C109847j0;
import p631o1.C109849k0;
import p631o1.C109857o;
import p721v0.C111299g;
import p721v0.C65503j;
import rx3.C13598b0;
import rx3.C13603j;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;

/* renamed from: y.e */
public final class C112213e implements C104200k, C109849k0, C109847j0 {

    /* renamed from: d */
    public final C0000n0 f335962d;

    /* renamed from: e */
    public final C112218f0 f335963e;

    /* renamed from: f */
    public final C112302z0 f335964f;

    /* renamed from: g */
    public final boolean f335965g;

    /* renamed from: h */
    public C109857o f335966h;

    /* renamed from: i */
    public C109857o f335967i;

    /* renamed from: j */
    public C33181m f335968j;

    /* renamed from: n */
    public final C65503j f335969n;

    /* renamed from: y.e$a */
    public static final class C112214a extends C87413o implements C32226l<C109857o, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C112213e f335970d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112214a(C112213e eVar) {
            super(1);
            this.f335970d = eVar;
        }

        public Object invoke(Object obj) {
            this.f335970d.f335966h = (C109857o) obj;
            return C13598b0.f38549a;
        }
    }

    public C112213e(C0000n0 n0Var, C112218f0 f0Var, C112302z0 z0Var, boolean z) {
        C87412m.m108594g(n0Var, "scope");
        C87412m.m108594g(f0Var, "orientation");
        C87412m.m108594g(z0Var, "scrollableState");
        this.f335962d = n0Var;
        this.f335963e = f0Var;
        this.f335964f = z0Var;
        this.f335965g = z;
        C112214a aVar = new C112214a(this);
        C110100f<C32226l<C109857o, C13598b0>> fVar = C111957s0.f335170a;
        C32226l<C103618e1, C13598b0> lVar = C103612c1.f306063a;
        C65503j a = C111299g.m151786a(this, lVar, new C66227t0(aVar));
        C87412m.m108594g(a, "<this>");
        this.f335969n = C111299g.m151786a(a, lVar, new C104201l(this));
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return C65503j.C65506c.C65507a.m77190a(this, lVar);
    }

    /* renamed from: b */
    public Object mo145811b(C112541g gVar, C15601d<? super C13598b0> dVar) {
        Object f = mo164029f(gVar, mo145812d(gVar), dVar);
        return f == C15911a.COROUTINE_SUSPENDED ? f : C13598b0.f38549a;
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    /* renamed from: d */
    public C112541g mo145812d(C112541g gVar) {
        C87412m.m108594g(gVar, "localRect");
        C33181m mVar = this.f335968j;
        if (mVar != null) {
            return mo164028e(gVar, mVar.f90057a);
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    /* renamed from: e */
    public final C112541g mo164028e(C112541g gVar, long j) {
        long b = C108329n.m146744b(j);
        int ordinal = this.f335963e.ordinal();
        if (ordinal == 0) {
            return gVar.mo164262c(0.0f, mo164030g(gVar.f336962b, gVar.f336964d, C112545k.m153756b(b)));
        }
        if (ordinal == 1) {
            return gVar.mo164262c(mo164030g(gVar.f336961a, gVar.f336963c, C112545k.m153758d(b)), 0.0f);
        }
        throw new C13603j();
    }

    /* renamed from: f */
    public final Object mo164029f(C112541g gVar, C112541g gVar2, C15601d<? super C13598b0> dVar) {
        float f;
        float f2;
        int ordinal = this.f335963e.ordinal();
        if (ordinal == 0) {
            f2 = gVar.f336962b;
            f = gVar2.f336962b;
        } else if (ordinal == 1) {
            f2 = gVar.f336961a;
            f = gVar2.f336961a;
        } else {
            throw new C13603j();
        }
        float f3 = f2 - f;
        if (this.f335965g) {
            f3 = -f3;
        }
        Object b = C112273p0.m153169b(this.f335964f, f3, (C37901h) null, dVar, 2, (Object) null);
        return b == C15911a.COROUTINE_SUSPENDED ? b : C13598b0.f38549a;
    }

    /* renamed from: g */
    public final float mo164030g(float f, float f2, float f3) {
        if ((f >= 0.0f && f2 <= f3) || (f < 0.0f && f2 > f3)) {
            return 0.0f;
        }
        float f4 = f2 - f3;
        return Math.abs(f) < Math.abs(f4) ? f : f4;
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }

    /* renamed from: k0 */
    public void mo161162k0(long j) {
        C109857o oVar;
        C112541g X;
        C109857o oVar2 = this.f335967i;
        C33181m mVar = this.f335968j;
        if (mVar != null && !C33181m.m39965a(mVar.f90057a, j)) {
            if (oVar2 != null && oVar2.mo161183y()) {
                long j2 = mVar.f90057a;
                if (!(!(this.f335963e != C112218f0.Horizontal ? C33181m.m39966b(oVar2.mo161181b()) < C33181m.m39966b(j2) : ((int) (oVar2.mo161181b() >> 32)) < ((int) (j2 >> 32))) || (oVar = this.f335966h) == null || (X = oVar2.mo161179X(oVar, false)) == null)) {
                    C112541g a = C112542h.m153752a(C112539e.f336955b, C108329n.m146744b(j2));
                    C112541g e = mo164028e(X, oVar2.mo161181b());
                    boolean b = a.mo164261b(X);
                    boolean b2 = true ^ C87412m.m108589b(e, X);
                    if (b && b2) {
                        C53895h.m60466d(this.f335962d, (C66212f) null, (C53934p0) null, new C112217f(this, X, e, (C15601d<? super C112217f>) null), 3, (Object) null);
                    }
                }
            }
        }
        this.f335968j = new C33181m(j);
    }

    /* renamed from: y */
    public void mo145809y(C109857o oVar) {
        C87412m.m108594g(oVar, "coordinates");
        this.f335967i = oVar;
    }
}
