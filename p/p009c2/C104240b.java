package p009c2;

import gy3.C87412m;

/* renamed from: c2.b */
public final class C104240b implements C104247d {

    /* renamed from: a */
    public final int f308546a;

    /* renamed from: b */
    public final int f308547b;

    public C104240b(int i, int i2) {
        this.f308546a = i;
        this.f308547b = i2;
    }

    /* renamed from: a */
    public void mo145851a(C104251f fVar) {
        C87412m.m108594g(fVar, "buffer");
        int i = fVar.f308578c;
        fVar.mo145871a(i, Math.min(this.f308547b + i, fVar.mo145873c()));
        fVar.mo145871a(Math.max(0, fVar.f308577b - this.f308546a), fVar.f308577b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C104240b)) {
            return false;
        }
        C104240b bVar = (C104240b) obj;
        return this.f308546a == bVar.f308546a && this.f308547b == bVar.f308547b;
    }

    public int hashCode() {
        return (this.f308546a * 31) + this.f308547b;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f308546a + ", lengthAfterCursor=" + this.f308547b + ')';
    }
}
