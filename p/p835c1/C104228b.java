package p835c1;

import gy3.C87412m;
import p1166z0.C112539e;
import p1166z0.C112545k;
import p1166z0.C112546l;
import p436a1.C103262s;
import p436a1.C27726j0;

/* renamed from: c1.b */
public final class C104228b implements C104234h {

    /* renamed from: a */
    public final /* synthetic */ C104230e f308527a;

    public C104228b(C104230e eVar) {
        this.f308527a = eVar;
    }

    /* renamed from: a */
    public void mo145838a(float f, float f2, float f3, float f4, int i) {
        this.f308527a.mo145835i().mo142942a(f, f2, f3, f4, i);
    }

    /* renamed from: b */
    public void mo145839b(float f, float f2, long j) {
        C103262s i = this.f308527a.mo145835i();
        i.mo142945d(C112539e.m153738c(j), C112539e.m153739d(j));
        i.mo142952k(f, f2);
        i.mo142945d(-C112539e.m153738c(j), -C112539e.m153739d(j));
    }

    /* renamed from: c */
    public void mo145840c(float f, float f2, float f3, float f4) {
        C103262s i = this.f308527a.mo145835i();
        C104230e eVar = this.f308527a;
        long a = C112546l.m153761a(C112545k.m153758d(eVar.mo145834e()) - (f3 + f), C112545k.m153756b(this.f308527a.mo145834e()) - (f4 + f2));
        if (C112545k.m153758d(a) >= 0.0f && C112545k.m153756b(a) >= 0.0f) {
            eVar.mo145837k(a);
            i.mo142945d(f, f2);
            return;
        }
        throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
    }

    /* renamed from: d */
    public void mo145841d(float f, float f2) {
        this.f308527a.mo145835i().mo142945d(f, f2);
    }

    /* renamed from: e */
    public void mo145842e(C27726j0 j0Var, int i) {
        C87412m.m108594g(j0Var, "path");
        this.f308527a.mo145835i().mo142946e(j0Var, i);
    }

    /* renamed from: f */
    public void mo145843f(float[] fArr) {
        C87412m.m108594g(fArr, "matrix");
        this.f308527a.mo145835i().mo142954m(fArr);
    }

    /* renamed from: g */
    public void mo145844g(float f, long j) {
        C103262s i = this.f308527a.mo145835i();
        i.mo142945d(C112539e.m153738c(j), C112539e.m153739d(j));
        i.mo142960s(f);
        i.mo142945d(-C112539e.m153738c(j), -C112539e.m153739d(j));
    }
}
