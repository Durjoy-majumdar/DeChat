package p720v;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: v.p0 */
public final class C111283p0 {

    /* renamed from: a */
    public final C37623d0 f333196a;

    /* renamed from: b */
    public final C37629k0 f333197b;

    /* renamed from: c */
    public final C111256g f333198c;

    public C111283p0() {
        this((C37623d0) null, (C37629k0) null, (C111256g) null, (C111259h0) null, 15, (C8480h) null);
    }

    public C111283p0(C37623d0 d0Var, C37629k0 k0Var, C111256g gVar, C111259h0 h0Var) {
        this.f333196a = d0Var;
        this.f333197b = k0Var;
        this.f333198c = gVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C111283p0)) {
            return false;
        }
        C111283p0 p0Var = (C111283p0) obj;
        return C87412m.m108589b(this.f333196a, p0Var.f333196a) && C87412m.m108589b(this.f333197b, p0Var.f333197b) && C87412m.m108589b(this.f333198c, p0Var.f333198c) && C87412m.m108589b((Object) null, (Object) null);
    }

    public int hashCode() {
        C37623d0 d0Var = this.f333196a;
        int hashCode = (d0Var == null ? 0 : d0Var.hashCode()) * 31;
        C37629k0 k0Var = this.f333197b;
        int hashCode2 = (hashCode + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        C111256g gVar = this.f333198c;
        return ((hashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31) + 0;
    }

    public String toString() {
        return "TransitionData(fade=" + this.f333196a + ", slide=" + this.f333197b + ", changeSize=" + this.f333198c + ", scale=" + null + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C111283p0(C37623d0 d0Var, C37629k0 k0Var, C111256g gVar, C111259h0 h0Var, int i, C8480h hVar) {
        this((i & 1) != 0 ? null : d0Var, (i & 2) != 0 ? null : k0Var, (i & 4) != 0 ? null : gVar, (i & 8) != 0 ? null : h0Var);
    }
}
