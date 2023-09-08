package p009c2;

import gy3.C87412m;
import my3.C61595o;

/* renamed from: c2.w */
public final class C104275w implements C104247d {

    /* renamed from: a */
    public final int f308615a;

    /* renamed from: b */
    public final int f308616b;

    public C104275w(int i, int i2) {
        this.f308615a = i;
        this.f308616b = i2;
    }

    /* renamed from: a */
    public void mo145851a(C104251f fVar) {
        C87412m.m108594g(fVar, "buffer");
        if (fVar.f308579d != -1) {
            fVar.f308579d = -1;
            fVar.f308580e = -1;
        }
        int e = C61595o.m72297e(this.f308615a, 0, fVar.mo145873c());
        int e2 = C61595o.m72297e(this.f308616b, 0, fVar.mo145873c());
        if (e == e2) {
            return;
        }
        if (e < e2) {
            fVar.mo145875e(e, e2);
        } else {
            fVar.mo145875e(e2, e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C104275w)) {
            return false;
        }
        C104275w wVar = (C104275w) obj;
        return this.f308615a == wVar.f308615a && this.f308616b == wVar.f308616b;
    }

    public int hashCode() {
        return (this.f308615a * 31) + this.f308616b;
    }

    public String toString() {
        return "SetComposingRegionCommand(start=" + this.f308615a + ", end=" + this.f308616b + ')';
    }
}
