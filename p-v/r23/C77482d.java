package r23;

import d23.C106976a;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: r23.d */
public final class C77482d {

    /* renamed from: a */
    public C106976a.C75321a f225927a;

    /* renamed from: b */
    public boolean f225928b;

    public C77482d() {
        this((C106976a.C75321a) null, false, 3, (C8480h) null);
    }

    public C77482d(C106976a.C75321a aVar, boolean z) {
        this.f225927a = aVar;
        this.f225928b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77482d)) {
            return false;
        }
        C77482d dVar = (C77482d) obj;
        return C87412m.m108589b(this.f225927a, dVar.f225927a) && this.f225928b == dVar.f225928b;
    }

    public int hashCode() {
        C106976a.C75321a aVar = this.f225927a;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        boolean z = this.f225928b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "TransitionItem(effect=" + this.f225927a + ", selected=" + this.f225928b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C77482d(C106976a.C75321a aVar, boolean z, int i, C8480h hVar) {
        this((i & 1) != 0 ? null : aVar, (i & 2) != 0 ? false : z);
    }
}
