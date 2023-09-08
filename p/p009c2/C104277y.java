package p009c2;

import gy3.C87412m;
import my3.C61595o;

/* renamed from: c2.y */
public final class C104277y implements C104247d {

    /* renamed from: a */
    public final int f308619a;

    /* renamed from: b */
    public final int f308620b;

    public C104277y(int i, int i2) {
        this.f308619a = i;
        this.f308620b = i2;
    }

    /* renamed from: a */
    public void mo145851a(C104251f fVar) {
        C87412m.m108594g(fVar, "buffer");
        int e = C61595o.m72297e(this.f308619a, 0, fVar.mo145873c());
        int e2 = C61595o.m72297e(this.f308620b, 0, fVar.mo145873c());
        if (e < e2) {
            fVar.mo145876f(e, e2);
        } else {
            fVar.mo145876f(e2, e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C104277y)) {
            return false;
        }
        C104277y yVar = (C104277y) obj;
        return this.f308619a == yVar.f308619a && this.f308620b == yVar.f308620b;
    }

    public int hashCode() {
        return (this.f308619a * 31) + this.f308620b;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.f308619a + ", end=" + this.f308620b + ')';
    }
}
