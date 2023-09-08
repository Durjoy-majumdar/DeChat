package pj2;

import eb0.C75592q0;
import gy3.C87412m;
import ve3.C65679e0;
import ve3.C65680f;
import ve3.C65681f0;
import ve3.C65682g;
import ve3.C65685n0;

/* renamed from: pj2.e */
public final class C62324e implements C62323d {

    /* renamed from: d */
    public final C65685n0 f177154d;

    /* renamed from: e */
    public boolean f177155e;

    /* renamed from: f */
    public boolean f177156f;

    /* renamed from: g */
    public String f177157g = "";

    public C62324e(C65685n0 n0Var) {
        C87412m.m108594g(n0Var, "ringtoneInfo");
        this.f177154d = n0Var;
    }

    /* renamed from: c */
    public int mo75c() {
        return 1;
    }

    /* renamed from: e */
    public C65685n0 mo87403e() {
        return this.f177154d;
    }

    public long getItemId() {
        C65679e0 e0Var;
        int i;
        C65680f fVar;
        C65685n0 n0Var = this.f177154d;
        int i2 = n0Var.f189020d;
        if (i2 == 1) {
            C65681f0 f0Var = n0Var.f189021e;
            if (f0Var == null || (e0Var = f0Var.f188985d) == null) {
                return 0;
            }
            i = e0Var.f188982d;
        } else if (i2 == 2) {
            C65682g gVar = n0Var.f189022f;
            if (gVar == null || (fVar = gVar.f188994d) == null) {
                return 0;
            }
            return fVar.f188983d;
        } else if (i2 != 3) {
            return 0;
        } else {
            i = C75592q0.m90776f();
        }
        return (long) i;
    }

    /* renamed from: h */
    public void mo87404h(boolean z) {
        this.f177155e = z;
    }
}
