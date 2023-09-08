package n04;

import p04.C25417j;
import wy3.C22935h;
import zz3.C26794h;

/* renamed from: n04.q */
public abstract class C25169q implements C25144j1 {

    /* renamed from: a */
    public int f71620a;

    /* renamed from: b */
    public abstract boolean mo52233b(C22935h hVar);

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25144j1) || obj.hashCode() != hashCode()) {
            return false;
        }
        C25144j1 j1Var = (C25144j1) obj;
        if (j1Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        C22935h o = mo37094o();
        C22935h o2 = j1Var.mo37094o();
        if (o2 == null) {
            return false;
        }
        if (!C25417j.m32699f(o) && !C26794h.m35228p(o)) {
            if (C25417j.m32699f(o2) || C26794h.m35228p(o2)) {
                z = false;
            }
            if (z) {
                return mo52233b(o2);
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f71620a;
        if (i != 0) {
            return i;
        }
        C22935h o = mo37094o();
        int hashCode = !C25417j.m32699f(o) && !C26794h.m35228p(o) ? C26794h.m35219g(o).hashCode() : System.identityHashCode(this);
        this.f71620a = hashCode;
        return hashCode;
    }

    /* renamed from: o */
    public abstract C22935h mo37094o();
}
