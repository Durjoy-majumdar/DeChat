package n04;

import gy3.C87412m;
import wy3.C22935h;
import wy3.C26446d1;

/* renamed from: n04.g0 */
public final class C25121g0 extends C25167p1 {

    /* renamed from: b */
    public final C26446d1[] f71554b;

    /* renamed from: c */
    public final C25158m1[] f71555c;

    /* renamed from: d */
    public final boolean f71556d;

    public C25121g0(C26446d1[] d1VarArr, C25158m1[] m1VarArr, boolean z) {
        C87412m.m108594g(d1VarArr, "parameters");
        C87412m.m108594g(m1VarArr, "arguments");
        this.f71554b = d1VarArr;
        this.f71555c = m1VarArr;
        this.f71556d = z;
    }

    /* renamed from: b */
    public boolean mo37098b() {
        return this.f71556d;
    }

    /* renamed from: d */
    public C25158m1 mo37099d(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "key");
        C22935h o = j0Var.mo37081K0().mo37094o();
        C26446d1 d1Var = o instanceof C26446d1 ? (C26446d1) o : null;
        if (d1Var == null) {
            return null;
        }
        int index = d1Var.getIndex();
        C26446d1[] d1VarArr = this.f71554b;
        if (index >= d1VarArr.length || !C87412m.m108589b(d1VarArr[index].mo36110l(), d1Var.mo36110l())) {
            return null;
        }
        return this.f71555c[index];
    }

    /* renamed from: e */
    public boolean mo52261e() {
        return this.f71555c.length == 0;
    }
}
