package n04;

import g04.C20770i;
import gy3.C87412m;
import java.util.List;
import o04.C25323e;
import o04.C25335o;
import q04.C25526i;
import xy3.C26564a;
import xy3.C26571h;

/* renamed from: n04.j0 */
public abstract class C25143j0 implements C26564a, C25526i {

    /* renamed from: d */
    public int f71588d;

    /* renamed from: I0 */
    public abstract List<C25158m1> mo37079I0();

    /* renamed from: J0 */
    public abstract C25122g1 mo37080J0();

    /* renamed from: K0 */
    public abstract C25144j1 mo37081K0();

    /* renamed from: L0 */
    public abstract boolean mo37082L0();

    /* renamed from: M0 */
    public abstract C25143j0 mo37083M0(C25323e eVar);

    /* renamed from: N0 */
    public abstract C25198y1 mo52229N0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25143j0)) {
            return false;
        }
        C25143j0 j0Var = (C25143j0) obj;
        if (mo37082L0() == j0Var.mo37082L0()) {
            C25198y1 N0 = mo52229N0();
            C25198y1 N02 = j0Var.mo52229N0();
            C87412m.m108594g(N0, "a");
            C87412m.m108594g(N02, "b");
            if (C25112d.f71547a.mo52246b(C25335o.f71846a, N0, N02)) {
                return true;
            }
        }
        return false;
    }

    public C26571h getAnnotations() {
        return C25162o.m31984a(mo37080J0());
    }

    public final int hashCode() {
        int i = this.f71588d;
        if (i != 0) {
            return i;
        }
        int hashCode = C25153l0.m31968a(this) ? super.hashCode() : (((mo37081K0().hashCode() * 31) + mo37079I0().hashCode()) * 31) + (mo37082L0() ? 1 : 0);
        this.f71588d = hashCode;
        return hashCode;
    }

    /* renamed from: n */
    public abstract C20770i mo37088n();
}
