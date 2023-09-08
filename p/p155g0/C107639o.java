package p155g0;

import gy3.C8480h;
import p1166z0.C112539e;
import p152f0.C107343g0;

/* renamed from: g0.o */
public final class C107639o {

    /* renamed from: a */
    public final C107343g0 f322027a;

    /* renamed from: b */
    public final long f322028b;

    public C107639o(C107343g0 g0Var, long j, C8480h hVar) {
        this.f322027a = g0Var;
        this.f322028b = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C107639o)) {
            return false;
        }
        C107639o oVar = (C107639o) obj;
        return this.f322027a == oVar.f322027a && C112539e.m153736a(this.f322028b, oVar.f322028b);
    }

    public int hashCode() {
        return (this.f322027a.hashCode() * 31) + C112539e.m153740e(this.f322028b);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.f322027a + ", position=" + C112539e.m153744i(this.f322028b) + ')';
    }
}
