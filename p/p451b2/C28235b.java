package p451b2;

import gy3.C87412m;
import my3.C61595o;

/* renamed from: b2.b */
public final class C28235b implements C104025v {

    /* renamed from: b */
    public final int f77776b;

    public C28235b(int i) {
        this.f77776b = i;
    }

    /* renamed from: a */
    public C104014i mo55852a(C104014i iVar) {
        return iVar;
    }

    /* renamed from: b */
    public int mo55853b(int i) {
        return i;
    }

    /* renamed from: c */
    public int mo55854c(int i) {
        return i;
    }

    /* renamed from: d */
    public C104022q mo55855d(C104022q qVar) {
        C87412m.m108594g(qVar, "fontWeight");
        int i = this.f77776b;
        return (i == 0 || i == Integer.MAX_VALUE) ? qVar : new C104022q(C61595o.m72297e(qVar.f307657d + i, 1, 1000));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28235b) && this.f77776b == ((C28235b) obj).f77776b;
    }

    public int hashCode() {
        return this.f77776b;
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f77776b + ')';
    }
}
