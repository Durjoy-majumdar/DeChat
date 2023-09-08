package p155g0;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import my3.C109647f;
import my3.C61594j;
import my3.C61595o;
import p1166z0.C112539e;
import p1166z0.C112540f;
import p152f0.C107343g0;
import p152f0.C107394p2;
import p152f0.C107401q2;
import p155g0.C107610c0;
import p175j0.C108494d2;
import p175j0.C60690y0;
import p560i2.C33181m;
import p631o1.C109857o;
import p735w1.C111703v;
import p735w1.C38006x;
import rx3.C13603j;
import z04.C112550d0;

/* renamed from: g0.d0 */
public final class C107615d0 extends C87413o implements C32224a<C112539e> {

    /* renamed from: d */
    public final /* synthetic */ C107601b0 f321994d;

    /* renamed from: e */
    public final /* synthetic */ C60690y0<C33181m> f321995e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107615d0(C107601b0 b0Var, C60690y0<C33181m> y0Var) {
        super(0);
        this.f321994d = b0Var;
        this.f321995e = y0Var;
    }

    public Object invoke() {
        long j;
        int i;
        C107401q2 q2Var;
        C111703v vVar;
        C109857o oVar;
        C109857o oVar2;
        C107601b0 b0Var = this.f321994d;
        long j2 = this.f321995e.getValue().f90057a;
        C87412m.m108594g(b0Var, "manager");
        if (b0Var.mo158023j().f78285a.f100413d.length() == 0) {
            j = C112539e.f336957d;
        } else {
            C107343g0 g0Var = (C107343g0) ((C108494d2) b0Var.f321967n).getValue();
            int i2 = g0Var == null ? -1 : C107610c0.C107613c.f321989a[g0Var.ordinal()];
            if (i2 != -1) {
                if (i2 == 1 || i2 == 2) {
                    long j3 = b0Var.mo158023j().f78286b;
                    int i3 = C38006x.f100499c;
                    i = (int) (j3 >> 32);
                } else if (i2 == 3) {
                    i = C38006x.m41695c(b0Var.mo158023j().f78286b);
                } else {
                    throw new C13603j();
                }
                int b = b0Var.f321955b.mo145897b(i);
                C61594j z = C112550d0.m153806z(b0Var.mo158023j().f78285a.f100413d);
                if (z instanceof C109647f) {
                    Comparable valueOf = Integer.valueOf(b);
                    C109647f fVar = (C109647f) z;
                    C87412m.m108594g(valueOf, "<this>");
                    if (!fVar.isEmpty()) {
                        if (fVar.mo59686f(valueOf, fVar.mo59687f0()) && !fVar.mo59686f(fVar.mo59687f0(), valueOf)) {
                            valueOf = fVar.mo59687f0();
                        } else if (fVar.mo59686f(fVar.mo59688g0(), valueOf) && !fVar.mo59686f(valueOf, fVar.mo59688g0())) {
                            valueOf = fVar.mo59688g0();
                        }
                        b = ((Number) valueOf).intValue();
                    } else {
                        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + fVar + '.');
                    }
                } else if (z.isEmpty()) {
                    throw new IllegalArgumentException("Cannot coerce value to an empty range: " + z + '.');
                } else if (b < z.mo59687f0().intValue()) {
                    b = z.mo59687f0().intValue();
                } else if (b > z.mo59688g0().intValue()) {
                    b = z.mo59688g0().intValue();
                }
                C107394p2 p2Var = b0Var.f321957d;
                if (p2Var == null || (q2Var = p2Var.f321319g) == null || (vVar = q2Var.f321339a) == null) {
                    j = C112539e.f336957d;
                } else {
                    long a = vVar.mo163364b(b).mo164260a();
                    C107394p2 p2Var2 = b0Var.f321957d;
                    if (p2Var2 == null || (oVar = p2Var2.f321318f) == null) {
                        j = C112539e.f336957d;
                    } else {
                        C107401q2 q2Var2 = p2Var2.f321319g;
                        if (q2Var2 == null || (oVar2 = q2Var2.f321340b) == null) {
                            j = C112539e.f336957d;
                        } else {
                            C112539e eVar = (C112539e) ((C108494d2) b0Var.f321968o).getValue();
                            if (eVar != null) {
                                float c = C112539e.m153738c(oVar2.mo161178U(oVar, eVar.f336959a));
                                int f = vVar.mo163369f(b);
                                int j4 = vVar.mo163374j(f);
                                int e = vVar.mo163367e(f, true);
                                boolean z2 = ((int) (b0Var.mo158023j().f78286b >> 32)) > C38006x.m41695c(b0Var.mo158023j().f78286b);
                                float a2 = C107628l0.m145803a(vVar, j4, true, z2);
                                float a3 = C107628l0.m145803a(vVar, e, false, z2);
                                float d = C61595o.m72296d(c, Math.min(a2, a3), Math.max(a2, a3));
                                j = Math.abs(c - d) > ((float) (((int) (j2 >> 32)) / 2)) ? C112539e.f336957d : oVar.mo161178U(oVar2, C112540f.m153745a(d, C112539e.m153739d(a)));
                            } else {
                                j = C112539e.f336957d;
                            }
                        }
                    }
                }
            } else {
                j = C112539e.f336957d;
            }
        }
        return new C112539e(j);
    }
}
