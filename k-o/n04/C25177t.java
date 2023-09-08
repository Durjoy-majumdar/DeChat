package n04;

import gy3.C8480h;
import gy3.C87412m;
import n04.C25134i1;
import o04.C25314a;
import o04.C25320d;
import o04.C25323e;
import o04.C25326g;
import o04.C25333m;
import o04.C25335o;
import q04.C25522e;
import wy3.C22935h;
import wy3.C26446d1;
import zy3.C26763o0;

/* renamed from: n04.t */
public final class C25177t extends C25185v implements C25172r, C25522e {

    /* renamed from: g */
    public static final C25178a f71623g = new C25178a((C8480h) null);

    /* renamed from: e */
    public final C25176s0 f71624e;

    /* renamed from: f */
    public final boolean f71625f;

    /* renamed from: n04.t$a */
    public static final class C25178a {
        public C25178a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C25177t mo52310a(C25198y1 y1Var, boolean z) {
            C87412m.m108594g(y1Var, "type");
            if (y1Var instanceof C25177t) {
                return (C25177t) y1Var;
            }
            boolean z2 = true;
            if (!((y1Var.mo37081K0() instanceof C25333m) || (y1Var.mo37081K0().mo37094o() instanceof C26446d1) || (y1Var instanceof C25326g) || (y1Var instanceof C25103a1))) {
                z2 = false;
            } else if (y1Var instanceof C25103a1) {
                z2 = C25187v1.m32087g(y1Var);
            } else {
                C22935h o = y1Var.mo37081K0().mo37094o();
                C26763o0 o0Var = o instanceof C26763o0 ? (C26763o0) o : null;
                if (!(o0Var != null && !o0Var.f74422s)) {
                    z2 = (!z || !(y1Var.mo37081K0().mo37094o() instanceof C26446d1)) ? true ^ C25108c.f71539a.mo52241a(C25314a.m32212a(false, true, C25335o.f71846a, (C25320d) null, (C25323e) null, 24, (Object) null), C25119f0.m31893c(y1Var), C25134i1.C25135b.C25137b.f71583a) : C25187v1.m32087g(y1Var);
                }
            }
            if (!z2) {
                return null;
            }
            if (y1Var instanceof C25109c0) {
                C25109c0 c0Var = (C25109c0) y1Var;
                C87412m.m108589b(c0Var.f71540e.mo37081K0(), c0Var.f71541f.mo37081K0());
            }
            return new C25177t(C25119f0.m31893c(y1Var).mo37084O0(false), z);
        }
    }

    public C25177t(C25176s0 s0Var, boolean z) {
        this.f71624e = s0Var;
        this.f71625f = z;
    }

    /* renamed from: D */
    public C25143j0 mo52247D(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "replacement");
        return C25190w0.m32110a(j0Var.mo52229N0(), this.f71625f);
    }

    /* renamed from: L0 */
    public boolean mo37082L0() {
        return false;
    }

    /* renamed from: R0 */
    public C25176s0 mo37086R0(boolean z) {
        return z ? this.f71624e.mo37084O0(z) : this;
    }

    /* renamed from: S0 */
    public C25176s0 mo37087S0(C25122g1 g1Var) {
        C87412m.m108594g(g1Var, "newAttributes");
        return new C25177t(this.f71624e.mo51873Q0(g1Var), this.f71625f);
    }

    /* renamed from: T0 */
    public C25176s0 mo52223T0() {
        return this.f71624e;
    }

    /* renamed from: U */
    public boolean mo52249U() {
        return (this.f71624e.mo37081K0() instanceof C25333m) || (this.f71624e.mo37081K0().mo37094o() instanceof C26446d1);
    }

    /* renamed from: V0 */
    public C25185v mo52225V0(C25176s0 s0Var) {
        C87412m.m108594g(s0Var, "delegate");
        return new C25177t(s0Var, this.f71625f);
    }

    public String toString() {
        return this.f71624e + " & Any";
    }
}
