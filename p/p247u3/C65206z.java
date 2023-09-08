package p247u3;

import gy3.C87412m;
import rx3.C13603j;

/* renamed from: u3.z */
public final class C65206z {

    /* renamed from: a */
    public final int f187728a;

    /* renamed from: b */
    public final C65056f2 f187729b;

    public C65206z(int i, C65056f2 f2Var) {
        C87412m.m108594g(f2Var, "hint");
        this.f187728a = i;
        this.f187729b = f2Var;
    }

    /* renamed from: a */
    public final int mo89341a(C65069i0 i0Var) {
        C87412m.m108594g(i0Var, "loadType");
        int ordinal = i0Var.ordinal();
        if (ordinal == 0) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        } else if (ordinal == 1) {
            return this.f187729b.f187252a;
        } else {
            if (ordinal == 2) {
                return this.f187729b.f187253b;
            }
            throw new C13603j();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65206z)) {
            return false;
        }
        C65206z zVar = (C65206z) obj;
        return this.f187728a == zVar.f187728a && C87412m.m108589b(this.f187729b, zVar.f187729b);
    }

    public int hashCode() {
        int i = this.f187728a * 31;
        C65056f2 f2Var = this.f187729b;
        return i + (f2Var != null ? f2Var.hashCode() : 0);
    }

    public String toString() {
        return "GenerationalViewportHint(generationId=" + this.f187728a + ", hint=" + this.f187729b + ")";
    }
}
