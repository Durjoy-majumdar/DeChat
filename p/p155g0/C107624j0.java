package p155g0;

import gy3.C8480h;
import p436a1.C103272w;
import rx3.C90109v;

/* renamed from: g0.j0 */
public final class C107624j0 {

    /* renamed from: a */
    public final long f322017a;

    /* renamed from: b */
    public final long f322018b;

    public C107624j0(long j, long j2, C8480h hVar) {
        this.f322017a = j;
        this.f322018b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C107624j0)) {
            return false;
        }
        C107624j0 j0Var = (C107624j0) obj;
        return C103272w.m136781c(this.f322017a, j0Var.f322017a) && C103272w.m136781c(this.f322018b, j0Var.f322018b);
    }

    public int hashCode() {
        long j = this.f322017a;
        int i = C103272w.f304516h;
        return (C90109v.m112737a(j) * 31) + C90109v.m112737a(this.f322018b);
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + C103272w.m136787i(this.f322017a) + ", selectionBackgroundColor=" + C103272w.m136787i(this.f322018b) + ')';
    }
}
